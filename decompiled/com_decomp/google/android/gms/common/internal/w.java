package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import s3.a;
import s3.c;

public class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* renamed from: e  reason: collision with root package name */
    private final int f5720e;

    /* renamed from: f  reason: collision with root package name */
    private List f5721f;

    public w(int i10, List list) {
        this.f5720e = i10;
        this.f5721f = list;
    }

    public final int U() {
        return this.f5720e;
    }

    public final List V() {
        return this.f5721f;
    }

    public final void W(p pVar) {
        if (this.f5721f == null) {
            this.f5721f = new ArrayList();
        }
        this.f5721f.add(pVar);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5720e);
        c.H(parcel, 2, this.f5721f, false);
        c.b(parcel, a10);
    }
}
