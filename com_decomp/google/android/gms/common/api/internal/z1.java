package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import n4.d;
import n4.i;
import y3.b;

final class z1 implements d {

    /* renamed from: a  reason: collision with root package name */
    private final h f5556a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5557b;

    /* renamed from: c  reason: collision with root package name */
    private final c f5558c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5559d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5560e;

    z1(h hVar, int i10, c cVar, long j10, long j11, String str, String str2) {
        this.f5556a = hVar;
        this.f5557b = i10;
        this.f5558c = cVar;
        this.f5559d = j10;
        this.f5560e = j11;
    }

    static z1 b(h hVar, int i10, c cVar) {
        boolean z10;
        if (!hVar.g()) {
            return null;
        }
        u a10 = t.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.W()) {
            return null;
        } else {
            z10 = a10.X();
            n1 x10 = hVar.x(cVar);
            if (x10 != null) {
                if (!(x10.s() instanceof c)) {
                    return null;
                }
                c cVar2 = (c) x10.s();
                if (cVar2.hasConnectionInfo() && !cVar2.isConnecting()) {
                    e c10 = c(x10, cVar2, i10);
                    if (c10 == null) {
                        return null;
                    }
                    x10.D();
                    z10 = c10.j0();
                }
            }
        }
        return new z1(hVar, i10, cVar, z10 ? System.currentTimeMillis() : 0, z10 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static e c(n1 n1Var, c cVar, int i10) {
        int[] V;
        int[] W;
        e telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.X() || ((V = telemetryConfiguration.V()) != null ? !b.b(V, i10) : !((W = telemetryConfiguration.W()) == null || !b.b(W, i10))) || n1Var.q() >= telemetryConfiguration.U()) {
            return null;
        }
        return telemetryConfiguration;
    }

    public final void a(i iVar) {
        n1 x10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        if (this.f5556a.g()) {
            u a10 = t.b().a();
            if ((a10 == null || a10.W()) && (x10 = this.f5556a.x(this.f5558c)) != null && (x10.s() instanceof c)) {
                c cVar = (c) x10.s();
                boolean z10 = true;
                boolean z11 = this.f5559d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                if (a10 != null) {
                    boolean X = z11 & a10.X();
                    int U = a10.U();
                    int V = a10.V();
                    i12 = a10.j0();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        e c10 = c(x10, cVar, this.f5557b);
                        if (c10 != null) {
                            if (!c10.j0() || this.f5559d <= 0) {
                                z10 = false;
                            }
                            V = c10.U();
                            X = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = U;
                    i10 = V;
                } else {
                    i12 = 0;
                    i11 = 5000;
                    i10 = 100;
                }
                h hVar = this.f5556a;
                if (iVar.isSuccessful()) {
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (iVar.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = iVar.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status a11 = ((com.google.android.gms.common.api.b) exception).a();
                            int V2 = a11.V();
                            q3.b U2 = a11.U();
                            i13 = U2 == null ? -1 : U2.U();
                            i14 = V2;
                        } else {
                            i14 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f5559d;
                    j10 = System.currentTimeMillis();
                    j11 = j12;
                    i15 = (int) (SystemClock.elapsedRealtime() - this.f5560e);
                } else {
                    j11 = 0;
                    j10 = 0;
                    i15 = -1;
                }
                hVar.I(new p(this.f5557b, i14, i13, j11, j10, (String) null, (String) null, gCoreServiceId, i15), i12, (long) i11, i10);
            }
        }
    }
}
