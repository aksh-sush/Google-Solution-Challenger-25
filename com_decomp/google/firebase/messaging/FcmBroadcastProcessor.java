package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n4.i;
import n4.l;
import y3.n;

public class FcmBroadcastProcessor {
    private static a1 fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context2) {
        this.context = context2;
        this.executor = f.f8396e;
    }

    private static i bindToMessagingService(Context context2, Intent intent) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        return getServiceConnection(context2, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(i.f8406e, j.f8412a);
    }

    private static a1 getServiceConnection(Context context2, String str) {
        a1 a1Var;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new a1(context2, "com.google.firebase.MESSAGING_EVENT");
            }
            a1Var = fcmServiceConn;
        }
        return a1Var;
    }

    static final /* synthetic */ Integer lambda$bindToMessagingService$3$FcmBroadcastProcessor(i iVar) {
        return -1;
    }

    static final /* synthetic */ Integer lambda$startMessagingService$1$FcmBroadcastProcessor(i iVar) {
        return 403;
    }

    static final /* synthetic */ i lambda$startMessagingService$2$FcmBroadcastProcessor(Context context2, Intent intent, i iVar) {
        return (!n.h() || ((Integer) iVar.getResult()).intValue() != 402) ? iVar : bindToMessagingService(context2, intent).continueWith(k.f8415e, l.f8418a);
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public i process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.context, intent);
    }

    public i startMessagingService(Context context2, Intent intent) {
        boolean z10 = false;
        if (n.h() && context2.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        }
        return (!z10 || (intent.getFlags() & 268435456) != 0) ? l.c(this.executor, new g(context2, intent)).continueWithTask(this.executor, new h(context2, intent)) : bindToMessagingService(context2, intent);
    }

    public FcmBroadcastProcessor(Context context2, ExecutorService executorService) {
        this.context = context2;
        this.executor = executorService;
    }
}
