package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class e1 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLitePersistence f7983a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f7984b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7985c;

    /* renamed from: d  reason: collision with root package name */
    private int f7986d;

    /* renamed from: e  reason: collision with root package name */
    private j f7987e;

    private static class a implements Consumer {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList f7988a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f7989b = true;

        a(byte[] bArr) {
            c(bArr);
        }

        private void c(byte[] bArr) {
            this.f7988a.add(j.o(bArr));
        }

        /* renamed from: a */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.f7989b = false;
            }
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return this.f7988a.size();
        }

        /* access modifiers changed from: package-private */
        public j e() {
            return j.k(this.f7988a);
        }
    }

    e1(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user) {
        this.f7983a = sQLitePersistence;
        this.f7984b = localSerializer;
        this.f7985c = user.isAuthenticated() ? user.getUid() : "";
        this.f7987e = WriteStream.EMPTY_STREAM_TOKEN;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(List list, Cursor cursor) {
        list.add(y(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(List list, Cursor cursor) {
        list.add(y(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(Set set, List list, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (!set.contains(Integer.valueOf(i10))) {
            set.add(Integer.valueOf(i10));
            list.add(y(i10, cursor.getBlob(1)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(List list, int i10, Cursor cursor) {
        int i11 = cursor.getInt(0);
        int size = list.size();
        if ((size <= 0 || i11 != ((MutationBatch) list.get(size - 1)).getBatchId()) && d.b(cursor.getString(1)).length() == i10) {
            list.add(y(i11, cursor.getBlob(2)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MutationBatch G(Cursor cursor) {
        return y(cursor.getInt(0), cursor.getBlob(1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(Cursor cursor) {
        this.f7986d = Math.max(this.f7986d, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MutationBatch J(int i10, Cursor cursor) {
        return y(i10, cursor.getBlob(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(Cursor cursor) {
        this.f7987e = j.o(cursor.getBlob(0));
    }

    private void M() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f7983a.query("SELECT uid FROM mutation_queues").e(new t0(arrayList));
        this.f7986d = 0;
        for (String str : arrayList) {
            this.f7983a.query("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b(str).e(new u0(this));
        }
        this.f7986d++;
    }

    private void N() {
        this.f7983a.execute("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f7985c, -1, this.f7987e.H());
    }

    private MutationBatch y(int i10, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f7984b.decodeMutationBatch(WriteBatch.parseFrom(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f7989b) {
                this.f7983a.query("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * 1000000) + 1), 1000000, this.f7985c, Integer.valueOf(i10)).c(aVar);
            }
            return this.f7984b.decodeMutationBatch(WriteBatch.parseFrom(aVar.e()));
        } catch (d0 e10) {
            throw Assert.fail("MutationBatch failed to parse: %s", e10);
        }
    }

    public void a() {
        if (z()) {
            ArrayList arrayList = new ArrayList();
            this.f7983a.query("SELECT path FROM document_mutations WHERE uid = ?").b(this.f7985c).e(new a1(arrayList));
            Assert.hardAssert(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    public MutationBatch b(int i10) {
        return (MutationBatch) this.f7983a.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(1000000, this.f7985c, Integer.valueOf(i10 + 1)).d(new d1(this));
    }

    public int c() {
        return ((Integer) this.f7983a.query("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").b(-1, this.f7985c).d(new s0())).intValue();
    }

    public List d(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d.c(((DocumentKey) it.next()).getPath()));
        }
        SQLitePersistence.b bVar = new SQLitePersistence.b(this.f7983a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(new Object[]{1000000, this.f7985c}), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (bVar.b()) {
            bVar.c().e(new b1(this, hashSet, arrayList2));
        }
        if (bVar.a() > 1) {
            Collections.sort(arrayList2, new c1());
        }
        return arrayList2;
    }

    public MutationBatch e(Timestamp timestamp, List list, List list2) {
        int i10 = this.f7986d;
        this.f7986d = i10 + 1;
        MutationBatch mutationBatch = new MutationBatch(i10, timestamp, list, list2);
        WriteBatch encodeMutationBatch = this.f7984b.encodeMutationBatch(mutationBatch);
        this.f7983a.execute("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f7985c, Integer.valueOf(i10), encodeMutationBatch.toByteArray());
        HashSet hashSet = new HashSet();
        SQLiteStatement prepare = this.f7983a.prepare("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            DocumentKey key = ((Mutation) it.next()).getKey();
            if (hashSet.add(key)) {
                String c10 = d.c(key.getPath());
                this.f7983a.execute(prepare, this.f7985c, c10, Integer.valueOf(i10));
                this.f7983a.getIndexManager().addToCollectionParentIndex((ResourcePath) key.getPath().popLast());
            }
        }
        return mutationBatch;
    }

    public MutationBatch f(int i10) {
        return (MutationBatch) this.f7983a.query("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(1000000, this.f7985c, Integer.valueOf(i10)).d(new y0(this, i10));
    }

    public void g(MutationBatch mutationBatch) {
        SQLiteStatement prepare = this.f7983a.prepare("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement prepare2 = this.f7983a.prepare("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int batchId = mutationBatch.getBatchId();
        Assert.hardAssert(this.f7983a.execute(prepare, this.f7985c, Integer.valueOf(batchId)) != 0, "Mutation batch (%s, %d) did not exist", this.f7985c, Integer.valueOf(mutationBatch.getBatchId()));
        for (Mutation key : mutationBatch.getMutations()) {
            DocumentKey key2 = key.getKey();
            this.f7983a.execute(prepare2, this.f7985c, d.c(key2.getPath()), Integer.valueOf(batchId));
            this.f7983a.getReferenceDelegate().e(key2);
        }
    }

    public j getLastStreamToken() {
        return this.f7987e;
    }

    public List h(Query query) {
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath path = query.getPath();
        String c10 = d.c(path);
        String f10 = d.f(c10);
        ArrayList arrayList = new ArrayList();
        this.f7983a.query("SELECT dm.batch_id, dm.path, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path >= ? AND dm.path < ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").b(1000000, this.f7985c, c10, f10).e(new x0(this, arrayList, path.length() + 1));
        return arrayList;
    }

    public List i(DocumentKey documentKey) {
        String c10 = d.c(documentKey.getPath());
        ArrayList arrayList = new ArrayList();
        this.f7983a.query("SELECT m.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path = ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").b(1000000, this.f7985c, c10).e(new z0(this, arrayList));
        return arrayList;
    }

    public void j(MutationBatch mutationBatch, j jVar) {
        this.f7987e = (j) Preconditions.checkNotNull(jVar);
        N();
    }

    public void k(j jVar) {
        this.f7987e = (j) Preconditions.checkNotNull(jVar);
        N();
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        this.f7983a.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(1000000, this.f7985c).e(new v0(this, arrayList));
        return arrayList;
    }

    public void start() {
        M();
        if (this.f7983a.query("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.f7985c).c(new w0(this)) == 0) {
            N();
        }
    }

    public boolean z() {
        return this.f7983a.query("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.f7985c).f();
    }
}
