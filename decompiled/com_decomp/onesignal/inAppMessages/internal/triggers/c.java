package com.onesignal.inAppMessages.internal.triggers;

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

        public final String invoke() {
            return "";
        }
    }

    static final class b extends m implements cb.a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final Object invoke() {
            return "";
        }
    }

    public c() {
        super((g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty(FirebaseAnalytics.Param.VALUE, b.INSTANCE);
    }

    public final void setKey(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        g.setStringProperty$default(this, "key", str, (String) null, false, 12, (Object) null);
    }

    public final void setValue(Object obj) {
        l.e(obj, FirebaseAnalytics.Param.VALUE);
        g.setAnyProperty$default(this, FirebaseAnalytics.Param.VALUE, obj, (String) null, true, 4, (Object) null);
    }
}
