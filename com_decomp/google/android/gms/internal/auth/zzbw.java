package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
