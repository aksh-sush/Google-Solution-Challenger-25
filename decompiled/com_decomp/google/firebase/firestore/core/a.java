package com.google.firebase.firestore.core;

import com.google.firebase.firestore.ListenerRegistration;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ListenerRegistration f7846e;

    public /* synthetic */ a(ListenerRegistration listenerRegistration) {
        this.f7846e = listenerRegistration;
    }

    public final void run() {
        this.f7846e.remove();
    }
}
