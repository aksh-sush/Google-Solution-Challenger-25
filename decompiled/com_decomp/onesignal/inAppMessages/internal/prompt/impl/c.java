package com.onesignal.inAppMessages.internal.prompt.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.notifications.n;
import db.l;
import m8.a;

public final class c implements a {
    private final com.onesignal.location.a _locationManager;
    private final n _notificationsManager;

    public c(n nVar, com.onesignal.location.a aVar) {
        l.e(nVar, "_notificationsManager");
        l.e(aVar, "_locationManager");
        this._notificationsManager = nVar;
        this._locationManager = aVar;
    }

    public b createPrompt(String str) {
        l.e(str, "promptType");
        if (l.a(str, "push")) {
            return new d(this._notificationsManager);
        }
        if (l.a(str, FirebaseAnalytics.Param.LOCATION)) {
            return new a(this._locationManager);
        }
        return null;
    }
}
