package com.onesignal.location.internal;

import db.g;
import va.d;

public final class b implements com.onesignal.location.a {
    public static final a Companion = new a((g) null);
    private static final Exception EXCEPTION = new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public boolean isShared() {
        throw EXCEPTION;
    }

    public Object requestPermission(d dVar) {
        throw EXCEPTION;
    }

    public void setShared(boolean z10) {
        throw EXCEPTION;
    }
}
