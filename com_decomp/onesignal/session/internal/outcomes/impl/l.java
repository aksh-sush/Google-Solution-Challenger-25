package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.impl.e;
import db.g;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    public l() {
        this((JSONArray) null, (JSONArray) null, 3, (g) null);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(e.NOTIFICATIONS_IDS, this.notificationIds).put("in_app_message_ids", this.inAppMessagesIds);
        db.l.d(put, "JSONObject()\n           …AM_IDS, inAppMessagesIds)");
        return put;
    }

    public String toString() {
        return "OutcomeSourceBody{notificationIds=" + this.notificationIds + ", inAppMessagesIds=" + this.inAppMessagesIds + '}';
    }

    public l(JSONArray jSONArray) {
        this(jSONArray, (JSONArray) null, 2, (g) null);
    }

    public l(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(JSONArray jSONArray, JSONArray jSONArray2, int i10, g gVar) {
        this((i10 & 1) != 0 ? new JSONArray() : jSONArray, (i10 & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
