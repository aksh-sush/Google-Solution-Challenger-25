package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

abstract class l {

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Component f7759a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f7760b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set f7761c = new HashSet();

        b(Component component) {
            this.f7759a = component;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f7760b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f7761c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public Component c() {
            return this.f7759a;
        }

        /* access modifiers changed from: package-private */
        public Set d() {
            return this.f7760b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f7760b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f7761c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f7761c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class f7762a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7763b;

        private c(Class cls, boolean z10) {
            this.f7762a = cls;
            this.f7763b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f7762a.equals(this.f7762a) && cVar.f7763b == this.f7763b;
        }

        public int hashCode() {
            return ((this.f7762a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7763b).hashCode();
        }
    }

    static void a(List list) {
        Set<b> c10 = c(list);
        Set b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b bVar = (b) b10.iterator().next();
            b10.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b10.add(bVar2);
                }
            }
        }
        if (i10 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b bVar3 : c10) {
                if (!bVar3.f() && !bVar3.e()) {
                    arrayList.add(bVar3.c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            b bVar = new b(component);
            Iterator it2 = component.getProvidedInterfaces().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    c cVar = new c(cls, !component.isValue());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f7763b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<b> it3 : hashMap.values()) {
            for (b bVar2 : it3) {
                for (Dependency next : bVar2.c().getDependencies()) {
                    if (next.isDirectInjection() && (set = (Set) hashMap.get(new c(next.getInterface(), next.isSet()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
