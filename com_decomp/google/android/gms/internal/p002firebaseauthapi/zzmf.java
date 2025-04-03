package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmf  reason: invalid package */
public final class zzmf implements Parcelable.Creator<zzme> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzme(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzme[i10];
    }
}
