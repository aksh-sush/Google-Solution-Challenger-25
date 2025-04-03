package com.google.firebase.firestore.core;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Function;
import n4.d;
import n4.i;
import n4.j;

public class TransactionRunner<TResult> {
    public static final int DEFAULT_MAX_ATTEMPTS_COUNT = 5;
    private AsyncQueue asyncQueue;
    private int attemptsRemaining;
    private ExponentialBackoff backoff;
    private RemoteStore remoteStore;
    private j taskSource = new j();
    private Function<Transaction, i> updateFunction;

    public TransactionRunner(AsyncQueue asyncQueue2, RemoteStore remoteStore2, Function<Transaction, i> function) {
        this.asyncQueue = asyncQueue2;
        this.remoteStore = remoteStore2;
        this.updateFunction = function;
        this.attemptsRemaining = 5;
        this.backoff = new ExponentialBackoff(asyncQueue2, AsyncQueue.TimerId.RETRY_TRANSACTION);
    }

    private void handleTransactionError(i iVar) {
        if (this.attemptsRemaining <= 0 || !isRetryableTransactionError(iVar.getException())) {
            this.taskSource.b(iVar.getException());
        } else {
            runWithBackoff();
        }
    }

    private static boolean isRetryableTransactionError(Exception exc) {
        if (!(exc instanceof FirebaseFirestoreException)) {
            return false;
        }
        FirebaseFirestoreException firebaseFirestoreException = (FirebaseFirestoreException) exc;
        FirebaseFirestoreException.Code code = firebaseFirestoreException.getCode();
        return code == FirebaseFirestoreException.Code.ABORTED || code == FirebaseFirestoreException.Code.FAILED_PRECONDITION || !Datastore.isPermanentError(firebaseFirestoreException.getCode());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$0(i iVar, i iVar2) {
        if (iVar2.isSuccessful()) {
            this.taskSource.c(iVar.getResult());
        } else {
            handleTransactionError(iVar2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$1(Transaction transaction, i iVar) {
        if (!iVar.isSuccessful()) {
            handleTransactionError(iVar);
        } else {
            transaction.commit().addOnCompleteListener(this.asyncQueue.getExecutor(), (d) new a0(this, iVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$2() {
        Transaction createTransaction = this.remoteStore.createTransaction();
        this.updateFunction.apply(createTransaction).addOnCompleteListener(this.asyncQueue.getExecutor(), (d) new z(this, createTransaction));
    }

    private void runWithBackoff() {
        this.attemptsRemaining--;
        this.backoff.backoffAndRun(new b0(this));
    }

    public i run() {
        runWithBackoff();
        return this.taskSource.a();
    }
}
