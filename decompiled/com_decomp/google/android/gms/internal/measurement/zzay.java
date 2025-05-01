package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzay extends zzaw {
    public zzay() {
        this.zza.add(zzbl.EQUALS);
        this.zza.add(zzbl.GREATER_THAN);
        this.zza.add(zzbl.GREATER_THAN_EQUALS);
        this.zza.add(zzbl.IDENTITY_EQUALS);
        this.zza.add(zzbl.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbl.LESS_THAN);
        this.zza.add(zzbl.LESS_THAN_EQUALS);
        this.zza.add(zzbl.NOT_EQUALS);
    }

    private static boolean zzc(zzap zzap, zzap zzap2) {
        if (zzap.getClass().equals(zzap2.getClass())) {
            if ((zzap instanceof zzau) || (zzap instanceof zzan)) {
                return true;
            }
            if (!(zzap instanceof zzah)) {
                return zzap instanceof zzat ? zzap.zzi().equals(zzap2.zzi()) : zzap instanceof zzaf ? zzap.zzg().equals(zzap2.zzg()) : zzap == zzap2;
            }
            if (Double.isNaN(zzap.zzh().doubleValue()) || Double.isNaN(zzap2.zzh().doubleValue())) {
                return false;
            }
            return zzap.zzh().equals(zzap2.zzh());
        } else if (((zzap instanceof zzau) || (zzap instanceof zzan)) && ((zzap2 instanceof zzau) || (zzap2 instanceof zzan))) {
            return true;
        } else {
            boolean z10 = zzap instanceof zzah;
            if (z10 && (zzap2 instanceof zzat)) {
                return zzc(zzap, new zzah(zzap2.zzh()));
            }
            boolean z11 = zzap instanceof zzat;
            if (z11 && (zzap2 instanceof zzah)) {
                return zzc(new zzah(zzap.zzh()), zzap2);
            }
            if (zzap instanceof zzaf) {
                return zzc(new zzah(zzap.zzh()), zzap2);
            }
            if (zzap2 instanceof zzaf) {
                return zzc(zzap, new zzah(zzap2.zzh()));
            }
            if ((z11 || z10) && (zzap2 instanceof zzal)) {
                return zzc(zzap, new zzat(zzap2.zzi()));
            }
            if (!(zzap instanceof zzal) || (!(zzap2 instanceof zzat) && !(zzap2 instanceof zzah))) {
                return false;
            }
            return zzc(new zzat(zzap.zzi()), zzap2);
        }
    }

    private static boolean zzd(zzap zzap, zzap zzap2) {
        if (zzap instanceof zzal) {
            zzap = new zzat(zzap.zzi());
        }
        if (zzap2 instanceof zzal) {
            zzap2 = new zzat(zzap2.zzi());
        }
        if ((zzap instanceof zzat) && (zzap2 instanceof zzat)) {
            return zzap.zzi().compareTo(zzap2.zzi()) < 0;
        }
        double doubleValue = zzap.zzh().doubleValue();
        double doubleValue2 = zzap2.zzh().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    private static boolean zze(zzap zzap, zzap zzap2) {
        if (zzap instanceof zzal) {
            zzap = new zzat(zzap.zzi());
        }
        if (zzap2 instanceof zzal) {
            zzap2 = new zzat(zzap2.zzi());
        }
        return (((zzap instanceof zzat) && (zzap2 instanceof zzat)) || (!Double.isNaN(zzap.zzh().doubleValue()) && !Double.isNaN(zzap2.zzh().doubleValue()))) && !zzd(zzap2, zzap);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        boolean z10;
        boolean zzc;
        zzh.zzh(zzh.zze(str).name(), 2, list);
        zzap zzb = zzg.zzb(list.get(0));
        zzap zzb2 = zzg.zzb(list.get(1));
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                zzc = zzc(zzb, zzb2);
            } else if (ordinal == 42) {
                z10 = zzd(zzb, zzb2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z10 = zzd(zzb2, zzb);
                        break;
                    case 38:
                        z10 = zze(zzb2, zzb);
                        break;
                    case 39:
                        z10 = zzh.zzl(zzb, zzb2);
                        break;
                    case 40:
                        zzc = zzh.zzl(zzb, zzb2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                z10 = zze(zzb, zzb2);
            }
            z10 = !zzc;
        } else {
            z10 = zzc(zzb, zzb2);
        }
        return z10 ? zzap.zzk : zzap.zzl;
    }
}
