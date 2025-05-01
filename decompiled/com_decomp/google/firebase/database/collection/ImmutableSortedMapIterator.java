package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {
    private final boolean isReverse;
    private final ArrayDeque<LLRBValueNode<K, V>> nodeStack = new ArrayDeque<>();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r6 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r3 = r3.getRight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r6 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ImmutableSortedMapIterator(com.google.firebase.database.collection.LLRBNode<K, V> r3, K r4, java.util.Comparator<K> r5, boolean r6) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.nodeStack = r0
            r2.isReverse = r6
        L_0x000c:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0048
            if (r4 == 0) goto L_0x0024
            java.lang.Object r0 = r3.getKey()
            if (r6 == 0) goto L_0x001f
            int r0 = r5.compare(r4, r0)
            goto L_0x0025
        L_0x001f:
            int r0 = r5.compare(r0, r4)
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 >= 0) goto L_0x0033
            if (r6 == 0) goto L_0x002e
        L_0x0029:
            com.google.firebase.database.collection.LLRBNode r3 = r3.getLeft()
            goto L_0x000c
        L_0x002e:
            com.google.firebase.database.collection.LLRBNode r3 = r3.getRight()
            goto L_0x000c
        L_0x0033:
            if (r0 != 0) goto L_0x003d
            java.util.ArrayDeque<com.google.firebase.database.collection.LLRBValueNode<K, V>> r4 = r2.nodeStack
            com.google.firebase.database.collection.LLRBValueNode r3 = (com.google.firebase.database.collection.LLRBValueNode) r3
            r4.push(r3)
            goto L_0x0048
        L_0x003d:
            java.util.ArrayDeque<com.google.firebase.database.collection.LLRBValueNode<K, V>> r0 = r2.nodeStack
            r1 = r3
            com.google.firebase.database.collection.LLRBValueNode r1 = (com.google.firebase.database.collection.LLRBValueNode) r1
            r0.push(r1)
            if (r6 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.collection.ImmutableSortedMapIterator.<init>(com.google.firebase.database.collection.LLRBNode, java.lang.Object, java.util.Comparator, boolean):void");
    }

    public boolean hasNext() {
        return this.nodeStack.size() > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }

    public Map.Entry<K, V> next() {
        try {
            LLRBValueNode pop = this.nodeStack.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.isReverse) {
                for (LLRBNode left = pop.getLeft(); !left.isEmpty(); left = left.getRight()) {
                    this.nodeStack.push((LLRBValueNode) left);
                }
            } else {
                for (LLRBNode right = pop.getRight(); !right.isEmpty(); right = right.getLeft()) {
                    this.nodeStack.push((LLRBValueNode) right);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }
}
