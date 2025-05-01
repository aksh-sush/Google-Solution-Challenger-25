package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;

class r0 implements h0, LruDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final SQLitePersistence f8072a;

    /* renamed from: b  reason: collision with root package name */
    private ListenSequence f8073b;

    /* renamed from: c  reason: collision with root package name */
    private long f8074c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final LruGarbageCollector f8075d;

    /* renamed from: e  reason: collision with root package name */
    private ReferenceSet f8076e;

    r0(SQLitePersistence sQLitePersistence, LruGarbageCollector.Params params) {
        this.f8072a = sQLitePersistence;
        this.f8075d = new LruGarbageCollector(this, params);
    }

    private boolean m(DocumentKey documentKey) {
        if (this.f8076e.containsKey(documentKey)) {
            return true;
        }
        return q(documentKey);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(int[] iArr, Cursor cursor) {
        DocumentKey fromPath = DocumentKey.fromPath(d.b(cursor.getString(0)));
        if (!m(fromPath)) {
            iArr[0] = iArr[0] + 1;
            this.f8072a.getRemoteDocumentCache().d(fromPath);
            r(fromPath);
        }
    }

    private boolean q(DocumentKey documentKey) {
        return !this.f8072a.query("SELECT 1 FROM document_mutations WHERE path = ?").b(d.c(documentKey.getPath())).f();
    }

    private void r(DocumentKey documentKey) {
        this.f8072a.execute("DELETE FROM target_documents WHERE path = ? AND target_id = 0", d.c(documentKey.getPath()));
    }

    private void t(DocumentKey documentKey) {
        String c10 = d.c(documentKey.getPath());
        this.f8072a.execute("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", c10, Long.valueOf(g()));
    }

    public void a(DocumentKey documentKey) {
        t(documentKey);
    }

    public void b(ReferenceSet referenceSet) {
        this.f8076e = referenceSet;
    }

    public void c() {
        Assert.hardAssert(this.f8074c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f8074c = -1;
    }

    public void d() {
        Assert.hardAssert(this.f8074c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f8074c = this.f8073b.next();
    }

    public void e(DocumentKey documentKey) {
        t(documentKey);
    }

    public void f(DocumentKey documentKey) {
        t(documentKey);
    }

    public void forEachOrphanedDocumentSequenceNumber(Consumer consumer) {
        this.f8072a.query("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new p0(consumer));
    }

    public void forEachTarget(Consumer consumer) {
        this.f8072a.getTargetCache().o(consumer);
    }

    public long g() {
        Assert.hardAssert(this.f8074c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f8074c;
    }

    public long getByteSize() {
        return this.f8072a.getByteSize();
    }

    public LruGarbageCollector getGarbageCollector() {
        return this.f8075d;
    }

    public long getSequenceNumberCount() {
        return this.f8072a.getTargetCache().q() + ((Long) this.f8072a.query("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(new o0())).longValue();
    }

    public void h(TargetData targetData) {
        this.f8072a.getTargetCache().d(targetData.withSequenceNumber(g()));
    }

    public void i(DocumentKey documentKey) {
        t(documentKey);
    }

    public int removeOrphanedDocuments(long j10) {
        int[] iArr = new int[1];
        while (true) {
            boolean z10 = true;
            while (true) {
                if (!z10) {
                    return iArr[0];
                }
                if (this.f8072a.query("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").b(Long.valueOf(j10), 100).e(new q0(this, iArr)) != 100) {
                    z10 = false;
                }
            }
        }
    }

    public int removeTargets(long j10, SparseArray sparseArray) {
        return this.f8072a.getTargetCache().w(j10, sparseArray);
    }

    /* access modifiers changed from: package-private */
    public void s(long j10) {
        this.f8073b = new ListenSequence(j10);
    }
}
