package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t5.a0;
import t5.b0;
import t5.o;

public class WriteStream extends b {
    public static final j EMPTY_STREAM_TOKEN = j.f8600f;
    protected boolean handshakeComplete = false;
    private j lastStreamToken = EMPTY_STREAM_TOKEN;
    private final RemoteSerializer serializer;

    public interface Callback extends Stream.StreamCallback {
        void onHandshakeComplete();

        void onWriteResponse(SnapshotVersion snapshotVersion, List<MutationResult> list);
    }

    WriteStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        super(firestoreChannel, o.d(), asyncQueue, AsyncQueue.TimerId.WRITE_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.WRITE_STREAM_IDLE, callback);
        this.serializer = remoteSerializer;
    }

    /* access modifiers changed from: package-private */
    public j getLastStreamToken() {
        return this.lastStreamToken;
    }

    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    /* access modifiers changed from: package-private */
    public boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }

    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    /* access modifiers changed from: package-private */
    public void setLastStreamToken(j jVar) {
        this.lastStreamToken = (j) Preconditions.checkNotNull(jVar);
    }

    public void start() {
        this.handshakeComplete = false;
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* access modifiers changed from: protected */
    public void tearDown() {
        if (this.handshakeComplete) {
            writeMutations(Collections.emptyList());
        }
    }

    /* access modifiers changed from: package-private */
    public void writeHandshake() {
        Assert.hardAssert(isOpen(), "Writing handshake requires an opened stream", new Object[0]);
        Assert.hardAssert(!this.handshakeComplete, "Handshake already completed", new Object[0]);
        writeRequest((a0) a0.m().f(this.serializer.databaseName()).build());
    }

    /* access modifiers changed from: package-private */
    public void writeMutations(List<Mutation> list) {
        Assert.hardAssert(isOpen(), "Writing mutations requires an opened stream", new Object[0]);
        Assert.hardAssert(this.handshakeComplete, "Handshake must be complete before writing mutations", new Object[0]);
        a0.b m10 = a0.m();
        for (Mutation encodeMutation : list) {
            m10.e(this.serializer.encodeMutation(encodeMutation));
        }
        m10.g(this.lastStreamToken);
        writeRequest((a0) m10.build());
    }

    public void onNext(b0 b0Var) {
        this.lastStreamToken = b0Var.k();
        if (!this.handshakeComplete) {
            this.handshakeComplete = true;
            ((Callback) this.listener).onHandshakeComplete();
            return;
        }
        this.backoff.reset();
        SnapshotVersion decodeVersion = this.serializer.decodeVersion(b0Var.i());
        int m10 = b0Var.m();
        ArrayList arrayList = new ArrayList(m10);
        for (int i10 = 0; i10 < m10; i10++) {
            arrayList.add(this.serializer.decodeMutationResult(b0Var.l(i10), decodeVersion));
        }
        ((Callback) this.listener).onWriteResponse(decodeVersion, arrayList);
    }
}
