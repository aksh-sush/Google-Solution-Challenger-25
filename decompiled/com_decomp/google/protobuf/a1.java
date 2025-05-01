package com.google.protobuf;

abstract class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final y0 f8529a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final y0 f8530b = new z0();

    static y0 a() {
        return f8529a;
    }

    static y0 b() {
        return f8530b;
    }

    private static y0 c() {
        try {
            return (y0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
