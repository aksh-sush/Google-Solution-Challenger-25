package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznk  reason: invalid package */
public final class zznk extends a {
    public static final Parcelable.Creator<zznk> CREATOR = new zznl();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;

    public zznk(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = str4;
        this.zzh = str5;
        this.zzi = z12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.w(parcel, 4, this.zzd);
        c.g(parcel, 5, this.zze);
        c.g(parcel, 6, this.zzf);
        c.D(parcel, 7, this.zzg, false);
        c.D(parcel, 8, this.zzh, false);
        c.g(parcel, 9, this.zzi);
        c.b(parcel, a10);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzi;
    }
}
