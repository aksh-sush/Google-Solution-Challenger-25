package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class x0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        IBinder iBinder = null;
        q3.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                iBinder = b.D(parcel, C);
            } else if (v10 == 3) {
                bVar = (q3.b) b.o(parcel, C, q3.b.CREATOR);
            } else if (v10 == 4) {
                z10 = b.w(parcel, C);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                z11 = b.w(parcel, C);
            }
        }
        b.u(parcel, L);
        return new w0(i10, iBinder, bVar, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w0[i10];
    }
}
