package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzq implements Parcelable.Creator<zzp> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        boolean z10 = false;
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
                z10 = b.w(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzp(str, str2, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
