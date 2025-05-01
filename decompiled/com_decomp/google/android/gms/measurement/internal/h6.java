package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import h4.t;

final class h6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i6 f6025e;

    /* synthetic */ h6(i6 i6Var, t tVar) {
        this.f6025e = i6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f6025e.f5994a.d().v().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f6025e.f5994a.N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.f6025e.f5994a.b().z(new g6(this, z10, data, str, queryParameter));
                    }
                }
            }
        } catch (RuntimeException e10) {
            this.f6025e.f5994a.d().r().b("Throwable caught in onActivityCreated", e10);
        } catch (Throwable th) {
            this.f6025e.f5994a.K().z(activity, bundle);
            throw th;
        }
        this.f6025e.f5994a.K().z(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f6025e.f5994a.K().A(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f6025e.f5994a.K().B(activity);
        h8 M = this.f6025e.f5994a.M();
        M.f5994a.b().z(new a8(M, M.f5994a.e().a()));
    }

    public final void onActivityResumed(Activity activity) {
        h8 M = this.f6025e.f5994a.M();
        M.f5994a.b().z(new z7(M, M.f5994a.e().a()));
        this.f6025e.f5994a.K().C(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f6025e.f5994a.K().D(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
