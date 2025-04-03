package com.onesignal.session.internal.influence.impl;

import a8.a;
import db.l;
import org.json.JSONArray;
import org.json.JSONException;
import t9.c;

public final class d extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar, a aVar) {
        super(fVar, aVar);
        l.e(fVar, "dataRepository");
        l.e(aVar, "timeProvider");
    }

    public void cacheState() {
        t9.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = t9.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == t9.d.DIRECT) {
            influenceType = t9.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    public c getChannelType() {
        return c.IAM;
    }

    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (!l.a(str, lastChannelObjects.getJSONObject(i10).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i10));
                    }
                }
                return jSONArray;
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.a.error("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                return lastChannelObjects;
            }
        } catch (JSONException e11) {
            com.onesignal.debug.internal.logging.a.error("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    public void initInfluencedTypeFromCache() {
        t9.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, (Throwable) null, 2, (Object) null);
    }

    public void saveChannelObjects(JSONArray jSONArray) {
        l.e(jSONArray, "channelObjects");
        getDataRepository().saveIAMs(jSONArray);
    }
}
