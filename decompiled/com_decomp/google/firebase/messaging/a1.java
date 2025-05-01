package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.d;
import n4.i;
import n4.j;
import z3.b;

class a1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8370a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f8371b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f8372c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f8373d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f8374e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8375f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f8376a;

        /* renamed from: b  reason: collision with root package name */
        private final j f8377b = new j();

        a(Intent intent) {
            this.f8376a = intent;
        }

        /* access modifiers changed from: package-private */
        public void a(ScheduledExecutorService scheduledExecutorService) {
            c().addOnCompleteListener((Executor) scheduledExecutorService, (d) new z0(scheduledExecutorService.schedule(new y0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f8377b.e((Object) null);
        }

        /* access modifiers changed from: package-private */
        public i c() {
            return this.f8377b.a();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void d() {
            String action = this.f8376a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w(Constants.TAG, sb2.toString());
            b();
        }
    }

    a1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f8373d.isEmpty()) {
            ((a) this.f8373d.poll()).b();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "flush queue called");
        }
        while (!this.f8373d.isEmpty()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "found intent to be delivered");
            }
            x0 x0Var = this.f8374e;
            if (x0Var == null || !x0Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "binder is alive, sending the intent.");
            }
            this.f8374e.b((a) this.f8373d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            boolean z10 = this.f8375f;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z10);
            Log.d(Constants.TAG, sb2.toString());
        }
        if (!this.f8375f) {
            this.f8375f = true;
            try {
                if (!x3.b.b().a(this.f8370a, this.f8371b, this, 65)) {
                    Log.e(Constants.TAG, "binding to the service failed");
                    this.f8375f = false;
                    a();
                }
            } catch (SecurityException e10) {
                Log.e(Constants.TAG, "Exception while binding the service", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(Intent intent) {
        a aVar;
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.f8372c);
        this.f8373d.add(aVar);
        b();
        return aVar.c();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("onServiceConnected: ");
            sb2.append(valueOf);
            Log.d(Constants.TAG, sb2.toString());
        }
        this.f8375f = false;
        if (!(iBinder instanceof x0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e(Constants.TAG, sb3.toString());
            a();
            return;
        }
        this.f8374e = (x0) iBinder;
        b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("onServiceDisconnected: ");
            sb2.append(valueOf);
            Log.d(Constants.TAG, sb2.toString());
        }
        b();
    }

    a1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8373d = new ArrayDeque();
        this.f8375f = false;
        Context applicationContext = context.getApplicationContext();
        this.f8370a = applicationContext;
        this.f8371b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f8372c = scheduledExecutorService;
    }
}
