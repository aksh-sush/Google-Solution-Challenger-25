package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;

final class y6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6671e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v7 f6672f;

    y6(v7 v7Var, i9 i9Var) {
        this.f6672f = v7Var;
        this.f6671e = i9Var;
    }

    public final void run() {
        d H = this.f6672f.f6501d;
        if (H == null) {
            this.f6672f.f5994a.d().r().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            s.k(this.f6671e);
            H.k(this.f6671e);
        } catch (RemoteException e10) {
            this.f6672f.f5994a.d().r().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f6672f.E();
    }
}
