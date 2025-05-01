package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import g3.b;
import g3.g;
import g3.h;
import n4.i;
import n4.j;

final class zzab extends d implements zzg {
    private static final a.g zza;
    private static final a.C0085a zzb;
    private static final a zzc;
    private static final u3.a zzd = g.a("GoogleAuthServiceClient");
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzv = new zzv();
        zzb = zzv;
        zzc = new a("GoogleAuthService.API", zzv, gVar);
    }

    zzab(Context context) {
        super(context, zzc, (a.d) a.d.f5283a, d.a.f5285c);
        this.zze = context;
    }

    static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, j jVar) {
        if (!w.c(status, obj, jVar)) {
            zzd.h("The task is already complete.", new Object[0]);
        }
    }

    public final i zza(zzbw zzbw) {
        return doWrite(v.a().d(h.f10667j).b(new zzt(this, zzbw)).e(1513).a());
    }

    public final i zzb(b bVar) {
        s.l(bVar, "request cannot be null.");
        return doWrite(v.a().d(h.f10666i).b(new zzu(this, bVar)).e(1515).a());
    }

    public final i zzc(Account account, String str, Bundle bundle) {
        s.l(account, "Account name cannot be null!");
        s.h(str, "Scope cannot be null!");
        return doWrite(v.a().d(h.f10667j).b(new zzs(this, account, str, bundle)).e(1512).a());
    }

    public final i zzd(Account account) {
        s.l(account, "account cannot be null.");
        return doWrite(v.a().d(h.f10666i).b(new zzr(this, account)).e(1517).a());
    }

    public final i zze(String str) {
        s.l(str, "Client package name cannot be null!");
        return doWrite(v.a().d(h.f10666i).b(new zzq(this, str)).e(1514).a());
    }
}
