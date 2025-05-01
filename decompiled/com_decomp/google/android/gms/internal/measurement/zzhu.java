package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzhu<T> {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzhu<?>>> zzg = new AtomicReference<>();
    private static final zzhw zzh = new zzhw(zzhl.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    final zzhr zza;
    final String zzb;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;

    /* synthetic */ zzhu(zzhr zzhr, String str, Object obj, boolean z10, zzht zzht) {
        if (zzhr.zzb != null) {
            this.zza = zzhr;
            this.zzb = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    @Deprecated
    public static void zzd(Context context) {
        synchronized (zzd) {
            zzhs zzhs = zze;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzhs == null || zzhs.zza() != context) {
                zzha.zze();
                zzhv.zzc();
                zzhh.zze();
                zze = new zzgx(context, zzif.zza(new zzhm(context)));
                zzi.incrementAndGet();
            }
        }
    }

    static void zze() {
        zzi.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zzb() {
        /*
            r7 = this;
            boolean r0 = r7.zzm
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r7.zzb
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r7.zzk
            if (r1 >= r0) goto L_0x011f
            monitor-enter(r7)
            int r1 = r7.zzk     // Catch:{ all -> 0x011c }
            if (r1 >= r0) goto L_0x011a
            com.google.android.gms.internal.measurement.zzhs r1 = zze     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011c }
            boolean r2 = r2.zzf     // Catch:{ all -> 0x011c }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhh r2 = com.google.android.gms.internal.measurement.zzhh.zza(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.zzb(r3)     // Catch:{ all -> 0x011c }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.zzgv.zzc     // Catch:{ all -> 0x011c }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x011c }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.zzc()     // Catch:{ all -> 0x011c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x011c }
            int r6 = r5.length()     // Catch:{ all -> 0x011c }
            if (r6 == 0) goto L_0x0067
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x011c }
            goto L_0x006d
        L_0x0067:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x011c }
            r5.<init>(r4)     // Catch:{ all -> 0x011c }
            r4 = r5
        L_0x006d:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x011c }
        L_0x0070:
            r2 = r3
            goto L_0x00b9
        L_0x0072:
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011c }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x009d
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x011c }
            boolean r2 = com.google.android.gms.internal.measurement.zzhj.zza(r2, r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x009b
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011c }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x011c }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011c }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzha r2 = com.google.android.gms.internal.measurement.zzha.zza(r2, r4)     // Catch:{ all -> 0x011c }
            goto L_0x00a9
        L_0x009b:
            r2 = r3
            goto L_0x00a9
        L_0x009d:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhv r2 = com.google.android.gms.internal.measurement.zzhv.zza(r2, r3)     // Catch:{ all -> 0x011c }
        L_0x00a9:
            if (r2 == 0) goto L_0x0070
            java.lang.String r4 = r7.zzc()     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x011c }
        L_0x00b9:
            if (r2 == 0) goto L_0x00bc
            goto L_0x00e4
        L_0x00bc:
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011c }
            boolean r2 = r2.zze     // Catch:{ all -> 0x011c }
            if (r2 != 0) goto L_0x00df
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhh r2 = com.google.android.gms.internal.measurement.zzhh.zza(r2)     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011c }
            boolean r4 = r4.zze     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x00d2
            r4 = r3
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r4 = r7.zzb     // Catch:{ all -> 0x011c }
        L_0x00d4:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x011c }
            goto L_0x00e0
        L_0x00df:
            r2 = r3
        L_0x00e0:
            if (r2 != 0) goto L_0x00e4
            T r2 = r7.zzj     // Catch:{ all -> 0x011c }
        L_0x00e4:
            com.google.android.gms.internal.measurement.zzib r1 = r1.zzb()     // Catch:{ all -> 0x011c }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhz r1 = (com.google.android.gms.internal.measurement.zzhz) r1     // Catch:{ all -> 0x011c }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x010f
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhi r1 = (com.google.android.gms.internal.measurement.zzhi) r1     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x011c }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r7.zzb     // Catch:{ all -> 0x011c }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x011c }
            if (r1 != 0) goto L_0x010b
            T r2 = r7.zzj     // Catch:{ all -> 0x011c }
            goto L_0x010f
        L_0x010b:
            java.lang.Object r2 = r7.zza(r1)     // Catch:{ all -> 0x011c }
        L_0x010f:
            r7.zzl = r2     // Catch:{ all -> 0x011c }
            r7.zzk = r0     // Catch:{ all -> 0x011c }
            goto L_0x011a
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011c }
            r0.<init>(r2)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            goto L_0x011f
        L_0x011c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            throw r0
        L_0x011f:
            T r0 = r7.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhu.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
