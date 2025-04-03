package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.EmailAuthCredential;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh  reason: invalid package */
public final class zznh implements Parcelable.Creator<zzng> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        EmailAuthCredential emailAuthCredential = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                emailAuthCredential = (EmailAuthCredential) b.o(parcel, C, EmailAuthCredential.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzng(emailAuthCredential);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzng[i10];
    }
}
