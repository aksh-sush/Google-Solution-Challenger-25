package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import s3.c;

public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzag();
    private String zza;
    private String zzb;

    TwitterAuthCredential(String str, String str2) {
        this.zza = s.g(str);
        this.zzb = s.g(str2);
    }

    public static zzxq zzb(TwitterAuthCredential twitterAuthCredential, String str) {
        s.k(twitterAuthCredential);
        return new zzxq((String) null, twitterAuthCredential.zza, twitterAuthCredential.getProvider(), (String) null, twitterAuthCredential.zzb, (String) null, str, (String) null, (String) null);
    }

    public String getProvider() {
        return "twitter.com";
    }

    public String getSignInMethod() {
        return "twitter.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return new TwitterAuthCredential(this.zza, this.zzb);
    }
}
