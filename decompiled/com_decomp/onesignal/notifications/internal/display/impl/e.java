package com.onesignal.notifications.internal.display.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.k;
import com.onesignal.notifications.internal.display.impl.b;
import db.l;
import i9.c;
import java.security.SecureRandom;
import kotlin.coroutines.jvm.internal.d;
import l7.f;
import org.json.JSONObject;
import sa.t;

public final class e implements c {
    private final f _applicationService;
    private final h9.b _dataController;
    private final i9.a _notificationDisplayBuilder;

    static final class a extends d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, va.d dVar) {
            super(dVar);
            this.this$0 = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createGrouplessSummaryNotification((g9.d) null, (a) null, 0, 0, this);
        }
    }

    static final class b extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, va.d dVar) {
            super(dVar);
            this.this$0 = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createSummaryNotification((g9.d) null, (b.a) null, 0, this);
        }
    }

    public e(f fVar, h9.b bVar, i9.a aVar) {
        l.e(fVar, "_applicationService");
        l.e(bVar, "_dataController");
        l.e(aVar, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._dataController = bVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final Intent createBaseSummaryIntent(int i10, a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        l.d(putExtra, "intentGenerator.getNewBa…utExtra(\"summary\", group)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    public void createGenericPendingIntentsForGroup(k.e eVar, a aVar, JSONObject jSONObject, String str, int i10) {
        l.e(aVar, "intentGenerator");
        l.e(jSONObject, "gcmBundle");
        l.e(str, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str);
        l.d(putExtra, "intentGenerator.getNewBa…)).putExtra(\"grp\", group)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        l.b(eVar);
        eVar.k(newActionPendingIntent);
        i9.a aVar2 = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i10).putExtra("grp", str);
        l.d(putExtra2, "_notificationDisplayBuil…d).putExtra(\"grp\", group)");
        eVar.o(aVar2.getNewDismissActionPendingIntent(nextInt2, putExtra2));
        eVar.q(str);
        try {
            eVar.r(this._notificationDisplayBuilder.getGroupAlertBehavior());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createGrouplessSummaryNotification(g9.d r10, com.onesignal.notifications.internal.display.impl.a r11, int r12, int r13, va.d r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.onesignal.notifications.internal.display.impl.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.notifications.internal.display.impl.e$a r0 = (com.onesignal.notifications.internal.display.impl.e.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.display.impl.e$a r0 = new com.onesignal.notifications.internal.display.impl.e$a
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 != r3) goto L_0x004d
            int r10 = r0.I$2
            int r13 = r0.I$1
            int r12 = r0.I$0
            java.lang.Object r11 = r0.L$6
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r0.L$5
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$4
            java.security.SecureRandom r2 = (java.security.SecureRandom) r2
            java.lang.Object r4 = r0.L$3
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.Object r5 = r0.L$2
            com.onesignal.notifications.internal.display.impl.a r5 = (com.onesignal.notifications.internal.display.impl.a) r5
            java.lang.Object r6 = r0.L$1
            g9.d r6 = (g9.d) r6
            java.lang.Object r0 = r0.L$0
            com.onesignal.notifications.internal.display.impl.e r0 = (com.onesignal.notifications.internal.display.impl.e) r0
            sa.o.b(r14)
            r14 = r11
            r11 = r5
            goto L_0x009f
        L_0x004d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0055:
            sa.o.b(r14)
            org.json.JSONObject r4 = r10.getJsonPayload()
            db.l.b(r4)
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r5 = " new messages"
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            h9.b r5 = r9._dataController
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r4
            r0.L$4 = r2
            java.lang.String r6 = "os_group_undefined"
            r0.L$5 = r6
            r0.L$6 = r14
            r0.I$0 = r12
            r0.I$1 = r13
            r7 = -718463522(0xffffffffd52d1dde, float:-1.18964869E13)
            r0.I$2 = r7
            r0.label = r3
            java.lang.Object r0 = r5.createSummaryNotification(r7, r6, r0)
            if (r0 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r0 = r9
            r1 = r6
            r6 = r10
            r10 = -718463522(0xffffffffd52d1dde, float:-1.18964869E13)
        L_0x009f:
            int r5 = r2.nextInt()
            android.content.Intent r4 = r0.createBaseSummaryIntent(r10, r11, r4, r1)
            android.app.PendingIntent r11 = r11.getNewActionPendingIntent(r5, r4)
            i9.a r4 = r0._notificationDisplayBuilder
            int r2 = r2.nextInt()
            i9.a r5 = r0._notificationDisplayBuilder
            r7 = 0
            android.content.Intent r5 = r5.getNewBaseDismissIntent(r7)
            java.lang.String r8 = "summary"
            android.content.Intent r5 = r5.putExtra(r8, r1)
            java.lang.String r8 = "_notificationDisplayBuil…utExtra(\"summary\", group)"
            db.l.d(r5, r8)
            android.app.PendingIntent r2 = r4.getNewDismissActionPendingIntent(r2, r5)
            i9.a r4 = r0._notificationDisplayBuilder
            com.onesignal.notifications.internal.display.impl.b$a r4 = r4.getBaseOneSignalNotificationBuilder(r6)
            androidx.core.app.k$e r4 = r4.getCompatBuilder()
            android.net.Uri r5 = r6.getOverriddenSound()
            if (r5 == 0) goto L_0x00e1
            db.l.b(r4)
            android.net.Uri r5 = r6.getOverriddenSound()
            r4.B(r5)
        L_0x00e1:
            java.lang.Integer r5 = r6.getOverriddenFlags()
            if (r5 == 0) goto L_0x00f8
            db.l.b(r4)
            java.lang.Integer r5 = r6.getOverriddenFlags()
            db.l.b(r5)
            int r5 = r5.intValue()
            r4.n(r5)
        L_0x00f8:
            db.l.b(r4)
            androidx.core.app.k$e r11 = r4.k(r11)
            androidx.core.app.k$e r11 = r11.o(r2)
            android.content.Context r2 = r0.getCurrentContext()
            db.l.b(r2)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.Context r5 = r0.getCurrentContext()
            db.l.b(r5)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.CharSequence r2 = r2.getApplicationLabel(r5)
            androidx.core.app.k$e r11 = r11.m(r2)
            androidx.core.app.k$e r11 = r11.l(r14)
            androidx.core.app.k$e r11 = r11.w(r12)
            i9.a r12 = r0._notificationDisplayBuilder
            int r12 = r12.getDefaultSmallIconId()
            androidx.core.app.k$e r11 = r11.A(r12)
            i9.a r12 = r0._notificationDisplayBuilder
            android.graphics.Bitmap r12 = r12.getDefaultLargeIcon()
            androidx.core.app.k$e r11 = r11.t(r12)
            androidx.core.app.k$e r11 = r11.x(r3)
            androidx.core.app.k$e r11 = r11.g(r7)
            androidx.core.app.k$e r11 = r11.q(r1)
            r11.s(r3)
            r4.r(r13)     // Catch:{ all -> 0x014f }
        L_0x014f:
            androidx.core.app.k$g r11 = new androidx.core.app.k$g
            r11.<init>()
            r11.i(r14)
            r4.C(r11)
            android.app.Notification r11 = r4.b()
            java.lang.String r12 = "summaryBuilder.build()"
            db.l.d(r11, r12)
            android.content.Context r12 = r0.getCurrentContext()
            db.l.b(r12)
            androidx.core.app.k0 r12 = androidx.core.app.k0.d(r12)
            r12.f(r10, r11)
            sa.t r10 = sa.t.f15300a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.e.createGrouplessSummaryNotification(g9.d, com.onesignal.notifications.internal.display.impl.a, int, int, va.d):java.lang.Object");
    }

    public Notification createSingleNotificationBeforeSummaryBuilder(g9.d dVar, k.e eVar) {
        l.e(dVar, "notificationJob");
        boolean z10 = Build.VERSION.SDK_INT < 24 && !dVar.isRestoring();
        if (z10 && dVar.getOverriddenSound() != null) {
            Uri overriddenSound = dVar.getOverriddenSound();
            l.b(overriddenSound);
            if (!overriddenSound.equals(dVar.getOrgSound())) {
                l.b(eVar);
                eVar.B((Uri) null);
            }
        }
        l.b(eVar);
        Notification b10 = eVar.b();
        l.d(b10, "notifBuilder!!.build()");
        if (z10) {
            eVar.B(dVar.getOverriddenSound());
        }
        return b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x029e, code lost:
        if (r7 == null) goto L_0x02a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0247 A[EDGE_INSN: B:108:0x0247->B:51:0x0247 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03bd A[LOOP:1: B:97:0x03b7->B:99:0x03bd, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createSummaryNotification(g9.d r28, com.onesignal.notifications.internal.display.impl.b.a r29, int r30, va.d r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r31
            boolean r2 = r1 instanceof com.onesignal.notifications.internal.display.impl.e.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.onesignal.notifications.internal.display.impl.e$b r2 = (com.onesignal.notifications.internal.display.impl.e.b) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.notifications.internal.display.impl.e$b r2 = new com.onesignal.notifications.internal.display.impl.e$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            java.lang.String r8 = "group"
            r10 = 1
            if (r4 == 0) goto L_0x00cd
            if (r4 == r10) goto L_0x0093
            if (r4 == r6) goto L_0x0066
            if (r4 != r5) goto L_0x005e
            boolean r3 = r2.Z$0
            int r4 = r2.I$0
            java.lang.Object r5 = r2.L$8
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r2.L$7
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            java.lang.Object r11 = r2.L$6
            java.security.SecureRandom r11 = (java.security.SecureRandom) r11
            java.lang.Object r12 = r2.L$5
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$4
            com.onesignal.notifications.internal.display.impl.a r13 = (com.onesignal.notifications.internal.display.impl.a) r13
            java.lang.Object r14 = r2.L$3
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            java.lang.Object r15 = r2.L$2
            com.onesignal.notifications.internal.display.impl.b$a r15 = (com.onesignal.notifications.internal.display.impl.b.a) r15
            java.lang.Object r10 = r2.L$1
            g9.d r10 = (g9.d) r10
            java.lang.Object r2 = r2.L$0
            com.onesignal.notifications.internal.display.impl.e r2 = (com.onesignal.notifications.internal.display.impl.e) r2
            sa.o.b(r1)
            goto L_0x01be
        L_0x005e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0066:
            boolean r4 = r2.Z$0
            int r6 = r2.I$0
            java.lang.Object r10 = r2.L$8
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r2.L$7
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            java.lang.Object r12 = r2.L$6
            java.security.SecureRandom r12 = (java.security.SecureRandom) r12
            java.lang.Object r13 = r2.L$5
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.L$4
            com.onesignal.notifications.internal.display.impl.a r14 = (com.onesignal.notifications.internal.display.impl.a) r14
            java.lang.Object r15 = r2.L$3
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.Object r5 = r2.L$2
            com.onesignal.notifications.internal.display.impl.b$a r5 = (com.onesignal.notifications.internal.display.impl.b.a) r5
            java.lang.Object r9 = r2.L$1
            g9.d r9 = (g9.d) r9
            java.lang.Object r7 = r2.L$0
            com.onesignal.notifications.internal.display.impl.e r7 = (com.onesignal.notifications.internal.display.impl.e) r7
            sa.o.b(r1)
            goto L_0x0180
        L_0x0093:
            boolean r4 = r2.Z$0
            int r5 = r2.I$0
            java.lang.Object r7 = r2.L$7
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            java.lang.Object r9 = r2.L$6
            java.security.SecureRandom r9 = (java.security.SecureRandom) r9
            java.lang.Object r10 = r2.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$4
            com.onesignal.notifications.internal.display.impl.a r11 = (com.onesignal.notifications.internal.display.impl.a) r11
            java.lang.Object r12 = r2.L$3
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.Object r13 = r2.L$2
            com.onesignal.notifications.internal.display.impl.b$a r13 = (com.onesignal.notifications.internal.display.impl.b.a) r13
            java.lang.Object r14 = r2.L$1
            g9.d r14 = (g9.d) r14
            java.lang.Object r15 = r2.L$0
            com.onesignal.notifications.internal.display.impl.e r15 = (com.onesignal.notifications.internal.display.impl.e) r15
            sa.o.b(r1)
            r24 = r15
            r15 = r5
            r5 = r11
            r11 = r7
            r7 = r24
            r25 = r12
            r12 = r9
            r9 = r25
            r26 = r14
            r14 = r13
            r13 = r26
            goto L_0x013e
        L_0x00cd:
            sa.o.b(r1)
            boolean r1 = r28.isRestoring()
            org.json.JSONObject r4 = r28.getJsonPayload()
            db.l.b(r4)
            com.onesignal.notifications.internal.display.impl.a r5 = new com.onesignal.notifications.internal.display.impl.a
            android.content.Context r7 = r27.getCurrentContext()
            db.l.b(r7)
            r5.<init>(r7)
            java.lang.String r7 = "grp"
            r9 = 0
            java.lang.String r7 = r4.optString(r7, r9)
            java.security.SecureRandom r10 = new java.security.SecureRandom
            r10.<init>()
            i9.a r11 = r0._notificationDisplayBuilder
            int r12 = r10.nextInt()
            i9.a r13 = r0._notificationDisplayBuilder
            r14 = 0
            android.content.Intent r13 = r13.getNewBaseDismissIntent(r14)
            java.lang.String r14 = "summary"
            android.content.Intent r13 = r13.putExtra(r14, r7)
            java.lang.String r14 = "_notificationDisplayBuil…utExtra(\"summary\", group)"
            db.l.d(r13, r14)
            android.app.PendingIntent r11 = r11.getNewDismissActionPendingIntent(r12, r13)
            h9.b r12 = r0._dataController
            db.l.d(r7, r8)
            r2.L$0 = r0
            r13 = r28
            r2.L$1 = r13
            r14 = r29
            r2.L$2 = r14
            r2.L$3 = r4
            r2.L$4 = r5
            r2.L$5 = r7
            r2.L$6 = r10
            r2.L$7 = r11
            r15 = r30
            r2.I$0 = r15
            r2.Z$0 = r1
            r9 = 1
            r2.label = r9
            java.lang.Object r12 = r12.getAndroidIdForGroup(r7, r9, r2)
            if (r12 != r3) goto L_0x0138
            return r3
        L_0x0138:
            r9 = r4
            r4 = r1
            r1 = r12
            r12 = r10
            r10 = r7
            r7 = r0
        L_0x013e:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x018d
            int r1 = r12.nextInt()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.c(r1)
            h9.b r6 = r7._dataController
            int r0 = r1.intValue()
            db.l.d(r10, r8)
            r2.L$0 = r7
            r2.L$1 = r13
            r2.L$2 = r14
            r2.L$3 = r9
            r2.L$4 = r5
            r2.L$5 = r10
            r2.L$6 = r12
            r2.L$7 = r11
            r2.L$8 = r1
            r2.I$0 = r15
            r2.Z$0 = r4
            r28 = r1
            r1 = 2
            r2.label = r1
            java.lang.Object r0 = r6.createSummaryNotification(r0, r10, r2)
            if (r0 != r3) goto L_0x0175
            return r3
        L_0x0175:
            r6 = r15
            r15 = r9
            r9 = r13
            r13 = r10
            r10 = r28
            r24 = r14
            r14 = r5
            r5 = r24
        L_0x0180:
            r0 = r5
            r5 = r10
            r10 = r9
            r24 = r15
            r15 = r6
            r6 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r24
            goto L_0x0195
        L_0x018d:
            r6 = r11
            r11 = r12
            r0 = r14
            r14 = r9
            r12 = r10
            r10 = r13
            r13 = r5
            r5 = r1
        L_0x0195:
            h9.b r1 = r7._dataController
            db.l.d(r12, r8)
            r2.L$0 = r7
            r2.L$1 = r10
            r2.L$2 = r0
            r2.L$3 = r14
            r2.L$4 = r13
            r2.L$5 = r12
            r2.L$6 = r11
            r2.L$7 = r6
            r2.L$8 = r5
            r2.I$0 = r15
            r2.Z$0 = r4
            r9 = 3
            r2.label = r9
            java.lang.Object r1 = r1.listNotificationsForGroup(r12, r2)
            if (r1 != r3) goto L_0x01ba
            return r3
        L_0x01ba:
            r3 = r4
            r2 = r7
            r4 = r15
            r15 = r0
        L_0x01be:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L_0x01ca:
            boolean r9 = r1.hasNext()
            r28 = r15
            java.lang.String r15 = ""
            if (r9 == 0) goto L_0x0247
            java.lang.Object r9 = r1.next()
            h9.b$b r9 = (h9.b.C0231b) r9
            r30 = r1
            if (r3 != 0) goto L_0x01ed
            int r1 = r9.getAndroidId()
            r16 = r4
            int r4 = r10.getAndroidId()
            if (r1 != r4) goto L_0x01ef
            r23 = r6
            goto L_0x023e
        L_0x01ed:
            r16 = r4
        L_0x01ef:
            java.lang.String r1 = r9.getTitle()
            if (r1 != 0) goto L_0x01f6
            goto L_0x0207
        L_0x01f6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r1 = 32
            r4.append(r1)
            java.lang.String r15 = r4.toString()
        L_0x0207:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r23 = r6
            java.lang.String r6 = r9.getMessage()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            int r4 = r15.length()
            if (r4 <= 0) goto L_0x0235
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r6 = 1
            r4.<init>(r6)
            int r6 = r15.length()
            r15 = 0
            r1.setSpan(r4, r15, r6, r15)
        L_0x0235:
            r0.add(r1)
            if (r7 != 0) goto L_0x023e
            java.lang.String r7 = r9.getFullData()
        L_0x023e:
            r15 = r28
            r1 = r30
            r4 = r16
            r6 = r23
            goto L_0x01ca
        L_0x0247:
            r16 = r4
            r23 = r6
            int r1 = r11.nextInt()
            db.l.b(r5)
            int r4 = r5.intValue()
            db.l.d(r12, r8)
            android.content.Intent r4 = r2.createBaseSummaryIntent(r4, r13, r14, r12)
            android.app.PendingIntent r1 = r13.getNewActionPendingIntent(r1, r4)
            java.lang.String r4 = "summaryBuilder.build()"
            if (r3 == 0) goto L_0x026c
            int r6 = r0.size()
            r7 = 1
            if (r6 > r7) goto L_0x0274
        L_0x026c:
            if (r3 != 0) goto L_0x03d5
            int r6 = r0.size()
            if (r6 <= 0) goto L_0x03d5
        L_0x0274:
            int r6 = r0.size()
            r7 = r3 ^ 1
            int r6 = r6 + r7
            java.lang.String r7 = "grp_msg"
            java.lang.String r17 = com.onesignal.common.i.safeString(r14, r7)
            if (r17 == 0) goto L_0x02a0
            java.lang.String r18 = "$[notif_count]"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r7.append(r6)
            java.lang.String r19 = r7.toString()
            r20 = 0
            r21 = 4
            r22 = 0
            java.lang.String r7 = lb.p.r(r17, r18, r19, r20, r21, r22)
            if (r7 != 0) goto L_0x02b1
        L_0x02a0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r8 = " new messages"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
        L_0x02b1:
            i9.a r8 = r2._notificationDisplayBuilder
            com.onesignal.notifications.internal.display.impl.b$a r8 = r8.getBaseOneSignalNotificationBuilder(r10)
            androidx.core.app.k$e r8 = r8.getCompatBuilder()
            if (r3 == 0) goto L_0x02c3
            i9.a r9 = r2._notificationDisplayBuilder
            r9.removeNotifyOptions(r8)
            goto L_0x02ea
        L_0x02c3:
            android.net.Uri r9 = r10.getOverriddenSound()
            if (r9 == 0) goto L_0x02d3
            db.l.b(r8)
            android.net.Uri r9 = r10.getOverriddenSound()
            r8.B(r9)
        L_0x02d3:
            java.lang.Integer r9 = r10.getOverriddenFlags()
            if (r9 == 0) goto L_0x02ea
            db.l.b(r8)
            java.lang.Integer r9 = r10.getOverriddenFlags()
            db.l.b(r9)
            int r9 = r9.intValue()
            r8.n(r9)
        L_0x02ea:
            db.l.b(r8)
            androidx.core.app.k$e r1 = r8.k(r1)
            r9 = r23
            androidx.core.app.k$e r1 = r1.o(r9)
            android.content.Context r9 = r2.getCurrentContext()
            db.l.b(r9)
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            android.content.Context r11 = r2.getCurrentContext()
            db.l.b(r11)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()
            java.lang.CharSequence r9 = r9.getApplicationLabel(r11)
            androidx.core.app.k$e r1 = r1.m(r9)
            androidx.core.app.k$e r1 = r1.l(r7)
            androidx.core.app.k$e r1 = r1.w(r6)
            i9.a r6 = r2._notificationDisplayBuilder
            int r6 = r6.getDefaultSmallIconId()
            androidx.core.app.k$e r1 = r1.A(r6)
            i9.a r6 = r2._notificationDisplayBuilder
            android.graphics.Bitmap r6 = r6.getDefaultLargeIcon()
            androidx.core.app.k$e r1 = r1.t(r6)
            androidx.core.app.k$e r1 = r1.x(r3)
            r6 = 0
            androidx.core.app.k$e r1 = r1.g(r6)
            androidx.core.app.k$e r1 = r1.q(r12)
            r6 = 1
            r1.s(r6)
            r6 = r16
            r8.r(r6)     // Catch:{ all -> 0x0348 }
            goto L_0x0349
        L_0x0348:
        L_0x0349:
            if (r3 != 0) goto L_0x034e
            r8.D(r7)
        L_0x034e:
            androidx.core.app.k$g r1 = new androidx.core.app.k$g
            r1.<init>()
            if (r3 != 0) goto L_0x03b3
            java.lang.CharSequence r3 = r10.getTitle()
            if (r3 == 0) goto L_0x0364
            java.lang.CharSequence r3 = r10.getTitle()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0365
        L_0x0364:
            r3 = 0
        L_0x0365:
            if (r3 != 0) goto L_0x0369
            r3 = r15
            goto L_0x037a
        L_0x0369:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r3 = 32
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L_0x037a:
            java.lang.CharSequence r6 = r10.getBody()
            if (r6 == 0) goto L_0x0388
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L_0x0387
            goto L_0x0388
        L_0x0387:
            r15 = r6
        L_0x0388:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            r6.<init>(r9)
            int r9 = r3.length()
            if (r9 <= 0) goto L_0x03b0
            android.text.style.StyleSpan r9 = new android.text.style.StyleSpan
            r10 = 1
            r9.<init>(r10)
            int r3 = r3.length()
            r10 = 0
            r6.setSpan(r9, r10, r3, r10)
        L_0x03b0:
            r1.h(r6)
        L_0x03b3:
            java.util.Iterator r0 = r0.iterator()
        L_0x03b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03c7
            java.lang.Object r3 = r0.next()
            android.text.SpannableString r3 = (android.text.SpannableString) r3
            r1.h(r3)
            goto L_0x03b7
        L_0x03c7:
            r1.i(r7)
            r8.C(r1)
            android.app.Notification r0 = r8.b()
            db.l.d(r0, r4)
            goto L_0x0425
        L_0x03d5:
            r6 = r16
            r9 = r23
            db.l.b(r28)
            androidx.core.app.k$e r0 = r28.getCompatBuilder()
            db.l.b(r0)
            java.util.ArrayList r7 = r0.f2089b
            r7.clear()
            i9.a r7 = r2._notificationDisplayBuilder
            int r21 = r5.intValue()
            r17 = r7
            r18 = r14
            r19 = r13
            r20 = r0
            r22 = r12
            r17.addNotificationActionButtons(r18, r19, r20, r21, r22)
            androidx.core.app.k$e r1 = r0.k(r1)
            androidx.core.app.k$e r1 = r1.o(r9)
            androidx.core.app.k$e r1 = r1.x(r3)
            r3 = 0
            androidx.core.app.k$e r1 = r1.g(r3)
            androidx.core.app.k$e r1 = r1.q(r12)
            r3 = 1
            r1.s(r3)
            r0.r(r6)     // Catch:{ all -> 0x0417 }
        L_0x0417:
            android.app.Notification r0 = r0.b()
            db.l.d(r0, r4)
            i9.a r1 = r2._notificationDisplayBuilder
            r15 = r28
            r1.addXiaomiSettings(r15, r0)
        L_0x0425:
            android.content.Context r1 = r2.getCurrentContext()
            db.l.b(r1)
            androidx.core.app.k0 r1 = androidx.core.app.k0.d(r1)
            int r2 = r5.intValue()
            r1.f(r2, r0)
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.e.createSummaryNotification(g9.d, com.onesignal.notifications.internal.display.impl.b$a, int, va.d):java.lang.Object");
    }

    public Object updateSummaryNotification(g9.d dVar, va.d dVar2) {
        Object createSummaryNotification = createSummaryNotification(dVar, (b.a) null, this._notificationDisplayBuilder.getGroupAlertBehavior(), dVar2);
        return createSummaryNotification == d.c() ? createSummaryNotification : t.f15300a;
    }
}
