package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.SyncEngine;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import fa.d1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class EventManager implements SyncEngine.c {
    private OnlineState onlineState = OnlineState.UNKNOWN;
    private final Map<Query, a> queries;
    private final Set<EventListener<Void>> snapshotsInSyncListeners = new HashSet();
    private final SyncEngine syncEngine;

    public static class ListenOptions {
        public boolean includeDocumentMetadataChanges;
        public boolean includeQueryMetadataChanges;
        public boolean waitForSyncWhenOnline;
    }

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f7835a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ViewSnapshot f7836b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f7837c;

        a() {
        }
    }

    public EventManager(SyncEngine syncEngine2) {
        this.syncEngine = syncEngine2;
        this.queries = new HashMap();
        syncEngine2.setCallback(this);
    }

    private void raiseSnapshotsInSyncEvent() {
        for (EventListener<Void> onEvent : this.snapshotsInSyncListeners) {
            onEvent.onEvent(null, (FirebaseFirestoreException) null);
        }
    }

    public int addQueryListener(QueryListener queryListener) {
        Query query = queryListener.getQuery();
        a aVar = this.queries.get(query);
        boolean z10 = aVar == null;
        if (z10) {
            aVar = new a();
            this.queries.put(query, aVar);
        }
        aVar.f7835a.add(queryListener);
        Assert.hardAssert(true ^ queryListener.onOnlineStateChanged(this.onlineState), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (aVar.f7836b != null && queryListener.onViewSnapshot(aVar.f7836b)) {
            raiseSnapshotsInSyncEvent();
        }
        if (z10) {
            int unused = aVar.f7837c = this.syncEngine.listen(query);
        }
        return aVar.f7837c;
    }

    public void addSnapshotsInSyncListener(EventListener<Void> eventListener) {
        this.snapshotsInSyncListeners.add(eventListener);
        eventListener.onEvent(null, (FirebaseFirestoreException) null);
    }

    public void handleOnlineStateChange(OnlineState onlineState2) {
        this.onlineState = onlineState2;
        boolean z10 = false;
        for (a a10 : this.queries.values()) {
            for (QueryListener onOnlineStateChanged : a10.f7835a) {
                if (onOnlineStateChanged.onOnlineStateChanged(onlineState2)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            raiseSnapshotsInSyncEvent();
        }
    }

    public void onError(Query query, d1 d1Var) {
        a aVar = this.queries.get(query);
        if (aVar != null) {
            for (QueryListener onError : aVar.f7835a) {
                onError.onError(Util.exceptionFromStatus(d1Var));
            }
        }
        this.queries.remove(query);
    }

    public void onViewSnapshots(List<ViewSnapshot> list) {
        boolean z10 = false;
        for (ViewSnapshot next : list) {
            a aVar = this.queries.get(next.getQuery());
            if (aVar != null) {
                for (QueryListener onViewSnapshot : aVar.f7835a) {
                    if (onViewSnapshot.onViewSnapshot(next)) {
                        z10 = true;
                    }
                }
                ViewSnapshot unused = aVar.f7836b = next;
            }
        }
        if (z10) {
            raiseSnapshotsInSyncEvent();
        }
    }

    public void removeQueryListener(QueryListener queryListener) {
        boolean z10;
        Query query = queryListener.getQuery();
        a aVar = this.queries.get(query);
        if (aVar != null) {
            aVar.f7835a.remove(queryListener);
            z10 = aVar.f7835a.isEmpty();
        } else {
            z10 = false;
        }
        if (z10) {
            this.queries.remove(query);
            this.syncEngine.stopListening(query);
        }
    }

    public void removeSnapshotsInSyncListener(EventListener<Void> eventListener) {
        this.snapshotsInSyncListeners.remove(eventListener);
    }
}
