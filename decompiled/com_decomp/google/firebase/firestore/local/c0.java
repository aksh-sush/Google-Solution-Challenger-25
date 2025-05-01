package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;
import java.util.Map;

class c0 implements h0, LruDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final MemoryPersistence f7957a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f7958b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f7959c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private ReferenceSet f7960d;

    /* renamed from: e  reason: collision with root package name */
    private final LruGarbageCollector f7961e;

    /* renamed from: f  reason: collision with root package name */
    private final ListenSequence f7962f;

    /* renamed from: g  reason: collision with root package name */
    private long f7963g;

    c0(MemoryPersistence memoryPersistence, LruGarbageCollector.Params params, LocalSerializer localSerializer) {
        this.f7957a = memoryPersistence;
        this.f7958b = localSerializer;
        this.f7962f = new ListenSequence(memoryPersistence.getTargetCache().l());
        this.f7963g = -1;
        this.f7961e = new LruGarbageCollector(this, params);
    }

    private boolean k(DocumentKey documentKey, long j10) {
        if (m(documentKey) || this.f7960d.containsKey(documentKey) || this.f7957a.getTargetCache().i(documentKey)) {
            return true;
        }
        Long l10 = (Long) this.f7959c.get(documentKey);
        return l10 != null && l10.longValue() > j10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(long[] jArr, Long l10) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean m(DocumentKey documentKey) {
        for (d0 m10 : this.f7957a.getMutationQueues()) {
            if (m10.m(documentKey)) {
                return true;
            }
        }
        return false;
    }

    public void a(DocumentKey documentKey) {
        this.f7959c.put(documentKey, Long.valueOf(g()));
    }

    public void b(ReferenceSet referenceSet) {
        this.f7960d = referenceSet;
    }

    public void c() {
        Assert.hardAssert(this.f7963g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f7963g = -1;
    }

    public void d() {
        Assert.hardAssert(this.f7963g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f7963g = this.f7962f.next();
    }

    public void e(DocumentKey documentKey) {
        this.f7959c.put(documentKey, Long.valueOf(g()));
    }

    public void f(DocumentKey documentKey) {
        this.f7959c.put(documentKey, Long.valueOf(g()));
    }

    public void forEachOrphanedDocumentSequenceNumber(Consumer consumer) {
        for (Map.Entry entry : this.f7959c.entrySet()) {
            if (!k((DocumentKey) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                consumer.accept((Long) entry.getValue());
            }
        }
    }

    public void forEachTarget(Consumer consumer) {
        this.f7957a.getTargetCache().j(consumer);
    }

    public long g() {
        Assert.hardAssert(this.f7963g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f7963g;
    }

    public long getByteSize() {
        long k10 = this.f7957a.getTargetCache().k(this.f7958b) + 0 + this.f7957a.getRemoteDocumentCache().g(this.f7958b);
        for (d0 n10 : this.f7957a.getMutationQueues()) {
            k10 += n10.n(this.f7958b);
        }
        return k10;
    }

    public LruGarbageCollector getGarbageCollector() {
        return this.f7961e;
    }

    public long getSequenceNumberCount() {
        long m10 = this.f7957a.getTargetCache().m();
        long[] jArr = new long[1];
        forEachOrphanedDocumentSequenceNumber(new b0(jArr));
        return m10 + jArr[0];
    }

    public void h(TargetData targetData) {
        this.f7957a.getTargetCache().d(targetData.withSequenceNumber(g()));
    }

    public void i(DocumentKey documentKey) {
        this.f7959c.put(documentKey, Long.valueOf(g()));
    }

    public int removeOrphanedDocuments(long j10) {
        e0 remoteDocumentCache = this.f7957a.getRemoteDocumentCache();
        int i10 = 0;
        for (MutableDocument key : remoteDocumentCache.h()) {
            DocumentKey key2 = key.getKey();
            if (!k(key2, j10)) {
                remoteDocumentCache.d(key2);
                this.f7959c.remove(key2);
                i10++;
            }
        }
        return i10;
    }

    public int removeTargets(long j10, SparseArray sparseArray) {
        return this.f7957a.getTargetCache().n(j10, sparseArray);
    }
}
