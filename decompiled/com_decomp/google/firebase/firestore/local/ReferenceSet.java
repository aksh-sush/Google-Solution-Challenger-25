package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Collections;
import java.util.Iterator;

public class ReferenceSet {
    private ImmutableSortedSet<c> referencesByKey = new ImmutableSortedSet<>(Collections.emptyList(), c.f7953c);
    private ImmutableSortedSet<c> referencesByTarget = new ImmutableSortedSet<>(Collections.emptyList(), c.f7954d);

    private void removeReference(c cVar) {
        this.referencesByKey = this.referencesByKey.remove(cVar);
        this.referencesByTarget = this.referencesByTarget.remove(cVar);
    }

    public void addReference(DocumentKey documentKey, int i10) {
        c cVar = new c(documentKey, i10);
        this.referencesByKey = this.referencesByKey.insert(cVar);
        this.referencesByTarget = this.referencesByTarget.insert(cVar);
    }

    public void addReferences(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i10) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            addReference(it.next(), i10);
        }
    }

    public boolean containsKey(DocumentKey documentKey) {
        Iterator<c> iteratorFrom = this.referencesByKey.iteratorFrom(new c(documentKey, 0));
        if (!iteratorFrom.hasNext()) {
            return false;
        }
        return iteratorFrom.next().d().equals(documentKey);
    }

    public boolean isEmpty() {
        return this.referencesByKey.isEmpty();
    }

    public ImmutableSortedSet<DocumentKey> referencesForId(int i10) {
        Iterator<c> iteratorFrom = this.referencesByTarget.iteratorFrom(new c(DocumentKey.empty(), i10));
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        while (iteratorFrom.hasNext()) {
            c next = iteratorFrom.next();
            if (next.c() != i10) {
                break;
            }
            emptyKeySet = emptyKeySet.insert(next.d());
        }
        return emptyKeySet;
    }

    public void removeAllReferences() {
        Iterator<c> it = this.referencesByKey.iterator();
        while (it.hasNext()) {
            removeReference(it.next());
        }
    }

    public void removeReferences(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i10) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            removeReference(it.next(), i10);
        }
    }

    public ImmutableSortedSet<DocumentKey> removeReferencesForId(int i10) {
        Iterator<c> iteratorFrom = this.referencesByTarget.iteratorFrom(new c(DocumentKey.empty(), i10));
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        while (iteratorFrom.hasNext()) {
            c next = iteratorFrom.next();
            if (next.c() != i10) {
                break;
            }
            emptyKeySet = emptyKeySet.insert(next.d());
            removeReference(next);
        }
        return emptyKeySet;
    }

    public void removeReference(DocumentKey documentKey, int i10) {
        removeReference(new c(documentKey, i10));
    }
}
