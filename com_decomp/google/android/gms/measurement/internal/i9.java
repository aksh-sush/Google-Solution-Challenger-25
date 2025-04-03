package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.util.List;
import s3.a;
import s3.c;

public final class i9 extends a {
    public static final Parcelable.Creator<i9> CREATOR = new j9();

    /* renamed from: e  reason: collision with root package name */
    public final String f6059e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6060f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6061g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6062h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6063i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6064j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6065k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6066l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6067m;

    /* renamed from: n  reason: collision with root package name */
    public final long f6068n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6069o;

    /* renamed from: p  reason: collision with root package name */
    public final long f6070p;

    /* renamed from: q  reason: collision with root package name */
    public final long f6071q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6072r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6073s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6074t;

    /* renamed from: u  reason: collision with root package name */
    public final String f6075u;

    /* renamed from: v  reason: collision with root package name */
    public final Boolean f6076v;

    /* renamed from: w  reason: collision with root package name */
    public final long f6077w;

    /* renamed from: x  reason: collision with root package name */
    public final List f6078x;

    /* renamed from: y  reason: collision with root package name */
    public final String f6079y;

    /* renamed from: z  reason: collision with root package name */
    public final String f6080z;

    i9(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9) {
        s.g(str);
        this.f6059e = str;
        this.f6060f = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f6061g = str3;
        this.f6068n = j10;
        this.f6062h = str4;
        this.f6063i = j11;
        this.f6064j = j12;
        this.f6065k = str5;
        this.f6066l = z10;
        this.f6067m = z11;
        this.f6069o = str6;
        this.f6070p = j13;
        this.f6071q = j14;
        this.f6072r = i10;
        this.f6073s = z12;
        this.f6074t = z13;
        this.f6075u = str7;
        this.f6076v = bool;
        this.f6077w = j15;
        this.f6078x = list;
        this.f6079y = str8;
        this.f6080z = str9;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.f6059e, false);
        c.D(parcel, 3, this.f6060f, false);
        c.D(parcel, 4, this.f6061g, false);
        c.D(parcel, 5, this.f6062h, false);
        c.w(parcel, 6, this.f6063i);
        c.w(parcel, 7, this.f6064j);
        c.D(parcel, 8, this.f6065k, false);
        c.g(parcel, 9, this.f6066l);
        c.g(parcel, 10, this.f6067m);
        c.w(parcel, 11, this.f6068n);
        c.D(parcel, 12, this.f6069o, false);
        c.w(parcel, 13, this.f6070p);
        c.w(parcel, 14, this.f6071q);
        c.t(parcel, 15, this.f6072r);
        c.g(parcel, 16, this.f6073s);
        c.g(parcel, 18, this.f6074t);
        c.D(parcel, 19, this.f6075u, false);
        c.i(parcel, 21, this.f6076v, false);
        c.w(parcel, 22, this.f6077w);
        c.F(parcel, 23, this.f6078x, false);
        c.D(parcel, 24, this.f6079y, false);
        c.D(parcel, 25, this.f6080z, false);
        c.b(parcel, a10);
    }

    i9(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9) {
        this.f6059e = str;
        this.f6060f = str2;
        this.f6061g = str3;
        this.f6068n = j12;
        this.f6062h = str4;
        this.f6063i = j10;
        this.f6064j = j11;
        this.f6065k = str5;
        this.f6066l = z10;
        this.f6067m = z11;
        this.f6069o = str6;
        this.f6070p = j13;
        this.f6071q = j14;
        this.f6072r = i10;
        this.f6073s = z12;
        this.f6074t = z13;
        this.f6075u = str7;
        this.f6076v = bool;
        this.f6077w = j15;
        this.f6078x = list;
        this.f6079y = str8;
        this.f6080z = str9;
    }
}
