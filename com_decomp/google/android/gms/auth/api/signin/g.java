package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 4) {
                str = b.p(parcel, C);
            } else if (v10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.o(parcel, C, GoogleSignInAccount.CREATOR);
            } else if (v10 != 8) {
                b.K(parcel, C);
            } else {
                str2 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
