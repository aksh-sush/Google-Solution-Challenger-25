package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk  reason: invalid package */
final class zzvk extends zztl {
    final /* synthetic */ zzvn zza;
    private final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzvk(zzvn zzvn, zztl zztl, String str) {
        super(zztl);
        this.zza = zzvn;
        this.zzb = str;
    }

    public final void zzb(String str) {
        zzvn.zza.a("onCodeSent", new Object[0]);
        zzvm zzvm = (zzvm) this.zza.zzd.get(this.zzb);
        if (zzvm != null) {
            for (zztl zzb2 : zzvm.zzb) {
                zzb2.zzb(str);
            }
            zzvm.zzg = true;
            zzvm.zzd = str;
            if (zzvm.zza <= 0) {
                this.zza.zzh(this.zzb);
            } else if (!zzvm.zzc) {
                this.zza.zzn(this.zzb);
            } else if (!zzaf.zzd(zzvm.zze)) {
                zzvn.zze(this.zza, this.zzb);
            }
        }
    }

    public final void zzh(Status status) {
        a zza2 = zzvn.zza;
        String a10 = c.a(status.V());
        String W = status.W();
        StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 39 + String.valueOf(W).length());
        sb2.append("SMS verification code request failed: ");
        sb2.append(a10);
        sb2.append(" ");
        sb2.append(W);
        zza2.c(sb2.toString(), new Object[0]);
        zzvm zzvm = (zzvm) this.zza.zzd.get(this.zzb);
        if (zzvm != null) {
            for (zztl zzh : zzvm.zzb) {
                zzh.zzh(status);
            }
            this.zza.zzj(this.zzb);
        }
    }
}
