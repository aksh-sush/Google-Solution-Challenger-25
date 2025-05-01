package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new l1();

    /* renamed from: e  reason: collision with root package name */
    private final int f5705e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5706f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5707g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5708h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5709i;

    public u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5705e = i10;
        this.f5706f = z10;
        this.f5707g = z11;
        this.f5708h = i11;
        this.f5709i = i12;
    }

    public int U() {
        return this.f5708h;
    }

    public int V() {
        return this.f5709i;
    }

    public boolean W() {
        return this.f5706f;
    }

    public boolean X() {
        return this.f5707g;
    }

    public int j0() {
        return this.f5705e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, j0());
        c.g(parcel, 2, W());
        c.g(parcel, 3, X());
        c.t(parcel, 4, U());
        c.t(parcel, 5, V());
        c.b(parcel, a10);
    }
}
