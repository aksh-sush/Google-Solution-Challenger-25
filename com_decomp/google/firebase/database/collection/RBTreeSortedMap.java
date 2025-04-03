package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {
    private Comparator<K> comparator;
    private LLRBNode<K, V> root;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f7791a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f7792b;

        /* renamed from: c  reason: collision with root package name */
        private final ImmutableSortedMap.Builder.KeyTranslator f7793c;

        /* renamed from: d  reason: collision with root package name */
        private LLRBValueNode f7794d;

        /* renamed from: e  reason: collision with root package name */
        private LLRBValueNode f7795e;

        static class a implements Iterable {
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public long f7796e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public final int f7797f;

            /* renamed from: com.google.firebase.database.collection.RBTreeSortedMap$b$a$a  reason: collision with other inner class name */
            class C0102a implements Iterator {

                /* renamed from: e  reason: collision with root package name */
                private int f7798e;

                C0102a() {
                    this.f7798e = a.this.f7797f - 1;
                }

                /* renamed from: b */
                public C0103b next() {
                    C0103b bVar = new C0103b();
                    bVar.f7800a = (a.this.f7796e & ((long) (1 << this.f7798e))) == 0;
                    bVar.f7801b = (int) Math.pow(2.0d, (double) this.f7798e);
                    this.f7798e--;
                    return bVar;
                }

                public boolean hasNext() {
                    return this.f7798e >= 0;
                }

                public void remove() {
                }
            }

            public a(int i10) {
                int i11 = i10 + 1;
                int floor = (int) Math.floor(Math.log((double) i11) / Math.log(2.0d));
                this.f7797f = floor;
                this.f7796e = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i11);
            }

            public Iterator iterator() {
                return new C0102a();
            }
        }

        /* renamed from: com.google.firebase.database.collection.RBTreeSortedMap$b$b  reason: collision with other inner class name */
        static class C0103b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f7800a;

            /* renamed from: b  reason: collision with root package name */
            public int f7801b;

            C0103b() {
            }
        }

        private b(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keyTranslator) {
            this.f7791a = list;
            this.f7792b = map;
            this.f7793c = keyTranslator;
        }

        private LLRBNode a(int i10, int i11) {
            if (i11 == 0) {
                return LLRBEmptyNode.getInstance();
            }
            if (i11 == 1) {
                Object obj = this.f7791a.get(i10);
                return new LLRBBlackValueNode(obj, d(obj), (LLRBNode) null, (LLRBNode) null);
            }
            int i12 = i11 / 2;
            int i13 = i10 + i12;
            LLRBNode a10 = a(i10, i12);
            LLRBNode a11 = a(i13 + 1, i12);
            Object obj2 = this.f7791a.get(i13);
            return new LLRBBlackValueNode(obj2, d(obj2), a10, a11);
        }

        public static RBTreeSortedMap b(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keyTranslator, Comparator comparator) {
            b bVar = new b(list, map, keyTranslator);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0103b bVar2 = (C0103b) it.next();
                int i10 = bVar2.f7801b;
                size -= i10;
                if (bVar2.f7800a) {
                    bVar.c(LLRBNode.Color.BLACK, i10, size);
                } else {
                    bVar.c(LLRBNode.Color.BLACK, i10, size);
                    int i11 = bVar2.f7801b;
                    size -= i11;
                    bVar.c(LLRBNode.Color.RED, i11, size);
                }
            }
            LLRBNode lLRBNode = bVar.f7794d;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.getInstance();
            }
            return new RBTreeSortedMap(lLRBNode, comparator);
        }

        private void c(LLRBNode.Color color, int i10, int i11) {
            LLRBNode a10 = a(i11 + 1, i10 - 1);
            Object obj = this.f7791a.get(i11);
            LLRBValueNode lLRBRedValueNode = color == LLRBNode.Color.RED ? new LLRBRedValueNode(obj, d(obj), (LLRBNode) null, a10) : new LLRBBlackValueNode(obj, d(obj), (LLRBNode) null, a10);
            if (this.f7794d == null) {
                this.f7794d = lLRBRedValueNode;
            } else {
                this.f7795e.setLeft(lLRBRedValueNode);
            }
            this.f7795e = lLRBRedValueNode;
        }

        private Object d(Object obj) {
            return this.f7792b.get(this.f7793c.translate(obj));
        }
    }

    private RBTreeSortedMap(LLRBNode<K, V> lLRBNode, Comparator<K> comparator2) {
        this.root = lLRBNode;
        this.comparator = comparator2;
    }

    public static <A, B, C> RBTreeSortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator2) {
        return b.b(list, map, keyTranslator, comparator2);
    }

    public static <A, B> RBTreeSortedMap<A, B> fromMap(Map<A, B> map, Comparator<A> comparator2) {
        return b.b(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator2);
    }

    private LLRBNode<K, V> getNode(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else if (compare == 0) {
                return lLRBNode;
            } else {
                lLRBNode = lLRBNode.getRight();
            }
        }
        return null;
    }

    public boolean containsKey(K k10) {
        return getNode(k10) != null;
    }

    public V get(K k10) {
        LLRBNode node = getNode(k10);
        if (node != null) {
            return node.getValue();
        }
        return null;
    }

    public Comparator<K> getComparator() {
        return this.comparator;
    }

    public K getMaxKey() {
        return this.root.getMax().getKey();
    }

    public K getMinKey() {
        return this.root.getMin().getKey();
    }

    public K getPredecessorKey(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare == 0) {
                if (!lLRBNode.getLeft().isEmpty()) {
                    LLRBNode<K, V> left = lLRBNode.getLeft();
                    while (!left.getRight().isEmpty()) {
                        left = left.getRight();
                    }
                    return left.getKey();
                } else if (lLRBNode2 != null) {
                    return lLRBNode2.getKey();
                } else {
                    return null;
                }
            } else if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getRight();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + k10);
    }

    /* access modifiers changed from: package-private */
    public LLRBNode<K, V> getRoot() {
        return this.root;
    }

    public K getSuccessorKey(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(lLRBNode.getKey(), k10);
            if (compare == 0) {
                if (!lLRBNode.getRight().isEmpty()) {
                    LLRBNode<K, V> right = lLRBNode.getRight();
                    while (!right.getLeft().isEmpty()) {
                        right = right.getLeft();
                    }
                    return right.getKey();
                } else if (lLRBNode2 != null) {
                    return lLRBNode2.getKey();
                } else {
                    return null;
                }
            } else if (compare < 0) {
                lLRBNode = lLRBNode.getRight();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getLeft();
            }
        }
        throw new IllegalArgumentException("Couldn't find successor key of non-present key: " + k10);
    }

    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.root.inOrderTraversal(nodeVisitor);
    }

    public int indexOf(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        int i10 = 0;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare == 0) {
                return i10 + lLRBNode.getLeft().size();
            }
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                i10 += lLRBNode.getLeft().size() + 1;
                lLRBNode = lLRBNode.getRight();
            }
        }
        return -1;
    }

    public ImmutableSortedMap<K, V> insert(K k10, V v10) {
        return new RBTreeSortedMap(this.root.insert(k10, v10, this.comparator).copy(null, null, LLRBNode.Color.BLACK, (LLRBNode) null, (LLRBNode) null), this.comparator);
    }

    public boolean isEmpty() {
        return this.root.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new ImmutableSortedMapIterator(this.root, null, this.comparator, false);
    }

    public Iterator<Map.Entry<K, V>> iteratorFrom(K k10) {
        return new ImmutableSortedMapIterator(this.root, k10, this.comparator, false);
    }

    public ImmutableSortedMap<K, V> remove(K k10) {
        return !containsKey(k10) ? this : new RBTreeSortedMap(this.root.remove(k10, this.comparator).copy(null, null, LLRBNode.Color.BLACK, (LLRBNode) null, (LLRBNode) null), this.comparator);
    }

    public Iterator<Map.Entry<K, V>> reverseIterator() {
        return new ImmutableSortedMapIterator(this.root, null, this.comparator, true);
    }

    public Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k10) {
        return new ImmutableSortedMapIterator(this.root, k10, this.comparator, true);
    }

    public int size() {
        return this.root.size();
    }

    RBTreeSortedMap(Comparator<K> comparator2) {
        this.root = LLRBEmptyNode.getInstance();
        this.comparator = comparator2;
    }
}
