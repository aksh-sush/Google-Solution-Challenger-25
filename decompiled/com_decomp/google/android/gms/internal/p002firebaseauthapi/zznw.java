package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznw  reason: invalid package */
public final class zznw extends a {
    public static final Parcelable.Creator<zznw> CREATOR = new zznx();
    private final String zza;
    private final String zzb;
    private final ActionCodeSettings zzc;

    public zznw(String str, String str2, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.B(parcel, 3, this.zzc, i10, false);
        c.b(parcel, a10);
    }

    public final ActionCodeSettings zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
