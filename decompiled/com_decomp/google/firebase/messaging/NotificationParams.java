package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class NotificationParams {
    private final Bundle data;

    public NotificationParams(Bundle bundle) {
        if (bundle != null) {
            this.data = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    private static int getLightColor(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean isAnalyticsKey(String str) {
        return str.startsWith(Constants.AnalyticsKeys.PREFIX) || str.equals(Constants.MessagePayloadKeys.FROM);
    }

    private static boolean isReservedKey(String str) {
        return str.startsWith(Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX) || str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) || str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }

    private static String keyWithOldPrefix(String str) {
        return !str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str : str.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }

    private String normalizePrefix(String str) {
        if (!this.data.containsKey(str) && str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            String keyWithOldPrefix = keyWithOldPrefix(str);
            if (this.data.containsKey(keyWithOldPrefix)) {
                return keyWithOldPrefix;
            }
        }
        return str;
    }

    private static String userFriendlyKey(String str) {
        return str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str.substring(6) : str;
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException unused) {
            String userFriendlyKey = userFriendlyKey(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(userFriendlyKey).length() + 38 + String.valueOf(string).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(userFriendlyKey);
            sb2.append("(");
            sb2.append(string);
            sb2.append(") into an int");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            String userFriendlyKey = userFriendlyKey(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(userFriendlyKey).length() + 50 + String.valueOf(string).length());
            sb2.append("Malformed JSON for key ");
            sb2.append(userFriendlyKey);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(", falling back to default");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public int[] getLightSettings() {
        String str;
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.LIGHT_SETTINGS);
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() == 3) {
                iArr[0] = getLightColor(jSONArray.optString(0));
                iArr[1] = jSONArray.optInt(1);
                iArr[2] = jSONArray.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(jSONArray);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf);
            sb2.append(". Skipping setting LightSettings");
            str = sb2.toString();
            Log.w("NotificationParams", str);
            return null;
        } catch (IllegalArgumentException e10) {
            String valueOf2 = String.valueOf(jSONArray);
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 60 + String.valueOf(message).length());
            sb3.append("LightSettings is invalid: ");
            sb3.append(valueOf2);
            sb3.append(". ");
            sb3.append(message);
            sb3.append(". Skipping setting LightSettings");
            str = sb3.toString();
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public Uri getLink() {
        String string = getString(Constants.MessageNotificationKeys.LINK_ANDROID);
        if (TextUtils.isEmpty(string)) {
            string = getString(Constants.MessageNotificationKeys.LINK);
        }
        if (!TextUtils.isEmpty(string)) {
            return Uri.parse(string);
        }
        return null;
    }

    public Object[] getLocalizationArgsForKey(String str) {
        JSONArray jSONArray = getJSONArray(String.valueOf(str).concat(Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX));
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArray.optString(i10);
        }
        return strArr;
    }

    public String getLocalizationResourceForKey(String str) {
        return getString(String.valueOf(str).concat(Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX));
    }

    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            String userFriendlyKey = userFriendlyKey(String.valueOf(str2).concat(Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX));
            StringBuilder sb2 = new StringBuilder(String.valueOf(userFriendlyKey).length() + 49 + String.valueOf(str2).length());
            sb2.append(userFriendlyKey);
            sb2.append(" resource not found: ");
            sb2.append(str2);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e10) {
            String userFriendlyKey2 = userFriendlyKey(str2);
            String arrays = Arrays.toString(localizationArgsForKey);
            StringBuilder sb3 = new StringBuilder(String.valueOf(userFriendlyKey2).length() + 58 + String.valueOf(arrays).length());
            sb3.append("Missing format argument for ");
            sb3.append(userFriendlyKey2);
            sb3.append(": ");
            sb3.append(arrays);
            sb3.append(" Default value will be used.");
            Log.w("NotificationParams", sb3.toString(), e10);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            String userFriendlyKey = userFriendlyKey(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(userFriendlyKey).length() + 38 + String.valueOf(string).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(userFriendlyKey);
            sb2.append("(");
            sb2.append(string);
            sb2.append(") into a long");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public String getNotificationChannelId() {
        return getString(Constants.MessageNotificationKeys.CHANNEL);
    }

    /* access modifiers changed from: package-private */
    public Integer getNotificationCount() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= 0) {
            return integer;
        }
        String valueOf = String.valueOf(integer);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
        sb2.append("notificationCount is invalid: ");
        sb2.append(valueOf);
        sb2.append(". Skipping setting notificationCount.");
        Log.w(Constants.TAG, sb2.toString());
        return null;
    }

    /* access modifiers changed from: package-private */
    public Integer getNotificationPriority() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        String valueOf = String.valueOf(integer);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
        sb2.append("notificationPriority is invalid ");
        sb2.append(valueOf);
        sb2.append(". Skipping setting notificationPriority.");
        Log.w(Constants.TAG, sb2.toString());
        return null;
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        return !TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    public String getSoundResourceName() {
        String string = getString(Constants.MessageNotificationKeys.SOUND_2);
        return TextUtils.isEmpty(string) ? getString(Constants.MessageNotificationKeys.SOUND) : string;
    }

    public String getString(String str) {
        return this.data.getString(normalizePrefix(str));
    }

    public long[] getVibrateTimings() {
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.VIBRATE_TIMINGS);
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() > 1) {
                int length = jSONArray.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = jSONArray.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(jSONArray);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 74);
            sb2.append("User defined vibrateTimings is invalid: ");
            sb2.append(valueOf);
            sb2.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer getVisibility() {
        Integer integer = getInteger(Constants.MessageNotificationKeys.VISIBILITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        String valueOf = String.valueOf(integer);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
        sb2.append("visibility is invalid: ");
        sb2.append(valueOf);
        sb2.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb2.toString());
        return null;
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString(Constants.MessageNotificationKeys.IMAGE_URL));
    }

    public boolean isNotification() {
        return getBoolean(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION);
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = new Bundle(this.data);
        for (String next : this.data.keySet()) {
            if (!isAnalyticsKey(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = new Bundle(this.data);
        for (String next : this.data.keySet()) {
            if (isReservedKey(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) || "1".equals(bundle.getString(keyWithOldPrefix(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)));
    }
}
