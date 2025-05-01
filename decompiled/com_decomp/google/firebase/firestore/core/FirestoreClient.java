package com.google.firebase.firestore.core;

import android.content.Context;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.bundle.BundleSerializer;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Logger;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.i;
import n4.j;
import n4.l;

public final class FirestoreClient {
    private static final String LOG_TAG = "FirestoreClient";
    private static final int MAX_CONCURRENT_LIMBO_RESOLUTIONS = 100;
    private final AsyncQueue asyncQueue;
    private final BundleSerializer bundleSerializer;
    private final CredentialsProvider credentialsProvider;
    private final DatabaseInfo databaseInfo;
    private EventManager eventManager;
    private GarbageCollectionScheduler gcScheduler;
    private LocalStore localStore;
    private final GrpcMetadataProvider metadataProvider;
    private Persistence persistence;
    private RemoteStore remoteStore;
    private SyncEngine syncEngine;

    public FirestoreClient(Context context, DatabaseInfo databaseInfo2, FirebaseFirestoreSettings firebaseFirestoreSettings, CredentialsProvider credentialsProvider2, AsyncQueue asyncQueue2, GrpcMetadataProvider grpcMetadataProvider) {
        this.databaseInfo = databaseInfo2;
        this.credentialsProvider = credentialsProvider2;
        this.asyncQueue = asyncQueue2;
        this.metadataProvider = grpcMetadataProvider;
        this.bundleSerializer = new BundleSerializer(new RemoteSerializer(databaseInfo2.getDatabaseId()));
        j jVar = new j();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        asyncQueue2.enqueueAndForget(new n(this, jVar, context, firebaseFirestoreSettings));
        credentialsProvider2.setChangeListener(new o(this, atomicBoolean, jVar, asyncQueue2));
    }

