package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                i10 = b.E(parcel, C);
            } else if (v10 == 2) {
                str = b.p(parcel, C);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, g.CREATOR);
            }
        }
        b.u(parcel, L);
        return new f(i10, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
