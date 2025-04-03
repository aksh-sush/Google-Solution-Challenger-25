package com.onesignal.session.internal.influence.impl;

import a8.a;
import db.l;
import org.json.JSONArray;
import org.json.JSONException;
import t9.c;
import t9.d;

public final class h extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar) {
        super(fVar, aVar);
        l.e(fVar, "dataRepository");
        l.e(aVar, "timeProvider");
    }

    public void cacheState() {
        f dataRepository = getDataRepository();
        d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    public c getChannelType() {
        return c.NOTIFICATION;
    }

    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.a.error("Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    public void initInfluencedTypeFromCache() {
        d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.a.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, (Throwable) null, 2, (Object) null);
    }

    public void saveChannelObjects(JSONArray jSONArray) {
        l.e(jSONArray, "channelObjects");
        getDataRepository().saveNotifications(jSONArray);
    }
}
