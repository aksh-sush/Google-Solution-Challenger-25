package com.google.android.gms.internal.measurement;

final class zzkx implements zzle {
    private final zzle[] zza;

    zzkx(zzle... zzleArr) {
        this.zza = zzleArr;
    }

    public final zzld zzb(Class<?> cls) {
        zzle[] zzleArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzle zzle = zzleArr[i10];
            if (zzle.zzc(cls)) {
                return zzle.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean zzc(Class<?> cls) {
        zzle[] zzleArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzleArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
