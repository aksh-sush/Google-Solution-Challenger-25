package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzht  reason: invalid package */
public final class zzht extends zzzw<zzht, zzhs> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzht zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzhz zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzht zzht = new zzht();
        zzb = zzht;
        zzzw.zzF(zzht.class, zzht);
    }

    private zzht() {
    }

    public static zzhs zzb() {
        return (zzhs) zzb.zzt();
    }

    public static zzht zzd() {
        return zzb;
    }

    public static zzht zze(zzyu zzyu, zzzj zzzj) {
        return (zzht) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zzi(zzht zzht, zzhz zzhz) {
        zzhz.getClass();
        zzht.zzf = zzhz;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzhz zzf() {
        zzhz zzhz = this.zzf;
        return zzhz == null ? zzhz.zze() : zzhz;
    }

    public final zzyu zzg() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzht();
        } else {
            if (i11 == 4) {
                return new zzhs((zzhr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
