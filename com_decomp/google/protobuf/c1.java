package com.google.protobuf;

import com.google.protobuf.c0;

public enum c1 implements c0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    private static final c0.d f8547h = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f8549e;

    static class a implements c0.d {
        a() {
        }

        /* renamed from: b */
        public c1 a(int i10) {
            return c1.a(i10);
        }
    }

    static {
        f8547h = new a();
    }

    private c1(int i10) {
        this.f8549e = i10;
    }

    public static c1 a(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f8549e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
