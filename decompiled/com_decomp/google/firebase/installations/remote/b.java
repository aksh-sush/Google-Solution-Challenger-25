package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

final class b extends TokenResult {

    /* renamed from: a  reason: collision with root package name */
    private final String f8352a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8353b;

    /* renamed from: c  reason: collision with root package name */
    private final TokenResult.ResponseCode f8354c;

    /* renamed from: com.google.firebase.installations.remote.b$b  reason: collision with other inner class name */
    static final class C0109b extends TokenResult.Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f8355a;

        /* renamed from: b  reason: collision with root package name */
        private Long f8356b;

        /* renamed from: c  reason: collision with root package name */
        private TokenResult.ResponseCode f8357c;

        C0109b() {
        }

        private C0109b(TokenResult tokenResult) {
            this.f8355a = tokenResult.getToken();
            this.f8356b = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.f8357c = tokenResult.getResponseCode();
        }

        public TokenResult build() {
            String str = "";
            if (this.f8356b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f8355a, this.f8356b.longValue(), this.f8357c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f8357c = responseCode;
            return this;
        }

        public TokenResult.Builder setToken(String str) {
            this.f8355a = str;
            return this;
        }

        public TokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f8356b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, TokenResult.ResponseCode responseCode) {
        this.f8352a = str;
        this.f8353b = j10;
        this.f8354c = responseCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f8352a;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.f8353b == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode = this.f8354c;
                TokenResult.ResponseCode responseCode2 = tokenResult.getResponseCode();
                if (responseCode == null) {
                    if (responseCode2 == null) {
                        return true;
                    }
                } else if (responseCode.equals(responseCode2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public TokenResult.ResponseCode getResponseCode() {
        return this.f8354c;
    }

    public String getToken() {
        return this.f8352a;
    }

    public long getTokenExpirationTimestamp() {
        return this.f8353b;
    }

    public int hashCode() {
        String str = this.f8352a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f8353b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f8354c;
        if (responseCode != null) {
            i10 = responseCode.hashCode();
        }
        return i11 ^ i10;
    }

    public TokenResult.Builder toBuilder() {
        return new C0109b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f8352a + ", tokenExpirationTimestamp=" + this.f8353b + ", responseCode=" + this.f8354c + "}";
    }
}
