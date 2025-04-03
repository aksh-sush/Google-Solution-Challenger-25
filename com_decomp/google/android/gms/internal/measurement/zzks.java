package com.google.android.gms.internal.measurement;

final class zzks extends zzku {
    private zzks() {
        super((zzkt) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j10) {
        ((zzkg) zzms.zzf(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzkg zzkg = (zzkg) zzms.zzf(obj, j10);
        zzkg zzkg2 = (zzkg) zzms.zzf(obj2, j10);
        int size = zzkg.size();
        int size2 = zzkg2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkg.zzc()) {
                zzkg = zzkg.zzd(size2 + size);
            }
            zzkg.addAll(zzkg2);
        }
        if (size > 0) {
            zzkg2 = zzkg;
        }
        zzms.zzs(obj, j10, zzkg2);
    }

    /* synthetic */ zzks(zzkr zzkr) {
        super((zzkt) null);
    }
}
