package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznv  reason: invalid package */
public final class zznv implements Parcelable.Creator<zznu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) b.o(parcel, C, UserProfileChangeRequest.CREATOR);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zznu(userProfileChangeRequest, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zznu[i10];
    }
}
