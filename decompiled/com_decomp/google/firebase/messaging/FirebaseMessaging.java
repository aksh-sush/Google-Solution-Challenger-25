package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.n0;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.f;
import n4.i;
import n4.j;
import n4.l;
import r2.g;
import z3.b;

public class FirebaseMessaging {
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static n0 store;
    static ScheduledExecutorService syncExecutor;
    static g transportFactory;
    private final a autoInit;
    private final Context context;
    private final Executor fileIoExecutor;
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi fis;
    private final e0 gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final i0 metadata;
    private final k0 requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final i topicsSubscriberTask;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private final Subscriber f8364a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f8365b;

        /* renamed from: c  reason: collision with root package name */
        private EventHandler f8366c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f8367d;

        a(Subscriber subscriber) {
            this.f8364a = subscriber;
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void a() {
            if (!this.f8365b) {
                Boolean d10 = d();
                this.f8367d = d10;
                if (d10 == null) {
                    a0 a0Var = new a0(this);
                    this.f8366c = a0Var;
                    this.f8364a.subscribe(DataCollectionDefaultChange.class, a0Var);
                }
                this.f8365b = true;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f8367d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void c(Event event) {
            if (b()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void e(boolean z10) {
            a();
            EventHandler eventHandler = this.f8366c;
            if (eventHandler != null) {
                this.f8364a.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.f8366c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            this.f8367d = Boolean.valueOf(z10);
        }
    }

    FirebaseMessaging(FirebaseApp firebaseApp2, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, g gVar, Subscriber subscriber) {
        this(firebaseApp2, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, gVar, subscriber, new i0(firebaseApp2.getApplicationContext()));
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(FirebaseApp.getInstance());
        }
        return instance;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static g getTransportFactory() {
        return transportFactory;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh */
    public void bridge$lambda$0$FirebaseMessaging(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                String valueOf = String.valueOf(this.firebaseApp.getName());
                Log.d(Constants.TAG, valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
    }

    /* access modifiers changed from: private */
    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    /* access modifiers changed from: package-private */
    public String blockingGetToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) l.a(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            n0.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.f8430a;
            }
            String c10 = i0.c(this.firebaseApp);
            try {
                String str = (String) l.a(this.fis.getId().continueWithTask(m.d(), new y(this, c10)));
                store.g(getSubtype(), c10, str, this.metadata.a());
                if (tokenWithoutTriggeringSync == null || !str.equals(tokenWithoutTriggeringSync.f8430a)) {
                    bridge$lambda$0$FirebaseMessaging(str);
                }
                return str;
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public i deleteToken() {
        if (this.iid != null) {
            j jVar = new j();
            this.fileIoExecutor.execute(new u(this, jVar));
            return jVar.a();
        } else if (getTokenWithoutTriggeringSync() == null) {
            return l.e((Object) null);
        } else {
            ExecutorService d10 = m.d();
            return this.fis.getId().continueWithTask(d10, new v(this, d10));
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    /* access modifiers changed from: package-private */
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new b("TAG"));
            }
            syncExecutor.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public Context getApplicationContext() {
        return this.context;
    }

    public i getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        j jVar = new j();
        this.fileIoExecutor.execute(new t(this, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: package-private */
    public n0.a getTokenWithoutTriggeringSync() {
        return store.e(getSubtype(), i0.c(this.firebaseApp));
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.b();
    }

    /* access modifiers changed from: package-private */
    public boolean isGmsCorePresent() {
        return this.metadata.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i lambda$blockingGetToken$8$FirebaseMessaging(i iVar) {
        return this.gmsRpc.e((String) iVar.getResult());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i lambda$blockingGetToken$9$FirebaseMessaging(String str, i iVar) {
        return this.requestDeduplicator.a(str, new z(this, iVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$deleteToken$3$FirebaseMessaging(j jVar) {
        try {
            this.iid.deleteToken(i0.c(this.firebaseApp), INSTANCE_ID_SCOPE);
            jVar.c((Object) null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void lambda$deleteToken$4$FirebaseMessaging(i iVar) {
        store.d(getSubtype(), i0.c(this.firebaseApp));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i lambda$deleteToken$5$FirebaseMessaging(ExecutorService executorService, i iVar) {
        return this.gmsRpc.b((String) iVar.getResult()).continueWith(executorService, new p(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$getToken$2$FirebaseMessaging(j jVar) {
        try {
            jVar.c(blockingGetToken());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$FirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$1$FirebaseMessaging(s0 s0Var) {
        if (isAutoInitEnabled()) {
            s0Var.p();
        }
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            remoteMessage.populateSendMessageIntent(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z10) {
        this.autoInit.e(z10);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized void setSyncScheduledOrRunning(boolean z10) {
        this.syncScheduledOrRunning = z10;
    }

    public i subscribeToTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new w(str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void syncWithDelaySecondsInternal(long j10) {
        enqueueTaskWithDelaySeconds(new o0(this, Math.min(Math.max(30, j10 + j10), MAX_DELAY_SEC)), j10);
        this.syncScheduledOrRunning = true;
    }

    /* access modifiers changed from: package-private */
    public boolean tokenNeedsRefresh(n0.a aVar) {
        return aVar == null || aVar.b(this.metadata.a());
    }

    public i unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new x(str));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.FirebaseApp r11, com.google.firebase.iid.internal.FirebaseInstanceIdInternal r12, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r13, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r14, com.google.firebase.installations.FirebaseInstallationsApi r15, r2.g r16, com.google.firebase.events.Subscriber r17, com.google.firebase.messaging.i0 r18) {
        /*
            r10 = this;
            com.google.firebase.messaging.e0 r7 = new com.google.firebase.messaging.e0
            r0 = r7
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.m.e()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.m.b()
            r0 = r10
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.FirebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal, com.google.firebase.inject.Provider, com.google.firebase.inject.Provider, com.google.firebase.installations.FirebaseInstallationsApi, r2.g, com.google.firebase.events.Subscriber, com.google.firebase.messaging.i0):void");
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp2) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp2.get(FirebaseMessaging.class);
            s.l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(FirebaseApp firebaseApp2, FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, g gVar, Subscriber subscriber, i0 i0Var, e0 e0Var, Executor executor, Executor executor2) {
        this.syncScheduledOrRunning = false;
        transportFactory = gVar;
        this.firebaseApp = firebaseApp2;
        this.iid = firebaseInstanceIdInternal;
        this.fis = firebaseInstallationsApi;
        this.autoInit = new a(subscriber);
        Context applicationContext = firebaseApp2.getApplicationContext();
        this.context = applicationContext;
        n nVar = new n();
        this.lifecycleCallbacks = nVar;
        this.metadata = i0Var;
        this.taskExecutor = executor;
        this.gmsRpc = e0Var;
        this.requestDeduplicator = new k0(executor);
        this.fileIoExecutor = executor2;
        Context applicationContext2 = firebaseApp2.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(nVar);
        } else {
            String valueOf = String.valueOf(applicationContext2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 125);
            sb2.append("Context ");
            sb2.append(valueOf);
            sb2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w(Constants.TAG, sb2.toString());
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new o(this));
        }
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new n0(applicationContext);
            }
        }
        executor2.execute(new q(this));
        i e10 = s0.e(this, firebaseInstallationsApi, i0Var, e0Var, applicationContext, m.f());
        this.topicsSubscriberTask = e10;
        e10.addOnSuccessListener(m.g(), (f) new s(this));
    }
}
