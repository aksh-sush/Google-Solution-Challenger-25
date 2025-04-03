package com.google.android.gms.internal.measurement;

abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    zzdt(zzee zzee, boolean z10) {
        this.zzk = zzee;
        this.zzh = zzee.zza.currentTimeMillis();
        this.zzi = zzee.zza.a();
        this.zzj = z10;
    }

    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzk.zzS(e10, false, this.zzj);
            zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zza();

    /* access modifiers changed from: protected */
    public void zzb() {
    }
}
