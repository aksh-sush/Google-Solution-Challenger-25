package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.firebase.analytics.FirebaseAnalytics;
import h4.a;
import h4.m;
import h4.p;
import h4.q;
import h4.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class i6 extends z3 {

    /* renamed from: c  reason: collision with root package name */
    protected h6 f6041c;

    /* renamed from: d  reason: collision with root package name */
    private q f6042d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f6043e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f6044f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f6045g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    private final Object f6046h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private a f6047i = new a((Boolean) null, (Boolean) null);

    /* renamed from: j  reason: collision with root package name */
    private int f6048j = 100;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicLong f6049k = new AtomicLong(0);

    /* renamed from: l  reason: collision with root package name */
    private long f6050l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f6051m = 100;

    /* renamed from: n  reason: collision with root package name */
    final k9 f6052n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f6053o = true;

    /* renamed from: p  reason: collision with root package name */
    private final c9 f6054p = new x5(this);

    protected i6(n4 n4Var) {
        super(n4Var);
        this.f6052n = new k9(n4Var);
    }

    /* access modifiers changed from: private */
    public final void N(Boolean bool, boolean z10) {
        h();
        i();
        this.f5994a.d().q().b("Setting app measurement enabled (FE)", bool);
        this.f5994a.F().s(bool);
        if (z10) {
            w3 F = this.f5994a.F();
            n4 n4Var = F.f5994a;
            F.h();
            SharedPreferences.Editor edit = F.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f5994a.p() || (bool != null && !bool.booleanValue())) {
            O();
        }
    }

    /* access modifiers changed from: private */
    public final void O() {
        String str;
        String str2;
        Long valueOf;
        h();
        String a10 = this.f5994a.F().f6527m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                str = "app";
                str2 = "_npa";
                valueOf = null;
            } else {
                str = "app";
                str2 = "_npa";
                valueOf = Long.valueOf(true != "true".equals(a10) ? 0 : 1);
            }
            L(str, str2, valueOf, this.f5994a.e().currentTimeMillis());
        }
        if (!this.f5994a.o() || !this.f6053o) {
            this.f5994a.d().q().a("Updating Scion state (FE)");
            this.f5994a.L().w();
            return;
        }
        this.f5994a.d().q().a("Recording app launch after enabling measurement for the first time (FE)");
        d0();
        zzoh.zzc();
        if (this.f5994a.z().B((String) null, y2.f6635l0)) {
            this.f5994a.M().f6029d.a();
        }
        this.f5994a.b().z(new m5(this));
    }

    static /* bridge */ /* synthetic */ void a0(i6 i6Var, a aVar, int i10, long j10, boolean z10, boolean z11) {
        i6Var.h();
        i6Var.i();
        if (j10 > i6Var.f6050l || !a.l(i6Var.f6051m, i10)) {
            w3 F = i6Var.f5994a.F();
            n4 n4Var = F.f5994a;
            F.h();
            if (F.w(i10)) {
                SharedPreferences.Editor edit = F.o().edit();
                edit.putString("consent_settings", aVar.i());
                edit.putInt("consent_source", i10);
                edit.apply();
                i6Var.f6050l = j10;
                i6Var.f6051m = i10;
                i6Var.f5994a.L().t(z10);
                if (z11) {
                    i6Var.f5994a.L().S(new AtomicReference());
                    return;
                }
                return;
            }
            i6Var.f5994a.d().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        i6Var.f5994a.d().u().b("Dropped out-of-date consent setting, proposed settings", aVar);
    }

    /* access modifiers changed from: package-private */
    public final void A(String str, String str2, long j10, Object obj) {
        this.f5994a.b().z(new q5(this, str, str2, obj, j10));
    }

    /* access modifiers changed from: package-private */
    public final void B(String str) {
        this.f6045g.set(str);
    }

    public final void C(Bundle bundle) {
        D(bundle, this.f5994a.e().currentTimeMillis());
    }

    public final void D(Bundle bundle, long j10) {
        s.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f5994a.d().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        s.k(bundle2);
        Class<String> cls = String.class;
        m.a(bundle2, "app_id", cls, (Object) null);
        m.a(bundle2, FirebaseAnalytics.Param.ORIGIN, cls, (Object) null);
        m.a(bundle2, "name", cls, (Object) null);
        m.a(bundle2, FirebaseAnalytics.Param.VALUE, Object.class, (Object) null);
        m.a(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        m.a(bundle2, "trigger_timeout", cls2, 0L);
        m.a(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        m.a(bundle2, "timed_out_event_params", cls3, (Object) null);
        m.a(bundle2, "triggered_event_name", cls, (Object) null);
        m.a(bundle2, "triggered_event_params", cls3, (Object) null);
        m.a(bundle2, "time_to_live", cls2, 0L);
        m.a(bundle2, "expired_event_name", cls, (Object) null);
        m.a(bundle2, "expired_event_params", cls3, (Object) null);
        s.g(bundle2.getString("name"));
        s.g(bundle2.getString(FirebaseAnalytics.Param.ORIGIN));
        s.k(bundle2.get(FirebaseAnalytics.Param.VALUE));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(FirebaseAnalytics.Param.VALUE);
        if (this.f5994a.N().n0(string) != 0) {
            this.f5994a.d().r().b("Invalid conditional user property name", this.f5994a.D().s(string));
        } else if (this.f5994a.N().j0(string, obj) == 0) {
            Object p10 = this.f5994a.N().p(string, obj);
            if (p10 == null) {
                this.f5994a.d().r().c("Unable to normalize conditional user property value", this.f5994a.D().s(string), obj);
                return;
            }
            m.b(bundle2, p10);
            long j11 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f5994a.z();
                if (j11 > 15552000000L || j11 < 1) {
                    this.f5994a.d().r().c("Invalid conditional user property timeout", this.f5994a.D().s(string), Long.valueOf(j11));
                    return;
                }
            }
            long j12 = bundle2.getLong("time_to_live");
            this.f5994a.z();
            if (j12 > 15552000000L || j12 < 1) {
                this.f5994a.d().r().c("Invalid conditional user property time to live", this.f5994a.D().s(string), Long.valueOf(j12));
            } else {
                this.f5994a.b().z(new s5(this, bundle2));
            }
        } else {
            this.f5994a.d().r().c("Invalid conditional user property value", this.f5994a.D().s(string), obj);
        }
    }

    public final void E(Bundle bundle, int i10, long j10) {
        i();
        String h10 = a.h(bundle);
        if (h10 != null) {
            this.f5994a.d().x().b("Ignoring invalid consent setting", h10);
            this.f5994a.d().x().a("Valid consent values are 'granted', 'denied'");
        }
        F(a.a(bundle), i10, j10);
    }

    public final void F(a aVar, int i10, long j10) {
        boolean z10;
        boolean z11;
        a aVar2;
        boolean z12;
        i();
        if (i10 != -10 && aVar.e() == null && aVar.f() == null) {
            this.f5994a.d().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f6046h) {
            z10 = false;
            if (a.l(i10, this.f6048j)) {
                z12 = aVar.m(this.f6047i);
                if (aVar.k() && !this.f6047i.k()) {
                    z10 = true;
                }
                a d10 = aVar.d(this.f6047i);
                this.f6047i = d10;
                this.f6048j = i10;
                aVar2 = d10;
                z11 = z10;
                z10 = true;
            } else {
                aVar2 = aVar;
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.f5994a.d().u().b("Ignoring lower-priority consent settings, proposed settings", aVar2);
            return;
        }
        long andIncrement = this.f6049k.getAndIncrement();
        if (z12) {
            this.f6045g.set((Object) null);
            this.f5994a.b().A(new d6(this, aVar2, j10, i10, andIncrement, z11));
        } else if (i10 == 30 || i10 == -10) {
            this.f5994a.b().A(new e6(this, aVar2, i10, andIncrement, z11));
        } else {
            this.f5994a.b().z(new f6(this, aVar2, i10, andIncrement, z11));
        }
    }

    public final void G(q qVar) {
        q qVar2;
        h();
        i();
        if (!(qVar == null || qVar == (qVar2 = this.f6042d))) {
            s.o(qVar2 == null, "EventInterceptor already set.");
        }
        this.f6042d = qVar;
    }

    public final void H(Boolean bool) {
        i();
        this.f5994a.b().z(new c6(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void I(a aVar) {
        h();
        boolean z10 = (aVar.k() && aVar.j()) || this.f5994a.L().A();
        if (z10 != this.f5994a.p()) {
            this.f5994a.l(z10);
            w3 F = this.f5994a.F();
            n4 n4Var = F.f5994a;
            F.h();
            Boolean valueOf = F.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                N(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void J(String str, String str2, Object obj, boolean z10) {
        K("auto", "_ldl", obj, true, this.f5994a.e().currentTimeMillis());
    }

    public final void K(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        d9 N = this.f5994a.N();
        if (z10) {
            i10 = N.n0(str3);
        } else {
            if (N.Q("user property", str3)) {
                if (!N.M("user property", p.f10968a, (String[]) null, str3)) {
                    i10 = 15;
                } else {
                    N.f5994a.z();
                    if (N.L("user property", 24, str3)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            d9 N2 = this.f5994a.N();
            this.f5994a.z();
            this.f5994a.N().A(this.f6054p, (String) null, i10, "_ev", N2.q(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j02 = this.f5994a.N().j0(str3, obj2);
            if (j02 != 0) {
                d9 N3 = this.f5994a.N();
                this.f5994a.z();
                this.f5994a.N().A(this.f6054p, (String) null, j02, "_ev", N3.q(str3, 24, true), ((obj2 instanceof String) || (obj2 instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
                return;
            }
            Object p10 = this.f5994a.N().p(str3, obj2);
            if (p10 != null) {
                A(str4, str2, j10, p10);
            }
        } else {
            A(str4, str2, j10, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.s.g(r9)
            com.google.android.gms.common.internal.s.g(r10)
            r8.h()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L_0x0037
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = r2
        L_0x0038:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5994a
            com.google.android.gms.measurement.internal.w3 r0 = r0.F()
            com.google.android.gms.measurement.internal.v3 r0 = r0.f6527m
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.b(r11)
            r6 = r10
            goto L_0x0063
        L_0x0053:
            if (r11 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.n4 r10 = r8.f5994a
            com.google.android.gms.measurement.internal.w3 r10 = r10.F()
            com.google.android.gms.measurement.internal.v3 r10 = r10.f6527m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x0063:
            r3 = r1
            goto L_0x0067
        L_0x0065:
            r3 = r10
            r6 = r11
        L_0x0067:
            com.google.android.gms.measurement.internal.n4 r10 = r8.f5994a
            boolean r10 = r10.o()
            if (r10 != 0) goto L_0x007f
            com.google.android.gms.measurement.internal.n4 r9 = r8.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.n4 r10 = r8.f5994a
            boolean r10 = r10.r()
            if (r10 != 0) goto L_0x0088
            return
        L_0x0088:
            com.google.android.gms.measurement.internal.z8 r10 = new com.google.android.gms.measurement.internal.z8
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.n4 r9 = r8.f5994a
            com.google.android.gms.measurement.internal.v7 r9 = r9.L()
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.L(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void M(r rVar) {
        i();
        s.k(rVar);
        if (!this.f6043e.remove(rVar)) {
            this.f5994a.d().w().a("OnEventListener had not been registered");
        }
    }

    public final int P(String str) {
        s.g(str);
        this.f5994a.z();
        return 25;
    }

    public final Boolean Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f5994a.b().r(atomicReference, 15000, "boolean test flag value", new u5(this, atomicReference));
    }

    public final Double R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f5994a.b().r(atomicReference, 15000, "double test flag value", new b6(this, atomicReference));
    }

    public final Integer S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f5994a.b().r(atomicReference, 15000, "int test flag value", new a6(this, atomicReference));
    }

    public final Long T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f5994a.b().r(atomicReference, 15000, "long test flag value", new z5(this, atomicReference));
    }

    public final String U() {
        return (String) this.f6045g.get();
    }

    public final String V() {
        o6 s10 = this.f5994a.K().s();
        if (s10 != null) {
            return s10.f6285b;
        }
        return null;
    }

    public final String W() {
        o6 s10 = this.f5994a.K().s();
        if (s10 != null) {
            return s10.f6284a;
        }
        return null;
    }

    public final String X() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f5994a.b().r(atomicReference, 15000, "String test flag value", new y5(this, atomicReference));
    }

    public final ArrayList Y(String str, String str2) {
        if (this.f5994a.b().C()) {
            this.f5994a.d().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f5994a.f();
        if (b.a()) {
            this.f5994a.d().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f5994a.b().r(atomicReference, 5000, "get conditional user properties", new v5(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return d9.u(list);
        }
        this.f5994a.d().r().b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    public final Map Z(String str, String str2, boolean z10) {
        h3 r10;
        String str3;
        if (this.f5994a.b().C()) {
            r10 = this.f5994a.d().r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f5994a.f();
            if (b.a()) {
                r10 = this.f5994a.d().r();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f5994a.b().r(atomicReference, 5000, "get user properties", new w5(this, atomicReference, (String) null, str, str2, z10));
                List<z8> list = (List) atomicReference.get();
                if (list == null) {
                    this.f5994a.d().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                androidx.collection.a aVar = new androidx.collection.a(list.size());
                for (z8 z8Var : list) {
                    Object U = z8Var.U();
                    if (U != null) {
                        aVar.put(z8Var.f6689f, U);
                    }
                }
                return aVar;
            }
        }
        r10.a(str3);
        return Collections.emptyMap();
    }

    public final void d0() {
        h();
        i();
        if (this.f5994a.r()) {
            if (this.f5994a.z().B((String) null, y2.f6615b0)) {
                g z10 = this.f5994a.z();
                z10.f5994a.f();
                Boolean t10 = z10.t("google_analytics_deferred_deep_link_enabled");
                if (t10 != null && t10.booleanValue()) {
                    this.f5994a.d().q().a("Deferred Deep Link feature enabled.");
                    this.f5994a.b().z(new k5(this));
                }
            }
            this.f5994a.L().O();
            this.f6053o = false;
            w3 F = this.f5994a.F();
            F.h();
            String string = F.o().getString("previous_os_version", (String) null);
            F.f5994a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f5994a.A().k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    t("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void e0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f5994a.e().currentTimeMillis();
        s.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f5994a.b().z(new t5(this, bundle2));
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final void o() {
        if ((this.f5994a.c().getApplicationContext() instanceof Application) && this.f6041c != null) {
            ((Application) this.f5994a.c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f6041c);
        }
    }

    public final /* synthetic */ void p(Bundle bundle) {
        if (bundle == null) {
            this.f5994a.F().f6537w.b(new Bundle());
            return;
        }
        Bundle a10 = this.f5994a.F().f6537w.a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f5994a.N().T(obj)) {
                    this.f5994a.N().A(this.f6054p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f5994a.d().x().c("Invalid default event parameter type. Name, value", next, obj);
            } else if (d9.V(next)) {
                this.f5994a.d().x().b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a10.remove(next);
            } else {
                d9 N = this.f5994a.N();
                this.f5994a.z();
                if (N.N("param", next, 100, obj)) {
                    this.f5994a.N().B(a10, next, obj);
                }
            }
        }
        this.f5994a.N();
        int m10 = this.f5994a.z().m();
        if (a10.size() > m10) {
            int i10 = 0;
            for (String str : new TreeSet(a10.keySet())) {
                i10++;
                if (i10 > m10) {
                    a10.remove(str);
                }
            }
            this.f5994a.N().A(this.f6054p, (String) null, 26, (String) null, (String) null, 0);
            this.f5994a.d().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f5994a.F().f6537w.b(a10);
        this.f5994a.L().v(a10);
    }

    public final void q(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, this.f5994a.e().currentTimeMillis());
    }

    public final void r(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String str4 = str2;
        if (d9.Z(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.f5994a.K().F(bundle2, j10);
            return;
        }
        long j11 = j10;
        z(str3, str2, j10, bundle2, z11, !z11 || this.f6042d == null || d9.V(str2), z10, (String) null);
    }

    public final void s(String str, String str2, Bundle bundle, String str3) {
        n4.t();
        z("auto", str2, this.f5994a.e().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f5994a.e().currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        v(str, str2, j10, bundle, true, this.f6042d == null || d9.V(str2), true, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.os.Bundle[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a5, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c3, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            com.google.android.gms.common.internal.s.g(r20)
            com.google.android.gms.common.internal.s.k(r24)
            r19.h()
            r19.i()
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x050a
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.b3 r0 = r0.B()
            java.util.List r0 = r0.v()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.c(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.f6044f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.f6044f = r15
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.c()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.c()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.h3 r1 = r1.w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.f()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            y3.e r0 = r0.e()
            long r5 = r0.currentTimeMillis()
            r1 = r19
            r1.L(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            r0.f()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.d9.a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r0 = r0.N()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            com.google.android.gms.measurement.internal.s3 r1 = r1.f6537w
            android.os.Bundle r1 = r1.a()
            r0.y(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.f()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            java.lang.String r2 = "event"
            boolean r3 = r1.Q(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = h4.n.f10960a
            java.lang.String[] r5 = h4.n.f10961b
            boolean r3 = r1.M(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a
            r3.z()
            boolean r1 = r1.L(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.s()
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r2 = r2.D()
            java.lang.String r2 = r2.q(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            r2.z()
            java.lang.String r0 = r1.q(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            com.google.android.gms.measurement.internal.c9 r2 = r7.f6054p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.internal.measurement.zzpx.zzc()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.g r1 = r1.z()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.C0
            boolean r1 = r1.B(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01a8
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.f()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.v6 r1 = r1.K()
            com.google.android.gms.measurement.internal.o6 r1 = r1.t(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.f6287d = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
            goto L_0x01c5
        L_0x01a8:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.f()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.v6 r1 = r1.K()
            com.google.android.gms.measurement.internal.o6 r1 = r1.t(r14)
            if (r1 == 0) goto L_0x01c1
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c1
            r1.f6287d = r15
        L_0x01c1:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
        L_0x01c5:
            r3 = 1
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            com.google.android.gms.measurement.internal.d9.x(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.d9.V(r21)
            if (r25 == 0) goto L_0x0218
            h4.q r4 = r7.f6042d
            if (r4 == 0) goto L_0x0218
            if (r3 != 0) goto L_0x0218
            if (r1 == 0) goto L_0x01e2
            r16 = 1
            goto L_0x021a
        L_0x01e2:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r1 = r1.D()
            java.lang.String r1 = r1.q(r9)
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r2 = r2.D()
            java.lang.String r2 = r2.p(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.c(r3, r1, r2)
            h4.q r0 = r7.f6042d
            com.google.android.gms.common.internal.s.k(r0)
            h4.q r1 = r7.f6042d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.a(r2, r3, r4, r5)
            return
        L_0x0218:
            r16 = r1
        L_0x021a:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0509
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            int r1 = r1.k0(r9)
            if (r1 == 0) goto L_0x0278
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.s()
            com.google.android.gms.measurement.internal.n4 r3 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.b(r4, r3)
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r2 = r2.N()
            com.google.android.gms.measurement.internal.n4 r3 = r7.f5994a
            r3.z()
            java.lang.String r0 = r2.q(r9, r0, r15)
            if (r9 == 0) goto L_0x025c
            int r14 = r21.length()
        L_0x025c:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r2 = r2.N()
            com.google.android.gms.measurement.internal.c9 r3 = r7.f6054p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0278:
            java.lang.String r0 = "_sn"
            java.lang.String r1 = "_si"
            java.lang.String r6 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2, r1}
            java.util.List r5 = y3.f.b(r0)
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r0.N()
            r2 = r28
            r3 = r21
            r4 = r24
            r0 = r6
            r6 = r27
            android.os.Bundle r12 = r1.v0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.s.k(r12)
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.f()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.v6 r1 = r1.K()
            com.google.android.gms.measurement.internal.o6 r1 = r1.t(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02de
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02de
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.h8 r1 = r1.M()
            com.google.android.gms.measurement.internal.f8 r1 = r1.f6030e
            com.google.android.gms.measurement.internal.h8 r2 = r1.f5977d
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            y3.e r2 = r2.e()
            long r2 = r2.a()
            long r14 = r1.f5975b
            long r14 = r2 - r14
            r1.f5975b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02de
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            r1.v(r12, r14)
        L_0x02de:
            com.google.android.gms.internal.measurement.zzny.zzc()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.g r1 = r1.z()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.f6633k0
            boolean r1 = r1.B(r13, r2)
            if (r1 == 0) goto L_0x0368
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0347
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0347
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = y3.p.b(r2)
            if (r3 == 0) goto L_0x0313
            r2 = r13
            goto L_0x0319
        L_0x0313:
            if (r2 == 0) goto L_0x0319
            java.lang.String r2 = r2.trim()
        L_0x0319:
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r3 = r3.F()
            com.google.android.gms.measurement.internal.v3 r3 = r3.f6534t
            java.lang.String r3 = r3.a()
            boolean r3 = com.google.android.gms.measurement.internal.d9.Z(r2, r3)
            if (r3 != 0) goto L_0x0337
            com.google.android.gms.measurement.internal.n4 r1 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            com.google.android.gms.measurement.internal.v3 r1 = r1.f6534t
            r1.b(r2)
            goto L_0x0368
        L_0x0337:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.a(r1)
            return
        L_0x0347:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x0368
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r1 = r1.N()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            com.google.android.gms.measurement.internal.v3 r1 = r1.f6534t
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0368
            r12.putString(r2, r1)
        L_0x0368:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            com.google.android.gms.measurement.internal.t3 r1 = r1.f6529o
            long r1 = r1.a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ea
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            boolean r1 = r1.v(r10)
            if (r1 == 0) goto L_0x03ea
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.w3 r1 = r1.F()
            com.google.android.gms.measurement.internal.r3 r1 = r1.f6531q
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03ea
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r15 = 0
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            y3.e r1 = r1.e()
            long r17 = r1.currentTimeMillis()
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.L(r2, r3, r4, r5)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r4 = 0
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            y3.e r1 = r1.e()
            long r5 = r1.currentTimeMillis()
            r1 = r19
            r1.L(r2, r3, r4, r5)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            y3.e r1 = r1.e()
            long r5 = r1.currentTimeMillis()
            r1 = r19
            r1.L(r2, r3, r4, r5)
            goto L_0x03ec
        L_0x03ea:
            r13 = r4
            r8 = r5
        L_0x03ec:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0413
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.h8 r1 = r1.M()
            com.google.android.gms.measurement.internal.g8 r1 = r1.f6029d
            r2 = 1
            r1.b(r10, r2)
        L_0x0413:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0424:
            if (r3 >= r2) goto L_0x046f
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x046c
            com.google.android.gms.measurement.internal.n4 r5 = r7.f5994a
            r5.N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0444
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0467
        L_0x0444:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0455
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
        L_0x0451:
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0467
        L_0x0455:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0466
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            goto L_0x0451
        L_0x0466:
            r8 = 0
        L_0x0467:
            if (r8 == 0) goto L_0x046c
            r12.putParcelableArray(r4, r8)
        L_0x046c:
            int r3 = r3 + 1
            goto L_0x0424
        L_0x046f:
            r8 = 0
        L_0x0470:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04d9
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x0483
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x0487
        L_0x0483:
            r9 = r20
            r2 = r21
        L_0x0487:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x0496
            com.google.android.gms.measurement.internal.n4 r3 = r7.f5994a
            com.google.android.gms.measurement.internal.d9 r3 = r3.N()
            android.os.Bundle r1 = r3.u0(r1)
        L_0x0496:
            r12 = r1
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.v7 r1 = r1.L()
            r5 = r28
            r1.o(r15, r5)
            if (r16 != 0) goto L_0x04d6
            java.util.Set r1 = r7.f6043e
            java.util.Iterator r15 = r1.iterator()
        L_0x04b9:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04d6
            java.lang.Object r1 = r15.next()
            h4.r r1 = (h4.r) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04b9
        L_0x04d6:
            int r8 = r8 + 1
            goto L_0x0470
        L_0x04d9:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            r0.f()
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.v6 r0 = r0.K()
            r1 = 0
            com.google.android.gms.measurement.internal.o6 r0 = r0.t(r1)
            if (r0 == 0) goto L_0x0509
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0509
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.h8 r0 = r0.M()
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            y3.e r1 = r1.e()
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.f8 r0 = r0.f6030e
            r3 = 1
            r0.d(r3, r3, r1)
        L_0x0509:
            return
        L_0x050a:
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.v(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void w(r rVar) {
        i();
        s.k(rVar);
        if (!this.f6043e.add(rVar)) {
            this.f5994a.d().w().a("OnEventListener already registered");
        }
    }

    public final void x(long j10) {
        this.f6045g.set((Object) null);
        this.f5994a.b().z(new r5(this, j10));
    }

    /* access modifiers changed from: package-private */
    public final void y(long j10, boolean z10) {
        h();
        i();
        this.f5994a.d().q().a("Resetting analytics data (FE)");
        h8 M = this.f5994a.M();
        M.h();
        M.f6030e.a();
        boolean o10 = this.f5994a.o();
        w3 F = this.f5994a.F();
        F.f6519e.b(j10);
        if (!TextUtils.isEmpty(F.f5994a.F().f6534t.a())) {
            F.f6534t.b((String) null);
        }
        zzoh.zzc();
        g z11 = F.f5994a.z();
        x2 x2Var = y2.f6635l0;
        if (z11.B((String) null, x2Var)) {
            F.f6529o.b(0);
        }
        if (!F.f5994a.z().E()) {
            F.t(!o10);
        }
        F.f6535u.b((String) null);
        F.f6536v.b(0);
        F.f6537w.b((Bundle) null);
        if (z10) {
            this.f5994a.L().q();
        }
        zzoh.zzc();
        if (this.f5994a.z().B((String) null, x2Var)) {
            this.f5994a.M().f6029d.a();
        }
        this.f6053o = !o10;
    }

    /* access modifiers changed from: protected */
    public final void z(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f5994a.b().z(new p5(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }
}
