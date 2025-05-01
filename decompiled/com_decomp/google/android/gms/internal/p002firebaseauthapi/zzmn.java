package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmn  reason: invalid package */
public final class zzmn implements Parcelable.Creator<zzmm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        PhoneAuthCredential phoneAuthCredential = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                phoneAuthCredential = (PhoneAuthCredential) b.o(parcel, C, PhoneAuthCredential.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzmm(str, phoneAuthCredential);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzmm[i10];
    }
}
