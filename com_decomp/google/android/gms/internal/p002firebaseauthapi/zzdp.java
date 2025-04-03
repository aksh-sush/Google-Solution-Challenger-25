package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdp  reason: invalid package */
final class zzdp {
    public static String zza(zzhq zzhq) {
        zzgr zzgr = zzgr.UNKNOWN_FORMAT;
        zzhl zzhl = zzhl.UNKNOWN_CURVE;
        zzhq zzhq2 = zzhq.UNKNOWN_HASH;
        int ordinal = zzhq.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha384";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        if (ordinal == 5) {
            return "HmacSha224";
        }
        String valueOf = String.valueOf(zzhq);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("hash unsupported for HMAC: ");
        sb2.append(valueOf);
        throw new NoSuchAlgorithmException(sb2.toString());
    }

    public static void zzb(zzha zzha) {
        zzkn.zzf(zzc(zzha.zzf().zzd()));
        zza(zzha.zzf().zze());
        if (zzha.zza() != zzgr.UNKNOWN_FORMAT) {
            zzbn.zzc(zzha.zzb().zzd());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static int zzc(zzhl zzhl) {
        zzgr zzgr = zzgr.UNKNOWN_FORMAT;
        zzhl zzhl2 = zzhl.UNKNOWN_CURVE;
        zzhq zzhq = zzhq.UNKNOWN_HASH;
        int ordinal = zzhl.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(zzhl);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
                sb2.append("unknown curve type: ");
                sb2.append(valueOf);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return i10;
    }

    public static int zzd(zzgr zzgr) {
        zzgr zzgr2 = zzgr.UNKNOWN_FORMAT;
        zzhl zzhl = zzhl.UNKNOWN_CURVE;
        zzhq zzhq = zzhq.UNKNOWN_HASH;
        int ordinal = zzgr.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(zzgr);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                sb2.append("unknown point format: ");
                sb2.append(valueOf);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return i10;
    }
}
