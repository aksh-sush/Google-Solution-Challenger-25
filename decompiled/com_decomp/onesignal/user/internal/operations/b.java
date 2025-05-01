package com.onesignal.user.internal.operations;

import com.google.firebase.messaging.Constants;
import com.onesignal.common.h;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.a;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class b extends f {
    private final c groupComparisonType;

    public b() {
        super(a.DELETE_ALIAS);
        this.groupComparisonType = c.NONE;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setLabel(String str) {
        g.setStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    public final String getAppId() {
        return g.getStringProperty$default(this, "appId", (cb.a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        return !h.INSTANCE.isLocalId(getOnesignalId());
    }

    public String getCreateComparisonKey() {
        return "";
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getLabel() {
        return g.getStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, (cb.a) null, 2, (Object) null);
    }

    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Alias." + getLabel();
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (cb.a) null, 2, (Object) null);
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
    public b(String str, String str2, String str3) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        l.e(str3, Constants.ScionAnalytics.PARAM_LABEL);
        setAppId(str);
        setOnesignalId(str2);
        setLabel(str3);
    }
}
