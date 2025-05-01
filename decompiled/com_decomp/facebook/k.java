package com.facebook;

import android.content.SharedPreferences;
import db.g;
import db.l;
import org.json.JSONException;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4809b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4810a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.i0.l()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            db.l.d(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.k.<init>():void");
    }

    public final void a() {
        this.f4810a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(j jVar) {
        l.e(jVar, "authenticationToken");
        try {
            this.f4810a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", jVar.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public k(SharedPreferences sharedPreferences) {
        l.e(sharedPreferences, "sharedPreferences");
        this.f4810a = sharedPreferences;
    }
}
