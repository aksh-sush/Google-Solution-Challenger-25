package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;
import x3.b;

final class d2 extends i {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f5605f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f5606g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f5607h;

    /* renamed from: i  reason: collision with root package name */
    private final c2 f5608i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final b f5609j;

    /* renamed from: k  reason: collision with root package name */
    private final long f5610k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f5611l;

    /* renamed from: m  reason: collision with root package name */
    private volatile Executor f5612m;

    d2(Context context, Looper looper, Executor executor) {
        c2 c2Var = new c2(this, (b2) null);
        this.f5608i = c2Var;
        this.f5606g = context.getApplicationContext();
        this.f5607h = new zzi(looper, c2Var);
        this.f5609j = b.b();
        this.f5610k = 5000;
        this.f5611l = 300000;
        this.f5612m = executor;
    }

    /* access modifiers changed from: protected */
    public final void c(y1 y1Var, ServiceConnection serviceConnection, String str) {
        s.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5605f) {
            a2 a2Var = (a2) this.f5605f.get(y1Var);
            if (a2Var == null) {
                String obj = y1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (a2Var.h(serviceConnection)) {
                a2Var.f(serviceConnection, str);
                if (a2Var.i()) {
                    this.f5607h.sendMessageDelayed(this.f5607h.obtainMessage(0, y1Var), this.f5610k);
                }
            } else {
                String obj2 = y1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean e(y1 y1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        s.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5605f) {
            a2 a2Var = (a2) this.f5605f.get(y1Var);
            if (executor == null) {
                executor = this.f5612m;
            }
            if (a2Var == null) {
                a2Var = new a2(this, y1Var);
                a2Var.d(serviceConnection, serviceConnection, str);
                a2Var.e(str, executor);
                this.f5605f.put(y1Var, a2Var);
            } else {
                this.f5607h.removeMessages(0, y1Var);
                if (!a2Var.h(serviceConnection)) {
                    a2Var.d(serviceConnection, serviceConnection, str);
                    int a10 = a2Var.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(a2Var.b(), a2Var.c());
                    } else if (a10 == 2) {
                        a2Var.e(str, executor);
                    }
                } else {
                    String obj = y1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j10 = a2Var.j();
        }
        return j10;
    }
}
