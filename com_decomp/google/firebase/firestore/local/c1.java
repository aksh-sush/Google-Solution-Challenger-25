package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

public final /* synthetic */ class c1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Util.compareIntegers(((MutationBatch) obj).getBatchId(), ((MutationBatch) obj2).getBatchId());
    }
}
