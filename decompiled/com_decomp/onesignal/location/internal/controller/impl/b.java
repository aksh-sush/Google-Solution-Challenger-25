package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.api.GoogleApiClient;
import db.l;

public final class b {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public b(GoogleApiClient googleApiClient) {
        l.e(googleApiClient, "realInstance");
        this.realInstance = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public final q3.b blockingConnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("blockingConnect", new Class[0]).invoke(this.realInstance, new Object[0]);
            l.c(invoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (q3.b) invoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
