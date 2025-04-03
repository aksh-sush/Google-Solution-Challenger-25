package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import s3.a;
import s3.c;

public final class r extends a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new s();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f6371e;

    r(Bundle bundle) {
        this.f6371e = bundle;
    }

    public final Bundle V() {
        return new Bundle(this.f6371e);
    }

    /* access modifiers changed from: package-private */
    public final Double W(String str) {
        return Double.valueOf(this.f6371e.getDouble(FirebaseAnalytics.Param.VALUE));
    }

    /* access modifiers changed from: package-private */
    public final Long X(String str) {
        return Long.valueOf(this.f6371e.getLong(FirebaseAnalytics.Param.VALUE));
    }

    public final Iterator iterator() {
        return new q(this);
    }

    /* access modifiers changed from: package-private */
    public final Object j0(String str) {
        return this.f6371e.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String l0(String str) {
        return this.f6371e.getString(str);
    }

    public final String toString() {
        return this.f6371e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 2, V(), false);
        c.b(parcel, a10);
    }

    public final int zza() {
        return this.f6371e.size();
    }
}
