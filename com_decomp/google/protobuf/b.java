package com.google.protobuf;

public abstract class b implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final r f8534a = r.b();

    private t0 c(t0 t0Var) {
        if (t0Var == null || t0Var.isInitialized()) {
            return t0Var;
        }
        throw d(t0Var).a().i(t0Var);
    }

    private s1 d(t0 t0Var) {
        return t0Var instanceof a ? ((a) t0Var).newUninitializedMessageException() : new s1(t0Var);
    }

    /* renamed from: e */
    public t0 a(k kVar, r rVar) {
        return c((t0) b(kVar, rVar));
    }
}
