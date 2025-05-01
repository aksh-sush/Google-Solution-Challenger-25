package com.onesignal.inAppMessages.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import db.g;
import e8.c;
import e8.j;
import java.util.Collection;
import java.util.Map;

public final class l implements j {
    public static final a Companion = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Throwable getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }
    }

    public Void addClickListener(c cVar) {
        db.l.e(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    public Void addLifecycleListener(e8.g gVar) {
        db.l.e(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    public Void addTrigger(String str, String str2) {
        db.l.e(str, "key");
        db.l.e(str2, FirebaseAnalytics.Param.VALUE);
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> map) {
        db.l.e(map, "triggers");
        throw Companion.getEXCEPTION();
    }

    public Void clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    public Void removeClickListener(c cVar) {
        db.l.e(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    public Void removeLifecycleListener(e8.g gVar) {
        db.l.e(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    public Void removeTrigger(String str) {
        db.l.e(str, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> collection) {
        db.l.e(collection, "keys");
        throw Companion.getEXCEPTION();
    }

    public void setPaused(boolean z10) {
        throw Companion.getEXCEPTION();
    }
}
