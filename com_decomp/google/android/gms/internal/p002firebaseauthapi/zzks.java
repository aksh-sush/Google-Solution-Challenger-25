package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzks  reason: invalid package */
public final class zzks implements zzkx<KeyFactory> {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
