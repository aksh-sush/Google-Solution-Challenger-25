package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    i10 = b.E(parcel2, C);
                    break;
                case 2:
                    i11 = b.E(parcel2, C);
                    break;
                case 3:
                    i12 = b.E(parcel2, C);
                    break;
                case 4:
                    j10 = b.G(parcel2, C);
                    break;
                case 5:
                    j11 = b.G(parcel2, C);
                    break;
                case 6:
                    str = b.p(parcel2, C);
                    break;
                case 7:
                    str2 = b.p(parcel2, C);
                    break;
                case 8:
                    i13 = b.E(parcel2, C);
                    break;
                case 9:
                    i14 = b.E(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new p(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
