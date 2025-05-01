package com.onesignal.notifications.internal;

import com.onesignal.notifications.h;
import com.onesignal.notifications.j;
import com.onesignal.notifications.n;
import com.onesignal.notifications.o;
import db.g;
import db.l;
import va.d;

public final class b implements n {
    public static final a Companion = new a((g) null);
    private static final Exception EXCEPTION = new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public Void addClickListener(h hVar) {
        l.e(hVar, "listener");
        throw EXCEPTION;
    }

    public Void addForegroundLifecycleListener(j jVar) {
        l.e(jVar, "listener");
        throw EXCEPTION;
    }

    public Void addPermissionObserver(o oVar) {
        l.e(oVar, "observer");
        throw EXCEPTION;
    }

    public Void clearAllNotifications() {
        throw EXCEPTION;
    }

    public boolean getCanRequestPermission() {
        throw EXCEPTION;
    }

    public boolean getPermission() {
        throw EXCEPTION;
    }

    public Void removeClickListener(h hVar) {
        l.e(hVar, "listener");
        throw EXCEPTION;
    }

    public Void removeForegroundLifecycleListener(j jVar) {
        l.e(jVar, "listener");
        throw EXCEPTION;
    }

    public Void removeGroupedNotifications(String str) {
        l.e(str, "group");
        throw EXCEPTION;
    }

    public Void removeNotification(int i10) {
        throw EXCEPTION;
    }

    public Void removePermissionObserver(o oVar) {
        l.e(oVar, "observer");
        throw EXCEPTION;
    }

    public Object requestPermission(boolean z10, d dVar) {
        throw EXCEPTION;
    }
}
