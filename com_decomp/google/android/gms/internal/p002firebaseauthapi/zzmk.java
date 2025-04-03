package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmk  reason: invalid package */
public final class zzmk extends a {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();
    private final String zza;
    private final zzxq zzb;

    public zzmk(String str, zzxq zzxq) {
        this.zza = str;
        this.zzb = zzxq;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.b(parcel, a10);
    }

    public final zzxq zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
