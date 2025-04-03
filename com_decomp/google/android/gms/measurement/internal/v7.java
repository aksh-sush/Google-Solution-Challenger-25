package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.firebase.firestore.util.ExponentialBackoff;
import h4.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import q3.o;
import s3.a;
import x3.b;

public final class v7 extends z3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final u7 f6500c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public d f6501d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f6502e;

    /* renamed from: f  reason: collision with root package name */
    private final m f6503f;

    /* renamed from: g  reason: collision with root package name */
    private final i8 f6504g;

    /* renamed from: h  reason: collision with root package name */
    private final List f6505h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final m f6506i;

    protected v7(n4 n4Var) {
        super(n4Var);
        this.f6504g = new i8(n4Var.e());
        this.f6500c = new u7(this);
        this.f6503f = new e7(this, n4Var);
        this.f6506i = new g7(this, n4Var);
    }

    private final i9 C(boolean z10) {
        Pair a10;
        this.f5994a.f();
        b3 B = this.f5994a.B();
        String str = null;
        if (z10) {
            j3 d10 = this.f5994a.d();
            if (!(d10.f5994a.F().f6518d == null || (a10 = d10.f5994a.F().f6518d.a()) == null || a10 == w3.f6516x)) {
                String valueOf = String.valueOf(a10.second);
                String str2 = (String) a10.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return B.q(str);
    }

    /* access modifiers changed from: private */
    public final void D() {
        h();
        this.f5994a.d().v().b("Processing queued up service tasks", Integer.valueOf(this.f6505h.size()));
        for (Runnable run : this.f6505h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                this.f5994a.d().r().b("Task exception while flushing queue", e10);
            }
        }
        this.f6505h.clear();
        this.f6506i.b();
    }

    /* access modifiers changed from: private */
    public final void E() {
        h();
        this.f6504g.b();
        m mVar = this.f6503f;
        this.f5994a.z();
        mVar.d(((Long) y2.K.a((Object) null)).longValue());
    }

    private final void F(Runnable runnable) {
        h();
        if (z()) {
            runnable.run();
            return;
        }
        int size = this.f6505h.size();
        this.f5994a.z();
        if (((long) size) >= 1000) {
            this.f5994a.d().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f6505h.add(runnable);
        this.f6506i.d(ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS);
        P();
    }

    private final boolean G() {
        this.f5994a.f();
        return true;
    }

    static /* bridge */ /* synthetic */ void M(v7 v7Var, ComponentName componentName) {
        v7Var.h();
        if (v7Var.f6501d != null) {
            v7Var.f6501d = null;
            v7Var.f5994a.d().v().b("Disconnected from device MeasurementService", componentName);
            v7Var.h();
            v7Var.P();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        h();
        i();
        return !B() || this.f5994a.N().o0() >= ((Integer) y2.f6645q0.a((Object) null)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() {
        /*
            r6 = this;
            r6.h()
            r6.i()
            java.lang.Boolean r0 = r6.f6502e
            if (r0 != 0) goto L_0x0143
            r6.h()
            r6.i()
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.w3 r0 = r0.F()
            r0.h()
            android.content.SharedPreferences r1 = r0.o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x013d
        L_0x003f:
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            r4.f()
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            com.google.android.gms.measurement.internal.b3 r4 = r4.B()
            int r4 = r4.o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x0105
        L_0x0053:
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.v()
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            com.google.android.gms.measurement.internal.d9 r4 = r4.N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.p0(r5)
            if (r4 == 0) goto L_0x00f4
            if (r4 == r1) goto L_0x00e4
            r5 = 2
            if (r4 == r5) goto L_0x00c0
            r0 = 3
            if (r4 == r0) goto L_0x00af
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.b(r1, r4)
            goto L_0x00be
        L_0x0095:
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()
            java.lang.String r3 = "Service updating"
            goto L_0x0100
        L_0x00a2:
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()
            java.lang.String r1 = "Service invalid"
            goto L_0x00bb
        L_0x00af:
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()
            java.lang.String r1 = "Service disabled"
        L_0x00bb:
            r0.a(r1)
        L_0x00be:
            r1 = 0
            goto L_0x0105
        L_0x00c0:
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.q()
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            com.google.android.gms.measurement.internal.n4 r4 = r6.f5994a
            com.google.android.gms.measurement.internal.d9 r4 = r4.N()
            int r4 = r4.o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00de
            goto L_0x0105
        L_0x00de:
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            r3 = r1
            goto L_0x00be
        L_0x00e4:
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x0105
        L_0x00f4:
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r3 = "Service available"
        L_0x0100:
            r0.a(r3)
            goto L_0x0050
        L_0x0105:
            if (r3 != 0) goto L_0x0123
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            boolean r0 = r0.G()
            if (r0 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x013c
        L_0x0123:
            if (r1 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.n4 r0 = r6.f5994a
            com.google.android.gms.measurement.internal.w3 r0 = r0.F()
            r0.h()
            android.content.SharedPreferences r0 = r0.o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x013c:
            r1 = r3
        L_0x013d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f6502e = r0
        L_0x0143:
            java.lang.Boolean r0 = r6.f6502e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v7.B():boolean");
    }

    /* access modifiers changed from: package-private */
    public final Boolean J() {
        return this.f6502e;
    }

    /* access modifiers changed from: protected */
    public final void O() {
        h();
        i();
        i9 C = C(true);
        this.f5994a.C().r();
        F(new b7(this, C));
    }

    /* access modifiers changed from: package-private */
    public final void P() {
        h();
        i();
        if (!z()) {
            if (B()) {
                this.f6500c.c();
            } else if (!this.f5994a.z().G()) {
                this.f5994a.f();
                List<ResolveInfo> queryIntentServices = this.f5994a.c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f5994a.c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f5994a.d().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context c10 = this.f5994a.c();
                this.f5994a.f();
                intent.setComponent(new ComponentName(c10, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f6500c.b(intent);
            }
        }
    }

    public final void Q() {
        h();
        i();
        this.f6500c.d();
        try {
            b.b().c(this.f5994a.c(), this.f6500c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f6501d = null;
    }

    public final void R(zzcf zzcf) {
        h();
        i();
        F(new a7(this, C(false), zzcf));
    }

    public final void S(AtomicReference atomicReference) {
        h();
        i();
        F(new z6(this, atomicReference, C(false)));
    }

    /* access modifiers changed from: protected */
    public final void T(zzcf zzcf, String str, String str2) {
        h();
        i();
        F(new n7(this, str, str2, C(false), zzcf));
    }

    /* access modifiers changed from: protected */
    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        i();
        F(new m7(this, atomicReference, (String) null, str2, str3, C(false)));
    }

    /* access modifiers changed from: protected */
    public final void V(zzcf zzcf, String str, String str2, boolean z10) {
        h();
        i();
        F(new w6(this, str, str2, C(false), z10, zzcf));
    }

    /* access modifiers changed from: protected */
    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        i();
        F(new o7(this, atomicReference, (String) null, str2, str3, C(false), z10));
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void o(t tVar, String str) {
        s.k(tVar);
        h();
        i();
        G();
        F(new j7(this, true, C(true), this.f5994a.C().v(tVar), tVar, str));
    }

    public final void p(zzcf zzcf, t tVar, String str) {
        h();
        i();
        if (this.f5994a.N().p0(o.f14688a) != 0) {
            this.f5994a.d().w().a("Not bundling data. Service unavailable or out of date");
            this.f5994a.N().F(zzcf, new byte[0]);
            return;
        }
        F(new f7(this, tVar, str, zzcf));
    }

    /* access modifiers changed from: protected */
    public final void q() {
        h();
        i();
        i9 C = C(false);
        G();
        this.f5994a.C().q();
        F(new y6(this, C));
    }

    /* access modifiers changed from: package-private */
    public final void r(d dVar, a aVar, i9 i9Var) {
        int i10;
        int i11;
        h3 r10;
        String str;
        h();
        i();
        G();
        this.f5994a.z();
        int i12 = 0;
        int i13 = 100;
        while (i12 < 1001 && i13 == 100) {
            ArrayList arrayList = new ArrayList();
            List p10 = this.f5994a.C().p(100);
            if (p10 != null) {
                arrayList.addAll(p10);
                i10 = p10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (i11 = 0; i11 < size; i11++) {
                a aVar2 = (a) arrayList.get(i11);
                if (aVar2 instanceof t) {
                    try {
                        dVar.X((t) aVar2, i9Var);
                    } catch (RemoteException e10) {
                        e = e10;
                        r10 = this.f5994a.d().r();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof z8) {
                    try {
                        dVar.U((z8) aVar2, i9Var);
                    } catch (RemoteException e11) {
                        e = e11;
                        r10 = this.f5994a.d().r();
                        str = "Failed to send user property to the service";
                    }
                } else if (aVar2 instanceof c) {
                    try {
                        dVar.g((c) aVar2, i9Var);
                    } catch (RemoteException e12) {
                        e = e12;
                        r10 = this.f5994a.d().r();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    this.f5994a.d().r().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i13 = i10;
        }
        return;
        r10.b(str, e);
    }

    /* access modifiers changed from: protected */
    public final void s(c cVar) {
        s.k(cVar);
        h();
        i();
        this.f5994a.f();
        F(new k7(this, true, C(true), this.f5994a.C().u(cVar), new c(cVar), cVar));
    }

    /* access modifiers changed from: protected */
    public final void t(boolean z10) {
        h();
        i();
        if (z10) {
            G();
            this.f5994a.C().q();
        }
        if (A()) {
            F(new i7(this, C(false)));
        }
    }

    /* access modifiers changed from: protected */
    public final void u(o6 o6Var) {
        h();
        i();
        F(new c7(this, o6Var));
    }

    public final void v(Bundle bundle) {
        h();
        i();
        F(new d7(this, C(false), bundle));
    }

    /* access modifiers changed from: protected */
    public final void w() {
        h();
        i();
        F(new h7(this, C(true)));
    }

    /* access modifiers changed from: protected */
    public final void x(d dVar) {
        h();
        s.k(dVar);
        this.f6501d = dVar;
        E();
        D();
    }

    /* access modifiers changed from: protected */
    public final void y(z8 z8Var) {
        h();
        i();
        G();
        F(new x6(this, C(true), this.f5994a.C().w(z8Var), z8Var));
    }

    public final boolean z() {
        h();
        i();
        return this.f6501d != null;
    }
}
