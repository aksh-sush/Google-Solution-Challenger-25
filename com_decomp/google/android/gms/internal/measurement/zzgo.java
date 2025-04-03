package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgo extends zzjz<zzgo, zzgn> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgo zza;
    private int zze;
    private zzkg<zzgt> zzf = zzjz.zzbA();
    private zzgk zzg;

    static {
        zzgo zzgo = new zzgo();
        zza = zzgo;
        zzjz.zzbG(zzgo.class, zzgo);
    }

    private zzgo() {
    }

    public final zzgk zza() {
        zzgk zzgk = this.zzg;
        return zzgk == null ? zzgk.zzc() : zzgk;
    }

    public final List<zzgt> zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgt.class, "zzg"});
        } else if (i11 == 3) {
            return new zzgo();
        } else {
            if (i11 == 4) {
                return new zzgn((zzgi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
