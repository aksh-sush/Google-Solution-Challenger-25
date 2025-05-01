package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.d0;
import java.util.Iterator;

final class i2 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLitePersistence f8017a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f8018b;

    /* renamed from: c  reason: collision with root package name */
    private int f8019c;

    /* renamed from: d  reason: collision with root package name */
    private long f8020d;

    /* renamed from: e  reason: collision with root package name */
    private SnapshotVersion f8021e = SnapshotVersion.NONE;

    /* renamed from: f  reason: collision with root package name */
    private long f8022f;

    private static class b {
        /* access modifiers changed from: package-private */

        /* renamed from: a  reason: collision with root package name */
        public ImmutableSortedSet f8023a;

        private b() {
            this.f8023a = DocumentKey.emptyKeySet();
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        TargetData f8024a;

        private c() {
        }
    }

    i2(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f8017a = sQLitePersistence;
        this.f8018b = localSerializer;
    }

    private boolean A(TargetData targetData) {
        boolean z10;
        if (targetData.getTargetId() > this.f8019c) {
            this.f8019c = targetData.getTargetId();
            z10 = true;
        } else {
            z10 = false;
        }
        if (targetData.getSequenceNumber() <= this.f8020d) {
            return z10;
        }
        this.f8020d = targetData.getSequenceNumber();
        return true;
    }

    private void B() {
        this.f8017a.execute("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f8019c), Long.valueOf(this.f8020d), Long.valueOf(this.f8021e.getTimestamp().getSeconds()), Integer.valueOf(this.f8021e.getTimestamp().getNanoseconds()), Long.valueOf(this.f8022f));
    }

    private TargetData n(byte[] bArr) {
        try {
            return this.f8018b.decodeTargetData(Target.parseFrom(bArr));
        } catch (d0 e10) {
            throw Assert.fail("TargetData failed to parse: %s", e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(Consumer consumer, Cursor cursor) {
        consumer.accept(n(cursor.getBlob(0)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(com.google.firebase.firestore.core.Target target, c cVar, Cursor cursor) {
        TargetData n10 = n(cursor.getBlob(0));
        if (target.equals(n10.getTarget())) {
            cVar.f8024a = n10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (sparseArray.get(i10) == null) {
            x(i10);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(Cursor cursor) {
        this.f8019c = cursor.getInt(0);
        this.f8020d = (long) cursor.getInt(1);
        this.f8021e = new SnapshotVersion(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        this.f8022f = cursor.getLong(4);
    }

    private void x(int i10) {
        c(i10);
        this.f8017a.execute("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i10));
        this.f8022f--;
    }

    private void y(TargetData targetData) {
        int targetId = targetData.getTargetId();
        String canonicalId = targetData.getTarget().getCanonicalId();
        Timestamp timestamp = targetData.getSnapshotVersion().getTimestamp();
        Target encodeTargetData = this.f8018b.encodeTargetData(targetData);
        this.f8017a.execute("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(targetId), canonicalId, Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), targetData.getResumeToken().H(), Long.valueOf(targetData.getSequenceNumber()), encodeTargetData.toByteArray());
    }

    public ImmutableSortedSet a(int i10) {
        b bVar = new b();
        this.f8017a.query("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(i10)).e(new h2(bVar));
        return bVar.f8023a;
    }

    public void b(ImmutableSortedSet immutableSortedSet, int i10) {
        SQLiteStatement prepare = this.f8017a.prepare("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        r0 referenceDelegate = this.f8017a.getReferenceDelegate();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            String c10 = d.c(documentKey.getPath());
            this.f8017a.execute(prepare, Integer.valueOf(i10), c10);
            referenceDelegate.f(documentKey);
        }
    }

    public void c(int i10) {
        this.f8017a.execute("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i10));
    }

    public void d(TargetData targetData) {
        y(targetData);
        if (A(targetData)) {
            B();
        }
    }

    public void e(SnapshotVersion snapshotVersion) {
        this.f8021e = snapshotVersion;
        B();
    }

    public void f(TargetData targetData) {
        y(targetData);
        A(targetData);
        this.f8022f++;
        B();
    }

    public TargetData g(com.google.firebase.firestore.core.Target target) {
        String canonicalId = target.getCanonicalId();
        c cVar = new c();
        this.f8017a.query("SELECT target_proto FROM targets WHERE canonical_id = ?").b(canonicalId).e(new d2(this, target, cVar));
        return cVar.f8024a;
    }

    public int getHighestTargetId() {
        return this.f8019c;
    }

    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.f8021e;
    }

    public void h(ImmutableSortedSet immutableSortedSet, int i10) {
        SQLiteStatement prepare = this.f8017a.prepare("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        r0 referenceDelegate = this.f8017a.getReferenceDelegate();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            String c10 = d.c(documentKey.getPath());
            this.f8017a.execute(prepare, Integer.valueOf(i10), c10);
            referenceDelegate.i(documentKey);
        }
    }

    public void o(Consumer consumer) {
        this.f8017a.query("SELECT target_proto FROM targets").e(new g2(this, consumer));
    }

    public long p() {
        return this.f8020d;
    }

    public long q() {
        return this.f8022f;
    }

    /* access modifiers changed from: package-private */
    public int w(long j10, SparseArray sparseArray) {
        int[] iArr = new int[1];
        this.f8017a.query("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j10)).e(new f2(this, sparseArray, iArr));
        B();
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    public void z() {
        boolean z10 = true;
        if (this.f8017a.query("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new e2(this)) != 1) {
            z10 = false;
        }
        Assert.hardAssert(z10, "Missing target_globals entry", new Object[0]);
    }
}
