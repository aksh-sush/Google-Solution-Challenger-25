package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznb  reason: invalid package */
public final class zznb implements Parcelable.Creator<zzna> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        zzxq zzxq = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                zzxq = (zzxq) b.o(parcel, C, zzxq.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzna(zzxq);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzna[i10];
    }
}
