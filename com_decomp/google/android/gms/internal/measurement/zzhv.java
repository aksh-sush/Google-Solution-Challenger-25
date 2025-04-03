package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.Iterator;
import java.util.Map;

public final class zzhv implements zzhe {
    private static final Map<String, zzhv> zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static zzhv zza(Context context, String str) {
        zzhv zzhv;
        if (!zzgw.zza()) {
            synchronized (zzhv.class) {
                zzhv = zza.get((Object) null);
                if (zzhv == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return zzhv;
        }
        throw null;
    }

    static synchronized void zzc() {
        synchronized (zzhv.class) {
            Map<String, zzhv> map = zza;
            Iterator<zzhv> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().zzb;
                throw null;
            }
        }
    }

    public final Object zzb(String str) {
        throw null;
    }
}
