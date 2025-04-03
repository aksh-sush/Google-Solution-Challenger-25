package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class r1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f5697a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5698b;

    public r1(c cVar, int i10) {
        this.f5698b = cVar;
        this.f5697a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f5698b;
        if (iBinder == null) {
            c.zzk(cVar, 16);
            return;
        }
        synchronized (cVar.zzq) {
            c cVar2 = this.f5698b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new f1(iBinder) : (n) queryLocalInterface;
        }
        this.f5698b.zzl(0, (Bundle) null, this.f5697a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5698b.zzq) {
            this.f5698b.zzr = null;
        }
        Handler handler = this.f5698b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f5697a, 1));
    }
}
