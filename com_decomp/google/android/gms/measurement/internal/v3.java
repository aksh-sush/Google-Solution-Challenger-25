package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.s;

public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6478a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6479b;

    /* renamed from: c  reason: collision with root package name */
    private String f6480c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ w3 f6481d;

    public v3(w3 w3Var, String str, String str2) {
        this.f6481d = w3Var;
        s.g(str);
        this.f6478a = str;
    }

    public final String a() {
        if (!this.f6479b) {
            this.f6479b = true;
            this.f6480c = this.f6481d.o().getString(this.f6478a, (String) null);
        }
        return this.f6480c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f6481d.o().edit();
        edit.putString(this.f6478a, str);
        edit.apply();
        this.f6480c = str;
    }
}
