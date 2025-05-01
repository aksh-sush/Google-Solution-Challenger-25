package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;

public class QueryListener {
    private final EventListener<ViewSnapshot> listener;
    private OnlineState onlineState = OnlineState.UNKNOWN;
    private final EventManager.ListenOptions options;
    private final Query query;
    private boolean raisedInitialEvent = false;
    private ViewSnapshot snapshot;

    public QueryListener(Query query2, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        this.query = query2;
        this.listener = eventListener;
        this.options = listenOptions;
    }

    private void raiseInitialEvent(ViewSnapshot viewSnapshot) {
        Assert.hardAssert(!this.raisedInitialEvent, "Trying to raise initial event for second time", new Object[0]);
        ViewSnapshot fromInitialDocuments = ViewSnapshot.fromInitialDocuments(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getMutatedKeys(), viewSnapshot.isFromCache(), viewSnapshot.excludesMetadataChanges());
        this.raisedInitialEvent = true;
        this.listener.onEvent(fromInitialDocuments, (FirebaseFirestoreException) null);
    }

    private boolean shouldRaiseEvent(ViewSnapshot viewSnapshot) {
        boolean z10 = true;
        if (!viewSnapshot.getChanges().isEmpty()) {
            return true;
        }
        ViewSnapshot viewSnapshot2 = this.snapshot;
        if (viewSnapshot2 == null || viewSnapshot2.hasPendingWrites() == viewSnapshot.hasPendingWrites()) {
            z10 = false;
        }
        if (viewSnapshot.didSyncStateChange() || z10) {
            return this.options.includeQueryMetadataChanges;
        }
        return false;
    }

    private boolean shouldRaiseInitialEvent(ViewSnapshot viewSnapshot, OnlineState onlineState2) {
        Assert.hardAssert(!this.raisedInitialEvent, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!viewSnapshot.isFromCache()) {
            return true;
        }
        OnlineState onlineState3 = OnlineState.OFFLINE;
        boolean z10 = !onlineState2.equals(onlineState3);
        if (!this.options.waitForSyncWhenOnline || !z10) {
            return !viewSnapshot.getDocuments().isEmpty() || onlineState2.equals(onlineState3);
        }
        Assert.hardAssert(viewSnapshot.isFromCache(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public Query getQuery() {
        return this.query;
    }

    public void onError(FirebaseFirestoreException firebaseFirestoreException) {
        this.listener.onEvent(null, firebaseFirestoreException);
    }

    public boolean onOnlineStateChanged(OnlineState onlineState2) {
        this.onlineState = onlineState2;
        ViewSnapshot viewSnapshot = this.snapshot;
        if (viewSnapshot == null || this.raisedInitialEvent || !shouldRaiseInitialEvent(viewSnapshot, onlineState2)) {
            return false;
        }
        raiseInitialEvent(this.snapshot);
        return true;
    }

    public boolean onViewSnapshot(ViewSnapshot viewSnapshot) {
        boolean z10 = false;
        Assert.hardAssert(!viewSnapshot.getChanges().isEmpty() || viewSnapshot.didSyncStateChange(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.options.includeDocumentMetadataChanges) {
            ArrayList arrayList = new ArrayList();
            for (DocumentViewChange next : viewSnapshot.getChanges()) {
                if (next.getType() != DocumentViewChange.Type.METADATA) {
                    arrayList.add(next);
                }
            }
            viewSnapshot = new ViewSnapshot(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getOldDocuments(), arrayList, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys(), viewSnapshot.didSyncStateChange(), true);
        }
        if (!this.raisedInitialEvent) {
            if (shouldRaiseInitialEvent(viewSnapshot, this.onlineState)) {
                raiseInitialEvent(viewSnapshot);
            }
            this.snapshot = viewSnapshot;
            return z10;
        }
        if (shouldRaiseEvent(viewSnapshot)) {
            this.listener.onEvent(viewSnapshot, (FirebaseFirestoreException) null);
        }
        this.snapshot = viewSnapshot;
        return z10;
        z10 = true;
        this.snapshot = viewSnapshot;
        return z10;
    }
}
