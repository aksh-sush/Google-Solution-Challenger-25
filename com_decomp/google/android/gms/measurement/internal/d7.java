package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;

final class d7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f5916e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Bundle f5917f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v7 f5918g;

    d7(v7 v7Var, i9 i9Var, Bundle bundle) {
        this.f5918g = v7Var;
        this.f5916e = i9Var;
        this.f5917f = bundle;
    }

    public final void run() {
        d H = this.f5918g.f6501d;
        if (H == null) {
            this.f5918g.f5994a.d().r().a("Failed to send default event parameters to service");
            return;
        }
        try {
            s.k(this.f5916e);
            H.d(this.f5917f, this.f5916e);
        } catch (RemoteException e10) {
            this.f5918g.f5994a.d().r().b("Failed to send default event parameters to service", e10);
        }
    }
}
