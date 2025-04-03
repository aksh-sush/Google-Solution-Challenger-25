package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import q3.b;
import s3.a;
import s3.c;

public final class Status extends a implements h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new q();

    /* renamed from: j  reason: collision with root package name */
    public static final Status f5267j = new Status(-1);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f5268k = new Status(0);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f5269l = new Status(14);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f5270m = new Status(8);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f5271n = new Status(15);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f5272o = new Status(16);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f5273p = new Status(18);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f5274q = new Status(17);

    /* renamed from: e  reason: collision with root package name */
    final int f5275e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5276f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5277g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f5278h;

    /* renamed from: i  reason: collision with root package name */
    private final b f5279i;

    public Status(int i10) {
        this(i10, (String) null);
    }

    public b U() {
        return this.f5279i;
    }

    public int V() {
        return this.f5276f;
    }

    public String W() {
        return this.f5277g;
    }

    public boolean X() {
        return this.f5278h != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5275e == status.f5275e && this.f5276f == status.f5276f && q.b(this.f5277g, status.f5277g) && q.b(this.f5278h, status.f5278h) && q.b(this.f5279i, status.f5279i);
    }

    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f5275e), Integer.valueOf(this.f5276f), this.f5277g, this.f5278h, this.f5279i);
    }

    public boolean j0() {
        return this.f5276f <= 0;
    }

    public String toString() {
        q.a d10 = q.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f5278h);
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, V());
        c.D(parcel, 2, W(), false);
        c.B(parcel, 3, this.f5278h, i10, false);
        c.B(parcel, 4, U(), i10, false);
        c.t(parcel, 1000, this.f5275e);
        c.b(parcel, a10);
    }

    public final String zza() {
        String str = this.f5277g;
        return str != null ? str : c.a(this.f5276f);
    }

    Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f5275e = i10;
        this.f5276f = i11;
        this.f5277g = str;
        this.f5278h = pendingIntent;
        this.f5279i = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (b) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, (b) null);
    }

    public Status(b bVar, String str) {
        this(bVar, str, 17);
    }

    public Status(b bVar, String str, int i10) {
        this(1, i10, str, bVar.W(), bVar);
    }
}
