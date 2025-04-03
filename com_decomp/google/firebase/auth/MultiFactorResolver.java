package com.google.firebase.auth;

import java.util.List;
import n4.i;
import s3.a;

public abstract class MultiFactorResolver extends a {
    public abstract FirebaseAuth getFirebaseAuth();

    public abstract List<MultiFactorInfo> getHints();

    public abstract MultiFactorSession getSession();

    public abstract i resolveSignIn(MultiFactorAssertion multiFactorAssertion);
}
