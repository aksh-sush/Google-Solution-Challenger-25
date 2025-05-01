package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.config.b;
import db.l;

public final class a implements h9.a {
    private final b _configModelStore;
    private final a8.a _time;

    public a(b bVar, a8.a aVar) {
        l.e(bVar, "_configModelStore");
        l.e(aVar, "_time");
        this._configModelStore = bVar;
        this._time = aVar;
    }

    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb2 = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb2.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb2;
    }
}
