package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class q0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0 f8067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int[] f8068b;

    public /* synthetic */ q0(r0 r0Var, int[] iArr) {
        this.f8067a = r0Var;
        this.f8068b = iArr;
    }

    public final void accept(Object obj) {
        this.f8067a.p(this.f8068b, (Cursor) obj);
    }
}
