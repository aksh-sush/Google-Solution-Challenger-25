package com.onesignal.core.internal.http.impl;

import com.onesignal.core.internal.config.a;
import db.l;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class b implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;

    public b(com.onesignal.core.internal.config.b bVar) {
        l.e(bVar, "_configModelStore");
        this._configModelStore = bVar;
    }

    public HttpURLConnection newHttpURLConnection(String str) {
        l.e(str, "url");
        URLConnection openConnection = new URL(((a) this._configModelStore.getModel()).getApiUrl() + str).openConnection();
        l.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
