package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public final class m1 extends a {
    public static final Parcelable.Creator<m1> CREATOR = new n1();

    /* renamed from: e  reason: collision with root package name */
    final int f5670e;

    m1(int i10) {
        this.f5670e = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5670e);
        c.b(parcel, a10);
    }
}
