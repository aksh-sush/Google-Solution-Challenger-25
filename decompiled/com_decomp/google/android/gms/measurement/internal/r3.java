package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.s;

public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6375a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6376b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6377c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6378d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w3 f6379e;

    public r3(w3 w3Var, String str, boolean z10) {
        this.f6379e = w3Var;
        s.g(str);
        this.f6375a = str;
        this.f6376b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f6379e.o().edit();
        edit.putBoolean(this.f6375a, z10);
        edit.apply();
        this.f6378d = z10;
    }

    public final boolean b() {
        if (!this.f6377c) {
            this.f6377c = true;
            this.f6378d = this.f6379e.o().getBoolean(this.f6375a, this.f6376b);
        }
        return this.f6378d;
    }
}
