package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzf  reason: invalid package */
final class zzzf {
    private final zzze zza;

    private zzzf(zzze zzze) {
        zzaac.zzf(zzze, "output");
        this.zza = zzze;
        zzze.zze = this;
    }

    public static zzzf zza(zzze zzze) {
        zzzf zzzf = zzze.zze;
        return zzzf != null ? zzzf : new zzzf(zzze);
    }

    public final void zzA(int i10, int i11) {
        this.zza.zzr(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzB(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = list.get(i13).intValue();
                i12 += zzze.zzE((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                zzze zzze = this.zza;
                int intValue2 = list.get(i11).intValue();
                zzze.zzs((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzze zzze2 = this.zza;
            int intValue3 = list.get(i11).intValue();
            zzze2.zzr(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzC(int i10, long j10) {
        this.zza.zzt(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzD(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = list.get(i13).longValue();
                i12 += zzze.zzF((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                zzze zzze = this.zza;
                long longValue2 = list.get(i11).longValue();
                zzze.zzu((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzze zzze2 = this.zza;
            long longValue3 = list.get(i11).longValue();
            zzze2.zzt(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public final void zzE(int i10) {
        this.zza.zzq(i10, 3);
    }

    public final void zzF(int i10, String str) {
        this.zza.zzo(i10, str);
    }

    public final void zzG(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzaaj) {
            zzaaj zzaaj = (zzaaj) list;
            while (i11 < list.size()) {
                Object zzf = zzaaj.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzo(i10, (String) zzf);
                } else {
                    this.zza.zzQ(i10, (zzyu) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzo(i10, list.get(i11));
            i11++;
        }
    }

    public final void zzH(int i10, int i11) {
        this.zza.zzr(i10, i11);
    }

    public final void zzI(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzze.zzE(list.get(i13).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzs(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzJ(int i10, long j10) {
        this.zza.zzt(i10, j10);
    }

    public final void zzK(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzze.zzF(list.get(i13).longValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzu(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzt(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzP(i10, z10);
    }

    public final void zzc(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                i12++;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzO(list.get(i11).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzP(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzd(int i10, zzyu zzyu) {
        this.zza.zzQ(i10, zzyu);
    }

    public final void zze(int i10, List<zzyu> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzQ(i10, list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public final void zzh(int i10) {
        this.zza.zzq(i10, 4);
    }

    public final void zzi(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    public final void zzj(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzze.zzy(list.get(i13).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzk(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zzl(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }

    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzo(int i10, float f10) {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public final void zzq(int i10, Object obj, zzabl zzabl) {
        zzze zzze = this.zza;
        zzze.zzq(i10, 3);
        zzabl.zzn((zzaaz) obj, zzze.zze);
        zzze.zzq(i10, 4);
    }

    public final void zzr(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    public final void zzs(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzze.zzy(list.get(i13).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzt(int i10, long j10) {
        this.zza.zzt(i10, j10);
    }

    public final void zzu(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzze.zzF(list.get(i13).longValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzu(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzt(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzv(int i10, Object obj, zzabl zzabl) {
        this.zza.zzn(i10, (zzaaz) obj, zzabl);
    }

    public final void zzw(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zzx(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzy(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }

    public final void zzz(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, list.get(i11).longValue());
            i11++;
        }
    }
}
