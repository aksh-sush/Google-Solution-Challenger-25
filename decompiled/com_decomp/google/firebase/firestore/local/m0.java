package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;

public final /* synthetic */ class m0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f8050a;

    public /* synthetic */ m0(ArrayList arrayList) {
        this.f8050a = arrayList;
    }

    public final void accept(Object obj) {
        this.f8050a.add(d.b(((Cursor) obj).getString(0)));
    }
}
