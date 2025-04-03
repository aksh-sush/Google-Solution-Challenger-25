package com.onesignal.user.internal.properties;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.modeling.f;
import com.onesignal.common.modeling.g;
import db.l;
import db.m;
import java.util.Iterator;
import org.json.JSONObject;

public final class a extends g {

    /* renamed from: com.onesignal.user.internal.properties.a$a  reason: collision with other inner class name */
    static final class C0196a extends m implements cb.a {
        public static final C0196a INSTANCE = new C0196a();

        C0196a() {
            super(0);
        }

        public final String invoke() {
            return "US";
        }
    }

    static final class b extends m implements cb.a {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final f invoke() {
            return new f(this.this$0, "tags");
        }
    }

    public a() {
        super((g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    /* access modifiers changed from: protected */
    public g createModelForProperty(String str, JSONObject jSONObject) {
        l.e(str, "property");
        l.e(jSONObject, "jsonObject");
        if (!l.a(str, "tags")) {
            return null;
        }
        f fVar = new f(this, "tags");
        Iterator<String> keys = jSONObject.keys();
        l.d(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            l.d(next, "key");
            String string = jSONObject.getString(next);
            l.d(string, "jsonObject.getString(key)");
            g.setStringProperty$default(fVar, next, string, (String) null, false, 12, (Object) null);
        }
        return fVar;
    }

    public final String getCountry() {
        return getStringProperty("country", C0196a.INSTANCE);
    }

    public final String getLanguage() {
        return g.getOptStringProperty$default(this, "language", (cb.a) null, 2, (Object) null);
    }

    public final Float getLocationAccuracy() {
        return g.getOptFloatProperty$default(this, "locationAccuracy", (cb.a) null, 2, (Object) null);
    }

    public final Boolean getLocationBackground() {
        return g.getOptBooleanProperty$default(this, "locationBackground", (cb.a) null, 2, (Object) null);
    }

    public final Double getLocationLatitude() {
        return g.getOptDoubleProperty$default(this, "locationLatitude", (cb.a) null, 2, (Object) null);
    }

    public final Double getLocationLongitude() {
        return g.getOptDoubleProperty$default(this, "locationLongitude", (cb.a) null, 2, (Object) null);
    }

    public final Long getLocationTimestamp() {
        return g.getOptLongProperty$default(this, "locationTimestamp", (cb.a) null, 2, (Object) null);
    }

    public final Integer getLocationType() {
        return g.getOptIntProperty$default(this, "locationType", (cb.a) null, 2, (Object) null);
    }

    public final String getOnesignalId() {
        return g.getStringProperty$default(this, "onesignalId", (cb.a) null, 2, (Object) null);
    }

    public final f getTags() {
        return getMapModelProperty("tags", new b(this));
    }

    public final String getTimezone() {
        return g.getOptStringProperty$default(this, "timezone", (cb.a) null, 2, (Object) null);
    }

    public final void setCountry(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "country", str, (String) null, false, 12, (Object) null);
    }

    public final void setLanguage(String str) {
        g.setOptStringProperty$default(this, "language", str, (String) null, false, 12, (Object) null);
    }

    public final void setLocationAccuracy(Float f10) {
        g.setOptFloatProperty$default(this, "locationAccuracy", f10, (String) null, false, 12, (Object) null);
    }

    public final void setLocationBackground(Boolean bool) {
        g.setOptBooleanProperty$default(this, "locationBackground", bool, (String) null, false, 12, (Object) null);
    }

    public final void setLocationLatitude(Double d10) {
        g.setOptDoubleProperty$default(this, "locationLatitude", d10, (String) null, false, 12, (Object) null);
    }

    public final void setLocationLongitude(Double d10) {
        g.setOptDoubleProperty$default(this, "locationLongitude", d10, (String) null, false, 12, (Object) null);
    }

    public final void setLocationTimestamp(Long l10) {
        g.setOptLongProperty$default(this, "locationTimestamp", l10, (String) null, false, 12, (Object) null);
    }

    public final void setLocationType(Integer num) {
        g.setOptIntProperty$default(this, "locationType", num, (String) null, false, 12, (Object) null);
    }

    public final void setOnesignalId(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "onesignalId", str, (String) null, false, 12, (Object) null);
    }

    public final void setTimezone(String str) {
        g.setOptStringProperty$default(this, "timezone", str, (String) null, false, 12, (Object) null);
    }
}
