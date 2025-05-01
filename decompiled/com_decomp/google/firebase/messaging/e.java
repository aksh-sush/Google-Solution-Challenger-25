package com.google.firebase.messaging;

import android.content.Intent;
import n4.d;
import n4.i;

final /* synthetic */ class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final EnhancedIntentService f8388a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f8389b;

    e(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f8388a = enhancedIntentService;
        this.f8389b = intent;
    }

    public void a(i iVar) {
        this.f8388a.lambda$onStartCommand$1$EnhancedIntentService(this.f8389b, iVar);
    }
}
