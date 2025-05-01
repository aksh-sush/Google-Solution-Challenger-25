package com.onesignal.core.internal.config;

import com.google.firebase.dynamiclinks.DynamicLink;
import com.onesignal.common.modeling.g;
import db.l;
import db.m;

public final class c extends g {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final String invoke() {
            return null;
        }
    }

    static final class b extends m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final String invoke() {
            return null;
        }
    }

    /* renamed from: com.onesignal.core.internal.config.c$c  reason: collision with other inner class name */
    static final class C0128c extends m implements cb.a {
        public static final C0128c INSTANCE = new C0128c();

        C0128c() {
            super(0);
        }

        public final String invoke() {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(g gVar, String str) {
        super(gVar, str, (Object) null, 4, (db.g) null);
        l.e(gVar, "parentModel");
        l.e(str, "parentProperty");
    }

    public final String getApiKey() {
        return getOptStringProperty(DynamicLink.Builder.KEY_API_KEY, a.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", C0128c.INSTANCE);
    }

    public final void setApiKey(String str) {
        g.setOptStringProperty$default(this, DynamicLink.Builder.KEY_API_KEY, str, (String) null, false, 12, (Object) null);
    }

    public final void setAppId(String str) {
        g.setOptStringProperty$default(this, "appId", str, (String) null, false, 12, (Object) null);
    }

    public final void setProjectId(String str) {
        g.setOptStringProperty$default(this, "projectId", str, (String) null, false, 12, (Object) null);
    }
}
