package com.google.firebase.firestore.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FieldPath extends BasePath<FieldPath> {
    public static final FieldPath EMPTY_PATH = new FieldPath(Collections.emptyList());
    public static final FieldPath KEY_PATH = fromSingleSegment(DocumentKey.KEY_FIELD_NAME);

    private FieldPath(List<String> list) {
        super(list);
    }

    public static FieldPath fromSegments(List<String> list) {
        return list.isEmpty() ? EMPTY_PATH : new FieldPath(list);
    }

    public static FieldPath fromServerFormat(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                i10++;
                if (i10 != str.length()) {
                    charAt = str.charAt(i10);
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z10) {
                    String sb3 = sb2.toString();
                    if (!sb3.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder();
                        arrayList.add(sb3);
                        sb2 = sb4;
                        i10++;
                    } else {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                }
            } else if (charAt == '`') {
                z10 = !z10;
                i10++;
            }
            sb2.append(charAt);
            i10++;
        }
        String sb5 = sb2.toString();
        if (!sb5.isEmpty()) {
            arrayList.add(sb5);
            return new FieldPath(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static FieldPath fromSingleSegment(String str) {
        return new FieldPath(Collections.singletonList(str));
    }

    private static boolean isValidIdentifier(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt2 = str.charAt(i10);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    public String canonicalString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.segments.size(); i10++) {
            if (i10 > 0) {
                sb2.append(".");
            }
            String replace = this.segments.get(i10).replace("\\", "\\\\").replace("`", "\\`");
            if (!isValidIdentifier(replace)) {
                replace = '`' + replace + '`';
            }
            sb2.append(replace);
        }
        return sb2.toString();
    }

    public boolean isKeyField() {
        return equals(KEY_PATH);
    }

    /* access modifiers changed from: package-private */
    public FieldPath createPathWithSegments(List<String> list) {
        return new FieldPath(list);
    }
}
