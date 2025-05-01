package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.concurrent.ScheduledExecutorService;
import n4.i;
import z3.b;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    private static h f5206e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f5207a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f5208b;

    /* renamed from: c  reason: collision with root package name */
    private i f5209c = new i(this);

    /* renamed from: d  reason: collision with root package name */
    private int f5210d = 1;

    private h(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5208b = scheduledExecutorService;
        this.f5207a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i10;
        i10 = this.f5210d;
        this.f5210d = i10 + 1;
        return i10;
    }

    public static synchronized h c(Context context) {
        h hVar;
        synchronized (h.class) {
            if (f5206e == null) {
                f5206e = new h(context, zza.zza().zza(1, new b("MessengerIpcClient"), zzf.zzb));
            }
            hVar = f5206e;
        }
        return hVar;
    }

    private final synchronized i e(t tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f5209c.e(tVar)) {
            i iVar = new i(this);
            this.f5209c = iVar;
            iVar.e(tVar);
        }
        return tVar.f5229b.a();
    }

    public final i d(int i10, Bundle bundle) {
        return e(new q(a(), 2, bundle));
    }

    public final i g(int i10, Bundle bundle) {
        return e(new v(a(), 1, bundle));
    }
}
