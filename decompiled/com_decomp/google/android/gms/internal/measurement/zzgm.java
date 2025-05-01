package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgm extends zzjz<zzgm, zzgl> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgm zza;
    private int zze;
    private String zzf = "";
    private zzkg<zzgt> zzg = zzjz.zzbA();

    static {
        zzgm zzgm = new zzgm();
        zza = zzgm;
        zzjz.zzbG(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List<zzgt> zzc() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgt.class});
        } else if (i11 == 3) {
            return new zzgm();
        } else {
            if (i11 == 4) {
                return new zzgl((zzgi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
