package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcf;
import h4.d;
import java.util.ArrayList;

final class n7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6261e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6262f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ i9 f6263g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ zzcf f6264h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v7 f6265i;

    n7(v7 v7Var, String str, String str2, i9 i9Var, zzcf zzcf) {
        this.f6265i = v7Var;
        this.f6261e = str;
        this.f6262f = str2;
        this.f6263g = i9Var;
        this.f6264h = zzcf;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            d H = this.f6265i.f6501d;
            if (H == null) {
                this.f6265i.f5994a.d().r().c("Failed to get conditional properties; not connected to service", this.f6261e, this.f6262f);
            } else {
                s.k(this.f6263g);
                arrayList = d9.u(H.H(this.f6261e, this.f6262f, this.f6263g));
                this.f6265i.E();
            }
        } catch (RemoteException e10) {
            this.f6265i.f5994a.d().r().d("Failed to get conditional properties; remote exception", this.f6261e, this.f6262f, e10);
        } catch (Throwable th) {
            this.f6265i.f5994a.N().D(this.f6264h, arrayList);
            throw th;
        }
        this.f6265i.f5994a.N().D(this.f6264h, arrayList);
    }
}
