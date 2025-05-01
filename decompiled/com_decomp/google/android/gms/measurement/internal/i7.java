package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;

final class i7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6055e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v7 f6056f;

    i7(v7 v7Var, i9 i9Var) {
        this.f6056f = v7Var;
        this.f6055e = i9Var;
    }

    public final void run() {
        d H = this.f6056f.f6501d;
        if (H == null) {
            this.f6056f.f5994a.d().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            s.k(this.f6055e);
            H.a(this.f6055e);
            this.f6056f.E();
        } catch (RemoteException e10) {
            this.f6056f.f5994a.d().r().b("Failed to send consent settings to the service", e10);
        }
    }
}
