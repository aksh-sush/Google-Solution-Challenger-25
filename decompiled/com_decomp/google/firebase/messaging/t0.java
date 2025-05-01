package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class t0 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object f8468j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f8469k;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f8470l;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f8471e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f8472f;

    /* renamed from: g  reason: collision with root package name */
    private final PowerManager.WakeLock f8473g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final s0 f8474h;

    /* renamed from: i  reason: collision with root package name */
    private final long f8475i;

    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private t0 f8476a;

        public a(t0 t0Var) {
            this.f8476a = t0Var;
        }

        public void a() {
            if (t0.j()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            t0.this.f8471e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            t0 t0Var = this.f8476a;
            if (t0Var != null) {
                if (t0Var.i()) {
                    if (t0.j()) {
                        Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                    }
                    this.f8476a.f8474h.l(this.f8476a, 0);
                    context.unregisterReceiver(this);
                    this.f8476a = null;
                }
            }
        }
    }

    t0(s0 s0Var, Context context, i0 i0Var, long j10) {
        this.f8474h = s0Var;
        this.f8471e = context;
        this.f8475i = j10;
        this.f8472f = i0Var;
        this.f8473g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    private static String e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f8468j) {
            Boolean bool = f8470l;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f8470l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (z10 || !Log.isLoggable(Constants.TAG, 3)) {
            return z10;
        }
        Log.d(Constants.TAG, e(str));
        return false;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f8468j) {
            Boolean bool = f8469k;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f8469k = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f8471e     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0021 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0012
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x0021 }
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.t0.i():boolean");
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable(Constants.TAG, 3);
        }
        return true;
    }

    public void run() {
        if (h(this.f8471e)) {
            this.f8473g.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            this.f8474h.n(true);
            if (!this.f8472f.g()) {
                this.f8474h.n(false);
                if (h(this.f8471e)) {
                    try {
                        this.f8473g.release();
                    } catch (RuntimeException unused) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f8471e) || i()) {
                if (this.f8474h.r()) {
                    this.f8474h.n(false);
                } else {
                    this.f8474h.s(this.f8475i);
                }
                if (h(this.f8471e)) {
                    try {
                        this.f8473g.release();
                    } catch (RuntimeException unused2) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f8471e)) {
                    try {
                        this.f8473g.release();
                    } catch (RuntimeException unused3) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.e(Constants.TAG, valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f8474h.n(false);
            if (h(this.f8471e)) {
                try {
                    this.f8473g.release();
                } catch (RuntimeException unused4) {
                    Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (h(this.f8471e)) {
                try {
                    this.f8473g.release();
                } catch (RuntimeException unused5) {
                    Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
