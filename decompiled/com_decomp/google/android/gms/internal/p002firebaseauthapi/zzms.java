package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzms  reason: invalid package */
public final class zzms extends a {
    public static final Parcelable.Creator<zzms> CREATOR = new zzmt();
    private final String zza;
    private final ActionCodeSettings zzb;
    private final String zzc;

    public zzms(String str, ActionCodeSettings actionCodeSettings, String str2) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.D(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }

    public final ActionCodeSettings zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }
}
