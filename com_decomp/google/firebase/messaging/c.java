package com.google.firebase.messaging;

import android.content.Intent;
import n4.j;

final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final EnhancedIntentService f8382e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f8383f;

    /* renamed from: g  reason: collision with root package name */
    private final j f8384g;

    c(EnhancedIntentService enhancedIntentService, Intent intent, j jVar) {
        this.f8382e = enhancedIntentService;
        this.f8383f = intent;
        this.f8384g = jVar;
    }

    public void run() {
        this.f8382e.lambda$processIntent$0$EnhancedIntentService(this.f8383f, this.f8384g);
    }
}
