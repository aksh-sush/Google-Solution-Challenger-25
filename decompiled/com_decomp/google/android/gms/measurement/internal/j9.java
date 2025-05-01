package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import s3.b;

public final class j9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = "";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str9 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str2 = b.p(parcel2, C);
                    break;
                case 3:
                    str3 = b.p(parcel2, C);
                    break;
                case 4:
                    str4 = b.p(parcel2, C);
                    break;
                case 5:
                    str5 = b.p(parcel2, C);
                    break;
                case 6:
                    j10 = b.G(parcel2, C);
                    break;
                case 7:
                    j11 = b.G(parcel2, C);
                    break;
                case 8:
                    str6 = b.p(parcel2, C);
                    break;
                case 9:
                    z10 = b.w(parcel2, C);
                    break;
                case 10:
                    z11 = b.w(parcel2, C);
                    break;
                case 11:
                    j15 = b.G(parcel2, C);
                    break;
                case 12:
                    str7 = b.p(parcel2, C);
                    break;
                case 13:
                    j12 = b.G(parcel2, C);
                    break;
                case 14:
                    j13 = b.G(parcel2, C);
                    break;
                case 15:
                    i10 = b.E(parcel2, C);
                    break;
                case 16:
                    z12 = b.w(parcel2, C);
                    break;
                case 18:
                    z13 = b.w(parcel2, C);
                    break;
                case 19:
                    str8 = b.p(parcel2, C);
                    break;
                case 21:
                    bool = b.x(parcel2, C);
                    break;
                case 22:
                    j14 = b.G(parcel2, C);
                    break;
                case 23:
                    arrayList = b.r(parcel2, C);
                    break;
                case 24:
                    str9 = b.p(parcel2, C);
                    break;
                case 25:
                    str = b.p(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new i9(str2, str3, str4, str5, j10, j11, str6, z10, z11, j15, str7, j12, j13, i10, z12, z13, str8, bool, j14, (List) arrayList, str9, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new i9[i10];
    }
}
