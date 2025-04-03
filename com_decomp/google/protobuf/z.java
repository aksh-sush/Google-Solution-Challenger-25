package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.c0;
import com.google.protobuf.f;
import com.google.protobuf.t0;
import com.google.protobuf.v;
import com.google.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class z extends a {
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected u1 unknownFields = u1.c();

    public static abstract class a extends a.C0110a {
        private final z defaultInstance;
        protected z instance;
        protected boolean isBuilt = false;

        protected a(z zVar) {
            this.defaultInstance = zVar;
            this.instance = (z) zVar.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        }

        private void d(z zVar, z zVar2) {
            g1.a().e(zVar).a(zVar, zVar2);
        }

        public final z build() {
            z buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw a.C0110a.newUninitializedMessageException(buildPartial);
        }

        public z buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final a clear() {
            this.instance = (z) this.instance.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* access modifiers changed from: protected */
        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        /* access modifiers changed from: protected */
        public void copyOnWriteInternal() {
            z zVar = (z) this.instance.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
            d(zVar, this.instance);
            this.instance = zVar;
        }

        public z getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final boolean isInitialized() {
            return z.isInitialized(this.instance, false);
        }

        public a clone() {
            a newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        /* access modifiers changed from: protected */
        public a internalMergeFrom(z zVar) {
            return mergeFrom(zVar);
        }

        public a mergeFrom(k kVar, r rVar) {
            copyOnWrite();
            try {
                g1.a().e(this.instance).e(this.instance, l.Q(kVar), rVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public a mergeFrom(z zVar) {
            copyOnWrite();
            d(this.instance, zVar);
            return this;
        }

        public a mergeFrom(byte[] bArr, int i10, int i11) {
            return mergeFrom(bArr, i10, i11, r.b());
        }

        public a mergeFrom(byte[] bArr, int i10, int i11, r rVar) {
            copyOnWrite();
            try {
                g1.a().e(this.instance).g(this.instance, bArr, i10, i10 + i11, new f.a(rVar));
                return this;
            } catch (d0 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw d0.k();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }
    }

    protected static class b extends b {

        /* renamed from: b  reason: collision with root package name */
        private final z f8856b;

        public b(z zVar) {
            this.f8856b = zVar;
        }

        /* renamed from: f */
        public z b(k kVar, r rVar) {
            return z.parsePartialFrom(this.f8856b, kVar, rVar);
        }
    }

    static final class c implements v.b {

        /* renamed from: e  reason: collision with root package name */
        final c0.d f8857e;

        /* renamed from: f  reason: collision with root package name */
        final int f8858f;

        /* renamed from: g  reason: collision with root package name */
        final z1.b f8859g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f8860h;

        /* renamed from: i  reason: collision with root package name */
        final boolean f8861i;

        c(c0.d dVar, int i10, z1.b bVar, boolean z10, boolean z11) {
            this.f8857e = dVar;
            this.f8858f = i10;
            this.f8859g = bVar;
            this.f8860h = z10;
            this.f8861i = z11;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return this.f8858f - cVar.f8858f;
        }

        public boolean b() {
            return this.f8860h;
        }

        public c0.d c() {
            return this.f8857e;
        }

        public z1.b e() {
            return this.f8859g;
        }

        public t0.a g(t0.a aVar, t0 t0Var) {
            return ((a) aVar).mergeFrom((z) t0Var);
        }

        public int getNumber() {
            return this.f8858f;
        }

        public z1.c j() {
            return this.f8859g.a();
        }

        public boolean k() {
            return this.f8861i;
        }
    }

    public static class d extends p {

        /* renamed from: a  reason: collision with root package name */
        final t0 f8862a;

        /* renamed from: b  reason: collision with root package name */
        final Object f8863b;

        /* renamed from: c  reason: collision with root package name */
        final t0 f8864c;

        /* renamed from: d  reason: collision with root package name */
        final c f8865d;

        d(t0 t0Var, Object obj, t0 t0Var2, c cVar, Class cls) {
            if (t0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (cVar.e() == z1.b.MESSAGE && t0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f8862a = t0Var;
                this.f8863b = obj;
                this.f8864c = t0Var2;
                this.f8865d = cVar;
            }
        }

        public z1.b b() {
            return this.f8865d.e();
        }

        public t0 c() {
            return this.f8864c;
        }

        public int d() {
            return this.f8865d.getNumber();
        }

        public boolean e() {
            return this.f8865d.f8860h;
        }
    }

    public enum e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: private */
    public static d c(p pVar) {
        if (pVar.a()) {
            return (d) pVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static z d(z zVar) {
        if (zVar == null || zVar.isInitialized()) {
            return zVar;
        }
        throw zVar.newUninitializedMessageException().a().i(zVar);
    }

    private final void e() {
        if (this.unknownFields == u1.c()) {
            this.unknownFields = u1.n();
        }
    }

    protected static c0.a emptyBooleanList() {
        return h.i();
    }

    protected static c0.b emptyDoubleList() {
        return o.i();
    }

    protected static c0.f emptyFloatList() {
        return x.i();
    }

    protected static c0.g emptyIntList() {
        return b0.i();
    }

    protected static c0.h emptyLongList() {
        return k0.i();
    }

    protected static <E> c0.i emptyProtobufList() {
        return h1.e();
    }

    private static z f(z zVar, InputStream inputStream, r rVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            k f10 = k.f(new a.C0110a.C0111a(inputStream, k.x(read, inputStream)));
            z parsePartialFrom = parsePartialFrom(zVar, f10, rVar);
            try {
                f10.a(0);
                return parsePartialFrom;
            } catch (d0 e10) {
                throw e10.i(parsePartialFrom);
            }
        } catch (IOException e11) {
            throw new d0(e11.getMessage());
        }
    }

    private static z g(z zVar, j jVar, r rVar) {
        k z10 = jVar.z();
        z parsePartialFrom = parsePartialFrom(zVar, z10, rVar);
        try {
            z10.a(0);
            return parsePartialFrom;
        } catch (d0 e10) {
            throw e10.i(parsePartialFrom);
        }
    }

    static <T extends z> T getDefaultInstance(Class<T> cls) {
        T t10 = (z) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((z) x1.j(cls)).getDefaultInstanceForType();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static c0.a mutableCopy(c0.a aVar) {
        int size = aVar.size();
        return aVar.a(size == 0 ? 10 : size * 2);
    }

    protected static Object newMessageInfo(t0 t0Var, String str, Object[] objArr) {
        return new i1(t0Var, str, objArr);
    }

    public static <ContainingType extends t0, Type> d newRepeatedGeneratedExtension(ContainingType containingtype, t0 t0Var, c0.d dVar, int i10, z1.b bVar, boolean z10, Class cls) {
        return new d(containingtype, Collections.emptyList(), t0Var, new c(dVar, i10, bVar, true, z10), cls);
    }

    public static <ContainingType extends t0, Type> d newSingularGeneratedExtension(ContainingType containingtype, Type type, t0 t0Var, c0.d dVar, int i10, z1.b bVar, Class cls) {
        return new d(containingtype, type, t0Var, new c(dVar, i10, bVar, false, false), cls);
    }

    protected static <T extends z> T parseDelimitedFrom(T t10, InputStream inputStream) {
        return d(f(t10, inputStream, r.b()));
    }

    protected static <T extends z> T parseFrom(T t10, j jVar) {
        return d(parseFrom(t10, jVar, r.b()));
    }

    protected static <T extends z> T parsePartialFrom(T t10, k kVar) {
        return parsePartialFrom(t10, kVar, r.b());
    }

    protected static <T extends z> void registerDefaultInstance(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    /* access modifiers changed from: package-private */
    public Object buildMessageInfo() {
        return dynamicMethod(e.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z, BuilderType extends a> BuilderType createBuilder() {
        return (a) dynamicMethod(e.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(e eVar) {
        return dynamicMethod(eVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(e eVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return g1.a().e(this).f(this, (z) obj);
        }
        return false;
    }

    public final z getDefaultInstanceForType() {
        return (z) dynamicMethod(e.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final d1 getParserForType() {
        return (d1) dynamicMethod(e.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = g1.a().e(this).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int j10 = g1.a().e(this).j(this);
        this.memoizedHashCode = j10;
        return j10;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* access modifiers changed from: protected */
    public void makeImmutable() {
        g1.a().e(this).c(this);
    }

    /* access modifiers changed from: protected */
    public void mergeLengthDelimitedField(int i10, j jVar) {
        e();
        this.unknownFields.k(i10, jVar);
    }

    /* access modifiers changed from: protected */
    public final void mergeUnknownFields(u1 u1Var) {
        this.unknownFields = u1.m(this.unknownFields, u1Var);
    }

    /* access modifiers changed from: protected */
    public void mergeVarintField(int i10, int i11) {
        e();
        this.unknownFields.l(i10, i11);
    }

    public final a newBuilderForType() {
        return (a) dynamicMethod(e.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(int i10, k kVar) {
        if (z1.b(i10) == 4) {
            return false;
        }
        e();
        return this.unknownFields.i(i10, kVar);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public final a toBuilder() {
        a aVar = (a) dynamicMethod(e.NEW_BUILDER);
        aVar.mergeFrom(this);
        return aVar;
    }

    public String toString() {
        return v0.e(this, super.toString());
    }

    public void writeTo(m mVar) {
        g1.a().e(this).b(this, n.P(mVar));
    }

    protected static final <T extends z> boolean isInitialized(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.dynamicMethod(e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = g1.a().e(t10).d(t10);
        if (z10) {
            t10.dynamicMethod(e.SET_MEMOIZED_IS_INITIALIZED, d10 ? t10 : null);
        }
        return d10;
    }

    protected static c0.b mutableCopy(c0.b bVar) {
        int size = bVar.size();
        return bVar.a(size == 0 ? 10 : size * 2);
    }

    protected static <T extends z> T parseDelimitedFrom(T t10, InputStream inputStream, r rVar) {
        return d(f(t10, inputStream, rVar));
    }

    protected static <T extends z> T parseFrom(T t10, j jVar, r rVar) {
        return d(g(t10, jVar, rVar));
    }

    static <T extends z> T parsePartialFrom(T t10, k kVar, r rVar) {
        T t11 = (z) t10.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        try {
            l1 e10 = g1.a().e(t11);
            e10.e(t11, l.Q(kVar), rVar);
            e10.c(t11);
            return t11;
        } catch (IOException e11) {
            if (e11.getCause() instanceof d0) {
                throw ((d0) e11.getCause());
            }
            throw new d0(e11.getMessage()).i(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof d0) {
                throw ((d0) e12.getCause());
            }
            throw e12;
        }
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z, BuilderType extends a> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(e eVar, Object obj) {
        return dynamicMethod(eVar, obj, (Object) null);
    }

    protected static c0.f mutableCopy(c0.f fVar) {
        int size = fVar.size();
        return fVar.a(size == 0 ? 10 : size * 2);
    }

    protected static <T extends z> T parseFrom(T t10, k kVar) {
        return parseFrom(t10, kVar, r.b());
    }

    static <T extends z> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, r rVar) {
        T t11 = (z) t10.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        try {
            l1 e10 = g1.a().e(t11);
            e10.g(t11, bArr, i10, i10 + i11, new f.a(rVar));
            e10.c(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e11) {
            if (e11.getCause() instanceof d0) {
                throw ((d0) e11.getCause());
            }
            throw new d0(e11.getMessage()).i(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw d0.k().i(t11);
        }
    }

    protected static c0.g mutableCopy(c0.g gVar) {
        int size = gVar.size();
        return gVar.a(size == 0 ? 10 : size * 2);
    }

    protected static <T extends z> T parseFrom(T t10, k kVar, r rVar) {
        return d(parsePartialFrom(t10, kVar, rVar));
    }

    protected static c0.h mutableCopy(c0.h hVar) {
        int size = hVar.size();
        return hVar.a(size == 0 ? 10 : size * 2);
    }

    protected static <T extends z> T parseFrom(T t10, InputStream inputStream) {
        return d(parsePartialFrom(t10, k.f(inputStream), r.b()));
    }

    protected static <E> c0.i mutableCopy(c0.i iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    protected static <T extends z> T parseFrom(T t10, InputStream inputStream, r rVar) {
        return d(parsePartialFrom(t10, k.f(inputStream), rVar));
    }

    protected static <T extends z> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return parseFrom(t10, byteBuffer, r.b());
    }

    protected static <T extends z> T parseFrom(T t10, ByteBuffer byteBuffer, r rVar) {
        return d(parseFrom(t10, k.h(byteBuffer), rVar));
    }

    protected static <T extends z> T parseFrom(T t10, byte[] bArr) {
        return d(parsePartialFrom(t10, bArr, 0, bArr.length, r.b()));
    }

    protected static <T extends z> T parseFrom(T t10, byte[] bArr, r rVar) {
        return d(parsePartialFrom(t10, bArr, 0, bArr.length, rVar));
    }
}
