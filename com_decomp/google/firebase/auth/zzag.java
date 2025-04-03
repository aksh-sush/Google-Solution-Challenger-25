package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzag implements Parcelable.Creator<TwitterAuthCredential> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                str2 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new TwitterAuthCredential(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new TwitterAuthCredential[i10];
    }
}
