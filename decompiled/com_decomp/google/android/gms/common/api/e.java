package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.s;

public abstract class e {
    public static PendingResult a(h hVar, GoogleApiClient googleApiClient) {
        s.l(hVar, "Result must not be null");
        s.b(!hVar.getStatus().j0(), "Status code must not be SUCCESS");
        o oVar = new o(googleApiClient, hVar);
        oVar.setResult(hVar);
        return oVar;
    }

    public static PendingResult b(Status status, GoogleApiClient googleApiClient) {
        s.l(status, "Result must not be null");
        u uVar = new u(googleApiClient);
        uVar.setResult(status);
        return uVar;
    }
}
