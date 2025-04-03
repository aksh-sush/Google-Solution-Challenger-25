package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import db.l;
import kotlin.coroutines.jvm.internal.b;
import sa.t;
import t8.a;
import va.d;

public final class g implements a {
    public boolean getHasSubscribers() {
        return false;
    }

    public Location getLastLocation() {
        return null;
    }

    public Object start(d dVar) {
        return b.a(false);
    }

    public Object stop(d dVar) {
        return t.f15300a;
    }

    public void subscribe(t8.b bVar) {
        l.e(bVar, "handler");
    }

    public void unsubscribe(t8.b bVar) {
        l.e(bVar, "handler");
    }
}
