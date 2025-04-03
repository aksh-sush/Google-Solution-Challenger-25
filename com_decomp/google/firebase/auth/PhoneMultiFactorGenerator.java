package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;

public class PhoneMultiFactorGenerator {
    public static final String FACTOR_ID = "phone";

    public static PhoneMultiFactorAssertion getAssertion(PhoneAuthCredential phoneAuthCredential) {
        s.k(phoneAuthCredential);
        return new PhoneMultiFactorAssertion(phoneAuthCredential);
    }
}
