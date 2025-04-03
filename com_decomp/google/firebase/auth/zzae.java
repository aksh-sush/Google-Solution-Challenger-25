package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzae implements Parcelable.Creator<PhoneMultiFactorInfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                str3 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new PhoneMultiFactorInfo(str, str2, j10, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new PhoneMultiFactorInfo[i10];
    }
}
