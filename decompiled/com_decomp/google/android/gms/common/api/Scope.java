package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* renamed from: e  reason: collision with root package name */
    final int f5265e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5266f;

    Scope(int i10, String str) {
        s.h(str, "scopeUri must not be null or empty");
        this.f5265e = i10;
        this.f5266f = str;
    }

    public String U() {
        return this.f5266f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5266f.equals(((Scope) obj).f5266f);
    }

    public int hashCode() {
        return this.f5266f.hashCode();
    }

    public String toString() {
        return this.f5266f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5265e);
        c.D(parcel, 2, U(), false);
        c.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
