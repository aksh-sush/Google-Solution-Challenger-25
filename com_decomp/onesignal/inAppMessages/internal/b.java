package com.onesignal.inAppMessages.internal;

import db.l;
import e8.a;
import e8.d;
import org.json.JSONObject;

public final class b implements e8.b {
    private final a _message;
    private final c _result;

    public b(a aVar, c cVar) {
        l.e(aVar, "msg");
        l.e(cVar, "actn");
        this._message = aVar;
        this._result = cVar;
    }

    public a getMessage() {
        return this._message;
    }

    public d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        l.d(put, "JSONObject()\n           …, _result.toJSONObject())");
        return put;
    }
}
