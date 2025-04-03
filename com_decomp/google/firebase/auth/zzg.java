package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzg implements Parcelable.Creator<EmailAuthCredential> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C);
            } else if (v10 == 3) {
                str3 = b.p(parcel, C);
            } else if (v10 == 4) {
                str4 = b.p(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                z10 = b.w(parcel, C);
            }
        }
        b.u(parcel, L);
        return new EmailAuthCredential(str, str2, str3, str4, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new EmailAuthCredential[i10];
    }
}
