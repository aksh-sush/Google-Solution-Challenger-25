package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class g2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i2 f8005a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f8006b;

    public /* synthetic */ g2(i2 i2Var, Consumer consumer) {
        this.f8005a = i2Var;
        this.f8006b = consumer;
    }

    public final void accept(Object obj) {
        this.f8005a.r(this.f8006b, (Cursor) obj);
    }
}
