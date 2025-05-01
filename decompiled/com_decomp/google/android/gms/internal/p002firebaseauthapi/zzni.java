package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzni  reason: invalid package */
public final class zzni extends a {
    public static final Parcelable.Creator<zzni> CREATOR = new zznj();
    private final PhoneAuthCredential zza;
    private final String zzb;

    public zzni(PhoneAuthCredential phoneAuthCredential, String str) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }
}
