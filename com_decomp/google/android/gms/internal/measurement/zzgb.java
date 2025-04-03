package com.google.android.gms.internal.measurement;

public final class zzgb extends zzjz<zzgb, zzfz> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgb zza;
    private int zze;
    private int zzf = 1;
    private zzkg<zzfq> zzg = zzjz.zzbA();

    static {
        zzgb zzgb = new zzgb();
        zza = zzgb;
        zzjz.zzbG(zzgb.class, zzgb);
    }

    private zzgb() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbu();
    }

    static /* synthetic */ void zzc(zzgb zzgb, zzfq zzfq) {
        zzfq.getClass();
        zzkg<zzfq> zzkg = zzgb.zzg;
        if (!zzkg.zzc()) {
            zzgb.zzg = zzjz.zzbB(zzkg);
        }
        zzgb.zzg.add(zzfq);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzga.zza, "zzg", zzfq.class});
        } else if (i11 == 3) {
            return new zzgb();
        } else {
            if (i11 == 4) {
                return new zzfz((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
