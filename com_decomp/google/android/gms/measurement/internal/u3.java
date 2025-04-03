package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import h4.f;

public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    final String f6437a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6438b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6439c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6440d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w3 f6441e;

    /* synthetic */ u3(w3 w3Var, String str, long j10, f fVar) {
        this.f6441e = w3Var;
        s.g("health_monitor");
        s.a(j10 > 0);
        this.f6437a = "health_monitor:start";
        this.f6438b = "health_monitor:count";
        this.f6439c = "health_monitor:value";
        this.f6440d = j10;
    }

    private final long c() {
        return this.f6441e.o().getLong(this.f6437a, 0);
    }

    private final void d() {
        this.f6441e.h();
        long currentTimeMillis = this.f6441e.f5994a.e().currentTimeMillis();
        SharedPreferences.Editor edit = this.f6441e.o().edit();
        edit.remove(this.f6438b);
        edit.remove(this.f6439c);
        edit.putLong(this.f6437a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long j10;
        this.f6441e.h();
        this.f6441e.h();
        long c10 = c();
        if (c10 == 0) {
            d();
            j10 = 0;
        } else {
            j10 = Math.abs(c10 - this.f6441e.f5994a.e().currentTimeMillis());
        }
        long j11 = this.f6440d;
        if (j10 < j11) {
            return null;
        }
        if (j10 > j11 + j11) {
            d();
            return null;
        }
        String string = this.f6441e.o().getString(this.f6439c, (String) null);
        long j12 = this.f6441e.o().getLong(this.f6438b, 0);
        d();
        return (string == null || j12 <= 0) ? w3.f6516x : new Pair(string, Long.valueOf(j12));
    }

    public final void b(String str, long j10) {
        this.f6441e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f6441e.o().getLong(this.f6438b, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f6441e.o().edit();
            edit.putString(this.f6439c, str);
            edit.putLong(this.f6438b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f6441e.f5994a.N().t().nextLong();
        long j12 = j11 + 1;
        SharedPreferences.Editor edit2 = this.f6441e.o().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
            edit2.putString(this.f6439c, str);
        }
        edit2.putLong(this.f6438b, j12);
        edit2.apply();
    }
}
