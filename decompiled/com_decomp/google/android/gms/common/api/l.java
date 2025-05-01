package com.google.android.gms.common.api;

import q3.d;

public final class l extends UnsupportedOperationException {

    /* renamed from: e  reason: collision with root package name */
    private final d f5561e;

    public l(d dVar) {
        this.f5561e = dVar;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5561e));
    }
}
