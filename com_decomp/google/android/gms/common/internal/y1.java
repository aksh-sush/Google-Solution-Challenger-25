package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

public final class y1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f5731f = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f5732a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5733b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f5734c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f5735d = 4225;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5736e;

    public y1(String str, String str2, int i10, boolean z10) {
        s.g(str);
        this.f5732a = str;
        s.g(str2);
        this.f5733b = str2;
        this.f5736e = z10;
    }

    public final ComponentName a() {
        return this.f5734c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f5732a == null) {
            return new Intent().setComponent(this.f5734c);
        }
        Intent intent = null;
        if (this.f5736e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f5732a);
            try {
                bundle = context.getContentResolver().call(f5731f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f5732a)));
            }
        }
        return intent == null ? new Intent(this.f5732a).setPackage(this.f5733b) : intent;
    }

    public final String c() {
        return this.f5733b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return q.b(this.f5732a, y1Var.f5732a) && q.b(this.f5733b, y1Var.f5733b) && q.b(this.f5734c, y1Var.f5734c) && this.f5736e == y1Var.f5736e;
    }

    public final int hashCode() {
        return q.c(this.f5732a, this.f5733b, this.f5734c, 4225, Boolean.valueOf(this.f5736e));
    }

    public final String toString() {
        String str = this.f5732a;
        if (str != null) {
            return str;
        }
        s.k(this.f5734c);
        return this.f5734c.flattenToString();
    }
}
