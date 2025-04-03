package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q3.d;
import s3.a;
import s3.c;

public final class u1 extends a {
    public static final Parcelable.Creator<u1> CREATOR = new v1();

    /* renamed from: e  reason: collision with root package name */
    Bundle f5714e;

    /* renamed from: f  reason: collision with root package name */
    d[] f5715f;

    /* renamed from: g  reason: collision with root package name */
    int f5716g;

    /* renamed from: h  reason: collision with root package name */
    e f5717h;

    u1(Bundle bundle, d[] dVarArr, int i10, e eVar) {
        this.f5714e = bundle;
        this.f5715f = dVarArr;
        this.f5716g = i10;
        this.f5717h = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f5714e, false);
        c.G(parcel, 2, this.f5715f, i10, false);
        c.t(parcel, 3, this.f5716g);
        c.B(parcel, 4, this.f5717h, i10, false);
        c.b(parcel, a10);
    }
}
