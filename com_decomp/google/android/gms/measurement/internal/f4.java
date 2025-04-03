package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

final class f4 implements zzr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h4 f5961a;

    f4(h4 h4Var) {
        this.f5961a = h4Var;
    }

    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        h3 h3Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            h3Var = this.f5961a.f5994a.d().q();
        } else if (i11 == 1) {
            j3 d10 = this.f5961a.f5994a.d();
            h3Var = z10 ? d10.t() : !z11 ? d10.s() : d10.r();
        } else if (i11 == 3) {
            h3Var = this.f5961a.f5994a.d().v();
        } else if (i11 != 4) {
            h3Var = this.f5961a.f5994a.d().u();
        } else {
            j3 d11 = this.f5961a.f5994a.d();
            h3Var = z10 ? d11.y() : !z11 ? d11.x() : d11.w();
        }
        int size = list.size();
        if (size == 1) {
            h3Var.b(str, list.get(0));
        } else if (size == 2) {
            h3Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            h3Var.a(str);
        } else {
            h3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
