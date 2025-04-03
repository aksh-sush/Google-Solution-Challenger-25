package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

public final /* synthetic */ class c4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f5890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5891b;

    public /* synthetic */ c4(h4 h4Var, String str) {
        this.f5890a = h4Var;
        this.f5891b = str;
    }

    public final Object call() {
        return new zzn("internal.remoteConfig", new g4(this.f5890a, this.f5891b));
    }
}
