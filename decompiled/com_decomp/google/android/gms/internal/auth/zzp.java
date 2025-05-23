package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.i;
import g3.b;

public final class zzp extends zza {
    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(i iVar, zzbw zzbw) {
        Parcel zza = zza();
        zzc.zze(zza, iVar);
        zzc.zzd(zza, zzbw);
        zzc(2, zza);
    }

    public final void zze(zzm zzm, b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzm);
        zzc.zzd(zza, bVar);
        zzc(4, zza);
    }

    public final void zzf(zzo zzo, Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zze(zza, zzo);
        zzc.zzd(zza, account);
        zza.writeString(str);
        zzc.zzd(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(zzk zzk, Account account) {
        Parcel zza = zza();
        zzc.zze(zza, zzk);
        zzc.zzd(zza, account);
        zzc(6, zza);
    }

    public final void zzh(zzk zzk, String str) {
        Parcel zza = zza();
        zzc.zze(zza, zzk);
        zza.writeString(str);
        zzc(3, zza);
    }
}
