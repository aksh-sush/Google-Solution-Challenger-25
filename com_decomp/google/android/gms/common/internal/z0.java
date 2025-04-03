package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import s3.b;

public final class z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        Scope[] scopeArr = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C);
            } else if (v10 == 3) {
                i12 = b.E(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                scopeArr = (Scope[]) b.s(parcel, C, Scope.CREATOR);
            }
        }
        b.u(parcel, L);
        return new y0(i10, i11, i12, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y0[i10];
    }
}
