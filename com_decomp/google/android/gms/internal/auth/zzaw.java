package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzaw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                i11 = b.E(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzav(i10, str, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
