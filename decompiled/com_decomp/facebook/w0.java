package com.facebook;

import android.content.SharedPreferences;
import db.g;
import db.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4998b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4999a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public w0() {
        SharedPreferences sharedPreferences = i0.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        l.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f4999a = sharedPreferences;
    }

    public final void a() {
        this.f4999a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final v0 b() {
        String string = this.f4999a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new v0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(v0 v0Var) {
        l.e(v0Var, "profile");
        JSONObject c10 = v0Var.c();
        if (c10 != null) {
            this.f4999a.edit().putString("com.facebook.ProfileManager.CachedProfile", c10.toString()).apply();
        }
    }
}
