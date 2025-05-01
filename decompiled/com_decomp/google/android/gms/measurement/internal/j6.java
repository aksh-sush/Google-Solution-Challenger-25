package com.google.android.gms.measurement.internal;

import java.util.Map;

public final /* synthetic */ class j6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k6 f6120e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6121f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Exception f6122g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ byte[] f6123h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f6124i;

    public /* synthetic */ j6(k6 k6Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f6120e = k6Var;
        this.f6121f = i10;
        this.f6122g = exc;
        this.f6123h = bArr;
        this.f6124i = map;
    }

    public final void run() {
        this.f6120e.a(this.f6121f, this.f6122g, this.f6123h, this.f6124i);
    }
}
