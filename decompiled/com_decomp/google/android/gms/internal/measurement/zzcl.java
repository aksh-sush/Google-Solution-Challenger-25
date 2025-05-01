package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public final class zzcl extends a {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, this.zza);
        c.w(parcel, 2, this.zzb);
        c.g(parcel, 3, this.zzc);
        c.D(parcel, 4, this.zzd, false);
        c.D(parcel, 5, this.zze, false);
        c.D(parcel, 6, this.zzf, false);
        c.j(parcel, 7, this.zzg, false);
        c.D(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }
}
