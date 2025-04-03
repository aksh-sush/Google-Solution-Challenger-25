package com.google.protobuf;

public enum e0 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(j.class, j.class, j.f8600f),
    ENUM(r13, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: e  reason: collision with root package name */
    private final Class f8565e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f8566f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f8567g;

    private e0(Class cls, Class cls2, Object obj) {
        this.f8565e = cls;
        this.f8566f = cls2;
        this.f8567g = obj;
    }

    public Class a() {
        return this.f8566f;
    }
}
