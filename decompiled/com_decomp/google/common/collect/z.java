package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.i0;
import com.google.common.collect.o;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l5.d;
import l5.g;
import l5.j;

public abstract class z {

    private enum a implements d {
        KEY {
            /* renamed from: a */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: a */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    static abstract class b extends i0.a {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map b();

        public void clear() {
            b().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object f10 = z.f(b(), key);
            if (g.a(f10, entry.getValue())) {
                return f10 != null || b().containsKey(key);
            }
            return false;
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return b().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) j.o(collection));
            } catch (UnsupportedOperationException unused) {
                return i0.e(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) j.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet c10 = i0.c(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        c10.add(((Map.Entry) next).getKey());
                    }
                }
                return b().keySet().retainAll(c10);
            }
        }

        public int size() {
            return b().size();
        }
    }

    static abstract class c extends AbstractMap {

        class a extends b {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map b() {
                return c.this;
            }

            public Iterator iterator() {
                return c.this.a();
            }
        }

        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Iterator a();

        public Set entrySet() {
            return new a();
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        g.b(i10, "expectedSize");
        return i10 + 1;
    }

    static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry c(Object obj, Object obj2) {
        return new m(obj, obj2);
    }

    static o d(Collection collection) {
        o.b bVar = new o.b(collection.size());
        int i10 = 0;
        for (Object c10 : collection) {
            bVar.c(c10, Integer.valueOf(i10));
            i10++;
        }
        return bVar.a();
    }

    public static LinkedHashMap e() {
        return new LinkedHashMap();
    }

    static Object f(Map map, Object obj) {
        j.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String g(Map map) {
        StringBuilder a10 = h.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
            z10 = false;
        }
        a10.append('}');
        return a10.toString();
    }

    static d h() {
        return a.VALUE;
    }
}
