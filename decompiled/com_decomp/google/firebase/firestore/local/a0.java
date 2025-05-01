package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class a0 implements IndexManager {

    /* renamed from: a  reason: collision with root package name */
    private final a f7944a = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap f7945a = new HashMap();

        a() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(ResourcePath resourcePath) {
            boolean z10 = true;
            if (resourcePath.length() % 2 != 1) {
                z10 = false;
            }
            Assert.hardAssert(z10, "Expected a collection path.", new Object[0]);
            String lastSegment = resourcePath.getLastSegment();
            ResourcePath resourcePath2 = (ResourcePath) resourcePath.popLast();
            HashSet hashSet = (HashSet) this.f7945a.get(lastSegment);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f7945a.put(lastSegment, hashSet);
            }
            return hashSet.add(resourcePath2);
        }

        /* access modifiers changed from: package-private */
        public List b(String str) {
            HashSet hashSet = (HashSet) this.f7945a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    a0() {
    }

    public void addToCollectionParentIndex(ResourcePath resourcePath) {
        this.f7944a.a(resourcePath);
    }

    public List getCollectionParents(String str) {
        return this.f7944a.b(str);
    }
}
