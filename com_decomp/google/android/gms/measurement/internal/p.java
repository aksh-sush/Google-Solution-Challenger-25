package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;

final class p {

    /* renamed from: a  reason: collision with root package name */
    final String f6302a;

    /* renamed from: b  reason: collision with root package name */
    final String f6303b;

    /* renamed from: c  reason: collision with root package name */
    final long f6304c;

    /* renamed from: d  reason: collision with root package name */
    final long f6305d;

    /* renamed from: e  reason: collision with root package name */
    final long f6306e;

    /* renamed from: f  reason: collision with root package name */
    final long f6307f;

    /* renamed from: g  reason: collision with root package name */
    final long f6308g;

    /* renamed from: h  reason: collision with root package name */
    final Long f6309h;

    /* renamed from: i  reason: collision with root package name */
    final Long f6310i;

    /* renamed from: j  reason: collision with root package name */
    final Long f6311j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f6312k;

    p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        s.g(str);
        s.g(str2);
        boolean z10 = true;
        s.a(j15 >= 0);
        s.a(j16 >= 0);
        s.a(j17 >= 0);
        s.a(j18 < 0 ? false : z10);
        this.f6302a = str;
        this.f6303b = str2;
        this.f6304c = j15;
        this.f6305d = j16;
        this.f6306e = j17;
        this.f6307f = j13;
        this.f6308g = j18;
        this.f6309h = l10;
        this.f6310i = l11;
        this.f6311j = l12;
        this.f6312k = bool;
    }

    /* access modifiers changed from: package-private */
    public final p a(Long l10, Long l11, Boolean bool) {
        return new p(this.f6302a, this.f6303b, this.f6304c, this.f6305d, this.f6306e, this.f6307f, this.f6308g, this.f6309h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    public final p b(long j10, long j11) {
        return new p(this.f6302a, this.f6303b, this.f6304c, this.f6305d, this.f6306e, this.f6307f, j10, Long.valueOf(j11), this.f6310i, this.f6311j, this.f6312k);
    }

    /* access modifiers changed from: package-private */
    public final p c(long j10) {
        return new p(this.f6302a, this.f6303b, this.f6304c, this.f6305d, this.f6306e, j10, this.f6308g, this.f6309h, this.f6310i, this.f6311j, this.f6312k);
    }
}
