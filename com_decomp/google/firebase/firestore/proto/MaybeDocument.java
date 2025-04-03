package com.google.firebase.firestore.proto;

import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.protobuf.d1;
import com.google.protobuf.j;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import t5.h;

public final class MaybeDocument extends z implements MaybeDocumentOrBuilder {
    /* access modifiers changed from: private */
    public static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile d1 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    public static final class Builder extends z.a implements MaybeDocumentOrBuilder {
        private Builder() {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }

        public Builder clearDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentType() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocumentType();
            return this;
        }

        public Builder clearHasCommittedMutations() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearHasCommittedMutations();
            return this;
        }

        public Builder clearNoDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearNoDocument();
            return this;
        }

        public Builder clearUnknownDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearUnknownDocument();
            return this;
        }

        public h getDocument() {
            return ((MaybeDocument) this.instance).getDocument();
        }

        public DocumentTypeCase getDocumentTypeCase() {
            return ((MaybeDocument) this.instance).getDocumentTypeCase();
        }

        public boolean getHasCommittedMutations() {
            return ((MaybeDocument) this.instance).getHasCommittedMutations();
        }

        public NoDocument getNoDocument() {
            return ((MaybeDocument) this.instance).getNoDocument();
        }

        public UnknownDocument getUnknownDocument() {
            return ((MaybeDocument) this.instance).getUnknownDocument();
        }

        public boolean hasDocument() {
            return ((MaybeDocument) this.instance).hasDocument();
        }

        public boolean hasNoDocument() {
            return ((MaybeDocument) this.instance).hasNoDocument();
        }

        public boolean hasUnknownDocument() {
            return ((MaybeDocument) this.instance).hasUnknownDocument();
        }

        public Builder mergeDocument(h hVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeDocument(hVar);
            return this;
        }

        public Builder mergeNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeNoDocument(noDocument);
            return this;
        }

        public Builder mergeUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeUnknownDocument(unknownDocument);
            return this;
        }

        public Builder setDocument(h.b bVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument((h) bVar.build());
            return this;
        }

        public Builder setHasCommittedMutations(boolean z10) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setHasCommittedMutations(z10);
            return this;
        }

        public Builder setNoDocument(NoDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument((NoDocument) builder.build());
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument((UnknownDocument) builder.build());
            return this;
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder setDocument(h hVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument(hVar);
            return this;
        }

        public Builder setNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument(noDocument);
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument(unknownDocument);
            return this;
        }
    }

    public enum DocumentTypeCase {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);
        
        private final int value;

        private DocumentTypeCase(int i10) {
            this.value = i10;
        }

        public static DocumentTypeCase forNumber(int i10) {
            if (i10 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i10 == 1) {
                return NO_DOCUMENT;
            }
            if (i10 == 2) {
                return DOCUMENT;
            }
            if (i10 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }

        @Deprecated
        public static DocumentTypeCase valueOf(int i10) {
            return forNumber(i10);
        }

        public int getNumber() {
            return this.value;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8134a;

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
                f8134a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8134a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.proto.MaybeDocument.a.<clinit>():void");
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        z.registerDefaultInstance(MaybeDocument.class, maybeDocument);
    }

    private MaybeDocument() {
    }

    /* access modifiers changed from: private */
    public void clearDocument() {
        if (this.documentTypeCase_ == 2) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearDocumentType() {
        this.documentTypeCase_ = 0;
        this.documentType_ = null;
    }

    /* access modifiers changed from: private */
    public void clearHasCommittedMutations() {
        this.hasCommittedMutations_ = false;
    }

    /* access modifiers changed from: private */
    public void clearNoDocument() {
        if (this.documentTypeCase_ == 1) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearUnknownDocument() {
        if (this.documentTypeCase_ == 3) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    public static MaybeDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeDocument(h hVar) {
        hVar.getClass();
        com.google.protobuf.a aVar = hVar;
        if (this.documentTypeCase_ == 2) {
            aVar = hVar;
            if (this.documentType_ != h.l()) {
                aVar = ((h.b) h.s((h) this.documentType_).mergeFrom(hVar)).buildPartial();
            }
        }
        this.documentType_ = aVar;
        this.documentTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void mergeNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        com.google.protobuf.a aVar = noDocument;
        if (this.documentTypeCase_ == 1) {
            aVar = noDocument;
            if (this.documentType_ != NoDocument.getDefaultInstance()) {
                aVar = ((NoDocument.Builder) NoDocument.newBuilder((NoDocument) this.documentType_).mergeFrom(noDocument)).buildPartial();
            }
        }
        this.documentType_ = aVar;
        this.documentTypeCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void mergeUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        com.google.protobuf.a aVar = unknownDocument;
        if (this.documentTypeCase_ == 3) {
            aVar = unknownDocument;
            if (this.documentType_ != UnknownDocument.getDefaultInstance()) {
                aVar = ((UnknownDocument.Builder) UnknownDocument.newBuilder((UnknownDocument) this.documentType_).mergeFrom(unknownDocument)).buildPartial();
            }
        }
        this.documentType_ = aVar;
        this.documentTypeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream) {
        return (MaybeDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(j jVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static d1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDocument(h hVar) {
        hVar.getClass();
        this.documentType_ = hVar;
        this.documentTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void setHasCommittedMutations(boolean z10) {
        this.hasCommittedMutations_ = z10;
    }

    /* access modifiers changed from: private */
    public void setNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        this.documentType_ = noDocument;
        this.documentTypeCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void setUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        this.documentType_ = unknownDocument;
        this.documentTypeCase_ = 3;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8134a[eVar.ordinal()]) {
            case 1:
                return new MaybeDocument();
            case 2:
                return new Builder((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, h.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (MaybeDocument.class) {
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

    public h getDocument() {
        return this.documentTypeCase_ == 2 ? (h) this.documentType_ : h.l();
    }

    public DocumentTypeCase getDocumentTypeCase() {
        return DocumentTypeCase.forNumber(this.documentTypeCase_);
    }

    public boolean getHasCommittedMutations() {
        return this.hasCommittedMutations_;
    }

    public NoDocument getNoDocument() {
        return this.documentTypeCase_ == 1 ? (NoDocument) this.documentType_ : NoDocument.getDefaultInstance();
    }

    public UnknownDocument getUnknownDocument() {
        return this.documentTypeCase_ == 3 ? (UnknownDocument) this.documentType_ : UnknownDocument.getDefaultInstance();
    }

    public boolean hasDocument() {
        return this.documentTypeCase_ == 2;
    }

    public boolean hasNoDocument() {
        return this.documentTypeCase_ == 1;
    }

    public boolean hasUnknownDocument() {
        return this.documentTypeCase_ == 3;
    }

    public static Builder newBuilder(MaybeDocument maybeDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(maybeDocument);
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream, r rVar) {
        return (MaybeDocument) z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static MaybeDocument parseFrom(j jVar, r rVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static MaybeDocument parseFrom(k kVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static MaybeDocument parseFrom(k kVar, r rVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static MaybeDocument parseFrom(InputStream inputStream) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(InputStream inputStream, r rVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer, r rVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static MaybeDocument parseFrom(byte[] bArr) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaybeDocument parseFrom(byte[] bArr, r rVar) {
        return (MaybeDocument) z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }
}
