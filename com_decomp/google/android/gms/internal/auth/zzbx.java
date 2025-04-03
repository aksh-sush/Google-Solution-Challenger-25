package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzbx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzbw(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbw[i10];
    }
}
