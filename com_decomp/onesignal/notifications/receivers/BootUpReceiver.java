package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import db.l;
import g7.b;

public final class BootUpReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "context.applicationContext");
        if (b.f(applicationContext)) {
            ((q9.b) b.f10823a.c().getService(q9.b.class)).beginEnqueueingWork(context, true);
        }
    }
}
