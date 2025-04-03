package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import java.util.List;

public final class Target {
    public static final long NO_LIMIT = -1;
    private final String collectionGroup;
    private final Bound endAt;
    private final List<Filter> filters;
    private final long limit;
    private String memoizedCannonicalId;
    private final List<OrderBy> orderBy;
    private final ResourcePath path;
    private final Bound startAt;

    public Target(ResourcePath resourcePath, String str, List<Filter> list, List<OrderBy> list2, long j10, Bound bound, Bound bound2) {
        this.path = resourcePath;
        this.collectionGroup = str;
        this.orderBy = list2;
        this.filters = list;
        this.limit = j10;
        this.startAt = bound;
        this.endAt = bound2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Target.class != obj.getClass()) {
            return false;
        }
        Target target = (Target) obj;
        String str = this.collectionGroup;
        if (str == null ? target.collectionGroup != null : !str.equals(target.collectionGroup)) {
            return false;
        }
        if (this.limit != target.limit || !this.orderBy.equals(target.orderBy) || !this.filters.equals(target.filters) || !this.path.equals(target.path)) {
            return false;
        }
        Bound bound = this.startAt;
        if (bound == null ? target.startAt != null : !bound.equals(target.startAt)) {
            return false;
        }
        Bound bound2 = this.endAt;
        Bound bound3 = target.endAt;
        return bound2 != null ? bound2.equals(bound3) : bound3 == null;
    }

    public String getCanonicalId() {
        String str = this.memoizedCannonicalId;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPath().canonicalString());
        if (this.collectionGroup != null) {
            sb2.append("|cg:");
            sb2.append(this.collectionGroup);
        }
        sb2.append("|f:");
        for (Filter canonicalId : getFilters()) {
            sb2.append(canonicalId.getCanonicalId());
        }
        sb2.append("|ob:");
        for (OrderBy next : getOrderBy()) {
            sb2.append(next.getField().canonicalString());
            sb2.append(next.getDirection().equals(OrderBy.Direction.ASCENDING) ? "asc" : "desc");
        }
        if (hasLimit()) {
            sb2.append("|l:");
            sb2.append(getLimit());
        }
        if (this.startAt != null) {
            sb2.append("|lb:");
            sb2.append(this.startAt.canonicalString());
        }
        if (this.endAt != null) {
            sb2.append("|ub:");
            sb2.append(this.endAt.canonicalString());
        }
        String sb3 = sb2.toString();
        this.memoizedCannonicalId = sb3;
        return sb3;
    }

    public String getCollectionGroup() {
        return this.collectionGroup;
    }

    public Bound getEndAt() {
        return this.endAt;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public long getLimit() {
        return this.limit;
    }

    public List<OrderBy> getOrderBy() {
        return this.orderBy;
    }

    public ResourcePath getPath() {
        return this.path;
    }

    public Bound getStartAt() {
        return this.startAt;
    }

    public boolean hasLimit() {
        return this.limit != -1;
    }

    public int hashCode() {
        int hashCode = this.orderBy.hashCode() * 31;
        String str = this.collectionGroup;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.limit;
        int hashCode3 = (((((((hashCode + hashCode2) * 31) + this.filters.hashCode()) * 31) + this.path.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Bound bound = this.startAt;
        int hashCode4 = (hashCode3 + (bound != null ? bound.hashCode() : 0)) * 31;
        Bound bound2 = this.endAt;
        if (bound2 != null) {
            i10 = bound2.hashCode();
        }
        return hashCode4 + i10;
    }

    public boolean isDocumentQuery() {
        return DocumentKey.isDocumentKey(this.path) && this.collectionGroup == null && this.filters.isEmpty();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Query(");
        sb2.append(this.path.canonicalString());
        if (this.collectionGroup != null) {
            sb2.append(" collectionGroup=");
            sb2.append(this.collectionGroup);
        }
        if (!this.filters.isEmpty()) {
            sb2.append(" where ");
            for (int i10 = 0; i10 < this.filters.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(" and ");
                }
                sb2.append(this.filters.get(i10).toString());
            }
        }
        if (!this.orderBy.isEmpty()) {
            sb2.append(" order by ");
            for (int i11 = 0; i11 < this.orderBy.size(); i11++) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.orderBy.get(i11));
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
