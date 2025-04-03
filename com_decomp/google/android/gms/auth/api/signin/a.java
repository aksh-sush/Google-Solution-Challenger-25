package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.s;
import n3.b;
import n4.i;
import n4.l;
import o3.o;

public abstract class a {
    public static b a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new b(activity, (GoogleSignInOptions) s.k(googleSignInOptions));
    }

    public static b b(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) s.k(googleSignInOptions));
    }

    public static i c(Intent intent) {
        b d10 = o.d(intent);
        GoogleSignInAccount a10 = d10.a();
        return (!d10.getStatus().j0() || a10 == null) ? l.d(com.google.android.gms.common.internal.b.a(d10.getStatus())) : l.e(a10);
    }
}
