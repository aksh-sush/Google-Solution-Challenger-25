package com.google.protobuf;

class y implements s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final y f8854a = new y();

    private y() {
    }

    public static y c() {
        return f8854a;
    }

    public r0 a(Class cls) {
        Class cls2 = z.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (r0) z.getDefaultInstance(cls.asSubclass(cls2)).buildMessageInfo();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return z.class.isAssignableFrom(cls);
    }
}
