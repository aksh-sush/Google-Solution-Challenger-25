package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import h4.d;

final class f7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f5970e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5971f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ zzcf f5972g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ v7 f5973h;

    f7(v7 v7Var, t tVar, String str, zzcf zzcf) {
        this.f5973h = v7Var;
        this.f5970e = tVar;
        this.f5971f = str;
        this.f5972g = zzcf;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            d H = this.f5973h.f6501d;
            if (H == null) {
                this.f5973h.f5994a.d().r().a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = H.A(this.f5970e, this.f5971f);
                this.f5973h.E();
            }
        } catch (RemoteException e10) {
            this.f5973h.f5994a.d().r().b("Failed to send event to the service to bundle", e10);
        } catch (Throwable th) {
            this.f5973h.f5994a.N().F(this.f5972g, bArr);
            throw th;
        }
        this.f5973h.f5994a.N().F(this.f5972g, bArr);
    }
}
