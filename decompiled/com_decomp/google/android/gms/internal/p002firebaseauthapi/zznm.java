package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznm  reason: invalid package */
public final class zznm extends a {
    public static final Parcelable.Creator<zznm> CREATOR = new zznn();
    private final PhoneMultiFactorInfo zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;

    public zznm(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        this.zza = phoneMultiFactorInfo;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = str3;
        this.zzh = str4;
        this.zzi = z12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
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

    public final PhoneMultiFactorInfo zzb() {
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
