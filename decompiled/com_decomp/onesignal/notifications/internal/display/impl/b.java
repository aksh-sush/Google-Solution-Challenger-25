package com.onesignal.notifications.internal.display.impl;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.k;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import db.l;
import g9.c;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import l7.f;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements i9.a {
    private final f _applicationService;
    private final e9.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass = NotificationDismissReceiver.class;

    public static final class a {
        private k.e compatBuilder;
        private boolean hasLargeIcon;

        public final k.e getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(k.e eVar) {
            this.compatBuilder = eVar;
        }

        public final void setHasLargeIcon(boolean z10) {
            this.hasLargeIcon = z10;
        }
    }

    public b(f fVar, e9.a aVar) {
        l.e(fVar, "_applicationService");
        l.e(aVar, "_notificationChannelManager");
        this._applicationService = fVar;
        this._notificationChannelManager = aVar;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.a.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            l.b(resourceString);
            list.add(resourceString);
            list2.add(d9.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(d9.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(d9.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i10);
                    String optString = jSONObject4.optString("text");
                    l.d(optString, "button.optString(\"text\")");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    l.d(optString2, "button.optString(\"id\")");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i10) {
        if (i10 > 9) {
            return 2;
        }
        if (i10 > 7) {
            return 1;
        }
        if (i10 > 4) {
            return 0;
        }
        return i10 > 2 ? -1 : -2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|7|(2:9|10)|11|12|(2:14|15)|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ all -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025 A[Catch:{ all -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.math.BigInteger getAccentColor(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r5.has(r0)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0015 }
            java.lang.String r5 = r5.optString(r0, r2)     // Catch:{ all -> 0x0015 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            com.onesignal.common.AndroidUtils r5 = com.onesignal.common.AndroidUtils.INSTANCE     // Catch:{ all -> 0x002b }
            l7.f r0 = r4._applicationService     // Catch:{ all -> 0x002b }
            android.content.Context r0 = r0.getAppContext()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "onesignal_notification_accent_color"
            java.lang.String r5 = r5.getResourceString(r0, r3, r2)     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x002b
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x002b }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x002b }
            return r0
        L_0x002b:
            com.onesignal.common.AndroidUtils r5 = com.onesignal.common.AndroidUtils.INSTANCE     // Catch:{ all -> 0x0041 }
            l7.f r0 = r4._applicationService     // Catch:{ all -> 0x0041 }
            android.content.Context r0 = r0.getAppContext()     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r5 = r5.getManifestMeta(r0, r3)     // Catch:{ all -> 0x0041 }
            if (r5 == 0) goto L_0x0041
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0041 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.b.getAccentColor(org.json.JSONObject):java.math.BigInteger");
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
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
        String obj = str.subSequence(i10, length + 1).toString();
        return (p.t(obj, "http://", false, 2, (Object) null) || p.t(obj, "https://", false, 2, (Object) null)) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            l.b(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    Context currentContext2 = getCurrentContext();
                    l.b(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.a.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        l.b(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
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
        String obj = str.subSequence(i10, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", (String) null));
        return resourceIcon != 0 ? resourceIcon : getDefaultSmallIconId();
    }

    private final boolean isSoundEnabled(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        return !l.a("null", optString) && !l.a("nil", optString);
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            l.b(contextResources);
            int dimension = (int) contextResources.getDimension(k7.b.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            l.b(contextResources2);
            int dimension2 = (int) contextResources2.getDimension(k7.b.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setAlertnessOptions(org.json.JSONObject r7, androidx.core.app.k.e r8) {
        /*
            r6 = this;
            java.lang.String r0 = "pri"
            r1 = 6
            int r0 = r7.optInt(r0, r1)
            int r0 = r6.convertOSToAndroidPriority(r0)
            r8.y(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "ledc"
            boolean r3 = r7.has(r0)
            r4 = 4
            if (r3 == 0) goto L_0x0041
            java.lang.String r3 = "led"
            int r3 = r7.optInt(r3, r2)
            if (r3 != r2) goto L_0x0041
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r7.optString(r0)     // Catch:{ all -> 0x0040 }
            r5 = 16
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0040 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x0040 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r8.u(r0, r3, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x0040:
        L_0x0041:
            r1 = 4
        L_0x0042:
            java.lang.String r0 = "vib"
            int r0 = r7.optInt(r0, r2)
            if (r0 != r2) goto L_0x0060
            java.lang.String r0 = "vib_pt"
            boolean r0 = r7.has(r0)
            if (r0 == 0) goto L_0x005e
            g9.h r0 = g9.h.INSTANCE
            long[] r0 = r0.parseVibrationPattern(r7)
            if (r0 == 0) goto L_0x0060
            r8.E(r0)
            goto L_0x0060
        L_0x005e:
            r1 = r1 | 2
        L_0x0060:
            boolean r0 = r6.isSoundEnabled(r7)
            if (r0 == 0) goto L_0x0082
            g9.h r0 = g9.h.INSTANCE
            android.content.Context r2 = r6.getCurrentContext()
            db.l.b(r2)
            java.lang.String r3 = "sound"
            r4 = 0
            java.lang.String r7 = r7.optString(r3, r4)
            android.net.Uri r7 = r0.getSoundUri(r2, r7)
            if (r7 == 0) goto L_0x0080
            r8.B(r7)
            goto L_0x0082
        L_0x0080:
            r1 = r1 | 1
        L_0x0082:
            r8.n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.b.setAlertnessOptions(org.json.JSONObject, androidx.core.app.k$e):void");
    }

    public void addNotificationActionButtons(JSONObject jSONObject, a aVar, k.e eVar, int i10, String str) {
        int i11;
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        int i12 = i10;
        String str2 = str;
        l.e(jSONObject2, "fcmJson");
        l.e(aVar2, "intentGenerator");
        try {
            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject3.has(d9.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(d9.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject4.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject4.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i13);
                        JSONObject jSONObject5 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = aVar2.getNewBaseIntent(i12);
                        newBaseIntent.setAction("" + i13);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject5.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject5.toString());
                        if (str2 != null) {
                            newBaseIntent.putExtra("summary", str2);
                        } else if (jSONObject2.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject2.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = aVar2.getNewActionPendingIntent(i12, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i11 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                            }
                        } else {
                            i11 = 0;
                        }
                        l.b(eVar);
                        eVar.a(i11, optJSONObject.optString("text"), newActionPendingIntent);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            th.printStackTrace();
        }
    }

    public void addXiaomiSettings(a aVar, Notification notification) {
        l.e(notification, "notification");
        l.b(aVar);
        if (aVar.getHasLargeIcon()) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0082 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ca A[SYNTHETIC, Splitter:B:29:0x00ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onesignal.notifications.internal.display.impl.b.a getBaseOneSignalNotificationBuilder(g9.d r10) {
        /*
            r9 = this;
            java.lang.String r0 = "vis"
            java.lang.String r1 = "notificationJob"
            db.l.e(r10, r1)
            org.json.JSONObject r1 = r10.getJsonPayload()
            db.l.b(r1)
            com.onesignal.notifications.internal.display.impl.b$a r2 = new com.onesignal.notifications.internal.display.impl.b$a
            r2.<init>()
            e9.a r3 = r9._notificationChannelManager     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = r3.createNotificationChannel(r10)     // Catch:{ all -> 0x0026 }
            androidx.core.app.k$e r4 = new androidx.core.app.k$e     // Catch:{ all -> 0x0026 }
            android.content.Context r5 = r9.getCurrentContext()     // Catch:{ all -> 0x0026 }
            db.l.b(r5)     // Catch:{ all -> 0x0026 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0026 }
            goto L_0x0032
        L_0x0026:
            androidx.core.app.k$e r4 = new androidx.core.app.k$e
            android.content.Context r3 = r9.getCurrentContext()
            db.l.b(r3)
            r4.<init>(r3)
        L_0x0032:
            java.lang.String r3 = "alert"
            r5 = 0
            java.lang.String r3 = r1.optString(r3, r5)
            r6 = 1
            androidx.core.app.k$e r7 = r4.g(r6)
            int r8 = r9.getSmallIconId(r1)
            androidx.core.app.k$e r7 = r7.A(r8)
            androidx.core.app.k$c r8 = new androidx.core.app.k$c
            r8.<init>()
            androidx.core.app.k$c r8 = r8.h(r3)
            androidx.core.app.k$e r7 = r7.C(r8)
            androidx.core.app.k$e r7 = r7.l(r3)
            r7.D(r3)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x006e
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = db.l.a(r7, r8)
            if (r7 != 0) goto L_0x0075
        L_0x006e:
            java.lang.CharSequence r7 = r9.getTitle(r1)
            r4.m(r7)
        L_0x0075:
            java.math.BigInteger r7 = r9.getAccentColor(r1)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0082
            int r7 = r7.intValue()     // Catch:{ all -> 0x0082 }
            r4.i(r7)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            boolean r7 = r1.has(r0)     // Catch:{ all -> 0x009b }
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r7 = "fcmJson.optString(\"vis\")"
            db.l.d(r0, r7)     // Catch:{ all -> 0x009b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x009b }
            goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            r4.F(r0)     // Catch:{ all -> 0x009b }
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            android.graphics.Bitmap r0 = r9.getLargeIcon(r1)
            if (r0 == 0) goto L_0x00a8
            r2.setHasLargeIcon(r6)
            r4.t(r0)
        L_0x00a8:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r5)
            android.graphics.Bitmap r0 = r9.getBitmap(r0)
            if (r0 == 0) goto L_0x00c4
            androidx.core.app.k$b r5 = new androidx.core.app.k$b
            r5.<init>()
            androidx.core.app.k$b r0 = r5.i(r0)
            androidx.core.app.k$b r0 = r0.j(r3)
            r4.C(r0)
        L_0x00c4:
            java.lang.Long r0 = r10.getShownTimeStamp()
            if (r0 == 0) goto L_0x00dc
            java.lang.Long r10 = r10.getShownTimeStamp()     // Catch:{ all -> 0x00dc }
            db.l.b(r10)     // Catch:{ all -> 0x00dc }
            long r5 = r10.longValue()     // Catch:{ all -> 0x00dc }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r4.G(r5)     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r9.setAlertnessOptions(r1, r4)
            r2.setCompatBuilder(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.b.getBaseOneSignalNotificationBuilder(g9.d):com.onesignal.notifications.internal.display.impl.b$a");
    }

    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    public int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        if (drawableId3 != 0) {
            return drawableId3;
        }
        return 17301598;
    }

    public int getGroupAlertBehavior() {
        return Build.VERSION.SDK_INT >= 24 ? 2 : 1;
    }

    public Intent getNewBaseDismissIntent(int i10) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
        l.d(putExtra, "Intent(currentContext, n…tExtra(\"dismissed\", true)");
        return putExtra;
    }

    public PendingIntent getNewDismissActionPendingIntent(int i10, Intent intent) {
        l.e(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i10, intent, 201326592);
        l.d(broadcast, "getBroadcast(\n          …FLAG_IMMUTABLE,\n        )");
        return broadcast;
    }

    public CharSequence getTitle(JSONObject jSONObject) {
        l.e(jSONObject, "fcmJson");
        String optString = jSONObject.optString("title", (String) null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        l.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        l.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        l.d(applicationLabel, "currentContext!!.package…cationInfo,\n            )");
        return applicationLabel;
    }

    public void removeNotifyOptions(k.e eVar) {
        l.b(eVar);
        eVar.x(true).n(0).B((Uri) null).E((long[]) null).D((CharSequence) null);
    }
}
