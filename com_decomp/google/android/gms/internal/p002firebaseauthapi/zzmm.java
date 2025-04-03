package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmm  reason: invalid package */
public final class zzmm extends a {
    public static final Parcelable.Creator<zzmm> CREATOR = new zzmn();
    private final String zza;
    private final PhoneAuthCredential zzb;

    public zzmm(String str, PhoneAuthCredential phoneAuthCredential) {
        this.zza = str;
        this.zzb = phoneAuthCredential;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.b(parcel, a10);
    }

    public final PhoneAuthCredential zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
