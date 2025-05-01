package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = s3.b.L(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < L) {
            int C = s3.b.C(parcel);
            int v10 = s3.b.v(C);
            if (v10 == 1) {
                strArr = s3.b.q(parcel, C);
            } else if (v10 == 2) {
                cursorWindowArr = (CursorWindow[]) s3.b.s(parcel, C, CursorWindow.CREATOR);
            } else if (v10 == 3) {
                i11 = s3.b.E(parcel, C);
            } else if (v10 == 4) {
                bundle = s3.b.f(parcel, C);
            } else if (v10 != 1000) {
                s3.b.K(parcel, C);
            } else {
                i10 = s3.b.E(parcel, C);
            }
        }
        s3.b.u(parcel, L);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.X();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
