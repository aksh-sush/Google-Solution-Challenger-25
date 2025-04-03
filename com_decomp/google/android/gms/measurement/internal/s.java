package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 2) {
                b.K(parcel, C);
            } else {
                bundle = b.f(parcel, C);
            }
        }
        b.u(parcel, L);
        return new r(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
