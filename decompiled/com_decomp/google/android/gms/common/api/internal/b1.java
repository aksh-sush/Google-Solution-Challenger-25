package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import q3.b;
import q3.j;

public final class b1 extends GoogleApiClient implements w1 {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f5303b;

    /* renamed from: c  reason: collision with root package name */
    private final l0 f5304c;

    /* renamed from: d  reason: collision with root package name */
    private y1 f5305d = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f5306e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5307f;

    /* renamed from: g  reason: collision with root package name */
    private final Looper f5308g;

    /* renamed from: h  reason: collision with root package name */
    final Queue f5309h = new LinkedList();

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f5310i;

    /* renamed from: j  reason: collision with root package name */
    private long f5311j;

    /* renamed from: k  reason: collision with root package name */
    private long f5312k;

    /* renamed from: l  reason: collision with root package name */
    private final z0 f5313l;

    /* renamed from: m  reason: collision with root package name */
    private final j f5314m;

    /* renamed from: n  reason: collision with root package name */
    u1 f5315n;

    /* renamed from: o  reason: collision with root package name */
    final Map f5316o;

    /* renamed from: p  reason: collision with root package name */
    Set f5317p;

    /* renamed from: q  reason: collision with root package name */
    final d f5318q;

    /* renamed from: r  reason: collision with root package name */
    final Map f5319r;

    /* renamed from: s  reason: collision with root package name */
    final a.C0085a f5320s;

    /* renamed from: t  reason: collision with root package name */
    private final m f5321t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList f5322u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f5323v;

    /* renamed from: w  reason: collision with root package name */
    Set f5324w;

    /* renamed from: x  reason: collision with root package name */
    final n2 f5325x;

    /* renamed from: y  reason: collision with root package name */
    private final k0 f5326y;

    public b1(Context context, Lock lock, Looper looper, d dVar, j jVar, a.C0085a aVar, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        Looper looper2 = looper;
        int i12 = i10;
        this.f5311j = true != y3.d.a() ? 120000 : 10000;
        this.f5312k = 5000;
        this.f5317p = new HashSet();
        this.f5321t = new m();
        this.f5323v = null;
        this.f5324w = null;
        x0 x0Var = new x0(this);
        this.f5326y = x0Var;
        this.f5307f = context;
        this.f5303b = lock;
        this.f5304c = new l0(looper, x0Var);
        this.f5308g = looper2;
        this.f5313l = new z0(this, looper);
        this.f5314m = jVar;
        this.f5306e = i12;
        if (i12 >= 0) {
            this.f5323v = Integer.valueOf(i11);
        }
        this.f5319r = map;
        this.f5316o = map2;
        this.f5322u = arrayList;
        this.f5325x = new n2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f5304c.f((GoogleApiClient.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f5304c.g((GoogleApiClient.c) it2.next());
        }
        this.f5318q = dVar;
        this.f5320s = aVar;
    }

    public static int r(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z11 |= fVar.requiresSignIn();
            z12 |= fVar.providesSignIn();
        }
        if (z11) {
            return (!z12 || !z10) ? 1 : 2;
        }
        return 3;
    }

