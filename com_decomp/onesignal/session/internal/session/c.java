package com.onesignal.session.internal.session;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.modeling.g;
import db.l;
import db.m;

public final class c extends g {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final Long invoke() {
            return 0L;
        }
    }

    static final class b extends m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final Long invoke() {
            return 0L;
        }
    }

    /* renamed from: com.onesignal.session.internal.session.c$c  reason: collision with other inner class name */
    static final class C0187c extends m implements cb.a {
        public static final C0187c INSTANCE = new C0187c();

        C0187c() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class d extends m implements cb.a {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public c() {
        super((g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", a.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", b.INSTANCE);
    }

    public final String getSessionId() {
        return g.getStringProperty$default(this, "sessionId", (cb.a) null, 2, (Object) null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", d.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", C0187c.INSTANCE);
    }

    public final void setActiveDuration(long j10) {
        g.setLongProperty$default(this, "activeDuration", j10, (String) null, false, 12, (Object) null);
    }

    public final void setFocusTime(long j10) {
        g.setLongProperty$default(this, "focusTime", j10, (String) null, false, 12, (Object) null);
    }

    public final void setSessionId(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "sessionId", str, (String) null, false, 12, (Object) null);
    }

    public final void setStartTime(long j10) {
        g.setLongProperty$default(this, "startTime", j10, (String) null, false, 12, (Object) null);
    }

    public final void setValid(boolean z10) {
        g.setBooleanProperty$default(this, "isValid", z10, (String) null, false, 12, (Object) null);
    }
}
