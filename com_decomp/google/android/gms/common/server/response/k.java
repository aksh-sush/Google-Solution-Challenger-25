package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        h hVar = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                parcel2 = b.m(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                hVar = (h) b.o(parcel, C, h.CREATOR);
            }
        }
        b.u(parcel, L);
        return new c(i10, parcel2, hVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
