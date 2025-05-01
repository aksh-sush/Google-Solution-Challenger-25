package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final c f7503e;

    /* renamed from: f  reason: collision with root package name */
    private final c f7504f;

    /* renamed from: g  reason: collision with root package name */
    final int f7505g;

    /* renamed from: h  reason: collision with root package name */
    int f7506h;

    /* renamed from: i  reason: collision with root package name */
    int f7507i;

    /* renamed from: j  reason: collision with root package name */
    int f7508j;

    /* renamed from: k  reason: collision with root package name */
    int f7509k;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(int i10, int i11, int i12, int i13) {
        this.f7506h = i10;
        this.f7507i = i11;
        this.f7508j = i12;
        this.f7505g = i13;
        this.f7509k = c(i10);
        this.f7503e = new c(59);
        this.f7504f = new c(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7506h == fVar.f7506h && this.f7507i == fVar.f7507i && this.f7505g == fVar.f7505g && this.f7508j == fVar.f7508j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7505g), Integer.valueOf(this.f7506h), Integer.valueOf(this.f7507i), Integer.valueOf(this.f7508j)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7506h);
        parcel.writeInt(this.f7507i);
        parcel.writeInt(this.f7508j);
        parcel.writeInt(this.f7505g);
    }

    protected f(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
