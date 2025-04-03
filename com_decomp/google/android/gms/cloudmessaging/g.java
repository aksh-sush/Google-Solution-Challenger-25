package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final b f5201e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f5202f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f5203g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5204h;

    /* renamed from: i  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f5205i;

    g(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f5201e = bVar;
        this.f5202f = intent;
        this.f5203g = context;
        this.f5204h = z10;
        this.f5205i = pendingResult;
    }

    public final void run() {
        this.f5201e.zza(this.f5202f, this.f5203g, this.f5204h, this.f5205i);
    }
}
