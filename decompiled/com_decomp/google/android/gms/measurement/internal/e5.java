package com.google.android.gms.measurement.internal;

final class e5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f5942e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5943f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f5944g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f5945h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ f5 f5946i;

    e5(f5 f5Var, String str, String str2, String str3, long j10) {
        this.f5946i = f5Var;
        this.f5942e = str;
        this.f5943f = str2;
        this.f5944g = str3;
        this.f5945h = j10;
    }

    public final void run() {
        String str = this.f5942e;
        if (str == null) {
            this.f5946i.f5962a.b0().K().G(this.f5943f, (o6) null);
            return;
        }
        this.f5946i.f5962a.b0().K().G(this.f5943f, new o6(this.f5944g, str, this.f5945h));
    }
}
