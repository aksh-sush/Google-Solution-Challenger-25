package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePath<B extends BasePath<B>> implements Comparable<B> {
    final List<String> segments;

    BasePath(List<String> list) {
        this.segments = list;
    }

    public B append(B b10) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.addAll(b10.segments);
        return createPathWithSegments(arrayList);
    }

    public abstract String canonicalString();

    public int compareTo(B b10) {
        int length = length();
        int length2 = b10.length();
        int i10 = 0;
        while (i10 < length && i10 < length2) {
            int compareTo = getSegment(i10).compareTo(b10.getSegment(i10));
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
        }
        return Util.compareIntegers(length, length2);
    }

    /* access modifiers changed from: package-private */
    public abstract B createPathWithSegments(List<String> list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    public String getFirstSegment() {
        return this.segments.get(0);
    }

    public String getLastSegment() {
        return this.segments.get(length() - 1);
    }

    public String getSegment(int i10) {
        return this.segments.get(i10);
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.segments.hashCode();
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public boolean isImmediateParentOf(B b10) {
        if (length() + 1 != b10.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (!getSegment(i10).equals(b10.getSegment(i10))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrefixOf(B b10) {
        if (length() > b10.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (!getSegment(i10).equals(b10.getSegment(i10))) {
                return false;
            }
        }
        return true;
    }

    public B keepFirst(int i10) {
        return createPathWithSegments(this.segments.subList(0, i10));
    }

    public int length() {
        return this.segments.size();
    }

    public B popFirst() {
        return popFirst(1);
    }

    public B popLast() {
        return createPathWithSegments(this.segments.subList(0, length() - 1));
    }

    public String toString() {
        return canonicalString();
    }

    public B append(String str) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.add(str);
        return createPathWithSegments(arrayList);
    }

    public B popFirst(int i10) {
        int length = length();
        Assert.hardAssert(length >= i10, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i10), Integer.valueOf(length));
        return createPathWithSegments(this.segments.subList(i10, length));
    }
}
