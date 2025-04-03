package com.google.firebase.firestore.proto;

import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.r1;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UnknownDocument extends z implements UnknownDocumentOrBuilder {
    /* access modifiers changed from: private */
    public static final UnknownDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile d1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private r1 version_;

    public static final class Builder extends z.a implements UnknownDocumentOrBuilder {
        private Builder() {
            super(UnknownDocument.DEFAULT_INSTANCE);
        }

        public Builder clearName() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearVersion();
            return this;
        }

        public String getName() {
            return ((UnknownDocument) this.instance).getName();
        }

        public j getNameBytes() {
            return ((UnknownDocument) this.instance).getNameBytes();
        }

        public r1 getVersion() {
            return ((UnknownDocument) this.instance).getVersion();
        }

        public boolean hasVersion() {
            return ((UnknownDocument) this.instance).hasVersion();
        }

        public Builder mergeVersion(r1 r1Var) {
            copyOnWrite();
            ((UnknownDocument) this.instance).mergeVersion(r1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setVersion(r1.b bVar) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion((r1) bVar.build());
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder setVersion(r1 r1Var) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion(r1Var);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8139a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z$e[] r0 = com.google.protobuf.z.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8139a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8139a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.UnknownDocument.a.<clinit>():void");
        }
    }

    static {
        UnknownDocument unknownDocument = new UnknownDocument();
        DEFAULT_INSTANCE = unknownDocument;
        z.registerDefaultInstance(UnknownDocument.class, unknownDocument);
    }

    private UnknownDocument() {
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    public static UnknownDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeVersion(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.version_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.version_).mergeFrom(r1Var)).buildPartial();
        }
        this.version_ = r1Var;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream) {
        return (UnknownDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(j jVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static d1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameBytes(j jVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(jVar);
        this.name_ = jVar.L();
    }

    /* access modifiers changed from: private */
    public void setVersion(r1 r1Var) {
        r1Var.getClass();
        this.version_ = r1Var;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8139a[eVar.ordinal()]) {
            case 1:
                return new UnknownDocument();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (UnknownDocument.class) {
                        d1Var = PARSER;
                        if (d1Var == null) {
                            d1Var = new z.b(DEFAULT_INSTANCE);
                            PARSER = d1Var;
                        }
                    }
                }
                return d1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getName() {
        return this.name_;
    }

    public j getNameBytes() {
        return j.q(this.name_);
    }

    public r1 getVersion() {
        r1 r1Var = this.version_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public static Builder newBuilder(UnknownDocument unknownDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(unknownDocument);
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (UnknownDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static UnknownDocument parseFrom(j jVar, r rVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static UnknownDocument parseFrom(k kVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static UnknownDocument parseFrom(k kVar, r rVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static UnknownDocument parseFrom(InputStream inputStream) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(InputStream inputStream, r rVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static UnknownDocument parseFrom(byte[] bArr) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UnknownDocument parseFrom(byte[] bArr, r rVar) {
        return (UnknownDocument) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
