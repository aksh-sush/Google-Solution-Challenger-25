package com.google.android.gms.internal.measurement;

public final class zzfu extends zzjz<zzfu, zzft> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfu zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfi zzh;

    static {
        zzfu zzfu = new zzfu();
        zza = zzfu;
        zzjz.zzbG(zzfu.class, zzfu);
    }

    private zzfu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzfu();
        } else {
            if (i11 == 4) {
                return new zzft((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
