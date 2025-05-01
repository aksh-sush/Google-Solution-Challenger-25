package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.m0;
import com.facebook.v0;
import db.l;
import db.w;
import e2.d0;
import e2.j0;
import e2.n;
import e2.s0;
import e2.t0;
import g2.g;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import p1.a0;
import p1.o;
import sa.t;
import x1.h;
import z1.c;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f4776a = new i0();

    /* renamed from: b  reason: collision with root package name */
    private static final String f4777b = i0.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet f4778c = k0.c(u0.DEVELOPER_ERRORS);

    /* renamed from: d  reason: collision with root package name */
    private static Executor f4779d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f4780e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile String f4781f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile String f4782g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Boolean f4783h;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicLong f4784i = new AtomicLong(65536);

    /* renamed from: j  reason: collision with root package name */
    private static volatile boolean f4785j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f4786k;

    /* renamed from: l  reason: collision with root package name */
    private static d0 f4787l;

    /* renamed from: m  reason: collision with root package name */
    private static Context f4788m;

    /* renamed from: n  reason: collision with root package name */
    private static int f4789n = 64206;

    /* renamed from: o  reason: collision with root package name */
    private static final ReentrantLock f4790o = new ReentrantLock();

    /* renamed from: p  reason: collision with root package name */
    private static String f4791p = j0.a();

    /* renamed from: q  reason: collision with root package name */
    public static boolean f4792q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f4793r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f4794s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicBoolean f4795t = new AtomicBoolean(false);

    /* renamed from: u  reason: collision with root package name */
    private static volatile String f4796u = "instagram.com";

    /* renamed from: v  reason: collision with root package name */
    private static volatile String f4797v = "facebook.com";

    /* renamed from: w  reason: collision with root package name */
    private static a f4798w = new g0();

    /* renamed from: x  reason: collision with root package name */
    private static boolean f4799x;

    public interface a {
        m0 a(a aVar, String str, JSONObject jSONObject, m0.b bVar);
    }

    public interface b {
        void a();
    }

    private i0() {
    }

    public static final long A() {
        t0.l();
        return f4784i.get();
    }

    public static final String B() {
        return "16.2.0";
    }

    /* access modifiers changed from: private */
    public static final m0 C(a aVar, String str, JSONObject jSONObject, m0.b bVar) {
        return m0.f4893n.A(aVar, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f4785j;
    }

    public static final synchronized boolean E() {
        boolean z10;
        synchronized (i0.class) {
            z10 = f4799x;
        }
        return z10;
    }

    public static final boolean F() {
        return f4795t.get();
    }

    public static final boolean G() {
        return f4786k;
    }

    public static final boolean H(u0 u0Var) {
        boolean z10;
        l.e(u0Var, "behavior");
        HashSet hashSet = f4778c;
        synchronized (hashSet) {
            z10 = D() && hashSet.contains(u0Var);
        }
        return z10;
    }

    public static final void I(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                l.d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
                if (applicationInfo.metaData != null) {
                    if (f4780e == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            l.d(locale, "ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (p.t(lowerCase, "fb", false, 2, (Object) null)) {
                                str = str.substring(2);
                                l.d(str, "(this as java.lang.String).substring(startIndex)");
                            }
                            f4780e = str;
                        } else if (obj instanceof Number) {
                            throw new v("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f4781f == null) {
                        f4781f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f4782g == null) {
                        f4782g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f4789n == 64206) {
                        f4789n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f4783h == null) {
                        f4783h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private final void J(Context context, String str) {
        try {
            e2.a e10 = e2.a.f9484f.e(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String l10 = l.l(str, "ping");
            long j10 = sharedPreferences.getLong(l10, 0);
            h hVar = h.f16330a;
            JSONObject a10 = h.a(h.a.MOBILE_INSTALL_EVENT, e10, o.f14396b.b(context), z(context), context);
            w wVar = w.f9429a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            m0 a11 = f4798w.a((a) null, format, a10, (m0.b) null);
            if (j10 == 0 && a11.k().b() == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(l10, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e11) {
            throw new v("An error occurred while publishing install.", e11);
        } catch (Exception e12) {
            s0.i0("Facebook-publish", e12);
        }
    }

    public static final void K(Context context, String str) {
        l.e(context, "context");
        l.e(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            t().execute(new h0(applicationContext, str));
            n nVar = n.f9595a;
            if (n.g(n.b.OnDeviceEventProcessing) && c.d()) {
                c.g(str, "com.facebook.sdk.attributionTracking");
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void L(Context context, String str) {
        l.e(context, "$applicationContext");
        l.e(str, "$applicationId");
        f4776a.J(context, str);
    }

    public static final synchronized void M(Context context) {
        synchronized (i0.class) {
            l.e(context, "applicationContext");
            N(context, (b) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void N(android.content.Context r5, com.facebook.i0.b r6) {
        /*
            java.lang.Class<com.facebook.i0> r0 = com.facebook.i0.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            db.l.e(r5, r1)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.atomic.AtomicBoolean r1 = f4795t     // Catch:{ all -> 0x0107 }
            boolean r2 = r1.get()     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0018
            if (r6 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r6.a()     // Catch:{ all -> 0x0107 }
        L_0x0016:
            monitor-exit(r0)
            return
        L_0x0018:
            r2 = 0
            e2.t0.e(r5, r2)     // Catch:{ all -> 0x0107 }
            e2.t0.f(r5, r2)     // Catch:{ all -> 0x0107 }
            android.content.Context r3 = r5.getApplicationContext()     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = "applicationContext.applicationContext"
            db.l.d(r3, r4)     // Catch:{ all -> 0x0107 }
            f4788m = r3     // Catch:{ all -> 0x0107 }
            p1.o$a r3 = p1.o.f14396b     // Catch:{ all -> 0x0107 }
            r3.b(r5)     // Catch:{ all -> 0x0107 }
            android.content.Context r5 = f4788m     // Catch:{ all -> 0x0107 }
            r3 = 0
            if (r5 == 0) goto L_0x0101
            I(r5)     // Catch:{ all -> 0x0107 }
            java.lang.String r5 = f4780e     // Catch:{ all -> 0x0107 }
            r4 = 1
            if (r5 == 0) goto L_0x0045
            int r5 = r5.length()     // Catch:{ all -> 0x0107 }
            if (r5 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0046
        L_0x0045:
            r5 = 1
        L_0x0046:
            if (r5 != 0) goto L_0x00f9
            java.lang.String r5 = f4782g     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0052
            int r5 = r5.length()     // Catch:{ all -> 0x0107 }
            if (r5 != 0) goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            if (r2 != 0) goto L_0x00f1
            r1.set(r4)     // Catch:{ all -> 0x0107 }
            boolean r5 = o()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0061
            j()     // Catch:{ all -> 0x0107 }
        L_0x0061:
            android.content.Context r5 = f4788m     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00eb
            boolean r5 = r5 instanceof android.app.Application     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0083
            boolean r5 = com.facebook.d1.d()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0083
            x1.f r5 = x1.f.f16317a     // Catch:{ all -> 0x0107 }
            android.content.Context r5 = f4788m     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x007d
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = f4780e     // Catch:{ all -> 0x0107 }
            x1.f.x(r5, r1)     // Catch:{ all -> 0x0107 }
            goto L_0x0083
        L_0x007d:
            java.lang.String r5 = "applicationContext"
            db.l.s(r5)     // Catch:{ all -> 0x0107 }
            throw r3     // Catch:{ all -> 0x0107 }
        L_0x0083:
            e2.w.g()     // Catch:{ all -> 0x0107 }
            e2.g0.x()     // Catch:{ all -> 0x0107 }
            e2.b$a r5 = e2.b.f9499b     // Catch:{ all -> 0x0107 }
            android.content.Context r1 = f4788m     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00e5
            r5.a(r1)     // Catch:{ all -> 0x0107 }
            e2.d0 r5 = new e2.d0     // Catch:{ all -> 0x0107 }
            com.facebook.z r1 = new com.facebook.z     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            r5.<init>(r1)     // Catch:{ all -> 0x0107 }
            f4787l = r5     // Catch:{ all -> 0x0107 }
            e2.n r5 = e2.n.f9595a     // Catch:{ all -> 0x0107 }
            e2.n$b r5 = e2.n.b.Instrument     // Catch:{ all -> 0x0107 }
            com.facebook.a0 r1 = new com.facebook.a0     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            e2.n.a(r5, r1)     // Catch:{ all -> 0x0107 }
            e2.n$b r5 = e2.n.b.AppEvents     // Catch:{ all -> 0x0107 }
            com.facebook.b0 r1 = new com.facebook.b0     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            e2.n.a(r5, r1)     // Catch:{ all -> 0x0107 }
            e2.n$b r5 = e2.n.b.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x0107 }
            com.facebook.c0 r1 = new com.facebook.c0     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            e2.n.a(r5, r1)     // Catch:{ all -> 0x0107 }
            e2.n$b r5 = e2.n.b.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x0107 }
            com.facebook.d0 r1 = new com.facebook.d0     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            e2.n.a(r5, r1)     // Catch:{ all -> 0x0107 }
            e2.n$b r5 = e2.n.b.BypassAppSwitch     // Catch:{ all -> 0x0107 }
            com.facebook.e0 r1 = new com.facebook.e0     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            e2.n.a(r5, r1)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0107 }
            com.facebook.f0 r1 = new com.facebook.f0     // Catch:{ all -> 0x0107 }
            r1.<init>(r6)     // Catch:{ all -> 0x0107 }
            r5.<init>(r1)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.Executor r6 = t()     // Catch:{ all -> 0x0107 }
            r6.execute(r5)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)
            return
        L_0x00e5:
            java.lang.String r5 = "applicationContext"
            db.l.s(r5)     // Catch:{ all -> 0x0107 }
            throw r3     // Catch:{ all -> 0x0107 }
        L_0x00eb:
            java.lang.String r5 = "applicationContext"
            db.l.s(r5)     // Catch:{ all -> 0x0107 }
            throw r3     // Catch:{ all -> 0x0107 }
        L_0x00f1:
            com.facebook.v r5 = new com.facebook.v     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0107 }
            throw r5     // Catch:{ all -> 0x0107 }
        L_0x00f9:
            com.facebook.v r5 = new com.facebook.v     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0107 }
            throw r5     // Catch:{ all -> 0x0107 }
        L_0x0101:
            java.lang.String r5 = "applicationContext"
            db.l.s(r5)     // Catch:{ all -> 0x0107 }
            throw r3     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.i0.N(android.content.Context, com.facebook.i0$b):void");
    }

    /* access modifiers changed from: private */
    public static final File O() {
        Context context = f4788m;
        if (context != null) {
            return context.getCacheDir();
        }
        l.s("applicationContext");
        throw null;
    }

    /* access modifiers changed from: private */
    public static final void P(boolean z10) {
        if (z10) {
            g.d();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q(boolean z10) {
        if (z10) {
            a0.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void R(boolean z10) {
        if (z10) {
            f4792q = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void S(boolean z10) {
        if (z10) {
            f4793r = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void T(boolean z10) {
        if (z10) {
            f4794s = true;
        }
    }

    /* access modifiers changed from: private */
    public static final Void U(b bVar) {
        g.f4738f.e().j();
        x0.f5001d.a().d();
        if (a.f4683p.g()) {
            v0.b bVar2 = v0.f4988l;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        o.a aVar = o.f14396b;
        aVar.e(l(), f4780e);
        d1.k();
        Context applicationContext = l().getApplicationContext();
        l.d(applicationContext, "getApplicationContext().applicationContext");
        aVar.f(applicationContext).a();
        return null;
    }

    public static final void j() {
        f4799x = true;
    }

    public static final boolean k() {
        return d1.b();
    }

    public static final Context l() {
        t0.l();
        Context context = f4788m;
        if (context != null) {
            return context;
        }
        l.s("applicationContext");
        throw null;
    }

    public static final String m() {
        t0.l();
        String str = f4780e;
        if (str != null) {
            return str;
        }
        throw new v("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        t0.l();
        return f4781f;
    }

    public static final boolean o() {
        return d1.c();
    }

    public static final boolean p() {
        return d1.d();
    }

    public static final int q() {
        t0.l();
        return f4789n;
    }

    public static final String r() {
        t0.l();
        String str = f4782g;
        if (str != null) {
            return str;
        }
        throw new v("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return d1.e();
    }

    /* JADX INFO: finally extract failed */
    public static final Executor t() {
        ReentrantLock reentrantLock = f4790o;
        reentrantLock.lock();
        try {
            if (f4779d == null) {
                f4779d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            t tVar = t.f15300a;
            reentrantLock.unlock();
            Executor executor = f4779d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String u() {
        return f4797v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        s0 s0Var = s0.f9663a;
        String str = f4777b;
        w wVar = w.f9429a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f4791p}, 1));
        l.d(format, "java.lang.String.format(format, *args)");
        s0.j0(str, format);
        return f4791p;
    }

    public static final String x() {
        a e10 = a.f4683p.e();
        return s0.E(e10 != null ? e10.i() : null);
    }

    public static final String y() {
        return f4796u;
    }

    public static final boolean z(Context context) {
        l.e(context, "context");
        t0.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
