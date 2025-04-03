package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.k;
import com.onesignal.user.internal.operations.e;
import db.g;
import db.l;
import java.util.List;
import v7.d;
import v7.f;

public final class c implements d {
    public static final a Companion = new a((g) null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final w9.c _subscriptionBackend;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.a.values().length];
            iArr[k.a.RETRYABLE.ordinal()] = 1;
            iArr[k.a.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.c$c  reason: collision with other inner class name */
    static final class C0194c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0194c(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.loginUser((e) null, this);
        }
    }

    public c(w9.c cVar, com.onesignal.user.internal.identity.b bVar, com.onesignal.user.internal.properties.b bVar2) {
        l.e(cVar, "_subscriptionBackend");
        l.e(bVar, "_identityModelStore");
        l.e(bVar2, "_propertiesModelStore");
        this._subscriptionBackend = cVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[Catch:{ a -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c A[Catch:{ a -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object loginUser(com.onesignal.user.internal.operations.e r13, va.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.onesignal.user.internal.operations.impl.executors.c.C0194c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.user.internal.operations.impl.executors.c$c r0 = (com.onesignal.user.internal.operations.impl.executors.c.C0194c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.operations.impl.executors.c$c r0 = new com.onesignal.user.internal.operations.impl.executors.c$c
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r13 = r0.L$1
            com.onesignal.user.internal.operations.e r13 = (com.onesignal.user.internal.operations.e) r13
            java.lang.Object r0 = r0.L$0
            com.onesignal.user.internal.operations.impl.executors.c r0 = (com.onesignal.user.internal.operations.impl.executors.c) r0
            sa.o.b(r14)     // Catch:{ a -> 0x00f3 }
            goto L_0x0055
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            sa.o.b(r14)
            w9.c r14 = r12._subscriptionBackend     // Catch:{ a -> 0x00f3 }
            java.lang.String r2 = r13.getAppId()     // Catch:{ a -> 0x00f3 }
            java.lang.String r5 = r13.getSubscriptionId()     // Catch:{ a -> 0x00f3 }
            r0.L$0 = r12     // Catch:{ a -> 0x00f3 }
            r0.L$1 = r13     // Catch:{ a -> 0x00f3 }
            r0.label = r4     // Catch:{ a -> 0x00f3 }
            java.lang.Object r14 = r14.getIdentityFromSubscription(r2, r5, r0)     // Catch:{ a -> 0x00f3 }
            if (r14 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r12
        L_0x0055:
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ a -> 0x00f3 }
            java.lang.String r1 = "onesignal_id"
            r2 = 0
            java.lang.Object r14 = r14.getOrDefault(r1, r2)     // Catch:{ a -> 0x00f3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ a -> 0x00f3 }
            if (r14 != 0) goto L_0x008c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ a -> 0x00f3 }
            r14.<init>()     // Catch:{ a -> 0x00f3 }
            java.lang.String r0 = "Subscription "
            r14.append(r0)     // Catch:{ a -> 0x00f3 }
            java.lang.String r13 = r13.getSubscriptionId()     // Catch:{ a -> 0x00f3 }
            r14.append(r13)     // Catch:{ a -> 0x00f3 }
            java.lang.String r13 = " has no onesignal_id!"
            r14.append(r13)     // Catch:{ a -> 0x00f3 }
            java.lang.String r13 = r14.toString()     // Catch:{ a -> 0x00f3 }
            com.onesignal.debug.internal.logging.a.warn$default(r13, r2, r3, r2)     // Catch:{ a -> 0x00f3 }
            v7.a r13 = new v7.a     // Catch:{ a -> 0x00f3 }
            v7.b r6 = v7.b.FAIL_NORETRY     // Catch:{ a -> 0x00f3 }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ a -> 0x00f3 }
            return r13
        L_0x008c:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ a -> 0x00f3 }
            r1.<init>()     // Catch:{ a -> 0x00f3 }
            java.lang.String r2 = r13.getOnesignalId()     // Catch:{ a -> 0x00f3 }
            r1.put(r2, r14)     // Catch:{ a -> 0x00f3 }
            com.onesignal.user.internal.identity.b r2 = r0._identityModelStore     // Catch:{ a -> 0x00f3 }
            com.onesignal.common.modeling.g r2 = r2.getModel()     // Catch:{ a -> 0x00f3 }
            r5 = r2
            com.onesignal.user.internal.identity.a r5 = (com.onesignal.user.internal.identity.a) r5     // Catch:{ a -> 0x00f3 }
            com.onesignal.user.internal.properties.b r0 = r0._propertiesModelStore     // Catch:{ a -> 0x00f3 }
            com.onesignal.common.modeling.g r0 = r0.getModel()     // Catch:{ a -> 0x00f3 }
            com.onesignal.user.internal.properties.a r0 = (com.onesignal.user.internal.properties.a) r0     // Catch:{ a -> 0x00f3 }
            java.lang.String r2 = r5.getOnesignalId()     // Catch:{ a -> 0x00f3 }
            java.lang.String r6 = r13.getOnesignalId()     // Catch:{ a -> 0x00f3 }
            boolean r2 = db.l.a(r2, r6)     // Catch:{ a -> 0x00f3 }
            if (r2 == 0) goto L_0x00c3
            java.lang.String r6 = "onesignal_id"
            java.lang.String r8 = "HYDRATE"
            r9 = 0
            r10 = 8
            r11 = 0
            r7 = r14
            com.onesignal.common.modeling.g.setStringProperty$default(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ a -> 0x00f3 }
        L_0x00c3:
            java.lang.String r2 = r0.getOnesignalId()     // Catch:{ a -> 0x00f3 }
            java.lang.String r5 = r13.getOnesignalId()     // Catch:{ a -> 0x00f3 }
            boolean r2 = db.l.a(r2, r5)     // Catch:{ a -> 0x00f3 }
            if (r2 == 0) goto L_0x00de
            java.lang.String r6 = "onesignalId"
            java.lang.String r8 = "HYDRATE"
            r9 = 0
            r10 = 8
            r11 = 0
            r5 = r0
            r7 = r14
            com.onesignal.common.modeling.g.setStringProperty$default(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ a -> 0x00f3 }
        L_0x00de:
            v7.a r0 = new v7.a     // Catch:{ a -> 0x00f3 }
            v7.b r2 = v7.b.SUCCESS     // Catch:{ a -> 0x00f3 }
            com.onesignal.user.internal.operations.h r5 = new com.onesignal.user.internal.operations.h     // Catch:{ a -> 0x00f3 }
            java.lang.String r13 = r13.getAppId()     // Catch:{ a -> 0x00f3 }
            r5.<init>(r13, r14)     // Catch:{ a -> 0x00f3 }
            java.util.List r13 = ta.n.b(r5)     // Catch:{ a -> 0x00f3 }
            r0.<init>(r2, r1, r13)     // Catch:{ a -> 0x00f3 }
            return r0
        L_0x00f3:
            r13 = move-exception
            com.onesignal.common.k r14 = com.onesignal.common.k.INSTANCE
            int r13 = r13.getStatusCode()
            com.onesignal.common.k$a r13 = r14.getResponseStatusType(r13)
            int[] r14 = com.onesignal.user.internal.operations.impl.executors.c.b.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
            if (r13 == r4) goto L_0x0124
            if (r13 == r3) goto L_0x0117
            v7.a r13 = new v7.a
            v7.b r6 = v7.b.FAIL_NORETRY
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0130
        L_0x0117:
            v7.a r13 = new v7.a
            v7.b r1 = v7.b.FAIL_UNAUTHORIZED
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0130
        L_0x0124:
            v7.a r13 = new v7.a
            v7.b r7 = v7.b.FAIL_RETRY
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0130:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.c.loginUser(com.onesignal.user.internal.operations.e, va.d):java.lang.Object");
    }

    public Object execute(List<? extends f> list, va.d dVar) {
        com.onesignal.debug.internal.logging.a.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', (Throwable) null, 2, (Object) null);
        f fVar = (f) w.w(list);
        if (fVar instanceof e) {
            return loginUser((e) fVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + fVar);
    }

    public List<String> getOperations() {
        return n.b(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
