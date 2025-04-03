package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Preconditions;
import java.util.List;
import t5.x;

public final class MutationResult {
    private final List<x> transformResults;
    private final SnapshotVersion version;

    public MutationResult(SnapshotVersion snapshotVersion, List<x> list) {
        this.version = (SnapshotVersion) Preconditions.checkNotNull(snapshotVersion);
        this.transformResults = list;
    }

    public List<x> getTransformResults() {
        return this.transformResults;
    }

    public SnapshotVersion getVersion() {
        return this.version;
    }
}
