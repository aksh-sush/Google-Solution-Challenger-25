package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzba implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        String str = null;
        byte[] bArr = null;
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
                bArr = b.g(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzaz(i10, str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaz[i10];
    }
}
