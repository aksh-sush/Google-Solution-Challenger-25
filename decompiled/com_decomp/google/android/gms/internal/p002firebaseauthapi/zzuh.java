package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
public final class zzuh {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzuh";

    private zzuh() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzvt zzvt = new zzvt();
                zzvt.zzb(str);
                if (zzvt.zzd()) {
                    return zzvt.zzc();
                }
                String valueOf = String.valueOf(str);
                throw new zzpz(valueOf.length() != 0 ? "No error message: ".concat(valueOf) : new String("No error message: "));
            } catch (Exception e10) {
                String valueOf2 = String.valueOf(e10.getMessage());
                throw new zzpz(valueOf2.length() != 0 ? "Json conversion failed! ".concat(valueOf2) : new String("Json conversion failed! "), e10);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                zzuj zzuj = (zzuj) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    zzuj.zza(str);
                    return zzuj;
                } catch (Exception e11) {
                    String valueOf3 = String.valueOf(e11.getMessage());
                    throw new zzpz(valueOf3.length() != 0 ? "Json conversion failed! ".concat(valueOf3) : new String("Json conversion failed! "), e11);
                }
            } catch (Exception e12) {
                String valueOf4 = String.valueOf(type);
                StringBuilder sb2 = new StringBuilder(valueOf4.length() + 38);
                sb2.append("Instantiation of JsonResponse failed! ");
                sb2.append(valueOf4);
                throw new zzpz(sb2.toString(), e12);
            }
        }
    }
}
