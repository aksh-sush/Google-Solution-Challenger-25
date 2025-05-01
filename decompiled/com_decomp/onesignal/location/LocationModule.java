package com.onesignal.location;

import cb.l;
import com.onesignal.location.internal.controller.impl.c;
import com.onesignal.location.internal.controller.impl.g;
import db.m;
import j7.b;
import l7.f;

public final class LocationModule implements i7.a {

    static final class a extends m implements l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        public final t8.a invoke(b bVar) {
            db.l.e(bVar, "it");
            q7.a aVar = (q7.a) bVar.getService(q7.a.class);
            Class cls = f.class;
            if (!aVar.isAndroidDeviceType() || !s8.b.INSTANCE.hasGMSLocationLibrary()) {
                return (!aVar.isHuaweiDeviceType() || !s8.b.INSTANCE.hasHMSLocationLibrary()) ? new g() : new c((f) bVar.getService(cls));
            }
            return new com.onesignal.location.internal.controller.impl.a((f) bVar.getService(cls));
        }
    }

    public void register(j7.c cVar) {
        db.l.e(cVar, "builder");
        Class<com.onesignal.location.internal.permissions.b> cls = com.onesignal.location.internal.permissions.b.class;
        Class<z7.b> cls2 = z7.b.class;
        cVar.register(cls).provides(cls).provides(cls2);
        cVar.register((l) a.INSTANCE).provides(t8.a.class);
        cVar.register(v8.a.class).provides(u8.a.class);
        cVar.register(r8.a.class).provides(q8.a.class);
        cVar.register(p8.a.class).provides(n7.b.class);
        cVar.register(com.onesignal.location.internal.a.class).provides(a.class).provides(cls2);
    }
}
