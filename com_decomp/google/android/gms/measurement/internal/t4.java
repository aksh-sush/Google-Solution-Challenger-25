package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class t4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6420a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6421b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6422c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f5 f6423d;

    t4(f5 f5Var, String str, String str2, String str3) {
        this.f6423d = f5Var;
        this.f6420a = str;
        this.f6421b = str2;
        this.f6422c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f6423d.f5962a.a();
        return this.f6423d.f5962a.V().c0(this.f6420a, this.f6421b, this.f6422c);
    }
}
