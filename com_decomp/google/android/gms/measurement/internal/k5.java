package com.google.android.gms.measurement.internal;

public final /* synthetic */ class k5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i6 f6143e;

    public /* synthetic */ k5(i6 i6Var) {
        this.f6143e = i6Var;
    }

    public final void run() {
        i6 i6Var = this.f6143e;
        i6Var.h();
        if (!i6Var.f5994a.F().f6532r.b()) {
            long a10 = i6Var.f5994a.F().f6533s.a();
            i6Var.f5994a.F().f6533s.b(1 + a10);
            i6Var.f5994a.z();
            if (a10 >= 5) {
                i6Var.f5994a.d().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                i6Var.f5994a.F().f6532r.a(true);
                return;
            }
            i6Var.f5994a.j();
            return;
        }
        i6Var.f5994a.d().q().a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
