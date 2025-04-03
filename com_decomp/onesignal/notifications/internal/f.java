package com.onesignal.notifications.internal;

import android.content.Context;
import com.onesignal.debug.internal.logging.a;
import com.onesignal.notifications.k;
import db.l;

public final class f implements k {
    private final Context context;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context2, c cVar) {
        l.e(context2, "context");
        l.e(cVar, "notification");
        this.context = context2;
        this.notification = cVar;
    }

    public Context getContext() {
        return this.context;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    public void preventDefault() {
        a.debug$default("NotificationReceivedEvent.preventDefault()", (Throwable) null, 2, (Object) null);
        this.isPreventDefault = true;
    }

    public final void setPreventDefault(boolean z10) {
        this.isPreventDefault = z10;
    }

    public c getNotification() {
        return this.notification;
    }
}
