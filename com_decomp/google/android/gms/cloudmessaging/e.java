package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 1) {
                b.K(parcel, C);
            } else {
                intent = (Intent) b.o(parcel, C, Intent.CREATOR);
            }
        }
        b.u(parcel, L);
        return new a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
