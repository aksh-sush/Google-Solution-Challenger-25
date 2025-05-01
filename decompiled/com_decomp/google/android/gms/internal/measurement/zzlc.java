package com.google.android.gms.internal.measurement;

final class zzlc {
    private static final zzlb zza;
    private static final zzlb zzb = new zzlb();

    static {
        zzlb zzlb;
        try {
            zzlb = (zzlb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlb = null;
        }
        zza = zzlb;
    }

    static zzlb zza() {
        return zza;
    }

    static zzlb zzb() {
        return zzb;
    }
}
