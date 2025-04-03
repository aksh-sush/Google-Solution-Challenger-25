package com.onesignal.inAppMessages.internal;

import db.l;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    public static final a Companion = new a((db.g) null);
    public static final String PAGE_ID = "pageId";
    public static final String PAGE_INDEX = "pageIndex";
    private String pageId;
    private String pageIndex;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    public g(JSONObject jSONObject) {
        l.e(jSONObject, "jsonObject");
        this.pageId = jSONObject.optString(PAGE_ID, (String) null);
        this.pageIndex = jSONObject.optString(PAGE_INDEX, (String) null);
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageId(String str) {
        this.pageId = str;
    }

    public final void setPageIndex(String str) {
        this.pageIndex = str;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PAGE_ID, this.pageId);
            jSONObject.put(PAGE_INDEX, this.pageIndex);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
