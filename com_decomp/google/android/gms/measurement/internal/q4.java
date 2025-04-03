package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class q4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6348a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6349b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6350c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f5 f6351d;

    q4(f5 f5Var, String str, String str2, String str3) {
        this.f6351d = f5Var;
        this.f6348a = str;
        this.f6349b = str2;
        this.f6350c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f6351d.f5962a.a();
        return this.f6351d.f5962a.V().f0(this.f6348a, this.f6349b, this.f6350c);
    }
}
