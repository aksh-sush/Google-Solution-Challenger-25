package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.x0;
import java.util.concurrent.ExecutorService;
import n4.d;
import n4.i;
import n4.j;
import n4.l;

public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    final ExecutorService executor = m.c();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    class a implements x0.a {
        a() {
        }

        public i a(Intent intent) {
            return EnhancedIntentService.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            u0.b(intent);
        }
        synchronized (this.lock) {
            int i10 = this.runningTasks - 1;
            this.runningTasks = i10;
            if (i10 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* access modifiers changed from: private */
    public i processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return l.e((Object) null);
        }
        j jVar = new j();
        this.executor.execute(new c(this, intent, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, i iVar) {
        finishTask(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, j jVar) {
        try {
            handleIntent(intent);
        } finally {
            jVar.c((Object) null);
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new x0(new a());
        }
        return this.binder;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        i processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(d.f8386e, (d) new e(this, intent));
        return 3;
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
