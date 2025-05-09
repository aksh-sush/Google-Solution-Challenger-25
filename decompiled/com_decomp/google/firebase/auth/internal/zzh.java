package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzxq;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;

public final class zzh {
    public static zzxq zza(AuthCredential authCredential, String str) {
        s.k(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GoogleAuthCredential.zzb((GoogleAuthCredential) authCredential, str);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return FacebookAuthCredential.zzb((FacebookAuthCredential) authCredential, str);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return TwitterAuthCredential.zzb((TwitterAuthCredential) authCredential, str);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GithubAuthCredential.zzb((GithubAuthCredential) authCredential, str);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return PlayGamesAuthCredential.zzb((PlayGamesAuthCredential) authCredential, str);
        }
        if (zze.class.isAssignableFrom(authCredential.getClass())) {
            return zze.zzd((zze) authCredential, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
