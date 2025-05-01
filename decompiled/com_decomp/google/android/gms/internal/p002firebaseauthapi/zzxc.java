package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
public final class zzxc implements Parcelable.Creator<zzxb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzwu zzwu = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C);
            } else if (v10 == 4) {
                str3 = b.p(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                zzwu = (zzwu) b.o(parcel, C, zzwu.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzxb(str, str2, str3, zzwu);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzxb[i10];
    }
}
