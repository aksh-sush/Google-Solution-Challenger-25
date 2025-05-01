package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import y3.e;

final class i8 {

    /* renamed from: a  reason: collision with root package name */
    private final e f6057a;

    /* renamed from: b  reason: collision with root package name */
    private long f6058b;

    public i8(e eVar) {
        s.k(eVar);
        this.f6057a = eVar;
    }

    public final void a() {
        this.f6058b = 0;
    }

    public final void b() {
        this.f6058b = this.f6057a.a();
    }

    public final boolean c(long j10) {
        return this.f6058b == 0 || this.f6057a.a() - this.f6058b >= 3600000;
    }
}
