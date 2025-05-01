package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.c;

final class zzhh implements zzhe {
    private static zzhh zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhh() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzhh zza(Context context) {
        zzhh zzhh;
        synchronized (zzhh.class) {
            if (zza == null) {
                zza = c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhh(context) : new zzhh();
            }
            zzhh = zza;
        }
        return zzhh;
    }

    static synchronized void zze() {
        Context context;
        synchronized (zzhh.class) {
            zzhh zzhh = zza;
            if (!(zzhh == null || (context = zzhh.zzb) == null || zzhh.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* renamed from: zzc */
    public final String zzb(String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzhc.zza(new zzhf(this, str));
        } catch (IllegalStateException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }

    public final /* synthetic */ String zzd(String str) {
        return zzgv.zza(this.zzb.getContentResolver(), str, (String) null);
    }

    private zzhh(Context context) {
        this.zzb = context;
        zzhg zzhg = new zzhg(this, (Handler) null);
        this.zzc = zzhg;
        context.getContentResolver().registerContentObserver(zzgv.zza, true, zzhg);
    }
}
