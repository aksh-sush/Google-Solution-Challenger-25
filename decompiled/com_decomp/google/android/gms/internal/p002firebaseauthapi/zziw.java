package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziw  reason: invalid package */
public final class zziw extends zzzw<zziw, zzit> implements zzaba {
    /* access modifiers changed from: private */
    public static final zziw zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzaab<zziv> zzf = zzzw.zzz();

    static {
        zziw zziw = new zziw();
        zzb = zziw;
        zzzw.zzF(zziw.class, zziw);
    }

    private zziw() {
    }

    public static zzit zza() {
        return (zzit) zzb.zzt();
    }

    static /* synthetic */ void zze(zziw zziw, zziv zziv) {
        zziv.getClass();
        zzaab<zziv> zzaab = zziw.zzf;
        if (!zzaab.zzc()) {
            zziw.zzf = zzzw.zzA(zzaab);
        }
        zziw.zzf.add(zziv);
    }

    public final zziv zzb(int i10) {
        return this.zzf.get(0);
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zziv.class});
        } else if (i11 == 3) {
            return new zziw();
        } else {
            if (i11 == 4) {
                return new zzit((zzis) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
