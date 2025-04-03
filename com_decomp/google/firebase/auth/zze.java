package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaf;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import s3.c;

public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzxq zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    zze(String str, String str2, String str3, zzxq zzxq, String str4, String str5, String str6) {
        this.zza = zzaf.zzc(str);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzxq;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
    }

    public static zze zzb(zzxq zzxq) {
        s.l(zzxq, "Must specify a non-null webSignInCredential");
        return new zze((String) null, (String) null, (String) null, zzxq, (String) null, (String) null, (String) null);
    }

    public static zze zzc(String str, String str2, String str3, String str4, String str5) {
        s.h(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, (zzxq) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public static zzxq zzd(zze zze2, String str) {
        s.k(zze2);
        zzxq zzxq = zze2.zzd;
        if (zzxq != null) {
            return zzxq;
        }
        return new zzxq(zze2.zzb, zze2.zzc, zze2.zza, (String) null, zze2.zzf, (String) null, str, zze2.zze, zze2.zzg);
    }

    public final String getAccessToken() {
        return this.zzc;
    }

    public final String getIdToken() {
        return this.zzb;
    }

    public final String getProvider() {
        return this.zza;
    }

    public final String getSecret() {
        return this.zzf;
    }

    public final String getSignInMethod() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.B(parcel, 4, this.zzd, i10, false);
        c.D(parcel, 5, this.zze, false);
        c.D(parcel, 6, this.zzf, false);
        c.D(parcel, 7, this.zzg, false);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return new zze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }
}
