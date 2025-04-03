package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzir  reason: invalid package */
public final class zzir extends zzzw<zzir, zzio> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzir zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzaab<zziq> zzf = zzzw.zzz();

    static {
        zzir zzir = new zzir();
        zzb = zzir;
        zzzw.zzF(zzir.class, zzir);
    }

    private zzir() {
    }

    public static zzio zzc() {
        return (zzio) zzb.zzt();
    }

    public static zzir zzf(byte[] bArr, zzzj zzzj) {
        return (zzir) zzzw.zzx(zzb, bArr, zzzj);
    }

    static /* synthetic */ void zzi(zzir zzir, zziq zziq) {
        zziq.getClass();
        zzaab<zziq> zzaab = zzir.zzf;
        if (!zzaab.zzc()) {
            zzir.zzf = zzzw.zzA(zzaab);
        }
        zzir.zzf.add(zziq);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zziq zzd(int i10) {
        return this.zzf.get(i10);
    }

    public final List<zziq> zzg() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zziq.class});
        } else if (i11 == 3) {
            return new zzir();
        } else {
            if (i11 == 4) {
                return new zzio((zzin) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
