package com.google.firebase.firestore.proto;

import com.google.protobuf.c0;
import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.r1;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import t5.y;

public final class WriteBatch extends z implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile d1 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private c0.i baseWrites_ = z.emptyProtobufList();
    private int batchId_;
    private r1 localWriteTime_;
    private c0.i writes_ = z.emptyProtobufList();

    public static final class Builder extends z.a implements WriteBatchOrBuilder {
        private Builder() {
            super(WriteBatch.DEFAULT_INSTANCE);
        }

        public Builder addAllBaseWrites(Iterable<? extends y> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllBaseWrites(iterable);
            return this;
        }

        public Builder addAllWrites(Iterable<? extends y> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllWrites(iterable);
            return this;
        }

        public Builder addBaseWrites(int i10, y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i10, (y) bVar.build());
            return this;
        }

        public Builder addWrites(int i10, y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i10, (y) bVar.build());
            return this;
        }

        public Builder clearBaseWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBaseWrites();
            return this;
        }

        public Builder clearBatchId() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBatchId();
            return this;
        }

        public Builder clearLocalWriteTime() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearLocalWriteTime();
            return this;
        }

        public Builder clearWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearWrites();
            return this;
        }

        public y getBaseWrites(int i10) {
            return ((WriteBatch) this.instance).getBaseWrites(i10);
        }

        public int getBaseWritesCount() {
            return ((WriteBatch) this.instance).getBaseWritesCount();
        }

        public List<y> getBaseWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getBaseWritesList());
        }

        public int getBatchId() {
            return ((WriteBatch) this.instance).getBatchId();
        }

        public r1 getLocalWriteTime() {
            return ((WriteBatch) this.instance).getLocalWriteTime();
        }

        public y getWrites(int i10) {
            return ((WriteBatch) this.instance).getWrites(i10);
        }

        public int getWritesCount() {
            return ((WriteBatch) this.instance).getWritesCount();
        }

        public List<y> getWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getWritesList());
        }

        public boolean hasLocalWriteTime() {
            return ((WriteBatch) this.instance).hasLocalWriteTime();
        }

        public Builder mergeLocalWriteTime(r1 r1Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).mergeLocalWriteTime(r1Var);
            return this;
        }

        public Builder removeBaseWrites(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeBaseWrites(i10);
            return this;
        }

        public Builder removeWrites(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeWrites(i10);
            return this;
        }

        public Builder setBaseWrites(int i10, y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i10, (y) bVar.build());
            return this;
        }

        public Builder setBatchId(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBatchId(i10);
            return this;
        }

        public Builder setLocalWriteTime(r1.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime((r1) bVar.build());
            return this;
        }

        public Builder setWrites(int i10, y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i10, (y) bVar.build());
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addBaseWrites(int i10, y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i10, yVar);
            return this;
        }

        public Builder addWrites(int i10, y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i10, yVar);
            return this;
        }

        public Builder setBaseWrites(int i10, y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i10, yVar);
            return this;
        }

        public Builder setLocalWriteTime(r1 r1Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime(r1Var);
            return this;
        }

        public Builder setWrites(int i10, y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i10, yVar);
            return this;
        }

        public Builder addBaseWrites(y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites((y) bVar.build());
            return this;
        }

        public Builder addWrites(y.b bVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites((y) bVar.build());
            return this;
        }

        public Builder addBaseWrites(y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(yVar);
            return this;
        }

        public Builder addWrites(y yVar) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(yVar);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8140a;

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
                f8140a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8140a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.WriteBatch.a.<clinit>():void");
        }
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        z.registerDefaultInstance(WriteBatch.class, writeBatch);
    }

    private WriteBatch() {
    }

    /* access modifiers changed from: private */
    public void addAllBaseWrites(Iterable<? extends y> iterable) {
        ensureBaseWritesIsMutable();
        com.google.protobuf.a.addAll(iterable, this.baseWrites_);
    }

    /* access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends y> iterable) {
        ensureWritesIsMutable();
        com.google.protobuf.a.addAll(iterable, this.writes_);
    }

    /* access modifiers changed from: private */
    public void addBaseWrites(int i10, y yVar) {
        yVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(i10, yVar);
    }

    /* access modifiers changed from: private */
    public void addWrites(int i10, y yVar) {
        yVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i10, yVar);
    }

    /* access modifiers changed from: private */
    public void clearBaseWrites() {
        this.baseWrites_ = z.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearBatchId() {
        this.batchId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearLocalWriteTime() {
        this.localWriteTime_ = null;
    }

    /* access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = z.emptyProtobufList();
    }

    private void ensureBaseWritesIsMutable() {
        c0.i iVar = this.baseWrites_;
        if (!iVar.T()) {
            this.baseWrites_ = z.mutableCopy(iVar);
        }
    }

    private void ensureWritesIsMutable() {
        c0.i iVar = this.writes_;
        if (!iVar.T()) {
            this.writes_ = z.mutableCopy(iVar);
        }
    }

    public static WriteBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeLocalWriteTime(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.localWriteTime_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.localWriteTime_).mergeFrom(r1Var)).buildPartial();
        }
        this.localWriteTime_ = r1Var;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream) {
        return (WriteBatch) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(j jVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static d1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeBaseWrites(int i10) {
        ensureBaseWritesIsMutable();
        this.baseWrites_.remove(i10);
    }

    /* access modifiers changed from: private */
    public void removeWrites(int i10) {
        ensureWritesIsMutable();
        this.writes_.remove(i10);
    }

    /* access modifiers changed from: private */
    public void setBaseWrites(int i10, y yVar) {
        yVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.set(i10, yVar);
    }

    /* access modifiers changed from: private */
    public void setBatchId(int i10) {
        this.batchId_ = i10;
    }

    /* access modifiers changed from: private */
    public void setLocalWriteTime(r1 r1Var) {
        r1Var.getClass();
        this.localWriteTime_ = r1Var;
    }

    /* access modifiers changed from: private */
    public void setWrites(int i10, y yVar) {
        yVar.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i10, yVar);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8140a[eVar.ordinal()]) {
            case 1:
                return new WriteBatch();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", y.class, "localWriteTime_", "baseWrites_", y.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (WriteBatch.class) {
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

    public y getBaseWrites(int i10) {
        return (y) this.baseWrites_.get(i10);
    }

    public int getBaseWritesCount() {
        return this.baseWrites_.size();
    }

    public List<y> getBaseWritesList() {
        return this.baseWrites_;
    }

    public t5.z getBaseWritesOrBuilder(int i10) {
        return (t5.z) this.baseWrites_.get(i10);
    }

    public List<? extends t5.z> getBaseWritesOrBuilderList() {
        return this.baseWrites_;
    }

    public int getBatchId() {
        return this.batchId_;
    }

    public r1 getLocalWriteTime() {
        r1 r1Var = this.localWriteTime_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public y getWrites(int i10) {
        return (y) this.writes_.get(i10);
    }

    public int getWritesCount() {
        return this.writes_.size();
    }

    public List<y> getWritesList() {
        return this.writes_;
    }

    public t5.z getWritesOrBuilder(int i10) {
        return (t5.z) this.writes_.get(i10);
    }

    public List<? extends t5.z> getWritesOrBuilderList() {
        return this.writes_;
    }

    public boolean hasLocalWriteTime() {
        return this.localWriteTime_ != null;
    }

    /* access modifiers changed from: private */
    public void addBaseWrites(y yVar) {
        yVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(yVar);
    }

    /* access modifiers changed from: private */
    public void addWrites(y yVar) {
        yVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(yVar);
    }

    public static Builder newBuilder(WriteBatch writeBatch) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(writeBatch);
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (WriteBatch) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static WriteBatch parseFrom(j jVar, r rVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static WriteBatch parseFrom(k kVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static WriteBatch parseFrom(k kVar, r rVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static WriteBatch parseFrom(InputStream inputStream) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(InputStream inputStream, r rVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static WriteBatch parseFrom(byte[] bArr) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteBatch parseFrom(byte[] bArr, r rVar) {
        return (WriteBatch) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
