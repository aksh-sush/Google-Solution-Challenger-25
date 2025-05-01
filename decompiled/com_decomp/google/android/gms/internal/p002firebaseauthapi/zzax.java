package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzax  reason: invalid package */
public final class zzax {
    private final zzio zza;

    private zzax(zzio zzio) {
        this.zza = zzio;
    }

    public static zzax zze() {
        return new zzax(zzir.zzc());
    }

    public static zzax zzf(zzaw zzaw) {
        return new zzax((zzio) zzaw.zzc().zzu());
    }

    private final synchronized int zzg() {
        int zzh;
        do {
            zzh = zzh();
        } while (zzk(zzh));
        return zzh;
    }

    private static int zzh() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    private final synchronized zziq zzi(zzie zzie, zzjk zzjk) {
        zzip zzd;
        int zzg = zzg();
        if (zzjk != zzjk.UNKNOWN_PREFIX) {
            zzd = zziq.zzd();
            zzd.zza(zzie);
            zzd.zzb(zzg);
            zzd.zzd(zzig.ENABLED);
            zzd.zzc(zzjk);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zziq) zzd.zzk();
    }

    private final synchronized zziq zzj(zzij zzij) {
        return zzi(zzbn.zzc(zzij), zzij.zzd());
    }

    private final synchronized boolean zzk(int i10) {
        for (zziq zza2 : this.zza.zze()) {
            if (zza2.zza() == i10) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final synchronized int zza(zzij zzij, boolean z10) {
        zziq zzj;
        zzj = zzj(zzij);
        this.zza.zzb(zzj);
        return zzj.zza();
    }

    public final synchronized zzaw zzb() {
        return zzaw.zza((zzir) this.zza.zzk());
    }

    public final synchronized zzax zzc(zzaq zzaq) {
        zza(zzaq.zza(), false);
        return this;
    }

    public final synchronized zzax zzd(int i10) {
        int i11 = 0;
        while (i11 < this.zza.zza()) {
            zziq zzd = this.zza.zzd(i11);
            if (zzd.zza() != i10) {
                i11++;
            } else if (zzd.zzc().equals(zzig.ENABLED)) {
                this.zza.zzc(i10);
            } else {
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("cannot set key as primary because it's not enabled: ");
                sb2.append(i10);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("key not found: ");
        sb3.append(i10);
        throw new GeneralSecurityException(sb3.toString());
        return this;
    }
}
