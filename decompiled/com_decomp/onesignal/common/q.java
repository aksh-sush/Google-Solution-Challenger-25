package com.onesignal.common;

import android.os.Build;
import db.l;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class q {
    public static final q INSTANCE = new q();

    private q() {
    }

    public final String getTimeZoneId() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 26) {
            str2 = ZoneId.systemDefault().getId();
            str = "{\n            ZoneId.systemDefault().id\n        }";
        } else {
            str2 = TimeZone.getDefault().getID();
            str = "{\n            TimeZone.getDefault().id\n        }";
        }
        l.d(str2, str);
        return str2;
    }

    public final int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }
}
