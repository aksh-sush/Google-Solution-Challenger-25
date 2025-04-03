package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z3.b;

class o0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final long f8434e;

    /* renamed from: f  reason: collision with root package name */
    private final PowerManager.WakeLock f8435f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final FirebaseMessaging f8436g;

    /* renamed from: h  reason: collision with root package name */
    ExecutorService f8437h = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private o0 f8438a;

        public a(o0 o0Var) {
            this.f8438a = o0Var;
        }

        public void a() {
            if (o0.c()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            this.f8438a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            o0 o0Var = this.f8438a;
            if (o0Var != null && o0Var.d()) {
                if (o0.c()) {
                    Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                }
                this.f8438a.f8436g.enqueueTaskWithDelaySeconds(this.f8438a, 0);
                this.f8438a.b().unregisterReceiver(this);
                this.f8438a = null;
            }
        }
    }

    public o0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f8436g = firebaseMessaging;
        this.f8434e = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8435f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable(Constants.TAG, 3);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f8436g.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        String str;
        try {
            if (this.f8436g.blockingGetToken() == null) {
                Log.e(Constants.TAG, "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable(Constants.TAG, 3)) {
                return true;
            } else {
                Log.d(Constants.TAG, "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (e0.g(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                str = sb2.toString();
            } else if (e10.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e10;
            }
            Log.w(Constants.TAG, str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w(Constants.TAG, str);
            return false;
        }
    }

    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(b())) {
            this.f8435f.acquire();
        }
        try {
            this.f8436g.setSyncScheduledOrRunning(true);
            if (!this.f8436g.isGmsCorePresent()) {
                this.f8436g.setSyncScheduledOrRunning(false);
                if (!ServiceStarter.getInstance().hasWakeLockPermission(b())) {
                    return;
                }
            } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(b()) || d()) {
                if (e()) {
                    this.f8436g.setSyncScheduledOrRunning(false);
                } else {
                    this.f8436g.syncWithDelaySecondsInternal(this.f8434e);
                }
                if (!ServiceStarter.getInstance().hasWakeLockPermission(b())) {
                    return;
                }
            } else {
                new a(this).a();
                if (!ServiceStarter.getInstance().hasWakeLockPermission(b())) {
                    return;
                }
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
            sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb2.append(message);
            sb2.append(". Won't retry the operation.");
            Log.e(Constants.TAG, sb2.toString());
            this.f8436g.setSyncScheduledOrRunning(false);
            if (!ServiceStarter.getInstance().hasWakeLockPermission(b())) {
                return;
            }
        } catch (Throwable th) {
            if (ServiceStarter.getInstance().hasWakeLockPermission(b())) {
                this.f8435f.release();
            }
            throw th;
        }
        this.f8435f.release();
    }
}
