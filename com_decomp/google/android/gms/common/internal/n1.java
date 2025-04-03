package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                i10 = b.E(parcel, C);
            }
        }
        b.u(parcel, L);
        return new m1(i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m1[i10];
    }
}
