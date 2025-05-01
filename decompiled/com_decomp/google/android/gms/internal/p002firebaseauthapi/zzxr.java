package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr  reason: invalid package */
public final class zzxr implements Parcelable.Creator<zzxq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    str2 = b.p(parcel2, C);
                    break;
                case 4:
                    str3 = b.p(parcel2, C);
                    break;
                case 5:
                    str4 = b.p(parcel2, C);
                    break;
                case 6:
                    str5 = b.p(parcel2, C);
                    break;
                case 7:
                    str6 = b.p(parcel2, C);
                    break;
                case 8:
                    str7 = b.p(parcel2, C);
                    break;
                case 9:
                    str8 = b.p(parcel2, C);
                    break;
                case 10:
                    z10 = b.w(parcel2, C);
                    break;
                case 11:
                    z11 = b.w(parcel2, C);
                    break;
                case 12:
                    str9 = b.p(parcel2, C);
                    break;
                case 13:
                    str10 = b.p(parcel2, C);
                    break;
                case 14:
                    str11 = b.p(parcel2, C);
                    break;
                case 15:
                    str12 = b.p(parcel2, C);
                    break;
                case 16:
                    z12 = b.w(parcel2, C);
                    break;
                case 17:
                    str13 = b.p(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zzxq(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzxq[i10];
    }
}
