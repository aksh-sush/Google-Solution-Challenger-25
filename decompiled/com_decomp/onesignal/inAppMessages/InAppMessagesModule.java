package com.onesignal.inAppMessages;

import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.d;
import db.l;
import e8.j;
import f8.b;
import i7.a;
import j7.c;

public final class InAppMessagesModule implements a {
    public void register(c cVar) {
        l.e(cVar, "builder");
        Class<o8.a> cls = o8.a.class;
        cVar.register(cls).provides(cls);
        Class<i8.a> cls2 = i8.a.class;
        cVar.register(cls2).provides(cls2);
        cVar.register(l8.a.class).provides(k8.a.class);
        cVar.register(com.onesignal.inAppMessages.internal.repositories.impl.a.class).provides(n8.a.class);
        cVar.register(com.onesignal.inAppMessages.internal.backend.impl.a.class).provides(b.class);
        cVar.register(com.onesignal.inAppMessages.internal.lifecycle.impl.a.class).provides(j8.b.class);
        Class<d> cls3 = d.class;
        cVar.register(cls3).provides(cls3);
        cVar.register(com.onesignal.inAppMessages.internal.triggers.impl.c.class).provides(com.onesignal.inAppMessages.internal.triggers.a.class);
        Class<com.onesignal.inAppMessages.internal.triggers.impl.a> cls4 = com.onesignal.inAppMessages.internal.triggers.impl.a.class;
        cVar.register(cls4).provides(cls4);
        cVar.register(com.onesignal.inAppMessages.internal.display.impl.b.class).provides(h8.a.class);
        Class<z7.b> cls5 = z7.b.class;
        cVar.register(com.onesignal.inAppMessages.internal.preview.a.class).provides(cls5);
        cVar.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(m8.a.class);
        cVar.register(k.class).provides(j.class).provides(cls5);
    }
}
