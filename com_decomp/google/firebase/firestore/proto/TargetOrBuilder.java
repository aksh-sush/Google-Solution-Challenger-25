package com.google.firebase.firestore.proto;

import com.google.firebase.firestore.proto.Target;
import com.google.protobuf.j;
import com.google.protobuf.r1;
import com.google.protobuf.t0;
import com.google.protobuf.u0;
import t5.u;

public interface TargetOrBuilder extends u0 {
    /* synthetic */ t0 getDefaultInstanceForType();

    u.c getDocuments();

    r1 getLastLimboFreeSnapshotVersion();

    long getLastListenSequenceNumber();

    u.d getQuery();

    j getResumeToken();

    r1 getSnapshotVersion();

    int getTargetId();

    Target.TargetTypeCase getTargetTypeCase();

    boolean hasDocuments();

    boolean hasLastLimboFreeSnapshotVersion();

    boolean hasQuery();

    boolean hasSnapshotVersion();

    /* synthetic */ boolean isInitialized();
}
