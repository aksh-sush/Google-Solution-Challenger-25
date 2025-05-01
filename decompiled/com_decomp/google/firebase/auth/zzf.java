package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import s3.b;

public final class zzf implements Parcelable.Creator<zze> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzxq zzxq = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    zzxq = (zzxq) b.o(parcel, C, zzxq.CREATOR);
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
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new zze(str, str2, str3, zzxq, str4, str5, str6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
