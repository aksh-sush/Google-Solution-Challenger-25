package com.onesignal.inAppMessages.internal;

import com.onesignal.session.internal.influence.impl.e;
import db.g;
import db.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    public static final a Companion = new a((g) null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final a8.a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(int i10, long j10, a8.a aVar) {
        this(aVar);
        l.e(aVar, e.TIME);
        this.displayQuantity = i10;
        this.lastDisplayTime = j10;
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) 1000);
        long j10 = currentTimeMillis - this.lastDisplayTime;
        com.onesignal.debug.internal.logging.a.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j10 + " displayDelay: " + this.displayDelay, (Throwable) null, 2, (Object) null);
        return j10 >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j10) {
        this.displayDelay = j10;
    }

    public final void setDisplayLimit(int i10) {
        this.displayLimit = i10;
    }

    public final void setDisplayQuantity(int i10) {
        this.displayQuantity = i10;
    }

    public final void setDisplayStats(h hVar) {
        l.e(hVar, "displayStats");
        this.lastDisplayTime = hVar.lastDisplayTime;
        this.displayQuantity = hVar.displayQuantity;
    }

    public final void setLastDisplayTime(long j10) {
        this.lastDisplayTime = j10;
    }

    public final boolean shouldDisplayAgain() {
        boolean z10 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.a.debug$default("OSInAppMessage shouldDisplayAgain: " + z10, (Throwable) null, 2, (Object) null);
        return z10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    public h(a8.a aVar) {
        l.e(aVar, "_time");
        this._time = aVar;
        this.lastDisplayTime = -1;
        this.displayLimit = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject, a8.a aVar) {
        this(aVar);
        long intValue;
        l.e(jSONObject, "json");
        l.e(aVar, e.TIME);
        this.isRedisplayEnabled = true;
        Object obj = jSONObject.get(DISPLAY_LIMIT);
        Object obj2 = jSONObject.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            intValue = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            intValue = (long) ((Number) obj2).intValue();
        } else {
            return;
        }
        this.displayDelay = intValue;
    }
}
