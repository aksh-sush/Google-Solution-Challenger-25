package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznu  reason: invalid package */
public final class zznu extends a {
    public static final Parcelable.Creator<zznu> CREATOR = new zznv();
    private final UserProfileChangeRequest zza;
    private final String zzb;

    public zznu(UserProfileChangeRequest userProfileChangeRequest, String str) {
        this.zza = userProfileChangeRequest;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final UserProfileChangeRequest zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
