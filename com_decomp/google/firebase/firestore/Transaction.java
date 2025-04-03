package com.google.firebase.firestore;

import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import n4.i;
import n4.l;

public class Transaction {
    private final FirebaseFirestore firestore;
    private final com.google.firebase.firestore.core.Transaction transaction;

    public interface Function<TResult> {
        TResult apply(Transaction transaction);
    }

    Transaction(com.google.firebase.firestore.core.Transaction transaction2, FirebaseFirestore firebaseFirestore) {
        this.transaction = (com.google.firebase.firestore.core.Transaction) Preconditions.checkNotNull(transaction2);
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
    }

    private i getAsync(DocumentReference documentReference) {
        return this.transaction.lookup(Collections.singletonList(documentReference.getKey())).continueWith(Executors.DIRECT_EXECUTOR, new s(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ DocumentSnapshot lambda$getAsync$0(i iVar) {
        if (iVar.isSuccessful()) {
            List list = (List) iVar.getResult();
            if (list.size() == 1) {
                MutableDocument mutableDocument = (MutableDocument) list.get(0);
                if (mutableDocument.isFoundDocument()) {
                    return DocumentSnapshot.fromDocument(this.firestore, mutableDocument, false, false);
                }
                if (mutableDocument.isNoDocument()) {
                    return DocumentSnapshot.fromNoDocument(this.firestore, mutableDocument.getKey(), false);
                }
                throw Assert.fail("BatchGetDocumentsRequest returned unexpected document type: " + MutableDocument.class.getCanonicalName(), new Object[0]);
            }
            throw Assert.fail("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        throw iVar.getException();
    }

    public Transaction delete(DocumentReference documentReference) {
        this.firestore.validateReference(documentReference);
        this.transaction.delete(documentReference.getKey());
        return this;
    }

    public DocumentSnapshot get(DocumentReference documentReference) {
        this.firestore.validateReference(documentReference);
        try {
            return (DocumentSnapshot) l.a(getAsync(documentReference));
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof FirebaseFirestoreException) {
                throw ((FirebaseFirestoreException) e10.getCause());
            }
            throw new RuntimeException(e10.getCause());
        } catch (InterruptedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public Transaction set(DocumentReference documentReference, Object obj) {
        return set(documentReference, obj, SetOptions.OVERWRITE);
    }

    public Transaction update(DocumentReference documentReference, FieldPath fieldPath, Object obj, Object... objArr) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, fieldPath, obj, objArr)));
    }

    private Transaction update(DocumentReference documentReference, UserData.ParsedUpdateData parsedUpdateData) {
        this.firestore.validateReference(documentReference);
        this.transaction.update(documentReference.getKey(), parsedUpdateData);
        return this;
    }

    public Transaction set(DocumentReference documentReference, Object obj, SetOptions setOptions) {
        this.firestore.validateReference(documentReference);
        Preconditions.checkNotNull(obj, "Provided data must not be null.");
        Preconditions.checkNotNull(setOptions, "Provided options must not be null.");
        this.transaction.set(documentReference.getKey(), setOptions.isMerge() ? this.firestore.getUserDataReader().parseMergeData(obj, setOptions.getFieldMask()) : this.firestore.getUserDataReader().parseSetData(obj));
        return this;
    }

    public Transaction update(DocumentReference documentReference, String str, Object obj, Object... objArr) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, str, obj, objArr)));
    }

    public Transaction update(DocumentReference documentReference, Map<String, Object> map) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(map));
    }
}
