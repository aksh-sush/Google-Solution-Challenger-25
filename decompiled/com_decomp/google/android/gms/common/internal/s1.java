package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import q3.b;

public final class s1 extends b1 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f5699g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f5700h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f5700h = cVar;
        this.f5699g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (this.f5700h.zzx != null) {
            this.f5700h.zzx.onConnectionFailed(bVar);
        }
        this.f5700h.onConnectionFailed(bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f5699g;
            s.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f5700h.getServiceDescriptor().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f5700h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface createServiceInterface = this.f5700h.createServiceInterface(this.f5699g);
            if (createServiceInterface == null || (!c.zzn(this.f5700h, 2, 4, createServiceInterface) && !c.zzn(this.f5700h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f5700h.zzB = null;
            Bundle connectionHint = this.f5700h.getConnectionHint();
            c cVar = this.f5700h;
            if (cVar.zzw == null) {
                return true;
            }
            cVar.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
