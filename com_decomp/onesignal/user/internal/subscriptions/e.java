package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.modeling.j;
import db.l;
import db.m;
import java.util.Iterator;
import java.util.List;
import sa.t;

public class e extends j {

    static final class a extends m implements cb.a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final d invoke() {
            return new d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(y7.a aVar) {
        super(a.INSTANCE, "subscriptions", aVar);
        l.e(aVar, "prefs");
    }

    public void replaceAll(List<d> list, String str) {
        l.e(list, "models");
        l.e(str, "tag");
        if (!l.a(str, "HYDRATE")) {
            super.replaceAll(list, str);
            return;
        }
        synchronized (list) {
            Iterator<d> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.getType() == g.PUSH) {
                    d dVar = (d) get(next.getId());
                    if (dVar != null) {
                        next.setSdk(dVar.getSdk());
                        next.setDeviceOS(dVar.getDeviceOS());
                        next.setCarrier(dVar.getCarrier());
                        next.setAppVersion(dVar.getAppVersion());
                    }
                }
            }
            super.replaceAll(list, str);
            t tVar = t.f15300a;
        }
    }
}
