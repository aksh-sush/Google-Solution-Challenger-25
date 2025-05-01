package com.google.firebase.firestore.model;

import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Comparator f8127e;

    public /* synthetic */ d(Comparator comparator) {
        this.f8127e = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return DocumentSet.lambda$emptySet$0(this.f8127e, (Document) obj, (Document) obj2);
    }
}
