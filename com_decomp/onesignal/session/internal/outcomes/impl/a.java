package com.onesignal.session.internal.outcomes.impl;

import db.l;
import t9.c;

public final class a {
    private final c channel;
    private final String influenceId;

    public a(String str, c cVar) {
        l.e(str, "influenceId");
        l.e(cVar, "channel");
        this.influenceId = str;
        this.channel = cVar;
    }

    public final c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
