package com.onesignal.user.internal;

import ba.e;
import com.onesignal.common.h;
import db.l;

public abstract class d implements e {
    private final com.onesignal.user.internal.subscriptions.d model;

    public d(com.onesignal.user.internal.subscriptions.d dVar) {
        l.e(dVar, "model");
        this.model = dVar;
    }

    public String getId() {
        return h.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final com.onesignal.user.internal.subscriptions.d getModel() {
        return this.model;
    }
}
