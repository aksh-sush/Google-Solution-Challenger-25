package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwr  reason: invalid package */
public final class zzwr implements Parcelable.Creator<zzwq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C);
            } else if (v10 == 4) {
                l10 = b.H(parcel, C);
            } else if (v10 == 5) {
                str3 = b.p(parcel, C);
            } else if (v10 != 6) {
                b.K(parcel, C);
            } else {
                l11 = b.H(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzwq(str, str2, l10, str3, l11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzwq[i10];
    }
}
