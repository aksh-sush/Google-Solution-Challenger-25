package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.c;

public final class a extends s3.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: e  reason: collision with root package name */
    private Intent f5184e;

    public a(Intent intent) {
        this.f5184e = intent;
    }

    public final Intent U() {
        return this.f5184e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.f5184e, i10, false);
        c.b(parcel, a10);
    }
}
