package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import s3.c;

public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzaf();
    private final String zza;

    PlayGamesAuthCredential(String str) {
        this.zza = s.g(str);
    }

    public static zzxq zzb(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        s.k(playGamesAuthCredential);
        return new zzxq((String) null, (String) null, playGamesAuthCredential.getProvider(), (String) null, (String) null, playGamesAuthCredential.zza, str, (String) null, (String) null);
    }

    public String getProvider() {
        return "playgames.google.com";
    }

    public String getSignInMethod() {
        return "playgames.google.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return new PlayGamesAuthCredential(this.zza);
    }
}
