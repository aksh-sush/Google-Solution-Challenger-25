package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.s;
import k3.g;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbas  reason: invalid package */
public final /* synthetic */ class zbas implements r {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ g zbb;

    public /* synthetic */ zbas(zbaw zbaw, g gVar) {
        this.zba = zbaw;
        this.zbb = gVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbaw zbaw = this.zba;
        g gVar = this.zbb;
        ((zbad) ((zbx) obj).getService()).zbd(new zbav(zbaw, (j) obj2), (g) s.k(gVar));
    }
}
