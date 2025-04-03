package com.google.firebase.firestore;

import com.google.firebase.firestore.util.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class FieldPath {
    private static final FieldPath DOCUMENT_ID_INSTANCE = new FieldPath(com.google.firebase.firestore.model.FieldPath.KEY_PATH);
    private static final Pattern RESERVED = Pattern.compile("[~*/\\[\\]]");
    private final com.google.firebase.firestore.model.FieldPath internalPath;

    private FieldPath(com.google.firebase.firestore.model.FieldPath fieldPath) {
        this.internalPath = fieldPath;
    }

    public static FieldPath documentId() {
        return DOCUMENT_ID_INSTANCE;
    }

    static FieldPath fromDotSeparatedPath(String str) {
        Preconditions.checkNotNull(str, "Provided field path must not be null.");
        Preconditions.checkArgument(!RESERVED.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return of(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static FieldPath of(String... strArr) {
        Preconditions.checkArgument(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            boolean z10 = str != null && !str.isEmpty();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid field name at argument ");
            i10++;
            sb2.append(i10);
            sb2.append(". Field names must not be null or empty.");
            Preconditions.checkArgument(z10, sb2.toString(), new Object[0]);
        }
        return new FieldPath((List<String>) Arrays.asList(strArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldPath.class != obj.getClass()) {
            return false;
        }
        return this.internalPath.equals(((FieldPath) obj).internalPath);
    }

    /* access modifiers changed from: package-private */
    public com.google.firebase.firestore.model.FieldPath getInternalPath() {
        return this.internalPath;
    }

    public int hashCode() {
        return this.internalPath.hashCode();
    }

    public String toString() {
        return this.internalPath.toString();
    }

    private FieldPath(List<String> list) {
        this.internalPath = com.google.firebase.firestore.model.FieldPath.fromSegments(list);
    }
}
