package com.google.android.gms.internal.measurement;

final class zzky implements zzls {
    private static final zzle zza = new zzkw();
    private final zzle zzb;

    public zzky() {
        zzle zzle;
        zzle[] zzleArr = new zzle[2];
        zzleArr[0] = zzju.zza();
        try {
            zzle = (zzle) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzle = zza;
        }
        zzleArr[1] = zzle;
        zzkx zzkx = new zzkx(zzleArr);
        zzkh.zzf(zzkx, "messageInfoFactory");
        this.zzb = zzkx;
    }

    private static boolean zzb(zzld zzld) {
        return zzld.zzc() == 1;
    }

    public final <T> zzlr<T> zza(Class<T> cls) {
        zzlb zzlb;
        zzjm<?> zzjm;
        zzmi<?, ?> zzmi;
        zzku zzku;
        zzll zzll;
        zzjm<?> zzjm2;
        zzmi<?, ?> zzz;
        zzjm<?> zza2;
        zzlt.zzG(cls);
        zzld zzb2 = this.zzb.zzb(cls);
        Class<zzjz> cls2 = zzjz.class;
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                zzz = zzlt.zzB();
                zza2 = zzjo.zzb();
            } else {
                zzz = zzlt.zzz();
                zza2 = zzjo.zza();
            }
            return zzlk.zzc(zzz, zza2, zzb2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean zzb3 = zzb(zzb2);
            zzll = zzlm.zzb();
            zzku = zzku.zzd();
            zzmi = zzlt.zzB();
            zzjm = zzb3 ? zzjo.zzb() : null;
            zzlb = zzlc.zzb();
        } else {
            boolean zzb4 = zzb(zzb2);
            zzll = zzlm.zza();
            zzku = zzku.zzc();
            if (zzb4) {
                zzmi = zzlt.zzz();
                zzjm2 = zzjo.zza();
            } else {
                zzmi = zzlt.zzA();
                zzjm2 = null;
            }
            zzlb = zzlc.zza();
        }
        return zzlj.zzk(cls, zzb2, zzll, zzku, zzmi, zzjm, zzlb);
    }
}
