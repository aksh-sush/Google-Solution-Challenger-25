package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import s3.b;

public final class zzbc implements Parcelable.Creator<zzbb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, PhoneMultiFactorInfo.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzbb(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzbb[i10];
    }
}
