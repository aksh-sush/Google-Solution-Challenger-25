package com.onesignal.session.internal.influence.impl;

import db.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.b;
import t9.c;
import t9.d;

public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private d influenceType;
    private a8.a timeProvider;

    public a(f fVar, a8.a aVar) {
        l.e(fVar, "dataRepository");
        l.e(aVar, "timeProvider");
        this.dataRepository = fVar;
        this.timeProvider = aVar;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return getInfluenceType() == aVar.getInfluenceType() && l.a(aVar.getIdTag(), getIdTag());
    }

    public abstract int getChannelLimit();

    public abstract /* synthetic */ c getChannelType();

    public b getCurrentSessionInfluence() {
        d dVar;
        c channelType = getChannelType();
        d dVar2 = d.DISABLED;
        b bVar = new b(channelType, dVar2, (JSONArray) null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        d influenceType2 = getInfluenceType();
        if (influenceType2 != null) {
            dVar2 = influenceType2;
        }
        if (dVar2.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                dVar = d.DIRECT;
            }
            return bVar;
        } else if (dVar2.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                dVar = d.INDIRECT;
            }
            return bVar;
        } else {
            if (isUnattributedSessionEnabled()) {
                dVar = d.UNATTRIBUTED;
            }
            return bVar;
        }
        bVar.setInfluenceType(dVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final f getDataRepository() {
        return this.dataRepository;
    }

    public String getDirectId() {
        return this.directId;
    }

    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    public d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.a.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, (Throwable) null, 2, (Object) null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i10);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.a.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    public int hashCode() {
        d influenceType2 = getInfluenceType();
        return ((influenceType2 != null ? influenceType2.hashCode() : 0) * 31) + getIdTag().hashCode();
    }

    public abstract void initInfluencedTypeFromCache();

    public void resetAndInitInfluence() {
        setDirectId((String) null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds2 = getIndirectIds();
        setInfluenceType((indirectIds2 != null ? indirectIds2.length() : 0) > 0 ? d.INDIRECT : d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.a.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), (Throwable) null, 2, (Object) null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    public void saveLastId(String str) {
        com.onesignal.debug.internal.logging.a.debug$default("ChannelTracker.saveLastId(id: " + str + "): idTag=" + getIdTag(), (Throwable) null, 2, (Object) null);
        if (str != null) {
            if (!(str.length() == 0)) {
                JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
                com.onesignal.debug.internal.logging.a.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, (Throwable) null, 2, (Object) null);
                try {
                    lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(e.TIME, this.timeProvider.getCurrentTimeMillis()));
                    if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                        JSONArray jSONArray = new JSONArray();
                        int length = lastChannelObjectsReceivedByNewId.length();
                        for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                            try {
                                jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                            } catch (JSONException e10) {
                                com.onesignal.debug.internal.logging.a.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                            }
                        }
                        lastChannelObjectsReceivedByNewId = jSONArray;
                    }
                    com.onesignal.debug.internal.logging.a.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, (Throwable) null, 2, (Object) null);
                    saveChannelObjects(lastChannelObjectsReceivedByNewId);
                } catch (JSONException e11) {
                    com.onesignal.debug.internal.logging.a.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e11);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setDataRepository(f fVar) {
        l.e(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    public void setDirectId(String str) {
        this.directId = str;
    }

    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    public void setInfluenceType(d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
