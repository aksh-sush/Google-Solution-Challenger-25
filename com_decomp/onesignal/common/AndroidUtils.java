package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import com.google.firebase.messaging.Constants;
import db.g;
import db.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import l7.f;

public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    public enum a {
        DATA(Constants.ScionAnalytics.MessageType.DATA_MESSAGE),
        HTTPS("https"),
        HTTP("http");
        
        public static final C0114a Companion = null;
        /* access modifiers changed from: private */
        public final String text;

        /* renamed from: com.onesignal.common.AndroidUtils$a$a  reason: collision with other inner class name */
        public static final class C0114a {
            private C0114a() {
            }

            public /* synthetic */ C0114a(g gVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (p.l(aVar.text, str, true)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            Companion = new C0114a((g) null);
        }

        private a(String str) {
            this.text = str;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.DATA.ordinal()] = 1;
            iArr[a.HTTPS.ordinal()] = 2;
            iArr[a.HTTP.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> list, f fVar) {
        l.e(list, "permissions");
        l.e(fVar, "applicationService");
        PackageInfo packageInfo = fVar.getAppContext().getPackageManager().getPackageInfo(fVar.getAppContext().getPackageName(), 4096);
        l.d(packageInfo, "applicationService.appCo…eManager.GET_PERMISSIONS)");
        String[] strArr = packageInfo.requestedPermissions;
        l.d(strArr, "packageInfo.requestedPermissions");
        List g10 = o.g(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (g10.contains((String) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final String getAppVersion(Context context) {
        Integer num;
        l.e(context, "context");
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String str) {
        l.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        l.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        l.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            l.d(applicationInfo, "context.packageManager.g…A_DATA,\n                )");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            com.onesignal.debug.internal.logging.a.error("Manifest application info not found", e10);
            return null;
        }
    }

    public final int getRandomDelay(int i10, int i11) {
        return new Random().nextInt((i11 + 1) - i10) + i10;
    }

    public final String getResourceString(Context context, String str, String str2) {
        l.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable th) {
        l.e(th, "throwable");
        return getRootCauseThrowable(th).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable th) {
        l.e(th, "subjectThrowable");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
            l.b(th);
        }
        return th;
    }

    public final int getTargetSdkVersion(Context context) {
        l.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            l.d(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 15;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i10) {
        l.e(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i10) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean hasJobIntentService() {
        return true;
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String str, boolean z10, f fVar) {
        l.e(str, "permission");
        l.e(fVar, "applicationService");
        try {
            PackageInfo packageInfo = fVar.getAppContext().getPackageManager().getPackageInfo(fVar.getAppContext().getPackageName(), 4096);
            l.d(packageInfo, "applicationService.appCo…NS,\n                    )");
            String[] strArr = packageInfo.requestedPermissions;
            l.d(strArr, "packageInfo.requestedPermissions");
            if (!o.g(Arrays.copyOf(strArr, strArr.length)).contains(str)) {
                return false;
            }
            return !z10 || e.INSTANCE.checkSelfPermission(fVar.getAppContext(), str) != -1;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean hasWakefulBroadcastReceiver() {
        return true;
    }

    public final boolean isActivityFullyReady(Activity activity) {
        l.e(activity, "activity");
        boolean z10 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z10;
        }
        View decorView = activity.getWindow().getDecorView();
        l.d(decorView, "activity.window.decorView");
        return z10 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isRunningOnMainThread() {
        return l.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        return str != null && !new lb.f("^[0-9]").a(str);
    }

    @Keep
    public final boolean opaqueHasClass(Class<?> cls) {
        l.e(cls, "_class");
        return true;
    }

    public final void openURLInBrowser(Context context, Uri uri) {
        l.e(context, "appContext");
        l.e(uri, "uri");
        context.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent intent;
        l.e(uri, "uri");
        a fromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = a.HTTP;
            String uri2 = uri.toString();
            l.d(uri2, "uri.toString()");
            if (!q.w(uri2, "://", false, 2, (Object) null)) {
                uri = Uri.parse("http://" + uri);
                l.d(uri, "parse(\"http://$uri\")");
            }
        }
        int i10 = b.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i10 != 1) {
            intent = (i10 == 2 || i10 == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            l.d(intent, "makeMainSelectorActivity…ent.CATEGORY_APP_BROWSER)");
            intent.setData(uri);
        }
        intent.addFlags(268435456);
        return intent;
    }

    public final void sleep(int i10) {
        try {
            Thread.sleep((long) i10);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public final void openURLInBrowser(Context context, String str) {
        l.e(context, "appContext");
        l.e(str, "url");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = l.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (!z10) {
                if (!z11) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        Uri parse = Uri.parse(str.subSequence(i10, length + 1).toString());
        l.d(parse, "parse(url.trim { it <= ' ' })");
        openURLInBrowser(context, parse);
    }
}
