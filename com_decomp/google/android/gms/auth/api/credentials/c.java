package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                z10 = b.w(parcel, C);
            } else if (v10 == 2) {
                z11 = b.w(parcel, C);
            } else if (v10 == 3) {
                z12 = b.w(parcel, C);
            } else if (v10 == 4) {
                i11 = b.E(parcel, C);
            } else if (v10 != 1000) {
                b.K(parcel, C);
            } else {
                i10 = b.E(parcel, C);
            }
        }
        b.u(parcel, L);
        return new CredentialPickerConfig(i10, z10, z11, z12, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CredentialPickerConfig[i10];
    }
}
