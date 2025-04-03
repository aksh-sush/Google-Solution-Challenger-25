package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.s;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbar  reason: invalid package */
public final /* synthetic */ class zbar implements r {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbar(zbaw zbaw, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbaw;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbaw zbaw = this.zba;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.zbb;
        ((zbad) ((zbx) obj).getService()).zbc(new zbau(zbaw, (j) obj2), (SaveAccountLinkingTokenRequest) s.k(saveAccountLinkingTokenRequest));
    }
}
