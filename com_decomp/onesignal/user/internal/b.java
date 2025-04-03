package com.onesignal.user.internal;

import ba.c;
import ba.g;
import com.onesignal.user.internal.subscriptions.d;
import com.onesignal.user.internal.subscriptions.f;
import db.l;

public class b extends d implements ba.b {
    private final com.onesignal.common.events.b changeHandlersNotifier = new com.onesignal.common.events.b();
    private g savedState = fetchState();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(dVar);
        l.e(dVar, "model");
    }

    private final g fetchState() {
        return new g(getId(), getToken(), getOptedIn());
    }

    public void addObserver(c cVar) {
        l.e(cVar, "observer");
        this.changeHandlersNotifier.subscribe(cVar);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != f.NO_PERMISSION;
    }

    public final g getSavedState() {
        return this.savedState;
    }

    public String getToken() {
        return getModel().getAddress();
    }

    public void optIn() {
        com.onesignal.common.modeling.g.setBooleanProperty$default(getModel(), "optedIn", true, (String) null, true, 4, (Object) null);
    }

    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final g refreshState() {
        g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    public void removeObserver(c cVar) {
        l.e(cVar, "observer");
        this.changeHandlersNotifier.unsubscribe(cVar);
    }
}
