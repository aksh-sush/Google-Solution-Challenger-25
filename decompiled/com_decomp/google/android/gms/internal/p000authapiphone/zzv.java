package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import n4.i;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzv  reason: invalid package */
public final class zzv extends d {
    private static final a.g zza;
    private static final a.C0085a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zzt = new zzt();
        zzb = zzt;
        zzc = new a("SmsCodeBrowser.API", zzt, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (a.d) a.d.f5283a, d.a.f5285c);
    }

    public final i startSmsCodeRetriever() {
        return doWrite(v.a().d(zzac.zzb).b(new zzs(this)).e(1566).a());
    }

    public zzv(Context context) {
        super(context, zzc, (a.d) a.d.f5283a, d.a.f5285c);
    }
}
