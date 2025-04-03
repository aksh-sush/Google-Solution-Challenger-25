package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfw extends zzjz<zzfw, zzfv> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfw zza;
    private zzkg<zzfy> zze = zzjz.zzbA();

    static {
        zzfw zzfw = new zzfw();
        zza = zzfw;
        zzjz.zzbG(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    public static zzfv zza() {
        return (zzfv) zza.zzbu();
    }

    static /* synthetic */ void zze(zzfw zzfw, zzfy zzfy) {
        zzfy.getClass();
        zzkg<zzfy> zzkg = zzfw.zze;
        if (!zzkg.zzc()) {
            zzfw.zze = zzjz.zzbB(zzkg);
        }
        zzfw.zze.add(zzfy);
    }

    public final zzfy zzc(int i10) {
        return this.zze.get(0);
    }

    public final List<zzfy> zzd() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfy.class});
        } else if (i11 == 3) {
            return new zzfw();
        } else {
            if (i11 == 4) {
                return new zzfv((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
