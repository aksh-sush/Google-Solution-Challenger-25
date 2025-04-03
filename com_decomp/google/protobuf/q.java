package com.google.protobuf;

abstract class q {

    /* renamed from: a  reason: collision with root package name */
    static final Class f8729a = c();

    public static r a() {
        r b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : r.f8735d;
    }

    private static final r b(String str) {
        Class cls = f8729a;
        if (cls == null) {
            return null;
        }
        try {
            return (r) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
