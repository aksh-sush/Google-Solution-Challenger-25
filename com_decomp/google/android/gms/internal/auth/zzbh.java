package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import m3.b;

public final class zzbh extends zza {
    zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbg) {
        Parcel zza = zza();
        zzc.zze(zza, zzbg);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbg, b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbg);
        zzc.zzd(zza, bVar);
        zzc(1, zza);
    }
}
