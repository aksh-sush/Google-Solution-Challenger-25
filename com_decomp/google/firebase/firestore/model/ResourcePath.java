package com.google.firebase.firestore.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ResourcePath extends BasePath<ResourcePath> {
    public static final ResourcePath EMPTY = new ResourcePath(Collections.emptyList());

    private ResourcePath(List<String> list) {
        super(list);
    }

    public static ResourcePath fromSegments(List<String> list) {
        return list.isEmpty() ? EMPTY : new ResourcePath(list);
    }

    public static ResourcePath fromString(String str) {
        if (!str.contains("//")) {
            String[] split = str.split("/");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new ResourcePath(arrayList);
        }
        throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
    }

    public String canonicalString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.segments.size(); i10++) {
            if (i10 > 0) {
                sb2.append("/");
            }
            sb2.append(this.segments.get(i10));
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public ResourcePath createPathWithSegments(List<String> list) {
        return new ResourcePath(list);
    }
}
