package com.google.firebase;

import com.google.android.gms.common.internal.s;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        s.h(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        s.h(str, "Detail message must not be empty");
    }
}
