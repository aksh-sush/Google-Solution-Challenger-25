package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.internal.k;
import q3.b;

final class q1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f5479e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r1 f5480f;

    q1(r1 r1Var, b bVar) {
        this.f5480f = r1Var;
        this.f5479e = bVar;
    }

    public final void run() {
        r1 r1Var = this.f5480f;
        n1 n1Var = (n1) r1Var.f5487f.f5395l.get(r1Var.f5483b);
        if (n1Var != null) {
            if (this.f5479e.j0()) {
                this.f5480f.f5486e = true;
                if (this.f5480f.f5482a.requiresSignIn()) {
                    this.f5480f.h();
                    return;
                }
                try {
                    r1 r1Var2 = this.f5480f;
                    r1Var2.f5482a.getRemoteService((k) null, r1Var2.f5482a.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f5480f.f5482a.disconnect("Failed to get service from broker.");
                    n1Var.E(new b(10), (Exception) null);
                }
            } else {
                n1Var.E(this.f5479e, (Exception) null);
            }
        }
    }
}
