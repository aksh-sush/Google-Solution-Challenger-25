package com.google.android.gms.measurement.internal;

import a4.e;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.lang.reflect.InvocationTargetException;
import y3.o;

public final class g extends g5 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f5980b;

    /* renamed from: c  reason: collision with root package name */
    private f f5981c = e.f5934a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f5982d;

    g(n4 n4Var) {
        super(n4Var);
    }

    public static final long I() {
        return ((Long) y2.f6620e.a((Object) null)).longValue();
    }

    public static final long i() {
        return ((Long) y2.E.a((Object) null)).longValue();
    }

    private final String j(String str, String str2) {
        h3 h3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            s.k(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            h3Var = this.f5994a.d().r();
            str3 = "Could not find SystemProperties class";
            h3Var.b(str3, e);
            return "";
        } catch (NoSuchMethodException e11) {
            e = e11;
            h3Var = this.f5994a.d().r();
            str3 = "Could not find SystemProperties.get() method";
            h3Var.b(str3, e);
            return "";
        } catch (IllegalAccessException e12) {
            e = e12;
            h3Var = this.f5994a.d().r();
            str3 = "Could not access SystemProperties.get()";
            h3Var.b(str3, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            h3Var = this.f5994a.d().r();
            str3 = "SystemProperties.get() threw an exception";
            h3Var.b(str3, e);
            return "";
        }
    }

    public final boolean A() {
        Boolean t10 = t("google_analytics_adid_collection_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean B(String str, x2 x2Var) {
        Object a10;
        if (str != null) {
            String a11 = this.f5981c.a(str, x2Var.b());
            if (!TextUtils.isEmpty(a11)) {
                a10 = x2Var.a(Boolean.valueOf(Boolean.parseBoolean(a11)));
                return ((Boolean) a10).booleanValue();
            }
        }
        a10 = x2Var.a((Object) null);
        return ((Boolean) a10).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.f5981c.a(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean t10 = t("google_analytics_automatic_screen_reporting_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean E() {
        this.f5994a.f();
        Boolean t10 = t("firebase_analytics_collection_deactivated");
        return t10 != null && t10.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.f5981c.a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final boolean G() {
        if (this.f5980b == null) {
            Boolean t10 = t("app_measurement_lite");
            this.f5980b = t10;
            if (t10 == null) {
                this.f5980b = Boolean.FALSE;
            }
        }
        return this.f5980b.booleanValue() || !this.f5994a.s();
    }

    public final boolean H() {
        if (this.f5982d == null) {
            synchronized (this) {
                if (this.f5982d == null) {
                    ApplicationInfo applicationInfo = this.f5994a.c().getApplicationInfo();
                    String a10 = o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(a10)) {
                            z10 = true;
                        }
                        this.f5982d = Boolean.valueOf(z10);
                    }
                    if (this.f5982d == null) {
                        this.f5982d = Boolean.TRUE;
                        this.f5994a.d().r().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f5982d.booleanValue();
    }

    public final double k(String str, x2 x2Var) {
        if (str != null) {
            String a10 = this.f5981c.a(str, x2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Double) x2Var.a(Double.valueOf(Double.parseDouble(a10)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) x2Var.a((Object) null)).doubleValue();
    }

    /* access modifiers changed from: package-private */
    public final int l(String str) {
        return p(str, y2.I, 500, 2000);
    }

    public final int m() {
        d9 N = this.f5994a.N();
        Boolean J = N.f5994a.L().J();
        if (N.o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int n(String str) {
        return p(str, y2.J, 25, 100);
    }

    public final int o(String str, x2 x2Var) {
        if (str != null) {
            String a10 = this.f5981c.a(str, x2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Integer) x2Var.a(Integer.valueOf(Integer.parseInt(a10)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) x2Var.a((Object) null)).intValue();
    }

    public final int p(String str, x2 x2Var, int i10, int i11) {
        return Math.max(Math.min(o(str, x2Var), i11), i10);
    }

    public final long q() {
        this.f5994a.f();
        return 42097;
    }

    public final long r(String str, x2 x2Var) {
        if (str != null) {
            String a10 = this.f5981c.a(str, x2Var.b());
            if (!TextUtils.isEmpty(a10)) {
                try {
                    return ((Long) x2Var.a(Long.valueOf(Long.parseLong(a10)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) x2Var.a((Object) null)).longValue();
    }

    /* access modifiers changed from: package-private */
    public final Bundle s() {
        try {
            if (this.f5994a.c().getPackageManager() == null) {
                this.f5994a.d().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = e.a(this.f5994a.c()).c(this.f5994a.c().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            this.f5994a.d().r().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f5994a.d().r().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean t(String str) {
        s.g(str);
        Bundle s10 = s();
        if (s10 == null) {
            this.f5994a.d().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s10.getBoolean(str));
        }
    }

    public final String u() {
        return j("debug.firebase.analytics.app", "");
    }

    public final String v() {
        return j("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    public final String w() {
        this.f5994a.f();
        return "FA";
    }

    public final String x(String str, x2 x2Var) {
        return (String) x2Var.a(str == null ? null : this.f5981c.a(str, x2Var.b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.s.g(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.n4 r4 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.c()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final void z(f fVar) {
        this.f5981c = fVar;
    }
}
