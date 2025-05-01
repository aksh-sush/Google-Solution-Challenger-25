package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzac implements Parcelable.Creator<PhoneAuthCredential> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z10 = false;
        boolean z11 = false;
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
                    z10 = b.w(parcel, C);
                    break;
                case 4:
                    str3 = b.p(parcel, C);
                    break;
                case 5:
                    z11 = b.w(parcel, C);
                    break;
                case 6:
                    str4 = b.p(parcel, C);
                    break;
                case 7:
                    str5 = b.p(parcel, C);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new PhoneAuthCredential(str, str2, z10, str3, z11, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new PhoneAuthCredential[i10];
    }
}
