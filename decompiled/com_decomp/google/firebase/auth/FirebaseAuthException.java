package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseException;

public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.zza = s.g(str);
    }

    public String getErrorCode() {
        return this.zza;
    }
}
