package com.google.firebase.firestore;

import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.j;

public class Blob implements Comparable<Blob> {
    private final j bytes;

    private Blob(j jVar) {
        this.bytes = jVar;
    }

    public static Blob fromByteString(j jVar) {
        Preconditions.checkNotNull(jVar, "Provided ByteString must not be null.");
        return new Blob(jVar);
    }

    public static Blob fromBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Provided bytes array must not be null.");
        return new Blob(j.o(bArr));
    }

    public int compareTo(Blob blob) {
        return Util.compareByteStrings(this.bytes, blob.bytes);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Blob) && this.bytes.equals(((Blob) obj).bytes);
    }

    public int hashCode() {
        return this.bytes.hashCode();
    }

    public j toByteString() {
        return this.bytes;
    }

    public byte[] toBytes() {
        return this.bytes.H();
    }

    public String toString() {
        return "Blob { bytes=" + Util.toDebugString(this.bytes) + " }";
    }
}
