package com.onesignal.common.modeling;

import db.l;

public final class h {
    private final g model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public h(g gVar, String str, String str2, Object obj, Object obj2) {
        l.e(gVar, "model");
        l.e(str, "path");
        l.e(str2, "property");
        this.model = gVar;
        this.path = str;
        this.property = str2;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final g getModel() {
        return this.model;
    }

    public final Object getNewValue() {
        return this.newValue;
    }

    public final Object getOldValue() {
        return this.oldValue;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }
}
