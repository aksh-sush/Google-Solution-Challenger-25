package com.google.firebase.firestore.core;

import java.util.Comparator;

public final /* synthetic */ class c0 implements Comparator {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f7854e;

    public /* synthetic */ c0(View view) {
        this.f7854e = view;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f7854e.lambda$applyChanges$0((DocumentViewChange) obj, (DocumentViewChange) obj2);
    }
}
