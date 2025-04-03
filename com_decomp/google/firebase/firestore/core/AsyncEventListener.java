package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;

public class AsyncEventListener<T> implements EventListener<T> {
    private final EventListener<T> eventListener;
    private final Executor executor;
    private volatile boolean muted = false;

    public AsyncEventListener(Executor executor2, EventListener<T> eventListener2) {
        this.executor = executor2;
        this.eventListener = eventListener2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$0(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        if (!this.muted) {
            this.eventListener.onEvent(obj, firebaseFirestoreException);
        }
    }

    public void mute() {
        this.muted = true;
    }

    public void onEvent(T t10, FirebaseFirestoreException firebaseFirestoreException) {
        this.executor.execute(new d(this, t10, firebaseFirestoreException));
    }
}
