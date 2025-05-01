package com.onesignal.user.internal;

import com.onesignal.user.internal.subscriptions.d;
import db.g;

public final class e extends b {
    public static final a Companion = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d createFakePushSub() {
            d dVar = new d();
            dVar.setId("");
            dVar.setType(com.onesignal.user.internal.subscriptions.g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }
    }

    public e() {
        super(Companion.createFakePushSub());
    }
}
