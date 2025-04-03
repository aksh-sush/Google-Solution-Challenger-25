package com.google.firebase.firestore.proto;

import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.protobuf.t0;
import com.google.protobuf.u0;
import t5.h;

public interface MaybeDocumentOrBuilder extends u0 {
    /* synthetic */ t0 getDefaultInstanceForType();

    h getDocument();

    MaybeDocument.DocumentTypeCase getDocumentTypeCase();

    boolean getHasCommittedMutations();

    NoDocument getNoDocument();

    UnknownDocument getUnknownDocument();

    boolean hasDocument();

    boolean hasNoDocument();

    boolean hasUnknownDocument();

    /* synthetic */ boolean isInitialized();
}
