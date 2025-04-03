package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.WriteBatch;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ByteBufferInputStream;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.inject.Deferred;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import n4.i;
import n4.j;
import n4.l;

public class FirebaseFirestore {
    private static final String TAG = "FirebaseFirestore";
    private final AsyncQueue asyncQueue;
    private volatile FirestoreClient client;
    private final Context context;
    private final CredentialsProvider credentialsProvider;
    private final DatabaseId databaseId;
    private EmulatedServiceSettings emulatorSettings;
    private final FirebaseApp firebaseApp;
    private final InstanceRegistry instanceRegistry;
    private final GrpcMetadataProvider metadataProvider;
    private final String persistenceKey;
    private FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder().build();
    private final UserDataReader userDataReader;

    public interface InstanceRegistry {
        void remove(String str);
    }

    FirebaseFirestore(Context context2, DatabaseId databaseId2, String str, CredentialsProvider credentialsProvider2, AsyncQueue asyncQueue2, FirebaseApp firebaseApp2, InstanceRegistry instanceRegistry2, GrpcMetadataProvider grpcMetadataProvider) {
        this.context = (Context) Preconditions.checkNotNull(context2);
        this.databaseId = (DatabaseId) Preconditions.checkNotNull((DatabaseId) Preconditions.checkNotNull(databaseId2));
        this.userDataReader = new UserDataReader(databaseId2);
        this.persistenceKey = (String) Preconditions.checkNotNull(str);
        this.credentialsProvider = (CredentialsProvider) Preconditions.checkNotNull(credentialsProvider2);
        this.asyncQueue = (AsyncQueue) Preconditions.checkNotNull(asyncQueue2);
        this.firebaseApp = firebaseApp2;
        this.instanceRegistry = instanceRegistry2;
        this.metadataProvider = grpcMetadataProvider;
    }

    private void ensureClientConfigured() {
        if (this.client == null) {
            synchronized (this.databaseId) {
                if (this.client == null) {
                    this.client = new FirestoreClient(this.context, new DatabaseInfo(this.databaseId, this.persistenceKey, this.settings.getHost(), this.settings.isSslEnabled()), this.settings, this.credentialsProvider, this.asyncQueue, this.metadataProvider);
                }
            }
        }
    }

