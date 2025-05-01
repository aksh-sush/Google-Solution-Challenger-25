package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import y3.n;

final class a2 implements ServiceConnection, e2 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f5578a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f5579b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5580c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f5581d;

    /* renamed from: e  reason: collision with root package name */
    private final y1 f5582e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f5583f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d2 f5584g;

    public a2(d2 d2Var, y1 y1Var) {
        this.f5584g = d2Var;
        this.f5582e = y1Var;
    }

    public final int a() {
        return this.f5579b;
    }

    public final ComponentName b() {
        return this.f5583f;
    }

    public final IBinder c() {
        return this.f5581d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f5578a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f5579b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (n.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            d2 d2Var = this.f5584g;
            boolean d10 = d2Var.f5609j.d(d2Var.f5606g, str, this.f5582e.b(d2Var.f5606g), this, 4225, executor);
            this.f5580c = d10;
            if (d10) {
                this.f5584g.f5607h.sendMessageDelayed(this.f5584g.f5607h.obtainMessage(1, this.f5582e), this.f5584g.f5611l);
            } else {
                this.f5579b = 2;
                try {
                    d2 d2Var2 = this.f5584g;
                    d2Var2.f5609j.c(d2Var2.f5606g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f5578a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f5584g.f5607h.removeMessages(1, this.f5582e);
        d2 d2Var = this.f5584g;
        d2Var.f5609j.c(d2Var.f5606g, this);
        this.f5580c = false;
        this.f5579b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f5578a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f5578a.isEmpty();
    }

    public final boolean j() {
        return this.f5580c;
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5584g.f5605f) {
            this.f5584g.f5607h.removeMessages(1, this.f5582e);
            this.f5581d = iBinder;
            this.f5583f = componentName;
            for (ServiceConnection onServiceConnected : this.f5578a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f5579b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5584g.f5605f) {
            this.f5584g.f5607h.removeMessages(1, this.f5582e);
            this.f5581d = null;
            this.f5583f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f5578a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f5579b = 2;
        }
    }
}
