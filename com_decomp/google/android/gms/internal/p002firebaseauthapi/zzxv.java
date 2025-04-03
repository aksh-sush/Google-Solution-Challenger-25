package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxv  reason: invalid package */
public final class zzxv implements Parcelable.Creator<zzxu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C);
            } else if (v10 == 4) {
                j10 = b.G(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                z10 = b.w(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzxu(str, str2, j10, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzxu[i10];
    }
}
