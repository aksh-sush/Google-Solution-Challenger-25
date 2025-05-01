package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class f2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i2 f7999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SparseArray f8000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int[] f8001c;

    public /* synthetic */ f2(i2 i2Var, SparseArray sparseArray, int[] iArr) {
        this.f7999a = i2Var;
        this.f8000b = sparseArray;
        this.f8001c = iArr;
    }

    public final void accept(Object obj) {
        this.f7999a.u(this.f8000b, this.f8001c, (Cursor) obj);
    }
}
