package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.k;
import androidx.core.content.a;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import q3.i;

public final class CommonNotificationBuilder {
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {
        public final int id = 0;
        public final k.e notificationBuilder;
        public final String tag;

        DisplayNotificationInfo(k.e eVar, String str, int i10) {
            this.notificationBuilder = eVar;
            this.tag = str;
        }
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent createTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (createTargetIntent == null) {
            return null;
        }
        createTargetIntent.addFlags(67108864);
        createTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            createTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), createTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, NotificationParams notificationParams) {
        if (!shouldUploadMetrics(notificationParams)) {
            return null;
        }
        return createMessagingPendingIntent(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.paramsForAnalyticsIntent()));
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), getPendingIntentFlags(1073741824));
    }

    static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context.getPackageName(), notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), context.getResources(), context.getPackageManager(), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(Constants.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                Log.w(Constants.TAG, sb2.toString());
            }
        }
        int i10 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(a.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w(Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z10 = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            z10 |= true;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? z10 | true ? 1 : 0 : z10 ? 1 : 0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            Log.w(Constants.TAG, sb2.toString());
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 122);
                    sb2.append("Notification Channel requested (");
                    sb2.append(str);
                    sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w(Constants.TAG, sb2.toString());
                }
                String string = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
                if (TextUtils.isEmpty(string)) {
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                } else if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                } else {
                    str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                }
                Log.w(Constants.TAG, str2);
                if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                    int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e(Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        str3 = "Misc";
                    } else {
                        str3 = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(i.a(FCM_FALLBACK_NOTIFICATION_CHANNEL, str3, 3));
                }
                return FCM_FALLBACK_NOTIFICATION_CHANNEL;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static int getPendingIntentFlags(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            Log.w(Constants.TAG, sb2.toString());
        }
        int i10 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i10 == 0 || !isValidIcon(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 35);
                sb3.append("Couldn't get own application info: ");
                sb3.append(valueOf);
                Log.w(Constants.TAG, sb3.toString());
            }
        }
        if (i10 == 0 || !isValidIcon(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(soundResourceName).length());
        sb2.append("android.resource://");
        sb2.append(str);
        sb2.append("/raw/");
        sb2.append(soundResourceName);
        return Uri.parse(sb2.toString());
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("FCM-Notification:");
        sb2.append(uptimeMillis);
        return sb2.toString();
    }

    private static boolean isValidIcon(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!a.a(resources.getDrawable(i10, (Resources.Theme) null))) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i10);
            Log.e(Constants.TAG, sb2.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            Log.e(Constants.TAG, sb3.toString());
            return false;
        }
    }

    static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, String str, NotificationParams notificationParams, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        k.e eVar = new k.e(context, str2);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, str, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            eVar.m(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, str, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            eVar.l(possiblyLocalizedString2);
            eVar.C(new k.c().h(possiblyLocalizedString2));
        }
        eVar.A(getSmallIcon(packageManager, resources, str, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle));
        Uri sound = getSound(str, notificationParams, resources);
        if (sound != null) {
            eVar.B(sound);
        }
        eVar.k(createContentIntent(context, notificationParams, str, packageManager));
        PendingIntent createDeleteIntent = createDeleteIntent(context, notificationParams);
        if (createDeleteIntent != null) {
            eVar.o(createDeleteIntent);
        }
        Integer color = getColor(context, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            eVar.i(color.intValue());
        }
        eVar.g(!notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        eVar.v(notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY));
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            eVar.D(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            eVar.y(notificationPriority.intValue());
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            eVar.F(visibility.intValue());
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            eVar.w(notificationCount.intValue());
        }
        Long l10 = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l10 != null) {
            eVar.z(true);
            eVar.G(l10.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            eVar.E(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            eVar.u(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        eVar.n(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(eVar, getTag(notificationParams), 0);
    }
}
