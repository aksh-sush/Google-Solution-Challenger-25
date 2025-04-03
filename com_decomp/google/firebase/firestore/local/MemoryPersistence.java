package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Supplier;
import java.util.HashMap;
import java.util.Map;

public final class MemoryPersistence extends Persistence {
    private final y bundleCache = new y();
    private final a0 indexManager = new a0();
    private final Map<User, d0> mutationQueues = new HashMap();
    private h0 referenceDelegate;
    private final e0 remoteDocumentCache = new e0(this);
    private boolean started;
    private final f0 targetCache = new f0(this);

    private MemoryPersistence() {
    }

    public static MemoryPersistence createEagerGcMemoryPersistence() {
        MemoryPersistence memoryPersistence = new MemoryPersistence();
        memoryPersistence.setReferenceDelegate(new z(memoryPersistence));
        return memoryPersistence;
    }

    public static MemoryPersistence createLruGcMemoryPersistence(LruGarbageCollector.Params params, LocalSerializer localSerializer) {
        MemoryPersistence memoryPersistence = new MemoryPersistence();
        memoryPersistence.setReferenceDelegate(new c0(memoryPersistence, params, localSerializer));
        return memoryPersistence;
    }

    private void setReferenceDelegate(h0 h0Var) {
        this.referenceDelegate = h0Var;
    }

    /* access modifiers changed from: package-private */
    public BundleCache getBundleCache() {
        return this.bundleCache;
    }

    /* access modifiers changed from: package-private */
    public IndexManager getIndexManager() {
        return this.indexManager;
    }

    /* access modifiers changed from: package-private */
    public g0 getMutationQueue(User user) {
        d0 d0Var = this.mutationQueues.get(user);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this);
        this.mutationQueues.put(user, d0Var2);
        return d0Var2;
    }

    /* access modifiers changed from: package-private */
    public Iterable<d0> getMutationQueues() {
        return this.mutationQueues.values();
    }

    /* access modifiers changed from: package-private */
    public h0 getReferenceDelegate() {
        return this.referenceDelegate;
    }

    /* access modifiers changed from: package-private */
    public e0 getRemoteDocumentCache() {
        return this.remoteDocumentCache;
    }

    /* access modifiers changed from: package-private */
    public f0 getTargetCache() {
        return this.targetCache;
    }

    public boolean isStarted() {
        return this.started;
    }

    /* access modifiers changed from: package-private */
    public <T> T runTransaction(String str, Supplier<T> supplier) {
        this.referenceDelegate.d();
        try {
            return supplier.get();
        } finally {
            this.referenceDelegate.c();
        }
    }

    public void shutdown() {
        Assert.hardAssert(this.started, "MemoryPersistence shutdown without start", new Object[0]);
        this.started = false;
    }

    public void start() {
        Assert.hardAssert(!this.started, "MemoryPersistence double-started!", new Object[0]);
        this.started = true;
    }

    /* access modifiers changed from: package-private */
    public void runTransaction(String str, Runnable runnable) {
        this.referenceDelegate.d();
        try {
            runnable.run();
        } finally {
            this.referenceDelegate.c();
        }
    }
}
