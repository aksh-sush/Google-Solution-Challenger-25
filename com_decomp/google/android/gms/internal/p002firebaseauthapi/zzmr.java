package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmr  reason: invalid package */
public final class zzmr implements Parcelable.Creator<zzmq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        ActionCodeSettings actionCodeSettings = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                actionCodeSettings = (ActionCodeSettings) b.o(parcel, C, ActionCodeSettings.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzmq(str, actionCodeSettings);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzmq[i10];
    }
}
