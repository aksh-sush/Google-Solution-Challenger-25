package com.onesignal.session;

import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.h;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.j;
import db.l;
import i7.a;
import j7.c;

public final class SessionModule implements a {
    public void register(c cVar) {
        l.e(cVar, "builder");
        cVar.register(i.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        cVar.register(j.class).provides(d.class);
        cVar.register(g.class).provides(b.class);
        Class<z7.b> cls = z7.b.class;
        cVar.register(h.class).provides(u9.b.class).provides(cls);
        cVar.register(com.onesignal.session.internal.influence.impl.g.class).provides(t9.a.class);
        Class<com.onesignal.session.internal.session.d> cls2 = com.onesignal.session.internal.session.d.class;
        cVar.register(cls2).provides(cls2);
        cVar.register(com.onesignal.session.internal.session.impl.b.class).provides(com.onesignal.session.internal.session.b.class).provides(cls).provides(n7.b.class);
        cVar.register(com.onesignal.session.internal.session.impl.a.class).provides(cls);
        cVar.register(com.onesignal.session.internal.a.class).provides(s9.a.class);
    }
}
