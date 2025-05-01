package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class g1 implements Function {
    public final Object apply(Object obj) {
        return Long.valueOf(((Cursor) obj).getLong(0));
    }
}
