package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
public final class zzml implements Parcelable.Creator<zzmk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        zzxq zzxq = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                zzxq = (zzxq) b.o(parcel, C, zzxq.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzmk(str, zzxq);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzmk[i10];
    }
}
