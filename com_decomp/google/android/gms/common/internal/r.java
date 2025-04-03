package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import n4.i;
import n4.j;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final t0 f5695a = new p0();

    public interface a {
        Object a(h hVar);
    }

    public static i a(PendingResult pendingResult, g gVar) {
        return b(pendingResult, new r0(gVar));
    }

    public static i b(PendingResult pendingResult, a aVar) {
        t0 t0Var = f5695a;
        j jVar = new j();
        pendingResult.addStatusListener(new q0(pendingResult, jVar, aVar, t0Var));
        return jVar.a();
    }

    public static i c(PendingResult pendingResult) {
        return b(pendingResult, new s0());
    }
}
