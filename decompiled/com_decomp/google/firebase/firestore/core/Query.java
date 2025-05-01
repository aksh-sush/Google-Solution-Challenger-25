package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class Query {
    private static final OrderBy KEY_ORDERING_ASC;
    private static final OrderBy KEY_ORDERING_DESC;
    private final String collectionGroup;
    private final Bound endAt;
    private final List<OrderBy> explicitSortOrder;
    private final List<Filter> filters;
    private final long limit;
    private final LimitType limitType;
    private List<OrderBy> memoizedOrderBy;
    private Target memoizedTarget;
    private final ResourcePath path;
    private final Bound startAt;

    public enum LimitType {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    private static class a implements Comparator {

        /* renamed from: e  reason: collision with root package name */
        private final List f7840e;

        a(List list) {
            boolean z10;
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    OrderBy orderBy = (OrderBy) it.next();
                    if (z10 || orderBy.getField().equals(FieldPath.KEY_PATH)) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f7840e = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }

        /* renamed from: a */
        public int compare(Document document, Document document2) {
            for (OrderBy compare : this.f7840e) {
                int compare2 = compare.compare(document, document2);
                if (compare2 != 0) {
                    return compare2;
                }
            }
            return 0;
        }
    }

    static {
        OrderBy.Direction direction = OrderBy.Direction.ASCENDING;
        FieldPath fieldPath = FieldPath.KEY_PATH;
        KEY_ORDERING_ASC = OrderBy.getInstance(direction, fieldPath);
        KEY_ORDERING_DESC = OrderBy.getInstance(OrderBy.Direction.DESCENDING, fieldPath);
    }

    public Query(ResourcePath resourcePath, String str) {
        this(resourcePath, str, Collections.emptyList(), Collections.emptyList(), -1, LimitType.LIMIT_TO_FIRST, (Bound) null, (Bound) null);
    }

    public static Query atPath(ResourcePath resourcePath) {
        return new Query(resourcePath, (String) null);
    }

    private boolean matchesBounds(Document document) {
        Bound bound = this.startAt;
        if (bound != null && !bound.sortsBeforeDocument(getOrderBy(), document)) {
            return false;
        }
        Bound bound2 = this.endAt;
        return bound2 == null || !bound2.sortsBeforeDocument(getOrderBy(), document);
    }

    private boolean matchesFilters(Document document) {
        for (Filter matches : this.filters) {
            if (!matches.matches(document)) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesOrderBy(Document document) {
        for (OrderBy next : this.explicitSortOrder) {
            if (!next.getField().equals(FieldPath.KEY_PATH) && document.getField(next.field) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesPathAndCollectionGroup(Document document) {
        ResourcePath path2 = document.getKey().getPath();
        return this.collectionGroup != null ? document.getKey().hasCollectionId(this.collectionGroup) && this.path.isPrefixOf(path2) : DocumentKey.isDocumentKey(this.path) ? this.path.equals(path2) : this.path.isPrefixOf(path2) && this.path.length() == path2.length() - 1;
    }

    public Query asCollectionQueryAtPath(ResourcePath resourcePath) {
        return new Query(resourcePath, (String) null, this.filters, this.explicitSortOrder, this.limit, this.limitType, this.startAt, this.endAt);
    }

    public Comparator<Document> comparator() {
        return new a(getOrderBy());
    }

    public Query endAt(Bound bound) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, this.limit, this.limitType, this.startAt, bound);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        Query query = (Query) obj;
        if (this.limitType != query.limitType) {
            return false;
        }
        return toTarget().equals(query.toTarget());
    }

    public Query filter(Filter filter) {
        boolean z10 = true;
        Assert.hardAssert(!isDocumentQuery(), "No filter is allowed for document query", new Object[0]);
        FieldPath field = (!(filter instanceof FieldFilter) || !((FieldFilter) filter).isInequality()) ? null : filter.getField();
        FieldPath inequalityField = inequalityField();
        Assert.hardAssert(inequalityField == null || field == null || inequalityField.equals(field), "Query must only have one inequality field", new Object[0]);
        if (!this.explicitSortOrder.isEmpty() && field != null && !this.explicitSortOrder.get(0).field.equals(field)) {
            z10 = false;
        }
        Assert.hardAssert(z10, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.filters);
        arrayList.add(filter);
        return new Query(this.path, this.collectionGroup, arrayList, this.explicitSortOrder, this.limit, this.limitType, this.startAt, this.endAt);
    }

    public Filter.Operator findFilterOperator(List<Filter.Operator> list) {
        for (Filter next : this.filters) {
            if (next instanceof FieldFilter) {
                Filter.Operator operator = ((FieldFilter) next).getOperator();
                if (list.contains(operator)) {
                    return operator;
                }
            }
        }
        return null;
    }

    public String getCanonicalId() {
        return toTarget().getCanonicalId() + "|lt:" + this.limitType;
    }

    public String getCollectionGroup() {
        return this.collectionGroup;
    }

    public Bound getEndAt() {
        return this.endAt;
    }

    public List<OrderBy> getExplicitOrderBy() {
        return this.explicitSortOrder;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public FieldPath getFirstOrderByField() {
        if (this.explicitSortOrder.isEmpty()) {
            return null;
        }
        return this.explicitSortOrder.get(0).getField();
    }

    public long getLimitToFirst() {
        Assert.hardAssert(hasLimitToFirst(), "Called getLimitToFirst when no limit was set", new Object[0]);
        return this.limit;
    }

    public long getLimitToLast() {
        Assert.hardAssert(hasLimitToLast(), "Called getLimitToLast when no limit was set", new Object[0]);
        return this.limit;
    }

    public LimitType getLimitType() {
        Assert.hardAssert(hasLimitToLast() || hasLimitToFirst(), "Called getLimitType when no limit was set", new Object[0]);
        return this.limitType;
    }

    public List<OrderBy> getOrderBy() {
        List<OrderBy> arrayList;
        OrderBy.Direction direction;
        if (this.memoizedOrderBy == null) {
            FieldPath inequalityField = inequalityField();
            FieldPath firstOrderByField = getFirstOrderByField();
            boolean z10 = false;
            if (inequalityField == null || firstOrderByField != null) {
                arrayList = new ArrayList<>();
                for (OrderBy next : this.explicitSortOrder) {
                    arrayList.add(next);
                    if (next.getField().equals(FieldPath.KEY_PATH)) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    if (this.explicitSortOrder.size() > 0) {
                        List<OrderBy> list = this.explicitSortOrder;
                        direction = list.get(list.size() - 1).getDirection();
                    } else {
                        direction = OrderBy.Direction.ASCENDING;
                    }
                    arrayList.add(direction.equals(OrderBy.Direction.ASCENDING) ? KEY_ORDERING_ASC : KEY_ORDERING_DESC);
                }
            } else {
                arrayList = inequalityField.isKeyField() ? Collections.singletonList(KEY_ORDERING_ASC) : Arrays.asList(new OrderBy[]{OrderBy.getInstance(OrderBy.Direction.ASCENDING, inequalityField), KEY_ORDERING_ASC});
            }
            this.memoizedOrderBy = arrayList;
        }
        return this.memoizedOrderBy;
    }

    public ResourcePath getPath() {
        return this.path;
    }

    public Bound getStartAt() {
        return this.startAt;
    }

    public boolean hasLimitToFirst() {
        return this.limitType == LimitType.LIMIT_TO_FIRST && this.limit != -1;
    }

    public boolean hasLimitToLast() {
        return this.limitType == LimitType.LIMIT_TO_LAST && this.limit != -1;
    }

    public int hashCode() {
        return (toTarget().hashCode() * 31) + this.limitType.hashCode();
    }

    public FieldPath inequalityField() {
        for (Filter next : this.filters) {
            if (next instanceof FieldFilter) {
                FieldFilter fieldFilter = (FieldFilter) next;
                if (fieldFilter.isInequality()) {
                    return fieldFilter.getField();
                }
            }
        }
        return null;
    }

    public boolean isCollectionGroupQuery() {
        return this.collectionGroup != null;
    }

    public boolean isDocumentQuery() {
        return DocumentKey.isDocumentKey(this.path) && this.collectionGroup == null && this.filters.isEmpty();
    }

    public Query limitToFirst(long j10) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, j10, LimitType.LIMIT_TO_FIRST, this.startAt, this.endAt);
    }

    public Query limitToLast(long j10) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, j10, LimitType.LIMIT_TO_LAST, this.startAt, this.endAt);
    }

    public boolean matches(Document document) {
        return document.isFoundDocument() && matchesPathAndCollectionGroup(document) && matchesOrderBy(document) && matchesFilters(document) && matchesBounds(document);
    }

    public boolean matchesAllDocuments() {
        if (this.filters.isEmpty() && this.limit == -1 && this.startAt == null && this.endAt == null) {
            if (!getExplicitOrderBy().isEmpty()) {
                return getExplicitOrderBy().size() == 1 && getFirstOrderByField().isKeyField();
            }
            return true;
        }
    }

    public Query orderBy(OrderBy orderBy) {
        FieldPath inequalityField;
        Assert.hardAssert(!isDocumentQuery(), "No ordering is allowed for document query", new Object[0]);
        if (!this.explicitSortOrder.isEmpty() || (inequalityField = inequalityField()) == null || inequalityField.equals(orderBy.field)) {
            ArrayList arrayList = new ArrayList(this.explicitSortOrder);
            arrayList.add(orderBy);
            return new Query(this.path, this.collectionGroup, this.filters, arrayList, this.limit, this.limitType, this.startAt, this.endAt);
        }
        throw Assert.fail("First orderBy must match inequality field", new Object[0]);
    }

    public Query startAt(Bound bound) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, this.limit, this.limitType, bound, this.endAt);
    }

    public String toString() {
        return "Query(target=" + toTarget().toString() + ";limitType=" + this.limitType.toString() + ")";
    }

    public Target toTarget() {
        if (this.memoizedTarget == null) {
            if (this.limitType == LimitType.LIMIT_TO_FIRST) {
                this.memoizedTarget = new Target(getPath(), getCollectionGroup(), getFilters(), getOrderBy(), this.limit, getStartAt(), getEndAt());
            } else {
                ArrayList arrayList = new ArrayList();
                for (OrderBy next : getOrderBy()) {
                    OrderBy.Direction direction = next.getDirection();
                    OrderBy.Direction direction2 = OrderBy.Direction.DESCENDING;
                    if (direction == direction2) {
                        direction2 = OrderBy.Direction.ASCENDING;
                    }
                    arrayList.add(OrderBy.getInstance(direction2, next.getField()));
                }
                Bound bound = this.endAt;
                Bound bound2 = null;
                Bound bound3 = bound != null ? new Bound(bound.getPosition(), !this.endAt.isBefore()) : null;
                Bound bound4 = this.startAt;
                if (bound4 != null) {
                    bound2 = new Bound(bound4.getPosition(), !this.startAt.isBefore());
                }
                this.memoizedTarget = new Target(getPath(), getCollectionGroup(), getFilters(), arrayList, this.limit, bound3, bound2);
            }
        }
        return this.memoizedTarget;
    }

    public Query(ResourcePath resourcePath, String str, List<Filter> list, List<OrderBy> list2, long j10, LimitType limitType2, Bound bound, Bound bound2) {
        this.path = resourcePath;
        this.collectionGroup = str;
        this.explicitSortOrder = list2;
        this.filters = list;
        this.limit = j10;
        this.limitType = limitType2;
        this.startAt = bound;
        this.endAt = bound2;
    }
}
