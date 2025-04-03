package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthProvider;
import s3.b;

public final class zzd implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            b.v(C);
            b.K(parcel, C);
        }
        b.u(parcel, L);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new PhoneAuthProvider.ForceResendingToken[i10];
    }
}
