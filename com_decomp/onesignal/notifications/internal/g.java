package com.onesignal.notifications.internal;

import com.onesignal.debug.internal.logging.a;
import com.onesignal.notifications.m;
import db.l;

public final class g implements m {
    private boolean isPreventDefault;
    private final c notification;

    public g(c cVar) {
        l.e(cVar, "notification");
        this.notification = cVar;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    public void preventDefault() {
        a.debug$default("NotificationWillDisplayEvent.preventDefault()", (Throwable) null, 2, (Object) null);
        this.isPreventDefault = true;
    }

    public final void setPreventDefault(boolean z10) {
        this.isPreventDefault = z10;
    }

    public c getNotification() {
        return this.notification;
    }
}
