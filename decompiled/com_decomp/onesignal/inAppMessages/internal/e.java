package com.onesignal.inAppMessages.internal;

import db.l;
import e8.a;
import e8.f;
import e8.h;
import e8.i;

public class e implements i, h, f, e8.e {
    private final a message;

    public e(a aVar) {
        l.e(aVar, "message");
        this.message = aVar;
    }

    public a getMessage() {
        return this.message;
    }
}
