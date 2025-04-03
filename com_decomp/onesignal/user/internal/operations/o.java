package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.h;
import com.onesignal.user.internal.operations.impl.executors.g;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class o extends f {
    private final c groupComparisonType;

    public o() {
        super(g.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = c.NONE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "subscriptionId", str, (String) null, false, 12, (Object) null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "appId", (a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        h hVar = h.INSTANCE;
        return !hVar.isLocalId(getOnesignalId()) && !hVar.isLocalId(getSubscriptionId());
    }

    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "subscriptionId", (a) null, 2, (Object) null);
    }

    public void translateIds(Map<String, String> map) {
        l.e(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            l.b(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            l.b(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, String str3) {
        this();
        l.e(str, "appId");
        l.e(str2, "subscriptionId");
        l.e(str3, "onesignalId");
        setAppId(str);
        setSubscriptionId(str2);
        setOnesignalId(str3);
    }
}
