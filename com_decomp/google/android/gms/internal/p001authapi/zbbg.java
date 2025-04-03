package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import k3.a0;
import k3.b;
import k3.e;
import n4.i;
import n4.j;
import s3.e;

/* renamed from: com.google.android.gms.internal.auth-api.zbbg  reason: invalid package */
public final class zbbg extends d {
    private static final a.g zba;
    private static final a.C0085a zbb;
    private static final a zbc;
    private final String zbd = zbbj.zba();

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbbb zbbb = new zbbb();
        zbb = zbbb;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbbb, gVar);
    }

    public zbbg(Activity activity, a0 a0Var) {
        super(activity, zbc, (a.d) a0Var, d.a.f5285c);
    }

    public final i beginSignIn(b bVar) {
        s.k(bVar);
        b.a m02 = b.m0(bVar);
        m02.g(this.zbd);
        b a10 = m02.a();
        return doRead(v.a().d(zbbi.zba).b(new zbax(this, a10)).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new com.google.android.gms.common.api.b(Status.f5272o);
            } else if (status.j0()) {
                String stringExtra = intent.getStringExtra("phone_number_hint_result");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new com.google.android.gms.common.api.b(Status.f5270m);
            } else {
                throw new com.google.android.gms.common.api.b(status);
            }
        } else {
            throw new com.google.android.gms.common.api.b(Status.f5270m);
        }
    }

    public final i getPhoneNumberHintIntent(k3.d dVar) {
        s.k(dVar);
        return doRead(v.a().d(zbbi.zbh).b(new zbba(this, dVar)).e(1653).a());
    }

    public final k3.i getSignInCredentialFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new com.google.android.gms.common.api.b(Status.f5272o);
            } else if (status.j0()) {
                k3.i iVar = (k3.i) e.b(intent, "sign_in_credential", k3.i.CREATOR);
                if (iVar != null) {
                    return iVar;
                }
                throw new com.google.android.gms.common.api.b(Status.f5270m);
            } else {
                throw new com.google.android.gms.common.api.b(status);
            }
        } else {
            throw new com.google.android.gms.common.api.b(Status.f5270m);
        }
    }

    public final i getSignInIntent(k3.e eVar) {
        s.k(eVar);
        e.a l02 = k3.e.l0(eVar);
        l02.f(this.zbd);
        k3.e a10 = l02.a();
        return doRead(v.a().d(zbbi.zbf).b(new zbay(this, a10)).e(1555).a());
    }

    public final i signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient n10 : GoogleApiClient.h()) {
            n10.n();
        }
        h.a();
        return doWrite(v.a().d(zbbi.zbb).b(new zbaz(this)).c(false).e(1554).a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zba(k3.d dVar, zbbh zbbh, j jVar) {
        ((zbam) zbbh.getService()).zbd(new zbbf(this, jVar), dVar, this.zbd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zbb(zbbh zbbh, j jVar) {
        ((zbam) zbbh.getService()).zbf(new zbbd(this, jVar), this.zbd);
    }

    public zbbg(Context context, a0 a0Var) {
        super(context, zbc, (a.d) a0Var, d.a.f5285c);
    }
}
