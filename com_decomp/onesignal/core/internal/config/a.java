package com.onesignal.core.internal.config;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends com.onesignal.common.modeling.g {

    /* renamed from: com.onesignal.core.internal.config.a$a  reason: collision with other inner class name */
    static final class C0127a extends db.m implements cb.a {
        public static final C0127a INSTANCE = new C0127a();

        C0127a() {
            super(0);
        }

        public final String invoke() {
            return "https://api.onesignal.com/";
        }
    }

    static final class b extends db.m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class c extends db.m implements cb.a {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class d extends db.m implements cb.a {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class e extends db.m implements cb.a {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final Object invoke() {
            return new c(this.this$0, "fcmParams");
        }
    }

    static final class f extends db.m implements cb.a {
        public static final f INSTANCE = new f();

        f() {
            super(0);
        }

        public final Long invoke() {
            return 30000L;
        }
    }

    static final class g extends db.m implements cb.a {
        public static final g INSTANCE = new g();

        g() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class h extends db.m implements cb.a {
        public static final h INSTANCE = new h();

        h() {
            super(0);
        }

        public final Integer invoke() {
            return 60000;
        }
    }

    static final class i extends db.m implements cb.a {
        public static final i INSTANCE = new i();

        i() {
            super(0);
        }

        public final Integer invoke() {
            return 120000;
        }
    }

    static final class j extends db.m implements cb.a {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final Object invoke() {
            return new d(this.this$0, "influenceParams");
        }
    }

    static final class k extends db.m implements cb.a {
        public static final k INSTANCE = new k();

        k() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class l extends db.m implements cb.a {
        public static final l INSTANCE = new l();

        l() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class m extends db.m implements cb.a {
        public static final m INSTANCE = new m();

        m() {
            super(0);
        }

        public final String invoke() {
            return null;
        }
    }

    static final class n extends db.m implements cb.a {
        public static final n INSTANCE = new n();

        n() {
            super(0);
        }

        public final Long invoke() {
            return 5000L;
        }
    }

    static final class o extends db.m implements cb.a {
        public static final o INSTANCE = new o();

        o() {
            super(0);
        }

        public final Long invoke() {
            return 200L;
        }
    }

    static final class p extends db.m implements cb.a {
        public static final p INSTANCE = new p();

        p() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class q extends db.m implements cb.a {
        public static final q INSTANCE = new q();

        q() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class r extends db.m implements cb.a {
        public static final r INSTANCE = new r();

        r() {
            super(0);
        }

        public final Long invoke() {
            return 30000L;
        }
    }

    static final class s extends db.m implements cb.a {
        public static final s INSTANCE = new s();

        s() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class t extends db.m implements cb.a {
        public static final t INSTANCE = new t();

        t() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class u extends db.m implements cb.a {
        public static final u INSTANCE = new u();

        u() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public a() {
        super((com.onesignal.common.modeling.g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    /* access modifiers changed from: protected */
    public com.onesignal.common.modeling.g createModelForProperty(String str, JSONObject jSONObject) {
        com.onesignal.common.modeling.g cVar;
        db.l.e(str, "property");
        db.l.e(jSONObject, "jsonObject");
        if (db.l.a(str, "influenceParams")) {
            cVar = new d(this, "influenceParams");
        } else if (!db.l.a(str, "fcmParams")) {
            return null;
        } else {
            cVar = new c(this, "influenceParams");
        }
        cVar.initializeFromJson(jSONObject);
        return cVar;
    }

    public final String getApiUrl() {
        return getStringProperty("apiUrl", C0127a.INSTANCE);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "appId", (cb.a) null, 2, (Object) null);
    }

    public final boolean getClearGroupOnSummaryClick() {
        return getBooleanProperty("clearGroupOnSummaryClick", b.INSTANCE);
    }

    public final Boolean getConsentGiven() {
        return com.onesignal.common.modeling.g.getOptBooleanProperty$default(this, "consentGiven", (cb.a) null, 2, (Object) null);
    }

    public final Boolean getConsentRequired() {
        return com.onesignal.common.modeling.g.getOptBooleanProperty$default(this, "consentRequired", (cb.a) null, 2, (Object) null);
    }

    public final boolean getDisableGMSMissingPrompt() {
        return getBooleanProperty("disableGMSMissingPrompt", c.INSTANCE);
    }

    public final boolean getEnterprise() {
        return getBooleanProperty("enterprise", d.INSTANCE);
    }

    public final c getFcmParams() {
        Object anyProperty = getAnyProperty("fcmParams", new e(this));
        db.l.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.FCMConfigModel");
        return (c) anyProperty;
    }

    public final long getFetchIAMMinInterval() {
        return getLongProperty("fetchIAMMinInterval", f.INSTANCE);
    }

    public final boolean getFirebaseAnalytics() {
        return getBooleanProperty("firebaseAnalytics", g.INSTANCE);
    }

    public final String getGoogleProjectNumber() {
        return com.onesignal.common.modeling.g.getOptStringProperty$default(this, "googleProjectNumber", (cb.a) null, 2, (Object) null);
    }

    public final int getHttpGetTimeout() {
        return getIntProperty("httpGetTimeout", h.INSTANCE);
    }

    public final int getHttpTimeout() {
        return getIntProperty("httpTimeout", i.INSTANCE);
    }

    public final d getInfluenceParams() {
        Object anyProperty = getAnyProperty("influenceParams", new j(this));
        db.l.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.InfluenceConfigModel");
        return (d) anyProperty;
    }

    public final boolean getLocationShared() {
        return getBooleanProperty("locationShared", l.INSTANCE);
    }

    public final JSONArray getNotificationChannels() {
        String optStringProperty = getOptStringProperty("notificationChannels", m.INSTANCE);
        if (optStringProperty == null) {
            optStringProperty = "[]";
        }
        return new JSONArray(optStringProperty);
    }

    public final long getOpRepoExecutionInterval() {
        return getLongProperty("opRepoExecutionInterval", n.INSTANCE);
    }

    public final long getOpRepoPostWakeDelay() {
        return getLongProperty("opRepoPostWakeDelay", o.INSTANCE);
    }

    public final String getPushSubscriptionId() {
        return com.onesignal.common.modeling.g.getOptStringProperty$default(this, "pushSubscriptionId", (cb.a) null, 2, (Object) null);
    }

    public final boolean getReceiveReceiptEnabled() {
        return getBooleanProperty("receiveReceiptEnabled", p.INSTANCE);
    }

    public final boolean getRestoreTTLFilter() {
        return getBooleanProperty("restoreTTLFilter", q.INSTANCE);
    }

    public final long getSessionFocusTimeout() {
        return getLongProperty("sessionFocusTimeout", r.INSTANCE);
    }

    public final boolean getUnsubscribeWhenNotificationsDisabled() {
        return getBooleanProperty("unsubscribeWhenNotificationsDisabled", s.INSTANCE);
    }

    public final boolean getUseIdentityVerification() {
        return getBooleanProperty("useIdentityVerification", t.INSTANCE);
    }

    public final boolean getUserRejectedGMSUpdate() {
        return getBooleanProperty("userRejectedGMSUpdate", u.INSTANCE);
    }

    public final boolean isInitializedWithRemote() {
        return getBooleanProperty("isInitializedWithRemote", k.INSTANCE);
    }

    public final void setApiUrl(String str) {
        db.l.e(str, FirebaseAnalytics.Param.VALUE);
        com.onesignal.common.modeling.g.setStringProperty$default(this, "apiUrl", str, (String) null, false, 12, (Object) null);
    }

    public final void setAppId(String str) {
        db.l.e(str, FirebaseAnalytics.Param.VALUE);
        com.onesignal.common.modeling.g.setStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    public final void setClearGroupOnSummaryClick(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "clearGroupOnSummaryClick", z10, (String) null, false, 12, (Object) null);
    }

    public final void setConsentGiven(Boolean bool) {
        com.onesignal.common.modeling.g.setOptBooleanProperty$default(this, "consentGiven", bool, (String) null, false, 12, (Object) null);
    }

    public final void setConsentRequired(Boolean bool) {
        com.onesignal.common.modeling.g.setOptBooleanProperty$default(this, "consentRequired", bool, (String) null, false, 12, (Object) null);
    }

    public final void setDisableGMSMissingPrompt(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "disableGMSMissingPrompt", z10, (String) null, false, 12, (Object) null);
    }

    public final void setEnterprise(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "enterprise", z10, (String) null, false, 12, (Object) null);
    }

    public final void setFetchIAMMinInterval(long j10) {
        com.onesignal.common.modeling.g.setLongProperty$default(this, "fetchIAMMinInterval", j10, (String) null, false, 12, (Object) null);
    }

    public final void setFirebaseAnalytics(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "firebaseAnalytics", z10, (String) null, false, 12, (Object) null);
    }

    public final void setGoogleProjectNumber(String str) {
        com.onesignal.common.modeling.g.setOptStringProperty$default(this, "googleProjectNumber", str, (String) null, false, 12, (Object) null);
    }

    public final void setHttpGetTimeout(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "httpGetTimeout", i10, (String) null, false, 12, (Object) null);
    }

    public final void setHttpTimeout(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "httpTimeout", i10, (String) null, false, 12, (Object) null);
    }

    public final void setInitializedWithRemote(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "isInitializedWithRemote", z10, (String) null, false, 12, (Object) null);
    }

    public final void setLocationShared(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "locationShared", z10, (String) null, false, 12, (Object) null);
    }

    public final void setNotificationChannels(JSONArray jSONArray) {
        com.onesignal.common.modeling.g.setOptStringProperty$default(this, "notificationChannels", jSONArray != null ? jSONArray.toString() : null, (String) null, false, 12, (Object) null);
    }

    public final void setOpRepoExecutionInterval(long j10) {
        com.onesignal.common.modeling.g.setLongProperty$default(this, "opRepoExecutionInterval", j10, (String) null, false, 12, (Object) null);
    }

    public final void setOpRepoPostWakeDelay(long j10) {
        com.onesignal.common.modeling.g.setLongProperty$default(this, "opRepoPostWakeDelay", j10, (String) null, false, 12, (Object) null);
    }

    public final void setPushSubscriptionId(String str) {
        com.onesignal.common.modeling.g.setOptStringProperty$default(this, "pushSubscriptionId", str, (String) null, false, 12, (Object) null);
    }

    public final void setReceiveReceiptEnabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "receiveReceiptEnabled", z10, (String) null, false, 12, (Object) null);
    }

    public final void setRestoreTTLFilter(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "restoreTTLFilter", z10, (String) null, false, 12, (Object) null);
    }

    public final void setSessionFocusTimeout(long j10) {
        com.onesignal.common.modeling.g.setLongProperty$default(this, "sessionFocusTimeout", j10, (String) null, false, 12, (Object) null);
    }

    public final void setUnsubscribeWhenNotificationsDisabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "unsubscribeWhenNotificationsDisabled", z10, (String) null, false, 12, (Object) null);
    }

    public final void setUseIdentityVerification(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "useIdentityVerification", z10, (String) null, false, 12, (Object) null);
    }

    public final void setUserRejectedGMSUpdate(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "userRejectedGMSUpdate", z10, (String) null, false, 12, (Object) null);
    }
}
