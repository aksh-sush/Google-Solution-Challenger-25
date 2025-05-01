package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.h;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class m extends f {
    private final c groupComparisonType;

    public m() {
        super(h.TRACK_SESSION_END);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setSessionTime(long j10) {
        g.setLongProperty$default(this, "sessionTime", j10, (String) null, false, 12, (Object) null);
    }

    public final String getAppId() {
        return g.getStringProperty$default(this, "appId", (a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        return !com.onesignal.common.h.INSTANCE.isLocalId(getOnesignalId());
    }

    public String getCreateComparisonKey() {
        return "";
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public final long getSessionTime() {
        return g.getLongProperty$default(this, "sessionTime", (a) null, 2, (Object) null);
    }

    public void translateIds(Map<String, String> map) {
        l.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            l.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, long j10) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setSessionTime(j10);
    }
}
