package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzjl {
    static final zzjl zza = new zzjl(true);
    private static volatile boolean zzb = false;
    private static volatile zzjl zzc;
    private static volatile zzjl zzd;
    private final Map<zzjk, zzjx<?, ?>> zze;

    zzjl() {
        this.zze = new HashMap();
    }

    public static zzjl zza() {
        zzjl zzjl = zzc;
        if (zzjl == null) {
            synchronized (zzjl.class) {
                zzjl = zzc;
                if (zzjl == null) {
                    zzjl = zza;
                    zzc = zzjl;
                }
            }
        }
        return zzjl;
    }

    public static zzjl zzb() {
        zzjl zzjl = zzd;
        if (zzjl != null) {
            return zzjl;
        }
        synchronized (zzjl.class) {
            zzjl zzjl2 = zzd;
            if (zzjl2 != null) {
                return zzjl2;
            }
            zzjl zzb2 = zzjt.zzb(zzjl.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final <ContainingType extends zzlg> zzjx<ContainingType, ?> zzc(ContainingType containingtype, int i10) {
        return this.zze.get(new zzjk(containingtype, i10));
    }

    zzjl(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
