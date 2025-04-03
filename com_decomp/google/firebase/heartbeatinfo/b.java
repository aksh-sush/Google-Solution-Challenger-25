package com.google.firebase.heartbeatinfo;

final class b extends SdkHeartBeatResult {

    /* renamed from: e  reason: collision with root package name */
    private final String f8296e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8297f;

    b(String str, long j10) {
        if (str != null) {
            this.f8296e = str;
            this.f8297f = j10;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        return this.f8296e.equals(sdkHeartBeatResult.getSdkName()) && this.f8297f == sdkHeartBeatResult.getMillis();
    }

    public long getMillis() {
        return this.f8297f;
    }

    public String getSdkName() {
        return this.f8296e;
    }

    public int hashCode() {
        long j10 = this.f8297f;
        return ((this.f8296e.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f8296e + ", millis=" + this.f8297f + "}";
    }
}
