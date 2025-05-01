package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import db.g;
import db.l;
import g7.b;
import x7.d;

public final class PermissionsActivity extends Activity {
    public static final a Companion = new a((g) null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String androidPermissionString;
    private String permissionRequestType;
    private y7.a preferenceService;
    private com.onesignal.core.internal.permissions.impl.a requestPermissionService;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final void handleBundleParams(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(k7.a.onesignal_fade_in, k7.a.onesignal_fade_out);
            return;
        }
        reregisterCallbackHandlers(bundle);
        l.b(bundle);
        this.permissionRequestType = bundle.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = bundle.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        this.androidPermissionString = string;
        requestPermission(string);
    }

    /* access modifiers changed from: private */
    /* renamed from: onRequestPermissionsResult$lambda-0  reason: not valid java name */
    public static final void m0onRequestPermissionsResult$lambda0(int[] iArr, PermissionsActivity permissionsActivity) {
        l.e(iArr, "$grantResults");
        l.e(permissionsActivity, "this$0");
        boolean z10 = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        }
        com.onesignal.core.internal.permissions.impl.a aVar = permissionsActivity.requestPermissionService;
        l.b(aVar);
        String str = permissionsActivity.permissionRequestType;
        l.b(str);
        d.a callback = aVar.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.permissionRequestType);
        } else if (z10) {
            callback.onAccept();
            y7.a aVar2 = permissionsActivity.preferenceService;
            l.b(aVar2);
            aVar2.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + permissionsActivity.androidPermissionString, Boolean.TRUE);
        } else {
            callback.onReject(permissionsActivity.shouldShowSettings());
        }
    }

    private final void requestPermission(String str) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        l.b(aVar);
        if (!aVar.getWaiting()) {
            com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
            l.b(aVar2);
            aVar2.setWaiting(true);
            com.onesignal.core.internal.permissions.impl.a aVar3 = this.requestPermissionService;
            l.b(aVar3);
            com.onesignal.common.a aVar4 = com.onesignal.common.a.INSTANCE;
            aVar3.setShouldShowRequestPermissionRationaleBeforeRequest(aVar4.shouldShowRequestPermissionRationale(this, str));
            aVar4.requestPermissions(this, new String[]{str}, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        l.b(bundle);
        String string = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    private final boolean shouldShowSettings() {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        l.b(aVar);
        if (!aVar.getFallbackToSettings()) {
            return false;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        l.b(aVar2);
        if (!aVar2.getShouldShowRequestPermissionRationaleBeforeRequest() || com.onesignal.common.a.INSTANCE.shouldShowRequestPermissionRationale(this, this.androidPermissionString)) {
            y7.a aVar3 = this.preferenceService;
            l.b(aVar3);
            Boolean bool = aVar3.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + this.androidPermissionString, Boolean.FALSE);
            l.b(bool);
            return bool.booleanValue();
        }
        y7.a aVar4 = this.preferenceService;
        l.b(aVar4);
        aVar4.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + this.androidPermissionString, Boolean.TRUE);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b.f(this)) {
            b bVar = b.f10823a;
            this.requestPermissionService = (com.onesignal.core.internal.permissions.impl.a) bVar.c().getService(com.onesignal.core.internal.permissions.impl.a.class);
            this.preferenceService = (y7.a) bVar.c().getService(y7.a.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.e(strArr, "permissions");
        l.e(iArr, "grantResults");
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        l.b(aVar);
        aVar.setWaiting(false);
        if (i10 == 2) {
            new Handler().postDelayed(new a(iArr, this), 500);
        }
        finish();
        overridePendingTransition(k7.a.onesignal_fade_in, k7.a.onesignal_fade_out);
    }
}
