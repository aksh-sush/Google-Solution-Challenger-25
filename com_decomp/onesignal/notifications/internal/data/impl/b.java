package com.onesignal.notifications.internal.data.impl;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import h9.b;
import java.util.List;
import l9.a;
import mb.h0;
import mb.w0;
import o7.b;
import org.json.JSONException;

public final class b implements h9.b {
    /* access modifiers changed from: private */
    public static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};
    public static final a Companion = new a((db.g) null);
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    /* access modifiers changed from: private */
    public final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final z8.a _badgeCountUpdater;
    /* access modifiers changed from: private */
    public final o7.c _databaseProvider;
    /* access modifiers changed from: private */
    public final h9.a _queryHelper;
    /* access modifiers changed from: private */
    public final a8.a _time;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }
    }

    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b  reason: collision with other inner class name */
    static final class C0169b extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        static final class a extends db.m implements cb.l {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(int i10, int i11, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i10;
                this.$notificationsToMakeRoomFor = i11;
                this.this$0 = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                int count = (aVar.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count >= 1) {
                    while (aVar.moveToNext()) {
                        boolean unused = this.this$0.internalMarkAsDismissed(aVar.getInt("android_notification_id"));
                        count--;
                        if (count <= 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0169b(int i10, b bVar, int i11, va.d dVar) {
            super(2, dVar);
            this.$maxNumberOfNotificationsInt = i10;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i11;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new C0169b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
                try {
                    String sb2 = this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString();
                    b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, sb2, (String[]) null, (String) null, (String) null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, (Object) null);
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.a.error("Error clearing oldest notifications over limit! ", th);
                }
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((C0169b) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, boolean z10, int i10, b bVar, String str2, String str3, boolean z11, String str4, String str5, long j10, String str6, va.d dVar) {
            super(2, dVar);
            this.$id = str;
            this.$shouldDismissIdenticals = z10;
            this.$androidId = i10;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z11;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j10;
            this.$jsonPayload = str6;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                com.onesignal.debug.internal.logging.a.debug$default("Saving Notification id=" + this.$id, (Throwable) null, 2, (Object) null);
                try {
                    int i10 = 1;
                    if (this.$shouldDismissIdenticals) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("dismissed", kotlin.coroutines.jvm.internal.b.c(1));
                        this.this$0._databaseProvider.getOs().update("notification", contentValues, "android_notification_id = " + this.$androidId, (String[]) null);
                        this.this$0._badgeCountUpdater.update();
                    }
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG, this.$id);
                    String str = this.$groupId;
                    if (str != null) {
                        contentValues2.put(FirebaseAnalytics.Param.GROUP_ID, str);
                    }
                    String str2 = this.$collapseKey;
                    if (str2 != null) {
                        contentValues2.put("collapse_id", str2);
                    }
                    if (!this.$isOpened) {
                        i10 = 0;
                    }
                    contentValues2.put("opened", kotlin.coroutines.jvm.internal.b.c(i10));
                    if (!this.$isOpened) {
                        contentValues2.put("android_notification_id", kotlin.coroutines.jvm.internal.b.c(this.$androidId));
                    }
                    String str3 = this.$title;
                    if (str3 != null) {
                        contentValues2.put("title", str3);
                    }
                    String str4 = this.$body;
                    if (str4 != null) {
                        contentValues2.put("message", str4);
                    }
                    contentValues2.put("expire_time", kotlin.coroutines.jvm.internal.b.d(this.$expireTime));
                    contentValues2.put("full_data", this.$jsonPayload);
                    this.this$0._databaseProvider.getOs().insertOrThrow("notification", (String) null, contentValues2);
                    com.onesignal.debug.internal.logging.a.debug$default("Notification saved values: " + contentValues2, (Throwable) null, 2, (Object) null);
                    if (!this.$isOpened) {
                        this.this$0._badgeCountUpdater.update();
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i10, String str, b bVar, va.d dVar) {
            super(2, dVar);
            this.$androidId = i10;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                ContentValues contentValues = new ContentValues();
                contentValues.put("android_notification_id", kotlin.coroutines.jvm.internal.b.c(this.$androidId));
                contentValues.put(FirebaseAnalytics.Param.GROUP_ID, this.$groupId);
                contentValues.put("is_summary", kotlin.coroutines.jvm.internal.b.c(1));
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", (String) null, contentValues);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((d) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements cb.p {
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                String valueOf = String.valueOf((this.this$0._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
                db.l.d(valueOf, "valueOf(\n               …FETIME,\n                )");
                this.this$0._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doesNotificationExist((String) null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ String $id;
        final /* synthetic */ db.r $result;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ String $id;
            final /* synthetic */ db.r $result;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, db.r rVar) {
                super(1);
                this.$id = str;
                this.$result = rVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    com.onesignal.debug.internal.logging.a.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, (Throwable) null, 2, (Object) null);
                    this.$result.f9424e = true;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, b bVar, db.r rVar, va.d dVar) {
            super(2, dVar);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = rVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new g(this.$id, this.this$0, this.$result, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                String[] strArr = {com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG};
                String str = this.$id;
                db.l.b(str);
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, (String) null, (String) null, (String) null, (String) null, new a(this.$id, this.$result), 240, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getAndroidIdForGroup((String) null, false, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ db.t $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ db.t $whereStr;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ db.t $recentId;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(db.t tVar) {
                super(1);
                this.$recentId = tVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                boolean moveToFirst = aVar.moveToFirst();
                this.$recentId.f9426e = !moveToFirst ? null : Integer.valueOf(aVar.getInt("android_notification_id"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, db.t tVar, String[] strArr, db.t tVar2, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$whereStr = tVar;
            this.$whereArgs = strArr;
            this.$recentId = tVar2;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new i(this.this$0, this.$whereStr, this.$whereArgs, this.$recentId, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f9426e, this.$whereArgs, (String) null, (String) null, "created_time DESC", "1", new a(this.$recentId), 48, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((i) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getAndroidIdFromCollapseKey((String) null, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ db.t $androidId;
        final /* synthetic */ String $collapseKey;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ db.t $androidId;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(db.t tVar) {
                super(1);
                this.$androidId = tVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$androidId.f9426e = Integer.valueOf(aVar.getInt("android_notification_id"));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar, String str, db.t tVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$collapseKey = str;
            this.$androidId = tVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new k(this.this$0, this.$collapseKey, this.$androidId, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, (String) null, (String) null, (String) null, (String) null, new a(this.$androidId), 240, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((k) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getGroupId(0, this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ db.t $groupId;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ db.t $groupId;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(db.t tVar) {
                super(1);
                this.$groupId = tVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$groupId.f9426e = aVar.getOptString(FirebaseAnalytics.Param.GROUP_ID);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar, int i10, db.t tVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$androidId = i10;
            this.$groupId = tVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new m(this.this$0, this.$androidId, this.$groupId, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                o7.b os = this.this$0._databaseProvider.getOs();
                String[] strArr = {FirebaseAnalytics.Param.GROUP_ID};
                b.a.query$default(os, "notification", strArr, "android_notification_id = " + this.$androidId, (String[]) null, (String) null, (String) null, (String) null, (String) null, new a(this.$groupId), 248, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((m) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.listNotificationsForGroup((String) null, this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ List<b.C0231b> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ List<b.C0231b> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<b.C0231b> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        try {
                            String optString = aVar.getOptString("title");
                            String optString2 = aVar.getOptString("message");
                            String string = aVar.getString(com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG);
                            this.$listOfNotifications.add(new b.C0231b(aVar.getInt("android_notification_id"), string, aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.a.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, (Throwable) null, 2, (Object) null);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(String str, b bVar, List<b.C0231b> list, va.d dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, (String) null, (String) null, "_id DESC", (String) null, new a(this.$listOfNotifications, this.$summaryGroup), 176, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((o) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.listNotificationsForOutstanding((List<Integer>) null, this);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<b.C0231b> $listOfNotifications;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ List<b.C0231b> $listOfNotifications;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<b.C0231b> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                while (aVar.moveToNext()) {
                    String optString = aVar.getOptString("title");
                    String optString2 = aVar.getOptString("message");
                    String string = aVar.getString(com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new b.C0231b(aVar.getInt("android_notification_id"), string, aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar, List<Integer> list, List<b.C0231b> list2, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new q(this.this$0, this.$excludeAndroidIds, this.$listOfNotifications, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                StringBuilder recentUninteractedWithNotificationsWhere = this.this$0._queryHelper.recentUninteractedWithNotificationsWhere();
                if (this.$excludeAndroidIds != null) {
                    recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                    recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                    recentUninteractedWithNotificationsWhere.append(")");
                }
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), (String[]) null, (String) null, (String) null, "_id DESC", String.valueOf(a.C0256a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, (Object) null);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((q) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(String str, boolean z10, boolean z11, b bVar, int i10, va.d dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.$dismissed = z10;
            this.$clearGroupOnSummaryClick = z11;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                boolean r0 = r7.Z$0
                java.lang.Object r1 = r7.L$0
                java.lang.String r1 = (java.lang.String) r1
                sa.o.b(r8)
                goto L_0x0057
            L_0x0015:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001d:
                sa.o.b(r8)
                java.lang.String r8 = r7.$summaryGroup
                r1 = 0
                if (r8 == 0) goto L_0x007c
                java.lang.String r3 = "os_group_undefined"
                boolean r8 = db.l.a(r8, r3)
                if (r8 == 0) goto L_0x0030
                java.lang.String r3 = "group_id IS NULL"
                goto L_0x0038
            L_0x0030:
                java.lang.String r1 = r7.$summaryGroup
                java.lang.String[] r1 = new java.lang.String[]{r1}
                java.lang.String r3 = "group_id = ?"
            L_0x0038:
                r6 = r3
                r3 = r1
                r1 = r6
                boolean r4 = r7.$dismissed
                if (r4 != 0) goto L_0x007a
                boolean r4 = r7.$clearGroupOnSummaryClick
                if (r4 != 0) goto L_0x007a
                com.onesignal.notifications.internal.data.impl.b r3 = r7.this$0
                java.lang.String r4 = r7.$summaryGroup
                r7.L$0 = r1
                r7.Z$0 = r8
                r7.label = r2
                r5 = 0
                java.lang.Object r3 = r3.getAndroidIdForGroup(r4, r5, r7)
                if (r3 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r0 = r8
                r8 = r3
            L_0x0057:
                java.lang.String r8 = java.lang.String.valueOf(r8)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = " AND android_notification_id = ?"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                if (r0 == 0) goto L_0x0073
                java.lang.String[] r8 = new java.lang.String[]{r8}
                goto L_0x0092
            L_0x0073:
                java.lang.String r0 = r7.$summaryGroup
                java.lang.String[] r8 = new java.lang.String[]{r0, r8}
                goto L_0x0092
            L_0x007a:
                r8 = r3
                goto L_0x0092
            L_0x007c:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "android_notification_id = "
                r8.append(r0)
                int r0 = r7.$androidId
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r6 = r1
                r1 = r8
                r8 = r6
            L_0x0092:
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r3 = r7.$dismissed
                if (r3 == 0) goto L_0x009e
                java.lang.String r3 = "dismissed"
                goto L_0x00a0
            L_0x009e:
                java.lang.String r3 = "opened"
            L_0x00a0:
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.c(r2)
                r0.put(r3, r2)
                com.onesignal.notifications.internal.data.impl.b r2 = r7.this$0
                o7.c r2 = r2._databaseProvider
                o7.b r2 = r2.getOs()
                java.lang.String r3 = "notification"
                r2.update(r3, r0, r1, r8)
                com.onesignal.notifications.internal.data.impl.b r8 = r7.this$0
                z8.a r8 = r8._badgeCountUpdater
                r8.update()
                sa.t r8 = sa.t.f15300a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((r) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.markAsDismissed(0, this);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ db.r $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(db.r rVar, b bVar, int i10, va.d dVar) {
            super(2, dVar);
            this.$didDismiss = rVar;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                this.$didDismiss.f9424e = this.this$0.internalMarkAsDismissed(this.$androidId);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((t) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ String $group;
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                while (aVar.moveToNext()) {
                    int i10 = aVar.getInt("android_notification_id");
                    if (i10 != -1) {
                        this.$notificationManager.cancel(i10);
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(b bVar, String str, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$group = str;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new u(this.this$0, this.$group, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                NotificationManager notificationManager = g9.h.INSTANCE.getNotificationManager(this.this$0._applicationService.getAppContext());
                String[] strArr = {this.$group};
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, (String) null, (String) null, (String) null, (String) null, new a(notificationManager), 240, (Object) null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", kotlin.coroutines.jvm.internal.b.c(1));
                this.this$0._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
                this.this$0._badgeCountUpdater.update();
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((u) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.l implements cb.p {
        int label;
        final /* synthetic */ b this$0;

        static final class a extends db.m implements cb.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return sa.t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(aVar.getInt("android_notification_id"));
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(b bVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new v(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sa.o.b(obj);
                NotificationManager notificationManager = g9.h.INSTANCE.getNotificationManager(this.this$0._applicationService.getAppContext());
                b.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", (String[]) null, (String) null, (String) null, (String) null, (String) null, new a(notificationManager), 248, (Object) null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", kotlin.coroutines.jvm.internal.b.c(1));
                this.this$0._databaseProvider.getOs().update("notification", contentValues, "opened = 0", (String[]) null);
                this.this$0._badgeCountUpdater.updateCount(0);
                return sa.t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((v) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    public b(l7.f fVar, h9.a aVar, o7.c cVar, a8.a aVar2, z8.a aVar3) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_queryHelper");
        db.l.e(cVar, "_databaseProvider");
        db.l.e(aVar2, "_time");
        db.l.e(aVar3, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = cVar;
        this._time = aVar2;
        this._badgeCountUpdater = aVar3;
    }

    /* access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i10) {
        Context appContext = this._applicationService.getAppContext();
        String str = "android_notification_id = " + i10 + " AND opened = 0 AND dismissed = 0";
        ContentValues contentValues = new ContentValues();
        boolean z10 = true;
        contentValues.put("dismissed", 1);
        if (this._databaseProvider.getOs().update("notification", contentValues, str, (String[]) null) <= 0) {
            z10 = false;
        }
        this._badgeCountUpdater.update();
        g9.h.INSTANCE.getNotificationManager(appContext).cancel(i10);
        return z10;
    }

    public Object clearOldestOverLimitFallback(int i10, int i11, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new C0169b(i11, this, i10, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    public Object createNotification(String str, String str2, String str3, boolean z10, boolean z11, int i10, String str4, String str5, long j10, String str6, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new c(str, z10, i10, this, str2, str3, z11, str4, str5, j10, str6, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    public Object createSummaryNotification(int i10, String str, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new d(i10, str, this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    public Object deleteExpiredNotifications(va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new e(this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doesNotificationExist(java.lang.String r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$f r0 = (com.onesignal.notifications.internal.data.impl.b.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$f r0 = new com.onesignal.notifications.internal.data.impl.b$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.r r7 = (db.r) r7
            sa.o.b(r8)
            goto L_0x005e
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            if (r7 == 0) goto L_0x0065
            java.lang.String r8 = ""
            boolean r8 = db.l.a(r8, r7)
            if (r8 == 0) goto L_0x0043
            goto L_0x0065
        L_0x0043:
            db.r r8 = new db.r
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$g r4 = new com.onesignal.notifications.internal.data.impl.b$g
            r5 = 0
            r4.<init>(r7, r6, r8, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r7 = r8
        L_0x005e:
            boolean r7 = r7.f9424e
        L_0x0060:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        L_0x0065:
            r7 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.doesNotificationExist(java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAndroidIdForGroup(java.lang.String r11, boolean r12, va.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.onesignal.notifications.internal.data.impl.b.h
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.onesignal.notifications.internal.data.impl.b$h r0 = (com.onesignal.notifications.internal.data.impl.b.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$h r0 = new com.onesignal.notifications.internal.data.impl.b$h
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.L$0
            db.t r11 = (db.t) r11
            sa.o.b(r13)
            goto L_0x00a7
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            sa.o.b(r13)
            db.t r13 = new db.t
            r13.<init>()
            java.lang.String r2 = "os_group_undefined"
            boolean r2 = db.l.a(r11, r2)
            db.t r6 = new db.t
            r6.<init>()
            if (r2 == 0) goto L_0x004e
            java.lang.String r4 = "group_id IS NULL"
            goto L_0x0050
        L_0x004e:
            java.lang.String r4 = "group_id = ?"
        L_0x0050:
            r6.f9426e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Object r5 = r6.f9426e
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = " AND dismissed = 0 AND opened = 0 AND "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6.f9426e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Object r5 = r6.f9426e
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            if (r12 == 0) goto L_0x007a
            java.lang.String r12 = "is_summary = 1"
            goto L_0x007c
        L_0x007a:
            java.lang.String r12 = "is_summary = 0"
        L_0x007c:
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r6.f9426e = r12
            if (r2 == 0) goto L_0x0089
            r11 = 0
            goto L_0x008d
        L_0x0089:
            java.lang.String[] r11 = new java.lang.String[]{r11}
        L_0x008d:
            r7 = r11
            mb.d0 r11 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$i r12 = new com.onesignal.notifications.internal.data.impl.b$i
            r9 = 0
            r4 = r12
            r5 = r10
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r11 = mb.h.g(r11, r12, r0)
            if (r11 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r11 = r13
        L_0x00a7:
            java.lang.Object r11 = r11.f9426e
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.getAndroidIdForGroup(java.lang.String, boolean, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAndroidIdFromCollapseKey(java.lang.String r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$j r0 = (com.onesignal.notifications.internal.data.impl.b.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$j r0 = new com.onesignal.notifications.internal.data.impl.b$j
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.t r7 = (db.t) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            db.t r8 = new db.t
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$k r4 = new com.onesignal.notifications.internal.data.impl.b$k
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            java.lang.Object r7 = r7.f9426e
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.getAndroidIdFromCollapseKey(java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getGroupId(int r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.l
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$l r0 = (com.onesignal.notifications.internal.data.impl.b.l) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$l r0 = new com.onesignal.notifications.internal.data.impl.b$l
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.t r7 = (db.t) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            db.t r8 = new db.t
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$m r4 = new com.onesignal.notifications.internal.data.impl.b$m
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            java.lang.Object r7 = r7.f9426e
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.getGroupId(int, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object listNotificationsForGroup(java.lang.String r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.n
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$n r0 = (com.onesignal.notifications.internal.data.impl.b.n) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$n r0 = new com.onesignal.notifications.internal.data.impl.b$n
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$o r4 = new com.onesignal.notifications.internal.data.impl.b$o
            r5 = 0
            r4.<init>(r7, r6, r8, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.listNotificationsForGroup(java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object listNotificationsForOutstanding(java.util.List<java.lang.Integer> r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.p
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$p r0 = (com.onesignal.notifications.internal.data.impl.b.p) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$p r0 = new com.onesignal.notifications.internal.data.impl.b$p
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$q r4 = new com.onesignal.notifications.internal.data.impl.b$q
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.listNotificationsForOutstanding(java.util.List, va.d):java.lang.Object");
    }

    public Object markAsConsumed(int i10, boolean z10, String str, boolean z11, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new r(str, z10, z11, this, i10, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object markAsDismissed(int r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.data.impl.b.s
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.data.impl.b$s r0 = (com.onesignal.notifications.internal.data.impl.b.s) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.data.impl.b$s r0 = new com.onesignal.notifications.internal.data.impl.b$s
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.r r7 = (db.r) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            db.r r8 = new db.r
            r8.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.notifications.internal.data.impl.b$t r4 = new com.onesignal.notifications.internal.data.impl.b$t
            r5 = 0
            r4.<init>(r8, r6, r7, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = mb.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            boolean r7 = r7.f9424e
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.data.impl.b.markAsDismissed(int, va.d):java.lang.Object");
    }

    public Object markAsDismissedForGroup(String str, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new u(this, str, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }

    public Object markAsDismissedForOutstanding(va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new v(this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : sa.t.f15300a;
    }
}
