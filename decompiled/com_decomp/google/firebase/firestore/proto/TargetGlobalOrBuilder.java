package com.google.firebase.firestore.proto;

import com.google.protobuf.r1;
import com.google.protobuf.t0;
import com.google.protobuf.u0;

public interface TargetGlobalOrBuilder extends u0 {
    /* synthetic */ t0 getDefaultInstanceForType();

    long getHighestListenSequenceNumber();

    int getHighestTargetId();

    r1 getLastRemoteSnapshotVersion();

    int getTargetCount();

    boolean hasLastRemoteSnapshotVersion();

    /* synthetic */ boolean isInitialized();
}
