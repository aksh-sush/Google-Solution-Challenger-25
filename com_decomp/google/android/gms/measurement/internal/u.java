package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import s3.c;

public final class u implements Parcelable.Creator {
    static void a(t tVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, tVar.f6408e, false);
        c.B(parcel, 3, tVar.f6409f, i10, false);
        c.D(parcel, 4, tVar.f6410g, false);
        c.w(parcel, 5, tVar.f6411h);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        r rVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 == 3) {
                rVar = (r) b.o(parcel, C, r.CREATOR);
            } else if (v10 == 4) {
                str2 = b.p(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                j10 = b.G(parcel, C);
            }
        }
        b.u(parcel, L);
        return new t(str, rVar, str2, j10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
