package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import s3.b;

public final class e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        int i10 = 0;
        String str = null;
        a.C0089a aVar = null;
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
                aVar = (a.C0089a) b.o(parcel, C, a.C0089a.CREATOR);
            }
        }
        b.u(parcel, L);
        return new g(i10, str, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
