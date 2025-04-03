package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import b4.b;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import h4.j;

final class zzcx extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzee zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcx(zzee zzee, String str, String str2, Context context, Bundle bundle) {
        super(zzee, true);
        this.zze = zzee;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (zzee.zzV(this.zza, this.zzb)) {
                str = this.zzb;
                str2 = this.zza;
                str3 = this.zze.zzd;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            s.k(this.zzc);
            zzee zzee = this.zze;
            zzee.zzj = zzee.zzf(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.zzc, ModuleDescriptor.MODULE_ID);
            int c10 = DynamiteModule.c(this.zzc, ModuleDescriptor.MODULE_ID);
            ((zzcc) s.k(this.zze.zzj)).initialize(b.Z(this.zzc), new zzcl(42097, (long) Math.max(a10, c10), c10 < a10, str3, str2, str, this.zzd, j.a(this.zzc)), this.zzh);
        } catch (Exception e10) {
            this.zze.zzS(e10, true, false);
        }
    }
}
