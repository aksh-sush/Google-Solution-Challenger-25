package com.onesignal.user.internal.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.modeling.g;
import com.onesignal.inAppMessages.internal.display.impl.i;
import db.l;
import db.m;

public final class d extends g {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final String invoke() {
            return "";
        }
    }

    static final class b extends m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final String invoke() {
            return "";
        }
    }

    static final class c extends m implements cb.a {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        public final String invoke() {
            return "";
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.d$d  reason: collision with other inner class name */
    static final class C0197d extends m implements cb.a {
        public static final C0197d INSTANCE = new C0197d();

        C0197d() {
            super(0);
        }

        public final String invoke() {
            return "";
        }
    }

    public d() {
        super((g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    public final String getAddress() {
        return g.getStringProperty$default(this, "address", (cb.a) null, 2, (Object) null);
    }

    public final String getAppVersion() {
        return getStringProperty("appVersion", a.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", b.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", c.INSTANCE);
    }

    public final boolean getOptedIn() {
        return g.getBooleanProperty$default(this, "optedIn", (cb.a) null, 2, (Object) null);
    }

    public final String getSdk() {
        return getStringProperty("sdk", C0197d.INSTANCE);
    }

    public final f getStatus() {
        Object obj = null;
        if (!hasProperty("status")) {
            f fVar = f.SUBSCRIBED;
            setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
        }
        Object optAnyProperty$default = g.getOptAnyProperty$default(this, "status", (cb.a) null, 2, (Object) null);
        if (optAnyProperty$default != null) {
            obj = optAnyProperty$default instanceof f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default;
        }
        if (obj != null) {
            return (f) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final g getType() {
        Object obj = null;
        Object optAnyProperty$default = g.getOptAnyProperty$default(this, i.EVENT_TYPE_KEY, (cb.a) null, 2, (Object) null);
        if (optAnyProperty$default != null) {
            obj = optAnyProperty$default instanceof g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default;
        }
        if (obj != null) {
            return (g) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final void setAddress(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "address", str, (String) null, false, 12, (Object) null);
    }

    public final void setAppVersion(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "appVersion", str, (String) null, false, 12, (Object) null);
    }

    public final void setCarrier(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "carrier", str, (String) null, false, 12, (Object) null);
    }

    public final void setDeviceOS(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "deviceOS", str, (String) null, false, 12, (Object) null);
    }

    public final void setOptedIn(boolean z10) {
        g.setBooleanProperty$default(this, "optedIn", z10, (String) null, false, 12, (Object) null);
    }

    public final void setSdk(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "sdk", str, (String) null, false, 12, (Object) null);
    }

    public final void setStatus(f fVar) {
        l.e(fVar, FirebaseAnalytics.Param.VALUE);
        setOptAnyProperty("status", fVar.toString(), "NORMAL", false);
    }

    public final void setType(g gVar) {
        l.e(gVar, FirebaseAnalytics.Param.VALUE);
        setOptAnyProperty(i.EVENT_TYPE_KEY, gVar.toString(), "NORMAL", false);
    }
}
