package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 != 2) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, p.CREATOR);
            }
        }
        b.u(parcel, L);
        return new w(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
