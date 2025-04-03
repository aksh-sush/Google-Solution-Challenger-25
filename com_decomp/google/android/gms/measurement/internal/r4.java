package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class r4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6380a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6381b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6382c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f5 f6383d;

    r4(f5 f5Var, String str, String str2, String str3) {
        this.f6383d = f5Var;
        this.f6380a = str;
        this.f6381b = str2;
        this.f6382c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f6383d.f5962a.a();
        return this.f6383d.f5962a.V().f0(this.f6380a, this.f6381b, this.f6382c);
    }
}
