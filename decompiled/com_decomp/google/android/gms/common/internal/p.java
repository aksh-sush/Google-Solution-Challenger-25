package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new o0();

    /* renamed from: e  reason: collision with root package name */
    private final int f5675e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5676f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5677g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5678h;

    /* renamed from: i  reason: collision with root package name */
    private final long f5679i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5680j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5681k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5682l;

    /* renamed from: m  reason: collision with root package name */
    private final int f5683m;

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f5675e = i10;
        this.f5676f = i11;
        this.f5677g = i12;
        this.f5678h = j10;
        this.f5679i = j11;
        this.f5680j = str;
        this.f5681k = str2;
        this.f5682l = i13;
        this.f5683m = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5675e);
        c.t(parcel, 2, this.f5676f);
        c.t(parcel, 3, this.f5677g);
        c.w(parcel, 4, this.f5678h);
        c.w(parcel, 5, this.f5679i);
        c.D(parcel, 6, this.f5680j, false);
        c.D(parcel, 7, this.f5681k, false);
        c.t(parcel, 8, this.f5682l);
        c.t(parcel, 9, this.f5683m);
        c.b(parcel, a10);
    }
}
