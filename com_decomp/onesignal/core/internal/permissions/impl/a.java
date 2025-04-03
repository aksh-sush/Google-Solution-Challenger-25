package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import db.l;
import java.util.HashMap;
import l7.f;
import x7.d;

public final class a extends Activity implements d {
    /* access modifiers changed from: private */
    public final f _application;
    private final HashMap<String, d.a> callbackMap = new HashMap<>();
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a  reason: collision with other inner class name */
    public static final class C0133a implements l7.d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;
        final /* synthetic */ a this$0;

        C0133a(a aVar, String str, String str2, Class<?> cls) {
            this.this$0 = aVar;
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        public void onActivityAvailable(Activity activity) {
            l.e(activity, "activity");
            Class<PermissionsActivity> cls = PermissionsActivity.class;
            if (l.a(activity.getClass(), cls)) {
                this.this$0._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, cls);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(k7.a.onesignal_fade_in, k7.a.onesignal_fade_out);
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "activity");
        }
    }

    public a(f fVar) {
        l.e(fVar, "_application");
        this._application = fVar;
    }

    public final d.a getCallback(String str) {
        l.e(str, "permissionType");
        return this.callbackMap.get(str);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    public void registerAsCallback(String str, d.a aVar) {
        l.e(str, "permissionType");
        l.e(aVar, "callback");
        this.callbackMap.put(str, aVar);
    }

    public final void setFallbackToSettings(boolean z10) {
        this.fallbackToSettings = z10;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z10) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z10;
    }

    public final void setWaiting(boolean z10) {
        this.waiting = z10;
    }

    public void startPrompt(boolean z10, String str, String str2, Class<?> cls) {
        l.e(cls, "callbackClass");
        if (!this.waiting) {
            this.fallbackToSettings = z10;
            this._application.addActivityLifecycleHandler(new C0133a(this, str, str2, cls));
        }
    }
}
