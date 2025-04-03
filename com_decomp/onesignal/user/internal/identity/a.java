package com.onesignal.user.internal.identity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.modeling.f;
import com.onesignal.common.modeling.g;
import db.l;

public final class a extends f {
    public a() {
        super((g) null, (String) null, 3, (db.g) null);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsValue((String) obj);
    }

    public final /* bridge */ String get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final String getExternalId() {
        return g.getOptStringProperty$default(this, "external_id", (cb.a) null, 2, (Object) null);
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignal_id", (cb.a) null, 2, (Object) null);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        return !(obj instanceof String) ? str : getOrDefault((String) obj, str);
    }

    public final /* bridge */ String remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public final void setExternalId(String str) {
        g.setOptStringProperty$default(this, "external_id", str, (String) null, false, 12, (Object) null);
    }

    public final void setOnesignalId(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "onesignal_id", str, (String) null, false, 12, (Object) null);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue(str);
    }

    public /* bridge */ String get(String str) {
        return (String) super.get(str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault(str, str2);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove(str);
    }
}
