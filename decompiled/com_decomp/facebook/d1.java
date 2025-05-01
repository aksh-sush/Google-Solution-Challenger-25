package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import db.l;
import e2.r;
import e2.s0;
import e2.w;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p1.e0;

public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f4716a = new d1();

    /* renamed from: b  reason: collision with root package name */
    private static final String f4717b = d1.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f4718c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f4719d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final a f4720e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f  reason: collision with root package name */
    private static final a f4721f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g  reason: collision with root package name */
    private static final a f4722g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h  reason: collision with root package name */
    private static final a f4723h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i  reason: collision with root package name */
    private static final a f4724i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j  reason: collision with root package name */
    private static SharedPreferences f4725j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4726a;

        /* renamed from: b  reason: collision with root package name */
        private String f4727b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f4728c;

        /* renamed from: d  reason: collision with root package name */
        private long f4729d;

        public a(boolean z10, String str) {
            l.e(str, "key");
            this.f4726a = z10;
            this.f4727b = str;
        }

        public final boolean a() {
            return this.f4726a;
        }

        public final String b() {
            return this.f4727b;
        }

        public final long c() {
            return this.f4729d;
        }

        public final Boolean d() {
            return this.f4728c;
        }

        public final boolean e() {
            Boolean bool = this.f4728c;
            return bool == null ? this.f4726a : bool.booleanValue();
        }

        public final void f(long j10) {
            this.f4729d = j10;
        }

        public final void g(Boolean bool) {
            this.f4728c = bool;
        }
    }

    private d1() {
    }

    public static final boolean b() {
        f4716a.h();
        return f4722g.e();
    }

    public static final boolean c() {
        f4716a.h();
        return f4720e.e();
    }

    public static final boolean d() {
        f4716a.h();
        return f4721f.e();
    }

    public static final boolean e() {
        f4716a.h();
        return f4723h.e();
    }

    private final void f() {
        a aVar = f4723h;
        n(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
            aVar.g((Boolean) null);
            aVar.f(0);
            if (f4719d.compareAndSet(false, true)) {
                i0.t().execute(new c1(currentTimeMillis));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void g(long j10) {
        if (f4722g.e()) {
            w wVar = w.f9682a;
            r o10 = w.o(i0.m(), false);
            if (o10 != null && o10.b()) {
                e2.a e10 = e2.a.f9484f.e(i0.l());
                String h10 = (e10 == null || e10.h() == null) ? null : e10.h();
                if (h10 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", h10);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    m0 x10 = m0.f4893n.x((a) null, "app", (m0.b) null);
                    x10.G(bundle);
                    JSONObject c10 = x10.k().c();
                    if (c10 != null) {
                        a aVar = f4723h;
                        aVar.g(Boolean.valueOf(c10.optBoolean("auto_event_setup_enabled", false)));
                        aVar.f(j10);
                        f4716a.p(aVar);
                    }
                }
            }
        }
        f4719d.set(false);
    }

    private final void h() {
        if (i0.F() && f4718c.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = i0.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            l.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f4725j = sharedPreferences;
            i(f4721f, f4722g, f4720e);
            f();
            m();
            l();
        }
    }

    private final void i(a... aVarArr) {
        int length = aVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            a aVar = aVarArr[i10];
            i10++;
            if (aVar == f4723h) {
                f();
            } else if (aVar.d() == null) {
                n(aVar);
                if (aVar.d() == null) {
                    j(aVar);
                }
            } else {
                p(aVar);
            }
        }
    }

    private final void j(a aVar) {
        o();
        try {
            Context l10 = i0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.containsKey(aVar.b())) {
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            }
        } catch (PackageManager.NameNotFoundException e10) {
            s0 s0Var = s0.f9663a;
            s0.i0(f4717b, e10);
        }
    }

    public static final void k() {
        try {
            Context l10 = i0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                e0 e0Var = new e0(l10);
                Bundle bundle2 = new Bundle();
                if (!s0.U()) {
                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w(f4717b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                e0Var.d("fb_auto_applink", bundle2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void l() {
        int i10;
        int i11;
        if (f4718c.get() && i0.F()) {
            Context l10 = i0.l();
            int i12 = 0;
            int i13 = ((f4720e.e() ? 1 : 0) << false) | 0 | ((f4721f.e() ? 1 : 0) << true) | ((f4722g.e() ? 1 : 0) << true) | ((f4724i.e() ? 1 : 0) << true);
            SharedPreferences sharedPreferences = f4725j;
            if (sharedPreferences != null) {
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = f4725j;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                        try {
                            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                            l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                            if (applicationInfo.metaData != null) {
                                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                boolean[] zArr = {true, true, true, true};
                                int i15 = 0;
                                i11 = 0;
                                i10 = 0;
                                while (true) {
                                    int i16 = i15 + 1;
                                    try {
                                        i11 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                        i10 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                        if (i16 > 3) {
                                            break;
                                        }
                                        i15 = i16;
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i12 = i10;
                                        i10 = i12;
                                        i12 = i11;
                                        e0 e0Var = new e0(l10);
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("usage", i12);
                                        bundle.putInt("initial", i10);
                                        bundle.putInt("previous", i14);
                                        bundle.putInt("current", i13);
                                        e0Var.b(bundle);
                                    }
                                }
                                i12 = i11;
                                e0 e0Var2 = new e0(l10);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("usage", i12);
                                bundle2.putInt("initial", i10);
                                bundle2.putInt("previous", i14);
                                bundle2.putInt("current", i13);
                                e0Var2.b(bundle2);
                            }
                            i10 = 0;
                            e0 e0Var22 = new e0(l10);
                            Bundle bundle22 = new Bundle();
                            bundle22.putInt("usage", i12);
                            bundle22.putInt("initial", i10);
                            bundle22.putInt("previous", i14);
                            bundle22.putInt("current", i13);
                            e0Var22.b(bundle22);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i11 = 0;
                            i10 = i12;
                            i12 = i11;
                            e0 e0Var222 = new e0(l10);
                            Bundle bundle222 = new Bundle();
                            bundle222.putInt("usage", i12);
                            bundle222.putInt("initial", i10);
                            bundle222.putInt("previous", i14);
                            bundle222.putInt("current", i13);
                            e0Var222.b(bundle222);
                        }
                    } else {
                        l.s("userSettingPref");
                        throw null;
                    }
                }
            } else {
                l.s("userSettingPref");
                throw null;
            }
        }
    }

    private final void m() {
        try {
            Context l10 = i0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f4717b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f4717b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!b()) {
                    Log.w(f4717b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void n(a aVar) {
        String str = "";
        o();
        try {
            SharedPreferences sharedPreferences = f4725j;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(aVar.b(), str);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean(FirebaseAnalytics.Param.VALUE)));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                    return;
                }
                return;
            }
            l.s("userSettingPref");
            throw null;
        } catch (JSONException e10) {
            s0 s0Var = s0.f9663a;
            s0.i0(f4717b, e10);
        }
    }

    private final void o() {
        if (!f4718c.get()) {
            throw new j0("The UserSettingManager has not been initialized successfully");
        }
    }

    private final void p(a aVar) {
        o();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.VALUE, aVar.d());
            jSONObject.put("last_timestamp", aVar.c());
            SharedPreferences sharedPreferences = f4725j;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                l();
                return;
            }
            l.s("userSettingPref");
            throw null;
        } catch (Exception e10) {
            s0 s0Var = s0.f9663a;
            s0.i0(f4717b, e10);
        }
    }
}
