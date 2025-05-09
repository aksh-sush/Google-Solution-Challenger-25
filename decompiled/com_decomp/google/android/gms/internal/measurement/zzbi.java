package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbi extends zzaw {
    protected zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzh.zzh(zzbl.ADD.name(), 2, list);
            zzap zzb = zzg.zzb(list.get(0));
            zzap zzb2 = zzg.zzb(list.get(1));
            if (!(zzb instanceof zzal) && !(zzb instanceof zzat) && !(zzb2 instanceof zzal) && !(zzb2 instanceof zzat)) {
                return new zzah(Double.valueOf(zzb.zzh().doubleValue() + zzb2.zzh().doubleValue()));
            }
            String valueOf = String.valueOf(zzb.zzi());
            String valueOf2 = String.valueOf(zzb2.zzi());
            return new zzat(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            zzh.zzh(zzbl.DIVIDE.name(), 2, list);
            return new zzah(Double.valueOf(zzg.zzb(list.get(0)).zzh().doubleValue() / zzg.zzb(list.get(1)).zzh().doubleValue()));
        } else if (ordinal == 59) {
            zzh.zzh(zzbl.SUBTRACT.name(), 2, list);
            return new zzah(Double.valueOf(zzg.zzb(list.get(0)).zzh().doubleValue() + new zzah(Double.valueOf(-zzg.zzb(list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            zzh.zzh(str, 2, list);
            zzap zzb3 = zzg.zzb(list.get(0));
            zzg.zzb(list.get(1));
            return zzb3;
        } else if (ordinal == 55 || ordinal == 56) {
            zzh.zzh(str, 1, list);
            return zzg.zzb(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    zzh.zzh(zzbl.MODULUS.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.zzb(list.get(0)).zzh().doubleValue() % zzg.zzb(list.get(1)).zzh().doubleValue()));
                case 45:
                    zzh.zzh(zzbl.MULTIPLY.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.zzb(list.get(0)).zzh().doubleValue() * zzg.zzb(list.get(1)).zzh().doubleValue()));
                case 46:
                    zzh.zzh(zzbl.NEGATE.name(), 1, list);
                    return new zzah(Double.valueOf(-zzg.zzb(list.get(0)).zzh().doubleValue()));
                default:
                    return super.zzb(str);
            }
        }
    }
}
