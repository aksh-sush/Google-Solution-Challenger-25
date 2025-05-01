package com.onesignal.notifications.internal;

import com.onesignal.notifications.i;
import org.json.JSONObject;

public final class e implements i {
    private final String actionId;
    private final String url;

    public e(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(new JSONObject(), "actionId", getActionId()), "url", getUrl());
    }
}
