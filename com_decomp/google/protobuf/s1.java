package com.google.protobuf;

import java.util.List;

public class s1 extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private final List f8740e = null;

    public s1(t0 t0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public d0 a() {
        return new d0(getMessage());
    }
}
