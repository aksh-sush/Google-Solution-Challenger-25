package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class v6 extends z3 {

    /* renamed from: c  reason: collision with root package name */
    private volatile o6 f6488c;

    /* renamed from: d  reason: collision with root package name */
    private volatile o6 f6489d;

    /* renamed from: e  reason: collision with root package name */
    protected o6 f6490e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f6491f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Activity f6492g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f6493h;

    /* renamed from: i  reason: collision with root package name */
    private volatile o6 f6494i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public o6 f6495j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6496k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f6497l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private o6 f6498m;

    /* renamed from: n  reason: collision with root package name */
    private String f6499n;

    public v6(n4 n4Var) {
        super(n4Var);
    }

    private final o6 H(Activity activity) {
        s.k(activity);
        o6 o6Var = (o6) this.f6491f.get(activity);
        if (o6Var == null) {
            o6 o6Var2 = new o6((String) null, u(activity.getClass(), "Activity"), this.f5994a.N().r0());
            this.f6491f.put(activity, o6Var2);
            o6Var = o6Var2;
        }
        return this.f6494i != null ? this.f6494i : o6Var;
    }

    private final void o(Activity activity, o6 o6Var, boolean z10) {
        o6 o6Var2;
        o6 o6Var3 = o6Var;
        o6 o6Var4 = this.f6488c == null ? this.f6489d : this.f6488c;
        if (o6Var3.f6285b == null) {
            o6Var2 = new o6(o6Var3.f6284a, activity != null ? u(activity.getClass(), "Activity") : null, o6Var3.f6286c, o6Var3.f6288e, o6Var3.f6289f);
        } else {
            o6Var2 = o6Var3;
        }
        this.f6489d = this.f6488c;
        this.f6488c = o6Var2;
        this.f5994a.b().z(new q6(this, o6Var2, o6Var4, this.f5994a.e().a(), z10));
    }

    /* access modifiers changed from: private */
    public final void p(o6 o6Var, o6 o6Var2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        o6 o6Var3 = o6Var;
        o6 o6Var4 = o6Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        h();
        boolean z11 = false;
        boolean z12 = o6Var4 == null || o6Var4.f6286c != o6Var3.f6286c || !d9.Z(o6Var4.f6285b, o6Var3.f6285b) || !d9.Z(o6Var4.f6284a, o6Var3.f6284a);
        if (z10 && this.f6490e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            d9.x(o6Var3, bundle4, true);
            if (o6Var4 != null) {
                String str = o6Var4.f6284a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = o6Var4.f6285b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", o6Var4.f6286c);
            }
            if (z11) {
                f8 f8Var = this.f5994a.M().f6030e;
                long j13 = j12 - f8Var.f5975b;
                f8Var.f5975b = j12;
                if (j13 > 0) {
                    this.f5994a.N().v(bundle4, j13);
                }
            }
            if (!this.f5994a.z().D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != o6Var3.f6288e ? "auto" : "app";
            long currentTimeMillis = this.f5994a.e().currentTimeMillis();
            if (o6Var3.f6288e) {
                long j14 = o6Var3.f6289f;
                if (j14 != 0) {
                    j11 = j14;
                    this.f5994a.I().u(str3, "_vs", j11, bundle4);
                }
            }
            j11 = currentTimeMillis;
            this.f5994a.I().u(str3, "_vs", j11, bundle4);
        }
        if (z11) {
            q(this.f6490e, true, j12);
        }
        this.f6490e = o6Var3;
        if (o6Var3.f6288e) {
            this.f6495j = o6Var3;
        }
        this.f5994a.L().u(o6Var3);
    }

    /* access modifiers changed from: private */
    public final void q(o6 o6Var, boolean z10, long j10) {
        this.f5994a.y().n(this.f5994a.e().a());
        if (this.f5994a.M().f6030e.d(o6Var != null && o6Var.f6287d, z10, j10) && o6Var != null) {
            o6Var.f6287d = false;
        }
    }

    static /* bridge */ /* synthetic */ void x(v6 v6Var, Bundle bundle, o6 o6Var, o6 o6Var2, long j10) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        v6Var.p(o6Var, o6Var2, j10, true, v6Var.f5994a.N().v0((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List) null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f6497l) {
            if (activity == this.f6492g) {
                this.f6492g = null;
            }
        }
        if (this.f5994a.z().D()) {
            this.f6491f.remove(activity);
        }
    }

    public final void B(Activity activity) {
        synchronized (this.f6497l) {
            this.f6496k = false;
            this.f6493h = true;
        }
        long a10 = this.f5994a.e().a();
        if (!this.f5994a.z().D()) {
            this.f6488c = null;
            this.f5994a.b().z(new s6(this, a10));
            return;
        }
        o6 H = H(activity);
        this.f6489d = this.f6488c;
        this.f6488c = null;
        this.f5994a.b().z(new t6(this, H, a10));
    }

    public final void C(Activity activity) {
        synchronized (this.f6497l) {
            this.f6496k = true;
            if (activity != this.f6492g) {
                synchronized (this.f6497l) {
                    this.f6492g = activity;
                    this.f6493h = false;
                }
                if (this.f5994a.z().D()) {
                    this.f6494i = null;
                    this.f5994a.b().z(new u6(this));
                }
            }
        }
        if (!this.f5994a.z().D()) {
            this.f6488c = this.f6494i;
            this.f5994a.b().z(new r6(this));
            return;
        }
        o(activity, H(activity), false);
        c2 y10 = this.f5994a.y();
        y10.f5994a.b().z(new b1(y10, y10.f5994a.e().a()));
    }

    public final void D(Activity activity, Bundle bundle) {
        o6 o6Var;
        if (this.f5994a.z().D() && bundle != null && (o6Var = (o6) this.f6491f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", o6Var.f6286c);
            bundle2.putString("name", o6Var.f6284a);
            bundle2.putString("referrer_name", o6Var.f6285b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1 <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 <= 100) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            boolean r0 = r0.D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.o6 r0 = r3.f6488c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f6491f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.u(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f6285b
            boolean r1 = com.google.android.gms.measurement.internal.d9.Z(r1, r6)
            java.lang.String r0 = r0.f6284a
            boolean r0 = com.google.android.gms.measurement.internal.d9.Z(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.n4 r2 = r3.f5994a
            r2.z()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.n4 r2 = r3.f5994a
            r2.z()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.o6 r0 = new com.google.android.gms.measurement.internal.o6
            com.google.android.gms.measurement.internal.n4 r1 = r3.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f6491f
            r5.put(r4, r0)
            r5 = 1
            r3.o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f5994a.d().v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f6488c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f6489d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f6488c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.o6(r3, r4, r12.f5994a.N().r0(), true, r14);
        r12.f6488c = r2;
        r12.f6489d = r0;
        r12.f6494i = r2;
        r12.f5994a.b().z(new com.google.android.gms.measurement.internal.p6(r12, r13, r2, r0, r12.f5994a.e().a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f6497l
            monitor-enter(r0)
            boolean r1 = r12.f6496k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.n4 r13 = r12.f5994a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h3 r13 = r13.x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n4 r4 = r12.f5994a     // Catch:{ all -> 0x011b }
            r4.z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.n4 r13 = r12.f5994a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h3 r13 = r13.x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n4 r5 = r12.f5994a     // Catch:{ all -> 0x011b }
            r5.z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.n4 r13 = r12.f5994a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h3 r13 = r13.x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f6492g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.u(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.o6 r1 = r12.f6488c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f6493h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f6493h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f6285b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.d9.Z(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f6284a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.d9.Z(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.n4 r13 = r12.f5994a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h3 r13 = r13.x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n4 r0 = r12.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.c(r5, r1, r2)
            com.google.android.gms.measurement.internal.o6 r0 = r12.f6488c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.o6 r0 = r12.f6489d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.o6 r0 = r12.f6488c
        L_0x00e5:
            com.google.android.gms.measurement.internal.o6 r1 = new com.google.android.gms.measurement.internal.o6
            com.google.android.gms.measurement.internal.n4 r2 = r12.f5994a
            com.google.android.gms.measurement.internal.d9 r2 = r2.N()
            long r5 = r2.r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f6488c = r1
            r12.f6489d = r0
            r12.f6494i = r1
            com.google.android.gms.measurement.internal.n4 r14 = r12.f5994a
            y3.e r14 = r14.e()
            long r10 = r14.a()
            com.google.android.gms.measurement.internal.n4 r14 = r12.f5994a
            com.google.android.gms.measurement.internal.l4 r14 = r14.b()
            com.google.android.gms.measurement.internal.p6 r15 = new com.google.android.gms.measurement.internal.p6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.F(android.os.Bundle, long):void");
    }

    public final void G(String str, o6 o6Var) {
        h();
        synchronized (this) {
            String str2 = this.f6499n;
            if (str2 == null || str2.equals(str) || o6Var != null) {
                this.f6499n = str;
                this.f6498m = o6Var;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final o6 s() {
        return this.f6488c;
    }

    public final o6 t(boolean z10) {
        i();
        h();
        if (!z10) {
            return this.f6490e;
        }
        o6 o6Var = this.f6490e;
        return o6Var != null ? o6Var : this.f6495j;
    }

    /* access modifiers changed from: package-private */
    public final String u(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f5994a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.f5994a.z();
        return str2.substring(0, 100);
    }

    public final void z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f5994a.z().D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f6491f.put(activity, new o6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }
}
