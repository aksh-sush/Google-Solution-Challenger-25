package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.a;
import com.facebook.m0;
import com.google.firebase.messaging.Constants;
import db.l;
import e2.s0;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4738f = new a((db.g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static g f4739g;

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f4740a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4741b;

    /* renamed from: c  reason: collision with root package name */
    private a f4742c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f4743d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private Date f4744e = new Date(0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final m0 c(a aVar, m0.b bVar) {
            e f10 = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f10.b());
            bundle.putString("client_id", aVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            m0 x10 = m0.f4893n.x(aVar, f10.a(), bVar);
            x10.G(bundle);
            x10.F(s0.GET);
            return x10;
        }

        /* access modifiers changed from: private */
        public final m0 d(a aVar, m0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            m0 x10 = m0.f4893n.x(aVar, "me/permissions", bVar);
            x10.G(bundle);
            x10.F(s0.GET);
            return x10;
        }

        private final e f(a aVar) {
            String i10 = aVar.i();
            if (i10 == null) {
                i10 = "facebook";
            }
            return l.a(i10, "instagram") ? new c() : new b();
        }

        public final g e() {
            g e10;
            g e11 = g.f4739g;
            if (e11 != null) {
                return e11;
            }
            synchronized (this) {
                e10 = g.f4739g;
                if (e10 == null) {
                    p0.a b10 = p0.a.b(i0.l());
                    l.d(b10, "getInstance(applicationContext)");
                    g gVar = new g(b10, new b());
                    g.f4739g = gVar;
                    e10 = gVar;
                }
            }
            return e10;
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f4745a = "oauth/access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f4746b = "fb_extend_sso_token";

        public String a() {
            return this.f4745a;
        }

        public String b() {
            return this.f4746b;
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f4747a = "refresh_access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f4748b = "ig_refresh_token";

        public String a() {
            return this.f4747a;
        }

        public String b() {
            return this.f4748b;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f4749a;

        /* renamed from: b  reason: collision with root package name */
        private int f4750b;

        /* renamed from: c  reason: collision with root package name */
        private int f4751c;

        /* renamed from: d  reason: collision with root package name */
        private Long f4752d;

        /* renamed from: e  reason: collision with root package name */
        private String f4753e;

        public final String a() {
            return this.f4749a;
        }

        public final Long b() {
            return this.f4752d;
        }

        public final int c() {
            return this.f4750b;
        }

        public final int d() {
            return this.f4751c;
        }

        public final String e() {
            return this.f4753e;
        }

        public final void f(String str) {
            this.f4749a = str;
        }

        public final void g(Long l10) {
            this.f4752d = l10;
        }

        public final void h(int i10) {
            this.f4750b = i10;
        }

        public final void i(int i10) {
            this.f4751c = i10;
        }

        public final void j(String str) {
            this.f4753e = str;
        }
    }

    public interface e {
        String a();

        String b();
    }

    public g(p0.a aVar, b bVar) {
        l.e(aVar, "localBroadcastManager");
        l.e(bVar, "accessTokenCache");
        this.f4740a = aVar;
        this.f4741b = bVar;
    }

    /* access modifiers changed from: private */
    public static final void l(g gVar, a.C0083a aVar) {
        l.e(gVar, "this$0");
        gVar.m(aVar);
    }

    private final void m(a.C0083a aVar) {
        a i10 = i();
        if (i10 == null) {
            if (aVar != null) {
                aVar.a(new v("No current access token to refresh"));
            }
        } else if (this.f4743d.compareAndSet(false, true)) {
            this.f4744e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            a aVar2 = f4738f;
            q0 q0Var = new q0(aVar2.d(i10, new d(atomicBoolean, hashSet, hashSet2, hashSet3)), aVar2.c(i10, new e(dVar)));
            q0Var.e(new f(dVar, i10, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this));
            q0Var.j();
        } else if (aVar != null) {
            aVar.a(new v("Refresh already in progress"));
        }
    }

    /* access modifiers changed from: private */
    public static final void n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, r0 r0Var) {
        JSONArray optJSONArray;
        l.e(atomicBoolean, "$permissionsCallSucceeded");
        l.e(set, "$permissions");
        l.e(set2, "$declinedPermissions");
        l.e(set3, "$expiredPermissions");
        l.e(r0Var, "response");
        JSONObject d10 = r0Var.d();
        if (d10 != null && (optJSONArray = d10.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) != null) {
            atomicBoolean.set(true);
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        if (!s0.c0(optString) && !s0.c0(optString2)) {
                            l.d(optString2, "status");
                            Locale locale = Locale.US;
                            l.d(locale, "US");
                            String lowerCase = optString2.toLowerCase(locale);
                            l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            l.d(lowerCase, "status");
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        set2.add(optString);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    set.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                set3.add(optString);
                            }
                            Log.w("AccessTokenManager", l.l("Unexpected status: ", lowerCase));
                        }
                    }
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void o(d dVar, r0 r0Var) {
        l.e(dVar, "$refreshResult");
        l.e(r0Var, "response");
        JSONObject d10 = r0Var.d();
        if (d10 != null) {
            dVar.f(d10.optString("access_token"));
            dVar.h(d10.optInt("expires_at"));
            dVar.i(d10.optInt("expires_in"));
            dVar.g(Long.valueOf(d10.optLong("data_access_expiration_time")));
            dVar.j(d10.optString("graph_domain", (String) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void p(d dVar, a aVar, a.C0083a aVar2, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, g gVar, q0 q0Var) {
        a aVar3;
        a.C0083a aVar4 = aVar2;
        g gVar2 = gVar;
        l.e(dVar, "$refreshResult");
        l.e(atomicBoolean, "$permissionsCallSucceeded");
        Set set4 = set;
        l.e(set4, "$permissions");
        Set set5 = set2;
        l.e(set5, "$declinedPermissions");
        Set set6 = set3;
        l.e(set6, "$expiredPermissions");
        l.e(gVar2, "this$0");
        l.e(q0Var, "it");
        String a10 = dVar.a();
        int c10 = dVar.c();
        Long b10 = dVar.b();
        String e10 = dVar.e();
        try {
            a aVar5 = f4738f;
            if (aVar5.e().i() != null) {
                a i10 = aVar5.e().i();
                if ((i10 == null ? null : i10.n()) == aVar.n()) {
                    if (!atomicBoolean.get() && a10 == null && c10 == 0) {
                        if (aVar4 != null) {
                            aVar4.a(new v("Failed to refresh access token"));
                        }
                        gVar2.f4743d.set(false);
                        return;
                    }
                    Date g10 = aVar.g();
                    if (dVar.c() != 0) {
                        g10 = new Date(((long) dVar.c()) * 1000);
                    } else if (dVar.d() != 0) {
                        g10 = new Date((((long) dVar.d()) * 1000) + new Date().getTime());
                    }
                    Date date = g10;
                    if (a10 == null) {
                        a10 = aVar.m();
                    }
                    String str = a10;
                    String c11 = aVar.c();
                    String n10 = aVar.n();
                    Set k10 = atomicBoolean.get() ? set4 : aVar.k();
                    Set e11 = atomicBoolean.get() ? set5 : aVar.e();
                    Set f10 = atomicBoolean.get() ? set6 : aVar.f();
                    h l10 = aVar.l();
                    Date date2 = new Date();
                    Date date3 = b10 != null ? new Date(b10.longValue() * 1000) : aVar.d();
                    if (e10 == null) {
                        e10 = aVar.i();
                    }
                    a aVar6 = new a(str, c11, n10, k10, e11, f10, l10, date, date2, date3, e10);
                    try {
                        aVar5.e().r(aVar6);
                        gVar2.f4743d.set(false);
                        if (aVar4 != null) {
                            aVar4.b(aVar6);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        aVar3 = aVar6;
                        gVar2.f4743d.set(false);
                        if (!(aVar4 == null || aVar3 == null)) {
                            aVar4.b(aVar3);
                        }
                        throw th;
                    }
                }
            }
            if (aVar4 != null) {
                aVar4.a(new v("No current access token to refresh"));
            }
            gVar2.f4743d.set(false);
        } catch (Throwable th2) {
            th = th2;
            aVar3 = null;
            gVar2.f4743d.set(false);
            aVar4.b(aVar3);
            throw th;
        }
    }

    private final void q(a aVar, a aVar2) {
        Intent intent = new Intent(i0.l(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f4740a.d(intent);
    }

    private final void s(a aVar, boolean z10) {
        a aVar2 = this.f4742c;
        this.f4742c = aVar;
        this.f4743d.set(false);
        this.f4744e = new Date(0);
        if (z10) {
            b bVar = this.f4741b;
            if (aVar != null) {
                bVar.g(aVar);
            } else {
                bVar.a();
                s0 s0Var = s0.f9663a;
                s0.i(i0.l());
            }
        }
        if (!s0.e(aVar2, aVar)) {
            q(aVar2, aVar);
            t();
        }
    }

    private final void t() {
        Context l10 = i0.l();
        a.c cVar = a.f4683p;
        a e10 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l10.getSystemService("alarm");
        if (cVar.g()) {
            if ((e10 == null ? null : e10.g()) != null && alarmManager != null) {
                Intent intent = new Intent(l10, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, e10.g().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(l10, 0, intent, 67108864) : PendingIntent.getBroadcast(l10, 0, intent, 0));
                } catch (Exception unused) {
                }
            }
        }
    }

    private final boolean u() {
        a i10 = i();
        if (i10 == null) {
            return false;
        }
        long time = new Date().getTime();
        return i10.l().c() && time - this.f4744e.getTime() > 3600000 && time - i10.j().getTime() > 86400000;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k((a.C0083a) null);
        }
    }

    public final a i() {
        return this.f4742c;
    }

    public final boolean j() {
        a f10 = this.f4741b.f();
        if (f10 == null) {
            return false;
        }
        s(f10, false);
        return true;
    }

    public final void k(a.C0083a aVar) {
        if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new c(this, aVar));
        }
    }

    public final void r(a aVar) {
        s(aVar, true);
    }
}
