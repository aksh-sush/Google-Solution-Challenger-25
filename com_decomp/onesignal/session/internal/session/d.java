package com.onesignal.session.internal.session;

import com.onesignal.common.modeling.j;
import com.onesignal.common.modeling.k;
import db.l;
import db.m;

public class d extends k {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final c invoke() {
            return new c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(y7.a aVar) {
        super(new j(a.INSTANCE, "session", aVar));
        l.e(aVar, "prefs");
    }
}
