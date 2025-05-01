package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd  reason: invalid package */
public final class zzmd implements Parcelable.Creator<zzmc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                phoneAuthCredential = (PhoneAuthCredential) b.o(parcel, C, PhoneAuthCredential.CREATOR);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzmc(phoneAuthCredential, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzmc[i10];
    }
}
