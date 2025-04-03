package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzah implements Parcelable.Creator<UserProfileChangeRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C);
            } else if (v10 == 4) {
                z10 = b.w(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                z11 = b.w(parcel, C);
            }
        }
        b.u(parcel, L);
        return new UserProfileChangeRequest(str, str2, z10, z11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new UserProfileChangeRequest[i10];
    }
}
