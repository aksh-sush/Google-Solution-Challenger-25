package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzaa implements Parcelable.Creator<zzz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                j10 = b.G(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                j11 = b.G(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzz(j10, j11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzz[i10];
    }
}
