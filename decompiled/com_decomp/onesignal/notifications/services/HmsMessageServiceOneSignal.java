package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.notifications.bridges.a;
import db.l;

public final class HmsMessageServiceOneSignal extends HmsMessageService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        l.e(remoteMessage, "message");
        a.INSTANCE.onMessageReceived((Context) this, remoteMessage);
    }

    public void onNewToken(String str) {
        l.e(str, "token");
        com.onesignal.debug.internal.logging.a.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, (Throwable) null, 2, (Object) null);
        a.INSTANCE.onNewToken((Context) this, str);
    }

    public void onNewToken(String str, Bundle bundle) {
        l.e(str, "token");
        l.e(bundle, "bundle");
        com.onesignal.debug.internal.logging.a.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, (Throwable) null, 2, (Object) null);
        a.INSTANCE.onNewToken((Context) this, str, bundle);
    }
}
