package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.auth-api.zbu  reason: invalid package */
public final class zbu extends a {
    public static final Parcelable.Creator<zbu> CREATOR = new zbv();
    private final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zba, i10, false);
        c.b(parcel, a10);
    }
}
