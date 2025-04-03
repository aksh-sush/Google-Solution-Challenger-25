package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new w1();

    /* renamed from: e  reason: collision with root package name */
    private final u f5613e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5614f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5615g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f5616h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5617i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f5618j;

    public e(u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5613e = uVar;
        this.f5614f = z10;
        this.f5615g = z11;
        this.f5616h = iArr;
        this.f5617i = i10;
        this.f5618j = iArr2;
    }

    public int U() {
        return this.f5617i;
    }

    public int[] V() {
        return this.f5616h;
    }

    public int[] W() {
        return this.f5618j;
    }

    public boolean X() {
        return this.f5614f;
    }

    public boolean j0() {
        return this.f5615g;
    }

    public final u l0() {
        return this.f5613e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.f5613e, i10, false);
        c.g(parcel, 2, X());
        c.g(parcel, 3, j0());
        c.u(parcel, 4, V(), false);
        c.t(parcel, 5, U());
        c.u(parcel, 6, W(), false);
        c.b(parcel, a10);
    }
}
