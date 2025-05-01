package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.util.ArrayDeque;
import java.util.Queue;
import x3.b;

final class i implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    int f5211a;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f5212b;

    /* renamed from: c  reason: collision with root package name */
    r f5213c;

    /* renamed from: d  reason: collision with root package name */
    final Queue f5214d;

    /* renamed from: e  reason: collision with root package name */
    final SparseArray f5215e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h f5216f;

    private i(h hVar) {
        this.f5216f = hVar;
        this.f5211a = 0;
        this.f5212b = new Messenger(new zze(Looper.getMainLooper(), new l(this)));
        this.f5214d = new ArrayDeque();
        this.f5215e = new SparseArray();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f5216f.f5208b.execute(new m(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i10) {
        t tVar = (t) this.f5215e.get(i10);
        if (tVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f5215e.remove(i10);
            tVar.b(new s(3, "Timed out waiting for response"));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(int i10, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f5211a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f5211a = 4;
            b.b().c(this.f5216f.f5207a, this);
            s sVar = new s(i10, str);
            for (t b10 : this.f5214d) {
                b10.b(sVar);
            }
            this.f5214d.clear();
            for (int i12 = 0; i12 < this.f5215e.size(); i12++) {
                ((t) this.f5215e.valueAt(i12)).b(sVar);
            }
            this.f5215e.clear();
        } else if (i11 == 3) {
            this.f5211a = 4;
        } else if (i11 != 4) {
            int i13 = this.f5211a;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i13);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.b(new com.google.android.gms.cloudmessaging.s(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "MessengerIpcClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Received response to request: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray r1 = r4.f5215e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.cloudmessaging.t r1 = (com.google.android.gms.cloudmessaging.t) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3 = 50
            r1.<init>(r3)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Received response for unknown request: "
            r1.append(r3)     // Catch:{ all -> 0x006f }
            r1.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray r3 = r4.f5215e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.f()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.cloudmessaging.s r5 = new com.google.android.gms.cloudmessaging.s
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.b(r5)
            goto L_0x006e
        L_0x006b:
            r1.a(r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.i.d(android.os.Message):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean e(com.google.android.gms.cloudmessaging.t r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f5211a     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r7 = 3
            if (r0 == r7) goto L_0x002e
            r7 = 4
            if (r0 != r7) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r6.f5211a     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2 = 26
            r1.<init>(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "Unknown state: "
            r1.append(r2)     // Catch:{ all -> 0x0097 }
            r1.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0097 }
            r7.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r6)
            return r2
        L_0x0030:
            java.util.Queue r0 = r6.f5214d     // Catch:{ all -> 0x0097 }
            r0.add(r7)     // Catch:{ all -> 0x0097 }
            r6.a()     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)
            return r3
        L_0x003a:
            java.util.Queue r0 = r6.f5214d     // Catch:{ all -> 0x0097 }
            r0.add(r7)     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)
            return r3
        L_0x0041:
            java.util.Queue r0 = r6.f5214d     // Catch:{ all -> 0x0097 }
            r0.add(r7)     // Catch:{ all -> 0x0097 }
            int r7 = r6.f5211a     // Catch:{ all -> 0x0097 }
            if (r7 != 0) goto L_0x004c
            r7 = 1
            goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            com.google.android.gms.common.internal.s.n(r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "MessengerIpcClient"
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x005f
            java.lang.String r7 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r7, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r6.f5211a = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r7.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r7.setPackage(r0)     // Catch:{ all -> 0x0097 }
            x3.b r0 = x3.b.b()     // Catch:{ all -> 0x0097 }
            com.google.android.gms.cloudmessaging.h r1 = r6.f5216f     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f5207a     // Catch:{ all -> 0x0097 }
            boolean r7 = r0.a(r1, r7, r6, r3)     // Catch:{ all -> 0x0097 }
            if (r7 != 0) goto L_0x0083
            java.lang.String r7 = "Unable to bind to service"
            r6.c(r2, r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.android.gms.cloudmessaging.h r7 = r6.f5216f     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r7 = r7.f5208b     // Catch:{ all -> 0x0097 }
            com.google.android.gms.cloudmessaging.k r0 = new com.google.android.gms.cloudmessaging.k     // Catch:{ all -> 0x0097 }
            r0.<init>(r6)     // Catch:{ all -> 0x0097 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r4 = 30
            r7.schedule(r0, r4, r1)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r6)
            return r3
        L_0x0097:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.i.e(com.google.android.gms.cloudmessaging.t):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.f5211a == 2 && this.f5214d.isEmpty() && this.f5215e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f5211a = 3;
            b.b().c(this.f5216f.f5207a, this);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void g() {
        if (this.f5211a == 1) {
            c(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f5216f.f5208b.execute(new n(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f5216f.f5208b.execute(new p(this));
    }
}
