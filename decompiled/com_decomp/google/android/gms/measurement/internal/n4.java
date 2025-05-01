package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import h4.a;
import h4.k;
import h4.t;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import y3.e;
import y3.h;

public final class n4 implements i5 {
    private static volatile n4 H;
    private volatile Boolean A;
    protected Boolean B;
    protected Boolean C;
    private volatile boolean D;
    private int E;
    private final AtomicInteger F = new AtomicInteger(0);
    final long G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6233a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6234b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6235c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6236d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6237e;

    /* renamed from: f  reason: collision with root package name */
    private final b f6238f;

    /* renamed from: g  reason: collision with root package name */
    private final g f6239g;

    /* renamed from: h  reason: collision with root package name */
    private final w3 f6240h;

    /* renamed from: i  reason: collision with root package name */
    private final j3 f6241i;

    /* renamed from: j  reason: collision with root package name */
    private final l4 f6242j;

    /* renamed from: k  reason: collision with root package name */
    private final h8 f6243k;

    /* renamed from: l  reason: collision with root package name */
    private final d9 f6244l;

    /* renamed from: m  reason: collision with root package name */
    private final e3 f6245m;

    /* renamed from: n  reason: collision with root package name */
    private final e f6246n;

    /* renamed from: o  reason: collision with root package name */
    private final v6 f6247o;

    /* renamed from: p  reason: collision with root package name */
    private final i6 f6248p;

    /* renamed from: q  reason: collision with root package name */
    private final c2 f6249q;

    /* renamed from: r  reason: collision with root package name */
    private final l6 f6250r;

    /* renamed from: s  reason: collision with root package name */
    private final String f6251s;

    /* renamed from: t  reason: collision with root package name */
    private d3 f6252t;

    /* renamed from: u  reason: collision with root package name */
    private v7 f6253u;

    /* renamed from: v  reason: collision with root package name */
    private n f6254v;

    /* renamed from: w  reason: collision with root package name */
    private b3 f6255w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6256x = false;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f6257y;

    /* renamed from: z  reason: collision with root package name */
    private long f6258z;

