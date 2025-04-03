package com.google.android.gms.internal.p002firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjn  reason: invalid package */
public final class zzjn extends zzzw<zzjn, zzjm> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzjn zzb;
    private String zze = "";
    private zzaab<zzim> zzf = zzzw.zzz();

    static {
        zzjn zzjn = new zzjn();
        zzb = zzjn;
        zzzw.zzF(zzjn.class, zzjn);
    }

    private zzjn() {
    }

    public static zzjn zzb() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzim.class});
        } else if (i11 == 3) {
            return new zzjn();
        } else {
            if (i11 == 4) {
                return new zzjm((zzjl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
