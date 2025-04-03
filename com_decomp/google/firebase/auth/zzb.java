package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzb implements Parcelable.Creator<ActionCodeSettings> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    str = b.p(parcel, C);
                    break;
                case 2:
                    str2 = b.p(parcel, C);
                    break;
                case 3:
                    str3 = b.p(parcel, C);
                    break;
                case 4:
                    str4 = b.p(parcel, C);
                    break;
                case 5:
                    z10 = b.w(parcel, C);
                    break;
                case 6:
                    str5 = b.p(parcel, C);
                    break;
                case 7:
                    z11 = b.w(parcel, C);
                    break;
                case 8:
                    str6 = b.p(parcel, C);
                    break;
                case 9:
                    i10 = b.E(parcel, C);
                    break;
                case 10:
                    str7 = b.p(parcel, C);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new ActionCodeSettings(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ActionCodeSettings[i10];
    }
}
