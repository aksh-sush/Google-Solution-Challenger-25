package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: e  reason: collision with root package name */
    public final String f6408e;

    /* renamed from: f  reason: collision with root package name */
    public final r f6409f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6410g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6411h;

    t(t tVar, long j10) {
        s.k(tVar);
        this.f6408e = tVar.f6408e;
        this.f6409f = tVar.f6409f;
        this.f6410g = tVar.f6410g;
        this.f6411h = j10;
    }

    public final String toString() {
        String str = this.f6410g;
        String str2 = this.f6408e;
        String valueOf = String.valueOf(this.f6409f);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        u.a(this, parcel, i10);
    }

    public t(String str, r rVar, String str2, long j10) {
        this.f6408e = str;
        this.f6409f = rVar;
        this.f6410g = str2;
        this.f6411h = j10;
    }
}
