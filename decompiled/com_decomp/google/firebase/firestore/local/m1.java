package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.protobuf.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

final class m1 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLitePersistence f8051a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f8052b;

    m1(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f8051a = sQLitePersistence;
        this.f8052b = localSerializer;
    }

    private MutableDocument j(byte[] bArr) {
        try {
            return this.f8052b.decodeMaybeDocument(MaybeDocument.parseFrom(bArr));
        } catch (d0 e10) {
            throw Assert.fail("MaybeDocument failed to parse: %s", e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MutableDocument k(Cursor cursor) {
        return j(cursor.getBlob(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(Map map, Cursor cursor) {
        MutableDocument j10 = j(cursor.getBlob(0));
        map.put(j10.getKey(), j10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(byte[] bArr, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        MutableDocument j10 = j(bArr);
        if (j10.isFoundDocument() && query.matches(j10)) {
            synchronized (this) {
                immutableSortedMapArr[0] = immutableSortedMapArr[0].insert(j10.getKey(), j10);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(int i10, BackgroundQueue backgroundQueue, Query query, ImmutableSortedMap[] immutableSortedMapArr, Cursor cursor) {
        if (d.b(cursor.getString(0)).length() == i10) {
            byte[] blob = cursor.getBlob(1);
            Executor executor = backgroundQueue;
            if (cursor.isLast()) {
                executor = Executors.DIRECT_EXECUTOR;
            }
            executor.execute(new l1(this, blob, query, immutableSortedMapArr));
        }
    }

    private String o(DocumentKey documentKey) {
        return d.c(documentKey.getPath());
    }

    public void a(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.hardAssert(!snapshotVersion.equals(SnapshotVersion.NONE), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        String o10 = o(mutableDocument.getKey());
        Timestamp timestamp = snapshotVersion.getTimestamp();
        MaybeDocument encodeMaybeDocument = this.f8052b.encodeMaybeDocument(mutableDocument);
        this.f8051a.execute("INSERT OR REPLACE INTO remote_documents (path, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?)", o10, Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), encodeMaybeDocument.toByteArray());
        this.f8051a.getIndexManager().addToCollectionParentIndex((ResourcePath) mutableDocument.getKey().getPath().popLast());
    }

    public MutableDocument b(DocumentKey documentKey) {
        MutableDocument mutableDocument = (MutableDocument) this.f8051a.query("SELECT contents FROM remote_documents WHERE path = ?").b(o(documentKey)).d(new k1(this));
        return mutableDocument != null ? mutableDocument : MutableDocument.newInvalidDocument(documentKey);
    }

    public ImmutableSortedMap c(Query query, SnapshotVersion snapshotVersion) {
        SQLitePersistence.d dVar;
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath path = query.getPath();
        int length = path.length() + 1;
        String c10 = d.c(path);
        String f10 = d.f(c10);
        Timestamp timestamp = snapshotVersion.getTimestamp();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        ImmutableSortedMap[] immutableSortedMapArr = {DocumentCollections.emptyMutableDocumentMap()};
        if (snapshotVersion.equals(SnapshotVersion.NONE)) {
            dVar = this.f8051a.query("SELECT path, contents FROM remote_documents WHERE path >= ? AND path < ?").b(c10, f10);
        } else {
            dVar = this.f8051a.query("SELECT path, contents FROM remote_documents WHERE path >= ? AND path < ?AND (read_time_seconds > ? OR (read_time_seconds = ? AND read_time_nanos > ?))").b(c10, f10, Long.valueOf(timestamp.getSeconds()), Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()));
        }
        dVar.e(new j1(this, length, backgroundQueue, query, immutableSortedMapArr));
        try {
            backgroundQueue.drain();
        } catch (InterruptedException e10) {
            Assert.fail("Interrupted while deserializing documents", e10);
        }
        return immutableSortedMapArr[0];
    }

    public void d(DocumentKey documentKey) {
        String o10 = o(documentKey);
        this.f8051a.execute("DELETE FROM remote_documents WHERE path = ?", o10);
    }

    public Map e(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d.c(((DocumentKey) it.next()).getPath()));
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it2.next();
            hashMap.put(documentKey, MutableDocument.newInvalidDocument(documentKey));
        }
        SQLitePersistence.b bVar = new SQLitePersistence.b(this.f8051a, "SELECT contents FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        while (bVar.b()) {
            bVar.c().e(new i1(this, hashMap));
        }
        return hashMap;
    }
}
