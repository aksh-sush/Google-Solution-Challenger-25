package com.onesignal.notifications.internal.registration.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import cb.p;
import com.onesignal.common.AndroidUtils;
import db.g;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.h;
import mb.h0;
import mb.w0;
import q3.j;
import sa.o;
import sa.t;
import va.d;

public final class a {
    public static final C0182a Companion = new C0182a((g) null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    /* access modifiers changed from: private */
    public final f _applicationService;
    /* access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;

    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a  reason: collision with other inner class name */
    public static final class C0182a {
        private C0182a() {
        }

        public /* synthetic */ C0182a(g gVar) {
            this();
        }
    }

    static final class b extends l implements p {
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        public static final void m11invokeSuspend$lambda0(a aVar, Activity activity, DialogInterface dialogInterface, int i10) {
            aVar.openPlayStoreToApp(activity);
        }

        /* access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1  reason: not valid java name */
        public static final void m12invokeSuspend$lambda1(a aVar, DialogInterface dialogInterface, int i10) {
            ((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        public final d create(Object obj, d dVar) {
            return new b(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                Activity current = this.this$0._applicationService.getCurrent();
                if (current == null) {
                    return t.f15300a;
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
                String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
                new AlertDialog.Builder(current).setMessage(resourceString).setPositiveButton(resourceString2, new b(this.this$0, current)).setNegativeButton(resourceString3, new c(this.this$0)).setNeutralButton(androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(f fVar, q7.a aVar, com.onesignal.core.internal.config.b bVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_deviceService");
        db.l.e(bVar, "_configModelStore");
        this._applicationService = fVar;
        this._deviceService = aVar;
        this._configModelStore = bVar;
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            CharSequence loadLabel = packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager);
            db.l.c(loadLabel, "null cannot be cast to non-null type kotlin.String");
            return !db.l.a((String) loadLabel, "Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            j q10 = j.q();
            db.l.d(q10, "getInstance()");
            PendingIntent e10 = q10.e(activity, q10.i(this._applicationService.getAppContext()), PLAY_SERVICES_RESOLUTION_REQUEST);
            if (e10 != null) {
                e10.send();
            }
        } catch (PendingIntent.CanceledException e11) {
            e11.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(d dVar) {
        if (!this._deviceService.isAndroidDeviceType()) {
            return t.f15300a;
        }
        if (!isGooglePlayStoreInstalled() || ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getDisableGMSMissingPrompt() || ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            return t.f15300a;
        }
        Object g10 = h.g(w0.c(), new b(this, (d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }
}
