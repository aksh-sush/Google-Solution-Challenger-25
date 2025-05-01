package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import db.g;
import db.l;
import e2.s0;

public final class AuthenticationTokenManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4658d = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static AuthenticationTokenManager f4659e;

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f4660a;

    /* renamed from: b  reason: collision with root package name */
    private final k f4661b;

    /* renamed from: c  reason: collision with root package name */
    private j f4662c;

    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager a10;
            AuthenticationTokenManager a11 = AuthenticationTokenManager.f4659e;
            if (a11 != null) {
                return a11;
            }
            synchronized (this) {
                a10 = AuthenticationTokenManager.f4659e;
                if (a10 == null) {
                    p0.a b10 = p0.a.b(i0.l());
                    l.d(b10, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager = new AuthenticationTokenManager(b10, new k());
                    AuthenticationTokenManager.f4659e = authenticationTokenManager;
                    a10 = authenticationTokenManager;
                }
            }
            return a10;
        }
    }

    public AuthenticationTokenManager(p0.a aVar, k kVar) {
        l.e(aVar, "localBroadcastManager");
        l.e(kVar, "authenticationTokenCache");
        this.f4660a = aVar;
        this.f4661b = kVar;
    }

    private final void d(j jVar, j jVar2) {
        Intent intent = new Intent(i0.l(), CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", jVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", jVar2);
        this.f4660a.d(intent);
    }

    private final void f(j jVar, boolean z10) {
        j c10 = c();
        this.f4662c = jVar;
        if (z10) {
            k kVar = this.f4661b;
            if (jVar != null) {
                kVar.b(jVar);
            } else {
                kVar.a();
                s0 s0Var = s0.f9663a;
                s0.i(i0.l());
            }
        }
        if (!s0.e(c10, jVar)) {
            d(c10, jVar);
        }
    }

    public final j c() {
        return this.f4662c;
    }

    public final void e(j jVar) {
        f(jVar, true);
    }
}
