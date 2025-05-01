package com.google.firebase.firestore.model;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class DocumentSet implements Iterable<Document> {
    private final ImmutableSortedMap<DocumentKey, Document> keyIndex;
    private final ImmutableSortedSet<Document> sortedSet;

    private DocumentSet(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, ImmutableSortedSet<Document> immutableSortedSet) {
        this.keyIndex = immutableSortedMap;
        this.sortedSet = immutableSortedSet;
    }

    public static DocumentSet emptySet(Comparator<Document> comparator) {
        return new DocumentSet(DocumentCollections.emptyDocumentMap(), new ImmutableSortedSet(Collections.emptyList(), new d(comparator)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int lambda$emptySet$0(Comparator comparator, Document document, Document document2) {
        int compare = comparator.compare(document, document2);
        return compare == 0 ? Document.KEY_COMPARATOR.compare(document, document2) : compare;
    }

    public DocumentSet add(Document document) {
        DocumentSet remove = remove(document.getKey());
        return new DocumentSet(remove.keyIndex.insert(document.getKey(), document), remove.sortedSet.insert(document));
    }

    public boolean contains(DocumentKey documentKey) {
        return this.keyIndex.containsKey(documentKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentSet.class != obj.getClass()) {
            return false;
        }
        DocumentSet documentSet = (DocumentSet) obj;
        if (size() != documentSet.size()) {
            return false;
        }
        Iterator<Document> it = iterator();
        Iterator<Document> it2 = documentSet.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Document getDocument(DocumentKey documentKey) {
        return this.keyIndex.get(documentKey);
    }

    public Document getFirstDocument() {
        return this.sortedSet.getMinEntry();
    }

    public Document getLastDocument() {
        return this.sortedSet.getMaxEntry();
    }

    public Document getPredecessor(DocumentKey documentKey) {
        Document document = this.keyIndex.get(documentKey);
        if (document != null) {
            return this.sortedSet.getPredecessorEntry(document);
        }
        throw new IllegalArgumentException("Key not contained in DocumentSet: " + documentKey);
    }

    public int hashCode() {
        Iterator<Document> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Document next = it.next();
            i10 = (((i10 * 31) + next.getKey().hashCode()) * 31) + next.getData().hashCode();
        }
        return i10;
    }

    public int indexOf(DocumentKey documentKey) {
        Document document = this.keyIndex.get(documentKey);
        if (document == null) {
            return -1;
        }
        return this.sortedSet.indexOf(document);
    }

    public boolean isEmpty() {
        return this.keyIndex.isEmpty();
    }

    public Iterator<Document> iterator() {
        return this.sortedSet.iterator();
    }

    public DocumentSet remove(DocumentKey documentKey) {
        Document document = this.keyIndex.get(documentKey);
        return document == null ? this : new DocumentSet(this.keyIndex.remove(documentKey), this.sortedSet.remove(document));
    }

    public int size() {
        return this.keyIndex.size();
    }

    public List<Document> toList() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Document> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Document> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Document next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