    static String t(int i10) {
        if (i10 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    static /* bridge */ /* synthetic */ void u(b1 b1Var) {
        b1Var.f5303b.lock();
        try {
            if (b1Var.f5310i) {
                b1Var.y();
            }
        } finally {
            b1Var.f5303b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void v(b1 b1Var) {
        b1Var.f5303b.lock();
        try {
            if (b1Var.w()) {
                b1Var.y();
            }
        } finally {
            b1Var.f5303b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [com.google.android.gms.common.api.internal.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x(int r13) {
        /*
            r12 = this;
            java.lang.Integer r0 = r12.f5323v
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f5323v = r13
            goto L_0x0011
        L_0x000b:
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x0091
        L_0x0011:
            com.google.android.gms.common.api.internal.y1 r13 = r12.f5305d
            if (r13 == 0) goto L_0x0016
            return
        L_0x0016:
            java.util.Map r13 = r12.f5316o
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = 0
        L_0x0022:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r13.next()
            com.google.android.gms.common.api.a$f r2 = (com.google.android.gms.common.api.a.f) r2
            boolean r3 = r2.requiresSignIn()
            r0 = r0 | r3
            boolean r2 = r2.providesSignIn()
            r1 = r1 | r2
            goto L_0x0022
        L_0x0039:
            java.lang.Integer r13 = r12.f5323v
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L_0x0062
            r1 = 2
            if (r13 == r1) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            if (r0 == 0) goto L_0x0066
            android.content.Context r2 = r12.f5307f
            java.util.concurrent.locks.Lock r4 = r12.f5303b
            android.os.Looper r5 = r12.f5308g
            q3.j r6 = r12.f5314m
            java.util.Map r7 = r12.f5316o
            com.google.android.gms.common.internal.d r8 = r12.f5318q
            java.util.Map r9 = r12.f5319r
            com.google.android.gms.common.api.a$a r10 = r12.f5320s
            java.util.ArrayList r11 = r12.f5322u
            r3 = r12
            com.google.android.gms.common.api.internal.z r13 = com.google.android.gms.common.api.internal.z.p(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005f:
            r12.f5305d = r13
            return
        L_0x0062:
            if (r0 == 0) goto L_0x0089
            if (r1 != 0) goto L_0x0081
        L_0x0066:
            com.google.android.gms.common.api.internal.f1 r13 = new com.google.android.gms.common.api.internal.f1
            android.content.Context r1 = r12.f5307f
            java.util.concurrent.locks.Lock r3 = r12.f5303b
            android.os.Looper r4 = r12.f5308g
            q3.j r5 = r12.f5314m
            java.util.Map r6 = r12.f5316o
            com.google.android.gms.common.internal.d r7 = r12.f5318q
            java.util.Map r8 = r12.f5319r
            com.google.android.gms.common.api.a$a r9 = r12.f5320s
            java.util.ArrayList r10 = r12.f5322u
            r0 = r13
            r2 = r12
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x005f
        L_0x0081:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L_0x0089:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L_0x0091:
            java.lang.String r13 = t(r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r12.f5323v
            int r1 = r1.intValue()
            java.lang.String r1 = t(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r13.length()
            int r3 = r3 + 51
            int r4 = r1.length()
            int r3 = r3 + r4
            r2.<init>(r3)
            java.lang.String r3 = "Cannot use sign-in mode: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = ". Mode was already set to "
            r2.append(r13)
            r2.append(r1)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b1.x(int):void");
    }

    private final void y() {
        this.f5304c.b();
        ((y1) s.k(this.f5305d)).d();
    }

    public final void a(b bVar) {
        if (!this.f5314m.k(this.f5307f, bVar.U())) {
            w();
        }
        if (!this.f5310i) {
            this.f5304c.c(bVar);
            this.f5304c.a();
        }
    }

    public final void b(Bundle bundle) {
        while (!this.f5309h.isEmpty()) {
            g((e) this.f5309h.remove());
        }
        this.f5304c.d(bundle);
    }

    public final void c(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f5310i) {
                this.f5310i = true;
                if (this.f5315n == null && !y3.d.a()) {
                    try {
                        this.f5315n = this.f5314m.v(this.f5307f.getApplicationContext(), new a1(this));
                    } catch (SecurityException unused) {
                    }
                }
                z0 z0Var = this.f5313l;
                z0Var.sendMessageDelayed(z0Var.obtainMessage(1), this.f5311j);
                z0 z0Var2 = this.f5313l;
                z0Var2.sendMessageDelayed(z0Var2.obtainMessage(2), this.f5312k);
            }
            i10 = 1;
        }
        for (BasePendingResult forceFailureUnlessReady : (BasePendingResult[]) this.f5325x.f5466a.toArray(new BasePendingResult[0])) {
            forceFailureUnlessReady.forceFailureUnlessReady(n2.f5465c);
        }
        this.f5304c.e(i10);
        this.f5304c.a();
        if (i10 == 2) {
            y();
        }
    }

    public final void connect() {
        this.f5303b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f5306e >= 0) {
                s.o(this.f5323v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f5323v;
                if (num == null) {
                    this.f5323v = Integer.valueOf(r(this.f5316o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) s.k(this.f5323v)).intValue();
            this.f5303b.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i10);
                s.b(z10, sb2.toString());
                x(i10);
                y();
            }
            z10 = true;
            StringBuilder sb22 = new StringBuilder(33);
            sb22.append("Illegal sign-in mode: ");
            sb22.append(i10);
            s.b(z10, sb22.toString());
            x(i10);
            y();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f5303b.unlock();
        }
    }

    public final b d(long j10, TimeUnit timeUnit) {
        s.o(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        s.l(timeUnit, "TimeUnit must not be null");
        this.f5303b.lock();
        try {
            Integer num = this.f5323v;
            if (num == null) {
                this.f5323v = Integer.valueOf(r(this.f5316o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            x(((Integer) s.k(this.f5323v)).intValue());
            this.f5304c.b();
            return ((y1) s.k(this.f5305d)).b(j10, timeUnit);
        } finally {
            this.f5303b.unlock();
        }
    }

    public final void disconnect() {
        this.f5303b.lock();
        try {
            this.f5325x.b();
            y1 y1Var = this.f5305d;
            if (y1Var != null) {
                y1Var.e();
            }
            this.f5321t.b();
            for (e eVar : this.f5309h) {
                eVar.zan((m2) null);
                eVar.cancel();
            }
            this.f5309h.clear();
            if (this.f5305d != null) {
                w();
                this.f5304c.a();
            }
        } finally {
            this.f5303b.unlock();
        }
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f5307f);
        printWriter.append(str).append("mResuming=").print(this.f5310i);
        printWriter.append(" mWorkQueue.size()=").print(this.f5309h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f5325x.f5466a.size());
        y1 y1Var = this.f5305d;
        if (y1Var != null) {
            y1Var.h(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final e f(e eVar) {
        a api = eVar.getApi();
        boolean containsKey = this.f5316o.containsKey(eVar.getClientKey());
        String d10 = api != null ? api.d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d10);
        sb2.append(" required for this call.");
        s.b(containsKey, sb2.toString());
        this.f5303b.lock();
        try {
            y1 y1Var = this.f5305d;
            if (y1Var == null) {
                this.f5309h.add(eVar);
            } else {
                eVar = y1Var.f(eVar);
            }
            return eVar;
        } finally {
            this.f5303b.unlock();
        }
    }

    public final e g(e eVar) {
        a api = eVar.getApi();
        boolean containsKey = this.f5316o.containsKey(eVar.getClientKey());
        String d10 = api != null ? api.d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d10);
        sb2.append(" required for this call.");
        s.b(containsKey, sb2.toString());
        this.f5303b.lock();
        try {
            y1 y1Var = this.f5305d;
            if (y1Var != null) {
                if (this.f5310i) {
                    this.f5309h.add(eVar);
                    while (!this.f5309h.isEmpty()) {
                        e eVar2 = (e) this.f5309h.remove();
                        this.f5325x.a(eVar2);
                        eVar2.setFailedResult(Status.f5270m);
                    }
                } else {
                    eVar = y1Var.j(eVar);
                }
                return eVar;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f5303b.unlock();
        }
    }

    public final a.f i(a.c cVar) {
        a.f fVar = (a.f) this.f5316o.get(cVar);
        s.l(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    public final Context j() {
        return this.f5307f;
    }

    public final Looper k() {
        return this.f5308g;
    }

    public final boolean l() {
        y1 y1Var = this.f5305d;
        return y1Var != null && y1Var.i();
    }

    public final boolean m(s sVar) {
        y1 y1Var = this.f5305d;
        return y1Var != null && y1Var.g(sVar);
    }

    public final void n() {
        y1 y1Var = this.f5305d;
        if (y1Var != null) {
            y1Var.a();
        }
    }

    public final void o(GoogleApiClient.c cVar) {
        this.f5304c.g(cVar);
    }

    public final void p(GoogleApiClient.c cVar) {
        this.f5304c.h(cVar);
    }

    /* access modifiers changed from: package-private */
    public final String s() {
        StringWriter stringWriter = new StringWriter();
        e("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        if (!this.f5310i) {
            return false;
        }
        this.f5310i = false;
        this.f5313l.removeMessages(2);
        this.f5313l.removeMessages(1);
        u1 u1Var = this.f5315n;
        if (u1Var != null) {
            u1Var.b();
            this.f5315n = null;
        }
        return true;
    }
}
