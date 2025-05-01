package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import n4.j;

class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Utils f8325a;

    /* renamed from: b  reason: collision with root package name */
    private final j f8326b;

    public h(Utils utils, j jVar) {
        this.f8325a = utils;
        this.f8326b = jVar;
    }

    public boolean a(Exception exc) {
        this.f8326b.d(exc);
        return true;
    }

    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.f8325a.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.f8326b.c(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
