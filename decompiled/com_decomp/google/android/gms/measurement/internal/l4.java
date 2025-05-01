package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class l4 extends h5 {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f6160l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public k4 f6161c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k4 f6162d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue f6163e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue f6164f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f6165g = new i4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f6166h = new i4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f6167i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f6168j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f6169k;

    l4(n4 n4Var) {
        super(n4Var);
    }

    private final void D(j4 j4Var) {
        synchronized (this.f6167i) {
            this.f6163e.add(j4Var);
            k4 k4Var = this.f6161c;
            if (k4Var == null) {
                k4 k4Var2 = new k4(this, "Measurement Worker", this.f6163e);
                this.f6161c = k4Var2;
                k4Var2.setUncaughtExceptionHandler(this.f6165g);
                this.f6161c.start();
            } else {
                k4Var.a();
            }
        }
    }

    public final void A(Runnable runnable) {
        k();
        s.k(runnable);
        D(new j4(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.f6161c;
    }

    public final void g() {
        if (Thread.currentThread() != this.f6162d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void h() {
        if (Thread.currentThread() != this.f6161c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f5994a.d().w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r5.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f5994a.d().w();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.l4 r0 = r0.b()     // Catch:{ all -> 0x0058 }
            r0.z(r6)     // Catch:{ all -> 0x0058 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()
            com.google.android.gms.measurement.internal.h3 r3 = r3.w()
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.w()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x004c
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x004c:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0058 }
            r5.<init>(r4)     // Catch:{ all -> 0x0058 }
            r4 = r5
        L_0x0052:
            r3.a(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            r2 = 0
            return r2
        L_0x0058:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final Future s(Callable callable) {
        k();
        s.k(callable);
        j4 j4Var = new j4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6161c) {
            if (!this.f6163e.isEmpty()) {
                this.f5994a.d().w().a("Callable skipped the worker queue.");
            }
            j4Var.run();
        } else {
            D(j4Var);
        }
        return j4Var;
    }

    public final Future t(Callable callable) {
        k();
        s.k(callable);
        j4 j4Var = new j4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6161c) {
            j4Var.run();
        } else {
            D(j4Var);
        }
        return j4Var;
    }

    public final void y(Runnable runnable) {
        k();
        s.k(runnable);
        j4 j4Var = new j4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f6167i) {
            this.f6164f.add(j4Var);
            k4 k4Var = this.f6162d;
            if (k4Var == null) {
                k4 k4Var2 = new k4(this, "Measurement Network", this.f6164f);
                this.f6162d = k4Var2;
                k4Var2.setUncaughtExceptionHandler(this.f6166h);
                this.f6162d.start();
            } else {
                k4Var.a();
            }
        }
    }

    public final void z(Runnable runnable) {
        k();
        s.k(runnable);
        D(new j4(this, runnable, false, "Task exception on worker thread"));
    }
}
