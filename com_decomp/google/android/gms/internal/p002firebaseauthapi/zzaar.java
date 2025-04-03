package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaar  reason: invalid package */
final class zzaar implements zzabm {
    private static final zzaax zza = new zzaap();
    private final zzaax zzb;

    public zzaar() {
        zzaax zzaax;
        zzaax[] zzaaxArr = new zzaax[2];
        zzaaxArr[0] = zzzr.zza();
        try {
            zzaax = (zzaax) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzaax = zza;
        }
        zzaaxArr[1] = zzaax;
        zzaaq zzaaq = new zzaaq(zzaaxArr);
        zzaac.zzf(zzaaq, "messageInfoFactory");
        this.zzb = zzaaq;
    }

    private static boolean zzb(zzaaw zzaaw) {
        return zzaaw.zzc() == 1;
    }

    public final <T> zzabl<T> zza(Class<T> cls) {
        zzaau zzaau;
        zzzk<?> zzzk;
        zzabz<?, ?> zzabz;
        zzaan zzaan;
        zzabe zzabe;
        zzzk<?> zzzk2;
        zzabz<?, ?> zzz;
        zzzk<?> zza2;
        zzabn.zzG(cls);
        zzaaw zzb2 = this.zzb.zzb(cls);
        Class<zzzw> cls2 = zzzw.class;
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                zzz = zzabn.zzB();
                zza2 = zzzm.zzb();
            } else {
                zzz = zzabn.zzz();
                zza2 = zzzm.zza();
            }
            return zzabd.zzc(zzz, zza2, zzb2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean zzb3 = zzb(zzb2);
            zzabe = zzabf.zzb();
            zzaan = zzaan.zze();
            zzabz = zzabn.zzB();
            zzzk = zzb3 ? zzzm.zzb() : null;
            zzaau = zzaav.zzb();
        } else {
            boolean zzb4 = zzb(zzb2);
            zzabe = zzabf.zza();
            zzaan = zzaan.zzd();
            if (zzb4) {
                zzabz = zzabn.zzz();
                zzzk2 = zzzm.zza();
            } else {
                zzabz = zzabn.zzA();
                zzzk2 = null;
            }
            zzaau = zzaav.zza();
        }
        return zzabc.zzl(cls, zzb2, zzabe, zzaan, zzabz, zzzk, zzaau);
    }
}
