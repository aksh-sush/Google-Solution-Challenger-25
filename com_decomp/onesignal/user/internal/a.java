package com.onesignal.user.internal;

import com.onesignal.user.internal.subscriptions.d;
import db.l;

public final class a extends d implements ba.a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(dVar);
        l.e(dVar, "model");
    }

    public String getEmail() {
        return getModel().getAddress();
    }
}
