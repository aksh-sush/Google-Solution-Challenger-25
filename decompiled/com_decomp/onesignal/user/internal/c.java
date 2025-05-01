package com.onesignal.user.internal;

import ba.d;
import db.l;

public final class c extends d implements d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.onesignal.user.internal.subscriptions.d dVar) {
        super(dVar);
        l.e(dVar, "model");
    }

    public String getNumber() {
        return getModel().getAddress();
    }
}
