package com.google.firebase.firestore.proto;

import com.google.protobuf.r1;
import com.google.protobuf.t0;
import com.google.protobuf.u0;
import java.util.List;
import t5.y;

public interface WriteBatchOrBuilder extends u0 {
    y getBaseWrites(int i10);

    int getBaseWritesCount();

    List<y> getBaseWritesList();

    int getBatchId();

    /* synthetic */ t0 getDefaultInstanceForType();

    r1 getLocalWriteTime();

    y getWrites(int i10);

    int getWritesCount();

    List<y> getWritesList();

    boolean hasLocalWriteTime();

    /* synthetic */ boolean isInitialized();
}
