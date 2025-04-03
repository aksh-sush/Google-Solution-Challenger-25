package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.BlockingQueue;

final class k4 extends Thread {

    /* renamed from: e  reason: collision with root package name */
    private final Object f6139e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue f6140f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6141g = false;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l4 f6142h;

    public k4(l4 l4Var, String str, BlockingQueue blockingQueue) {
        this.f6142h = l4Var;
        s.k(str);
        s.k(blockingQueue);
        this.f6139e = new Object();
        this.f6140f = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.f6142h.f6167i) {
            if (!this.f6141g) {
                this.f6142h.f6168j.release();
                this.f6142h.f6167i.notifyAll();
                if (this == this.f6142h.f6161c) {
                    this.f6142h.f6161c = null;
                } else if (this == this.f6142h.f6162d) {
                    this.f6142h.f6162d = null;
                } else {
                    this.f6142h.f5994a.d().r().a("Current scheduler thread is neither worker nor network");
                }
                this.f6141g = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f6142h.f5994a.d().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f6139e) {
            this.f6139e.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 1
            if (r0 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.l4 r2 = r6.f6142h     // Catch:{ InterruptedException -> 0x000f }
            java.util.concurrent.Semaphore r2 = r2.f6168j     // Catch:{ InterruptedException -> 0x000f }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000f }
            r0 = 1
            goto L_0x0001
        L_0x000f:
            r1 = move-exception
            r6.c(r1)
            goto L_0x0001
        L_0x0014:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0082 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0082 }
        L_0x001c:
            java.util.concurrent.BlockingQueue r2 = r6.f6140f     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.j4 r2 = (com.google.android.gms.measurement.internal.j4) r2     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f6107f     // Catch:{ all -> 0x0082 }
            if (r1 == r3) goto L_0x002d
            r3 = 10
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0082 }
            r2.run()     // Catch:{ all -> 0x0082 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f6139e     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f6140f     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0051
            com.google.android.gms.measurement.internal.l4 r3 = r6.f6142h     // Catch:{ all -> 0x007f }
            boolean unused = r3.f6169k     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.f6139e     // Catch:{ InterruptedException -> 0x004d }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6.c(r3)     // Catch:{ all -> 0x007f }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.l4 r2 = r6.f6142h     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f6167i     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f6140f     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            com.google.android.gms.measurement.internal.l4 r0 = r6.f6142h     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.g r0 = r0.z()     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.x2 r1 = com.google.android.gms.measurement.internal.y2.f6637m0     // Catch:{ all -> 0x007c }
            r3 = 0
            boolean r0 = r0.B(r3, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            r6.b()     // Catch:{ all -> 0x007c }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            r6.b()
            return
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x001c
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r6.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k4.run():void");
    }
}
