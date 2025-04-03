package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import s3.a;
import s3.c;

public final class y0 extends a {
    public static final Parcelable.Creator<y0> CREATOR = new z0();

    /* renamed from: e  reason: collision with root package name */
    final int f5727e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5728f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5729g;

    /* renamed from: h  reason: collision with root package name */
    private final Scope[] f5730h;

    y0(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f5727e = i10;
        this.f5728f = i11;
        this.f5729g = i12;
        this.f5730h = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5727e);
        c.t(parcel, 2, this.f5728f);
        c.t(parcel, 3, this.f5729g);
        c.G(parcel, 4, this.f5730h, i10, false);
        c.b(parcel, a10);
    }
}
