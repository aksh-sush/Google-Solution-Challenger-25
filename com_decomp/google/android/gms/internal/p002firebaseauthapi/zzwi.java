package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwi  reason: invalid package */
public final class zzwi implements Parcelable.Creator<zzwh> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        zzwl zzwl = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 2) {
                b.K(parcel, C);
            } else {
                zzwl = (zzwl) b.o(parcel, C, zzwl.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzwh(zzwl);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzwh[i10];
    }
}
