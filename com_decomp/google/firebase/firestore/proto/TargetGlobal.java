package com.google.firebase.firestore.proto;

import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.r1;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TargetGlobal extends z implements TargetGlobalOrBuilder {
    /* access modifiers changed from: private */
    public static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile d1 PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private r1 lastRemoteSnapshotVersion_;
    private int targetCount_;

    public static final class Builder extends z.a implements TargetGlobalOrBuilder {
        private Builder() {
            super(TargetGlobal.DEFAULT_INSTANCE);
        }

        public Builder clearHighestListenSequenceNumber() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestListenSequenceNumber();
            return this;
        }

        public Builder clearHighestTargetId() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestTargetId();
            return this;
        }

        public Builder clearLastRemoteSnapshotVersion() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearLastRemoteSnapshotVersion();
            return this;
        }

        public Builder clearTargetCount() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearTargetCount();
            return this;
        }

        public long getHighestListenSequenceNumber() {
            return ((TargetGlobal) this.instance).getHighestListenSequenceNumber();
        }

        public int getHighestTargetId() {
            return ((TargetGlobal) this.instance).getHighestTargetId();
        }

        public r1 getLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).getLastRemoteSnapshotVersion();
        }

        public int getTargetCount() {
            return ((TargetGlobal) this.instance).getTargetCount();
        }

        public boolean hasLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).hasLastRemoteSnapshotVersion();
        }

        public Builder mergeLastRemoteSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((TargetGlobal) this.instance).mergeLastRemoteSnapshotVersion(r1Var);
            return this;
        }

        public Builder setHighestListenSequenceNumber(long j10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestListenSequenceNumber(j10);
            return this;
        }

        public Builder setHighestTargetId(int i10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestTargetId(i10);
            return this;
        }

        public Builder setLastRemoteSnapshotVersion(r1.b bVar) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion((r1) bVar.build());
            return this;
        }

        public Builder setTargetCount(int i10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setTargetCount(i10);
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder setLastRemoteSnapshotVersion(r1 r1Var) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion(r1Var);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8138a;

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
                f8138a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8138a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.TargetGlobal.a.<clinit>():void");
        }
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        z.registerDefaultInstance(TargetGlobal.class, targetGlobal);
    }

    private TargetGlobal() {
    }

    /* access modifiers changed from: private */
    public void clearHighestListenSequenceNumber() {
        this.highestListenSequenceNumber_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHighestTargetId() {
        this.highestTargetId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearLastRemoteSnapshotVersion() {
        this.lastRemoteSnapshotVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTargetCount() {
        this.targetCount_ = 0;
    }

    public static TargetGlobal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeLastRemoteSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        r1 r1Var2 = this.lastRemoteSnapshotVersion_;
        if (!(r1Var2 == null || r1Var2 == r1.k())) {
            r1Var = (r1) ((r1.b) r1.o(this.lastRemoteSnapshotVersion_).mergeFrom(r1Var)).buildPartial();
        }
        this.lastRemoteSnapshotVersion_ = r1Var;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream) {
        return (TargetGlobal) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(j jVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static d1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setHighestListenSequenceNumber(long j10) {
        this.highestListenSequenceNumber_ = j10;
    }

    /* access modifiers changed from: private */
    public void setHighestTargetId(int i10) {
        this.highestTargetId_ = i10;
    }

    /* access modifiers changed from: private */
    public void setLastRemoteSnapshotVersion(r1 r1Var) {
        r1Var.getClass();
        this.lastRemoteSnapshotVersion_ = r1Var;
    }

    /* access modifiers changed from: private */
    public void setTargetCount(int i10) {
        this.targetCount_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8138a[eVar.ordinal()]) {
            case 1:
                return new TargetGlobal();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\t\u0004\u0004", new Object[]{"highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (TargetGlobal.class) {
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

    public long getHighestListenSequenceNumber() {
        return this.highestListenSequenceNumber_;
    }

    public int getHighestTargetId() {
        return this.highestTargetId_;
    }

    public r1 getLastRemoteSnapshotVersion() {
        r1 r1Var = this.lastRemoteSnapshotVersion_;
        return r1Var == null ? r1.k() : r1Var;
    }

    public int getTargetCount() {
        return this.targetCount_;
    }

    public boolean hasLastRemoteSnapshotVersion() {
        return this.lastRemoteSnapshotVersion_ != null;
    }

    public static Builder newBuilder(TargetGlobal targetGlobal) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(targetGlobal);
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (TargetGlobal) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static TargetGlobal parseFrom(j jVar, r rVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static TargetGlobal parseFrom(k kVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static TargetGlobal parseFrom(k kVar, r rVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static TargetGlobal parseFrom(InputStream inputStream) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(InputStream inputStream, r rVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static TargetGlobal parseFrom(byte[] bArr) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TargetGlobal parseFrom(byte[] bArr, r rVar) {
        return (TargetGlobal) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
