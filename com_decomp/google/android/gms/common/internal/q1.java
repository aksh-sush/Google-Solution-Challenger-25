package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class q1 extends e1 {

    /* renamed from: a  reason: collision with root package name */
    private c f5693a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5694b;

    public q1(c cVar, int i10) {
        this.f5693a = cVar;
        this.f5694b = i10;
    }

    public final void L(int i10, IBinder iBinder, u1 u1Var) {
        c cVar = this.f5693a;
        s.l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.k(u1Var);
        c.zzj(cVar, u1Var);
        W(i10, iBinder, u1Var.f5714e);
    }

    public final void W(int i10, IBinder iBinder, Bundle bundle) {
        s.l(this.f5693a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f5693a.onPostInitHandler(i10, iBinder, bundle, this.f5694b);
        this.f5693a = null;
    }

    public final void z(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
