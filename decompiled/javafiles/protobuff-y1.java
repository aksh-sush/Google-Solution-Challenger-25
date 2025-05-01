package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f8862a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f8863b = com.google.protobuf.d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f8864c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f8865d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f8866e = D();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f8867f = U();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f8868g = T();

    /* renamed from: h, reason: collision with root package name */
    static final long f8869h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f8870i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f8871j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f8872k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f8873l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f8874m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f8875n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f8876o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f8877p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f8878q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f8879r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f8880s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f8881t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f8882u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f8883v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f8884w;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.x1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public boolean d(Object obj, long j10) {
            return x1.f8884w ? x1.s(obj, j10) : x1.t(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public byte f(Object obj, long j10) {
            return x1.f8884w ? x1.w(obj, j10) : x1.x(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.x1.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.x1.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public void n(Object obj, long j10, boolean z10) {
            if (x1.f8884w) {
                x1.J(obj, j10, z10);
            } else {
                x1.K(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.x1.e
        public void o(Object obj, long j10, byte b10) {
            if (x1.f8884w) {
                x1.M(obj, j10, b10);
            } else {
                x1.N(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.x1.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.x1.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.x1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public boolean d(Object obj, long j10) {
            return x1.f8884w ? x1.s(obj, j10) : x1.t(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public byte f(Object obj, long j10) {
            return x1.f8884w ? x1.w(obj, j10) : x1.x(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.x1.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.x1.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.x1.e
        public void n(Object obj, long j10, boolean z10) {
            if (x1.f8884w) {
                x1.J(obj, j10, z10);
            } else {
                x1.K(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.x1.e
        public void o(Object obj, long j10, byte b10) {
            if (x1.f8884w) {
                x1.M(obj, j10, b10);
            } else {
                x1.N(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.x1.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.x1.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.x1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f8885a.copyMemory((Object) null, j10, bArr, x1.f8869h + j11, j12);
        }

        @Override // com.google.protobuf.x1.e
        public boolean d(Object obj, long j10) {
            return this.f8885a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public byte e(long j10) {
            return this.f8885a.getByte(j10);
        }

        @Override // com.google.protobuf.x1.e
        public byte f(Object obj, long j10) {
            return this.f8885a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public double g(Object obj, long j10) {
            return this.f8885a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public float h(Object obj, long j10) {
            return this.f8885a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.x1.e
        public long j(long j10) {
            return this.f8885a.getLong(j10);
        }

        @Override // com.google.protobuf.x1.e
        public void n(Object obj, long j10, boolean z10) {
            this.f8885a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.x1.e
        public void o(Object obj, long j10, byte b10) {
            this.f8885a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.x1.e
        public void p(Object obj, long j10, double d10) {
            this.f8885a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.x1.e
        public void q(Object obj, long j10, float f10) {
            this.f8885a.putFloat(obj, j10, f10);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f8885a;

        e(Unsafe unsafe) {
            this.f8885a = unsafe;
        }

        public final int a(Class cls) {
            return this.f8885a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f8885a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f8885a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f8885a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f8885a.getObject(obj, j10);
        }

        public final long m(Field field) {
            return this.f8885a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j10, boolean z10);

        public abstract void o(Object obj, long j10, byte b10);

        public abstract void p(Object obj, long j10, double d10);

        public abstract void q(Object obj, long j10, float f10);

        public final void r(Object obj, long j10, int i10) {
            this.f8885a.putInt(obj, j10, i10);
        }

        public final void s(Object obj, long j10, long j11) {
            this.f8885a.putLong(obj, j10, j11);
        }

        public final void t(Object obj, long j10, Object obj2) {
            this.f8885a.putObject(obj, j10, obj2);
        }
    }

    static {
        long k10 = k(byte[].class);
        f8869h = k10;
        f8870i = k(boolean[].class);
        f8871j = l(boolean[].class);
        f8872k = k(int[].class);
        f8873l = l(int[].class);
        f8874m = k(long[].class);
        f8875n = l(long[].class);
        f8876o = k(float[].class);
        f8877p = l(float[].class);
        f8878q = k(double[].class);
        f8879r = l(double[].class);
        f8880s = k(Object[].class);
        f8881t = l(Object[].class);
        f8882u = q(m());
        f8883v = (int) (k10 & 7);
        f8884w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static int A(Object obj, long j10) {
        return f8866e.i(obj, j10);
    }

    static long B(long j10) {
        return f8866e.j(j10);
    }

    static long C(Object obj, long j10) {
        return f8866e.k(obj, j10);
    }

    private static e D() {
        Unsafe unsafe = f8862a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f8864c) {
            return new c(unsafe);
        }
        if (f8865d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object E(Object obj, long j10) {
        return f8866e.l(obj, j10);
    }

    static Unsafe F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean G() {
        return f8868g;
    }

    static boolean H() {
        return f8867f;
    }

    static void I(Object obj, long j10, boolean z10) {
        f8866e.n(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Object obj, long j10, boolean z10) {
        N(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void L(byte[] bArr, long j10, byte b10) {
        f8866e.o(bArr, f8869h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int A = A(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        Q(obj, j11, ((255 & b10) << i10) | (A & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        Q(obj, j11, ((255 & b10) << i10) | (A(obj, j11) & (~(255 << i10))));
    }

    static void O(Object obj, long j10, double d10) {
        f8866e.p(obj, j10, d10);
    }

    static void P(Object obj, long j10, float f10) {
        f8866e.q(obj, j10, f10);
    }

    static void Q(Object obj, long j10, int i10) {
        f8866e.r(obj, j10, i10);
    }

    static void R(Object obj, long j10, long j11) {
        f8866e.s(obj, j10, j11);
    }

    static void S(Object obj, long j10, Object obj2) {
        f8866e.t(obj, j10, obj2);
    }

    private static boolean T() {
        Unsafe unsafe = f8862a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (com.google.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger.getLogger(x1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean U() {
        Unsafe unsafe = f8862a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (com.google.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger.getLogger(x1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static long i(ByteBuffer byteBuffer) {
        return f8866e.k(byteBuffer, f8882u);
    }

    static Object j(Class cls) {
        try {
            return f8862a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int k(Class cls) {
        if (f8868g) {
            return f8866e.a(cls);
        }
        return -1;
    }

    private static int l(Class cls) {
        if (f8868g) {
            return f8866e.b(cls);
        }
        return -1;
    }

    private static Field m() {
        Field p10;
        if (com.google.protobuf.d.c() && (p10 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(Buffer.class, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static void n(long j10, byte[] bArr, long j11, long j12) {
        f8866e.c(j10, bArr, j11, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean o(Class cls) {
        if (!com.google.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = f8863b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f8866e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    static boolean r(Object obj, long j10) {
        return f8866e.d(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return x(obj, j10) != 0;
    }

    static byte u(long j10) {
        return f8866e.e(j10);
    }

    static byte v(byte[] bArr, long j10) {
        return f8866e.f(bArr, f8869h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((A(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte x(Object obj, long j10) {
        return (byte) ((A(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double y(Object obj, long j10) {
        return f8866e.g(obj, j10);
    }

    static float z(Object obj, long j10) {
        return f8866e.h(obj, j10);
    }
}