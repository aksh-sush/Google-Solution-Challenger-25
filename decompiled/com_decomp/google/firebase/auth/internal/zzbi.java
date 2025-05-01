package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;

public final class zzbi {
    private volatile int zza = 0;
    /* access modifiers changed from: private */
    public final zzam zzb;
    /* access modifiers changed from: private */
    public volatile boolean zzc = false;

    public zzbi(FirebaseApp firebaseApp) {
        Context applicationContext = firebaseApp.getApplicationContext();
        zzam zzam = new zzam(firebaseApp);
        this.zzb = zzam;
        d.c((Application) applicationContext.getApplicationContext());
        d.b().a(new p(this));
    }

    /* access modifiers changed from: private */
    public final boolean zzg() {
        return this.zza > 0 && !this.zzc;
    }

    public final void zzb() {
        this.zzb.zzb();
    }

    public final void zzc(int i10) {
        if (i10 > 0 && this.zza == 0) {
            this.zza = i10;
            if (zzg()) {
                this.zzb.zzc();
            }
        } else if (i10 == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i10;
    }

    public final void zzd(zzwq zzwq) {
        if (zzwq != null) {
            long zzb2 = zzwq.zzb();
            if (zzb2 <= 0) {
                zzb2 = 3600;
            }
            long zzc2 = zzwq.zzc();
            zzam zzam = this.zzb;
            zzam.zza = zzc2 + (zzb2 * 1000);
            zzam.zzb = -1;
            if (zzg()) {
                this.zzb.zzc();
            }
        }
    }
}
