package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.s;

final class q3 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final w8 f6345a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6346b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6347c;

    q3(w8 w8Var) {
        s.k(w8Var);
        this.f6345a = w8Var;
    }

    public final void b() {
        this.f6345a.g();
        this.f6345a.b().h();
        if (!this.f6346b) {
            this.f6345a.c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6347c = this.f6345a.X().n();
            this.f6345a.d().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6347c));
            this.f6346b = true;
        }
    }

    public final void c() {
        this.f6345a.g();
        this.f6345a.b().h();
        this.f6345a.b().h();
        if (this.f6346b) {
            this.f6345a.d().v().a("Unregistering connectivity change receiver");
            this.f6346b = false;
            this.f6347c = false;
            try {
                this.f6345a.c().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f6345a.d().r().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f6345a.g();
        String action = intent.getAction();
        this.f6345a.d().v().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean n10 = this.f6345a.X().n();
            if (this.f6347c != n10) {
                this.f6347c = n10;
                this.f6345a.b().z(new p3(this, n10));
                return;
            }
            return;
        }
        this.f6345a.d().w().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
