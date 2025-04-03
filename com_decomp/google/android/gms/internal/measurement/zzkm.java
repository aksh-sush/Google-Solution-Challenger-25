package com.google.android.gms.internal.measurement;

public class zzkm {
    private static final zzjl zzb = zzjl.zza();
    protected volatile zzlg zza;
    private volatile zziy zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkm = (zzkm) obj;
        zzlg zzlg = this.zza;
        zzlg zzlg2 = zzkm.zza;
        if (zzlg == null && zzlg2 == null) {
            return zzb().equals(zzkm.zzb());
        }
        if (zzlg != null && zzlg2 != null) {
            return zzlg.equals(zzlg2);
        }
        if (zzlg != null) {
            zzkm.zzc(zzlg.zzbL());
            return zzlg.equals(zzkm.zza);
        }
        zzc(zzlg2.zzbL());
        return this.zza.equals(zzlg2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zziv) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbt();
        }
        return 0;
    }

    public final zziy zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zziy zziy = this.zzc;
                return zziy;
            }
            this.zzc = this.zza == null ? zziy.zzb : this.zza.zzbp();
            zziy zziy2 = this.zzc;
            return zziy2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.measurement.zzlg r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzlg r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzlg r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzkj -> 0x0011 }
            com.google.android.gms.internal.measurement.zziy r0 = com.google.android.gms.internal.measurement.zziy.zzb     // Catch:{ zzkj -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzkj -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zziy r2 = com.google.android.gms.internal.measurement.zziy.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzc(com.google.android.gms.internal.measurement.zzlg):void");
    }
}
