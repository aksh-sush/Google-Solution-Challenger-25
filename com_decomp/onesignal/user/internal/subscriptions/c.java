package com.onesignal.user.internal.subscriptions;

import ba.a;
import ba.b;
import ba.d;
import ba.e;
import db.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {
    private final b _fallbackPushSub;
    private final List<e> collection;

    public c(List<? extends e> list, b bVar) {
        l.e(list, "collection");
        l.e(bVar, "_fallbackPushSub");
        this.collection = list;
        this._fallbackPushSub = bVar;
    }

    public final a getByEmail(String str) {
        T t10;
        l.e(str, "email");
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (l.a(((a) t10).getEmail(), str)) {
                break;
            }
        }
        return (a) t10;
    }

    public final d getBySMS(String str) {
        T t10;
        l.e(str, "sms");
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (l.a(((d) t10).getNumber(), str)) {
                break;
            }
        }
        return (d) t10;
    }

    public final List<e> getCollection() {
        return this.collection;
    }

    public final List<a> getEmails() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof a) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final b getPush() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof b) {
                arrayList.add(next);
            }
        }
        b bVar = (b) w.x(arrayList);
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<d> getSmss() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof d) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
