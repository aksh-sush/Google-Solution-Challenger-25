package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

final class f8 {

    /* renamed from: a  reason: collision with root package name */
    protected long f5974a;

    /* renamed from: b  reason: collision with root package name */
    protected long f5975b;

    /* renamed from: c  reason: collision with root package name */
    private final m f5976c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h8 f5977d;

    public f8(h8 h8Var) {
        this.f5977d = h8Var;
        this.f5976c = new e8(this, h8Var.f5994a);
        long a10 = h8Var.f5994a.e().a();
        this.f5974a = a10;
        this.f5975b = a10;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f5976c.b();
        this.f5974a = 0;
        this.f5975b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f5976c.b();
    }

    /* access modifiers changed from: package-private */
    public final void c(long j10) {
        this.f5977d.h();
        this.f5976c.b();
        this.f5974a = j10;
        this.f5975b = j10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f5977d.h();
        this.f5977d.i();
        zzoh.zzc();
        if (!this.f5977d.f5994a.z().B((String) null, y2.f6635l0) || this.f5977d.f5994a.o()) {
            this.f5977d.f5994a.F().f6529o.b(this.f5977d.f5994a.e().currentTimeMillis());
        }
        long j11 = j10 - this.f5974a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = j10 - this.f5975b;
                this.f5975b = j10;
            }
            this.f5977d.f5994a.d().v().b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            d9.x(this.f5977d.f5994a.K().t(!this.f5977d.f5994a.z().D()), bundle, true);
            g z12 = this.f5977d.f5994a.z();
            x2 x2Var = y2.V;
            if (!z12.B((String) null, x2Var) && z11) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f5977d.f5994a.z().B((String) null, x2Var) || !z11) {
                this.f5977d.f5994a.I().t("auto", "_e", bundle);
            }
            this.f5974a = j10;
            this.f5976c.b();
            this.f5976c.d(3600000);
            return true;
        }
        this.f5977d.f5994a.d().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }
}