    n4(j5 j5Var) {
        String str;
        h3 h3Var;
        Bundle bundle;
        boolean z10 = false;
        s.k(j5Var);
        b bVar = new b(j5Var.f6110a);
        this.f6238f = bVar;
        w2.f6515a = bVar;
        Context context = j5Var.f6110a;
        this.f6233a = context;
        this.f6234b = j5Var.f6111b;
        this.f6235c = j5Var.f6112c;
        this.f6236d = j5Var.f6113d;
        this.f6237e = j5Var.f6117h;
        this.A = j5Var.f6114e;
        this.f6251s = j5Var.f6119j;
        this.D = true;
        zzcl zzcl = j5Var.f6116g;
        if (!(zzcl == null || (bundle = zzcl.zzg) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzcl.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzhu.zzd(context);
        e c10 = h.c();
        this.f6246n = c10;
        Long l10 = j5Var.f6118i;
        this.G = l10 != null ? l10.longValue() : c10.currentTimeMillis();
        this.f6239g = new g(this);
        w3 w3Var = new w3(this);
        w3Var.l();
        this.f6240h = w3Var;
        j3 j3Var = new j3(this);
        j3Var.l();
        this.f6241i = j3Var;
        d9 d9Var = new d9(this);
        d9Var.l();
        this.f6244l = d9Var;
        e3 e3Var = new e3(this);
        e3Var.l();
        this.f6245m = e3Var;
        this.f6249q = new c2(this);
        v6 v6Var = new v6(this);
        v6Var.j();
        this.f6247o = v6Var;
        i6 i6Var = new i6(this);
        i6Var.j();
        this.f6248p = i6Var;
        h8 h8Var = new h8(this);
        h8Var.j();
        this.f6243k = h8Var;
        l6 l6Var = new l6(this);
        l6Var.l();
        this.f6250r = l6Var;
        l4 l4Var = new l4(this);
        l4Var.l();
        this.f6242j = l4Var;
        zzcl zzcl2 = j5Var.f6116g;
        z10 = (zzcl2 == null || zzcl2.zzb == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            i6 I = I();
            if (I.f5994a.f6233a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f5994a.f6233a.getApplicationContext();
                if (I.f6041c == null) {
                    I.f6041c = new h6(I, (t) null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(I.f6041c);
                    application.registerActivityLifecycleCallbacks(I.f6041c);
                    h3Var = I.f5994a.d().v();
                    str = "Registered activity lifecycle callback";
                }
            }
            l4Var.z(new m4(this, j5Var));
        }
        h3Var = d().w();
        str = "Application context is not an Application";
        h3Var.a(str);
        l4Var.z(new m4(this, j5Var));
    }

    public static n4 H(Context context, zzcl zzcl, Long l10) {
        Bundle bundle;
        if (zzcl != null && (zzcl.zze == null || zzcl.zzf == null)) {
            zzcl = new zzcl(zzcl.zza, zzcl.zzb, zzcl.zzc, zzcl.zzd, (String) null, (String) null, zzcl.zzg, (String) null);
        }
        s.k(context);
        s.k(context.getApplicationContext());
        if (H == null) {
            synchronized (n4.class) {
                if (H == null) {
                    H = new n4(new j5(context, zzcl, l10));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            s.k(H);
            H.A = Boolean.valueOf(zzcl.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        s.k(H);
        return H;
    }

    static /* bridge */ /* synthetic */ void a(n4 n4Var, j5 j5Var) {
        n4Var.b().h();
        n4Var.f6239g.w();
        n nVar = new n(n4Var);
        nVar.l();
        n4Var.f6254v = nVar;
        b3 b3Var = new b3(n4Var, j5Var.f6115f);
        b3Var.j();
        n4Var.f6255w = b3Var;
        d3 d3Var = new d3(n4Var);
        d3Var.j();
        n4Var.f6252t = d3Var;
        v7 v7Var = new v7(n4Var);
        v7Var.j();
        n4Var.f6253u = v7Var;
        n4Var.f6244l.m();
        n4Var.f6240h.m();
        n4Var.f6255w.k();
        h3 u10 = n4Var.d().u();
        n4Var.f6239g.q();
        u10.b("App measurement initialized, version", 42097L);
        n4Var.d().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s10 = b3Var.s();
        if (TextUtils.isEmpty(n4Var.f6234b)) {
            if (n4Var.N().S(s10)) {
                n4Var.d().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                h3 u11 = n4Var.d().u();
                String valueOf = String.valueOf(s10);
                u11.a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        n4Var.d().q().a("Debug-level message logging enabled");
        if (n4Var.E != n4Var.F.get()) {
            n4Var.d().r().c("Not all components initialized", Integer.valueOf(n4Var.E), Integer.valueOf(n4Var.F.get()));
        }
        n4Var.f6256x = true;
    }

    static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void u(g5 g5Var) {
        if (g5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void v(z3 z3Var) {
        if (z3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!z3Var.m()) {
            String valueOf = String.valueOf(z3Var.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
            sb2.append("Component not initialized: ");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static final void w(h5 h5Var) {
        if (h5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!h5Var.n()) {
            String valueOf = String.valueOf(h5Var.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
            sb2.append("Component not initialized: ");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final n A() {
        w(this.f6254v);
        return this.f6254v;
    }

    public final b3 B() {
        v(this.f6255w);
        return this.f6255w;
    }

    public final d3 C() {
        v(this.f6252t);
        return this.f6252t;
    }

    public final e3 D() {
        u(this.f6245m);
        return this.f6245m;
    }

    public final j3 E() {
        j3 j3Var = this.f6241i;
        if (j3Var == null || !j3Var.n()) {
            return null;
        }
        return this.f6241i;
    }

    public final w3 F() {
        u(this.f6240h);
        return this.f6240h;
    }

    /* access modifiers changed from: package-private */
    public final l4 G() {
        return this.f6242j;
    }

    public final i6 I() {
        v(this.f6248p);
        return this.f6248p;
    }

    public final l6 J() {
        w(this.f6250r);
        return this.f6250r;
    }

    public final v6 K() {
        v(this.f6247o);
        return this.f6247o;
    }

    public final v7 L() {
        v(this.f6253u);
        return this.f6253u;
    }

    public final h8 M() {
        v(this.f6243k);
        return this.f6243k;
    }

    public final d9 N() {
        u(this.f6244l);
        return this.f6244l;
    }

    public final String O() {
        return this.f6234b;
    }

    public final String P() {
        return this.f6235c;
    }

    public final String Q() {
        return this.f6236d;
    }

    public final String R() {
        return this.f6251s;
    }

    public final l4 b() {
        w(this.f6242j);
        return this.f6242j;
    }

    public final Context c() {
        return this.f6233a;
    }

    public final j3 d() {
        w(this.f6241i);
        return this.f6241i;
    }

    public final e e() {
        return this.f6246n;
    }

    public final b f() {
        return this.f6238f;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.F.incrementAndGet();
    }

    public final /* synthetic */ void h(String str, int i10, Throwable th, byte[] bArr, Map map) {
        if (!(i10 == 200 || i10 == 204)) {
            if (i10 == 304) {
                i10 = 304;
            }
            d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            F().f6532r.a(true);
            if (bArr == null || bArr.length == 0) {
                d().q().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    d().q().a("Deferred Deep Link is empty.");
                    return;
                }
                d9 N = N();
                n4 n4Var = N.f5994a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f5994a.f6233a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f6248p.t("auto", "_cmp", bundle);
                        d9 N2 = N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f5994a.f6233a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f5994a.f6233a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                N2.f5994a.d().r().b("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                d().w().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e11) {
                d().r().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.E++;
    }

    public final void j() {
        b().h();
        w(J());
        String s10 = B().s();
        Pair p10 = F().p(s10);
        if (!this.f6239g.A() || ((Boolean) p10.second).booleanValue() || TextUtils.isEmpty((CharSequence) p10.first)) {
            d().q().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        l6 J = J();
        J.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f5994a.f6233a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            d().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        d9 N = N();
        B().f5994a.f6239g.q();
        URL r10 = N.r(42097, s10, (String) p10.first, F().f6533s.a() - 1);
        if (r10 != null) {
            l6 J2 = J();
            k kVar = new k(this);
            J2.h();
            J2.k();
            s.k(r10);
            s.k(kVar);
            J2.f5994a.b().y(new k6(J2, s10, r10, (byte[]) null, (Map) null, kVar, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void l(boolean z10) {
        b().h();
        this.D = z10;
    }

    /* access modifiers changed from: protected */
    public final void m(zzcl zzcl) {
        a aVar;
        b().h();
        a q10 = F().q();
        w3 F2 = F();
        n4 n4Var = F2.f5994a;
        F2.h();
        int i10 = 100;
        int i11 = F2.o().getInt("consent_source", 100);
        g gVar = this.f6239g;
        n4 n4Var2 = gVar.f5994a;
        Boolean t10 = gVar.t("google_analytics_default_allow_ad_storage");
        g gVar2 = this.f6239g;
        n4 n4Var3 = gVar2.f5994a;
        Boolean t11 = gVar2.t("google_analytics_default_allow_analytics_storage");
        if (!(t10 == null && t11 == null) && F().w(-10)) {
            aVar = new a(t10, t11);
            i10 = -10;
        } else {
            if (TextUtils.isEmpty(B().u()) || !(i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                zzob.zzc();
                if ((!this.f6239g.B((String) null, y2.f6657w0) || TextUtils.isEmpty(B().u())) && zzcl != null && zzcl.zzg != null && F().w(30)) {
                    aVar = a.a(zzcl.zzg);
                    if (!aVar.equals(a.f10950c)) {
                        i10 = 30;
                    }
                }
            } else {
                I().F(a.f10950c, -10, this.G);
            }
            aVar = null;
        }
        if (aVar != null) {
            I().F(aVar, i10, this.G);
            q10 = aVar;
        }
        I().I(q10);
        if (F().f6519e.a() == 0) {
            d().v().b("Persisting first open", Long.valueOf(this.G));
            F().f6519e.b(this.G);
        }
        I().f6052n.c();
        if (r()) {
            if (!TextUtils.isEmpty(B().u()) || !TextUtils.isEmpty(B().r())) {
                d9 N = N();
                String u10 = B().u();
                w3 F3 = F();
                F3.h();
                String string = F3.o().getString("gmp_app_id", (String) null);
                String r10 = B().r();
                w3 F4 = F();
                F4.h();
                if (N.b0(u10, string, r10, F4.o().getString("admob_app_id", (String) null))) {
                    d().u().a("Rechecking which service to use due to a GMP App Id change");
                    w3 F5 = F();
                    F5.h();
                    Boolean r11 = F5.r();
                    SharedPreferences.Editor edit = F5.o().edit();
                    edit.clear();
                    edit.apply();
                    if (r11 != null) {
                        F5.s(r11);
                    }
                    C().q();
                    this.f6253u.Q();
                    this.f6253u.P();
                    F().f6519e.b(this.G);
                    F().f6521g.b((String) null);
                }
                w3 F6 = F();
                String u11 = B().u();
                F6.h();
                SharedPreferences.Editor edit2 = F6.o().edit();
                edit2.putString("gmp_app_id", u11);
                edit2.apply();
                w3 F7 = F();
                String r12 = B().r();
                F7.h();
                SharedPreferences.Editor edit3 = F7.o().edit();
                edit3.putString("admob_app_id", r12);
                edit3.apply();
            }
            if (!F().q().k()) {
                F().f6521g.b((String) null);
            }
            I().B(F().f6521g.a());
            zzny.zzc();
            if (this.f6239g.B((String) null, y2.f6633k0)) {
                try {
                    N().f5994a.f6233a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().f6534t.a())) {
                        d().w().a("Remote config removed with active feature rollouts");
                        F().f6534t.b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().u()) || !TextUtils.isEmpty(B().r())) {
                boolean o10 = o();
                if (!F().u() && !this.f6239g.E()) {
                    F().t(!o10);
                }
                if (o10) {
                    I().d0();
                }
                M().f6029d.a();
                L().S(new AtomicReference());
                L().v(F().f6537w.a());
            }
        } else if (o()) {
            if (!N().R("android.permission.INTERNET")) {
                d().r().a("App is missing INTERNET permission");
            }
            if (!N().R("android.permission.ACCESS_NETWORK_STATE")) {
                d().r().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!a4.e.a(this.f6233a).f() && !this.f6239g.G()) {
                if (!d9.X(this.f6233a)) {
                    d().r().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!d9.Y(this.f6233a, false)) {
                    d().r().a("AppMeasurementService not registered/enabled");
                }
            }
            d().r().a("Uploading is not possible. App measurement disabled");
        }
        F().f6528n.a(true);
    }

    public final boolean n() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean o() {
        return x() == 0;
    }

    public final boolean p() {
        b().h();
        return this.D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f6234b);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        if (this.f6256x) {
            b().h();
            Boolean bool = this.f6257y;
            if (bool == null || this.f6258z == 0 || (!bool.booleanValue() && Math.abs(this.f6246n.a() - this.f6258z) > 1000)) {
                this.f6258z = this.f6246n.a();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(N().R("android.permission.INTERNET") && N().R("android.permission.ACCESS_NETWORK_STATE") && (a4.e.a(this.f6233a).f() || this.f6239g.G() || (d9.X(this.f6233a) && d9.Y(this.f6233a, false))));
                this.f6257y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!N().K(B().u(), B().r(), B().t()) && TextUtils.isEmpty(B().r())) {
                        z10 = false;
                    }
                    this.f6257y = Boolean.valueOf(z10);
                }
            }
            return this.f6257y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean s() {
        return this.f6237e;
    }

    public final int x() {
        b().h();
        if (this.f6239g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        b().h();
        if (!this.D) {
            return 8;
        }
        Boolean r10 = F().r();
        if (r10 != null) {
            return r10.booleanValue() ? 0 : 3;
        }
        g gVar = this.f6239g;
        b bVar = gVar.f5994a.f6238f;
        Boolean t10 = gVar.t("firebase_analytics_collection_enabled");
        if (t10 != null) {
            return t10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f6239g.B((String) null, y2.U) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final c2 y() {
        c2 c2Var = this.f6249q;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final g z() {
        return this.f6239g;
    }
}
