package com.google.android.gms.internal.p002firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzim  reason: invalid package */
public final class zzim extends zzzw<zzim, zzil> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzim zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        zzim zzim = new zzim();
        zzb = zzim;
        zzzw.zzF(zzim.class, zzim);
    }

    private zzim() {
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzim();
        } else {
            if (i11 == 4) {
                return new zzil((zzik) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
