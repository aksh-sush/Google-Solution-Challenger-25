package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c9.a;
import com.google.firebase.messaging.Constants;
import db.g;
import db.l;
import g7.b;

public final class FCMBroadcastReceiver extends BroadcastReceiver {
    public static final a Companion = new a((g) null);
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean isFCMMessage(Intent intent) {
            if (!l.a(FCMBroadcastReceiver.FCM_RECEIVE_ACTION, intent.getAction())) {
                return false;
            }
            String stringExtra = intent.getStringExtra("message_type");
            return stringExtra == null || l.a("gcm", stringExtra);
        }
    }

    private final void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private final void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null && !l.a("google.com/iid", extras.getString(Constants.MessagePayloadKeys.FROM))) {
            Context applicationContext = context.getApplicationContext();
            l.d(applicationContext, "context.applicationContext");
            if (b.f(applicationContext)) {
                c9.a aVar = (c9.a) b.f10823a.c().getService(c9.a.class);
                if (!Companion.isFCMMessage(intent)) {
                    setSuccessfulResultCode();
                    return;
                }
                a.C0080a processBundleFromReceiver = aVar.processBundleFromReceiver(context, extras);
                l.b(processBundleFromReceiver);
                if (processBundleFromReceiver.isWorkManagerProcessing()) {
                    setAbort();
                } else {
                    setSuccessfulResultCode();
                }
            }
        }
    }
}
