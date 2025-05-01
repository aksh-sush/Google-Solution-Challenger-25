package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class q7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ComponentName f6362e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u7 f6363f;

    q7(u7 u7Var, ComponentName componentName) {
        this.f6363f = u7Var;
        this.f6362e = componentName;
    }

    public final void run() {
        v7.M(this.f6363f.f6473c, this.f6362e);
    }
}
