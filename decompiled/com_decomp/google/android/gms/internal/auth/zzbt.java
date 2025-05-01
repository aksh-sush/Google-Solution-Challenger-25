package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.s;
import m3.a;
import m3.b;

public final class zzbt implements a {
    public final PendingResult getSpatulaHeader(GoogleApiClient googleApiClient) {
        s.k(googleApiClient);
        return googleApiClient.g(new zzbs(this, googleApiClient));
    }

    public final PendingResult performProxyRequest(GoogleApiClient googleApiClient, b bVar) {
        s.k(googleApiClient);
        s.k(bVar);
        return googleApiClient.g(new zzbq(this, googleApiClient, bVar));
    }
}
