package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.impl.e;
import org.json.JSONObject;

public final class k {
    private l directBody;
    private l indirectBody;

    public k(l lVar, l lVar2) {
        this.directBody = lVar;
        this.indirectBody = lVar2;
    }

    public final l getDirectBody() {
        return this.directBody;
    }

    public final l getIndirectBody() {
        return this.indirectBody;
    }

    public final k setDirectBody(l lVar) {
        this.directBody = lVar;
        return this;
    }

    public final k setIndirectBody(l lVar) {
        this.indirectBody = lVar;
        return this;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        l lVar = this.directBody;
        if (lVar != null) {
            jSONObject.put(e.DIRECT_TAG, lVar.toJSONObject());
        }
        l lVar2 = this.indirectBody;
        if (lVar2 != null) {
            jSONObject.put("indirect", lVar2.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        return "OutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }

    /* renamed from: setDirectBody  reason: collision with other method in class */
    public final void m13setDirectBody(l lVar) {
        this.directBody = lVar;
    }

    /* renamed from: setIndirectBody  reason: collision with other method in class */
    public final void m14setIndirectBody(l lVar) {
        this.indirectBody = lVar;
    }
}
