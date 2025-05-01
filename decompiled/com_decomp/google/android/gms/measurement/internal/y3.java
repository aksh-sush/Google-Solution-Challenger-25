package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class y3 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f6664a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a4 f6665b;

    y3(a4 a4Var, String str) {
        this.f6665b = a4Var;
        this.f6664a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr zzb = zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.f6665b.f5832a.d().w().a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f6665b.f5832a.d().v().a("Install Referrer Service connected");
                this.f6665b.f5832a.b().z(new x3(this, zzb, this));
            } catch (RuntimeException e10) {
                this.f6665b.f5832a.d().w().b("Exception occurred while calling Install Referrer API", e10);
            }
        } else {
            this.f6665b.f5832a.d().w().a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6665b.f5832a.d().v().a("Install Referrer Service disconnected");
    }
}
