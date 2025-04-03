package com.google.firebase.auth;

import java.util.List;
import n4.i;

public abstract class MultiFactor {
    public abstract i enroll(MultiFactorAssertion multiFactorAssertion, String str);

    public abstract List<MultiFactorInfo> getEnrolledFactors();

    public abstract i getSession();

    public abstract i unenroll(MultiFactorInfo multiFactorInfo);

    public abstract i unenroll(String str);
}
