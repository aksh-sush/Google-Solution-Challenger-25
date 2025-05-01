package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.config.b;
import db.l;
import org.json.JSONArray;
import t9.d;
import y7.a;

public final class f implements c {
    private final b _configModelStore;
    private final a preferences;

    public f(a aVar, b bVar) {
        l.e(aVar, "preferences");
        l.e(bVar, "_configModelStore");
        this.preferences = aVar;
        this._configModelStore = bVar;
    }

    public void cacheIAMInfluenceType(d dVar) {
        l.e(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, dVar.toString());
    }

    public void cacheNotificationInfluenceType(d dVar) {
        l.e(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, dVar.toString());
    }

    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    public String getCachedNotificationOpenId() {
        return this.preferences.getString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, (String) null);
    }

    public d getIamCachedInfluenceType() {
        return d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, d.UNATTRIBUTED.toString()));
    }

    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    public JSONArray getLastIAMsReceivedData() {
        JSONArray jSONArray;
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        if (string == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    public JSONArray getLastNotificationsReceivedData() {
        JSONArray jSONArray;
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        if (string == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    public d getNotificationCachedInfluenceType() {
        return d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, d.UNATTRIBUTED.toString()));
    }

    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    public void saveIAMs(JSONArray jSONArray) {
        l.e(jSONArray, "iams");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, jSONArray.toString());
    }

    public void saveNotifications(JSONArray jSONArray) {
        l.e(jSONArray, "notifications");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, jSONArray.toString());
    }
}
