package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoi  reason: invalid package */
final class zzoi implements zzuz<zzwh> {
    final /* synthetic */ zzuy zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Boolean zzd;
    final /* synthetic */ zze zze;
    final /* synthetic */ zztl zzf;
    final /* synthetic */ zzwq zzg;

    zzoi(zzpt zzpt, zzuy zzuy, String str, String str2, Boolean bool, zze zze2, zztl zztl, zzwq zzwq) {
        this.zza = zzuy;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zze2;
        this.zzf = zztl;
        this.zzg = zzwq;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<zzwj> zzb2 = ((zzwh) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        int i10 = 0;
        zzwj zzwj = zzb2.get(0);
        zzwy zzl = zzwj.zzl();
        List<zzww> zzc2 = zzl != null ? zzl.zzc() : null;
        if (zzc2 != null && !zzc2.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                while (true) {
                    if (i10 >= zzc2.size()) {
                        break;
                    } else if (zzc2.get(i10).zzf().equals(this.zzb)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            zzc2.get(i10).zzh(this.zzc);
        }
        zzwj.zzh(this.zzd.booleanValue());
        zzwj.zze(this.zze);
        this.zzf.zzi(this.zzg, zzwj);
    }
}