    private void initialize(Context context, User user, FirebaseFirestoreSettings firebaseFirestoreSettings) {
        Logger.debug(LOG_TAG, "Initializing. user=%s", user.getUid());
        ComponentProvider.Configuration configuration = new ComponentProvider.Configuration(context, this.asyncQueue, this.databaseInfo, new Datastore(this.databaseInfo, this.asyncQueue, this.credentialsProvider, context, this.metadataProvider), user, 100, firebaseFirestoreSettings);
        ComponentProvider sQLiteComponentProvider = firebaseFirestoreSettings.isPersistenceEnabled() ? new SQLiteComponentProvider() : new MemoryComponentProvider();
        sQLiteComponentProvider.initialize(configuration);
        this.persistence = sQLiteComponentProvider.getPersistence();
        this.gcScheduler = sQLiteComponentProvider.getGargabeCollectionScheduler();
        this.localStore = sQLiteComponentProvider.getLocalStore();
        this.remoteStore = sQLiteComponentProvider.getRemoteStore();
        this.syncEngine = sQLiteComponentProvider.getSyncEngine();
        this.eventManager = sQLiteComponentProvider.getEventManager();
        GarbageCollectionScheduler garbageCollectionScheduler = this.gcScheduler;
        if (garbageCollectionScheduler != null) {
            garbageCollectionScheduler.start();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotsInSyncListener$14(EventListener eventListener) {
        this.eventManager.addSnapshotsInSyncListener(eventListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$disableNetwork$3() {
        this.remoteStore.disableNetwork();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$enableNetwork$4() {
        this.remoteStore.enableNetwork();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Document lambda$getDocumentFromLocalCache$8(DocumentKey documentKey) {
        return this.localStore.readDocument(documentKey);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Document lambda$getDocumentFromLocalCache$9(i iVar) {
        Document document = (Document) iVar.getResult();
        if (document.isFoundDocument()) {
            return document;
        }
        if (document.isNoDocument()) {
            return null;
        }
        throw new FirebaseFirestoreException("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", FirebaseFirestoreException.Code.UNAVAILABLE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ViewSnapshot lambda$getDocumentsFromLocalCache$10(Query query) {
        QueryResult executeQuery = this.localStore.executeQuery(query, true);
        View view = new View(query, executeQuery.getRemoteKeys());
        return view.applyChanges(view.computeDocChanges(executeQuery.getDocuments())).getSnapshot();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getNamedQuery$16(String str, j jVar) {
        NamedQuery namedQuery = this.localStore.getNamedQuery(str);
        if (namedQuery != null) {
            Target target = namedQuery.getBundledQuery().getTarget();
            jVar.c(new Query(target.getPath(), target.getCollectionGroup(), target.getFilters(), target.getOrderBy(), target.getLimit(), namedQuery.getBundledQuery().getLimitType(), target.getStartAt(), target.getEndAt()));
            return;
        }
        jVar.c((Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$listen$6(QueryListener queryListener) {
        this.eventManager.addQueryListener(queryListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBundle$15(BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        this.syncEngine.loadBundle(bundleReader, loadBundleTask);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(j jVar, Context context, FirebaseFirestoreSettings firebaseFirestoreSettings) {
        try {
            initialize(context, (User) l.a(jVar.a()), firebaseFirestoreSettings);
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(User user) {
        Assert.hardAssert(this.syncEngine != null, "SyncEngine not yet initialized", new Object[0]);
        Logger.debug(LOG_TAG, "Credential changed. Current user: %s", user.getUid());
        this.syncEngine.handleCredentialChange(user);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(AtomicBoolean atomicBoolean, j jVar, AsyncQueue asyncQueue2, User user) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Assert.hardAssert(!jVar.a().isComplete(), "Already fulfilled first user task", new Object[0]);
            jVar.c(user);
            return;
        }
        asyncQueue2.enqueueAndForget(new h(this, user));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSnapshotsInSyncListener$17(EventListener eventListener) {
        this.eventManager.removeSnapshotsInSyncListener(eventListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$7(QueryListener queryListener) {
        this.eventManager.removeQueryListener(queryListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$terminate$5() {
        this.remoteStore.shutdown();
        this.persistence.shutdown();
        GarbageCollectionScheduler garbageCollectionScheduler = this.gcScheduler;
        if (garbageCollectionScheduler != null) {
            garbageCollectionScheduler.stop();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i lambda$transaction$12(Function function) {
        return this.syncEngine.transaction(this.asyncQueue, function);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForPendingWrites$13(j jVar) {
        this.syncEngine.registerPendingWritesTask(jVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$write$11(List list, j jVar) {
        this.syncEngine.writeMutations(list, jVar);
    }

    private void verifyNotTerminated() {
        if (isTerminated()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public void addSnapshotsInSyncListener(EventListener<Void> eventListener) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new p(this, eventListener));
    }

    public i disableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue((Runnable) new m(this));
    }

    public i enableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue((Runnable) new j(this));
    }

    public i getDocumentFromLocalCache(DocumentKey documentKey) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new s(this, documentKey)).continueWith(new t());
    }

    public i getDocumentsFromLocalCache(Query query) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new v(this, query));
    }

    public i getNamedQuery(String str) {
        verifyNotTerminated();
        j jVar = new j();
        this.asyncQueue.enqueueAndForget(new u(this, str, jVar));
        return jVar.a();
    }

    public boolean isTerminated() {
        return this.asyncQueue.isShuttingDown();
    }

    public QueryListener listen(Query query, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        verifyNotTerminated();
        QueryListener queryListener = new QueryListener(query, listenOptions, eventListener);
        this.asyncQueue.enqueueAndForget(new f(this, queryListener));
        return queryListener;
    }

    public void loadBundle(InputStream inputStream, LoadBundleTask loadBundleTask) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new q(this, new BundleReader(this.bundleSerializer, inputStream), loadBundleTask));
    }

    public void removeSnapshotsInSyncListener(EventListener<Void> eventListener) {
        if (!isTerminated()) {
            this.asyncQueue.enqueueAndForget(new l(this, eventListener));
        }
    }

    public void stopListening(QueryListener queryListener) {
        if (!isTerminated()) {
            this.asyncQueue.enqueueAndForget(new k(this, queryListener));
        }
    }

    public i terminate() {
        this.credentialsProvider.removeChangeListener();
        return this.asyncQueue.enqueueAndInitiateShutdown(new g(this));
    }

    public <TResult> i transaction(Function<Transaction, i> function) {
        verifyNotTerminated();
        return AsyncQueue.callTask(this.asyncQueue.getExecutor(), new r(this, function));
    }

    public i waitForPendingWrites() {
        verifyNotTerminated();
        j jVar = new j();
        this.asyncQueue.enqueueAndForget(new e(this, jVar));
        return jVar.a();
    }

    public i write(List<Mutation> list) {
        verifyNotTerminated();
        j jVar = new j();
        this.asyncQueue.enqueueAndForget(new i(this, list, jVar));
        return jVar.a();
    }
}
