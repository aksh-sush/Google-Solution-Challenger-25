package com.onesignal.notifications.internal.registration.impl;

import android.content.Context;
import cb.p;
import db.g;
import db.t;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.h0;
import sa.o;

public final class h implements p9.a, d {
    public static final a Companion = new a((g) null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final f _applicationService;
    private final q7.a _deviceService;
    /* access modifiers changed from: private */
    public com.onesignal.common.threading.c waiter;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getHMSTokenTask((Context) null, this);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ t $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(t tVar, h hVar, va.d dVar) {
            super(2, dVar);
            this.$pushToken = tVar;
            this.this$0 = hVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new c(this.$pushToken, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            t tVar;
            String str;
            t tVar2;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                tVar = this.$pushToken;
                com.onesignal.common.threading.c access$getWaiter$p = this.this$0.waiter;
                if (access$getWaiter$p != null) {
                    this.L$0 = tVar;
                    this.label = 1;
                    Object waitForWake = access$getWaiter$p.waitForWake(this);
                    if (waitForWake == c10) {
                        return c10;
                    }
                    tVar2 = tVar;
                    obj = waitForWake;
                } else {
                    str = null;
                    tVar.f9426e = str;
                    return sa.t.f15300a;
                }
            } else if (i10 == 1) {
                tVar2 = (t) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t tVar3 = tVar2;
            str = (String) obj;
            tVar = tVar3;
            tVar.f9426e = str;
            return sa.t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.registerForPush(this);
        }
    }

    public h(q7.a aVar, f fVar) {
        db.l.e(aVar, "_deviceService");
        db.l.e(fVar, "_applicationService");
        this._deviceService = aVar;
        this._applicationService = fVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object getHMSTokenTask(android.content.Context r9, va.d r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r10 instanceof com.onesignal.notifications.internal.registration.impl.h.b     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0014
            r0 = r10
            com.onesignal.notifications.internal.registration.impl.h$b r0 = (com.onesignal.notifications.internal.registration.impl.h.b) r0     // Catch:{ all -> 0x00e6 }
            int r1 = r0.label     // Catch:{ all -> 0x00e6 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1     // Catch:{ all -> 0x00e6 }
            goto L_0x0019
        L_0x0014:
            com.onesignal.notifications.internal.registration.impl.h$b r0 = new com.onesignal.notifications.internal.registration.impl.h$b     // Catch:{ all -> 0x00e6 }
            r0.<init>(r8, r10)     // Catch:{ all -> 0x00e6 }
        L_0x0019:
            java.lang.Object r10 = r0.result     // Catch:{ all -> 0x00e6 }
            java.lang.Object r1 = wa.d.c()     // Catch:{ all -> 0x00e6 }
            int r2 = r0.label     // Catch:{ all -> 0x00e6 }
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r9 = r0.L$0     // Catch:{ all -> 0x00e6 }
            db.t r9 = (db.t) r9     // Catch:{ all -> 0x00e6 }
            sa.o.b(r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x00b0
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)     // Catch:{ all -> 0x00e6 }
            throw r9     // Catch:{ all -> 0x00e6 }
        L_0x0039:
            sa.o.b(r10)     // Catch:{ all -> 0x00e6 }
            q7.a r10 = r8._deviceService     // Catch:{ all -> 0x00e6 }
            boolean r10 = r10.getHasAllHMSLibrariesForPushKit()     // Catch:{ all -> 0x00e6 }
            if (r10 != 0) goto L_0x004d
            p9.a$a r9 = new p9.a$a     // Catch:{ all -> 0x00e6 }
            com.onesignal.user.internal.subscriptions.f r10 = com.onesignal.user.internal.subscriptions.f.MISSING_HMS_PUSHKIT_LIBRARY     // Catch:{ all -> 0x00e6 }
            r9.<init>(r5, r10)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r9
        L_0x004d:
            com.onesignal.common.threading.c r10 = new com.onesignal.common.threading.c     // Catch:{ all -> 0x00e6 }
            r10.<init>()     // Catch:{ all -> 0x00e6 }
            r8.waiter = r10     // Catch:{ all -> 0x00e6 }
            com.huawei.agconnect.config.AGConnectServicesConfig r10 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r9)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "client/app_id"
            java.lang.String r10 = r10.getString(r2)     // Catch:{ all -> 0x00e6 }
            com.huawei.hms.aaid.HmsInstanceId r9 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r9)     // Catch:{ all -> 0x00e6 }
            db.t r2 = new db.t     // Catch:{ all -> 0x00e6 }
            r2.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "HCM"
            java.lang.String r9 = r9.getToken(r10, r6)     // Catch:{ all -> 0x00e6 }
            r2.f9426e = r9     // Catch:{ all -> 0x00e6 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x00e6 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x00e6 }
            if (r9 != 0) goto L_0x009c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r9.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = "Device registered for HMS, push token = "
            r9.append(r10)     // Catch:{ all -> 0x00e6 }
            java.lang.Object r10 = r2.f9426e     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00e6 }
            r9.append(r10)     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00e6 }
            com.onesignal.debug.internal.logging.a.info$default(r9, r5, r4, r5)     // Catch:{ all -> 0x00e6 }
            p9.a$a r9 = new p9.a$a     // Catch:{ all -> 0x00e6 }
            java.lang.Object r10 = r2.f9426e     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00e6 }
            com.onesignal.user.internal.subscriptions.f r0 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED     // Catch:{ all -> 0x00e6 }
            r9.<init>(r10, r0)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r9
        L_0x009c:
            com.onesignal.notifications.internal.registration.impl.h$c r9 = new com.onesignal.notifications.internal.registration.impl.h$c     // Catch:{ all -> 0x00e6 }
            r9.<init>(r2, r8, r5)     // Catch:{ all -> 0x00e6 }
            r0.L$0 = r2     // Catch:{ all -> 0x00e6 }
            r0.label = r3     // Catch:{ all -> 0x00e6 }
            r6 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r9 = mb.l2.c(r6, r9, r0)     // Catch:{ all -> 0x00e6 }
            if (r9 != r1) goto L_0x00af
            monitor-exit(r8)
            return r1
        L_0x00af:
            r9 = r2
        L_0x00b0:
            java.lang.Object r10 = r9.f9426e     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x00d8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r10.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "HMS registered with ID:"
            r10.append(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r9.f9426e     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00e6 }
            r10.append(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00e6 }
            com.onesignal.debug.internal.logging.a.error$default(r10, r5, r4, r5)     // Catch:{ all -> 0x00e6 }
            p9.a$a r10 = new p9.a$a     // Catch:{ all -> 0x00e6 }
            java.lang.Object r9 = r9.f9426e     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00e6 }
            com.onesignal.user.internal.subscriptions.f r0 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED     // Catch:{ all -> 0x00e6 }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e4
        L_0x00d8:
            java.lang.String r9 = "HmsMessageServiceOneSignal.onNewToken timed out."
            com.onesignal.debug.internal.logging.a.error$default(r9, r5, r4, r5)     // Catch:{ all -> 0x00e6 }
            p9.a$a r10 = new p9.a$a     // Catch:{ all -> 0x00e6 }
            com.onesignal.user.internal.subscriptions.f r9 = com.onesignal.user.internal.subscriptions.f.HMS_TOKEN_TIMEOUT     // Catch:{ all -> 0x00e6 }
            r10.<init>(r5, r9)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r8)
            return r10
        L_0x00e6:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.h.getHMSTokenTask(android.content.Context, va.d):java.lang.Object");
    }

    public Object fireCallback(String str, va.d dVar) {
        com.onesignal.common.threading.c cVar = this.waiter;
        if (cVar != null) {
            cVar.wake(str);
        }
        return sa.t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object registerForPush(va.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onesignal.notifications.internal.registration.impl.h.d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.onesignal.notifications.internal.registration.impl.h$d r0 = (com.onesignal.notifications.internal.registration.impl.h.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.h$d r0 = new com.onesignal.notifications.internal.registration.impl.h$d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            sa.o.b(r5)     // Catch:{ ApiException -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            sa.o.b(r5)
            l7.f r5 = r4._applicationService     // Catch:{ ApiException -> 0x0029 }
            android.content.Context r5 = r5.getAppContext()     // Catch:{ ApiException -> 0x0029 }
            r0.label = r3     // Catch:{ ApiException -> 0x0029 }
            java.lang.Object r5 = r4.getHMSTokenTask(r5, r0)     // Catch:{ ApiException -> 0x0029 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            p9.a$a r5 = (p9.a.C0280a) r5     // Catch:{ ApiException -> 0x0029 }
            goto L_0x0065
        L_0x0048:
            java.lang.String r0 = "HMS ApiException getting Huawei push token!"
            r1 = r5
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.onesignal.debug.internal.logging.a.error(r0, r1)
            int r5 = r5.getStatusCode()
            r0 = 907135000(0x3611c818, float:2.1723154E-6)
            if (r5 != r0) goto L_0x005c
            com.onesignal.user.internal.subscriptions.f r5 = com.onesignal.user.internal.subscriptions.f.HMS_ARGUMENTS_INVALID
            goto L_0x005e
        L_0x005c:
            com.onesignal.user.internal.subscriptions.f r5 = com.onesignal.user.internal.subscriptions.f.HMS_API_EXCEPTION_OTHER
        L_0x005e:
            p9.a$a r0 = new p9.a$a
            r1 = 0
            r0.<init>(r1, r5)
            r5 = r0
        L_0x0065:
            db.l.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.h.registerForPush(va.d):java.lang.Object");
    }
}
