package com.onesignal.notifications.internal.restoration.impl;

import android.os.Build;
import android.service.notification.StatusBarNotification;
import db.g;
import db.l;
import g9.h;
import h9.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import l7.f;
import mb.r0;
import org.json.JSONObject;
import sa.t;

public final class a implements q9.a {
    public static final C0183a Companion = new C0183a((g) null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final z8.a _badgeCountUpdater;
    private final h9.b _dataController;
    private final j9.b _workManager;

    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a  reason: collision with other inner class name */
    public static final class C0183a {
        private C0183a() {
        }

        public /* synthetic */ C0183a(g gVar) {
            this();
        }
    }

    static final class b extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.process(this);
        }
    }

    public a(f fVar, j9.b bVar, h9.b bVar2, z8.a aVar) {
        l.e(fVar, "_applicationService");
        l.e(bVar, "_workManager");
        l.e(bVar2, "_dataController");
        l.e(aVar, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._workManager = bVar;
        this._dataController = bVar2;
        this._badgeCountUpdater = aVar;
    }

    private final List<Integer> getVisibleNotifications() {
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        StatusBarNotification[] activeNotifications = h.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification id : activeNotifications) {
            arrayList.add(Integer.valueOf(id.getId()));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object process(va.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onesignal.notifications.internal.restoration.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.notifications.internal.restoration.impl.a$b r0 = (com.onesignal.notifications.internal.restoration.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.restoration.impl.a$b r0 = new com.onesignal.notifications.internal.restoration.impl.a$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0044
            if (r2 == r3) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r0.L$0
            com.onesignal.notifications.internal.restoration.impl.a r3 = (com.onesignal.notifications.internal.restoration.impl.a) r3
            sa.o.b(r7)     // Catch:{ all -> 0x0088 }
            goto L_0x0067
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.restoration.impl.a r2 = (com.onesignal.notifications.internal.restoration.impl.a) r2
            sa.o.b(r7)     // Catch:{ all -> 0x0088 }
            goto L_0x005f
        L_0x0044:
            sa.o.b(r7)
            java.lang.String r7 = "Restoring notifications"
            r2 = 0
            com.onesignal.debug.internal.logging.a.info$default(r7, r2, r4, r2)
            java.util.List r7 = r6.getVisibleNotifications()     // Catch:{ all -> 0x0088 }
            h9.b r2 = r6._dataController     // Catch:{ all -> 0x0088 }
            r0.L$0 = r6     // Catch:{ all -> 0x0088 }
            r0.label = r3     // Catch:{ all -> 0x0088 }
            java.lang.Object r7 = r2.listNotificationsForOutstanding(r7, r0)     // Catch:{ all -> 0x0088 }
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r6
        L_0x005f:
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0088 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0088 }
            r3 = r2
            r2 = r7
        L_0x0067:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x0082
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0088 }
            h9.b$b r7 = (h9.b.C0231b) r7     // Catch:{ all -> 0x0088 }
            r0.L$0 = r3     // Catch:{ all -> 0x0088 }
            r0.L$1 = r2     // Catch:{ all -> 0x0088 }
            r0.label = r4     // Catch:{ all -> 0x0088 }
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Object r7 = r3.processNotification(r7, r5, r0)     // Catch:{ all -> 0x0088 }
            if (r7 != r1) goto L_0x0067
            return r1
        L_0x0082:
            z8.a r7 = r3._badgeCountUpdater     // Catch:{ all -> 0x0088 }
            r7.update()     // Catch:{ all -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r7 = move-exception
            java.lang.String r0 = "Error restoring notification records! "
            com.onesignal.debug.internal.logging.a.error(r0, r7)
        L_0x008e:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.restoration.impl.a.process(va.d):java.lang.Object");
    }

    public Object processNotification(b.C0231b bVar, int i10, va.d dVar) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), bVar.getId(), bVar.getAndroidId(), new JSONObject(bVar.getFullData()), bVar.getCreatedAt(), true, false);
        if (i10 <= 0) {
            return t.f15300a;
        }
        Object a10 = r0.a((long) i10, dVar);
        return a10 == d.c() ? a10 : t.f15300a;
    }
}
