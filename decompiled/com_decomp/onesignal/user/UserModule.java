package com.onesignal.user;

import com.onesignal.user.internal.operations.impl.executors.f;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.h;
import com.onesignal.user.internal.properties.b;
import com.onesignal.user.internal.subscriptions.e;
import db.l;
import i7.a;
import j7.c;
import v7.d;

public final class UserModule implements a {
    public void register(c cVar) {
        l.e(cVar, "builder");
        Class<b> cls = b.class;
        cVar.register(cls).provides(cls);
        Class<z7.a> cls2 = z7.a.class;
        cVar.register(z9.b.class).provides(cls2);
        Class<com.onesignal.user.internal.identity.b> cls3 = com.onesignal.user.internal.identity.b.class;
        cVar.register(cls3).provides(cls3);
        cVar.register(z9.a.class).provides(cls2);
        cVar.register(com.onesignal.user.internal.backend.impl.a.class).provides(w9.b.class);
        Class<com.onesignal.user.internal.operations.impl.executors.a> cls4 = com.onesignal.user.internal.operations.impl.executors.a.class;
        Class<d> cls5 = d.class;
        cVar.register(cls4).provides(cls4).provides(cls5);
        Class<e> cls6 = e.class;
        cVar.register(cls6).provides(cls6);
        cVar.register(z9.c.class).provides(cls2);
        cVar.register(com.onesignal.user.internal.backend.impl.c.class).provides(w9.c.class);
        Class<g> cls7 = g.class;
        cVar.register(cls7).provides(cls7).provides(cls5);
        cVar.register(com.onesignal.user.internal.subscriptions.impl.a.class).provides(com.onesignal.user.internal.subscriptions.b.class);
        cVar.register(y9.a.class).provides(x9.a.class);
        cVar.register(com.onesignal.user.internal.backend.impl.d.class).provides(w9.d.class);
        Class<h> cls8 = h.class;
        cVar.register(cls8).provides(cls8).provides(cls5);
        cVar.register(com.onesignal.user.internal.operations.impl.executors.d.class).provides(cls5);
        cVar.register(com.onesignal.user.internal.operations.impl.executors.c.class).provides(cls5);
        cVar.register(f.class).provides(cls5);
        cVar.register(com.onesignal.user.internal.f.class).provides(v9.a.class);
    }
}
