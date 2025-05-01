package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjc  reason: invalid package */
public final class zzjc extends zzzw<zzjc, zzjb> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzjc zzb;
    private String zze = "";

    static {
        zzjc zzjc = new zzjc();
        zzb = zzjc;
        zzzw.zzF(zzjc.class, zzjc);
    }

    private zzjc() {
    }

    public static zzjc zzb() {
        return zzb;
    }

    public static zzjc zzc(zzyu zzyu, zzzj zzzj) {
        return (zzjc) zzzw.zzw(zzb, zzyu, zzzj);
    }

    public final String zzd() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i11 == 3) {
            return new zzjc();
        } else {
            if (i11 == 4) {
                return new zzjb((zzja) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
