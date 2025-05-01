package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;

final class h7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6026e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v7 f6027f;

    h7(v7 v7Var, i9 i9Var) {
        this.f6027f = v7Var;
        this.f6026e = i9Var;
    }

    public final void run() {
        d H = this.f6027f.f6501d;
        if (H == null) {
            this.f6027f.f5994a.d().r().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            s.k(this.f6026e);
            H.P(this.f6026e);
            this.f6027f.E();
        } catch (RemoteException e10) {
            this.f6027f.f5994a.d().r().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
