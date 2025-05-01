package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.local.i2;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class h2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i2.b f8012a;

    public /* synthetic */ h2(i2.b bVar) {
        this.f8012a = bVar;
    }

    public final void accept(Object obj) {
        this.f8012a.f8023a = this.f8012a.f8023a.insert(DocumentKey.fromPath(d.b(((Cursor) obj).getString(0))));
    }
}
