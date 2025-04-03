package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.modeling.g;
import db.l;
import v7.c;
import v7.f;

public final class e extends f {
    private final boolean canStartExecute;
    private final c groupComparisonType;

    public e() {
        super(com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        this.groupComparisonType = c.NONE;
        this.canStartExecute = true;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setSubscriptionId(String str) {
        g.setStringProperty$default(this, "subscriptionId", str, (String) null, false, 12, (Object) null);
    }

    public final String getAppId() {
        return g.getStringProperty$default(this, "appId", (a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        return this.canStartExecute;
    }

    public String getCreateComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public final String getSubscriptionId() {
        return g.getStringProperty$default(this, "subscriptionId", (a) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        l.e(str3, "subscriptionId");
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
    }
}
