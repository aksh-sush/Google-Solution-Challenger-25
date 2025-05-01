package com.google.protobuf;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f8550a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f8551b = (a("org.robolectric.Robolectric") != null);

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f8550a;
    }

    static boolean c() {
        return f8550a != null && !f8551b;
    }
}
