package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

public final class h8 extends z3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f6028c;

    /* renamed from: d  reason: collision with root package name */
    protected final g8 f6029d = new g8(this);

    /* renamed from: e  reason: collision with root package name */
    protected final f8 f6030e = new f8(this);

    /* renamed from: f  reason: collision with root package name */
    protected final d8 f6031f = new d8(this);

    h8(n4 n4Var) {
        super(n4Var);
    }

    static /* bridge */ /* synthetic */ void q(h8 h8Var, long j10) {
        h8Var.h();
        h8Var.s();
        h8Var.f5994a.d().v().b("Activity paused, time", Long.valueOf(j10));
        h8Var.f6031f.a(j10);
        if (h8Var.f5994a.z().D()) {
            h8Var.f6030e.b(j10);
        }
    }

    static /* bridge */ /* synthetic */ void r(h8 h8Var, long j10) {
        h8Var.h();
        h8Var.s();
        h8Var.f5994a.d().v().b("Activity resumed, time", Long.valueOf(j10));
        if (h8Var.f5994a.z().D() || h8Var.f5994a.F().f6531q.b()) {
            h8Var.f6030e.c(j10);
        }
        h8Var.f6031f.b();
        g8 g8Var = h8Var.f6029d;
        g8Var.f6001a.h();
        if (g8Var.f6001a.f5994a.o()) {
            g8Var.b(g8Var.f6001a.f5994a.e().currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void s() {
        h();
        if (this.f6028c == null) {
            this.f6028c = new zzby(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }
}
