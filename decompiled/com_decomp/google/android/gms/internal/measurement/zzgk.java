package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgk extends zzjz<zzgk, zzgj> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgk zza;
    private zzkg<zzgm> zze = zzjz.zzbA();

    static {
        zzgk zzgk = new zzgk();
        zza = zzgk;
        zzjz.zzbG(zzgk.class, zzgk);
    }

    private zzgk() {
    }

    public static zzgk zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List<zzgm> zzd() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgm.class});
        } else if (i11 == 3) {
            return new zzgk();
        } else {
            if (i11 == 4) {
                return new zzgj((zzgi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
