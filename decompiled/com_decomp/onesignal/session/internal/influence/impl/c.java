package com.onesignal.session.internal.influence.impl;

import org.json.JSONArray;
import t9.d;

public interface c {
    void cacheIAMInfluenceType(d dVar);

    void cacheNotificationInfluenceType(d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
