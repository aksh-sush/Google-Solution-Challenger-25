package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzal implements b {
    /* access modifiers changed from: private */
    public static final Status zza = new Status(13);

    public final PendingResult addWorkAccount(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.g(new zzae(this, a.f5062a, googleApiClient, str));
    }

    public final PendingResult removeWorkAccount(GoogleApiClient googleApiClient, Account account) {
        return googleApiClient.g(new zzag(this, a.f5062a, googleApiClient, account));
    }

    public final void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(googleApiClient, z10);
    }

    public final PendingResult setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z10) {
        return googleApiClient.g(new zzac(this, a.f5062a, googleApiClient, z10));
    }
}
