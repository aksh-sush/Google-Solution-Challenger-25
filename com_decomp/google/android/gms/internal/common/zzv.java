package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzv implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzx zzb;

    zzv(zzx zzx, CharSequence charSequence) {
        this.zzb = zzx;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence zza2 = zzq.zza(it.next(), ", ");
                while (true) {
                    sb2.append(zza2);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(", ");
                    zza2 = zzq.zza(it.next(), ", ");
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
