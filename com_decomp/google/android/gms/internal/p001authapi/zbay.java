package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.s;
import k3.e;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbay  reason: invalid package */
public final /* synthetic */ class zbay implements r {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ e zbb;

    public /* synthetic */ zbay(zbbg zbbg, e eVar) {
        this.zba = zbbg;
        this.zbb = eVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbbg zbbg = this.zba;
        e eVar = this.zbb;
        ((zbam) ((zbbh) obj).getService()).zbe(new zbbe(zbbg, (j) obj2), (e) s.k(eVar));
    }
}
