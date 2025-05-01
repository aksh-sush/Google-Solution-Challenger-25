package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class DefaultQueryEngine implements QueryEngine {
    private static final String LOG_TAG = "DefaultQueryEngine";
    private e localDocumentsView;

    private ImmutableSortedSet<Document> applyQuery(Query query, ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        ImmutableSortedSet<Document> immutableSortedSet = new ImmutableSortedSet<>(Collections.emptyList(), query.comparator());
        Iterator<Map.Entry<DocumentKey, Document>> it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Document document = (Document) it.next().getValue();
            if (query.matches(document)) {
                immutableSortedSet = immutableSortedSet.insert(document);
            }
        }
        return immutableSortedSet;
    }

    private ImmutableSortedMap<DocumentKey, Document> executeFullCollectionScan(Query query) {
        if (Logger.isDebugEnabled()) {
            Logger.debug(LOG_TAG, "Using full collection scan to execute query: %s", query.toString());
        }
        return this.localDocumentsView.i(query, SnapshotVersion.NONE);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.Document>, com.google.firebase.database.collection.ImmutableSortedSet] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean needsRefill(com.google.firebase.firestore.core.Query.LimitType r3, com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.Document> r4, com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r5, com.google.firebase.firestore.model.SnapshotVersion r6) {
        /*
            r2 = this;
            int r5 = r5.size()
            int r0 = r4.size()
            r1 = 1
            if (r5 == r0) goto L_0x000c
            return r1
        L_0x000c:
            com.google.firebase.firestore.core.Query$LimitType r5 = com.google.firebase.firestore.core.Query.LimitType.LIMIT_TO_FIRST
            if (r3 != r5) goto L_0x0015
            java.lang.Object r3 = r4.getMaxEntry()
            goto L_0x0019
        L_0x0015:
            java.lang.Object r3 = r4.getMinEntry()
        L_0x0019:
            com.google.firebase.firestore.model.Document r3 = (com.google.firebase.firestore.model.Document) r3
            r4 = 0
            if (r3 != 0) goto L_0x001f
            return r4
        L_0x001f:
            boolean r5 = r3.hasPendingWrites()
            if (r5 != 0) goto L_0x0031
            com.google.firebase.firestore.model.SnapshotVersion r3 = r3.getVersion()
            int r3 = r3.compareTo((com.google.firebase.firestore.model.SnapshotVersion) r6)
            if (r3 <= 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.DefaultQueryEngine.needsRefill(com.google.firebase.firestore.core.Query$LimitType, com.google.firebase.database.collection.ImmutableSortedSet, com.google.firebase.database.collection.ImmutableSortedSet, com.google.firebase.firestore.model.SnapshotVersion):boolean");
    }

    public ImmutableSortedMap<DocumentKey, Document> getDocumentsMatchingQuery(Query query, SnapshotVersion snapshotVersion, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        Assert.hardAssert(this.localDocumentsView != null, "setLocalDocumentsView() not called", new Object[0]);
        if (query.matchesAllDocuments()) {
            return executeFullCollectionScan(query);
        }
        if (snapshotVersion.equals(SnapshotVersion.NONE)) {
            return executeFullCollectionScan(query);
        }
        ImmutableSortedSet<Document> applyQuery = applyQuery(query, this.localDocumentsView.e(immutableSortedSet));
        if ((query.hasLimitToFirst() || query.hasLimitToLast()) && needsRefill(query.getLimitType(), applyQuery, immutableSortedSet, snapshotVersion)) {
            return executeFullCollectionScan(query);
        }
        if (Logger.isDebugEnabled()) {
            Logger.debug(LOG_TAG, "Re-using previous result from %s to execute query: %s", snapshotVersion.toString(), query.toString());
        }
        ImmutableSortedMap<DocumentKey, Document> i10 = this.localDocumentsView.i(query, snapshotVersion);
        Iterator<Document> it = applyQuery.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            i10 = i10.insert(next.getKey(), next);
        }
        return i10;
    }

    public void handleDocumentChange(MutableDocument mutableDocument, MutableDocument mutableDocument2) {
    }

    public void setLocalDocumentsView(e eVar) {
        this.localDocumentsView = eVar;
    }
}
