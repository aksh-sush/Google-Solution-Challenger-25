package com.google.firebase.firestore;

public final /* synthetic */ class g implements EventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f7910a;

    public /* synthetic */ g(Runnable runnable) {
        this.f7910a = runnable;
    }

    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        FirebaseFirestore.lambda$addSnapshotsInSyncListener$4(this.f7910a, (Void) obj, firebaseFirestoreException);
    }
}
