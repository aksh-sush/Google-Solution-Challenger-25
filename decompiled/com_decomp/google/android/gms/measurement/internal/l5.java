package com.google.android.gms.measurement.internal;

final class l5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f6170e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6171f;

    l5(i6 i6Var, boolean z10) {
        this.f6171f = i6Var;
        this.f6170e = z10;
    }

    public final void run() {
        boolean o10 = this.f6171f.f5994a.o();
        boolean n10 = this.f6171f.f5994a.n();
        this.f6171f.f5994a.k(this.f6170e);
        if (n10 == this.f6170e) {
            this.f6171f.f5994a.d().v().b("Default data collection state already set to", Boolean.valueOf(this.f6170e));
        }
        if (this.f6171f.f5994a.o() == o10 || this.f6171f.f5994a.o() != this.f6171f.f5994a.n()) {
            this.f6171f.f5994a.d().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f6170e), Boolean.valueOf(o10));
        }
        this.f6171f.O();
    }
}
