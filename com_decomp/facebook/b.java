package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import db.g;
import db.l;
import org.json.JSONException;
import org.json.JSONObject;
import sa.t;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4700d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4701a;

    /* renamed from: b  reason: collision with root package name */
    private final C0084b f4702b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f4703c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: com.facebook.b$b  reason: collision with other inner class name */
    public static final class C0084b {
        public final t0 a() {
            return new t0(i0.l(), (String) null, 2, (g) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.i0.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            db.l.d(r0, r1)
            com.facebook.b$b r1 = new com.facebook.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.b.<init>():void");
    }

    private final a b() {
        String string = this.f4701a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return a.f4683p.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final a c() {
        Bundle c10 = d().c();
        if (c10 == null || !t0.f4973c.g(c10)) {
            return null;
        }
        return a.f4683p.c(c10);
    }

    private final t0 d() {
        if (this.f4703c == null) {
            synchronized (this) {
                if (this.f4703c == null) {
                    this.f4703c = this.f4702b.a();
                }
                t tVar = t.f15300a;
            }
        }
        t0 t0Var = this.f4703c;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final boolean e() {
        return this.f4701a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return i0.G();
    }

    public final void a() {
        this.f4701a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        a c10 = c();
        if (c10 == null) {
            return c10;
        }
        g(c10);
        d().a();
        return c10;
    }

    public final void g(a aVar) {
        l.e(aVar, "accessToken");
        try {
            this.f4701a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.p().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public b(SharedPreferences sharedPreferences, C0084b bVar) {
        l.e(sharedPreferences, "sharedPreferences");
        l.e(bVar, "tokenCachingStrategyFactory");
        this.f4701a = sharedPreferences;
        this.f4702b = bVar;
    }
}
