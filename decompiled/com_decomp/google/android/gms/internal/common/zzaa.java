package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i10) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i11);
        } else {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i12 = this.zzb;
            this.zzb = i12 + 1;
            objArr2[i12] = obj;
            return this;
        }
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i122 = this.zzb;
        this.zzb = i122 + 1;
        objArr22[i122] = obj;
        return this;
    }
}
