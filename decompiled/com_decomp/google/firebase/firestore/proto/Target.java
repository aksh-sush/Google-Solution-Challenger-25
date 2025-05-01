package com.google.firebase.firestore.proto;

import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.r1;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import t5.u;

public final class Target extends z implements TargetOrBuilder {
    /* access modifiers changed from: private */
    public static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile d1 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private r1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private j resumeToken_ = j.f8600f;
    private r1 snapshotVersion_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    public static final class Builder extends z.a implements TargetOrBuilder {
        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder clearDocuments() {
            copyOnWrite();
            ((Target) this.instance).clearDocuments();
            return this;
        }

        public Builder clearLastLimboFreeSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearLastLimboFreeSnapshotVersion();
            return this;
        }

        public Builder clearLastListenSequenceNumber() {
            copyOnWrite();
            ((Target) this.instance).clearLastListenSequenceNumber();
            return this;
        }

        public Builder clearQuery() {
            copyOnWrite();
            ((Target) this.instance).clearQuery();
            return this;
        }

        public Builder clearResumeToken() {
            copyOnWrite();
            ((Target) this.instance).clearResumeToken();
            return this;
        }

        public Builder clearSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearSnapshotVersion();
            return this;
        }

        public Builder clearTargetId() {
            copyOnWrite();
            ((Target) this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            copyOnWrite();
            ((Target) this.instance).clearTargetType();
            return this;
        }

        public u.c getDocuments() {
            return ((Target) this.instance).getDocuments();
        }

        public r1 getLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).getLastLimboFreeSnapshotVersion();
        }

        public long getLastListenSequenceNumber() {
            return ((Target) this.instance).getLastListenSequenceNumber();
        }

        public u.d getQuery() {
            return ((Target) this.instance).getQuery();
        }

        public j getResumeToken() {
            return ((Target) this.instance).getResumeToken();
        }

        public r1 getSnapshotVersion() {
            return ((Target) this.instance).getSnapshotVersion();
        }

        public int getTargetId() {
            return ((Target) this.instance).getTargetId();
        }

        public TargetTypeCase getTargetTypeCase() {
            return ((Target) this.instance).getTargetTypeCase();
        }

        public boolean hasDocuments() {
            return ((Target) this.instance).hasDocuments();
        }

        public boolean hasLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).hasLastLimboFreeSnapshotVersion();
        }

        public boolean hasQuery() {
            return ((Target) this.instance).hasQuery();
        }

        public boolean hasSnapshotVersion() {
            return ((Target) this.instance).hasSnapshotVersion();
        }

        public Builder mergeDocuments(u.c cVar) {
            copyOnWrite();
            ((Target) this.instance).mergeDocuments(cVar);
            return this;
        }

        public Builder mergeLastLimboFreeSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((Target) this.instance).mergeLastLimboFreeSnapshotVersion(r1Var);
            return this;
        }

        public Builder mergeQuery(u.d dVar) {
            copyOnWrite();
            ((Target) this.instance).mergeQuery(dVar);
            return this;
        }

        public Builder mergeSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((Target) this.instance).mergeSnapshotVersion(r1Var);
            return this;
        }

        public Builder setDocuments(u.c.a aVar) {
            copyOnWrite();
            ((Target) this.instance).setDocuments((u.c) aVar.build());
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(r1.b bVar) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion((r1) bVar.build());
            return this;
        }

        public Builder setLastListenSequenceNumber(long j10) {
            copyOnWrite();
            ((Target) this.instance).setLastListenSequenceNumber(j10);
            return this;
        }

        public Builder setQuery(u.d.a aVar) {
            copyOnWrite();
            ((Target) this.instance).setQuery((u.d) aVar.build());
            return this;
        }

        public Builder setResumeToken(j jVar) {
            copyOnWrite();
            ((Target) this.instance).setResumeToken(jVar);
            return this;
        }

        public Builder setSnapshotVersion(r1.b bVar) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion((r1) bVar.build());
            return this;
        }

        public Builder setTargetId(int i10) {
            copyOnWrite();
            ((Target) this.instance).setTargetId(i10);
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder setDocuments(u.c cVar) {
            copyOnWrite();
            ((Target) this.instance).setDocuments(cVar);
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion(r1Var);
            return this;
        }

        public Builder setQuery(u.d dVar) {
            copyOnWrite();
            ((Target) this.instance).setQuery(dVar);
            return this;
        }

        public Builder setSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion(r1Var);
            return this;
        }
    }

    public enum TargetTypeCase {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);
        
        private final int value;

        private TargetTypeCase(int i10) {
            this.value = i10;
        }

        public static TargetTypeCase forNumber(int i10) {
            if (i10 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i10 == 5) {
                return QUERY;
            }
            if (i10 != 6) {
                return null;
            }
            return DOCUMENTS;
        }

        @Deprecated
        public static TargetTypeCase valueOf(int i10) {
            return forNumber(i10);
        }

        public int getNumber() {
            return this.value;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8137a;

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
                f8137a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8137a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.Target.a.<clinit>():void");
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        z.registerDefaultInstance(Target.class, target);
    }

    private Target() {
    }

    /* access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 6) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearLastLimboFreeSnapshotVersion() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLastListenSequenceNumber() {
        this.lastListenSequenceNumber_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 5) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* access modifiers changed from: private */
    public void clearSnapshotVersion() {
        this.snapshotVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeDocuments(u.c cVar) {
        cVar.getClass();
        com.google.protobuf.a aVar = cVar;
        if (this.targetTypeCase_ == 6) {
            aVar = cVar;
            if (this.targetType_ != u.c.l()) {
                aVar = ((u.c.a) u.c.p((u.c) this.targetType_).mergeFrom(cVar)).buildPartial();
            }
        }
        this.targetType_ = aVar;
        this.targetTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void mergeLastLimboFreeSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.lastLimboFreeSnapshotVersion_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.lastLimboFreeSnapshotVersion_).mergeFrom(r1Var)).buildPartial();
        }
        this.lastLimboFreeSnapshotVersion_ = r1Var;
    }

    /* access modifiers changed from: private */
    public void mergeQuery(u.d dVar) {
        dVar.getClass();
        com.google.protobuf.a aVar = dVar;
        if (this.targetTypeCase_ == 5) {
            aVar = dVar;
            if (this.targetType_ != u.d.k()) {
                aVar = ((u.d.a) u.d.o((u.d) this.targetType_).mergeFrom(dVar)).buildPartial();
            }
        }
        this.targetType_ = aVar;
        this.targetTypeCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void mergeSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.snapshotVersion_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.snapshotVersion_).mergeFrom(r1Var)).buildPartial();
        }
        this.snapshotVersion_ = r1Var;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Target parseDelimitedFrom(InputStream inputStream) {
        return (Target) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(j jVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static d1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDocuments(u.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void setLastLimboFreeSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = r1Var;
    }

    /* access modifiers changed from: private */
    public void setLastListenSequenceNumber(long j10) {
        this.lastListenSequenceNumber_ = j10;
    }

    /* access modifiers changed from: private */
    public void setQuery(u.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void setResumeToken(j jVar) {
        jVar.getClass();
        this.resumeToken_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        this.snapshotVersion_ = r1Var;
    }

    /* access modifiers changed from: private */
    public void setTargetId(int i10) {
        this.targetId_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8137a[eVar.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", u.d.class, u.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (Target.class) {
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

    public u.c getDocuments() {
        return this.targetTypeCase_ == 6 ? (u.c) this.targetType_ : u.c.l();
    }

    public r1 getLastLimboFreeSnapshotVersion() {
        r1 r1Var = this.lastLimboFreeSnapshotVersion_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public long getLastListenSequenceNumber() {
        return this.lastListenSequenceNumber_;
    }

    public u.d getQuery() {
        return this.targetTypeCase_ == 5 ? (u.d) this.targetType_ : u.d.k();
    }

    public j getResumeToken() {
        return this.resumeToken_;
    }

    public r1 getSnapshotVersion() {
        r1 r1Var = this.snapshotVersion_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber(this.targetTypeCase_);
    }

    public boolean hasDocuments() {
        return this.targetTypeCase_ == 6;
    }

    public boolean hasLastLimboFreeSnapshotVersion() {
        return this.lastLimboFreeSnapshotVersion_ != null;
    }

    public boolean hasQuery() {
        return this.targetTypeCase_ == 5;
    }

    public boolean hasSnapshotVersion() {
        return this.snapshotVersion_ != null;
    }

    public static Builder newBuilder(Target target) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (Target) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static Target parseFrom(j jVar, r rVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static Target parseFrom(k kVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Target parseFrom(k kVar, r rVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static Target parseFrom(InputStream inputStream) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(InputStream inputStream, r rVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static Target parseFrom(byte[] bArr) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Target parseFrom(byte[] bArr, r rVar) {
        return (Target) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
