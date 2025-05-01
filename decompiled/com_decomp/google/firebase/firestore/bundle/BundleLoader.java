package com.google.firebase.firestore.bundle;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BundleLoader {
    private final BundleCallback bundleCallback;
    private final BundleMetadata bundleMetadata;
    private long bytesLoaded;
    private DocumentKey currentDocument;
    private ImmutableSortedMap<DocumentKey, MutableDocument> documents = DocumentCollections.emptyMutableDocumentMap();
    private final Map<DocumentKey, BundledDocumentMetadata> documentsMetadata = new HashMap();
    private final List<NamedQuery> queries = new ArrayList();

    public BundleLoader(BundleCallback bundleCallback2, BundleMetadata bundleMetadata2) {
        this.bundleCallback = bundleCallback2;
        this.bundleMetadata = bundleMetadata2;
    }

    private Map<String, ImmutableSortedSet<DocumentKey>> getQueryDocumentMapping() {
        HashMap hashMap = new HashMap();
        for (NamedQuery name : this.queries) {
            hashMap.put(name.getName(), DocumentKey.emptyKeySet());
        }
        for (BundledDocumentMetadata next : this.documentsMetadata.values()) {
            for (String next2 : next.getQueries()) {
                hashMap.put(next2, ((ImmutableSortedSet) hashMap.get(next2)).insert(next.getKey()));
            }
        }
        return hashMap;
    }

    public LoadBundleTaskProgress addElement(BundleElement bundleElement, long j10) {
        MutableDocument mutableDocument;
        DocumentKey documentKey;
        ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap;
        Preconditions.checkArgument(!(bundleElement instanceof BundleMetadata), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.documents.size();
        if (bundleElement instanceof NamedQuery) {
            this.queries.add((NamedQuery) bundleElement);
        } else {
            if (bundleElement instanceof BundledDocumentMetadata) {
                BundledDocumentMetadata bundledDocumentMetadata = (BundledDocumentMetadata) bundleElement;
                this.documentsMetadata.put(bundledDocumentMetadata.getKey(), bundledDocumentMetadata);
                this.currentDocument = bundledDocumentMetadata.getKey();
                if (!bundledDocumentMetadata.exists()) {
                    immutableSortedMap = this.documents;
                    documentKey = bundledDocumentMetadata.getKey();
                    mutableDocument = MutableDocument.newNoDocument(bundledDocumentMetadata.getKey(), bundledDocumentMetadata.getReadTime());
                }
            } else if (bundleElement instanceof BundleDocument) {
                BundleDocument bundleDocument = (BundleDocument) bundleElement;
                if (bundleDocument.getKey().equals(this.currentDocument)) {
                    immutableSortedMap = this.documents;
                    documentKey = bundleDocument.getKey();
                    mutableDocument = bundleDocument.getDocument();
                } else {
                    throw new IllegalArgumentException("The document being added does not match the stored metadata.");
                }
            }
            this.documents = immutableSortedMap.insert(documentKey, mutableDocument);
            this.currentDocument = null;
        }
        this.bytesLoaded += j10;
        if (size != this.documents.size()) {
            return new LoadBundleTaskProgress(this.documents.size(), this.bundleMetadata.getTotalDocuments(), this.bytesLoaded, this.bundleMetadata.getTotalBytes(), (Exception) null, LoadBundleTaskProgress.TaskState.RUNNING);
        }
        return null;
    }

    public ImmutableSortedMap<DocumentKey, Document> applyChanges() {
        Preconditions.checkArgument(this.currentDocument == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        Preconditions.checkArgument(this.bundleMetadata.getBundleId() != null, "Bundle ID must be set", new Object[0]);
        Preconditions.checkArgument(this.documents.size() == this.bundleMetadata.getTotalDocuments(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.bundleMetadata.getTotalDocuments()), Integer.valueOf(this.documents.size()));
        ImmutableSortedMap<DocumentKey, Document> applyBundledDocuments = this.bundleCallback.applyBundledDocuments(this.documents, this.bundleMetadata.getBundleId());
        Map<String, ImmutableSortedSet<DocumentKey>> queryDocumentMapping = getQueryDocumentMapping();
        for (NamedQuery next : this.queries) {
            this.bundleCallback.saveNamedQuery(next, queryDocumentMapping.get(next.getName()));
        }
        this.bundleCallback.saveBundle(this.bundleMetadata);
        return applyBundledDocuments;
    }
}
