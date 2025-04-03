package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

class c {

    /* renamed from: c  reason: collision with root package name */
    static final Comparator f7953c = new a();

    /* renamed from: d  reason: collision with root package name */
    static final Comparator f7954d = new b();

    /* renamed from: a  reason: collision with root package name */
    private final DocumentKey f7955a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7956b;

    public c(DocumentKey documentKey, int i10) {
        this.f7955a = documentKey;
        this.f7956b = i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int e(c cVar, c cVar2) {
        int compareTo = cVar.f7955a.compareTo(cVar2.f7955a);
        return compareTo != 0 ? compareTo : Util.compareIntegers(cVar.f7956b, cVar2.f7956b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int f(c cVar, c cVar2) {
        int compareIntegers = Util.compareIntegers(cVar.f7956b, cVar2.f7956b);
        return compareIntegers != 0 ? compareIntegers : cVar.f7955a.compareTo(cVar2.f7955a);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f7956b;
    }

    /* access modifiers changed from: package-private */
    public DocumentKey d() {
        return this.f7955a;
    }
}
