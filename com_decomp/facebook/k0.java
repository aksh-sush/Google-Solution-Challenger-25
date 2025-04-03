package com.facebook;

import db.g;
import db.l;

public final class k0 extends v {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4811g = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private final y f4812f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(y yVar, String str) {
        super(str);
        l.e(yVar, "requestError");
        this.f4812f = yVar;
    }

    public final y c() {
        return this.f4812f;
    }

    public String toString() {
        String str = "{FacebookServiceException: " + "httpResponseCode: " + this.f4812f.f() + ", facebookErrorCode: " + this.f4812f.b() + ", facebookErrorType: " + this.f4812f.d() + ", message: " + this.f4812f.c() + "}";
        l.d(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
