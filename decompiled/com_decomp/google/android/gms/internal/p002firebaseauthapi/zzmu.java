package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu  reason: invalid package */
public final class zzmu extends a {
    public static final Parcelable.Creator<zzmu> CREATOR = new zzmv();
    private final zzxd zza;

    public zzmu(zzxd zzxd) {
        this.zza = zzxd;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.b(parcel, a10);
    }

    public final zzxd zza() {
        return this.zza;
    }
}
