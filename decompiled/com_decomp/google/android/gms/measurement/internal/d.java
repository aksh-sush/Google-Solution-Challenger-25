package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        z8 z8Var = null;
        String str3 = null;
        t tVar = null;
        t tVar2 = null;
        t tVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    str2 = b.p(parcel2, C);
                    break;
                case 4:
                    z8Var = (z8) b.o(parcel2, C, z8.CREATOR);
                    break;
                case 5:
                    j10 = b.G(parcel2, C);
                    break;
                case 6:
                    z10 = b.w(parcel2, C);
                    break;
                case 7:
                    str3 = b.p(parcel2, C);
                    break;
                case 8:
                    tVar = (t) b.o(parcel2, C, t.CREATOR);
                    break;
                case 9:
                    j11 = b.G(parcel2, C);
                    break;
                case 10:
                    tVar2 = (t) b.o(parcel2, C, t.CREATOR);
                    break;
                case 11:
                    j12 = b.G(parcel2, C);
                    break;
                case 12:
                    tVar3 = (t) b.o(parcel2, C, t.CREATOR);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new c(str, str2, z8Var, j10, z10, str3, tVar, j11, tVar2, j12, tVar3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
