package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.s;
import k3.b;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbax  reason: invalid package */
public final /* synthetic */ class zbax implements r {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ b zbb;

    public /* synthetic */ zbax(zbbg zbbg, b bVar) {
        this.zba = zbbg;
        this.zbb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbbg zbbg = this.zba;
        b bVar = this.zbb;
        ((zbam) ((zbbh) obj).getService()).zbc(new zbbc(zbbg, (j) obj2), (b) s.k(bVar));
    }
}
