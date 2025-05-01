package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.s;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zban  reason: invalid package */
public final /* synthetic */ class zban implements r {
    public final /* synthetic */ zbaq zba;
    public final /* synthetic */ AuthorizationRequest zbb;

    public /* synthetic */ zban(zbaq zbaq, AuthorizationRequest authorizationRequest) {
        this.zba = zbaq;
        this.zbb = authorizationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbaq zbaq = this.zba;
        AuthorizationRequest authorizationRequest = this.zbb;
        ((zbaa) ((zbw) obj).getService()).zbc(new zbap(zbaq, (j) obj2), (AuthorizationRequest) s.k(authorizationRequest));
    }
}
