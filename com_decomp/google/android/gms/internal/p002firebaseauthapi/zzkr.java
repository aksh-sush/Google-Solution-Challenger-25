package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkr  reason: invalid package */
public final class zzkr implements zzkx<KeyAgreement> {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
