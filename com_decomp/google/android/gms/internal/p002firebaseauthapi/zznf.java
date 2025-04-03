package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznf  reason: invalid package */
public final class zznf implements Parcelable.Creator<zzne> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                str3 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzne(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzne[i10];
    }
}
