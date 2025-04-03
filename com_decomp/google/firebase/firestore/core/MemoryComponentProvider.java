package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.local.DefaultQueryEngine;
import com.google.firebase.firestore.local.GarbageCollectionScheduler;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.MemoryPersistence;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.AndroidConnectivityMonitor;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import fa.d1;

public class MemoryComponentProvider extends ComponentProvider {

    private class b implements RemoteStore.RemoteStoreCallback {
        private b() {
        }

        public ImmutableSortedSet getRemoteKeysForTarget(int i10) {
            return MemoryComponentProvider.this.getSyncEngine().getRemoteKeysForTarget(i10);
        }

        public void handleOnlineStateChange(OnlineState onlineState) {
            MemoryComponentProvider.this.getSyncEngine().handleOnlineStateChange(onlineState);
        }

        public void handleRejectedListen(int i10, d1 d1Var) {
            MemoryComponentProvider.this.getSyncEngine().handleRejectedListen(i10, d1Var);
        }

        public void handleRejectedWrite(int i10, d1 d1Var) {
            MemoryComponentProvider.this.getSyncEngine().handleRejectedWrite(i10, d1Var);
        }

        public void handleRemoteEvent(RemoteEvent remoteEvent) {
            MemoryComponentProvider.this.getSyncEngine().handleRemoteEvent(remoteEvent);
        }

        public void handleSuccessfulWrite(MutationBatchResult mutationBatchResult) {
            MemoryComponentProvider.this.getSyncEngine().handleSuccessfulWrite(mutationBatchResult);
        }
    }

    /* access modifiers changed from: protected */
    public AndroidConnectivityMonitor createConnectivityMonitor(ComponentProvider.Configuration configuration) {
        return new AndroidConnectivityMonitor(configuration.getContext());
    }

    /* access modifiers changed from: protected */
    public EventManager createEventManager(ComponentProvider.Configuration configuration) {
        return new EventManager(getSyncEngine());
    }

    /* access modifiers changed from: protected */
    public GarbageCollectionScheduler createGarbageCollectionScheduler(ComponentProvider.Configuration configuration) {
        return null;
    }

    /* access modifiers changed from: protected */
    public LocalStore createLocalStore(ComponentProvider.Configuration configuration) {
        return new LocalStore(getPersistence(), new DefaultQueryEngine(), configuration.getInitialUser());
    }

    /* access modifiers changed from: protected */
    public Persistence createPersistence(ComponentProvider.Configuration configuration) {
        return MemoryPersistence.createEagerGcMemoryPersistence();
    }

    /* access modifiers changed from: protected */
    public RemoteStore createRemoteStore(ComponentProvider.Configuration configuration) {
        return new RemoteStore(new b(), getLocalStore(), configuration.getDatastore(), configuration.getAsyncQueue(), getConnectivityMonitor());
    }

    /* access modifiers changed from: protected */
    public SyncEngine createSyncEngine(ComponentProvider.Configuration configuration) {
        return new SyncEngine(getLocalStore(), getRemoteStore(), configuration.getInitialUser(), configuration.getMaxConcurrentLimboResolutions());
    }
}
