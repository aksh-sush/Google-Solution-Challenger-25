package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcf;
import h4.d;

final class a7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f5838e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzcf f5839f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v7 f5840g;

    a7(v7 v7Var, i9 i9Var, zzcf zzcf) {
        this.f5840g = v7Var;
        this.f5838e = i9Var;
        this.f5839f = zzcf;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f5840g.f5994a.F().q().k()) {
                this.f5840g.f5994a.d().x().a("Analytics storage consent denied; will not get app instance id");
                this.f5840g.f5994a.I().B((String) null);
                this.f5840g.f5994a.F().f6521g.b((String) null);
            } else {
                d H = this.f5840g.f6501d;
                if (H == null) {
                    this.f5840g.f5994a.d().r().a("Failed to get app instance id");
                } else {
                    s.k(this.f5838e);
                    str = H.o(this.f5838e);
                    if (str != null) {
                        this.f5840g.f5994a.I().B(str);
                        this.f5840g.f5994a.F().f6521g.b(str);
                    }
                    this.f5840g.E();
                }
            }
        } catch (RemoteException e10) {
            this.f5840g.f5994a.d().r().b("Failed to get app instance id", e10);
        } catch (Throwable th) {
            this.f5840g.f5994a.N().I(this.f5839f, (String) null);
            throw th;
        }
        this.f5840g.f5994a.N().I(this.f5839f, str);
    }
}
