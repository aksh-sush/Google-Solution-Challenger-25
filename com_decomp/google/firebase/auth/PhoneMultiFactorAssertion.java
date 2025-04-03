package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;

public class PhoneMultiFactorAssertion extends MultiFactorAssertion {
    private final PhoneAuthCredential zza;

    public PhoneMultiFactorAssertion(PhoneAuthCredential phoneAuthCredential) {
        s.k(phoneAuthCredential);
        this.zza = phoneAuthCredential;
    }

    public String getFactorId() {
        return "phone";
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }
}
