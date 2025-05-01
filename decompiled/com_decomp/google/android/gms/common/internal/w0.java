package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;
import q3.b;
import s3.a;
import s3.c;

public final class w0 extends a {
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    /* renamed from: e  reason: collision with root package name */
    final int f5722e;

    /* renamed from: f  reason: collision with root package name */
    final IBinder f5723f;

    /* renamed from: g  reason: collision with root package name */
    private final b f5724g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5725h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5726i;

    w0(int i10, IBinder iBinder, b bVar, boolean z10, boolean z11) {
        this.f5722e = i10;
        this.f5723f = iBinder;
        this.f5724g = bVar;
        this.f5725h = z10;
        this.f5726i = z11;
    }

    public final b U() {
        return this.f5724g;
    }

    public final k V() {
        IBinder iBinder = this.f5723f;
        if (iBinder == null) {
            return null;
        }
        return k.a.c(iBinder);
    }

    public final boolean W() {
        return this.f5725h;
    }

    public final boolean X() {
        return this.f5726i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f5724g.equals(w0Var.f5724g) && q.b(V(), w0Var.V());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5722e);
        c.s(parcel, 2, this.f5723f, false);
        c.B(parcel, 3, this.f5724g, i10, false);
        c.g(parcel, 4, this.f5725h);
        c.g(parcel, 5, this.f5726i);
        c.b(parcel, a10);
    }
}
