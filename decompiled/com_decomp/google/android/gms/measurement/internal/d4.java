package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class d4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f5906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5907b;

    public /* synthetic */ d4(h4 h4Var, String str) {
        this.f5906a = h4Var;
        this.f5907b = str;
    }

    public final Object call() {
        h4 h4Var = this.f5906a;
        String str = this.f5907b;
        u4 T = h4Var.f6214b.V().T(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        h4Var.f5994a.z().q();
        hashMap.put("gmp_version", 42097L);
        if (T != null) {
            String h02 = T.h0();
            if (h02 != null) {
                hashMap.put("app_version", h02);
            }
            hashMap.put("app_version_int", Long.valueOf(T.M()));
            hashMap.put("dynamite_version", Long.valueOf(T.V()));
        }
        return hashMap;
    }
}
