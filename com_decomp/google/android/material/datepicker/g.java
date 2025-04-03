package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class g implements a.c {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final long f7028e;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    private g(long j10) {
        this.f7028e = j10;
    }

    public static g a(long j10) {
        return new g(j10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f7028e == ((g) obj).f7028e;
    }

    public boolean h(long j10) {
        return j10 >= this.f7028e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7028e)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7028e);
    }

    /* synthetic */ g(long j10, a aVar) {
        this(j10);
    }
}
