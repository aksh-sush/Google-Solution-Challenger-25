package com.onesignal.common;

import java.io.File;

public final class n {
    public static final n INSTANCE = new n();

    private n() {
    }

    public final boolean isRooted() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        int i10 = 0;
        while (i10 < 8) {
            try {
                String str = strArr[i10];
                if (new File(str + "su").exists()) {
                    return true;
                }
                i10++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
