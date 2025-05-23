package com.google.firebase.firestore.core;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.i;
import n4.l;

public class Transaction {
    private static final Executor defaultExecutor = createDefaultExecutor();
    private boolean committed;
    private final Datastore datastore;
    private FirebaseFirestoreException lastWriteError;
    private final ArrayList<Mutation> mutations = new ArrayList<>();
    private final HashMap<DocumentKey, SnapshotVersion> readVersions = new HashMap<>();
    private Set<DocumentKey> writtenDocs = new HashSet();

    public Transaction(Datastore datastore2) {
        this.datastore = datastore2;
    }

    private static Executor createDefaultExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, (long) 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void ensureCommitNotCalled() {
        Assert.hardAssert(!this.committed, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor getDefaultExecutor() {
        return defaultExecutor;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i lambda$commit$1(i iVar) {
        return iVar.isSuccessful() ? l.e((Object) null) : l.d(iVar.getException());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i lambda$lookup$0(i iVar) {
        if (iVar.isSuccessful()) {
            for (MutableDocument recordVersion : (List) iVar.getResult()) {
                recordVersion(recordVersion);
            }
        }
        return iVar;
    }

    private Precondition precondition(DocumentKey documentKey) {
        SnapshotVersion snapshotVersion = this.readVersions.get(documentKey);
        return (this.writtenDocs.contains(documentKey) || snapshotVersion == null) ? Precondition.NONE : Precondition.updateTime(snapshotVersion);
    }

    private Precondition preconditionForUpdate(DocumentKey documentKey) {
        SnapshotVersion snapshotVersion = this.readVersions.get(documentKey);
        if (this.writtenDocs.contains(documentKey) || snapshotVersion == null) {
            return Precondition.exists(true);
        }
        if (!snapshotVersion.equals(SnapshotVersion.NONE)) {
            return Precondition.updateTime(snapshotVersion);
        }
        throw new FirebaseFirestoreException("Can't update a document that doesn't exist.", FirebaseFirestoreException.Code.INVALID_ARGUMENT);
    }

    private void recordVersion(MutableDocument mutableDocument) {
        SnapshotVersion snapshotVersion;
        if (mutableDocument.isFoundDocument()) {
            snapshotVersion = mutableDocument.getVersion();
        } else if (mutableDocument.isNoDocument()) {
            snapshotVersion = SnapshotVersion.NONE;
        } else {
            throw Assert.fail("Unexpected document type in transaction: " + mutableDocument, new Object[0]);
        }
        if (!this.readVersions.containsKey(mutableDocument.getKey())) {
            this.readVersions.put(mutableDocument.getKey(), snapshotVersion);
        } else if (!this.readVersions.get(mutableDocument.getKey()).equals(mutableDocument.getVersion())) {
            throw new FirebaseFirestoreException("Document version changed between two reads.", FirebaseFirestoreException.Code.ABORTED);
        }
    }

    private void write(List<Mutation> list) {
        ensureCommitNotCalled();
        this.mutations.addAll(list);
    }

    public i commit() {
        ensureCommitNotCalled();
        FirebaseFirestoreException firebaseFirestoreException = this.lastWriteError;
        if (firebaseFirestoreException != null) {
            return l.d(firebaseFirestoreException);
        }
        HashSet hashSet = new HashSet(this.readVersions.keySet());
        Iterator<Mutation> it = this.mutations.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().getKey());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it2.next();
            this.mutations.add(new VerifyMutation(documentKey, precondition(documentKey)));
        }
        this.committed = true;
        return this.datastore.commit(this.mutations).continueWithTask(Executors.DIRECT_EXECUTOR, new y());
    }

    public void delete(DocumentKey documentKey) {
        write(Collections.singletonList(new DeleteMutation(documentKey, precondition(documentKey))));
        this.writtenDocs.add(documentKey);
    }

    public i lookup(List<DocumentKey> list) {
        ensureCommitNotCalled();
        return this.mutations.size() != 0 ? l.d(new FirebaseFirestoreException("Firestore transactions require all reads to be executed before all writes.", FirebaseFirestoreException.Code.INVALID_ARGUMENT)) : this.datastore.lookup(list).continueWithTask(Executors.DIRECT_EXECUTOR, new x(this));
    }

    public void set(DocumentKey documentKey, UserData.ParsedSetData parsedSetData) {
        write(Collections.singletonList(parsedSetData.toMutation(documentKey, precondition(documentKey))));
        this.writtenDocs.add(documentKey);
    }

    public void update(DocumentKey documentKey, UserData.ParsedUpdateData parsedUpdateData) {
        try {
            write(Collections.singletonList(parsedUpdateData.toMutation(documentKey, preconditionForUpdate(documentKey))));
        } catch (FirebaseFirestoreException e10) {
            this.lastWriteError = e10;
        }
        this.writtenDocs.add(documentKey);
    }
}
