package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznc  reason: invalid package */
public final class zznc extends a {
    public static final Parcelable.Creator<zznc> CREATOR = new zznd();
    private final String zza;
    private final String zzb;

    public zznc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
