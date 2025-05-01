package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.s;
import h3.a;
import j3.a;

/* renamed from: com.google.android.gms.internal.auth-api.zbl  reason: invalid package */
public final class zbl implements a {
    public final PendingResult delete(GoogleApiClient googleApiClient, Credential credential) {
        s.l(googleApiClient, "client must not be null");
        s.l(credential, "credential must not be null");
        return googleApiClient.g(new zbi(this, googleApiClient, credential));
    }

    public final PendingResult disableAutoSignIn(GoogleApiClient googleApiClient) {
        s.l(googleApiClient, "client must not be null");
        return googleApiClient.g(new zbj(this, googleApiClient));
    }

    public final PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        s.l(googleApiClient, "client must not be null");
        s.l(hintRequest, "request must not be null");
        a.C0229a zba = ((zbo) googleApiClient.i(h3.a.f10934g)).zba();
        return zbn.zba(googleApiClient.j(), zba, hintRequest, zba.d());
    }

    public final PendingResult request(GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.a aVar) {
        s.l(googleApiClient, "client must not be null");
        s.l(aVar, "request must not be null");
        return googleApiClient.f(new zbg(this, googleApiClient, aVar));
    }

    public final PendingResult save(GoogleApiClient googleApiClient, Credential credential) {
        s.l(googleApiClient, "client must not be null");
        s.l(credential, "credential must not be null");
        return googleApiClient.g(new zbh(this, googleApiClient, credential));
    }
}
