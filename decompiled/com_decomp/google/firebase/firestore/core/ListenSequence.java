package com.google.firebase.firestore.core;

public class ListenSequence {
    public static final long INVALID = -1;
    private long previousSequenceNumber;

    public ListenSequence(long j10) {
        this.previousSequenceNumber = j10;
    }

    public long next() {
        long j10 = this.previousSequenceNumber + 1;
        this.previousSequenceNumber = j10;
        return j10;
    }
}
