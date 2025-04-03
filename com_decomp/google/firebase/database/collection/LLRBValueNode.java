package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {
    private final K key;
    private LLRBNode<K, V> left;
    private final LLRBNode<K, V> right;
    private final V value;

    LLRBValueNode(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.key = k10;
        this.value = v10;
        this.left = lLRBNode == null ? LLRBEmptyNode.getInstance() : lLRBNode;
        this.right = lLRBNode2 == null ? LLRBEmptyNode.getInstance() : lLRBNode2;
    }

    private LLRBValueNode<K, V> colorFlip() {
        LLRBNode<K, V> lLRBNode = this.left;
        LLRBNode<K, V> copy = lLRBNode.copy(null, null, oppositeColor(lLRBNode), (LLRBNode<K, V>) null, (LLRBNode<K, V>) null);
        LLRBNode<K, V> lLRBNode2 = this.right;
        return copy((Object) null, (Object) null, oppositeColor(this), (LLRBNode) copy, (LLRBNode) lLRBNode2.copy(null, null, oppositeColor(lLRBNode2), (LLRBNode<K, V>) null, (LLRBNode<K, V>) null));
    }

    private LLRBValueNode<K, V> fixUp() {
        LLRBValueNode rotateLeft = (!this.right.isRed() || this.left.isRed()) ? this : rotateLeft();
        if (rotateLeft.left.isRed() && ((LLRBValueNode) rotateLeft.left).left.isRed()) {
            rotateLeft = rotateLeft.rotateRight();
        }
        return (!rotateLeft.left.isRed() || !rotateLeft.right.isRed()) ? rotateLeft : rotateLeft.colorFlip();
    }

    private LLRBValueNode<K, V> moveRedLeft() {
        LLRBValueNode<K, V> colorFlip = colorFlip();
        return colorFlip.getRight().getLeft().isRed() ? colorFlip.copy((K) null, (V) null, (LLRBNode<K, V>) null, ((LLRBValueNode) colorFlip.getRight()).rotateRight()).rotateLeft().colorFlip() : colorFlip;
    }

    private LLRBValueNode<K, V> moveRedRight() {
        LLRBValueNode<K, V> colorFlip = colorFlip();
        return colorFlip.getLeft().getLeft().isRed() ? colorFlip.rotateRight().colorFlip() : colorFlip;
    }

    private static LLRBNode.Color oppositeColor(LLRBNode lLRBNode) {
        return lLRBNode.isRed() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED;
    }

    private LLRBNode<K, V> removeMin() {
        if (this.left.isEmpty()) {
            return LLRBEmptyNode.getInstance();
        }
        LLRBValueNode moveRedLeft = (getLeft().isRed() || getLeft().getLeft().isRed()) ? this : moveRedLeft();
        return moveRedLeft.copy((Object) null, (Object) null, ((LLRBValueNode) moveRedLeft.left).removeMin(), (LLRBNode) null).fixUp();
    }

    private LLRBValueNode<K, V> rotateLeft() {
        return (LLRBValueNode) this.right.copy(null, null, getColor(), copy((Object) null, (Object) null, LLRBNode.Color.RED, (LLRBNode) null, (LLRBNode) ((LLRBValueNode) this.right).left), (LLRBValueNode) null);
    }

    private LLRBValueNode<K, V> rotateRight() {
        return (LLRBValueNode) this.left.copy(null, null, getColor(), (LLRBNode) null, copy((Object) null, (Object) null, LLRBNode.Color.RED, (LLRBNode) ((LLRBValueNode) this.left).right, (LLRBNode) null));
    }

    /* access modifiers changed from: protected */
    public abstract LLRBValueNode<K, V> copy(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    /* access modifiers changed from: protected */
    public abstract LLRBNode.Color getColor();

    public K getKey() {
        return this.key;
    }

    public LLRBNode<K, V> getLeft() {
        return this.left;
    }

    public LLRBNode<K, V> getMax() {
        return this.right.isEmpty() ? this : this.right.getMax();
    }

    public LLRBNode<K, V> getMin() {
        return this.left.isEmpty() ? this : this.left.getMin();
    }

    public LLRBNode<K, V> getRight() {
        return this.right;
    }

    public V getValue() {
        return this.value;
    }

    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.left.inOrderTraversal(nodeVisitor);
        nodeVisitor.visitEntry(this.key, this.value);
        this.right.inOrderTraversal(nodeVisitor);
    }

    public LLRBNode<K, V> insert(K k10, V v10, Comparator<K> comparator) {
        int compare = comparator.compare(k10, this.key);
        return (compare < 0 ? copy((Object) null, (Object) null, this.left.insert(k10, v10, comparator), (LLRBNode<K, V>) null) : compare == 0 ? copy(k10, v10, (LLRBNode) null, (LLRBNode) null) : copy((Object) null, (Object) null, (LLRBNode) null, this.right.insert(k10, v10, comparator))).fixUp();
    }

    public boolean isEmpty() {
        return false;
    }

    public LLRBNode<K, V> remove(K k10, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNode;
        if (comparator.compare(k10, this.key) < 0) {
            LLRBValueNode moveRedLeft = (this.left.isEmpty() || this.left.isRed() || ((LLRBValueNode) this.left).left.isRed()) ? this : moveRedLeft();
            lLRBValueNode = moveRedLeft.copy((Object) null, (Object) null, moveRedLeft.left.remove(k10, comparator), (LLRBNode<K, V>) null);
        } else {
            LLRBValueNode rotateRight = this.left.isRed() ? rotateRight() : this;
            if (!rotateRight.right.isEmpty() && !rotateRight.right.isRed() && !((LLRBValueNode) rotateRight.right).left.isRed()) {
                rotateRight = rotateRight.moveRedRight();
            }
            if (comparator.compare(k10, rotateRight.key) == 0) {
                if (rotateRight.right.isEmpty()) {
                    return LLRBEmptyNode.getInstance();
                }
                LLRBNode<K, V> min = rotateRight.right.getMin();
                rotateRight = rotateRight.copy(min.getKey(), min.getValue(), (LLRBNode) null, ((LLRBValueNode) rotateRight.right).removeMin());
            }
            lLRBValueNode = rotateRight.copy((Object) null, (Object) null, (LLRBNode) null, rotateRight.right.remove(k10, comparator));
        }
        return lLRBValueNode.fixUp();
    }

    /* access modifiers changed from: package-private */
    public void setLeft(LLRBNode<K, V> lLRBNode) {
        this.left = lLRBNode;
    }

    public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (!this.left.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor) || !shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return false;
        }
        return this.right.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor);
    }

    public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (!this.right.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor) || !shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return false;
        }
        return this.left.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor);
    }

    public LLRBValueNode<K, V> copy(K k10, V v10, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k10 == null) {
            k10 = this.key;
        }
        if (v10 == null) {
            v10 = this.value;
        }
        if (lLRBNode == null) {
            lLRBNode = this.left;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.right;
        }
        return color == LLRBNode.Color.RED ? new LLRBRedValueNode(k10, v10, lLRBNode, lLRBNode2) : new LLRBBlackValueNode(k10, v10, lLRBNode, lLRBNode2);
    }
}
