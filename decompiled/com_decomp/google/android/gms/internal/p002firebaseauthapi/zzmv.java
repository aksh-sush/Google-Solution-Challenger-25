package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmv  reason: invalid package */
public final class zzmv implements Parcelable.Creator<zzmu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        zzxd zzxd = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                zzxd = (zzxd) b.o(parcel, C, zzxd.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzmu(zzxd);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzmu[i10];
    }
}
