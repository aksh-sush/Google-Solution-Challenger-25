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

abstract class x1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f8830a = F();

    /* renamed from: b  reason: collision with root package name */
    private static final Class f8831b = d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f8832c = o(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f8833d = o(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f8834e = D();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f8835f = U();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f8836g = T();

    /* renamed from: h  reason: collision with root package name */
    static final long f8837h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f8838i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f8839j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f8840k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f8841l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f8842m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f8843n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f8844o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f8845p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f8846q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f8847r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f8848s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f8849t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f8850u = q(m());

    /* renamed from: v  reason: collision with root package name */
    private static final int f8851v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f8852w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        public boolean d(Object obj, long j10) {
            return x1.f8852w ? x1.s(obj, j10) : x1.t(obj, j10);
        }

        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        public byte f(Object obj, long j10) {
            return x1.f8852w ? x1.w(obj, j10) : x1.x(obj, j10);
        }

        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        public void n(Object obj, long j10, boolean z10) {
            if (x1.f8852w) {
                x1.J(obj, j10, z10);
            } else {
                x1.K(obj, j10, z10);
            }
        }

        public void o(Object obj, long j10, byte b10) {
            if (x1.f8852w) {
                x1.M(obj, j10, b10);
            } else {
                x1.N(obj, j10, b10);
            }
        }

        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        public boolean d(Object obj, long j10) {
            return x1.f8852w ? x1.s(obj, j10) : x1.t(obj, j10);
        }

        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        public byte f(Object obj, long j10) {
            return x1.f8852w ? x1.w(obj, j10) : x1.x(obj, j10);
        }

        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        public void n(Object obj, long j10, boolean z10) {
            if (x1.f8852w) {
                x1.J(obj, j10, z10);
            } else {
                x1.K(obj, j10, z10);
            }
        }

        public void o(Object obj, long j10, byte b10) {
            if (x1.f8852w) {
                x1.M(obj, j10, b10);
            } else {
                x1.N(obj, j10, b10);
            }
        }

        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f8853a.copyMemory((Object) null, j10, bArr, x1.f8837h + j11, j12);
        }

        public boolean d(Object obj, long j10) {
            return this.f8853a.getBoolean(obj, j10);
        }

        public byte e(long j10) {
            return this.f8853a.getByte(j10);
        }

        public byte f(Object obj, long j10) {
            return this.f8853a.getByte(obj, j10);
        }

        public double g(Object obj, long j10) {
            return this.f8853a.getDouble(obj, j10);
        }

        public float h(Object obj, long j10) {
            return this.f8853a.getFloat(obj, j10);
        }

        public long j(long j10) {
            return this.f8853a.getLong(j10);
        }

        public void n(Object obj, long j10, boolean z10) {
            this.f8853a.putBoolean(obj, j10, z10);
        }

        public void o(Object obj, long j10, byte b10) {
            this.f8853a.putByte(obj, j10, b10);
        }

        public void p(Object obj, long j10, double d10) {
            this.f8853a.putDouble(obj, j10, d10);
        }

        public void q(Object obj, long j10, float f10) {
            this.f8853a.putFloat(obj, j10, f10);
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f8853a;

        e(Unsafe unsafe) {
            this.f8853a = unsafe;
        }

        public final int a(Class cls) {
            return this.f8853a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f8853a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f8853a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f8853a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f8853a.getObject(obj, j10);
        }

        public final long m(Field field) {
            return this.f8853a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j10, boolean z10);

        public abstract void o(Object obj, long j10, byte b10);

        public abstract void p(Object obj, long j10, double d10);

        public abstract void q(Object obj, long j10, float f10);

        public final void r(Object obj, long j10, int i10) {
            this.f8853a.putInt(obj, j10, i10);
        }

        public final void s(Object obj, long j10, long j11) {
            this.f8853a.putLong(obj, j10, j11);
        }

        public final void t(Object obj, long j10, Object obj2) {
            this.f8853a.putObject(obj, j10, obj2);
        }
    }

    static {
        long k10 = (long) k(byte[].class);
        f8837h = k10;
        Class<boolean[]> cls = boolean[].class;
        f8838i = (long) k(cls);
        f8839j = (long) l(cls);
        Class<int[]> cls2 = int[].class;
        f8840k = (long) k(cls2);
        f8841l = (long) l(cls2);
        Class<long[]> cls3 = long[].class;
        f8842m = (long) k(cls3);
        f8843n = (long) l(cls3);
        Class<float[]> cls4 = float[].class;
        f8844o = (long) k(cls4);
        f8845p = (long) l(cls4);
        Class<double[]> cls5 = double[].class;
        f8846q = (long) k(cls5);
        f8847r = (long) l(cls5);
        Class<Object[]> cls6 = Object[].class;
        f8848s = (long) k(cls6);
        f8849t = (long) l(cls6);
        f8851v = (int) (k10 & 7);
    }

    static int A(Object obj, long j10) {
        return f8834e.i(obj, j10);
    }

    static long B(long j10) {
        return f8834e.j(j10);
    }

    static long C(Object obj, long j10) {
        return f8834e.k(obj, j10);
    }

    private static e D() {
        Unsafe unsafe = f8830a;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f8832c) {
            return new c(unsafe);
        }
        if (f8833d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object E(Object obj, long j10) {
        return f8834e.l(obj, j10);
    }

    static Unsafe F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean G() {
        return f8836g;
    }

    static boolean H() {
        return f8835f;
    }

    static void I(Object obj, long j10, boolean z10) {
        f8834e.n(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void K(Object obj, long j10, boolean z10) {
        N(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void L(byte[] bArr, long j10, byte b10) {
        f8834e.o(bArr, f8837h + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int A = A(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        Q(obj, j11, ((255 & b10) << i10) | (A & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void N(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        Q(obj, j11, ((255 & b10) << i10) | (A(obj, j11) & (~(255 << i10))));
    }

    static void O(Object obj, long j10, double d10) {
        f8834e.p(obj, j10, d10);
    }

    static void P(Object obj, long j10, float f10) {
        f8834e.q(obj, j10, f10);
    }

    static void Q(Object obj, long j10, int i10) {
        f8834e.r(obj, j10, i10);
    }

    static void R(Object obj, long j10, long j11) {
        f8834e.s(obj, j10, j11);
    }

    static void S(Object obj, long j10, Object obj2) {
        f8834e.t(obj, j10, obj2);
    }

    private static boolean T() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f8830a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            if (d.c()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(x1.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean U() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f8830a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m() == null) {
                return false;
            }
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(x1.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static long i(ByteBuffer byteBuffer) {
        return f8834e.k(byteBuffer, f8850u);
    }

    static Object j(Class cls) {
        try {
            return f8830a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int k(Class cls) {
        if (f8836g) {
            return f8834e.a(cls);
        }
        return -1;
    }

    private static int l(Class cls) {
        if (f8836g) {
            return f8834e.b(cls);
        }
        return -1;
    }

    private static Field m() {
        Field p10;
        Class<Buffer> cls = Buffer.class;
        if (d.c() && (p10 = p(cls, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(cls, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static void n(long j10, byte[] bArr, long j11, long j12) {
        f8834e.c(j10, bArr, j11, j12);
    }

    private static boolean o(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class cls3 = f8831b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
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
        if (field == null || (eVar = f8834e) == null) {
            return -1;
        }
        return eVar.m(field);
    }

    static boolean r(Object obj, long j10) {
        return f8834e.d(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return x(obj, j10) != 0;
    }

    static byte u(long j10) {
        return f8834e.e(j10);
    }

    static byte v(byte[] bArr, long j10) {
        return f8834e.f(bArr, f8837h + j10);
    }

    /* access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((A(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte x(Object obj, long j10) {
        return (byte) ((A(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double y(Object obj, long j10) {
        return f8834e.g(obj, j10);
    }

    static float z(Object obj, long j10) {
        return f8834e.h(obj, j10);
    }
}
