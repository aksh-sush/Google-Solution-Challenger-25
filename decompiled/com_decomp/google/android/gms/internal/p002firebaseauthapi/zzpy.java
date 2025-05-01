package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzpv;
import java.util.concurrent.Future;
import n4.i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy  reason: invalid package */
public abstract class zzpy<T extends zzpv> {
    private zzpu<T> zza;

    public final <ResultT, A extends a.b> i zza(zzpx<A, ResultT> zzpx) {
        return zzc().zza.doRead(zzpx.zza());
    }

    public final <ResultT, A extends a.b> i zzb(zzpx<A, ResultT> zzpx) {
        return zzc().zza.doWrite(zzpx.zza());
    }

    public final zzpu<T> zzc() {
        zzpu<T> zzpu;
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = (zzpu) zzd().get();
                } catch (Exception e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(valueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            zzpu = this.zza;
        }
        return zzpu;
    }

    /* access modifiers changed from: package-private */
    public abstract Future<zzpu<T>> zzd();
}
