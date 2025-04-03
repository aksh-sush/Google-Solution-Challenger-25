package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.h;
import com.onesignal.inAppMessages.internal.display.impl.i;
import com.onesignal.user.internal.operations.impl.executors.g;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class p extends f {
    private final c groupComparisonType;

    public p() {
        super(g.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "address", str, (String) null, false, 12, (Object) null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setEnabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "enabled", z10, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setStatus(com.onesignal.user.internal.subscriptions.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "subscriptionId", str, (String) null, false, 12, (Object) null);
    }

    private final void setType(com.onesignal.user.internal.subscriptions.g gVar) {
        setOptAnyProperty(i.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "address", (a) null, 2, (Object) null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "appId", (a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        h hVar = h.INSTANCE;
        return !hVar.isLocalId(getOnesignalId()) && !hVar.isLocalId(getOnesignalId());
    }

    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.g.getBooleanProperty$default(this, "enabled", (a) null, 2, (Object) null);
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public final com.onesignal.user.internal.subscriptions.f getStatus() {
        Object obj = null;
        Object optAnyProperty$default = com.onesignal.common.modeling.g.getOptAnyProperty$default(this, "status", (a) null, 2, (Object) null);
        if (optAnyProperty$default != null) {
            obj = optAnyProperty$default instanceof com.onesignal.user.internal.subscriptions.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? com.onesignal.user.internal.subscriptions.f.valueOf((String) optAnyProperty$default) : (com.onesignal.user.internal.subscriptions.f) optAnyProperty$default;
        }
        if (obj != null) {
            return (com.onesignal.user.internal.subscriptions.f) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "subscriptionId", (a) null, 2, (Object) null);
    }

    public final com.onesignal.user.internal.subscriptions.g getType() {
        Object obj = null;
        Object optAnyProperty$default = com.onesignal.common.modeling.g.getOptAnyProperty$default(this, i.EVENT_TYPE_KEY, (a) null, 2, (Object) null);
        if (optAnyProperty$default != null) {
            obj = optAnyProperty$default instanceof com.onesignal.user.internal.subscriptions.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? com.onesignal.user.internal.subscriptions.g.valueOf((String) optAnyProperty$default) : (com.onesignal.user.internal.subscriptions.g) optAnyProperty$default;
        }
        if (obj != null) {
            return (com.onesignal.user.internal.subscriptions.g) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public void translateIds(Map<String, String> map) {
        l.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            l.b(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            l.b(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, String str3, com.onesignal.user.internal.subscriptions.g gVar, boolean z10, String str4, com.onesignal.user.internal.subscriptions.f fVar) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        l.e(str3, "subscriptionId");
        l.e(gVar, i.EVENT_TYPE_KEY);
        l.e(str4, "address");
        l.e(fVar, "status");
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
        setType(gVar);
        setEnabled(z10);
        setAddress(str4);
        setStatus(fVar);
    }
}
