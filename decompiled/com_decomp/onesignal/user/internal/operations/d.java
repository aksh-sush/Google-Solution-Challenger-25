package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.h;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class d extends f {
    private final c groupComparisonType;

    public d() {
        super(h.DELETE_TAG);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setKey(String str) {
        g.setStringProperty$default(this, "key", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
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

    public final String getKey() {
        return g.getStringProperty$default(this, "key", (a) null, 2, (Object) null);
    }

    public String getModifyComparisonKey() {
        return getCreateComparisonKey();
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
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
    public d(String str, String str2, String str3) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        l.e(str3, "key");
        setAppId(str);
        setOnesignalId(str2);
        setKey(str3);
    }
}
