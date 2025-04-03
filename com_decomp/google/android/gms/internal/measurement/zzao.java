package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzao extends zzai {
    protected final List<String> zza;
    protected final List<zzap> zzb;
    protected zzg zzc;

    private zzao(zzao zzao) {
        super(zzao.zzd);
        ArrayList arrayList = new ArrayList(zzao.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzao.zza);
        ArrayList arrayList2 = new ArrayList(zzao.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzao.zzb);
        this.zzc = zzao.zzc;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzap zzap;
        String str;
        zzg zza2 = this.zzc.zza();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (i10 < list.size()) {
                str = this.zza.get(i10);
                zzap = zzg.zzb(list.get(i10));
            } else {
                str = this.zza.get(i10);
                zzap = zzap.zzf;
            }
            zza2.zze(str, zzap);
        }
        for (zzap next : this.zzb) {
            zzap zzb2 = zza2.zzb(next);
            if (zzb2 instanceof zzaq) {
                zzb2 = zza2.zzb(next);
            }
            if (zzb2 instanceof zzag) {
                return ((zzag) zzb2).zzb();
            }
        }
        return zzap.zzf;
    }

    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List<zzap> list, List<zzap> list2, zzg zzg) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzg;
        if (!list.isEmpty()) {
            for (zzap zzi : list) {
                this.zza.add(zzi.zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
