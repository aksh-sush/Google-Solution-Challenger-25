package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class p5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6320e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6321f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f6322g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Bundle f6323h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ boolean f6324i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ boolean f6325j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ boolean f6326k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ String f6327l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ i6 f6328m;

    p5(i6 i6Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f6328m = i6Var;
        this.f6320e = str;
        this.f6321f = str2;
        this.f6322g = j10;
        this.f6323h = bundle;
        this.f6324i = z10;
        this.f6325j = z11;
        this.f6326k = z12;
        this.f6327l = str3;
    }

    public final void run() {
        this.f6328m.v(this.f6320e, this.f6321f, this.f6322g, this.f6323h, this.f6324i, this.f6325j, this.f6326k, this.f6327l);
    }
}
