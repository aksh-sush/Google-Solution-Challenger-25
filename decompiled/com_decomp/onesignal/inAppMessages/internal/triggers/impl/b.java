package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.debug.internal.logging.a;
import db.l;
import java.util.Timer;
import java.util.TimerTask;

public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String str, long j10) {
        l.e(str, "triggerId");
        a.debug$default("scheduleTrigger: " + str + " delay: " + j10, (Throwable) null, 2, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trigger_timer:");
        sb2.append(str);
        new Timer(sb2.toString()).schedule(timerTask, j10);
    }
}
