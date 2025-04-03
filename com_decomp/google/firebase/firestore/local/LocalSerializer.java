package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundledQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.j;
import java.util.ArrayList;
import s5.a;
import t5.h;
import t5.m;
import t5.u;
import t5.y;

public final class LocalSerializer {
    private final RemoteSerializer rpcSerializer;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7922a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7923b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.google.firebase.firestore.proto.Target$TargetTypeCase[] r0 = com.google.firebase.firestore.proto.Target.TargetTypeCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7923b = r0
                r1 = 1
                com.google.firebase.firestore.proto.Target$TargetTypeCase r2 = com.google.firebase.firestore.proto.Target.TargetTypeCase.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7923b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.proto.Target$TargetTypeCase r3 = com.google.firebase.firestore.proto.Target.TargetTypeCase.QUERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase[] r2 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7922a = r2
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r3 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f7922a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r2 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.NO_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f7922a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r1 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.UNKNOWN_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.LocalSerializer.a.<clinit>():void");
        }
    }

    public LocalSerializer(RemoteSerializer remoteSerializer) {
        this.rpcSerializer = remoteSerializer;
    }

    private MutableDocument decodeDocument(h hVar, boolean z10) {
        MutableDocument newFoundDocument = MutableDocument.newFoundDocument(this.rpcSerializer.decodeKey(hVar.getName()), this.rpcSerializer.decodeVersion(hVar.o()), ObjectValue.fromMap(hVar.m()));
        return z10 ? newFoundDocument.setHasCommittedMutations() : newFoundDocument;
    }

    private MutableDocument decodeNoDocument(NoDocument noDocument, boolean z10) {
        MutableDocument newNoDocument = MutableDocument.newNoDocument(this.rpcSerializer.decodeKey(noDocument.getName()), this.rpcSerializer.decodeVersion(noDocument.getReadTime()));
        return z10 ? newNoDocument.setHasCommittedMutations() : newNoDocument;
    }

    private MutableDocument decodeUnknownDocument(UnknownDocument unknownDocument) {
        return MutableDocument.newUnknownDocument(this.rpcSerializer.decodeKey(unknownDocument.getName()), this.rpcSerializer.decodeVersion(unknownDocument.getVersion()));
    }

    private h encodeDocument(MutableDocument mutableDocument) {
        h.b r10 = h.r();
        r10.f(this.rpcSerializer.encodeKey(mutableDocument.getKey()));
        r10.e(mutableDocument.getData().getFieldsMap());
        r10.g(this.rpcSerializer.encodeTimestamp(mutableDocument.getVersion().getTimestamp()));
        return (h) r10.build();
    }

    private NoDocument encodeNoDocument(MutableDocument mutableDocument) {
        NoDocument.Builder newBuilder = NoDocument.newBuilder();
        newBuilder.setName(this.rpcSerializer.encodeKey(mutableDocument.getKey()));
        newBuilder.setReadTime(this.rpcSerializer.encodeTimestamp(mutableDocument.getVersion().getTimestamp()));
        return (NoDocument) newBuilder.build();
    }

    private UnknownDocument encodeUnknownDocument(MutableDocument mutableDocument) {
        UnknownDocument.Builder newBuilder = UnknownDocument.newBuilder();
        newBuilder.setName(this.rpcSerializer.encodeKey(mutableDocument.getKey()));
        newBuilder.setVersion(this.rpcSerializer.encodeTimestamp(mutableDocument.getVersion().getTimestamp()));
        return (UnknownDocument) newBuilder.build();
    }

    public BundledQuery decodeBundledQuery(s5.a aVar) {
        return new BundledQuery(this.rpcSerializer.decodeQueryTarget(aVar.m(), aVar.n()), aVar.l().equals(a.c.FIRST) ? Query.LimitType.LIMIT_TO_FIRST : Query.LimitType.LIMIT_TO_LAST);
    }

    /* access modifiers changed from: package-private */
    public MutableDocument decodeMaybeDocument(MaybeDocument maybeDocument) {
        int i10 = a.f7922a[maybeDocument.getDocumentTypeCase().ordinal()];
        if (i10 == 1) {
            return decodeDocument(maybeDocument.getDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i10 == 2) {
            return decodeNoDocument(maybeDocument.getNoDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i10 == 3) {
            return decodeUnknownDocument(maybeDocument.getUnknownDocument());
        }
        throw Assert.fail("Unknown MaybeDocument %s", maybeDocument);
    }

    /* access modifiers changed from: package-private */
    public MutationBatch decodeMutationBatch(WriteBatch writeBatch) {
        int batchId = writeBatch.getBatchId();
        Timestamp decodeTimestamp = this.rpcSerializer.decodeTimestamp(writeBatch.getLocalWriteTime());
        int baseWritesCount = writeBatch.getBaseWritesCount();
        ArrayList arrayList = new ArrayList(baseWritesCount);
        for (int i10 = 0; i10 < baseWritesCount; i10++) {
            arrayList.add(this.rpcSerializer.decodeMutation(writeBatch.getBaseWrites(i10)));
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.getWritesCount());
        int i11 = 0;
        while (i11 < writeBatch.getWritesCount()) {
            y writes = writeBatch.getWrites(i11);
            int i12 = i11 + 1;
            if (i12 < writeBatch.getWritesCount() && writeBatch.getWrites(i12).z()) {
                Assert.hardAssert(writeBatch.getWrites(i11).A(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                y.b D = y.D(writes);
                for (m.c e10 : writeBatch.getWrites(i12).t().j()) {
                    D.e(e10);
                }
                arrayList2.add(this.rpcSerializer.decodeMutation((y) D.build()));
                i11 = i12;
            } else {
                arrayList2.add(this.rpcSerializer.decodeMutation(writes));
            }
            i11++;
        }
        return new MutationBatch(batchId, decodeTimestamp, arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public TargetData decodeTargetData(Target target) {
        com.google.firebase.firestore.core.Target target2;
        int targetId = target.getTargetId();
        SnapshotVersion decodeVersion = this.rpcSerializer.decodeVersion(target.getSnapshotVersion());
        SnapshotVersion decodeVersion2 = this.rpcSerializer.decodeVersion(target.getLastLimboFreeSnapshotVersion());
        j resumeToken = target.getResumeToken();
        long lastListenSequenceNumber = target.getLastListenSequenceNumber();
        int i10 = a.f7923b[target.getTargetTypeCase().ordinal()];
        if (i10 == 1) {
            target2 = this.rpcSerializer.decodeDocumentsTarget(target.getDocuments());
        } else if (i10 == 2) {
            target2 = this.rpcSerializer.decodeQueryTarget(target.getQuery());
        } else {
            throw Assert.fail("Unknown targetType %d", target.getTargetTypeCase());
        }
        return new TargetData(target2, targetId, lastListenSequenceNumber, QueryPurpose.LISTEN, decodeVersion, decodeVersion2, resumeToken);
    }

    public s5.a encodeBundledQuery(BundledQuery bundledQuery) {
        u.d encodeQueryTarget = this.rpcSerializer.encodeQueryTarget(bundledQuery.getTarget());
        a.b o10 = s5.a.o();
        o10.e(bundledQuery.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) ? a.c.FIRST : a.c.LAST);
        o10.f(encodeQueryTarget.l());
        o10.g(encodeQueryTarget.m());
        return (s5.a) o10.build();
    }

    /* access modifiers changed from: package-private */
    public MaybeDocument encodeMaybeDocument(MutableDocument mutableDocument) {
        MaybeDocument.Builder newBuilder = MaybeDocument.newBuilder();
        if (mutableDocument.isNoDocument()) {
            newBuilder.setNoDocument(encodeNoDocument(mutableDocument));
        } else if (mutableDocument.isFoundDocument()) {
            newBuilder.setDocument(encodeDocument(mutableDocument));
        } else if (mutableDocument.isUnknownDocument()) {
            newBuilder.setUnknownDocument(encodeUnknownDocument(mutableDocument));
        } else {
            throw Assert.fail("Cannot encode invalid document %s", mutableDocument);
        }
        newBuilder.setHasCommittedMutations(mutableDocument.hasCommittedMutations());
        return (MaybeDocument) newBuilder.build();
    }

    /* access modifiers changed from: package-private */
    public WriteBatch encodeMutationBatch(MutationBatch mutationBatch) {
        WriteBatch.Builder newBuilder = WriteBatch.newBuilder();
        newBuilder.setBatchId(mutationBatch.getBatchId());
        newBuilder.setLocalWriteTime(this.rpcSerializer.encodeTimestamp(mutationBatch.getLocalWriteTime()));
        for (Mutation encodeMutation : mutationBatch.getBaseMutations()) {
            newBuilder.addBaseWrites(this.rpcSerializer.encodeMutation(encodeMutation));
        }
        for (Mutation encodeMutation2 : mutationBatch.getMutations()) {
            newBuilder.addWrites(this.rpcSerializer.encodeMutation(encodeMutation2));
        }
        return (WriteBatch) newBuilder.build();
    }

    /* access modifiers changed from: package-private */
    public Target encodeTargetData(TargetData targetData) {
        QueryPurpose queryPurpose = QueryPurpose.LISTEN;
        Assert.hardAssert(queryPurpose.equals(targetData.getPurpose()), "Only queries with purpose %s may be stored, got %s", queryPurpose, targetData.getPurpose());
        Target.Builder newBuilder = Target.newBuilder();
        newBuilder.setTargetId(targetData.getTargetId()).setLastListenSequenceNumber(targetData.getSequenceNumber()).setLastLimboFreeSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getLastLimboFreeSnapshotVersion())).setSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getSnapshotVersion())).setResumeToken(targetData.getResumeToken());
        com.google.firebase.firestore.core.Target target = targetData.getTarget();
        if (target.isDocumentQuery()) {
            newBuilder.setDocuments(this.rpcSerializer.encodeDocumentsTarget(target));
        } else {
            newBuilder.setQuery(this.rpcSerializer.encodeQueryTarget(target));
        }
        return (Target) newBuilder.build();
    }
}
