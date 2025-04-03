package com.onesignal.core;

import com.onesignal.notifications.n;
import db.l;
import e8.j;
import i7.a;
import j7.c;
import l7.f;
import v7.e;
import x7.d;
import z7.b;

public final class CoreModule implements a {
    public void register(c cVar) {
        l.e(cVar, "builder");
        Class<b> cls = b.class;
        cVar.register(com.onesignal.core.internal.preferences.impl.a.class).provides(y7.a.class).provides(cls);
        cVar.register(com.onesignal.core.internal.http.impl.b.class).provides(com.onesignal.core.internal.http.impl.c.class);
        cVar.register(com.onesignal.core.internal.http.impl.a.class).provides(s7.b.class);
        cVar.register(com.onesignal.core.internal.application.impl.c.class).provides(f.class);
        cVar.register(r7.a.class).provides(q7.a.class);
        cVar.register(b8.a.class).provides(a8.a.class);
        cVar.register(p7.b.class).provides(o7.c.class);
        Class<z7.c> cls2 = z7.c.class;
        cVar.register(cls2).provides(cls2);
        Class<com.onesignal.core.internal.config.b> cls3 = com.onesignal.core.internal.config.b.class;
        cVar.register(cls3).provides(cls3);
        cVar.register(com.onesignal.core.internal.backend.impl.a.class).provides(m7.b.class);
        cVar.register(com.onesignal.core.internal.config.impl.a.class).provides(cls);
        Class<com.onesignal.core.internal.operations.impl.a> cls4 = com.onesignal.core.internal.operations.impl.a.class;
        cVar.register(cls4).provides(cls4);
        cVar.register(com.onesignal.core.internal.operations.impl.b.class).provides(e.class).provides(cls);
        Class<com.onesignal.core.internal.permissions.impl.a> cls5 = com.onesignal.core.internal.permissions.impl.a.class;
        cVar.register(cls5).provides(cls5).provides(d.class);
        cVar.register(u7.a.class).provides(t7.a.class);
        cVar.register(com.onesignal.core.internal.background.impl.a.class).provides(n7.a.class).provides(cls);
        cVar.register(com.onesignal.core.internal.purchases.impl.a.class).provides(cls);
        cVar.register(com.onesignal.core.internal.purchases.impl.c.class).provides(cls);
        cVar.register(com.onesignal.notifications.internal.b.class).provides(n.class);
        cVar.register(com.onesignal.inAppMessages.internal.l.class).provides(j.class);
        cVar.register(com.onesignal.location.internal.b.class).provides(com.onesignal.location.a.class);
    }
}
