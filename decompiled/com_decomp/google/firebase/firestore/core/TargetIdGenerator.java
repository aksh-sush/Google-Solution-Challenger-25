package com.google.firebase.firestore.core;

import com.google.firebase.firestore.util.Assert;

public class TargetIdGenerator {
    private static final int QUERY_CACHE_ID = 0;
    private static final int RESERVED_BITS = 1;
    private static final int SYNC_ENGINE_ID = 1;
    private int generatorId;
    private int nextId;

    TargetIdGenerator(int i10, int i11) {
        Assert.hardAssert((i10 & 1) == i10, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i10), 1);
        this.generatorId = i10;
        seek(i11);
    }

    public static TargetIdGenerator forSyncEngine() {
        return new TargetIdGenerator(1, 1);
    }

    public static TargetIdGenerator forTargetCache(int i10) {
        TargetIdGenerator targetIdGenerator = new TargetIdGenerator(0, i10);
        targetIdGenerator.nextId();
        return targetIdGenerator;
    }

    private void seek(int i10) {
        Assert.hardAssert((i10 & 1) == this.generatorId, "Cannot supply target ID from different generator ID", new Object[0]);
        this.nextId = i10;
    }

    public int nextId() {
        int i10 = this.nextId;
        this.nextId = i10 + 2;
        return i10;
    }
}
