package com.onesignal.user.internal.operations;

import cb.a;
import com.onesignal.common.modeling.g;
import com.onesignal.user.internal.operations.impl.executors.h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import v7.c;
import v7.f;

public final class l extends f {
    private final c groupComparisonType;

    public l() {
        super(h.TRACK_PURCHASE);
        this.groupComparisonType = c.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        g.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, (String) null, false, 12, (Object) null);
    }

    private final void setAppId(String str) {
        g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    private final void setOnesignalId(String str) {
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    private final void setPurchases(List<g> list) {
        g.setListProperty$default(this, "purchases", list, (String) null, false, 12, (Object) null);
    }

    private final void setTreatNewAsExisting(boolean z10) {
        g.setBooleanProperty$default(this, "treatNewAsExisting", z10, (String) null, false, 12, (Object) null);
    }

    /* access modifiers changed from: protected */
    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        db.l.e(str, "property");
        db.l.e(jSONArray, "jsonArray");
        if (!db.l.a(str, "purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = new g();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            db.l.d(jSONObject, "jsonArray.getJSONObject(item)");
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return g.getBigDecimalProperty$default(this, "amountSpent", (a) null, 2, (Object) null);
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

    public final List<g> getPurchases() {
        return g.getListProperty$default(this, "purchases", (a) null, 2, (Object) null);
    }

    public final boolean getTreatNewAsExisting() {
        return g.getBooleanProperty$default(this, "treatNewAsExisting", (a) null, 2, (Object) null);
    }

    public void translateIds(Map<String, String> map) {
        db.l.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            db.l.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, boolean z10, BigDecimal bigDecimal, List<g> list) {
        this();
        db.l.e(str, "appId");
        db.l.e(str2, "onesignalId");
        db.l.e(bigDecimal, "amountSpent");
        db.l.e(list, "purchases");
        setAppId(str);
        setOnesignalId(str2);
        setTreatNewAsExisting(z10);
        setAmountSpent(bigDecimal);
        setPurchases(list);
    }
}
