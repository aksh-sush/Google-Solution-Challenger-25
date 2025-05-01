package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzeh extends zzjz<zzeh, zzeg> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkg<zzes> zzg = zzjz.zzbA();
    private zzkg<zzej> zzh = zzjz.zzbA();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzeh = new zzeh();
        zza = zzeh;
        zzjz.zzbG(zzeh.class, zzeh);
    }

    private zzeh() {
    }

    static /* synthetic */ void zzi(zzeh zzeh, int i10, zzes zzes) {
        zzes.getClass();
        zzkg<zzes> zzkg = zzeh.zzg;
        if (!zzkg.zzc()) {
            zzeh.zzg = zzjz.zzbB(zzkg);
        }
        zzeh.zzg.set(i10, zzes);
    }

    static /* synthetic */ void zzj(zzeh zzeh, int i10, zzej zzej) {
        zzej.getClass();
        zzkg<zzej> zzkg = zzeh.zzh;
        if (!zzkg.zzc()) {
            zzeh.zzh = zzjz.zzbB(zzkg);
        }
        zzeh.zzh.set(i10, zzej);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i10) {
        return this.zzh.get(i10);
    }

    public final zzes zzf(int i10) {
        return this.zzg.get(i10);
    }

    public final List<zzej> zzg() {
        return this.zzh;
    }

    public final List<zzes> zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzeh();
        } else {
            if (i11 == 4) {
                return new zzeg((zzef) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
