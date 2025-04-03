package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.user.internal.subscriptions.f;
import db.l;

public final class c {
    private final f status;
    private final String token;

    public c(String str, f fVar) {
        l.e(fVar, "status");
        this.token = str;
        this.status = fVar;
    }

    public final f getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
