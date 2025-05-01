package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import f3.a;
import h4.f;

final class w3 extends h5 {

    /* renamed from: x  reason: collision with root package name */
    static final Pair f6516x = new Pair("", 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6517c;

    /* renamed from: d  reason: collision with root package name */
    public u3 f6518d;

    /* renamed from: e  reason: collision with root package name */
    public final t3 f6519e = new t3(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final t3 f6520f = new t3(this, "app_install_time", 0);

    /* renamed from: g  reason: collision with root package name */
    public final v3 f6521g = new v3(this, "app_instance_id", (String) null);

    /* renamed from: h  reason: collision with root package name */
    private String f6522h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6523i;

    /* renamed from: j  reason: collision with root package name */
    private long f6524j;

    /* renamed from: k  reason: collision with root package name */
    public final t3 f6525k = new t3(this, "session_timeout", 1800000);

    /* renamed from: l  reason: collision with root package name */
    public final r3 f6526l = new r3(this, "start_new_session", true);

    /* renamed from: m  reason: collision with root package name */
    public final v3 f6527m = new v3(this, "non_personalized_ads", (String) null);

    /* renamed from: n  reason: collision with root package name */
    public final r3 f6528n = new r3(this, "allow_remote_dynamite", false);

    /* renamed from: o  reason: collision with root package name */
    public final t3 f6529o = new t3(this, "last_pause_time", 0);

    /* renamed from: p  reason: collision with root package name */
    public boolean f6530p;

    /* renamed from: q  reason: collision with root package name */
    public final r3 f6531q = new r3(this, "app_backgrounded", false);

    /* renamed from: r  reason: collision with root package name */
    public final r3 f6532r = new r3(this, "deep_link_retrieval_complete", false);

    /* renamed from: s  reason: collision with root package name */
    public final t3 f6533s = new t3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t  reason: collision with root package name */
    public final v3 f6534t = new v3(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: u  reason: collision with root package name */
    public final v3 f6535u = new v3(this, "deferred_attribution_cache", (String) null);

    /* renamed from: v  reason: collision with root package name */
    public final t3 f6536v = new t3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w  reason: collision with root package name */
    public final s3 f6537w = new s3(this, "default_event_parameters", (Bundle) null);

    w3(n4 n4Var) {
        super(n4Var);
    }

    /* access modifiers changed from: protected */
    public final void i() {
        SharedPreferences sharedPreferences = this.f5994a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6517c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f6530p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f6517c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f5994a.z();
        this.f6518d = new u3(this, "health_monitor", Math.max(0, ((Long) y2.f6618d.a((Object) null)).longValue()), (f) null);
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences o() {
        h();
        k();
        s.k(this.f6517c);
        return this.f6517c;
    }

    /* access modifiers changed from: package-private */
    public final Pair p(String str) {
        h();
        long a10 = this.f5994a.e().a();
        String str2 = this.f6522h;
        if (str2 != null && a10 < this.f6524j) {
            return new Pair(str2, Boolean.valueOf(this.f6523i));
        }
        this.f6524j = a10 + this.f5994a.z().r(str, y2.f6616c);
        a.d(true);
        try {
            a.C0215a b10 = a.b(this.f5994a.c());
            this.f6522h = "";
            String a11 = b10.a();
            if (a11 != null) {
                this.f6522h = a11;
            }
            this.f6523i = b10.b();
        } catch (Exception e10) {
            this.f5994a.d().q().b("Unable to get advertising id", e10);
            this.f6522h = "";
        }
        a.d(false);
        return new Pair(this.f6522h, Boolean.valueOf(this.f6523i));
    }

    /* access modifiers changed from: package-private */
    public final h4.a q() {
        h();
        return h4.a.b(o().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    public final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void t(boolean z10) {
        h();
        this.f5994a.d().v().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        SharedPreferences sharedPreferences = this.f6517c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final boolean v(long j10) {
        return j10 - this.f6525k.a() > this.f6529o.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean w(int i10) {
        return h4.a.l(i10, o().getInt("consent_source", 100));
    }
}
