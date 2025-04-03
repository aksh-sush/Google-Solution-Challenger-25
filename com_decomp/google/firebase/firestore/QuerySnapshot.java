package com.google.firebase.firestore;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class QuerySnapshot implements Iterable<QueryDocumentSnapshot> {
    private List<DocumentChange> cachedChanges;
    private MetadataChanges cachedChangesMetadataState;
    private final FirebaseFirestore firestore;
    private final SnapshotMetadata metadata;
    private final Query originalQuery;
    private final ViewSnapshot snapshot;

    private class a implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator f7826e;

        a(Iterator it) {
            this.f7826e = it;
        }

        /* renamed from: b */
        public QueryDocumentSnapshot next() {
            return QuerySnapshot.this.convertDocument((Document) this.f7826e.next());
        }

        public boolean hasNext() {
            return this.f7826e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    QuerySnapshot(Query query, ViewSnapshot viewSnapshot, FirebaseFirestore firebaseFirestore) {
        this.originalQuery = (Query) Preconditions.checkNotNull(query);
        this.snapshot = (ViewSnapshot) Preconditions.checkNotNull(viewSnapshot);
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
        this.metadata = new SnapshotMetadata(viewSnapshot.hasPendingWrites(), viewSnapshot.isFromCache());
    }

    /* access modifiers changed from: private */
    public QueryDocumentSnapshot convertDocument(Document document) {
        return QueryDocumentSnapshot.fromDocument(this.firestore, document, this.snapshot.isFromCache(), this.snapshot.getMutatedKeys().contains(document.getKey()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuerySnapshot)) {
            return false;
        }
        QuerySnapshot querySnapshot = (QuerySnapshot) obj;
        return this.firestore.equals(querySnapshot.firestore) && this.originalQuery.equals(querySnapshot.originalQuery) && this.snapshot.equals(querySnapshot.snapshot) && this.metadata.equals(querySnapshot.metadata);
    }

    public List<DocumentChange> getDocumentChanges() {
        return getDocumentChanges(MetadataChanges.EXCLUDE);
    }

    public List<DocumentSnapshot> getDocuments() {
        ArrayList arrayList = new ArrayList(this.snapshot.getDocuments().size());
        Iterator<Document> it = this.snapshot.getDocuments().iterator();
        while (it.hasNext()) {
            arrayList.add(convertDocument(it.next()));
        }
        return arrayList;
    }

    public SnapshotMetadata getMetadata() {
        return this.metadata;
    }

    public Query getQuery() {
        return this.originalQuery;
    }

    public int hashCode() {
        return (((((this.firestore.hashCode() * 31) + this.originalQuery.hashCode()) * 31) + this.snapshot.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.snapshot.getDocuments().isEmpty();
    }

    public Iterator<QueryDocumentSnapshot> iterator() {
        return new a(this.snapshot.getDocuments().iterator());
    }

    public int size() {
        return this.snapshot.getDocuments().size();
    }

    public <T> List<T> toObjects(Class<T> cls) {
        return toObjects(cls, DocumentSnapshot.ServerTimestampBehavior.DEFAULT);
    }

    public List<DocumentChange> getDocumentChanges(MetadataChanges metadataChanges) {
        if (!MetadataChanges.INCLUDE.equals(metadataChanges) || !this.snapshot.excludesMetadataChanges()) {
            if (this.cachedChanges == null || this.cachedChangesMetadataState != metadataChanges) {
                this.cachedChanges = Collections.unmodifiableList(DocumentChange.changesFromSnapshot(this.firestore, metadataChanges, this.snapshot));
                this.cachedChangesMetadataState = metadataChanges;
            }
            return this.cachedChanges;
        }
        throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
    }

    public <T> List<T> toObjects(Class<T> cls, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(cls, "Provided POJO type must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<QueryDocumentSnapshot> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toObject(cls, serverTimestampBehavior));
        }
        return arrayList;
    }
}
