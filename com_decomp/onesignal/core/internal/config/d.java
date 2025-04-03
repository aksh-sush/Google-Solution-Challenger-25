package com.onesignal.core.internal.config;

import db.l;
import db.m;

public final class d extends com.onesignal.common.modeling.g {
    public static final a Companion = new a((db.g) null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    static final class b extends m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final Integer invoke() {
            return 10;
        }
    }

    static final class c extends m implements cb.a {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* renamed from: com.onesignal.core.internal.config.d$d  reason: collision with other inner class name */
    static final class C0129d extends m implements cb.a {
        public static final C0129d INSTANCE = new C0129d();

        C0129d() {
            super(0);
        }

        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    static final class e extends m implements cb.a {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class f extends m implements cb.a {
        public static final f INSTANCE = new f();

        f() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class g extends m implements cb.a {
        public static final g INSTANCE = new g();

        g() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class h extends m implements cb.a {
        public static final h INSTANCE = new h();

        h() {
            super(0);
        }

        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.onesignal.common.modeling.g gVar, String str) {
        super(gVar, str, (Object) null, 4, (db.g) null);
        l.e(gVar, "parentModel");
        l.e(str, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", C0129d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "isDirectEnabled", z10, (String) null, false, 12, (Object) null);
    }

    public final void setIamLimit(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "iamLimit", i10, (String) null, false, 12, (Object) null);
    }

    public final void setIndirectEnabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "isIndirectEnabled", z10, (String) null, false, 12, (Object) null);
    }

    public final void setIndirectIAMAttributionWindow(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "indirectIAMAttributionWindow", i10, (String) null, false, 12, (Object) null);
    }

    public final void setIndirectNotificationAttributionWindow(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "indirectNotificationAttributionWindow", i10, (String) null, false, 12, (Object) null);
    }

    public final void setNotificationLimit(int i10) {
        com.onesignal.common.modeling.g.setIntProperty$default(this, "notificationLimit", i10, (String) null, false, 12, (Object) null);
    }

    public final void setUnattributedEnabled(boolean z10) {
        com.onesignal.common.modeling.g.setBooleanProperty$default(this, "isUnattributedEnabled", z10, (String) null, false, 12, (Object) null);
    }
}
