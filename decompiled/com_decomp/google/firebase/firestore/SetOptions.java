package com.google.firebase.firestore;

import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Preconditions;
import java.util.HashSet;
import java.util.List;

public final class SetOptions {
    private static final SetOptions MERGE_ALL_FIELDS = new SetOptions(true, (FieldMask) null);
    static final SetOptions OVERWRITE = new SetOptions(false, (FieldMask) null);
    private final FieldMask fieldMask;
    private final boolean merge;

    private SetOptions(boolean z10, FieldMask fieldMask2) {
        Preconditions.checkArgument(fieldMask2 == null || z10, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.merge = z10;
        this.fieldMask = fieldMask2;
    }

    public static SetOptions merge() {
        return MERGE_ALL_FIELDS;
    }

    public static SetOptions mergeFieldPaths(List<FieldPath> list) {
        HashSet hashSet = new HashSet();
        for (FieldPath internalPath : list) {
            hashSet.add(internalPath.getInternalPath());
        }
        return new SetOptions(true, FieldMask.fromSet(hashSet));
    }

    public static SetOptions mergeFields(List<String> list) {
        HashSet hashSet = new HashSet();
        for (String fromDotSeparatedPath : list) {
            hashSet.add(FieldPath.fromDotSeparatedPath(fromDotSeparatedPath).getInternalPath());
        }
        return new SetOptions(true, FieldMask.fromSet(hashSet));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetOptions.class != obj.getClass()) {
            return false;
        }
        SetOptions setOptions = (SetOptions) obj;
        if (this.merge != setOptions.merge) {
            return false;
        }
        FieldMask fieldMask2 = this.fieldMask;
        FieldMask fieldMask3 = setOptions.fieldMask;
        return fieldMask2 != null ? fieldMask2.equals(fieldMask3) : fieldMask3 == null;
    }

    public FieldMask getFieldMask() {
        return this.fieldMask;
    }

    public int hashCode() {
        int i10 = (this.merge ? 1 : 0) * true;
        FieldMask fieldMask2 = this.fieldMask;
        return i10 + (fieldMask2 != null ? fieldMask2.hashCode() : 0);
    }

    /* access modifiers changed from: package-private */
    public boolean isMerge() {
        return this.merge;
    }

    public static SetOptions mergeFields(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String fromDotSeparatedPath : strArr) {
            hashSet.add(FieldPath.fromDotSeparatedPath(fromDotSeparatedPath).getInternalPath());
        }
        return new SetOptions(true, FieldMask.fromSet(hashSet));
    }
}
