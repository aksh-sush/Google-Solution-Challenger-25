package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;
import s3.a;

final class b7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f5865e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v7 f5866f;

    b7(v7 v7Var, i9 i9Var) {
        this.f5866f = v7Var;
        this.f5865e = i9Var;
    }

    public final void run() {
        d H = this.f5866f.f6501d;
        if (H == null) {
            this.f5866f.f5994a.d().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            s.k(this.f5865e);
            H.G(this.f5865e);
            this.f5866f.f5994a.C().t();
            this.f5866f.r(H, (a) null, this.f5865e);
            this.f5866f.E();
        } catch (RemoteException e10) {
            this.f5866f.f5994a.d().r().b("Failed to send app launch to the service", e10);
        }
    }
}
