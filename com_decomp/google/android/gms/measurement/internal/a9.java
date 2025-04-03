package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import s3.c;

public final class a9 implements Parcelable.Creator {
    static void a(z8 z8Var, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, z8Var.f6688e);
        c.D(parcel, 2, z8Var.f6689f, false);
        c.w(parcel, 3, z8Var.f6690g);
        c.y(parcel, 4, z8Var.f6691h, false);
        c.r(parcel, 5, (Float) null, false);
        c.D(parcel, 6, z8Var.f6692i, false);
        c.D(parcel, 7, z8Var.f6693j, false);
        c.o(parcel, 8, z8Var.f6694k, false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    i10 = b.E(parcel2, C);
                    break;
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    j10 = b.G(parcel2, C);
                    break;
                case 4:
                    l10 = b.H(parcel2, C);
                    break;
                case 5:
                    f10 = b.B(parcel2, C);
                    break;
                case 6:
                    str2 = b.p(parcel2, C);
                    break;
                case 7:
                    str3 = b.p(parcel2, C);
                    break;
                case 8:
                    d10 = b.z(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new z8(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new z8[i10];
    }
}
