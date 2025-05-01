package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class w5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6540e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6541f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6542g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f6543h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ i6 f6544i;

    w5(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f6544i = i6Var;
        this.f6540e = atomicReference;
        this.f6541f = str2;
        this.f6542g = str3;
        this.f6543h = z10;
    }

    public final void run() {
        this.f6544i.f5994a.L().W(this.f6540e, (String) null, this.f6541f, this.f6542g, this.f6543h);
    }
}
