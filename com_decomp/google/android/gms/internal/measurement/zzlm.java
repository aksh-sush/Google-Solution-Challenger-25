package com.google.android.gms.internal.measurement;

final class zzlm {
    private static final zzll zza;
    private static final zzll zzb = new zzll();

    static {
        zzll zzll;
        try {
            zzll = (zzll) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzll = null;
        }
        zza = zzll;
    }

    static zzll zza() {
        return zza;
    }

    static zzll zzb() {
        return zzb;
    }
}
