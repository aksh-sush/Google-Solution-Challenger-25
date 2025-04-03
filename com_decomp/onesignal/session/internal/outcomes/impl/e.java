package com.onesignal.session.internal.outcomes.impl;

import db.g;
import db.l;
import org.json.JSONArray;
import org.json.JSONObject;
import t9.d;

public final class e implements u9.a {
    public static final a Companion = new a((g) null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f fVar) {
            JSONArray jSONArray;
            l indirectBody;
            l.e(fVar, "outcomeEventParams");
            d dVar = d.UNATTRIBUTED;
            if (fVar.getOutcomeSource() != null) {
                k outcomeSource = fVar.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    l directBody = outcomeSource.getDirectBody();
                    l.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        l directBody2 = outcomeSource.getDirectBody();
                        l.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        l.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            dVar = d.DIRECT;
                            indirectBody = outcomeSource.getDirectBody();
                            l.b(indirectBody);
                            jSONArray = indirectBody.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    l indirectBody2 = outcomeSource.getIndirectBody();
                    l.b(indirectBody2);
                    if (indirectBody2.getNotificationIds() != null) {
                        l indirectBody3 = outcomeSource.getIndirectBody();
                        l.b(indirectBody3);
                        JSONArray notificationIds2 = indirectBody3.getNotificationIds();
                        l.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = d.INDIRECT;
                            indirectBody = outcomeSource.getIndirectBody();
                            l.b(indirectBody);
                            jSONArray = indirectBody.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
        }
    }

    public e(d dVar, JSONArray jSONArray, String str, long j10, long j11, float f10) {
        l.e(dVar, SESSION);
        l.e(str, "name");
        this.session = dVar;
        this.notificationIds = jSONArray;
        this.name = str;
        this.timestamp = j10;
        this.sessionTime = j11;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (getSession() == eVar.getSession() && l.a(getNotificationIds(), eVar.getNotificationIds()) && l.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime()) {
            if (getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public d getSession() {
        return this.session;
    }

    public long getSessionTime() {
        return this.sessionTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int i10 = 1;
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        for (int i11 = 0; i11 < 6; i11++) {
            Object obj = objArr[i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put(OUTCOME_ID, getName());
        jSONObject.put(TIMESTAMP, getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
