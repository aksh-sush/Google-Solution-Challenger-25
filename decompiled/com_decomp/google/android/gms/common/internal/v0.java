package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.b;

public final class v0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                account = (Account) b.o(parcel, C, Account.CREATOR);
            } else if (v10 == 3) {
                i11 = b.E(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.o(parcel, C, GoogleSignInAccount.CREATOR);
            }
        }
        b.u(parcel, L);
        return new u0(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u0[i10];
    }
}
