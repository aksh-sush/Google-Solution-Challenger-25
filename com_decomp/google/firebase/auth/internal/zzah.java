package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import s3.b;

public final class zzah implements Parcelable.Creator<zzag> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, PhoneMultiFactorInfo.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzag(str, str2, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzag[i10];
    }
}
