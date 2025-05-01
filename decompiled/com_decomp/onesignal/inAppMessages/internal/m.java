package com.onesignal.inAppMessages.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import db.g;
import db.l;
import g9.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class m {
    private final a kind;
    private final b operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM(c.PAYLOAD_OS_ROOT_CUSTOM),
        UNKNOWN("unknown");
        
        public static final C0147a Companion = null;
        /* access modifiers changed from: private */
        public final String value;

        /* renamed from: com.onesignal.inAppMessages.internal.m$a$a  reason: collision with other inner class name */
        public static final class C0147a {
            private C0147a() {
            }

            public /* synthetic */ C0147a(g gVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (p.l(aVar.value, str, true)) {
                        return aVar;
                    }
                }
                return a.UNKNOWN;
            }
        }

        static {
            Companion = new C0147a((g) null);
        }

        private a(String str) {
            this.value = str;
        }

        public String toString() {
            return this.value;
        }
    }

    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        
        public static final a Companion = null;
        /* access modifiers changed from: private */
        public final String text;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final b fromString(String str) {
                for (b bVar : b.values()) {
                    if (p.l(bVar.text, str, true)) {
                        return bVar;
                    }
                }
                return b.EQUAL_TO;
            }
        }

        static {
            Companion = new a((g) null);
        }

        private b(String str) {
            this.text = str;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        public String toString() {
            return this.text;
        }
    }

    public m(JSONObject jSONObject) {
        l.e(jSONObject, "json");
        String string = jSONObject.getString("id");
        l.d(string, "json.getString(\"id\")");
        this.triggerId = string;
        this.kind = a.Companion.fromString(jSONObject.getString("kind"));
        this.property = jSONObject.optString("property", (String) null);
        this.operatorType = b.Companion.fromString(jSONObject.getString("operator"));
        this.value = jSONObject.opt(FirebaseAnalytics.Param.VALUE);
    }

    public final a getKind() {
        return this.kind;
    }

    public final b getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.triggerId);
            jSONObject.put("kind", this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put(FirebaseAnalytics.Param.VALUE, this.value);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
