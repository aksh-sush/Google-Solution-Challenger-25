package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import s3.c;

public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzh();
    private final String zza;

    FacebookAuthCredential(String str) {
        this.zza = s.g(str);
    }

    public static zzxq zzb(FacebookAuthCredential facebookAuthCredential, String str) {
        s.k(facebookAuthCredential);
        return new zzxq((String) null, facebookAuthCredential.zza, facebookAuthCredential.getProvider(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String getProvider() {
        return "facebook.com";
    }

    public String getSignInMethod() {
        return "facebook.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return new FacebookAuthCredential(this.zza);
    }
}
