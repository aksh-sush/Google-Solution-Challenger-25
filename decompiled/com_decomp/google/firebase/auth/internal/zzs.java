package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.zze;
import s3.b;

public final class zzs implements Parcelable.Creator<zzr> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        zzx zzx = null;
        zzp zzp = null;
        zze zze = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                zzx = (zzx) b.o(parcel, C, zzx.CREATOR);
            } else if (v10 == 2) {
                zzp = (zzp) b.o(parcel, C, zzp.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                zze = (zze) b.o(parcel, C, zze.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzr(zzx, zzp, zze);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
