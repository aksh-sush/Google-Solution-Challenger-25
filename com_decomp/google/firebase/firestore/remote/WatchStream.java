package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.protobuf.j;
import java.util.Map;
import t5.o;
import t5.p;
import t5.q;

public class WatchStream extends b {
    public static final j EMPTY_RESUME_TOKEN = j.f8600f;
    private final RemoteSerializer serializer;

    interface a extends Stream.StreamCallback {
        void a(SnapshotVersion snapshotVersion, WatchChange watchChange);
    }

    WatchStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, a aVar) {
        super(firestoreChannel, o.c(), asyncQueue, AsyncQueue.TimerId.LISTEN_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.LISTEN_STREAM_IDLE, aVar);
        this.serializer = remoteSerializer;
    }

    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public void unwatchTarget(int i10) {
        Assert.hardAssert(isOpen(), "Unwatching targets requires an open stream", new Object[0]);
        writeRequest((p) p.p().g(this.serializer.databaseName()).h(i10).build());
    }

    public void watchQuery(TargetData targetData) {
        Assert.hardAssert(isOpen(), "Watching queries requires an open stream", new Object[0]);
        p.b f10 = p.p().g(this.serializer.databaseName()).f(this.serializer.encodeTarget(targetData));
        Map<String, String> encodeListenRequestLabels = this.serializer.encodeListenRequestLabels(targetData);
        if (encodeListenRequestLabels != null) {
            f10.e(encodeListenRequestLabels);
        }
        writeRequest((p) f10.build());
    }

    public void onNext(q qVar) {
        this.backoff.reset();
        WatchChange decodeWatchChange = this.serializer.decodeWatchChange(qVar);
        ((a) this.listener).a(this.serializer.decodeVersionFromListenResponse(qVar), decodeWatchChange);
    }
}
