package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import h4.g;
import h4.h;
import l0.a;

public final class AppMeasurementReceiver extends a implements g {

    /* renamed from: c  reason: collision with root package name */
    private h f5817c;

    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f5817c == null) {
            this.f5817c = new h(this);
        }
        this.f5817c.a(context, intent);
    }
}
