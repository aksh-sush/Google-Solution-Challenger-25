package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class s7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u7 f6405e;

    s7(u7 u7Var) {
        this.f6405e = u7Var;
    }

    public final void run() {
        v7 v7Var = this.f6405e.f6473c;
        Context c10 = v7Var.f5994a.c();
        this.f6405e.f6473c.f5994a.f();
        v7.M(v7Var, new ComponentName(c10, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
