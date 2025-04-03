package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class v5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6484e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6485f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6486g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ i6 f6487h;

    v5(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f6487h = i6Var;
        this.f6484e = atomicReference;
        this.f6485f = str2;
        this.f6486g = str3;
    }

    public final void run() {
        this.f6487h.f5994a.L().U(this.f6484e, (String) null, this.f6485f, this.f6486g);
    }
}
