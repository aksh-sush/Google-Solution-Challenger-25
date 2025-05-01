package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.i6;
import com.google.android.gms.measurement.internal.n4;
import java.util.List;
import java.util.Map;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final n4 f5819a;

    /* renamed from: b  reason: collision with root package name */
    private final i6 f5820b;

    public a(n4 n4Var) {
        super((c) null);
        s.k(n4Var);
        this.f5819a = n4Var;
        this.f5820b = n4Var.I();
    }

    public final void a(String str) {
        this.f5819a.y().l(str, this.f5819a.e().a());
    }

    public final void b(String str, String str2, Bundle bundle) {
        this.f5819a.I().e0(str, str2, bundle);
    }

    public final List c(String str, String str2) {
        return this.f5820b.Y(str, str2);
    }

    public final Map d(String str, String str2, boolean z10) {
        return this.f5820b.Z(str, str2, z10);
    }

    public final void e(String str) {
        this.f5819a.y().m(str, this.f5819a.e().a());
    }

    public final void f(Bundle bundle) {
        this.f5820b.C(bundle);
    }

    public final void g(String str, String str2, Bundle bundle) {
        this.f5820b.q(str, str2, bundle);
    }

    public final int zza(String str) {
        this.f5820b.P(str);
        return 25;
    }

    public final long zzb() {
        return this.f5819a.N().r0();
    }

    public final String zzh() {
        return this.f5820b.U();
    }

    public final String zzi() {
        return this.f5820b.V();
    }

    public final String zzj() {
        return this.f5820b.W();
    }

    public final String zzk() {
        return this.f5820b.U();
    }
}
