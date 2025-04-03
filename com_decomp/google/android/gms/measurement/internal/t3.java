package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.s;

public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6415a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6416b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6417c;

    /* renamed from: d  reason: collision with root package name */
    private long f6418d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w3 f6419e;

    public t3(w3 w3Var, String str, long j10) {
        this.f6419e = w3Var;
        s.g(str);
        this.f6415a = str;
        this.f6416b = j10;
    }

    public final long a() {
        if (!this.f6417c) {
            this.f6417c = true;
            this.f6418d = this.f6419e.o().getLong(this.f6415a, this.f6416b);
        }
        return this.f6418d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f6419e.o().edit();
        edit.putLong(this.f6415a, j10);
        edit.apply();
        this.f6418d = j10;
    }
}
