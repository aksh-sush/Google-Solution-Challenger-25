package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.s;
import h4.d;
import x3.b;

public final class u7 implements ServiceConnection, c.a, c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f6471a;

    /* renamed from: b  reason: collision with root package name */
    private volatile f3 f6472b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v7 f6473c;

    protected u7(v7 v7Var) {
        this.f6473c = v7Var;
    }

    public final void b(Intent intent) {
        this.f6473c.h();
        Context c10 = this.f6473c.f5994a.c();
        b b10 = b.b();
        synchronized (this) {
            if (this.f6471a) {
                this.f6473c.f5994a.d().v().a("Connection attempt already in progress");
                return;
            }
            this.f6473c.f5994a.d().v().a("Using local app measurement service");
            this.f6471a = true;
            b10.a(c10, intent, this.f6473c.f6500c, 129);
        }
    }

    public final void c() {
        this.f6473c.h();
        Context c10 = this.f6473c.f5994a.c();
        synchronized (this) {
            if (this.f6471a) {
                this.f6473c.f5994a.d().v().a("Connection attempt already in progress");
            } else if (this.f6472b == null || (!this.f6472b.isConnecting() && !this.f6472b.isConnected())) {
                this.f6472b = new f3(c10, Looper.getMainLooper(), this, this);
                this.f6473c.f5994a.d().v().a("Connecting to remote service");
                this.f6471a = true;
                s.k(this.f6472b);
                this.f6472b.checkAvailabilityAndConnect();
            } else {
                this.f6473c.f5994a.d().v().a("Already awaiting connection attempt");
            }
        }
    }

    public final void d() {
        if (this.f6472b != null && (this.f6472b.isConnected() || this.f6472b.isConnecting())) {
            this.f6472b.disconnect();
        }
        this.f6472b = null;
    }

    public final void onConnected(Bundle bundle) {
        s.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                s.k(this.f6472b);
                this.f6473c.f5994a.b().z(new r7(this, (d) this.f6472b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f6472b = null;
                this.f6471a = false;
            }
        }
    }

    public final void onConnectionFailed(q3.b bVar) {
        s.f("MeasurementServiceConnection.onConnectionFailed");
        j3 E = this.f6473c.f5994a.E();
        if (E != null) {
            E.w().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f6471a = false;
            this.f6472b = null;
        }
        this.f6473c.f5994a.b().z(new t7(this));
    }

    public final void onConnectionSuspended(int i10) {
        s.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f6473c.f5994a.d().q().a("Service connection suspended");
        this.f6473c.f5994a.b().z(new s7(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f6473c.f5994a.d().r().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.s.f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f6471a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.v7 r4 = r3.f6473c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof h4.d     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            h4.d r1 = (h4.d) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.z2 r1 = new com.google.android.gms.measurement.internal.z2     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f6473c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f6473c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f6473c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f6471a = r4     // Catch:{ all -> 0x0063 }
            x3.b r4 = x3.b.b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.v7 r5 = r3.f6473c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.c()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.v7 r0 = r3.f6473c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.u7 r0 = r0.f6500c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.v7 r4 = r3.f6473c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l4 r4 = r4.b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p7 r5 = new com.google.android.gms.measurement.internal.p7     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u7.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        s.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f6473c.f5994a.d().q().a("Service disconnected");
        this.f6473c.f5994a.b().z(new q7(this, componentName));
    }
}
