package com.google.protobuf;

abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private static final s f8742a = new t();

    /* renamed from: b  reason: collision with root package name */
    private static final s f8743b = c();

    static s a() {
        s sVar = f8743b;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static s b() {
        return f8742a;
    }

    private static s c() {
        try {
            return (s) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
