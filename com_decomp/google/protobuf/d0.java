package com.google.protobuf;

import java.io.IOException;

public class d0 extends IOException {

    /* renamed from: e  reason: collision with root package name */
    private t0 f8552e = null;

    public static class a extends d0 {
        public a(String str) {
            super(str);
        }
    }

    public d0(String str) {
        super(str);
    }

    static d0 a() {
        return new d0("Protocol message end-group tag did not match expected tag.");
    }

    static d0 b() {
        return new d0("Protocol message contained an invalid tag (zero).");
    }

    static d0 c() {
        return new d0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static d0 e() {
        return new d0("CodedInputStream encountered a malformed varint.");
    }

    static d0 f() {
        return new d0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static d0 g() {
        return new d0("Failed to parse the message.");
    }

    static d0 h() {
        return new d0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static d0 j() {
        return new d0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static d0 k() {
        return new d0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public d0 i(t0 t0Var) {
        this.f8552e = t0Var;
        return this;
    }
}
