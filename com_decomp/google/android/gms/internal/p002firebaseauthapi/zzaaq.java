package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq  reason: invalid package */
final class zzaaq implements zzaax {
    private final zzaax[] zza;

    zzaaq(zzaax... zzaaxArr) {
        this.zza = zzaaxArr;
    }

    public final zzaaw zzb(Class<?> cls) {
        zzaax[] zzaaxArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzaax zzaax = zzaaxArr[i10];
            if (zzaax.zzc(cls)) {
                return zzaax.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean zzc(Class<?> cls) {
        zzaax[] zzaaxArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzaaxArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
