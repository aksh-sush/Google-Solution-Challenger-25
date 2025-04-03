package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import n4.i;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
public final class zzr extends d {
    private static final a.g zza;
    private static final a.C0085a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zzn = new zzn();
        zzb = zzn;
        zzc = new a("SmsCodeAutofill.API", zzn, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (a.d) a.d.f5283a, d.a.f5285c);
    }

    public final i checkPermissionState() {
        return doRead(v.a().d(zzac.zza).b(new zzk(this)).e(1564).a());
    }

    public final i hasOngoingSmsRequest(String str) {
        s.k(str);
        s.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(v.a().d(zzac.zza).b(new zzm(this, str)).e(1565).a());
    }

    public final i startSmsCodeRetriever() {
        return doWrite(v.a().d(zzac.zza).b(new zzl(this)).e(1563).a());
    }

    public zzr(Context context) {
        super(context, zzc, (a.d) a.d.f5283a, d.a.f5285c);
    }
}
