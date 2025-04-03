package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.ListenerRegistrationImpl;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import n4.i;
import n4.j;
import n4.l;
import t5.a;
import t5.x;

public class Query {
    final FirebaseFirestore firestore;
    final com.google.firebase.firestore.core.Query query;

    public enum Direction {
        ASCENDING,
        DESCENDING
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7825a;

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
                f7825a = r0
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7825a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7825a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.IN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7825a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7825a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.Query.a.<clinit>():void");
        }
    }

    Query(com.google.firebase.firestore.core.Query query2, FirebaseFirestore firebaseFirestore) {
        this.query = (com.google.firebase.firestore.core.Query) Preconditions.checkNotNull(query2);
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
    }

    private ListenerRegistration addSnapshotListenerInternal(Executor executor, EventManager.ListenOptions listenOptions, Activity activity, EventListener<QuerySnapshot> eventListener) {
        validateHasExplicitOrderByForLimitToLast();
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new q(this, eventListener));
        return ActivityScope.bind(activity, new ListenerRegistrationImpl(this.firestore.getClient(), this.firestore.getClient().listen(this.query, listenOptions, asyncEventListener), asyncEventListener));
    }

    private Bound boundFromDocumentSnapshot(String str, DocumentSnapshot documentSnapshot, boolean z10) {
        Preconditions.checkNotNull(documentSnapshot, "Provided snapshot must not be null.");
        if (documentSnapshot.exists()) {
            Document document = documentSnapshot.getDocument();
            ArrayList arrayList = new ArrayList();
            for (OrderBy next : this.query.getOrderBy()) {
                if (next.getField().equals(FieldPath.KEY_PATH)) {
                    arrayList.add(Values.refValue(this.firestore.getDatabaseId(), document.getKey()));
                } else {
                    x field = document.getField(next.getField());
                    if (ServerTimestamps.isServerTimestamp(field)) {
                        throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + next.getField() + "' is an uncommitted server timestamp. (Since the value of this field is unknown, you cannot start/end a query with it.)");
                    } else if (field != null) {
                        arrayList.add(field);
                    } else {
                        throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + next.getField() + "' (used as the orderBy) does not exist.");
                    }
                }
            }
            return new Bound(arrayList, z10);
        }
        throw new IllegalArgumentException("Can't use a DocumentSnapshot for a document that doesn't exist for " + str + "().");
    }

    private Bound boundFromFields(String str, Object[] objArr, boolean z10) {
        x xVar;
        List<OrderBy> explicitOrderBy = this.query.getExplicitOrderBy();
        if (objArr.length <= explicitOrderBy.size()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < objArr.length; i10++) {
                String str2 = objArr[i10];
                if (!explicitOrderBy.get(i10).getField().equals(FieldPath.KEY_PATH)) {
                    xVar = this.firestore.getUserDataReader().parseQueryValue(str2);
                } else if (str2 instanceof String) {
                    String str3 = str2;
                    if (this.query.isCollectionGroupQuery() || !str3.contains("/")) {
                        ResourcePath resourcePath = (ResourcePath) this.query.getPath().append(ResourcePath.fromString(str3));
                        if (DocumentKey.isDocumentKey(resourcePath)) {
                            xVar = Values.refValue(this.firestore.getDatabaseId(), DocumentKey.fromPath(resourcePath));
                        } else {
                            throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + resourcePath + "' is not because it contains an odd number of segments.");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str3 + "' contains a slash.");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + str2 + ".");
                }
                arrayList.add(xVar);
            }
            return new Bound(arrayList, z10);
        }
        throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
    }

    private List<Filter.Operator> conflictingOps(Filter.Operator operator) {
        int i10 = a.f7825a[operator.ordinal()];
        if (i10 == 1) {
            return Arrays.asList(new Filter.Operator[]{Filter.Operator.NOT_EQUAL, Filter.Operator.NOT_IN});
        } else if (i10 == 2) {
            return Arrays.asList(new Filter.Operator[]{Filter.Operator.ARRAY_CONTAINS, Filter.Operator.ARRAY_CONTAINS_ANY, Filter.Operator.NOT_IN});
        } else if (i10 == 3) {
            return Arrays.asList(new Filter.Operator[]{Filter.Operator.ARRAY_CONTAINS_ANY, Filter.Operator.IN, Filter.Operator.NOT_IN});
        } else if (i10 == 4) {
            return Arrays.asList(new Filter.Operator[]{Filter.Operator.ARRAY_CONTAINS, Filter.Operator.ARRAY_CONTAINS_ANY, Filter.Operator.IN, Filter.Operator.NOT_IN});
        } else if (i10 != 5) {
            return new ArrayList();
        } else {
            return Arrays.asList(new Filter.Operator[]{Filter.Operator.ARRAY_CONTAINS, Filter.Operator.ARRAY_CONTAINS_ANY, Filter.Operator.IN, Filter.Operator.NOT_IN, Filter.Operator.NOT_EQUAL});
        }
    }

    private i getViaSnapshotListener(Source source) {
        j jVar = new j();
        j jVar2 = new j();
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.includeDocumentMetadataChanges = true;
        listenOptions.includeQueryMetadataChanges = true;
        listenOptions.waitForSyncWhenOnline = true;
        jVar2.c(addSnapshotListenerInternal(Executors.DIRECT_EXECUTOR, listenOptions, (Activity) null, new o(jVar, jVar2, source)));
        return jVar.a();
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges) {
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
        boolean z10 = true;
        listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
        if (metadataChanges != metadataChanges2) {
            z10 = false;
        }
        listenOptions.includeQueryMetadataChanges = z10;
        listenOptions.waitForSyncWhenOnline = false;
        return listenOptions;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotListenerInternal$2(EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.onEvent(null, firebaseFirestoreException);
            return;
        }
        Assert.hardAssert(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        eventListener.onEvent(new QuerySnapshot(this, viewSnapshot, this.firestore), (FirebaseFirestoreException) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ QuerySnapshot lambda$get$0(i iVar) {
        return new QuerySnapshot(new Query(this.query, this.firestore), (ViewSnapshot) iVar.getResult(), this.firestore);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getViaSnapshotListener$1(j jVar, j jVar2, Source source, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            jVar.b(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) l.a(jVar2.a())).remove();
            if (!querySnapshot.getMetadata().isFromCache() || source != Source.SERVER) {
                jVar.c(querySnapshot);
            } else {
                jVar.b(new FirebaseFirestoreException("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            }
        } catch (ExecutionException e10) {
            throw Assert.fail(e10, "Failed to register a listener for a query result", new Object[0]);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw Assert.fail(e11, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    private x parseDocumentIdValue(Object obj) {
        DatabaseId databaseId;
        DocumentKey key;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            } else if (this.query.isCollectionGroupQuery() || !str.contains("/")) {
                ResourcePath resourcePath = (ResourcePath) this.query.getPath().append(ResourcePath.fromString(str));
                if (DocumentKey.isDocumentKey(resourcePath)) {
                    databaseId = getFirestore().getDatabaseId();
                    key = DocumentKey.fromPath(resourcePath);
                } else {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + resourcePath + "' is not because it has an odd number of segments (" + resourcePath.length() + ").");
                }
            } else {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
        } else if (obj instanceof DocumentReference) {
            databaseId = getFirestore().getDatabaseId();
            key = ((DocumentReference) obj).getKey();
        } else {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + Util.typeName(obj));
        }
        return Values.refValue(databaseId, key);
    }

    private void validateDisjunctiveFilterElements(Object obj, Filter.Operator operator) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() != 0) {
                if (list.size() > 10) {
                    throw new IllegalArgumentException("Invalid Query. '" + operator.toString() + "' filters support a maximum of 10 elements in the value array.");
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + operator.toString() + "' filters.");
    }

    private void validateHasExplicitOrderByForLimitToLast() {
        if (this.query.hasLimitToLast() && this.query.getExplicitOrderBy().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void validateNewFilter(Filter filter) {
        if (filter instanceof FieldFilter) {
            FieldFilter fieldFilter = (FieldFilter) filter;
            Filter.Operator operator = fieldFilter.getOperator();
            if (fieldFilter.isInequality()) {
                FieldPath inequalityField = this.query.inequalityField();
                FieldPath field = filter.getField();
                if (inequalityField == null || inequalityField.equals(field)) {
                    FieldPath firstOrderByField = this.query.getFirstOrderByField();
                    if (firstOrderByField != null) {
                        validateOrderByFieldMatchesInequality(firstOrderByField, field);
                    }
                } else {
                    throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", new Object[]{inequalityField.canonicalString(), field.canonicalString()}));
                }
            }
            Filter.Operator findFilterOperator = this.query.findFilterOperator(conflictingOps(operator));
            if (findFilterOperator == null) {
                return;
            }
            if (findFilterOperator == operator) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + operator.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + operator.toString() + "' filters with '" + findFilterOperator.toString() + "' filters.");
        }
    }

    private void validateOrderByField(FieldPath fieldPath) {
        FieldPath inequalityField = this.query.inequalityField();
        if (this.query.getFirstOrderByField() == null && inequalityField != null) {
            validateOrderByFieldMatchesInequality(fieldPath, inequalityField);
        }
    }

    private void validateOrderByFieldMatchesInequality(FieldPath fieldPath, FieldPath fieldPath2) {
        if (!fieldPath.equals(fieldPath2)) {
            String canonicalString = fieldPath2.canonicalString();
            throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", new Object[]{canonicalString, canonicalString, fieldPath.canonicalString()}));
        }
    }

    private Query whereHelper(FieldPath fieldPath, Filter.Operator operator, Object obj) {
        x xVar;
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        Preconditions.checkNotNull(operator, "Provided op must not be null.");
        if (!fieldPath.getInternalPath().isKeyField()) {
            Filter.Operator operator2 = Filter.Operator.IN;
            if (operator == operator2 || operator == Filter.Operator.NOT_IN || operator == Filter.Operator.ARRAY_CONTAINS_ANY) {
                validateDisjunctiveFilterElements(obj, operator);
            }
            xVar = this.firestore.getUserDataReader().parseQueryValue(obj, operator == operator2 || operator == Filter.Operator.NOT_IN);
        } else if (operator == Filter.Operator.ARRAY_CONTAINS || operator == Filter.Operator.ARRAY_CONTAINS_ANY) {
            throw new IllegalArgumentException("Invalid query. You can't perform '" + operator.toString() + "' queries on FieldPath.documentId().");
        } else if (operator == Filter.Operator.IN || operator == Filter.Operator.NOT_IN) {
            validateDisjunctiveFilterElements(obj, operator);
            a.b r10 = t5.a.r();
            for (Object parseDocumentIdValue : (List) obj) {
                r10.f(parseDocumentIdValue(parseDocumentIdValue));
            }
            xVar = (x) x.F().f(r10).build();
        } else {
            xVar = parseDocumentIdValue(obj);
        }
        FieldFilter create = FieldFilter.create(fieldPath.getInternalPath(), operator, xVar);
        validateNewFilter(create);
        return new Query(this.query.filter(create), this.firestore);
    }

    public ListenerRegistration addSnapshotListener(Activity activity, EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(activity, MetadataChanges.EXCLUDE, eventListener);
    }

    public Query endAt(DocumentSnapshot documentSnapshot) {
        return new Query(this.query.endAt(boundFromDocumentSnapshot("endAt", documentSnapshot, false)), this.firestore);
    }

    public Query endBefore(DocumentSnapshot documentSnapshot) {
        return new Query(this.query.endAt(boundFromDocumentSnapshot("endBefore", documentSnapshot, true)), this.firestore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Query query2 = (Query) obj;
        return this.query.equals(query2.query) && this.firestore.equals(query2.firestore);
    }

    public i get() {
        return get(Source.DEFAULT);
    }

    public FirebaseFirestore getFirestore() {
        return this.firestore;
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.firestore.hashCode();
    }

    public Query limit(long j10) {
        if (j10 > 0) {
            return new Query(this.query.limitToFirst(j10), this.firestore);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j10 + ") is invalid. Limit must be positive.");
    }

    public Query limitToLast(long j10) {
        if (j10 > 0) {
            return new Query(this.query.limitToLast(j10), this.firestore);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j10 + ") is invalid. Limit must be positive.");
    }

    public Query orderBy(FieldPath fieldPath) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        return orderBy(fieldPath.getInternalPath(), Direction.ASCENDING);
    }

    public Query startAfter(DocumentSnapshot documentSnapshot) {
        return new Query(this.query.startAt(boundFromDocumentSnapshot("startAfter", documentSnapshot, false)), this.firestore);
    }

    public Query startAt(DocumentSnapshot documentSnapshot) {
        return new Query(this.query.startAt(boundFromDocumentSnapshot("startAt", documentSnapshot, true)), this.firestore);
    }

    public Query whereArrayContains(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.ARRAY_CONTAINS, obj);
    }

    public Query whereArrayContainsAny(FieldPath fieldPath, List<? extends Object> list) {
        return whereHelper(fieldPath, Filter.Operator.ARRAY_CONTAINS_ANY, list);
    }

    public Query whereEqualTo(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.EQUAL, obj);
    }

    public Query whereGreaterThan(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.GREATER_THAN, obj);
    }

    public Query whereGreaterThanOrEqualTo(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.GREATER_THAN_OR_EQUAL, obj);
    }

    public Query whereIn(FieldPath fieldPath, List<? extends Object> list) {
        return whereHelper(fieldPath, Filter.Operator.IN, list);
    }

    public Query whereLessThan(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.LESS_THAN, obj);
    }

    public Query whereLessThanOrEqualTo(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.LESS_THAN_OR_EQUAL, obj);
    }

    public Query whereNotEqualTo(FieldPath fieldPath, Object obj) {
        return whereHelper(fieldPath, Filter.Operator.NOT_EQUAL, obj);
    }

    public Query whereNotIn(FieldPath fieldPath, List<? extends Object> list) {
        return whereHelper(fieldPath, Filter.Operator.NOT_IN, list);
    }

    public ListenerRegistration addSnapshotListener(Activity activity, MetadataChanges metadataChanges, EventListener<QuerySnapshot> eventListener) {
        Preconditions.checkNotNull(activity, "Provided activity must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(Executors.DEFAULT_CALLBACK_EXECUTOR, internalOptions(metadataChanges), activity, eventListener);
    }

    public Query endAt(Object... objArr) {
        return new Query(this.query.endAt(boundFromFields("endAt", objArr, false)), this.firestore);
    }

    public Query endBefore(Object... objArr) {
        return new Query(this.query.endAt(boundFromFields("endBefore", objArr, true)), this.firestore);
    }

    public i get(Source source) {
        validateHasExplicitOrderByForLimitToLast();
        return source == Source.CACHE ? this.firestore.getClient().getDocumentsFromLocalCache(this.query).continueWith(Executors.DIRECT_EXECUTOR, new p(this)) : getViaSnapshotListener(source);
    }

    public Query orderBy(FieldPath fieldPath, Direction direction) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        return orderBy(fieldPath.getInternalPath(), direction);
    }

    public Query startAfter(Object... objArr) {
        return new Query(this.query.startAt(boundFromFields("startAfter", objArr, false)), this.firestore);
    }

    public Query startAt(Object... objArr) {
        return new Query(this.query.startAt(boundFromFields("startAt", objArr, true)), this.firestore);
    }

    public Query whereArrayContains(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.ARRAY_CONTAINS, obj);
    }

    public Query whereArrayContainsAny(String str, List<? extends Object> list) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.ARRAY_CONTAINS_ANY, list);
    }

    public Query whereEqualTo(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.EQUAL, obj);
    }

    public Query whereGreaterThan(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.GREATER_THAN, obj);
    }

    public Query whereGreaterThanOrEqualTo(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.GREATER_THAN_OR_EQUAL, obj);
    }

    public Query whereIn(String str, List<? extends Object> list) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.IN, list);
    }

    public Query whereLessThan(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.LESS_THAN, obj);
    }

    public Query whereLessThanOrEqualTo(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.LESS_THAN_OR_EQUAL, obj);
    }

    public Query whereNotEqualTo(String str, Object obj) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.NOT_EQUAL, obj);
    }

    public Query whereNotIn(String str, List<? extends Object> list) {
        return whereHelper(FieldPath.fromDotSeparatedPath(str), Filter.Operator.NOT_IN, list);
    }

    private Query orderBy(FieldPath fieldPath, Direction direction) {
        Preconditions.checkNotNull(direction, "Provided direction must not be null.");
        if (this.query.getStartAt() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        } else if (this.query.getEndAt() == null) {
            validateOrderByField(fieldPath);
            return new Query(this.query.orderBy(OrderBy.getInstance(direction == Direction.ASCENDING ? OrderBy.Direction.ASCENDING : OrderBy.Direction.DESCENDING, fieldPath)), this.firestore);
        } else {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
    }

    public ListenerRegistration addSnapshotListener(EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(MetadataChanges.EXCLUDE, eventListener);
    }

    public ListenerRegistration addSnapshotListener(MetadataChanges metadataChanges, EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(Executors.DEFAULT_CALLBACK_EXECUTOR, metadataChanges, eventListener);
    }

    public Query orderBy(String str) {
        return orderBy(FieldPath.fromDotSeparatedPath(str), Direction.ASCENDING);
    }

    public ListenerRegistration addSnapshotListener(Executor executor, EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(executor, MetadataChanges.EXCLUDE, eventListener);
    }

    public Query orderBy(String str, Direction direction) {
        return orderBy(FieldPath.fromDotSeparatedPath(str), direction);
    }

    public ListenerRegistration addSnapshotListener(Executor executor, MetadataChanges metadataChanges, EventListener<QuerySnapshot> eventListener) {
        Preconditions.checkNotNull(executor, "Provided executor must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(executor, internalOptions(metadataChanges), (Activity) null, eventListener);
    }
}
