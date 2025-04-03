package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Date;

public class ExponentialBackoff {
    public static final double DEFAULT_BACKOFF_FACTOR = 1.5d;
    public static final long DEFAULT_BACKOFF_INITIAL_DELAY_MS = 1000;
    public static final long DEFAULT_BACKOFF_MAX_DELAY_MS = 60000;
    private final double backoffFactor;
    private long currentBaseMs;
    private final long initialDelayMs;
    private long lastAttemptTime;
    private final long maxDelayMs;
    private long nextMaxDelayMs;
    private final AsyncQueue queue;
    private final AsyncQueue.TimerId timerId;
    private AsyncQueue.DelayedTask timerTask;

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId2) {
        this(asyncQueue, timerId2, 1000, 1.5d, DEFAULT_BACKOFF_MAX_DELAY_MS);
    }

    private long jitterDelayMs() {
        return (long) ((Math.random() - 0.5d) * ((double) this.currentBaseMs));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$backoffAndRun$0(Runnable runnable) {
        this.lastAttemptTime = new Date().getTime();
        runnable.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x007c, code lost:
        if (r0 > r2) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void backoffAndRun(java.lang.Runnable r12) {
        /*
            r11 = this;
            r11.cancel()
            long r0 = r11.currentBaseMs
            long r2 = r11.jitterDelayMs()
            long r0 = r0 + r2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r11.lastAttemptTime
            long r2 = r2 - r4
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r6 = r0 - r2
            long r6 = java.lang.Math.max(r4, r6)
            long r8 = r11.currentBaseMs
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0056
            java.lang.Class r4 = r11.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r5[r8] = r9
            long r8 = r11.currentBaseMs
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r5[r9] = r8
            r8 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r8] = r0
            r0 = 3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5[r0] = r1
            java.lang.String r0 = "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"
            com.google.firebase.firestore.util.Logger.debug(r4, r0, r5)
        L_0x0056:
            com.google.firebase.firestore.util.AsyncQueue r0 = r11.queue
            com.google.firebase.firestore.util.AsyncQueue$TimerId r1 = r11.timerId
            com.google.firebase.firestore.util.m r2 = new com.google.firebase.firestore.util.m
            r2.<init>(r11, r12)
            com.google.firebase.firestore.util.AsyncQueue$DelayedTask r12 = r0.enqueueAfterDelay(r1, r6, r2)
            r11.timerTask = r12
            long r0 = r11.currentBaseMs
            double r0 = (double) r0
            double r2 = r11.backoffFactor
            double r0 = r0 * r2
            long r0 = (long) r0
            r11.currentBaseMs = r0
            long r2 = r11.initialDelayMs
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0078
        L_0x0075:
            r11.currentBaseMs = r2
            goto L_0x007f
        L_0x0078:
            long r2 = r11.nextMaxDelayMs
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x007f
            goto L_0x0075
        L_0x007f:
            long r0 = r11.maxDelayMs
            r11.nextMaxDelayMs = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.util.ExponentialBackoff.backoffAndRun(java.lang.Runnable):void");
    }

    public void cancel() {
        AsyncQueue.DelayedTask delayedTask = this.timerTask;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.timerTask = null;
        }
    }

    public void reset() {
        this.currentBaseMs = 0;
    }

    public void resetToMax() {
        this.currentBaseMs = this.nextMaxDelayMs;
    }

    public void setTemporaryMaxDelay(long j10) {
        this.nextMaxDelayMs = j10;
    }

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId2, long j10, double d10, long j11) {
        this.queue = asyncQueue;
        this.timerId = timerId2;
        this.initialDelayMs = j10;
        this.backoffFactor = d10;
        this.maxDelayMs = j11;
        this.nextMaxDelayMs = j11;
        this.lastAttemptTime = new Date().getTime();
        reset();
    }
}
