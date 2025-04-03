package com.google.android.gms.measurement.internal;

import a4.d;
import a4.e;

public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    final n4 f5832a;

    a4(w8 w8Var) {
        this.f5832a = w8Var.b0();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        try {
            d a10 = e.a(this.f5832a.c());
            if (a10 != null) {
                return a10.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f5832a.d().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f5832a.d().v().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
