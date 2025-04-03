package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.zze;
import java.util.List;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoa  reason: invalid package */
public final class zzoa extends a {
    public static final Parcelable.Creator<zzoa> CREATOR = new zzob();
    final String zza;
    final List<zzwu> zzb;
    final zze zzc;

    public zzoa(String str, List<zzwu> list, zze zze) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zze;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.H(parcel, 2, this.zzb, false);
        c.B(parcel, 3, this.zzc, i10, false);
        c.b(parcel, a10);
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return zzba.zzb(this.zzb);
    }
}
