package com.onesignal.user.internal.operations;

import cb.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.h;
import db.l;
import java.util.Map;
import v7.c;
import v7.f;

public final class j extends f {
    private final c groupComparisonType;

    public j() {
        super(h.SET_PROPERTY);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setProperty(String str) {
        g.setStringProperty$default(this, "property", str, (String) null, false, 12, (Object) null);
    }

    private final void setValue(Object obj) {
        g.setOptAnyProperty$default(this, FirebaseAnalytics.Param.VALUE, obj, (String) null, false, 12, (Object) null);
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
        return getCreateComparisonKey();
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public final String getProperty() {
        return g.getStringProperty$default(this, "property", (a) null, 2, (Object) null);
    }

    public final Object getValue() {
        return g.getOptAnyProperty$default(this, FirebaseAnalytics.Param.VALUE, (a) null, 2, (Object) null);
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
    public j(String str, String str2, String str3, Object obj) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        l.e(str3, "property");
        setAppId(str);
        setOnesignalId(str2);
        setProperty(str3);
        setValue(obj);
    }
}
