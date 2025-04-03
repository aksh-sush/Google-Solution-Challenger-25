package com.facebook;

import db.l;

public final class w extends v {

    /* renamed from: f  reason: collision with root package name */
    private final r0 f4997f;

    public w(r0 r0Var, String str) {
        super(str);
        this.f4997f = r0Var;
    }

    public String toString() {
        r0 r0Var = this.f4997f;
        y b10 = r0Var == null ? null : r0Var.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (b10 != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(b10.f());
            sb2.append(", facebookErrorCode: ");
            sb2.append(b10.b());
            sb2.append(", facebookErrorType: ");
            sb2.append(b10.d());
            sb2.append(", message: ");
            sb2.append(b10.c());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        l.d(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
