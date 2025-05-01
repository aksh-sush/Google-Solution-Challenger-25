package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.EmailAuthCredential;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzng  reason: invalid package */
public final class zzng extends a {
    public static final Parcelable.Creator<zzng> CREATOR = new zznh();
    private final EmailAuthCredential zza;

    public zzng(EmailAuthCredential emailAuthCredential) {
        this.zza = emailAuthCredential;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.b(parcel, a10);
    }

    public final EmailAuthCredential zza() {
        return this.zza;
    }
}
