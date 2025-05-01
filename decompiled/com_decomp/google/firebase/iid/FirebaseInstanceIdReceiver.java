package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.a;
import com.google.android.gms.cloudmessaging.b;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;
import n4.l;

public final class FirebaseInstanceIdReceiver extends b {
    /* access modifiers changed from: protected */
    public final int onMessageReceive(Context context, a aVar) {
        try {
            return ((Integer) l.a(new FcmBroadcastProcessor(context).process(aVar.U()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e(Constants.TAG, "Failed to send message to service.", e10);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(putExtras)) {
            MessagingAnalytics.logNotificationDismiss(putExtras);
        }
    }
}
