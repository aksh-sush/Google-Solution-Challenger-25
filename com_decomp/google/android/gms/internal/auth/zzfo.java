package com.google.android.gms.internal.auth;

final class zzfo implements zzgi {
    private static final zzfu zza = new zzfm();
    private final zzfu zzb;

    public zzfo() {
        zzfu zzfu;
        zzfu[] zzfuArr = new zzfu[2];
        zzfuArr[0] = zzer.zza();
        try {
            zzfu = (zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzfu = zza;
        }
        zzfuArr[1] = zzfu;
        zzfn zzfn = new zzfn(zzfuArr);
        zzez.zzf(zzfn, "messageInfoFactory");
        this.zzb = zzfn;
    }

    private static boolean zzb(zzft zzft) {
        return zzft.zzc() == 1;
    }

    public final zzgh zza(Class cls) {
        zzfr zzfr;
        zzel zzel;
        zzgy zzgy;
        zzfk zzfk;
        zzgb zzgb;
        zzel zzel2;
        zzgy zza2;
        zzel zza3;
        zzgj.zzg(cls);
        zzft zzb2 = this.zzb.zzb(cls);
        Class<zzeu> cls2 = zzeu.class;
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                zza2 = zzgj.zzc();
                zza3 = zzen.zzb();
            } else {
                zza2 = zzgj.zza();
                zza3 = zzen.zza();
            }
            return zzga.zzb(zza2, zza3, zzb2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean zzb3 = zzb(zzb2);
            zzgb = zzgc.zzb();
            zzfk = zzfk.zzd();
            zzgy = zzgj.zzc();
            zzel = zzb3 ? zzen.zzb() : null;
            zzfr = zzfs.zzb();
        } else {
            boolean zzb4 = zzb(zzb2);
            zzgb = zzgc.zza();
            zzfk = zzfk.zzc();
            if (zzb4) {
                zzgy = zzgj.zza();
                zzel2 = zzen.zza();
            } else {
                zzgy = zzgj.zzb();
                zzel2 = null;
            }
            zzfr = zzfs.zza();
        }
        return zzfz.zzj(cls, zzb2, zzgb, zzfk, zzgy, zzel, zzfr);
    }
}
