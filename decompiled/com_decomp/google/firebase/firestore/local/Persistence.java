package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Supplier;

public abstract class Persistence {
    public static boolean INDEXING_SUPPORT_ENABLED = false;
    static final String TAG = "Persistence";

    Persistence() {
    }

    /* access modifiers changed from: package-private */
    public abstract BundleCache getBundleCache();

    /* access modifiers changed from: package-private */
    public abstract IndexManager getIndexManager();

    /* access modifiers changed from: package-private */
    public abstract g0 getMutationQueue(User user);

    /* access modifiers changed from: package-private */
    public abstract h0 getReferenceDelegate();

    /* access modifiers changed from: package-private */
    public abstract i0 getRemoteDocumentCache();

    /* access modifiers changed from: package-private */
    public abstract j2 getTargetCache();

    public abstract boolean isStarted();

    /* access modifiers changed from: package-private */
    public abstract <T> T runTransaction(String str, Supplier<T> supplier);

    /* access modifiers changed from: package-private */
    public abstract void runTransaction(String str, Runnable runnable);

    public abstract void shutdown();

    public abstract void start();
}
