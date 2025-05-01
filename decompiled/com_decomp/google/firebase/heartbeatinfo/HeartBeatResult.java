package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

@AutoValue
public abstract class HeartBeatResult {
    public static HeartBeatResult create(String str, long j10, HeartBeatInfo.HeartBeat heartBeat) {
        return new a(str, j10, heartBeat);
    }

    public abstract HeartBeatInfo.HeartBeat getHeartBeat();

    public abstract long getMillis();

    public abstract String getSdkName();
}
