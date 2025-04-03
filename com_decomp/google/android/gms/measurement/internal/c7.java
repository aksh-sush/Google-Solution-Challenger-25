package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h4.d;

final class c7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o6 f5896e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v7 f5897f;

    c7(v7 v7Var, o6 o6Var) {
        this.f5897f = v7Var;
        this.f5896e = o6Var;
    }

    public final void run() {
        long j10;
        String str;
        String str2;
        String packageName;
        d H = this.f5897f.f6501d;
        if (H == null) {
            this.f5897f.f5994a.d().r().a("Failed to send current screen to service");
            return;
        }
        try {
            o6 o6Var = this.f5896e;
            if (o6Var == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f5897f.f5994a.c().getPackageName();
            } else {
                j10 = o6Var.f6286c;
                str = o6Var.f6284a;
                str2 = o6Var.f6285b;
                packageName = this.f5897f.f5994a.c().getPackageName();
            }
            H.b(j10, str, str2, packageName);
            this.f5897f.E();
        } catch (RemoteException e10) {
            this.f5897f.f5994a.d().r().b("Failed to send current screen to the service", e10);
        }
    }
}
