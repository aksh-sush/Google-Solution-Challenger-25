package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5646a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static d2 f5647b = null;

    /* renamed from: c  reason: collision with root package name */
    static HandlerThread f5648c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f5649d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f5650e = false;

    public static i a(Context context) {
        synchronized (f5646a) {
            if (f5647b == null) {
                f5647b = new d2(context.getApplicationContext(), f5650e ? b().getLooper() : context.getMainLooper(), f5649d);
            }
        }
        return f5647b;
    }

    public static HandlerThread b() {
        synchronized (f5646a) {
            HandlerThread handlerThread = f5648c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f5648c = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f5648c;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(y1 y1Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        c(new y1(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean e(y1 y1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
