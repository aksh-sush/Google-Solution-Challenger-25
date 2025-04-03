package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznn  reason: invalid package */
public final class zznn implements Parcelable.Creator<zznm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        PhoneMultiFactorInfo phoneMultiFactorInfo = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) b.o(parcel2, C, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    str2 = b.p(parcel2, C);
                    break;
                case 4:
                    j10 = b.G(parcel2, C);
                    break;
                case 5:
                    z10 = b.w(parcel2, C);
                    break;
                case 6:
                    z11 = b.w(parcel2, C);
                    break;
                case 7:
                    str3 = b.p(parcel2, C);
                    break;
                case 8:
                    str4 = b.p(parcel2, C);
                    break;
                case 9:
                    z12 = b.w(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zznm(phoneMultiFactorInfo, str, str2, j10, z10, z11, str3, str4, z12);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zznm[i10];
    }
}
