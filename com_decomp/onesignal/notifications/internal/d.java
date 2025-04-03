package com.onesignal.notifications.internal;

import com.onesignal.notifications.f;
import com.onesignal.notifications.g;
import com.onesignal.notifications.i;
import db.l;
import org.json.JSONObject;

public final class d implements g {
    private final c _notification;
    private final e _result;

    public d(c cVar, e eVar) {
        l.e(cVar, "_notification");
        l.e(eVar, "_result");
        this._notification = cVar;
        this._result = eVar;
    }

    public f getNotification() {
        return this._notification;
    }

    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        l.d(put, "JSONObject()\n           …, _result.toJSONObject())");
        return put;
    }
}
