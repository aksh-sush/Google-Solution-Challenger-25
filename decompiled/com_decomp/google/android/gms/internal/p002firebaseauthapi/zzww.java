package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww  reason: invalid package */
public final class zzww extends a {
    public static final Parcelable.Creator<zzww> CREATOR = new zzwx();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;

    public zzww() {
    }

    zzww(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zza, false);
        c.D(parcel, 3, this.zzb, false);
        c.D(parcel, 4, this.zzc, false);
        c.D(parcel, 5, this.zzd, false);
        c.D(parcel, 6, this.zze, false);
        c.D(parcel, 7, this.zzf, false);
        c.D(parcel, 8, this.zzg, false);
        c.b(parcel, a10);
    }

    public final Uri zza() {
        if (!TextUtils.isEmpty(this.zzc)) {
            return Uri.parse(this.zzc);
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zze;
    }

    public final void zzh(String str) {
        this.zze = str;
    }
}
