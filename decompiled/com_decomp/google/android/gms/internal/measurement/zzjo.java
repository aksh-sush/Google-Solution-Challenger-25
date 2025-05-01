package com.google.android.gms.internal.measurement;

final class zzjo {
    private static final zzjm<?> zza = new zzjn();
    private static final zzjm<?> zzb;

    static {
        zzjm<?> zzjm;
        try {
            zzjm = (zzjm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjm = null;
        }
        zzb = zzjm;
    }

    static zzjm<?> zza() {
        zzjm<?> zzjm = zzb;
        if (zzjm != null) {
            return zzjm;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzjm<?> zzb() {
        return zza;
    }
}
