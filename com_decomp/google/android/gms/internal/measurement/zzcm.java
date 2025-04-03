package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzcm implements Parcelable.Creator<zzcl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    j10 = b.G(parcel2, C);
                    break;
                case 2:
                    j11 = b.G(parcel2, C);
                    break;
                case 3:
                    z10 = b.w(parcel2, C);
                    break;
                case 4:
                    str = b.p(parcel2, C);
                    break;
                case 5:
                    str2 = b.p(parcel2, C);
                    break;
                case 6:
                    str3 = b.p(parcel2, C);
                    break;
                case 7:
                    bundle = b.f(parcel2, C);
                    break;
                case 8:
                    str4 = b.p(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zzcl(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzcl[i10];
    }
}
