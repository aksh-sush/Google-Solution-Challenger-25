package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.a;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;
import y3.h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh  reason: invalid package */
public final class zzvh {
    private static final Map<String, zzvg> zza = new a();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzux zzux) {
        zze(str, zzux);
        return new zzvf(onVerificationStateChangedCallbacks, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map<String, zzvg> map = zza;
        if (map.containsKey(str)) {
            zzvg zzvg = map.get(str);
            if (h.c().currentTimeMillis() - zzvg.zzb < 120000) {
                zzux zzux = zzvg.zza;
                if (zzux == null) {
                    return true;
                }
                zzux.zzi(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zze(str, (zzux) null);
            return false;
        }
        zze(str, (zzux) null);
        return false;
    }

    private static void zze(String str, zzux zzux) {
        zza.put(str, new zzvg(zzux, h.c().currentTimeMillis()));
    }
}
