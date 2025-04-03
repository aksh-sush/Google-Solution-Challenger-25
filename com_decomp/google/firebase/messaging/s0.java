package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.a;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.i;
import n4.j;
import n4.l;

class s0 {

    /* renamed from: j  reason: collision with root package name */
    private static final long f8456j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f8457a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f8458b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f8459c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f8460d;

    /* renamed from: e  reason: collision with root package name */
    private final FirebaseInstallationsApi f8461e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f8462f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f8463g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8464h = false;

    /* renamed from: i  reason: collision with root package name */
    private final q0 f8465i;

    private s0(FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, i0 i0Var, q0 q0Var, e0 e0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8460d = firebaseMessaging;
        this.f8461e = firebaseInstallationsApi;
        this.f8458b = i0Var;
        this.f8465i = q0Var;
        this.f8459c = e0Var;
        this.f8457a = context;
        this.f8463g = scheduledExecutorService;
    }

    private void a(p0 p0Var, j jVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f8462f) {
            String e10 = p0Var.e();
            if (this.f8462f.containsKey(e10)) {
                arrayDeque = (ArrayDeque) this.f8462f.get(e10);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f8462f.put(e10, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
    }

    private static Object b(i iVar) {
        try {
            return l.b(iVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    private void c(String str) {
        b(this.f8459c.k((String) b(this.f8461e.getId()), this.f8460d.blockingGetToken(), str));
    }

    private void d(String str) {
        b(this.f8459c.l((String) b(this.f8461e.getId()), this.f8460d.blockingGetToken(), str));
    }

    static i e(FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, i0 i0Var, e0 e0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return l.c(scheduledExecutorService, new r0(context, scheduledExecutorService, firebaseMessaging, firebaseInstallationsApi, i0Var, e0Var));
    }

    static boolean g() {
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable(Constants.TAG, 3);
        }
        return true;
    }

    static final /* synthetic */ s0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, i0 i0Var, e0 e0Var) {
        return new s0(firebaseMessaging, firebaseInstallationsApi, i0Var, q0.b(context, scheduledExecutorService), e0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(com.google.firebase.messaging.p0 r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f8462f
            monitor-enter(r0)
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x0032 }
            java.util.Map r1 = r4.f8462f     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map r1 = r4.f8462f     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            n4.j r2 = (n4.j) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map r1 = r4.f8462f     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s0.j(com.google.firebase.messaging.p0):void");
    }

    private void o() {
        if (!h()) {
            s(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f8465i.c() != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean h() {
        return this.f8464h;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a A[Catch:{ IOException -> 0x00bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(com.google.firebase.messaging.p0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch:{ IOException -> 0x00bb }
            int r3 = r2.hashCode()     // Catch:{ IOException -> 0x00bb }
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L_0x001f
            r4 = 85
            if (r3 == r4) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L_0x008a
            if (r2 == r5) goto L_0x005a
            boolean r2 = g()     // Catch:{ IOException -> 0x00bb }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
            int r2 = r7.length()     // Catch:{ IOException -> 0x00bb }
            int r2 = r2 + 24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r2 = "Unknown topic operation"
            r3.append(r2)     // Catch:{ IOException -> 0x00bb }
            r3.append(r7)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r7 = "."
            r3.append(r7)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r7 = r3.toString()     // Catch:{ IOException -> 0x00bb }
        L_0x0056:
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ba
        L_0x005a:
            java.lang.String r2 = r7.c()     // Catch:{ IOException -> 0x00bb }
            r6.d(r2)     // Catch:{ IOException -> 0x00bb }
            boolean r2 = g()     // Catch:{ IOException -> 0x00bb }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r7 = r7.c()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00bb }
            int r2 = r2 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r2 = "Unsubscribe from topic: "
            r4.append(r2)     // Catch:{ IOException -> 0x00bb }
            r4.append(r7)     // Catch:{ IOException -> 0x00bb }
            r4.append(r3)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x00bb }
            goto L_0x0056
        L_0x008a:
            java.lang.String r2 = r7.c()     // Catch:{ IOException -> 0x00bb }
            r6.c(r2)     // Catch:{ IOException -> 0x00bb }
            boolean r2 = g()     // Catch:{ IOException -> 0x00bb }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r7 = r7.c()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00bb }
            int r2 = r2 + 31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r2 = "Subscribe to topic: "
            r4.append(r2)     // Catch:{ IOException -> 0x00bb }
            r4.append(r7)     // Catch:{ IOException -> 0x00bb }
            r4.append(r3)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x00bb }
            goto L_0x0056
        L_0x00ba:
            return r5
        L_0x00bb:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00e2
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00d5
            goto L_0x00e2
        L_0x00d5:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00e1
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        L_0x00dd:
            android.util.Log.e(r0, r7)
            return r1
        L_0x00e1:
            throw r7
        L_0x00e2:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 53
            r3.<init>(r2)
            java.lang.String r2 = "Topic operation failed: "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s0.k(com.google.firebase.messaging.p0):boolean");
    }

    /* access modifiers changed from: package-private */
    public void l(Runnable runnable, long j10) {
        this.f8463g.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public i m(p0 p0Var) {
        this.f8465i.a(p0Var);
        j jVar = new j();
        a(p0Var, jVar);
        return jVar.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void n(boolean z10) {
        this.f8464h = z10;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (f()) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public i q(String str) {
        i m10 = m(p0.f(str));
        p();
        return m10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (k(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.q0 r0 = r2.f8465i     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.p0 r0 = r0.c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = g()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            r0 = 1
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.q0 r1 = r2.f8465i
            r1.e(r0)
            r2.j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s0.r():boolean");
    }

    /* access modifiers changed from: package-private */
    public void s(long j10) {
        l(new t0(this, this.f8457a, this.f8458b, Math.min(Math.max(30, j10 + j10), f8456j)), j10);
        n(true);
    }

    /* access modifiers changed from: package-private */
    public i t(String str) {
        i m10 = m(p0.g(str));
        p();
        return m10;
    }
}
