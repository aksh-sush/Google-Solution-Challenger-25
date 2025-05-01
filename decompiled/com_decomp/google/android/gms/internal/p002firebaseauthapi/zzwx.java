package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwx  reason: invalid package */
public final class zzwx implements Parcelable.Creator<zzww> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str = b.p(parcel, C);
                    break;
                case 3:
                    str2 = b.p(parcel, C);
                    break;
                case 4:
                    str3 = b.p(parcel, C);
                    break;
                case 5:
                    str4 = b.p(parcel, C);
                    break;
                case 6:
                    str5 = b.p(parcel, C);
                    break;
                case 7:
                    str6 = b.p(parcel, C);
                    break;
                case 8:
                    str7 = b.p(parcel, C);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new zzww(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzww[i10];
    }
}
