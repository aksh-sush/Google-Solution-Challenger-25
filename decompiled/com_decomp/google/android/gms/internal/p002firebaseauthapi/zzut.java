package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut  reason: invalid package */
final class zzut implements Runnable {
    final /* synthetic */ zzuv zza;
    final /* synthetic */ zzuu zzb;

    zzut(zzuu zzuu, zzuv zzuv) {
        this.zzb = zzuu;
        this.zza = zzuv;
    }

    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
