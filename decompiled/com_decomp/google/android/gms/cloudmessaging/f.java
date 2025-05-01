package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator {
    f() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
