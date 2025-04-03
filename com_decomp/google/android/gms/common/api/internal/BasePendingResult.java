package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends h> extends PendingResult {
    static final ThreadLocal<Boolean> zaa = new y2();
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private z2 mResultGuardian;
    protected final a zab;
    protected final WeakReference<GoogleApiClient> zac;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList<PendingResult.a> zag = new ArrayList<>();
    private i zah;
    private final AtomicReference<m2> zai = new AtomicReference<>();
    /* access modifiers changed from: private */
    public R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private l zao;
    private volatile l2 zap;
    private boolean zaq = false;

    public static class a extends zaq {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(i iVar, h hVar) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((i) s.k(iVar), hVar)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a(hVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(hVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5271n);
            }
        }
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zab = new a(googleApiClient != null ? googleApiClient.k() : Looper.getMainLooper());
        this.zac = new WeakReference<>(googleApiClient);
    }

    private final h a() {
        R r10;
        synchronized (this.zae) {
            s.o(!this.zal, "Result has already been consumed.");
            s.o(isReady(), "Result is not ready.");
            r10 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        m2 andSet = this.zai.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f5449a.f5466a.remove(this);
        }
        return (h) s.k(r10);
    }

    private final void b(h hVar) {
        this.zaj = hVar;
        this.zak = hVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            i iVar = this.zah;
            if (iVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(iVar, a());
            }
        }
        ArrayList<PendingResult.a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(h hVar) {
    }

    public final void addStatusListener(PendingResult.a aVar) {
        s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    public final R await() {
        s.j("await must not be called on the UI thread");
        boolean z10 = true;
        s.o(!this.zal, "Result has already been consumed");
        if (this.zap != null) {
            z10 = false;
        }
        s.o(z10, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5269l);
        }
        s.o(isReady(), "Result is not ready.");
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.zal     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.zaj     // Catch:{ all -> 0x0021 }
            zal(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.zam = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f5272o     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.h r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x0021 }
            r2.b(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    /* access modifiers changed from: protected */
    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    /* access modifiers changed from: protected */
    public final void setCancelToken(l lVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            s.o(!isReady(), "Results have already been set");
            s.o(!this.zal, "Result has already been consumed");
            b(r10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.i r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.zal     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.s.o(r1, r3)     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.internal.l2 r1 = r4.zap     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.s.o(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r1 = r4.zab     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.h r2 = r4.a()     // Catch:{ all -> 0x003a }
            r1.a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.zah = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.i):void");
    }

    public final <S extends h> k then(j jVar) {
        k b10;
        s.o(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            boolean z10 = false;
            s.o(this.zap == null, "Cannot call then() twice.");
            if (this.zah == null) {
                z10 = true;
            }
            s.o(z10, "Cannot call then() if callbacks are set.");
            s.o(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new l2(this.zac);
            b10 = this.zap.b(jVar);
            if (isReady()) {
                this.zab.a(this.zap, a());
            } else {
                this.zah = this.zap;
            }
        }
        return b10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (this.zac.get() == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(m2 m2Var) {
        this.zai.set(m2Var);
    }

    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            s.j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z10 = true;
        s.o(!this.zal, "Result has already been consumed.");
        if (this.zap != null) {
            z10 = false;
        }
        s.o(z10, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f5271n);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5269l);
        }
        s.o(isReady(), "Result is not ready.");
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.i r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000a:
            boolean r1 = r4.zal     // Catch:{ all -> 0x0048 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.s.o(r1, r3)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.l2 r1 = r4.zap     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.s.o(r2, r1)     // Catch:{ all -> 0x0048 }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0026:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r6 = r4.zab     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.h r7 = r4.a()     // Catch:{ all -> 0x0048 }
            r6.a(r5, r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0036:
            r4.zah = r5     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.BasePendingResult$a r5 = r4.zab     // Catch:{ all -> 0x0048 }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x0048 }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x0048 }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.i, long, java.util.concurrent.TimeUnit):void");
    }
}
