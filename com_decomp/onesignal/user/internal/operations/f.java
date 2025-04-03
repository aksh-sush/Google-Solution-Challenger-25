package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.h;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.d;
import db.l;
import java.util.Map;
import v7.c;

public final class f extends v7.f {
    private final c groupComparisonType;
    private final String modifyComparisonKey;

    public f() {
        super(d.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = c.CREATE;
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setExistingOnesignalId(String str) {
        g.setOptStringProperty$default(this, "existingOnesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setExternalId(String str) {
        g.setOptStringProperty$default(this, "externalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    public final String getAppId() {
        return g.getStringProperty$default(this, "appId", (a) null, 2, (Object) null);
    }

    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() != null) {
            h hVar = h.INSTANCE;
            String existingOnesignalId = getExistingOnesignalId();
            l.b(existingOnesignalId);
            return !hVar.isLocalId(existingOnesignalId);
        }
    }

    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return g.getOptStringProperty$default(this, "existingOnesignalId", (a) null, 2, (Object) null);
    }

    public final String getExternalId() {
        return g.getOptStringProperty$default(this, "externalId", (a) null, 2, (Object) null);
    }

    public c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (a) null, 2, (Object) null);
    }

    public void translateIds(Map<String, String> map) {
        l.e(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            l.b(str);
            setExistingOnesignalId(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3, String str4) {
        this();
        l.e(str, "appId");
        l.e(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setExistingOnesignalId(str4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, String str3, String str4, int i10, db.g gVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
