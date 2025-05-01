package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q3.d;
import s3.b;

public final class v1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        e eVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                bundle = b.f(parcel, C);
            } else if (v10 == 2) {
                dVarArr = (d[]) b.s(parcel, C, d.CREATOR);
            } else if (v10 == 3) {
                i10 = b.E(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                eVar = (e) b.o(parcel, C, e.CREATOR);
            }
        }
        b.u(parcel, L);
        return new u1(bundle, dVarArr, i10, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u1[i10];
    }
}
