package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

class n implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e  reason: collision with root package name */
    private final Set f8426e = Collections.newSetFromMap(new WeakHashMap());

    n() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.f8426e.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            if (MessagingAnalytics.shouldUploadScionMetrics(bundle2)) {
                MessagingAnalytics.logNotificationOpen(bundle2);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f8426e.remove(activity.getIntent());
        }
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
