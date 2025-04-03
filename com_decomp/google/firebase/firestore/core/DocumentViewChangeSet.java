package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DocumentViewChangeSet {
    private final TreeMap<DocumentKey, DocumentViewChange> changes = new TreeMap<>();

    public void addChange(DocumentViewChange documentViewChange) {
        DocumentKey key = documentViewChange.getDocument().getKey();
        DocumentViewChange documentViewChange2 = this.changes.get(key);
        if (documentViewChange2 == null) {
            this.changes.put(key, documentViewChange);
            return;
        }
        DocumentViewChange.Type type = documentViewChange2.getType();
        DocumentViewChange.Type type2 = documentViewChange.getType();
        DocumentViewChange.Type type3 = DocumentViewChange.Type.ADDED;
        if (type2 == type3 || type != DocumentViewChange.Type.METADATA) {
            if (type2 != DocumentViewChange.Type.METADATA || type == DocumentViewChange.Type.REMOVED) {
                DocumentViewChange.Type type4 = DocumentViewChange.Type.MODIFIED;
                if (!(type2 == type4 && type == type4)) {
                    if (type2 == type4 && type == type3) {
                        documentViewChange = DocumentViewChange.create(type3, documentViewChange.getDocument());
                    } else {
                        DocumentViewChange.Type type5 = DocumentViewChange.Type.REMOVED;
                        if (type2 == type5 && type == type3) {
                            this.changes.remove(key);
                            return;
                        } else if (type2 == type5 && type == type4) {
                            documentViewChange = DocumentViewChange.create(type5, documentViewChange2.getDocument());
                        } else if (!(type2 == type3 && type == type5)) {
                            throw Assert.fail("Unsupported combination of changes %s after %s", type2, type);
                        }
                    }
                }
                documentViewChange = DocumentViewChange.create(type4, documentViewChange.getDocument());
            } else {
                documentViewChange = DocumentViewChange.create(type, documentViewChange.getDocument());
            }
        }
        this.changes.put(key, documentViewChange);
    }

    /* access modifiers changed from: package-private */
    public List<DocumentViewChange> getChanges() {
        return new ArrayList(this.changes.values());
    }
}
