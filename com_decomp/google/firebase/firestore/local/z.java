package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class z implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private ReferenceSet f8107a;

    /* renamed from: b  reason: collision with root package name */
    private final MemoryPersistence f8108b;

    /* renamed from: c  reason: collision with root package name */
    private Set f8109c;

    z(MemoryPersistence memoryPersistence) {
        this.f8108b = memoryPersistence;
    }

    private boolean j(DocumentKey documentKey) {
        if (this.f8108b.getTargetCache().i(documentKey) || k(documentKey)) {
            return true;
        }
        ReferenceSet referenceSet = this.f8107a;
        return referenceSet != null && referenceSet.containsKey(documentKey);
    }

    private boolean k(DocumentKey documentKey) {
        for (d0 m10 : this.f8108b.getMutationQueues()) {
            if (m10.m(documentKey)) {
                return true;
            }
        }
        return false;
    }

    public void a(DocumentKey documentKey) {
        if (j(documentKey)) {
            this.f8109c.remove(documentKey);
        } else {
            this.f8109c.add(documentKey);
        }
    }

    public void b(ReferenceSet referenceSet) {
        this.f8107a = referenceSet;
    }

    public void c() {
        e0 remoteDocumentCache = this.f8108b.getRemoteDocumentCache();
        for (DocumentKey documentKey : this.f8109c) {
            if (!j(documentKey)) {
                remoteDocumentCache.d(documentKey);
            }
        }
        this.f8109c = null;
    }

    public void d() {
        this.f8109c = new HashSet();
    }

    public void e(DocumentKey documentKey) {
        this.f8109c.add(documentKey);
    }

    public void f(DocumentKey documentKey) {
        this.f8109c.remove(documentKey);
    }

    public long g() {
        return -1;
    }

    public void h(TargetData targetData) {
        f0 targetCache = this.f8108b.getTargetCache();
        Iterator it = targetCache.a(targetData.getTargetId()).iterator();
        while (it.hasNext()) {
            this.f8109c.add((DocumentKey) it.next());
        }
        targetCache.o(targetData);
    }

    public void i(DocumentKey documentKey) {
        this.f8109c.add(documentKey);
    }
}
