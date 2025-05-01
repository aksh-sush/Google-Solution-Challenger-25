package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import n4.j;

class i implements j {

    /* renamed from: a  reason: collision with root package name */
    final j f8327a;

    public i(j jVar) {
        this.f8327a = jVar;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f8327a.e(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
