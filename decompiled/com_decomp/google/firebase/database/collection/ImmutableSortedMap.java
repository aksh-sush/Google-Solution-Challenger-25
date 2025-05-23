package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    public static class Builder {
        static final int ARRAY_TO_RB_TREE_SIZE_THRESHOLD = 25;
        private static final KeyTranslator IDENTITY_TRANSLATOR = new a();

        public interface KeyTranslator<C, D> {
            D translate(C c10);
        }

        public static <A, B, C> ImmutableSortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            return list.size() < 25 ? ArraySortedMap.buildFrom(list, map, keyTranslator, comparator) : RBTreeSortedMap.buildFrom(list, map, keyTranslator, comparator);
        }

        public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<K> comparator) {
            return new ArraySortedMap(comparator);
        }

        public static <A, B> ImmutableSortedMap<A, B> fromMap(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? ArraySortedMap.fromMap(map, comparator) : RBTreeSortedMap.fromMap(map, comparator);
        }

        public static <A> KeyTranslator<A, A> identityTranslator() {
            return IDENTITY_TRANSLATOR;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Object lambda$static$0(Object obj) {
            return obj;
        }
    }

    public abstract boolean containsKey(K k10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        if (!getComparator().equals(immutableSortedMap.getComparator()) || size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = immutableSortedMap.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract V get(K k10);

    public abstract Comparator<K> getComparator();

    public abstract K getMaxKey();

    public abstract K getMinKey();

    public abstract K getPredecessorKey(K k10);

    public abstract K getSuccessorKey(K k10);

    public int hashCode() {
        int hashCode = getComparator().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor);

    public abstract int indexOf(K k10);

    public abstract ImmutableSortedMap<K, V> insert(K k10, V v10);

    public abstract boolean isEmpty();

    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract Iterator<Map.Entry<K, V>> iteratorFrom(K k10);

    public abstract ImmutableSortedMap<K, V> remove(K k10);

    public abstract Iterator<Map.Entry<K, V>> reverseIterator();

    public abstract Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k10);

    public abstract int size();

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        Iterator it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(entry.getKey());
            sb2.append("=>");
            sb2.append(entry.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }
}
