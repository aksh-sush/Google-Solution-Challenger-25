package com.google.firebase.firestore.core;

public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TransactionRunner f7851e;

    public /* synthetic */ b0(TransactionRunner transactionRunner) {
        this.f7851e = transactionRunner;
    }

    public final void run() {
        this.f7851e.lambda$runWithBackoff$2();
    }
}
