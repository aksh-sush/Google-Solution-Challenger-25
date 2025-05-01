package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0094a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final n f6998e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final n f6999f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final c f7000g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n f7001h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int f7002i;

    /* renamed from: j  reason: collision with root package name */
    private final int f7003j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7004k;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    class C0094a implements Parcelable.Creator {
        C0094a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<n> cls = n.class;
            return new a((n) parcel.readParcelable(cls.getClassLoader()), (n) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (n) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (C0094a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        static final long f7005f = z.a(n.c(1900, 0).f7088j);

        /* renamed from: g  reason: collision with root package name */
        static final long f7006g = z.a(n.c(2100, 11).f7088j);

        /* renamed from: a  reason: collision with root package name */
        private long f7007a = f7005f;

        /* renamed from: b  reason: collision with root package name */
        private long f7008b = f7006g;

        /* renamed from: c  reason: collision with root package name */
        private Long f7009c;

        /* renamed from: d  reason: collision with root package name */
        private int f7010d;

        /* renamed from: e  reason: collision with root package name */
        private c f7011e = g.a(Long.MIN_VALUE);

        b(a aVar) {
            this.f7007a = aVar.f6998e.f7088j;
            this.f7008b = aVar.f6999f.f7088j;
            this.f7009c = Long.valueOf(aVar.f7001h.f7088j);
            this.f7010d = aVar.f7002i;
            this.f7011e = aVar.f7000g;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7011e);
            n d10 = n.d(this.f7007a);
            n d11 = n.d(this.f7008b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7009c;
            return new a(d10, d11, cVar, l10 == null ? null : n.d(l10.longValue()), this.f7010d, (C0094a) null);
        }

        public b b(long j10) {
            this.f7009c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean h(long j10);
    }

    private a(n nVar, n nVar2, c cVar, n nVar3, int i10) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f6998e = nVar;
        this.f6999f = nVar2;
        this.f7001h = nVar3;
        this.f7002i = i10;
        this.f7000g = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i10 < 0 || i10 > z.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f7004k = nVar.q(nVar2) + 1;
            this.f7003j = (nVar2.f7085g - nVar.f7085g) + 1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6998e.equals(aVar.f6998e) && this.f6999f.equals(aVar.f6999f) && androidx.core.util.c.a(this.f7001h, aVar.f7001h) && this.f7002i == aVar.f7002i && this.f7000g.equals(aVar.f7000g);
    }

    public c f() {
        return this.f7000g;
    }

    /* access modifiers changed from: package-private */
    public n g() {
        return this.f6999f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6998e, this.f6999f, this.f7001h, Integer.valueOf(this.f7002i), this.f7000g});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f7002i;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f7004k;
    }

    /* access modifiers changed from: package-private */
    public n k() {
        return this.f7001h;
    }

    /* access modifiers changed from: package-private */
    public n l() {
        return this.f6998e;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f7003j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6998e, 0);
        parcel.writeParcelable(this.f6999f, 0);
        parcel.writeParcelable(this.f7001h, 0);
        parcel.writeParcelable(this.f7000g, 0);
        parcel.writeInt(this.f7002i);
    }

    /* synthetic */ a(n nVar, n nVar2, c cVar, n nVar3, int i10, C0094a aVar) {
        this(nVar, nVar2, cVar, nVar3, i10);
    }
}
