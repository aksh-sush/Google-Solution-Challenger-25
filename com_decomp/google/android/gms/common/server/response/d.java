package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import s3.b;

public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        w3.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    i10 = b.E(parcel, C);
                    break;
                case 2:
                    i11 = b.E(parcel, C);
                    break;
                case 3:
                    z10 = b.w(parcel, C);
                    break;
                case 4:
                    i12 = b.E(parcel, C);
                    break;
                case 5:
                    z11 = b.w(parcel, C);
                    break;
                case 6:
                    str = b.p(parcel, C);
                    break;
                case 7:
                    i13 = b.E(parcel, C);
                    break;
                case 8:
                    str2 = b.p(parcel, C);
                    break;
                case 9:
                    bVar = (w3.b) b.o(parcel, C, w3.b.CREATOR);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new a.C0089a(i10, i11, z10, i12, z11, str, i13, str2, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.C0089a[i10];
    }
}
