package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlz  reason: invalid package */
public final class zzlz implements Parcelable.Creator<zzly> {
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
        return new zzly(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzly[i10];
    }
}
