package com.onesignal.inAppMessages.internal;

import db.g;
import db.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final a Companion = new a((g) null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public f(JSONObject jSONObject) {
        l.e(jSONObject, "json");
        String string = jSONObject.getString(OUTCOME_NAME);
        l.d(string, "json.getString(OUTCOME_NAME)");
        this.name = string;
        this.weight = jSONObject.has(OUTCOME_WEIGHT) ? (float) jSONObject.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.isUnique = jSONObject.has(OUTCOME_UNIQUE) && jSONObject.getBoolean(OUTCOME_UNIQUE);
    }

    public final String getName() {
        return this.name;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    public final void setName(String str) {
        l.e(str, "<set-?>");
        this.name = str;
    }

    public final void setUnique(boolean z10) {
        this.isUnique = z10;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OUTCOME_NAME, this.name);
            jSONObject.put(OUTCOME_WEIGHT, (double) this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }
}
