package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8398a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f8399b;

    g(Context context, Intent intent) {
        this.f8398a = context;
        this.f8399b = intent;
    }

    public Object call() {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(this.f8398a, this.f8399b));
    }
}
