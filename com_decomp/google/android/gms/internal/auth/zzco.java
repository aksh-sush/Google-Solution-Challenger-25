package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.c;

final class zzco implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzco zza(Context context) {
        zzco zzco;
        synchronized (zzco.class) {
            if (zza == null) {
                zza = c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
            }
            zzco = zza;
        }
        return zzco;
    }

    static synchronized void zze() {
        Context context;
        synchronized (zzco.class) {
            zzco zzco = zza;
            if (!(zzco == null || (context = zzco.zzb) == null || zzco.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* renamed from: zzc */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzcm(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, (String) null);
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcn = new zzcn(this, (Handler) null);
        this.zzc = zzcn;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcn);
    }
}
