package com.google.android.gms.internal.measurement;

public final class zzfq extends zzjz<zzfq, zzfp> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfq zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfq zzfq = new zzfq();
        zza = zzfq;
        zzjz.zzbG(zzfq.class, zzfq);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zza.zzbu();
    }

    static /* synthetic */ void zzc(zzfq zzfq, String str) {
        str.getClass();
        zzfq.zze |= 1;
        zzfq.zzf = str;
    }

    static /* synthetic */ void zzd(zzfq zzfq, long j10) {
        zzfq.zze |= 2;
        zzfq.zzg = j10;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzfq();
        } else {
            if (i11 == 4) {
                return new zzfp((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
