package com.onesignal.notifications.internal.registration.impl;

import cb.p;
import com.onesignal.common.threading.c;
import db.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.h0;
import sa.o;

public final class e implements p9.a, d {
    private final f _applicationService;
    /* access modifiers changed from: private */
    public c waiter;

    static final class a extends d {
        Object L$0;
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
            return this.this$0.registerForPush(this);
        }
    }

    static final class b extends l implements p {
        final /* synthetic */ t $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, e eVar, va.d dVar) {
            super(2, dVar);
            this.$registrationId = tVar;
            this.this$0 = eVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new b(this.$registrationId, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            t tVar;
            String str;
            t tVar2;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                tVar = this.$registrationId;
                c access$getWaiter$p = this.this$0.waiter;
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
            return ((b) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    public e(f fVar) {
        db.l.e(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    public Object fireCallback(String str, va.d dVar) {
        c cVar = this.waiter;
        if (cVar != null) {
            cVar.wake(str);
        }
        return sa.t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object registerForPush(va.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.registration.impl.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.registration.impl.e$a r0 = (com.onesignal.notifications.internal.registration.impl.e.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.e$a r0 = new com.onesignal.notifications.internal.registration.impl.e$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            db.t r0 = (db.t) r0
            sa.o.b(r9)
            goto L_0x0093
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0037:
            sa.o.b(r9)
            com.onesignal.common.threading.c r9 = new com.onesignal.common.threading.c
            r9.<init>()
            r8.waiter = r9
            com.amazon.device.messaging.ADM r9 = new com.amazon.device.messaging.ADM
            l7.f r2 = r8._applicationService
            android.content.Context r2 = r2.getAppContext()
            r9.<init>(r2)
            db.t r2 = new db.t
            r2.<init>()
            java.lang.String r6 = r9.getRegistrationId()
            r2.f9426e = r6
            if (r6 == 0) goto L_0x007d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ADM Already registered with ID:"
            r9.append(r0)
            java.lang.Object r0 = r2.f9426e
            java.lang.String r0 = (java.lang.String) r0
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r9, r5, r4, r5)
            p9.a$a r9 = new p9.a$a
            java.lang.Object r0 = r2.f9426e
            java.lang.String r0 = (java.lang.String) r0
            com.onesignal.user.internal.subscriptions.f r1 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED
            r9.<init>(r0, r1)
            goto L_0x00c7
        L_0x007d:
            r9.startRegister()
            com.onesignal.notifications.internal.registration.impl.e$b r9 = new com.onesignal.notifications.internal.registration.impl.e$b
            r9.<init>(r2, r8, r5)
            r0.L$0 = r2
            r0.label = r3
            r6 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r9 = mb.l2.c(r6, r9, r0)
            if (r9 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r0 = r2
        L_0x0093:
            java.lang.Object r9 = r0.f9426e
            if (r9 == 0) goto L_0x00bb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "ADM registered with ID:"
            r9.append(r1)
            java.lang.Object r1 = r0.f9426e
            java.lang.String r1 = (java.lang.String) r1
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.onesignal.debug.internal.logging.a.error$default(r9, r5, r4, r5)
            p9.a$a r9 = new p9.a$a
            java.lang.Object r0 = r0.f9426e
            java.lang.String r0 = (java.lang.String) r0
            com.onesignal.user.internal.subscriptions.f r1 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED
            r9.<init>(r0, r1)
            goto L_0x00c7
        L_0x00bb:
            java.lang.String r9 = "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions."
            com.onesignal.debug.internal.logging.a.error$default(r9, r5, r4, r5)
            p9.a$a r9 = new p9.a$a
            com.onesignal.user.internal.subscriptions.f r0 = com.onesignal.user.internal.subscriptions.f.ERROR
            r9.<init>(r5, r0)
        L_0x00c7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.e.registerForPush(va.d):java.lang.Object");
    }
}
