package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;

public final class z8 extends a {
    public static final Parcelable.Creator<z8> CREATOR = new a9();

    /* renamed from: e  reason: collision with root package name */
    public final int f6688e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6689f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6690g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f6691h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6692i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6693j;

    /* renamed from: k  reason: collision with root package name */
    public final Double f6694k;

    z8(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f6688e = i10;
        this.f6689f = str;
        this.f6690g = j10;
        this.f6691h = l10;
        if (i10 == 1) {
            this.f6694k = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f6694k = d10;
        }
        this.f6692i = str2;
        this.f6693j = str3;
    }

    public final Object U() {
        Long l10 = this.f6691h;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f6694k;
        if (d10 != null) {
            return d10;
        }
        String str = this.f6692i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        a9.a(this, parcel, i10);
    }

    z8(b9 b9Var) {
        this(b9Var.f5870c, b9Var.f5871d, b9Var.f5872e, b9Var.f5869b);
    }

    z8(String str, long j10, Object obj, String str2) {
        s.g(str);
        this.f6688e = 2;
        this.f6689f = str;
        this.f6690g = j10;
        this.f6693j = str2;
        if (obj == null) {
            this.f6691h = null;
            this.f6694k = null;
            this.f6692i = null;
        } else if (obj instanceof Long) {
            this.f6691h = (Long) obj;
            this.f6694k = null;
            this.f6692i = null;
        } else if (obj instanceof String) {
            this.f6691h = null;
            this.f6694k = null;
            this.f6692i = (String) obj;
        } else if (obj instanceof Double) {
            this.f6691h = null;
            this.f6694k = (Double) obj;
            this.f6692i = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
