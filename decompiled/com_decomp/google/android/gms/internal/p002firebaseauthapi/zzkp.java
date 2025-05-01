package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkx;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkp  reason: invalid package */
public final class zzkp<T_WRAPPER extends zzkx<T_ENGINE>, T_ENGINE> {
    public static final zzkp<zzkq, Cipher> zza = new zzkp<>(new zzkq());
    public static final zzkp<zzku, Mac> zzb = new zzkp<>(new zzku());
    public static final zzkp<zzkw, Signature> zzc = new zzkp<>(new zzkw());
    public static final zzkp<zzkv, MessageDigest> zzd = new zzkp<>(new zzkv());
    public static final zzkp<zzkr, KeyAgreement> zze = new zzkp<>(new zzkr());
    public static final zzkp<zzkt, KeyPairGenerator> zzf = new zzkp<>(new zzkt());
    public static final zzkp<zzks, KeyFactory> zzg = new zzkp<>(new zzks());
    private static final Logger zzh = Logger.getLogger(zzkp.class.getName());
    private static final List<Provider> zzi;
    private static final boolean zzj = true;
    private final T_WRAPPER zzk;

    static {
        if (zzlh.zzb()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str = strArr[i10];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            zzi = arrayList;
        } else {
            zzi = new ArrayList();
        }
    }

    public zzkp(T_WRAPPER t_wrapper) {
        this.zzk = t_wrapper;
    }

    public final T_ENGINE zza(String str) {
        Exception exc = null;
        for (Provider zza2 : zzi) {
            try {
                return this.zzk.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
