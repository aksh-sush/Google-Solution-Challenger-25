package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class f0 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f7993a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceSet f7994b = new ReferenceSet();

    /* renamed from: c  reason: collision with root package name */
    private int f7995c;

    /* renamed from: d  reason: collision with root package name */
    private SnapshotVersion f7996d = SnapshotVersion.NONE;

    /* renamed from: e  reason: collision with root package name */
    private long f7997e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final MemoryPersistence f7998f;

    f0(MemoryPersistence memoryPersistence) {
        this.f7998f = memoryPersistence;
    }

    public ImmutableSortedSet a(int i10) {
        return this.f7994b.referencesForId(i10);
    }

    public void b(ImmutableSortedSet immutableSortedSet, int i10) {
        this.f7994b.addReferences(immutableSortedSet, i10);
        h0 referenceDelegate = this.f7998f.getReferenceDelegate();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            referenceDelegate.f((DocumentKey) it.next());
        }
    }

    public void c(int i10) {
        this.f7994b.removeReferencesForId(i10);
    }

    public void d(TargetData targetData) {
        f(targetData);
    }

    public void e(SnapshotVersion snapshotVersion) {
        this.f7996d = snapshotVersion;
    }

    public void f(TargetData targetData) {
        this.f7993a.put(targetData.getTarget(), targetData);
        int targetId = targetData.getTargetId();
        if (targetId > this.f7995c) {
            this.f7995c = targetId;
        }
        if (targetData.getSequenceNumber() > this.f7997e) {
            this.f7997e = targetData.getSequenceNumber();
        }
    }

    public TargetData g(Target target) {
        return (TargetData) this.f7993a.get(target);
    }

    public int getHighestTargetId() {
        return this.f7995c;
    }

    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.f7996d;
    }

    public void h(ImmutableSortedSet immutableSortedSet, int i10) {
        this.f7994b.removeReferences(immutableSortedSet, i10);
        h0 referenceDelegate = this.f7998f.getReferenceDelegate();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            referenceDelegate.i((DocumentKey) it.next());
        }
    }

    public boolean i(DocumentKey documentKey) {
        return this.f7994b.containsKey(documentKey);
    }

    public void j(Consumer consumer) {
        for (TargetData accept : this.f7993a.values()) {
            consumer.accept(accept);
        }
    }

    /* access modifiers changed from: package-private */
    public long k(LocalSerializer localSerializer) {
        long j10 = 0;
        for (Map.Entry value : this.f7993a.entrySet()) {
            j10 += (long) localSerializer.encodeTargetData((TargetData) value.getValue()).getSerializedSize();
        }
        return j10;
    }

    public long l() {
        return this.f7997e;
    }

    public long m() {
        return (long) this.f7993a.size();
    }

    /* access modifiers changed from: package-private */
    public int n(long j10, SparseArray sparseArray) {
        Iterator it = this.f7993a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int targetId = ((TargetData) entry.getValue()).getTargetId();
            if (((TargetData) entry.getValue()).getSequenceNumber() <= j10 && sparseArray.get(targetId) == null) {
                it.remove();
                c(targetId);
                i10++;
            }
        }
        return i10;
    }

    public void o(TargetData targetData) {
        this.f7993a.remove(targetData.getTarget());
        this.f7994b.removeReferencesForId(targetData.getTargetId());
    }
}
