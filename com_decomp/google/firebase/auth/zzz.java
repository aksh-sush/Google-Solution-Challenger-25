package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzz implements Parcelable.Creator<GithubAuthCredential> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new GithubAuthCredential(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new GithubAuthCredential[i10];
    }
}
