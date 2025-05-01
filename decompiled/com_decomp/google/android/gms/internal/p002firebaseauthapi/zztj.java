package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.d;
import com.google.firebase.FirebaseExceptionMapper;
import java.util.concurrent.Callable;
import q3.j;
import q3.o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztj  reason: invalid package */
final class zztj implements Callable<zzpu<zzuf>> {
    private final zzuf zza;
    private final Context zzb;

    public zztj(zzuf zzuf, Context context) {
        this.zza = zzuf;
        this.zzb = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        int j10 = j.q().j(this.zzb, o.f14688a);
        boolean unused = zztk.zza = j10 == 0 || j10 == 2;
        Context context = this.zzb;
        zzuf zzb2 = this.zza.zza();
        zzb2.zza = true;
        return new zzpu(new zzpw(context, zzug.zzb, zzb2, new d.a.C0087a().c(new FirebaseExceptionMapper()).a()));
    }
}