    public static FirebaseFirestore getInstance() {
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            return getInstance(instance, DatabaseId.DEFAULT_DATABASE_ID);
        }
        throw new IllegalStateException("You must call FirebaseApp.initializeApp first.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotsInSyncListener$4(Runnable runnable, Void voidR, FirebaseFirestoreException firebaseFirestoreException) {
        Assert.hardAssert(firebaseFirestoreException == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotsInSyncListener$5(AsyncEventListener asyncEventListener) {
        asyncEventListener.mute();
        this.client.removeSnapshotsInSyncListener(asyncEventListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$clearPersistence$2(j jVar) {
        try {
            if (this.client != null) {
                if (!this.client.isTerminated()) {
                    throw new FirebaseFirestoreException("Persistence cannot be cleared while the firestore instance is running.", FirebaseFirestoreException.Code.FAILED_PRECONDITION);
                }
            }
            SQLitePersistence.clearPersistence(this.context, this.databaseId, this.persistenceKey);
            jVar.c((Object) null);
        } catch (FirebaseFirestoreException e10) {
            jVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Query lambda$getNamedQuery$3(i iVar) {
        Query query = (Query) iVar.getResult();
        if (query != null) {
            return new Query(query, this);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$runTransaction$0(Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        return function.apply(new Transaction(transaction, this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i lambda$runTransaction$1(Executor executor, Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        return l.c(executor, new f(this, function, transaction));
    }

    private FirebaseFirestoreSettings mergeEmulatorSettings(FirebaseFirestoreSettings firebaseFirestoreSettings, EmulatedServiceSettings emulatedServiceSettings) {
        if (emulatedServiceSettings == null) {
            return firebaseFirestoreSettings;
        }
        if (!FirebaseFirestoreSettings.DEFAULT_HOST.equals(firebaseFirestoreSettings.getHost())) {
            Logger.warn(TAG, "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        FirebaseFirestoreSettings.Builder builder = new FirebaseFirestoreSettings.Builder(firebaseFirestoreSettings);
        return builder.setHost(emulatedServiceSettings.getHost() + ":" + emulatedServiceSettings.getPort()).setSslEnabled(false).build();
    }

    static FirebaseFirestore newInstance(Context context2, FirebaseApp firebaseApp2, Deferred<InternalAuthProvider> deferred, String str, InstanceRegistry instanceRegistry2, GrpcMetadataProvider grpcMetadataProvider) {
        String projectId = firebaseApp2.getOptions().getProjectId();
        if (projectId != null) {
            DatabaseId forDatabase = DatabaseId.forDatabase(projectId, str);
            AsyncQueue asyncQueue2 = new AsyncQueue();
            return new FirebaseFirestore(context2, forDatabase, firebaseApp2.getName(), new FirebaseAuthCredentialsProvider(deferred), asyncQueue2, firebaseApp2, instanceRegistry2, grpcMetadataProvider);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    @Keep
    static void setClientLanguage(String str) {
        FirestoreChannel.setClientLanguage(str);
    }

    public static void setLoggingEnabled(boolean z10) {
        Logger.setLogLevel(z10 ? Logger.Level.DEBUG : Logger.Level.WARN);
    }

    public ListenerRegistration addSnapshotsInSyncListener(Activity activity, Runnable runnable) {
        return addSnapshotsInSyncListener(Executors.DEFAULT_CALLBACK_EXECUTOR, activity, runnable);
    }

    public WriteBatch batch() {
        ensureClientConfigured();
        return new WriteBatch(this);
    }

    public i clearPersistence() {
        j jVar = new j();
        this.asyncQueue.enqueueAndForgetEvenAfterShutdown(new i(this, jVar));
        return jVar.a();
    }

    public CollectionReference collection(String str) {
        Preconditions.checkNotNull(str, "Provided collection path must not be null.");
        ensureClientConfigured();
        return new CollectionReference(ResourcePath.fromString(str), this);
    }

    public Query collectionGroup(String str) {
        Preconditions.checkNotNull(str, "Provided collection ID must not be null.");
        if (!str.contains("/")) {
            ensureClientConfigured();
            return new Query(new Query(ResourcePath.EMPTY, str), this);
        }
        throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", new Object[]{str}));
    }

    public i disableNetwork() {
        ensureClientConfigured();
        return this.client.disableNetwork();
    }

    public DocumentReference document(String str) {
        Preconditions.checkNotNull(str, "Provided document path must not be null.");
        ensureClientConfigured();
        return DocumentReference.forPath(ResourcePath.fromString(str), this);
    }

    public i enableNetwork() {
        ensureClientConfigured();
        return this.client.enableNetwork();
    }

    public FirebaseApp getApp() {
        return this.firebaseApp;
    }

    /* access modifiers changed from: package-private */
    public AsyncQueue getAsyncQueue() {
        return this.asyncQueue;
    }

    /* access modifiers changed from: package-private */
    public FirestoreClient getClient() {
        return this.client;
    }

    /* access modifiers changed from: package-private */
    public DatabaseId getDatabaseId() {
        return this.databaseId;
    }

    public FirebaseFirestoreSettings getFirestoreSettings() {
        return this.settings;
    }

    public i getNamedQuery(String str) {
        ensureClientConfigured();
        return this.client.getNamedQuery(str).continueWith(new j(this));
    }

    /* access modifiers changed from: package-private */
    public UserDataReader getUserDataReader() {
        return this.userDataReader;
    }

    public LoadBundleTask loadBundle(InputStream inputStream) {
        ensureClientConfigured();
        LoadBundleTask loadBundleTask = new LoadBundleTask();
        this.client.loadBundle(inputStream, loadBundleTask);
        return loadBundleTask;
    }

    public i runBatch(WriteBatch.Function function) {
        WriteBatch batch = batch();
        function.apply(batch);
        return batch.commit();
    }

    public <TResult> i runTransaction(Transaction.Function<TResult> function) {
        Preconditions.checkNotNull(function, "Provided transaction update function must not be null.");
        return runTransaction(function, com.google.firebase.firestore.core.Transaction.getDefaultExecutor());
    }

    public void setFirestoreSettings(FirebaseFirestoreSettings firebaseFirestoreSettings) {
        FirebaseFirestoreSettings mergeEmulatorSettings = mergeEmulatorSettings(firebaseFirestoreSettings, this.emulatorSettings);
        synchronized (this.databaseId) {
            Preconditions.checkNotNull(mergeEmulatorSettings, "Provided settings must not be null.");
            if (this.client != null) {
                if (!this.settings.equals(mergeEmulatorSettings)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
            }
            this.settings = mergeEmulatorSettings;
        }
    }

    public i terminate() {
        this.instanceRegistry.remove(getDatabaseId().getDatabaseId());
        ensureClientConfigured();
        return this.client.terminate();
    }

    public void useEmulator(String str, int i10) {
        if (this.client == null) {
            EmulatedServiceSettings emulatedServiceSettings = new EmulatedServiceSettings(str, i10);
            this.emulatorSettings = emulatedServiceSettings;
            this.settings = mergeEmulatorSettings(this.settings, emulatedServiceSettings);
            return;
        }
        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
    }

    /* access modifiers changed from: package-private */
    public void validateReference(DocumentReference documentReference) {
        Preconditions.checkNotNull(documentReference, "Provided DocumentReference must not be null.");
        if (documentReference.getFirestore() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public i waitForPendingWrites() {
        return this.client.waitForPendingWrites();
    }

    public static FirebaseFirestore getInstance(FirebaseApp firebaseApp2) {
        return getInstance(firebaseApp2, DatabaseId.DEFAULT_DATABASE_ID);
    }

    private <ResultT> i runTransaction(Transaction.Function<ResultT> function, Executor executor) {
        ensureClientConfigured();
        return this.client.transaction(new e(this, executor, function));
    }

    public ListenerRegistration addSnapshotsInSyncListener(Runnable runnable) {
        return addSnapshotsInSyncListener(Executors.DEFAULT_CALLBACK_EXECUTOR, runnable);
    }

    public LoadBundleTask loadBundle(ByteBuffer byteBuffer) {
        return loadBundle((InputStream) new ByteBufferInputStream(byteBuffer));
    }

    private ListenerRegistration addSnapshotsInSyncListener(Executor executor, Activity activity, Runnable runnable) {
        ensureClientConfigured();
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new g(runnable));
        this.client.addSnapshotsInSyncListener(asyncEventListener);
        return ActivityScope.bind(activity, new h(this, asyncEventListener));
    }

    private static FirebaseFirestore getInstance(FirebaseApp firebaseApp2, String str) {
        Preconditions.checkNotNull(firebaseApp2, "Provided FirebaseApp must not be null.");
        k kVar = (k) firebaseApp2.get(k.class);
        Preconditions.checkNotNull(kVar, "Firestore component is not present.");
        return kVar.a(str);
    }

    public LoadBundleTask loadBundle(byte[] bArr) {
        return loadBundle((InputStream) new ByteArrayInputStream(bArr));
    }

    public ListenerRegistration addSnapshotsInSyncListener(Executor executor, Runnable runnable) {
        return addSnapshotsInSyncListener(executor, (Activity) null, runnable);
    }
}
