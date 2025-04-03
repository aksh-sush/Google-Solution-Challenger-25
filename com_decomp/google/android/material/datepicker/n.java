package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Calendar f7083e;

    /* renamed from: f  reason: collision with root package name */
    final int f7084f;

    /* renamed from: g  reason: collision with root package name */
    final int f7085g;

    /* renamed from: h  reason: collision with root package name */
    final int f7086h;

    /* renamed from: i  reason: collision with root package name */
    final int f7087i;

    /* renamed from: j  reason: collision with root package name */
    final long f7088j;

    /* renamed from: k  reason: collision with root package name */
    private String f7089k;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return n.c(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    private n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c10 = z.c(calendar);
        this.f7083e = c10;
        this.f7084f = c10.get(2);
        this.f7085g = c10.get(1);
        this.f7086h = c10.getMaximum(7);
        this.f7087i = c10.getActualMaximum(5);
        this.f7088j = c10.getTimeInMillis();
    }

    static n c(int i10, int i11) {
        Calendar k10 = z.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new n(k10);
    }

    static n d(long j10) {
        Calendar k10 = z.k();
        k10.setTimeInMillis(j10);
        return new n(k10);
    }

    static n f() {
        return new n(z.i());
    }

    /* renamed from: a */
    public int compareTo(n nVar) {
        return this.f7083e.compareTo(nVar.f7083e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f7084f == nVar.f7084f && this.f7085g == nVar.f7085g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7084f), Integer.valueOf(this.f7085g)});
    }

    /* access modifiers changed from: package-private */
    public int i(int i10) {
        int i11 = this.f7083e.get(7);
        if (i10 <= 0) {
            i10 = this.f7083e.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f7086h : i12;
    }

    /* access modifiers changed from: package-private */
    public long l(int i10) {
        Calendar c10 = z.c(this.f7083e);
        c10.set(5, i10);
        return c10.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public int m(long j10) {
        Calendar c10 = z.c(this.f7083e);
        c10.setTimeInMillis(j10);
        return c10.get(5);
    }

    /* access modifiers changed from: package-private */
    public String n() {
        if (this.f7089k == null) {
            this.f7089k = f.f(this.f7083e.getTimeInMillis());
        }
        return this.f7089k;
    }

    /* access modifiers changed from: package-private */
    public long o() {
        return this.f7083e.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public n p(int i10) {
        Calendar c10 = z.c(this.f7083e);
        c10.add(2, i10);
        return new n(c10);
    }

    /* access modifiers changed from: package-private */
    public int q(n nVar) {
        if (this.f7083e instanceof GregorianCalendar) {
            return ((nVar.f7085g - this.f7085g) * 12) + (nVar.f7084f - this.f7084f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7085g);
        parcel.writeInt(this.f7084f);
    }
}
