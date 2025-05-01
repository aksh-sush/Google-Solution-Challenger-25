package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import s3.b;

public final class zzy implements Parcelable.Creator<zzx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        zzwq zzwq = null;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzz = null;
        zze zze = null;
        zzbb zzbb = null;
        boolean z10 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    zzwq = (zzwq) b.o(parcel2, C, zzwq.CREATOR);
                    break;
                case 2:
                    zzt = (zzt) b.o(parcel2, C, zzt.CREATOR);
                    break;
                case 3:
                    str = b.p(parcel2, C);
                    break;
                case 4:
                    str2 = b.p(parcel2, C);
                    break;
                case 5:
                    arrayList = b.t(parcel2, C, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = b.r(parcel2, C);
                    break;
                case 7:
                    str3 = b.p(parcel2, C);
                    break;
                case 8:
                    bool = b.x(parcel2, C);
                    break;
                case 9:
                    zzz = (zzz) b.o(parcel2, C, zzz.CREATOR);
                    break;
                case 10:
                    z10 = b.w(parcel2, C);
                    break;
                case 11:
                    zze = (zze) b.o(parcel2, C, zze.CREATOR);
                    break;
                case 12:
                    zzbb = (zzbb) b.o(parcel2, C, zzbb.CREATOR);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zzx(zzwq, zzt, str, str2, arrayList, arrayList2, str3, bool, zzz, z10, zze, zzbb);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzx[i10];
    }
}
