package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import k3.g;
import k3.p;
import n4.i;
import s3.e;

/* renamed from: com.google.android.gms.internal.auth-api.zbaw  reason: invalid package */
public final class zbaw extends d {
    private static final a.g zba;
    private static final a.C0085a zbb;
    private static final a zbc;
    private final String zbd = zbbj.zba();

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbat zbat = new zbat();
        zbb = zbat;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbat, gVar);
    }

    public zbaw(Activity activity, p pVar) {
        super(activity, zbc, (a.d) pVar, d.a.f5285c);
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.f5270m;
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        return status == null ? Status.f5270m : status;
    }

    public final i saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        s.k(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a l02 = SaveAccountLinkingTokenRequest.l0(saveAccountLinkingTokenRequest);
        l02.f(this.zbd);
        SaveAccountLinkingTokenRequest a10 = l02.a();
        return doRead(v.a().d(zbbi.zbg).b(new zbar(this, a10)).c(false).e(1535).a());
    }

    public final i savePassword(g gVar) {
        s.k(gVar);
        g.a W = g.W(gVar);
        W.c(this.zbd);
        g a10 = W.a();
        return doRead(v.a().d(zbbi.zbe).b(new zbas(this, a10)).c(false).e(1536).a());
    }

    public zbaw(Context context, p pVar) {
        super(context, zbc, (a.d) pVar, d.a.f5285c);
    }
}
