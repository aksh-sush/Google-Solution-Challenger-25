package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class l1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                z10 = b.w(parcel, C);
            } else if (v10 == 3) {
                z11 = b.w(parcel, C);
            } else if (v10 == 4) {
                i11 = b.E(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                i12 = b.E(parcel, C);
            }
        }
        b.u(parcel, L);
        return new u(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
