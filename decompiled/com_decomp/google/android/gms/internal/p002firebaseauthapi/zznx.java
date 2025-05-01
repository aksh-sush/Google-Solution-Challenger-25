package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznx  reason: invalid package */
public final class zznx implements Parcelable.Creator<zznw> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        ActionCodeSettings actionCodeSettings = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                actionCodeSettings = (ActionCodeSettings) b.o(parcel, C, ActionCodeSettings.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zznw(str, str2, actionCodeSettings);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zznw[i10];
    }
}
