package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import h3.a;
import n3.e;
import n4.i;
import q3.j;
import q3.o;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final f f5173a = new f((e) null);

    /* renamed from: b  reason: collision with root package name */
    static int f5174b = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, a.f10930c, (a.d) googleSignInOptions, (t) new com.google.android.gms.common.api.internal.b());
    }

    private final synchronized int f() {
        int i10;
        i10 = f5174b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            j q10 = j.q();
            int j10 = q10.j(applicationContext, o.f14688a);
            if (j10 == 0) {
                i10 = 4;
                f5174b = 4;
            } else if (q10.d(applicationContext, j10, (String) null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                i10 = 2;
                f5174b = 2;
            } else {
                i10 = 3;
                f5174b = 3;
            }
        }
        return i10;
    }

    public Intent d() {
        Context applicationContext = getApplicationContext();
        int f10 = f();
        int i10 = f10 - 1;
        if (f10 == 0) {
            throw null;
        } else if (i10 != 2) {
            return i10 != 3 ? o3.o.b(applicationContext, (GoogleSignInOptions) getApiOptions()) : o3.o.c(applicationContext, (GoogleSignInOptions) getApiOptions());
        } else {
            return o3.o.a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
    }

    public i e() {
        return r.c(o3.o.e(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }

    public i signOut() {
        return r.c(o3.o.f(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, h3.a.f10930c, (a.d) googleSignInOptions, new d.a.C0087a().c(new com.google.android.gms.common.api.internal.b()).a());
    }
}
