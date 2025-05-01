package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly  reason: invalid package */
public final class zzly extends a {
    public static final Parcelable.Creator<zzly> CREATOR = new zzlz();
    private final String zza;

    public zzly(String str) {
        this.zza = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.zza;
    }
}
