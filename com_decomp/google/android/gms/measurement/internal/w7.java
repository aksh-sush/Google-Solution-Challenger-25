package com.google.android.gms.measurement.internal;

import android.util.Pair;
import f3.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class w7 extends n8 {

    /* renamed from: d  reason: collision with root package name */
    private String f6551d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6552e;

    /* renamed from: f  reason: collision with root package name */
    private long f6553f;

    /* renamed from: g  reason: collision with root package name */
    public final t3 f6554g;

    /* renamed from: h  reason: collision with root package name */
    public final t3 f6555h;

    /* renamed from: i  reason: collision with root package name */
    public final t3 f6556i;

    /* renamed from: j  reason: collision with root package name */
    public final t3 f6557j;

    /* renamed from: k  reason: collision with root package name */
    public final t3 f6558k;

    w7(w8 w8Var) {
        super(w8Var);
        w3 F = this.f5994a.F();
        F.getClass();
        this.f6554g = new t3(F, "last_delete_stale", 0);
        w3 F2 = this.f5994a.F();
        F2.getClass();
        this.f6555h = new t3(F2, "backoff", 0);
        w3 F3 = this.f5994a.F();
        F3.getClass();
        this.f6556i = new t3(F3, "last_upload", 0);
        w3 F4 = this.f5994a.F();
        F4.getClass();
        this.f6557j = new t3(F4, "last_upload_attempt", 0);
        w3 F5 = this.f5994a.F();
        F5.getClass();
        this.f6558k = new t3(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair m(String str) {
        h();
        long a10 = this.f5994a.e().a();
        String str2 = this.f6551d;
        if (str2 != null && a10 < this.f6553f) {
            return new Pair(str2, Boolean.valueOf(this.f6552e));
        }
        this.f6553f = a10 + this.f5994a.z().r(str, y2.f6616c);
        a.d(true);
        try {
            a.C0215a b10 = a.b(this.f5994a.c());
            this.f6551d = "";
            String a11 = b10.a();
            if (a11 != null) {
                this.f6551d = a11;
            }
            this.f6552e = b10.b();
        } catch (Exception e10) {
            this.f5994a.d().q().b("Unable to get advertising id", e10);
            this.f6551d = "";
        }
        a.d(false);
        return new Pair(this.f6551d, Boolean.valueOf(this.f6552e));
    }

    /* access modifiers changed from: package-private */
    public final Pair n(String str, h4.a aVar) {
        return aVar.j() ? m(str) : new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public final String o(String str) {
        h();
        String str2 = (String) m(str).first;
        MessageDigest s10 = d9.s("MD5");
        if (s10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, s10.digest(str2.getBytes()))});
    }
}
