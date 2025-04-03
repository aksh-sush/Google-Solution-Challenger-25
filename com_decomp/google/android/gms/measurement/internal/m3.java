package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.e;
import java.util.Map;

final class m3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final l3 f6196e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6197f;

    /* renamed from: g  reason: collision with root package name */
    private final Throwable f6198g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f6199h;

    /* renamed from: i  reason: collision with root package name */
    private final String f6200i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f6201j;

    /* synthetic */ m3(String str, l3 l3Var, int i10, Throwable th, byte[] bArr, Map map, e eVar) {
        s.k(l3Var);
        this.f6196e = l3Var;
        this.f6197f = i10;
        this.f6198g = th;
        this.f6199h = bArr;
        this.f6200i = str;
        this.f6201j = map;
    }

    public final void run() {
        this.f6196e.a(this.f6200i, this.f6197f, this.f6198g, this.f6199h, this.f6201j);
    }
}
