package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.HeartBeatInfo;

final class a extends HeartBeatResult {

    /* renamed from: a  reason: collision with root package name */
    private final String f8293a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8294b;

    /* renamed from: c  reason: collision with root package name */
    private final HeartBeatInfo.HeartBeat f8295c;

    a(String str, long j10, HeartBeatInfo.HeartBeat heartBeat) {
        if (str != null) {
            this.f8293a = str;
            this.f8294b = j10;
            if (heartBeat != null) {
                this.f8295c = heartBeat;
                return;
            }
            throw new NullPointerException("Null heartBeat");
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f8293a.equals(heartBeatResult.getSdkName()) && this.f8294b == heartBeatResult.getMillis() && this.f8295c.equals(heartBeatResult.getHeartBeat());
    }

    public HeartBeatInfo.HeartBeat getHeartBeat() {
        return this.f8295c;
    }

    public long getMillis() {
        return this.f8294b;
    }

    public String getSdkName() {
        return this.f8293a;
    }

    public int hashCode() {
        long j10 = this.f8294b;
        return ((((this.f8293a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f8295c.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{sdkName=" + this.f8293a + ", millis=" + this.f8294b + ", heartBeat=" + this.f8295c + "}";
    }
}
