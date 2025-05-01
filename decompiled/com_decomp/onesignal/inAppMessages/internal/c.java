package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.prompt.impl.b;
import db.g;
import db.l;
import e8.d;
import e8.k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements d {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    public static final a Companion = new a((g) null);
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    private final String actionId;
    private final String clickId;
    private final boolean closingMessage;
    private boolean isFirstClick;
    private final List<f> outcomes = new ArrayList();
    private final String pageId;
    private final List<b> prompts = new ArrayList();
    private i tags;
    private final String url;
    private k urlTarget;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public c(JSONObject jSONObject, m8.a aVar) {
        l.e(jSONObject, "json");
        l.e(aVar, "promptFactory");
        this.clickId = jSONObject.optString(ID, (String) null);
        this.actionId = jSONObject.optString(NAME, (String) null);
        this.url = jSONObject.optString(URL, (String) null);
        this.pageId = jSONObject.optString("pageId", (String) null);
        setUrlTarget(k.Companion.fromString(jSONObject.optString(URL_TARGET, (String) null)));
        if (getUrlTarget() == null) {
            setUrlTarget(k.IN_APP_WEBVIEW);
        }
        this.closingMessage = jSONObject.optBoolean(CLOSE, true);
        if (jSONObject.has(OUTCOMES)) {
            parseOutcomes(jSONObject);
        }
        if (jSONObject.has(TAGS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TAGS);
            l.d(jSONObject2, "json.getJSONObject(TAGS)");
            this.tags = new i(jSONObject2);
        }
        if (jSONObject.has(PROMPTS)) {
            parsePrompts(jSONObject, aVar);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            List<f> list = this.outcomes;
            Object obj = jSONArray.get(i10);
            l.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            list.add(new f((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, m8.a aVar) {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            l.d(string, "promptType");
            b createPrompt = aVar.createPrompt(string);
            if (createPrompt != null) {
                this.prompts.add(createPrompt);
            }
        }
    }

    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    public boolean getClosingMessage() {
        return this.closingMessage;
    }

    public final List<f> getOutcomes() {
        return this.outcomes;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<b> getPrompts() {
        return this.prompts;
    }

    public final i getTags() {
        return this.tags;
    }

    public String getUrl() {
        return this.url;
    }

    public k getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z10) {
        this.isFirstClick = z10;
    }

    public final void setTags(i iVar) {
        this.tags = iVar;
    }

    public void setUrlTarget(k kVar) {
        this.urlTarget = kVar;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CLICK_NAME, getActionId());
            jSONObject.put(CLICK_URL, getUrl());
            jSONObject.put(FIRST_CLICK, this.isFirstClick);
            jSONObject.put(CLOSES_MESSAGE, getClosingMessage());
            JSONArray jSONArray = new JSONArray();
            for (f jSONObject2 : this.outcomes) {
                jSONArray.put(jSONObject2.toJSONObject());
            }
            jSONObject.put(OUTCOMES, jSONArray);
            i iVar = this.tags;
            if (iVar != null) {
                l.b(iVar);
                jSONObject.put(TAGS, iVar.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
