package com.google.protobuf;

abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final o0 f8730a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final o0 f8731b = new p0();

    static o0 a() {
        return f8730a;
    }

    static o0 b() {
        return f8731b;
    }

    private static o0 c() {
        try {
            return (o0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
