package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class u1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f5497a;

    /* renamed from: b  reason: collision with root package name */
    private final t1 f5498b;

    public u1(t1 t1Var) {
        this.f5498b = t1Var;
    }

    public final void a(Context context) {
        this.f5497a = context;
    }

    public final synchronized void b() {
        Context context = this.f5497a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f5497a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5498b.a();
            b();
        }
    }
}
