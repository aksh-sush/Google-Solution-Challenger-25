package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.e;
import androidx.work.r;
import androidx.work.z;
import com.onesignal.common.AndroidUtils;
import db.g;
import db.l;
import g9.c;
import j9.b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.d;
import org.json.JSONObject;

public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    public static final a Companion = new a((g) null);
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    public static final class NotificationGenerationWorker extends CoroutineWorker {

        static final class a extends d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ NotificationGenerationWorker this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(NotificationGenerationWorker notificationGenerationWorker, va.d dVar) {
                super(dVar);
                this.this$0 = notificationGenerationWorker;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.doWork(this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            l.e(context, "context");
            l.e(workerParameters, "workerParams");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doWork(va.d r18) {
            /*
                r17 = this;
                r0 = r18
                boolean r1 = r0 instanceof com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.NotificationGenerationWorker.a
                if (r1 == 0) goto L_0x0017
                r1 = r0
                com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker$a r1 = (com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.NotificationGenerationWorker.a) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.label = r2
                r2 = r17
                goto L_0x001e
            L_0x0017:
                com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker$a r1 = new com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker$a
                r2 = r17
                r1.<init>(r2, r0)
            L_0x001e:
                r10 = r1
                java.lang.Object r0 = r10.result
                java.lang.Object r1 = wa.d.c()
                int r3 = r10.label
                java.lang.String r11 = "failure()"
                r4 = 1
                if (r3 == 0) goto L_0x0045
                if (r3 != r4) goto L_0x003d
                java.lang.Object r1 = r10.L$0
                java.lang.String r1 = (java.lang.String) r1
                sa.o.b(r0)     // Catch:{ JSONException -> 0x003a }
                goto L_0x00d6
            L_0x0037:
                r0 = move-exception
                goto L_0x0111
            L_0x003a:
                r0 = move-exception
                goto L_0x00ed
            L_0x003d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0045:
                sa.o.b(r0)
                boolean r0 = g7.b.g()
                if (r0 != 0) goto L_0x0056
                androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.a()
                db.l.d(r0, r11)
                return r0
            L_0x0056:
                g7.b r0 = g7.b.f10823a
                j7.b r0 = r0.c()
                java.lang.Class<j9.a> r3 = j9.a.class
                java.lang.Object r0 = r0.getService(r3)
                r3 = r0
                j9.a r3 = (j9.a) r3
                androidx.work.e r0 = r17.getInputData()
                java.lang.String r5 = "inputData"
                db.l.d(r0, r5)
                java.lang.String r5 = "os_notif_id"
                java.lang.String r12 = r0.l(r5)
                if (r12 != 0) goto L_0x007e
                androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.a()
                db.l.d(r0, r11)
                return r0
            L_0x007e:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r5.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r6 = "NotificationWorker running doWork with data: "
                r5.append(r6)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r5.append(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r6 = 2
                r7 = 0
                com.onesignal.debug.internal.logging.a.debug$default(r5, r7, r6, r7)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r5 = "android_notif_id"
                r6 = 0
                int r5 = r0.i(r5, r6)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r8 = "json_payload"
                java.lang.String r8 = r0.l(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r7.<init>(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r8 = "timestamp"
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r15 = 1000(0x3e8, double:4.94E-321)
                long r13 = r13 / r15
                long r8 = r0.k(r8, r13)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r13 = "is_restoring"
                boolean r0 = r0.h(r13, r6)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                android.content.Context r13 = r17.getApplicationContext()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                java.lang.String r14 = "applicationContext"
                db.l.d(r13, r14)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                if (r0 == 0) goto L_0x00c6
                r0 = 1
                goto L_0x00c7
            L_0x00c6:
                r0 = 0
            L_0x00c7:
                r10.L$0 = r12     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r10.label = r4     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                r4 = r13
                r6 = r7
                r7 = r0
                java.lang.Object r0 = r3.processNotificationData(r4, r5, r6, r7, r8, r10)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e8 }
                if (r0 != r1) goto L_0x00d5
                return r1
            L_0x00d5:
                r1 = r12
            L_0x00d6:
                com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$a r0 = com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.Companion
                db.l.b(r1)
                r0.removeNotificationIdProcessed(r1)
                androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.c()
                java.lang.String r1 = "success()"
                db.l.d(r0, r1)
                return r0
            L_0x00e8:
                r0 = move-exception
                r1 = r12
                goto L_0x0111
            L_0x00eb:
                r0 = move-exception
                r1 = r12
            L_0x00ed:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
                r3.<init>()     // Catch:{ all -> 0x0037 }
                java.lang.String r4 = "Error occurred doing work for job with id: "
                r3.append(r4)     // Catch:{ all -> 0x0037 }
                r3.append(r1)     // Catch:{ all -> 0x0037 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0037 }
                com.onesignal.debug.internal.logging.a.error(r3, r0)     // Catch:{ all -> 0x0037 }
                androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.a()     // Catch:{ all -> 0x0037 }
                db.l.d(r0, r11)     // Catch:{ all -> 0x0037 }
                com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$a r3 = com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.Companion
                db.l.b(r1)
                r3.removeNotificationIdProcessed(r1)
                return r0
            L_0x0111:
                com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$a r3 = com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.Companion
                db.l.b(r1)
                r3.removeNotificationIdProcessed(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager.NotificationGenerationWorker.doWork(va.d):java.lang.Object");
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String str) {
            l.e(str, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(str)) {
                com.onesignal.debug.internal.logging.a.debug$default("OSNotificationWorkManager notification with notificationId: " + str + " already queued", (Throwable) null, 2, (Object) null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(str, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String str) {
            l.e(str, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                NotificationGenerationWorkManager.notificationIds.remove(str);
            }
        }
    }

    public boolean beginEnqueueingWork(Context context, String str, int i10, JSONObject jSONObject, long j10, boolean z10, boolean z11) {
        l.e(context, "context");
        l.e(str, "osNotificationId");
        String oSNotificationIdFromJson = c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            com.onesignal.debug.internal.logging.a.debug$default("Notification beginEnqueueingWork with id null", (Throwable) null, 2, (Object) null);
            return false;
        } else if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            com.onesignal.debug.internal.logging.a.debug$default("Notification beginEnqueueingWork with id duplicated", (Throwable) null, 2, (Object) null);
            return true;
        } else {
            e a10 = new e.a().h(OS_ID_DATA_PARAM, oSNotificationIdFromJson).f(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, i10).h(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject)).g(TIMESTAMP_WORKER_DATA_PARAM, j10).e(IS_RESTORING_WORKER_DATA_PARAM, z10).a();
            l.d(a10, "Builder()\n              …\n                .build()");
            a0 b10 = ((r.a) new r.a(NotificationGenerationWorker.class).g(a10)).b();
            l.d(b10, "Builder(NotificationGene…\n                .build()");
            com.onesignal.debug.internal.logging.a.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + jSONObject, (Throwable) null, 2, (Object) null);
            z.e(context).c(str, androidx.work.g.KEEP, (r) b10);
            return true;
        }
    }
}
