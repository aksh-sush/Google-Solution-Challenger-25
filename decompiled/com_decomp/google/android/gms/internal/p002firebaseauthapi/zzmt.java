package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmt  reason: invalid package */
public final class zzmt implements Parcelable.Creator<zzms> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        ActionCodeSettings actionCodeSettings = null;
        String str2 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                actionCodeSettings = (ActionCodeSettings) b.o(parcel, C, ActionCodeSettings.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                str2 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzms(str, actionCodeSettings, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzms[i10];
    }
}
