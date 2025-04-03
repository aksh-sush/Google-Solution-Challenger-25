package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import s3.a;
import s3.c;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: e  reason: collision with root package name */
    final int f5761e;

    /* renamed from: f  reason: collision with root package name */
    final String f5762f;

    /* renamed from: g  reason: collision with root package name */
    final a.C0089a f5763g;

    g(int i10, String str, a.C0089a aVar) {
        this.f5761e = i10;
        this.f5762f = str;
        this.f5763g = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5761e);
        c.D(parcel, 2, this.f5762f, false);
        c.B(parcel, 3, this.f5763g, i10, false);
        c.b(parcel, a10);
    }

    g(String str, a.C0089a aVar) {
        this.f5761e = 1;
        this.f5762f = str;
        this.f5763g = aVar;
    }
}
