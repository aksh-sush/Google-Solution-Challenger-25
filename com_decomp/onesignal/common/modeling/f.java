package com.onesignal.common.modeling;

import com.google.firebase.messaging.Constants;
import db.g;
import db.l;
import db.x;
import eb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class f extends g implements Map, a {
    public f() {
        this((g) null, (String) null, 3, (g) null);
    }

    public void clear() {
        for (String optAnyProperty$default : getData().keySet()) {
            g.setOptAnyProperty$default(this, optAnyProperty$default, (Object) null, (String) null, false, 12, (Object) null);
        }
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    public boolean containsValue(Object obj) {
        return getData().containsValue(obj);
    }

    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        Set<Map.Entry<String, Object>> entrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (T next : entrySet) {
            if (x.h(next)) {
                arrayList.add(next);
            }
        }
        return w.U(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<Object> getValues() {
        Iterable<Object> values = getData().values();
        ArrayList arrayList = new ArrayList(p.l(values, 10));
        for (Object add : values) {
            arrayList.add(add);
        }
        return w.T(arrayList);
    }

    public boolean isEmpty() {
        return getData().isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public void putAll(Map<? extends String, Object> map) {
        l.e(map, Constants.MessagePayloadKeys.FROM);
        for (Map.Entry next : map.entrySet()) {
            g.setOptAnyProperty$default(this, (String) next.getKey(), next.getValue(), (String) null, false, 12, (Object) null);
        }
    }

    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public f(g gVar, String str) {
        super(gVar, str, (Object) null, 4, (g) null);
    }

    public boolean containsKey(String str) {
        l.e(str, "key");
        return getData().containsKey(str);
    }

    public Object get(String str) {
        l.e(str, "key");
        return g.getOptAnyProperty$default(this, str, (cb.a) null, 2, (Object) null);
    }

    public Object put(String str, Object obj) {
        l.e(str, "key");
        g.setOptAnyProperty$default(this, str, obj, (String) null, false, 12, (Object) null);
        return obj;
    }

    public Object remove(String str) {
        l.e(str, "key");
        Object optAnyProperty$default = g.getOptAnyProperty$default(this, str, (cb.a) null, 2, (Object) null);
        g.setOptAnyProperty$default(this, str, (Object) null, (String) null, false, 12, (Object) null);
        return optAnyProperty$default;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, String str, int i10, g gVar2) {
        this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : str);
    }
}
