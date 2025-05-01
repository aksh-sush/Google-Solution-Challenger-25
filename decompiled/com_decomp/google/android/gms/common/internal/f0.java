package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class f0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f5621e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Activity f5622f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f5623g;

    f0(Intent intent, Activity activity, int i10) {
        this.f5621e = intent;
        this.f5622f = activity;
        this.f5623g = i10;
    }

    public final void a() {
        Intent intent = this.f5621e;
        if (intent != null) {
            this.f5622f.startActivityForResult(intent, this.f5623g);
        }
    }
}
