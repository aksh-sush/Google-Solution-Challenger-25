package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.IndexRange;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.Arrays;
import java.util.List;
import t5.x;

public class IndexedQueryEngine implements QueryEngine {
    private static final double HIGH_SELECTIVITY = 1.0d;
    private static final double LOW_SELECTIVITY = 0.5d;
    private static final List<x.c> lowCardinalityTypes = Arrays.asList(new x.c[]{x.c.BOOLEAN_VALUE, x.c.ARRAY_VALUE, x.c.MAP_VALUE});
    private final SQLiteCollectionIndex collectionIndex;
    private e localDocuments;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.core.Filter$Operator[] r0 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7921a = r0
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7921a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7921a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7921a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7921a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.IndexedQueryEngine.a.<clinit>():void");
        }
    }

    public IndexedQueryEngine(SQLiteCollectionIndex sQLiteCollectionIndex) {
        this.collectionIndex = sQLiteCollectionIndex;
    }

    private static IndexRange convertFilterToIndexRange(Filter filter) {
        IndexRange.Builder fieldPath = IndexRange.builder().setFieldPath(filter.getField());
        if (filter instanceof FieldFilter) {
            FieldFilter fieldFilter = (FieldFilter) filter;
            x value = fieldFilter.getValue();
            int i10 = a.f7921a[fieldFilter.getOperator().ordinal()];
            if (i10 == 1) {
                fieldPath.setStart(value).setEnd(value);
            } else if (i10 == 2 || i10 == 3) {
                fieldPath.setEnd(value);
            } else if (i10 == 4 || i10 == 5) {
                fieldPath.setStart(value);
            } else {
                throw Assert.fail("Unexpected operator in query filter", new Object[0]);
            }
        }
        return fieldPath.build();
    }

    private static double estimateFilterSelectivity(Filter filter) {
        Assert.hardAssert(filter instanceof FieldFilter, "Filter type expected to be FieldFilter", new Object[0]);
        FieldFilter fieldFilter = (FieldFilter) filter;
        x value = fieldFilter.getValue();
        boolean isNullValue = Values.isNullValue(value);
        double d10 = HIGH_SELECTIVITY;
        if (isNullValue || Values.isNanValue(value)) {
            return HIGH_SELECTIVITY;
        }
        double d11 = fieldFilter.getOperator().equals(Filter.Operator.EQUAL) ? 1.0d : 0.5d;
        if (lowCardinalityTypes.contains(fieldFilter.getValue().E())) {
            d10 = 0.5d;
        }
        return d10 * d11;
    }

    static IndexRange extractBestIndexRange(Query query) {
        Filter filter = null;
        if (!query.getFilters().isEmpty()) {
            double d10 = -1.0d;
            for (Filter next : query.getFilters()) {
                double estimateFilterSelectivity = estimateFilterSelectivity(next);
                if (estimateFilterSelectivity > d10) {
                    filter = next;
                    d10 = estimateFilterSelectivity;
                }
            }
            Assert.hardAssert(filter != null, "Filter should be defined", new Object[0]);
            return convertFilterToIndexRange(filter);
        } else if (!query.getOrderBy().get(0).getField().equals(FieldPath.KEY_PATH)) {
            return IndexRange.builder().setFieldPath(query.getOrderBy().get(0).getField()).build();
        } else {
            return null;
        }
    }

    private ImmutableSortedMap<DocumentKey, Document> performCollectionQuery(Query query) {
        Assert.hardAssert(!query.isDocumentQuery(), "matchesCollectionQuery() called with document query.", new Object[0]);
        IndexRange extractBestIndexRange = extractBestIndexRange(query);
        if (extractBestIndexRange != null) {
            return performQueryUsingIndex(query, extractBestIndexRange);
        }
        Assert.hardAssert(query.getFilters().isEmpty(), "If there are any filters, we should be able to use an index.", new Object[0]);
        return this.localDocuments.i(query, SnapshotVersion.NONE);
    }

    private ImmutableSortedMap<DocumentKey, Document> performQueryUsingIndex(Query query, IndexRange indexRange) {
        ImmutableSortedMap<DocumentKey, Document> emptyDocumentMap = DocumentCollections.emptyDocumentMap();
        IndexCursor cursor = this.collectionIndex.getCursor(query.getPath(), indexRange);
        while (cursor.next()) {
            try {
                Document c10 = this.localDocuments.c(cursor.getDocumentKey());
                if (query.matches(c10)) {
                    emptyDocumentMap = emptyDocumentMap.insert(cursor.getDocumentKey(), c10);
                }
            } finally {
                cursor.close();
            }
        }
        return emptyDocumentMap;
    }

    public ImmutableSortedMap<DocumentKey, Document> getDocumentsMatchingQuery(Query query, SnapshotVersion snapshotVersion, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        Assert.hardAssert(this.localDocuments != null, "setLocalDocumentsView() not called", new Object[0]);
        return query.isDocumentQuery() ? this.localDocuments.i(query, SnapshotVersion.NONE) : performCollectionQuery(query);
    }

    public void handleDocumentChange(MutableDocument mutableDocument, MutableDocument mutableDocument2) {
        throw new RuntimeException("Not yet implemented.");
    }

    public void setLocalDocumentsView(e eVar) {
        this.localDocuments = eVar;
    }
}
