package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;

public class BundledQuery implements BundleElement {
    private final Query.LimitType limitType;
    private final Target target;

    public BundledQuery(Target target2, Query.LimitType limitType2) {
        this.target = target2;
        this.limitType = limitType2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundledQuery bundledQuery = (BundledQuery) obj;
        return this.target.equals(bundledQuery.target) && this.limitType == bundledQuery.limitType;
    }

    public Query.LimitType getLimitType() {
        return this.limitType;
    }

    public Target getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (this.target.hashCode() * 31) + this.limitType.hashCode();
    }
}
