package com.google.firebase.heartbeatinfo;

import n4.i;

public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private HeartBeat(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    i getAndClearStoredHeartBeatInfo();

    HeartBeat getHeartBeatCode(String str);

    i storeHeartBeatInfo(String str);
}
