package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class n0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f8427a;

    /* renamed from: b  reason: collision with root package name */
    final Context f8428b;

    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f8429d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f8430a;

        /* renamed from: b  reason: collision with root package name */
        final String f8431b;

        /* renamed from: c  reason: collision with root package name */
        final long f8432c;

        private a(String str, String str2, long j10) {
            this.f8430a = str;
            this.f8431b = str2;
            this.f8432c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w(Constants.TAG, sb2.toString());
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w(Constants.TAG, sb2.toString());
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f8432c + f8429d || !str.equals(this.f8431b);
        }
    }

    public n0(Context context) {
        this.f8428b = context;
        this.f8427a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        File file = new File(androidx.core.content.a.h(this.f8428b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i(Constants.TAG, "App restored, clearing state");
                    c();
                }
            } catch (IOException e10) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    String valueOf = String.valueOf(e10.getMessage());
                    Log.d(Constants.TAG, valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    private String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|*");
        return sb2.toString();
    }

    public synchronized void c() {
        this.f8427a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b10 = b(str, str2);
        SharedPreferences.Editor edit = this.f8427a.edit();
        edit.remove(b10);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f8427a.getString(b(str, str2), (String) null));
    }

    public synchronized boolean f() {
        return this.f8427a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f8427a.edit();
            edit.putString(b(str, str2), a10);
            edit.commit();
        }
    }
}
