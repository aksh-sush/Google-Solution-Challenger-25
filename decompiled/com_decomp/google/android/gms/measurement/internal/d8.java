package com.google.android.gms.measurement.internal;

final class d8 {

    /* renamed from: a  reason: collision with root package name */
    private c8 f5919a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h8 f5920b;

    d8(h8 h8Var) {
        this.f5920b = h8Var;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j10) {
        this.f5919a = new c8(this, this.f5920b.f5994a.e().currentTimeMillis(), j10);
        this.f5920b.f6028c.postDelayed(this.f5919a, 2000);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f5920b.h();
        if (this.f5919a != null) {
            this.f5920b.f6028c.removeCallbacks(this.f5919a);
        }
        this.f5920b.f5994a.F().f6531q.a(false);
    }
}
