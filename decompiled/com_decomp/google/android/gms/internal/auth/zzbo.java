package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.v;
import h3.b;
import h3.c;
import n4.i;

public final class zzbo extends d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f10944a, (a.d) cVar == null ? c.f10948f : cVar, d.a.f5285c);
    }

    public final i getSpatulaHeader() {
        return doRead(v.a().b(new zzbk(this)).e(1520).a());
    }

    public final i performProxyRequest(m3.b bVar) {
        return doWrite(v.a().b(new zzbl(this, bVar)).e(1518).a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Context context, c cVar) {
        super(context, b.f10944a, (a.d) cVar == null ? c.f10948f : cVar, d.a.f5285c);
    }
}
