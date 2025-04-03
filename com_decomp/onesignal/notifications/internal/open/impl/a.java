package com.onesignal.notifications.internal.open.impl;

import db.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public a(JSONArray jSONArray, JSONObject jSONObject) {
        l.e(jSONArray, "dataArray");
        l.e(jSONObject, "jsonData");
        this.dataArray = jSONArray;
        this.jsonData = jSONObject;
    }

    public static /* synthetic */ a copy$default(a aVar, JSONArray jSONArray, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONArray = aVar.dataArray;
        }
        if ((i10 & 2) != 0) {
            jSONObject = aVar.jsonData;
        }
        return aVar.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final a copy(JSONArray jSONArray, JSONObject jSONObject) {
        l.e(jSONArray, "dataArray");
        l.e(jSONObject, "jsonData");
        return new a(jSONArray, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.dataArray, aVar.dataArray) && l.a(this.jsonData, aVar.jsonData);
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        return (this.dataArray.hashCode() * 31) + this.jsonData.hashCode();
    }

    public final void setDataArray(JSONArray jSONArray) {
        l.e(jSONArray, "<set-?>");
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        l.e(jSONObject, "<set-?>");
        this.jsonData = jSONObject;
    }

    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}
