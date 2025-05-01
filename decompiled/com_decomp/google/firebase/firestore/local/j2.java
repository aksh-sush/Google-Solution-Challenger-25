package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;

interface j2 {
    ImmutableSortedSet a(int i10);

    void b(ImmutableSortedSet immutableSortedSet, int i10);

    void c(int i10);

    void d(TargetData targetData);

    void e(SnapshotVersion snapshotVersion);

    void f(TargetData targetData);

    TargetData g(Target target);

    int getHighestTargetId();

    SnapshotVersion getLastRemoteSnapshotVersion();

    void h(ImmutableSortedSet immutableSortedSet, int i10);
}
