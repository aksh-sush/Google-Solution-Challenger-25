package com.google.android.gms.internal.p001authapi;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import k3.l;
import n4.i;
import s3.e;

/* renamed from: com.google.android.gms.internal.auth-api.zbaq  reason: invalid package */
public final class zbaq extends d {
    private static final a.g zba;
    private static final a.C0085a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbao zbao = new zbao();
        zbb = zbao;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbao, gVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zbaq(android.app.Activity r3, k3.l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = zbc
            k3.k r4 = k3.k.c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p001authapi.zbbj.zba()
            r4.a(r1)
            k3.l r4 = r4.b()
            com.google.android.gms.common.api.d$a r1 = com.google.android.gms.common.api.d.a.f5285c
            r2.<init>((android.app.Activity) r3, (com.google.android.gms.common.api.a) r0, (com.google.android.gms.common.api.a.d) r4, (com.google.android.gms.common.api.d.a) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaq.<init>(android.app.Activity, k3.l):void");
    }

    public final i authorize(AuthorizationRequest authorizationRequest) {
        s.k(authorizationRequest);
        AuthorizationRequest.a w02 = AuthorizationRequest.w0(authorizationRequest);
        w02.g(((l) getApiOptions()).b());
        AuthorizationRequest a10 = w02.a();
        return doRead(v.a().d(zbbi.zbc).b(new zban(this, a10)).c(false).e(1534).a());
    }

    public final k3.a getAuthorizationResultFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new b(Status.f5272o);
            } else if (status.j0()) {
                k3.a aVar = (k3.a) e.b(intent, "authorization_result", k3.a.CREATOR);
                if (aVar != null) {
                    return aVar;
                }
                throw new b(Status.f5270m);
            } else {
                throw new b(status);
            }
        } else {
            throw new b(Status.f5270m);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zbaq(android.content.Context r3, k3.l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = zbc
            k3.k r4 = k3.k.c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p001authapi.zbbj.zba()
            r4.a(r1)
            k3.l r4 = r4.b()
            com.google.android.gms.common.api.d$a r1 = com.google.android.gms.common.api.d.a.f5285c
            r2.<init>((android.content.Context) r3, (com.google.android.gms.common.api.a) r0, (com.google.android.gms.common.api.a.d) r4, (com.google.android.gms.common.api.d.a) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaq.<init>(android.content.Context, k3.l):void");
    }
}
