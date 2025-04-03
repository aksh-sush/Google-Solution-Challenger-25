package com.onesignal.notifications.internal.display.impl;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.k;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.e;
import com.onesignal.notifications.p;
import com.onesignal.notifications.q;
import db.l;
import i9.b;
import i9.c;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Arrays;
import l7.f;
import org.json.JSONObject;
import sa.t;

public final class d implements b {
    private final f _applicationService;
    private final i9.a _notificationDisplayBuilder;
    private final l9.a _notificationLimitManager;
    private final c _summaryNotificationDisplayer;

    static final class a extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showNotification((g9.d) null, this);
        }
    }

    public d(f fVar, l9.a aVar, c cVar, i9.a aVar2) {
        l.e(fVar, "_applicationService");
        l.e(aVar, "_notificationLimitManager");
        l.e(cVar, "_summaryNotificationDisplayer");
        l.e(aVar2, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._notificationLimitManager = aVar;
        this._summaryNotificationDisplayer = cVar;
        this._notificationDisplayBuilder = aVar2;
    }

    private final void addBackgroundImage(JSONObject jSONObject, k.e eVar) {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            com.onesignal.debug.internal.logging.a.verbose$default("Cannot use background images in notifications for device on version: " + i10, (Throwable) null, 2, (Object) null);
            return;
        }
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            Context currentContext = getCurrentContext();
            l.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            int i11 = p.os_bgimage_notif_title;
            remoteViews.setTextViewText(i11, this._notificationDisplayBuilder.getTitle(jSONObject));
            int i12 = p.os_bgimage_notif_body;
            remoteViews.setTextViewText(i12, jSONObject.optString("alert"));
            RemoteViews remoteViews2 = remoteViews;
            JSONObject jSONObject3 = jSONObject2;
            setTextColor(remoteViews2, jSONObject3, i11, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews2, jSONObject3, i12, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                l.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    l.b(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if (l.a("right", str)) {
                remoteViews.setViewPadding(p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                int i13 = p.os_bgimage_notif_bgimage_right_aligned;
                remoteViews.setImageViewBitmap(i13, bitmap);
                remoteViews.setViewVisibility(i13, 0);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage, bitmap);
            }
            l.b(eVar);
            eVar.j(remoteViews);
            eVar.C((k.h) null);
        }
    }

    private final void applyNotificationExtender(g9.d dVar, k.e eVar) {
        Class<k.e> cls = k.e.class;
        if (dVar.hasExtender()) {
            try {
                Field declaredField = cls.getDeclaredField("R");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(eVar);
                l.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                l.b(eVar);
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                l.b(notification2);
                notification2.getNotificationExtender();
                l.b((Object) null);
                eVar.c((k.f) null);
                Object obj2 = declaredField.get(eVar);
                l.c(obj2, "null cannot be cast to non-null type android.app.Notification");
                Notification notification3 = (Notification) obj2;
                Field declaredField2 = cls.getDeclaredField("f");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("e");
                declaredField3.setAccessible(true);
                dVar.setOverriddenBodyFromExtender((CharSequence) declaredField2.get(eVar));
                dVar.setOverriddenTitleFromExtender((CharSequence) declaredField3.get(eVar));
                if (!dVar.isRestoring()) {
                    dVar.setOverriddenFlags(Integer.valueOf(notification3.flags));
                    dVar.setOverriddenSound(notification3.sound);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(k.e eVar, a aVar, JSONObject jSONObject, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString());
        l.d(putExtra, "intentGenerator.getNewBa…TA, gcmBundle.toString())");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        l.b(eVar);
        eVar.k(newActionPendingIntent);
        eVar.o(this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i10)));
        Notification b10 = eVar.b();
        l.d(b10, "notifBuilder.build()");
        return b10;
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

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        int color;
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            color = safeGetColorFromHex.intValue();
        } else {
            Resources contextResources = getContextResources();
            l.b(contextResources);
            int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
            if (identifier != 0) {
                e eVar = e.INSTANCE;
                Context currentContext = getCurrentContext();
                l.b(currentContext);
                color = eVar.getColor(currentContext, identifier);
            } else {
                return;
            }
        }
        remoteViews.setTextColor(i10, color);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showNotification(g9.d r26, va.d r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r27
            boolean r3 = r0 instanceof com.onesignal.notifications.internal.display.impl.d.a
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.onesignal.notifications.internal.display.impl.d$a r3 = (com.onesignal.notifications.internal.display.impl.d.a) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.onesignal.notifications.internal.display.impl.d$a r3 = new com.onesignal.notifications.internal.display.impl.d$a
            r3.<init>(r1, r0)
        L_0x001e:
            r9 = r3
            java.lang.Object r0 = r9.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r9.label
            java.lang.String r5 = "os_group_undefined"
            r6 = 24
            r7 = 3
            r8 = 2
            r10 = 1
            if (r4 == 0) goto L_0x007e
            if (r4 == r10) goto L_0x0057
            if (r4 == r8) goto L_0x003f
            if (r4 != r7) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            int r2 = r9.I$0
            java.lang.Object r3 = r9.L$3
            android.app.Notification r3 = (android.app.Notification) r3
            java.lang.Object r4 = r9.L$2
            com.onesignal.notifications.internal.display.impl.b$a r4 = (com.onesignal.notifications.internal.display.impl.b.a) r4
            java.lang.Object r5 = r9.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$0
            com.onesignal.notifications.internal.display.impl.d r6 = (com.onesignal.notifications.internal.display.impl.d) r6
            sa.o.b(r0)
            r12 = 1
            goto L_0x017c
        L_0x0057:
            int r2 = r9.I$0
            java.lang.Object r4 = r9.L$7
            androidx.core.app.k$e r4 = (androidx.core.app.k.e) r4
            java.lang.Object r11 = r9.L$6
            com.onesignal.notifications.internal.display.impl.b$a r11 = (com.onesignal.notifications.internal.display.impl.b.a) r11
            java.lang.Object r12 = r9.L$5
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r9.L$4
            com.onesignal.notifications.internal.display.impl.a r13 = (com.onesignal.notifications.internal.display.impl.a) r13
            java.lang.Object r14 = r9.L$3
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r9.L$2
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.Object r8 = r9.L$1
            g9.d r8 = (g9.d) r8
            java.lang.Object r10 = r9.L$0
            com.onesignal.notifications.internal.display.impl.d r10 = (com.onesignal.notifications.internal.display.impl.d) r10
            sa.o.b(r0)
            goto L_0x0124
        L_0x007e:
            sa.o.b(r0)
            int r4 = r26.getAndroidId()
            org.json.JSONObject r15 = r26.getJsonPayload()
            db.l.b(r15)
            java.lang.String r0 = "grp"
            java.lang.String r0 = com.onesignal.common.i.safeString(r15, r0)
            com.onesignal.notifications.internal.display.impl.a r8 = new com.onesignal.notifications.internal.display.impl.a
            android.content.Context r10 = r25.getCurrentContext()
            r8.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r6) goto L_0x00c2
            g9.h r10 = g9.h.INSTANCE
            android.content.Context r11 = r25.getCurrentContext()
            java.util.ArrayList r11 = r10.getActiveGrouplessNotifications(r11)
            if (r0 != 0) goto L_0x00bf
            int r12 = r11.size()
            if (r12 < r7) goto L_0x00bf
            android.content.Context r0 = r25.getCurrentContext()
            r10.assignGrouplessNotifications(r0, r11)
            r10 = r5
            goto L_0x00c0
        L_0x00bf:
            r10 = r0
        L_0x00c0:
            r12 = r11
            goto L_0x00c4
        L_0x00c2:
            r12 = r10
            r10 = r0
        L_0x00c4:
            i9.a r0 = r1._notificationDisplayBuilder
            com.onesignal.notifications.internal.display.impl.b$a r11 = r0.getBaseOneSignalNotificationBuilder(r2)
            androidx.core.app.k$e r13 = r11.getCompatBuilder()
            i9.a r0 = r1._notificationDisplayBuilder
            r22 = 0
            r17 = r0
            r18 = r15
            r19 = r8
            r20 = r13
            r21 = r4
            r17.addNotificationActionButtons(r18, r19, r20, r21, r22)
            r1.addBackgroundImage(r15, r13)     // Catch:{ all -> 0x00e3 }
            goto L_0x00ea
        L_0x00e3:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = "Could not set background notification image!"
            com.onesignal.debug.internal.logging.a.error(r0, r14)
        L_0x00ea:
            r1.applyNotificationExtender(r2, r13)
            boolean r0 = r26.isRestoring()
            if (r0 == 0) goto L_0x00f8
            i9.a r0 = r1._notificationDisplayBuilder
            r0.removeNotifyOptions(r13)
        L_0x00f8:
            if (r10 != 0) goto L_0x00fc
            r0 = 1
            goto L_0x00fd
        L_0x00fc:
            r0 = 2
        L_0x00fd:
            l9.a r14 = r1._notificationLimitManager
            r9.L$0 = r1
            r9.L$1 = r2
            r9.L$2 = r15
            r9.L$3 = r10
            r9.L$4 = r8
            r9.L$5 = r12
            r9.L$6 = r11
            r9.L$7 = r13
            r9.I$0 = r4
            r7 = 1
            r9.label = r7
            java.lang.Object r0 = r14.clearOldestOverLimit(r0, r9)
            if (r0 != r3) goto L_0x011b
            return r3
        L_0x011b:
            r14 = r10
            r10 = r1
            r24 = r8
            r8 = r2
            r2 = r4
            r4 = r13
            r13 = r24
        L_0x0124:
            if (r14 == 0) goto L_0x01a5
            i9.c r0 = r10._summaryNotificationDisplayer
            r18 = r0
            r19 = r4
            r20 = r13
            r21 = r15
            r22 = r14
            r23 = r2
            r18.createGenericPendingIntentsForGroup(r19, r20, r21, r22, r23)
            i9.c r0 = r10._summaryNotificationDisplayer
            android.app.Notification r0 = r0.createSingleNotificationBeforeSummaryBuilder(r8, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            if (r4 < r6) goto L_0x0180
            boolean r4 = db.l.a(r14, r5)
            if (r4 == 0) goto L_0x0180
            i9.c r4 = r10._summaryNotificationDisplayer
            int r5 = r12.size()
            r12 = 1
            int r15 = r5 + 1
            i9.a r5 = r10._notificationDisplayBuilder
            int r16 = r5.getGroupAlertBehavior()
            r9.L$0 = r10
            r9.L$1 = r14
            r9.L$2 = r11
            r9.L$3 = r0
            r9.L$4 = r7
            r9.L$5 = r7
            r9.L$6 = r7
            r9.L$7 = r7
            r9.I$0 = r2
            r5 = 2
            r9.label = r5
            r5 = r8
            r6 = r13
            r7 = r15
            r8 = r16
            java.lang.Object r4 = r4.createGrouplessSummaryNotification(r5, r6, r7, r8, r9)
            if (r4 != r3) goto L_0x0178
            return r3
        L_0x0178:
            r3 = r0
            r6 = r10
            r4 = r11
            r5 = r14
        L_0x017c:
            r11 = r4
            r14 = r5
            r10 = r6
            goto L_0x01aa
        L_0x0180:
            r12 = 1
            i9.c r4 = r10._summaryNotificationDisplayer
            i9.a r5 = r10._notificationDisplayBuilder
            int r5 = r5.getGroupAlertBehavior()
            r9.L$0 = r10
            r9.L$1 = r14
            r9.L$2 = r11
            r9.L$3 = r0
            r9.L$4 = r7
            r9.L$5 = r7
            r9.L$6 = r7
            r9.L$7 = r7
            r9.I$0 = r2
            r6 = 3
            r9.label = r6
            java.lang.Object r4 = r4.createSummaryNotification(r8, r11, r5, r9)
            if (r4 != r3) goto L_0x0178
            return r3
        L_0x01a5:
            r12 = 1
            android.app.Notification r3 = r10.createGenericPendingIntentsForNotif(r4, r13, r15, r2)
        L_0x01aa:
            i9.a r0 = r10._notificationDisplayBuilder
            r0.addXiaomiSettings(r11, r3)
            android.content.Context r0 = r10.getCurrentContext()
            db.l.b(r0)
            androidx.core.app.k0 r0 = androidx.core.app.k0.d(r0)
            r0.f(r2, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L_0x01d5
            g9.h r0 = g9.h.INSTANCE
            android.content.Context r2 = r10.getCurrentContext()
            db.l.b(r2)
            java.lang.String r3 = r3.getChannelId()
            boolean r10 = r0.areNotificationsEnabled(r2, r3)
            goto L_0x01d6
        L_0x01d5:
            r10 = 1
        L_0x01d6:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.d.showNotification(g9.d, va.d):java.lang.Object");
    }

    public final Object displayIAMPreviewNotification(g9.d dVar, va.d dVar2) {
        return showNotification(dVar, dVar2);
    }

    public Object displayNotification(g9.d dVar, va.d dVar2) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, dVar2);
    }

    public final t isRunningOnMainThreadCheck() {
        if (!AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            return t.f15300a;
        }
        throw new h7.b("Process for showing a notification should never been done on Main Thread!");
    }
}
