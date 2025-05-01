package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import s3.b;

/* renamed from: com.google.android.gms.internal.auth-api.zbq  reason: invalid package */
public final class zbq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                credential = (Credential) b.o(parcel, C, Credential.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zbp(credential);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbp[i10];
    }
}
