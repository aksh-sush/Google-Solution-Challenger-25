package com.google.firebase.firestore.proto;

import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.r1;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class NoDocument extends z implements NoDocumentOrBuilder {
    /* access modifiers changed from: private */
    public static final NoDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile d1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private String name_ = "";
    private r1 readTime_;

    public static final class Builder extends z.a implements NoDocumentOrBuilder {
        private Builder() {
            super(NoDocument.DEFAULT_INSTANCE);
        }

        public Builder clearName() {
            copyOnWrite();
            ((NoDocument) this.instance).clearName();
            return this;
        }

        public Builder clearReadTime() {
            copyOnWrite();
            ((NoDocument) this.instance).clearReadTime();
            return this;
        }

        public String getName() {
            return ((NoDocument) this.instance).getName();
        }

        public j getNameBytes() {
            return ((NoDocument) this.instance).getNameBytes();
        }

        public r1 getReadTime() {
            return ((NoDocument) this.instance).getReadTime();
        }

        public boolean hasReadTime() {
            return ((NoDocument) this.instance).hasReadTime();
        }

        public Builder mergeReadTime(r1 r1Var) {
            copyOnWrite();
            ((NoDocument) this.instance).mergeReadTime(r1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((NoDocument) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((NoDocument) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setReadTime(r1.b bVar) {
            copyOnWrite();
            ((NoDocument) this.instance).setReadTime((r1) bVar.build());
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder setReadTime(r1 r1Var) {
            copyOnWrite();
            ((NoDocument) this.instance).setReadTime(r1Var);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8136a;

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
                f8136a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.NoDocument.a.<clinit>():void");
        }
    }

    static {
        NoDocument noDocument = new NoDocument();
        DEFAULT_INSTANCE = noDocument;
        z.registerDefaultInstance(NoDocument.class, noDocument);
    }

    private NoDocument() {
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
    }

    public static NoDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeReadTime(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.readTime_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.readTime_).mergeFrom(r1Var)).buildPartial();
        }
        this.readTime_ = r1Var;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NoDocument parseDelimitedFrom(InputStream inputStream) {
        return (NoDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoDocument parseFrom(j jVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, jVar);
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
    public void setReadTime(r1 r1Var) {
        r1Var.getClass();
        this.readTime_ = r1Var;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8136a[eVar.ordinal()]) {
            case 1:
                return new NoDocument();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (NoDocument.class) {
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

    public r1 getReadTime() {
        r1 r1Var = this.readTime_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static Builder newBuilder(NoDocument noDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(noDocument);
    }

    public static NoDocument parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (NoDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static NoDocument parseFrom(j jVar, r rVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static NoDocument parseFrom(k kVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static NoDocument parseFrom(k kVar, r rVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static NoDocument parseFrom(InputStream inputStream) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoDocument parseFrom(InputStream inputStream, r rVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static NoDocument parseFrom(ByteBuffer byteBuffer) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NoDocument parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static NoDocument parseFrom(byte[] bArr) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NoDocument parseFrom(byte[] bArr, r rVar) {
        return (NoDocument) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
