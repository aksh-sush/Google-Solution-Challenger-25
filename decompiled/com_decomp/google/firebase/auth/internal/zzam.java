package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzi;
import com.google.firebase.FirebaseApp;
import u3.a;
import y3.h;

public final class zzam {
    /* access modifiers changed from: private */
    public static final a zzg = new a("TokenRefresher", "FirebaseAuth:");
    volatile long zza;
    volatile long zzb;
    final long zzc = 300000;
    final HandlerThread zzd;
    final Handler zze;
    final Runnable zzf;
    private final FirebaseApp zzh;

    public zzam(FirebaseApp firebaseApp) {
        zzg.g("Initializing TokenRefresher", new Object[0]);
        FirebaseApp firebaseApp2 = (FirebaseApp) s.k(firebaseApp);
        this.zzh = firebaseApp2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.zzd = handlerThread;
        handlerThread.start();
        this.zze = new zzi(handlerThread.getLooper());
        this.zzf = new e(this, firebaseApp2.getName());
    }

    public final void zzb() {
        this.zze.removeCallbacks(this.zzf);
    }

    public final void zzc() {
        a aVar = zzg;
        long j10 = this.zza;
        long j11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Scheduling refresh for ");
        sb2.append(j10 - j11);
        aVar.g(sb2.toString(), new Object[0]);
        zzb();
        this.zzb = Math.max((this.zza - h.c().currentTimeMillis()) - this.zzc, 0) / 1000;
        this.zze.postDelayed(this.zzf, this.zzb * 1000);
    }

    /* access modifiers changed from: package-private */
    public final void zzd() {
        long j10;
        int i10 = (int) this.zzb;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            long j11 = this.zzb;
            j10 = j11 + j11;
        } else {
            j10 = i10 != 960 ? 30 : 960;
        }
        this.zzb = j10;
        this.zza = h.c().currentTimeMillis() + (this.zzb * 1000);
        a aVar = zzg;
        long j12 = this.zza;
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Scheduling refresh for ");
        sb2.append(j12);
        aVar.g(sb2.toString(), new Object[0]);
        this.zze.postDelayed(this.zzf, this.zzb * 1000);
    }
}
