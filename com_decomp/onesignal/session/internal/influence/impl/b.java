package com.onesignal.session.internal.influence.impl;

import org.json.JSONArray;
import t9.c;
import t9.d;

public interface b {
    void cacheState();

    c getChannelType();

    t9.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(d dVar);
}
