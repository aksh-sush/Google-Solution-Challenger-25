package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class s0 implements Function {
    public final Object apply(Object obj) {
        return Integer.valueOf(((Cursor) obj).getInt(0));
    }
}
