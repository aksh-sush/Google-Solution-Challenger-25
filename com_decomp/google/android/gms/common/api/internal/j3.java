package com.google.android.gms.common.api.internal;

final class j3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f5418e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5419f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k3 f5420g;

    j3(k3 k3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5420g = k3Var;
        this.f5418e = lifecycleCallback;
        this.f5419f = str;
    }

    public final void run() {
        k3 k3Var = this.f5420g;
        if (k3Var.f5429f > 0) {
            this.f5418e.onCreate(k3Var.f5430g != null ? k3Var.f5430g.getBundle(this.f5419f) : null);
        }
        if (this.f5420g.f5429f >= 2) {
            this.f5418e.onStart();
        }
        if (this.f5420g.f5429f >= 3) {
            this.f5418e.onResume();
        }
        if (this.f5420g.f5429f >= 4) {
            this.f5418e.onStop();
        }
        if (this.f5420g.f5429f >= 5) {
            this.f5418e.onDestroy();
        }
    }
}
