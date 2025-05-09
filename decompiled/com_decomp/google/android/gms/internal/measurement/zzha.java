package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzha implements zzhe {
    public static final String[] zza = {"key", FirebaseAnalytics.Param.VALUE};
    private static final Map<Uri, zzha> zzb = new a();
    private final ContentResolver zzc;
    private final Uri zzd;
    private final ContentObserver zze;
    private final Object zzf = new Object();
    private volatile Map<String, String> zzg;
    private final List<zzhb> zzh = new ArrayList();

    private zzha(ContentResolver contentResolver, Uri uri) {
        zzgz zzgz = new zzgz(this, (Handler) null);
        this.zze = zzgz;
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        contentResolver.registerContentObserver(uri, false, zzgz);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzha zza(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzha> r0 = com.google.android.gms.internal.measurement.zzha.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzha> r1 = zzb     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.zzha r2 = (com.google.android.gms.internal.measurement.zzha) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.zzha r3 = new com.google.android.gms.internal.measurement.zzha     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.zzha");
    }

    static synchronized void zze() {
        synchronized (zzha.class) {
            for (zzha next : zzb.values()) {
                next.zzc.unregisterContentObserver(next.zze);
            }
            zzb.clear();
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return zzc().get(str);
    }

    /* JADX INFO: finally extract failed */
    public final Map<String, String> zzc() {
        Map<String, String> map;
        Map<String, String> map2 = this.zzg;
        if (map2 == null) {
            synchronized (this.zzf) {
                map2 = this.zzg;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) zzhc.zza(new zzgy(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.zzg = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final /* synthetic */ Map zzd() {
        Cursor query = this.zzc.query(this.zzd, zza, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void zzf() {
        synchronized (this.zzf) {
            this.zzg = null;
            zzhu.zze();
        }
        synchronized (this) {
            for (zzhb zza2 : this.zzh) {
                zza2.zza();
            }
        }
    }
}
