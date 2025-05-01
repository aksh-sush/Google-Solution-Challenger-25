package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.zze;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzny  reason: invalid package */
public final class zzny extends a {
    public static final Parcelable.Creator<zzny> CREATOR = new zznz();
    private final Status zza;
    private final zze zzb;
    private final String zzc;
    private final String zzd;

    public zzny(Status status, zze zze, String str, String str2) {
        this.zza = status;
        this.zzb = zze;
        this.zzc = str;
        this.zzd = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.D(parcel, 3, this.zzc, false);
        c.D(parcel, 4, this.zzd, false);
        c.b(parcel, a10);
    }

    public final Status zza() {
        return this.zza;
    }

    public final zze zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
