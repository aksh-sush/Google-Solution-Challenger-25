package com.google.android.gms.common.api.internal;

final class h3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f5404e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5405f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ i3 f5406g;

    h3(i3 i3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5406g = i3Var;
        this.f5404e = lifecycleCallback;
        this.f5405f = str;
    }

    public final void run() {
        i3 i3Var = this.f5406g;
        if (i3Var.f5412f > 0) {
            this.f5404e.onCreate(i3Var.f5413g != null ? i3Var.f5413g.getBundle(this.f5405f) : null);
        }
        if (this.f5406g.f5412f >= 2) {
            this.f5404e.onStart();
        }
        if (this.f5406g.f5412f >= 3) {
            this.f5404e.onResume();
        }
        if (this.f5406g.f5412f >= 4) {
            this.f5404e.onStop();
        }
        if (this.f5406g.f5412f >= 5) {
            this.f5404e.onDestroy();
        }
    }
}
