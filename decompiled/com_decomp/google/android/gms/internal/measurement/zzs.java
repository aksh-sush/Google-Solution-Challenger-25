package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzt zzt, boolean z10, boolean z11) {
        super("log");
        this.zzc = zzt;
        this.zza = z10;
        this.zzb = z11;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        List arrayList;
        zzr zzb2;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzg.zzb(list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
        } else {
            int zzb3 = zzh.zzb(zzg.zzb(list.get(0)).zzh().doubleValue());
            int i10 = zzb3 != 2 ? zzb3 != 3 ? zzb3 != 5 ? zzb3 != 6 ? 3 : 2 : 5 : 1 : 4;
            String zzi = zzg.zzb(list.get(1)).zzi();
            if (list.size() == 2) {
                zzb2 = this.zzc.zza;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
                    arrayList.add(zzg.zzb(list.get(i11)).zzi());
                }
                zzb2 = this.zzc.zza;
            }
            zzb2.zza(i10, zzi, arrayList, this.zza, this.zzb);
        }
        return zzap.zzf;
    }
}
