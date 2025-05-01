package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import s3.b;

public final class zzaf implements Parcelable.Creator<zzae> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        ArrayList arrayList = null;
        zzag zzag = null;
        String str = null;
        zze zze = null;
        zzx zzx = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                arrayList = b.t(parcel, C, PhoneMultiFactorInfo.CREATOR);
            } else if (v10 == 2) {
                zzag = (zzag) b.o(parcel, C, zzag.CREATOR);
            } else if (v10 == 3) {
                str = b.p(parcel, C);
            } else if (v10 == 4) {
                zze = (zze) b.o(parcel, C, zze.CREATOR);
            } else if (v10 != 5) {
                b.K(parcel, C);
            } else {
                zzx = (zzx) b.o(parcel, C, zzx.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzae(arrayList, zzag, str, zze, zzx);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzae[i10];
    }
}
