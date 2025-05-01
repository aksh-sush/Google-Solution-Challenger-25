package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class l0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f5659a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f5660b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f5661c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f5662d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f5663e = false;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f5664f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private boolean f5665g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f5666h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f5667i = new Object();

    public l0(Looper looper, k0 k0Var) {
        this.f5659a = k0Var;
        this.f5666h = new zaq(looper, this);
    }

    public final void a() {
        this.f5663e = false;
        this.f5664f.incrementAndGet();
    }

    public final void b() {
        this.f5663e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q3.b r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f5666h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.s.e(r0, r1)
            android.os.Handler r0 = r5.f5666h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f5667i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f5662d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f5664f     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.GoogleApiClient$c r3 = (com.google.android.gms.common.api.GoogleApiClient.c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f5663e     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f5664f     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f5662d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.onConnectionFailed(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.l0.c(q3.b):void");
    }

    public final void d(Bundle bundle) {
        s.e(this.f5666h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f5667i) {
            s.n(!this.f5665g);
            this.f5666h.removeMessages(1);
            this.f5665g = true;
            s.n(this.f5661c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f5660b);
            int i10 = this.f5664f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f5663e || !this.f5659a.isConnected()) {
                    break;
                } else if (this.f5664f.get() != i10) {
                    break;
                } else if (!this.f5661c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f5661c.clear();
            this.f5665g = false;
        }
    }

    public final void e(int i10) {
        s.e(this.f5666h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f5666h.removeMessages(1);
        synchronized (this.f5667i) {
            this.f5665g = true;
            ArrayList arrayList = new ArrayList(this.f5660b);
            int i11 = this.f5664f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f5663e) {
                    break;
                } else if (this.f5664f.get() != i11) {
                    break;
                } else if (this.f5660b.contains(bVar)) {
                    bVar.onConnectionSuspended(i10);
                }
            }
            this.f5661c.clear();
            this.f5665g = false;
        }
    }

    public final void f(GoogleApiClient.b bVar) {
        s.k(bVar);
        synchronized (this.f5667i) {
            if (this.f5660b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f5660b.add(bVar);
            }
        }
        if (this.f5659a.isConnected()) {
            Handler handler = this.f5666h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(GoogleApiClient.c cVar) {
        s.k(cVar);
        synchronized (this.f5667i) {
            if (this.f5662d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f5662d.add(cVar);
            }
        }
    }

    public final void h(GoogleApiClient.c cVar) {
        s.k(cVar);
        synchronized (this.f5667i) {
            if (!this.f5662d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            GoogleApiClient.b bVar = (GoogleApiClient.b) message.obj;
            synchronized (this.f5667i) {
                if (this.f5663e && this.f5659a.isConnected() && this.f5660b.contains(bVar)) {
                    bVar.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i10);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
