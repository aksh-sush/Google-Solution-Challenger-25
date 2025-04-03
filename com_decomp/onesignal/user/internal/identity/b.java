package com.onesignal.user.internal.identity;

import com.onesignal.common.modeling.j;
import com.onesignal.common.modeling.k;
import db.l;
import db.m;

public class b extends k {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final a invoke() {
            return new a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(y7.a aVar) {
        super(new j(a.INSTANCE, "identity", aVar));
        l.e(aVar, "prefs");
    }
}
