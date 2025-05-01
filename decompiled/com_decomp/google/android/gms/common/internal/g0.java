package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.k;

final class g0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f5644e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f5645f;

    g0(Intent intent, k kVar, int i10) {
        this.f5644e = intent;
        this.f5645f = kVar;
    }

    public final void a() {
        Intent intent = this.f5644e;
        if (intent != null) {
            this.f5645f.startActivityForResult(intent, 2);
        }
    }
}
