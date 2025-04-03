package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: e  reason: collision with root package name */
    public String f5873e;

    /* renamed from: f  reason: collision with root package name */
    public String f5874f;

    /* renamed from: g  reason: collision with root package name */
    public z8 f5875g;

    /* renamed from: h  reason: collision with root package name */
    public long f5876h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5877i;

    /* renamed from: j  reason: collision with root package name */
    public String f5878j;

    /* renamed from: k  reason: collision with root package name */
    public final t f5879k;

    /* renamed from: l  reason: collision with root package name */
    public long f5880l;

    /* renamed from: m  reason: collision with root package name */
    public t f5881m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5882n;

    /* renamed from: o  reason: collision with root package name */
    public final t f5883o;

    c(c cVar) {
        s.k(cVar);
        this.f5873e = cVar.f5873e;
        this.f5874f = cVar.f5874f;
        this.f5875g = cVar.f5875g;
        this.f5876h = cVar.f5876h;
        this.f5877i = cVar.f5877i;
        this.f5878j = cVar.f5878j;
        this.f5879k = cVar.f5879k;
        this.f5880l = cVar.f5880l;
        this.f5881m = cVar.f5881m;
        this.f5882n = cVar.f5882n;
        this.f5883o = cVar.f5883o;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = s3.c.a(parcel);
        s3.c.D(parcel, 2, this.f5873e, false);
        s3.c.D(parcel, 3, this.f5874f, false);
        s3.c.B(parcel, 4, this.f5875g, i10, false);
        s3.c.w(parcel, 5, this.f5876h);
        s3.c.g(parcel, 6, this.f5877i);
        s3.c.D(parcel, 7, this.f5878j, false);
        s3.c.B(parcel, 8, this.f5879k, i10, false);
        s3.c.w(parcel, 9, this.f5880l);
        s3.c.B(parcel, 10, this.f5881m, i10, false);
        s3.c.w(parcel, 11, this.f5882n);
        s3.c.B(parcel, 12, this.f5883o, i10, false);
        s3.c.b(parcel, a10);
    }

    c(String str, String str2, z8 z8Var, long j10, boolean z10, String str3, t tVar, long j11, t tVar2, long j12, t tVar3) {
        this.f5873e = str;
        this.f5874f = str2;
        this.f5875g = z8Var;
        this.f5876h = j10;
        this.f5877i = z10;
        this.f5878j = str3;
        this.f5879k = tVar;
        this.f5880l = j11;
        this.f5881m = tVar2;
        this.f5882n = j12;
        this.f5883o = tVar3;
    }
}
