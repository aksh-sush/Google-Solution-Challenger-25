package com.google.android.gms.internal.measurement;

public final class zzfa extends zzjz<zzfa, zzez> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfa zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzfa zzfa = new zzfa();
        zza = zzfa;
        zzjz.zzbG(zzfa.class, zzfa);
    }

    private zzfa() {
    }

    static /* synthetic */ void zzd(zzfa zzfa, String str) {
        str.getClass();
        zzfa.zze |= 1;
        zzfa.zzf = str;
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzfa();
        } else {
            if (i11 == 4) {
                return new zzez((zzey) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
