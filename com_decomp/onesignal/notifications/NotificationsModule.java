package com.onesignal.notifications;

import cb.l;
import com.onesignal.notifications.internal.display.impl.d;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.e;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.registration.impl.h;
import com.onesignal.notifications.internal.registration.impl.i;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import db.m;
import f9.r;
import j7.c;
import l7.f;

public final class NotificationsModule implements i7.a {

    static final class a extends m implements l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        public final w8.a invoke(j7.b bVar) {
            db.l.e(bVar, "it");
            return x8.a.Companion.canTrack() ? new x8.a((f) bVar.getService(f.class), (com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (a8.a) bVar.getService(a8.a.class)) : new x8.b();
        }
    }

    static final class b extends m implements l {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        public final Object invoke(j7.b bVar) {
            Object obj;
            db.l.e(bVar, "it");
            q7.a aVar = (q7.a) bVar.getService(q7.a.class);
            Class cls = f.class;
            if (aVar.isFireOSDeviceType()) {
                return new e((f) bVar.getService(cls));
            }
            if (!aVar.isAndroidDeviceType()) {
                obj = new h(aVar, (f) bVar.getService(cls));
            } else if (!aVar.getHasFCMLibrary()) {
                return new i();
            } else {
                obj = new g((com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (f) bVar.getService(cls), (com.onesignal.notifications.internal.registration.impl.a) bVar.getService(com.onesignal.notifications.internal.registration.impl.a.class), aVar);
            }
            return obj;
        }
    }

    public void register(c cVar) {
        db.l.e(cVar, "builder");
        cVar.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(y8.a.class);
        cVar.register(NotificationRestoreWorkManager.class).provides(q9.b.class);
        cVar.register(com.onesignal.notifications.internal.data.impl.a.class).provides(h9.a.class);
        cVar.register(com.onesignal.notifications.internal.badges.impl.a.class).provides(z8.a.class);
        cVar.register(com.onesignal.notifications.internal.data.impl.b.class).provides(h9.b.class);
        cVar.register(NotificationGenerationWorkManager.class).provides(j9.b.class);
        cVar.register(d9.a.class).provides(c9.a.class);
        cVar.register(r.class).provides(e9.a.class);
        cVar.register(com.onesignal.notifications.internal.limiting.impl.a.class).provides(l9.a.class);
        cVar.register(d.class).provides(i9.b.class);
        cVar.register(com.onesignal.notifications.internal.display.impl.e.class).provides(i9.c.class);
        cVar.register(com.onesignal.notifications.internal.display.impl.b.class).provides(i9.a.class);
        cVar.register(com.onesignal.notifications.internal.generation.impl.a.class).provides(j9.a.class);
        cVar.register(com.onesignal.notifications.internal.restoration.impl.a.class).provides(q9.a.class);
        cVar.register(com.onesignal.notifications.internal.summary.impl.a.class).provides(r9.a.class);
        cVar.register(com.onesignal.notifications.internal.open.impl.b.class).provides(m9.a.class);
        cVar.register(com.onesignal.notifications.internal.open.impl.c.class).provides(m9.b.class);
        cVar.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(n9.b.class);
        cVar.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(k9.c.class);
        cVar.register((l) a.INSTANCE).provides(w8.a.class);
        cVar.register((l) b.INSTANCE).provides(p9.a.class).provides(com.onesignal.notifications.internal.registration.impl.d.class);
        Class<com.onesignal.notifications.internal.registration.impl.a> cls = com.onesignal.notifications.internal.registration.impl.a.class;
        cVar.register(cls).provides(cls);
        cVar.register(com.onesignal.notifications.internal.pushtoken.b.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        cVar.register(ReceiveReceiptWorkManager.class).provides(o9.b.class);
        cVar.register(com.onesignal.notifications.internal.receivereceipt.impl.a.class).provides(o9.a.class);
        Class<z7.b> cls2 = z7.b.class;
        cVar.register(DeviceRegistrationListener.class).provides(cls2);
        cVar.register(com.onesignal.notifications.internal.listeners.a.class).provides(cls2);
        cVar.register(com.onesignal.notifications.internal.h.class).provides(n.class).provides(com.onesignal.notifications.internal.a.class);
    }
}
