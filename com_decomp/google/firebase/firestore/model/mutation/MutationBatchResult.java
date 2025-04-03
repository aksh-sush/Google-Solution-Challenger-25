package com.google.firebase.firestore.model.mutation;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.j;
import java.util.List;

public final class MutationBatchResult {
    private final MutationBatch batch;
    private final SnapshotVersion commitVersion;
    private final ImmutableSortedMap<DocumentKey, SnapshotVersion> docVersions;
    private final List<MutationResult> mutationResults;
    private final j streamToken;

    private MutationBatchResult(MutationBatch mutationBatch, SnapshotVersion snapshotVersion, List<MutationResult> list, j jVar, ImmutableSortedMap<DocumentKey, SnapshotVersion> immutableSortedMap) {
        this.batch = mutationBatch;
        this.commitVersion = snapshotVersion;
        this.mutationResults = list;
        this.streamToken = jVar;
        this.docVersions = immutableSortedMap;
    }

    public static MutationBatchResult create(MutationBatch mutationBatch, SnapshotVersion snapshotVersion, List<MutationResult> list, j jVar) {
        Assert.hardAssert(mutationBatch.getMutations().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(mutationBatch.getMutations().size()), Integer.valueOf(list.size()));
        ImmutableSortedMap<DocumentKey, SnapshotVersion> emptyVersionMap = DocumentCollections.emptyVersionMap();
        List<Mutation> mutations = mutationBatch.getMutations();
        ImmutableSortedMap<DocumentKey, SnapshotVersion> immutableSortedMap = emptyVersionMap;
        for (int i10 = 0; i10 < mutations.size(); i10++) {
            immutableSortedMap = immutableSortedMap.insert(mutations.get(i10).getKey(), list.get(i10).getVersion());
        }
        return new MutationBatchResult(mutationBatch, snapshotVersion, list, jVar, immutableSortedMap);
    }

    public MutationBatch getBatch() {
        return this.batch;
    }

    public SnapshotVersion getCommitVersion() {
        return this.commitVersion;
    }

    public ImmutableSortedMap<DocumentKey, SnapshotVersion> getDocVersions() {
        return this.docVersions;
    }

    public List<MutationResult> getMutationResults() {
        return this.mutationResults;
    }

    public j getStreamToken() {
        return this.streamToken;
    }
}
