package com.onesignal.session.internal.outcomes.impl;

import db.l;
import org.json.JSONObject;

public final class f {
    private final String outcomeId;
    private final k outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String str, k kVar, float f10, long j10, long j11) {
        l.e(str, "outcomeId");
        this.outcomeId = str;
        this.outcomeSource = kVar;
        this.weight = f10;
        this.sessionTime = j10;
        this.timestamp = j11;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final k getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        k kVar = this.outcomeSource;
        return kVar == null || (kVar.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null);
    }

    public final void setSessionTime(long j10) {
        this.sessionTime = j10;
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.outcomeId);
        k kVar = this.outcomeSource;
        if (kVar != null) {
            put.put("sources", kVar.toJSONObject());
        }
        float f10 = this.weight;
        if (f10 > 0.0f) {
            put.put("weight", Float.valueOf(f10));
        }
        long j10 = this.timestamp;
        if (j10 > 0) {
            put.put("timestamp", j10);
        }
        long j11 = this.sessionTime;
        if (j11 > 0) {
            put.put("session_time", j11);
        }
        l.d(put, "json");
        return put;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
