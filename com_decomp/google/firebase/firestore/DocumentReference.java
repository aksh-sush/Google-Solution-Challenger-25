package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.ListenerRegistrationImpl;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import n4.i;
import n4.j;
import n4.l;

public class DocumentReference {
    private final FirebaseFirestore firestore;
    private final DocumentKey key;

    DocumentReference(DocumentKey documentKey, FirebaseFirestore firebaseFirestore) {
        this.key = (DocumentKey) Preconditions.checkNotNull(documentKey);
        this.firestore = firebaseFirestore;
    }

    private ListenerRegistration addSnapshotListenerInternal(Executor executor, EventManager.ListenOptions listenOptions, Activity activity, EventListener<DocumentSnapshot> eventListener) {
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new d(this, eventListener));
        return ActivityScope.bind(activity, new ListenerRegistrationImpl(this.firestore.getClient(), this.firestore.getClient().listen(asQuery(), listenOptions, asyncEventListener), asyncEventListener));
    }

    private Query asQuery() {
        return Query.atPath(this.key.getPath());
    }

    static DocumentReference forPath(ResourcePath resourcePath, FirebaseFirestore firebaseFirestore) {
        if (resourcePath.length() % 2 == 0) {
            return new DocumentReference(DocumentKey.fromPath(resourcePath), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + resourcePath.canonicalString() + " has " + resourcePath.length());
    }

    private i getViaSnapshotListener(Source source) {
        j jVar = new j();
        j jVar2 = new j();
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.includeDocumentMetadataChanges = true;
        listenOptions.includeQueryMetadataChanges = true;
        listenOptions.waitForSyncWhenOnline = true;
        jVar2.c(addSnapshotListenerInternal(Executors.DIRECT_EXECUTOR, listenOptions, (Activity) null, new c(jVar, jVar2, source)));
        return jVar.a();
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges) {
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
        boolean z10 = true;
        listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
        if (metadataChanges != metadataChanges2) {
            z10 = false;
        }
        listenOptions.includeQueryMetadataChanges = z10;
        listenOptions.waitForSyncWhenOnline = false;
        return listenOptions;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotListenerInternal$2(EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.onEvent(null, firebaseFirestoreException);
            return;
        }
        boolean z10 = true;
        Assert.hardAssert(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        if (viewSnapshot.getDocuments().size() > 1) {
            z10 = false;
        }
        Assert.hardAssert(z10, "Too many documents returned on a document query", new Object[0]);
        Document document = viewSnapshot.getDocuments().getDocument(this.key);
        eventListener.onEvent(document != null ? DocumentSnapshot.fromDocument(this.firestore, document, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys().contains(document.getKey())) : DocumentSnapshot.fromNoDocument(this.firestore, this.key, viewSnapshot.isFromCache()), (FirebaseFirestoreException) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ DocumentSnapshot lambda$get$0(i iVar) {
        Document document = (Document) iVar.getResult();
        return new DocumentSnapshot(this.firestore, this.key, document, true, document != null && document.hasLocalMutations());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getViaSnapshotListener$1(j jVar, j jVar2, Source source, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        FirebaseFirestoreException firebaseFirestoreException2;
        if (firebaseFirestoreException != null) {
            jVar.b(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) l.a(jVar2.a())).remove();
            if (!documentSnapshot.exists() && documentSnapshot.getMetadata().isFromCache()) {
                firebaseFirestoreException2 = new FirebaseFirestoreException("Failed to get document because the client is offline.", FirebaseFirestoreException.Code.UNAVAILABLE);
            } else if (!documentSnapshot.exists() || !documentSnapshot.getMetadata().isFromCache() || source != Source.SERVER) {
                jVar.c(documentSnapshot);
                return;
            } else {
                firebaseFirestoreException2 = new FirebaseFirestoreException("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", FirebaseFirestoreException.Code.UNAVAILABLE);
            }
            jVar.b(firebaseFirestoreException2);
        } catch (ExecutionException e10) {
            throw Assert.fail(e10, "Failed to register a listener for a single document", new Object[0]);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw Assert.fail(e11, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    public ListenerRegistration addSnapshotListener(Activity activity, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(activity, MetadataChanges.EXCLUDE, eventListener);
    }

    public CollectionReference collection(String str) {
        Preconditions.checkNotNull(str, "Provided collection path must not be null.");
        return new CollectionReference((ResourcePath) this.key.getPath().append(ResourcePath.fromString(str)), this.firestore);
    }

    public i delete() {
        return this.firestore.getClient().write(Collections.singletonList(new DeleteMutation(this.key, Precondition.NONE))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentReference)) {
            return false;
        }
        DocumentReference documentReference = (DocumentReference) obj;
        return this.key.equals(documentReference.key) && this.firestore.equals(documentReference.firestore);
    }

    public i get() {
        return get(Source.DEFAULT);
    }

    public FirebaseFirestore getFirestore() {
        return this.firestore;
    }

    public String getId() {
        return this.key.getPath().getLastSegment();
    }

    /* access modifiers changed from: package-private */
    public DocumentKey getKey() {
        return this.key;
    }

    public CollectionReference getParent() {
        return new CollectionReference((ResourcePath) this.key.getPath().popLast(), this.firestore);
    }

    public String getPath() {
        return this.key.getPath().canonicalString();
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.firestore.hashCode();
    }

    public i set(Object obj) {
        return set(obj, SetOptions.OVERWRITE);
    }

    public i update(FieldPath fieldPath, Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, fieldPath, obj, objArr)));
    }

    private i update(UserData.ParsedUpdateData parsedUpdateData) {
        return this.firestore.getClient().write(Collections.singletonList(parsedUpdateData.toMutation(this.key, Precondition.exists(true)))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public ListenerRegistration addSnapshotListener(Activity activity, MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(activity, "Provided activity must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(Executors.DEFAULT_CALLBACK_EXECUTOR, internalOptions(metadataChanges), activity, eventListener);
    }

    public i get(Source source) {
        return source == Source.CACHE ? this.firestore.getClient().getDocumentFromLocalCache(this.key).continueWith(Executors.DIRECT_EXECUTOR, new b(this)) : getViaSnapshotListener(source);
    }

    public i set(Object obj, SetOptions setOptions) {
        Preconditions.checkNotNull(obj, "Provided data must not be null.");
        Preconditions.checkNotNull(setOptions, "Provided options must not be null.");
        return this.firestore.getClient().write(Collections.singletonList((setOptions.isMerge() ? this.firestore.getUserDataReader().parseMergeData(obj, setOptions.getFieldMask()) : this.firestore.getUserDataReader().parseSetData(obj)).toMutation(this.key, Precondition.NONE))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public ListenerRegistration addSnapshotListener(EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(MetadataChanges.EXCLUDE, eventListener);
    }

    public i update(String str, Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, str, obj, objArr)));
    }

    public ListenerRegistration addSnapshotListener(MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(Executors.DEFAULT_CALLBACK_EXECUTOR, metadataChanges, eventListener);
    }

    public i update(Map<String, Object> map) {
        return update(this.firestore.getUserDataReader().parseUpdateData(map));
    }

    public ListenerRegistration addSnapshotListener(Executor executor, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(executor, MetadataChanges.EXCLUDE, eventListener);
    }

    public ListenerRegistration addSnapshotListener(Executor executor, MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(executor, "Provided executor must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(executor, internalOptions(metadataChanges), (Activity) null, eventListener);
    }
}
