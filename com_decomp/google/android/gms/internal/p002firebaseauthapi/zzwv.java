package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwv  reason: invalid package */
public final class zzwv implements Parcelable.Creator<zzwu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 == 3) {
                str3 = b.p(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                j10 = b.G(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzwu(str, str2, str3, j10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzwu[i10];
    }
}
