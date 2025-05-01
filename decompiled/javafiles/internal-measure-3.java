package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* loaded from: classes.dex */
public final class y3 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f6696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a4 f6697b;

    y3(a4 a4Var, String str) {
        this.f6697b = a4Var;
        this.f6696a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f6697b.f5864a.d().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbr zzb = zzbq.zzb(iBinder);
            if (zzb == null) {
                this.f6697b.f5864a.d().w().a("Install Referrer Service implementation was not found");
            } else {
                this.f6697b.f5864a.d().v().a("Install Referrer Service connected");
                this.f6697b.f5864a.b().z(new x3(this, zzb, this));
            }
        } catch (RuntimeException e10) {
            this.f6697b.f5864a.d().w().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6697b.f5864a.d().v().a("Install Referrer Service disconnected");
    }
}