package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.k;
import com.onesignal.user.internal.operations.h;
import com.onesignal.user.internal.subscriptions.e;
import db.g;
import db.l;
import java.util.List;
import v7.d;
import w9.i;

public final class f implements d {
    public static final a Companion = new a((g) null);
    public static final String REFRESH_USER = "refresh-user";
    private final x9.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;
    private final w9.d _userBackend;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.EMAIL.ordinal()] = 1;
            iArr[i.SMS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[k.a.values().length];
            iArr2[k.a.RETRYABLE.ordinal()] = 1;
            iArr2[k.a.UNAUTHORIZED.ordinal()] = 2;
            iArr2[k.a.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, va.d dVar) {
            super(dVar);
            this.this$0 = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getUser((h) null, this);
        }
    }

    public f(w9.d dVar, com.onesignal.user.internal.identity.b bVar, com.onesignal.user.internal.properties.b bVar2, e eVar, com.onesignal.core.internal.config.b bVar3, x9.a aVar) {
        l.e(dVar, "_userBackend");
        l.e(bVar, "_identityModelStore");
        l.e(bVar2, "_propertiesModelStore");
        l.e(eVar, "_subscriptionsModelStore");
        l.e(bVar3, "_configModelStore");
        l.e(aVar, "_buildUserService");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._buildUserService = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[Catch:{ a -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[Catch:{ a -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUser(com.onesignal.user.internal.operations.h r14, va.d r15) {
        /*
            r13 = this;
            java.lang.String r0 = "HYDRATE"
            boolean r1 = r15 instanceof com.onesignal.user.internal.operations.impl.executors.f.c
            if (r1 == 0) goto L_0x0015
            r1 = r15
            com.onesignal.user.internal.operations.impl.executors.f$c r1 = (com.onesignal.user.internal.operations.impl.executors.f.c) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            com.onesignal.user.internal.operations.impl.executors.f$c r1 = new com.onesignal.user.internal.operations.impl.executors.f$c
            r1.<init>(r13, r15)
        L_0x001a:
            java.lang.Object r15 = r1.result
            java.lang.Object r2 = wa.d.c()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r5) goto L_0x0037
            java.lang.Object r14 = r1.L$1
            com.onesignal.user.internal.operations.h r14 = (com.onesignal.user.internal.operations.h) r14
            java.lang.Object r1 = r1.L$0
            com.onesignal.user.internal.operations.impl.executors.f r1 = (com.onesignal.user.internal.operations.impl.executors.f) r1
            sa.o.b(r15)     // Catch:{ a -> 0x0034 }
            goto L_0x005c
        L_0x0034:
            r15 = move-exception
            goto L_0x021c
        L_0x0037:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003f:
            sa.o.b(r15)
            w9.d r15 = r13._userBackend     // Catch:{ a -> 0x021a }
            java.lang.String r3 = r14.getAppId()     // Catch:{ a -> 0x021a }
            java.lang.String r6 = "onesignal_id"
            java.lang.String r7 = r14.getOnesignalId()     // Catch:{ a -> 0x021a }
            r1.L$0 = r13     // Catch:{ a -> 0x021a }
            r1.L$1 = r14     // Catch:{ a -> 0x021a }
            r1.label = r5     // Catch:{ a -> 0x021a }
            java.lang.Object r15 = r15.getUser(r3, r6, r7, r1)     // Catch:{ a -> 0x021a }
            if (r15 != r2) goto L_0x005b
            return r2
        L_0x005b:
            r1 = r13
        L_0x005c:
            w9.a r15 = (w9.a) r15     // Catch:{ a -> 0x0034 }
            java.lang.String r2 = r14.getOnesignalId()     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.identity.b r3 = r1._identityModelStore     // Catch:{ a -> 0x0034 }
            com.onesignal.common.modeling.g r3 = r3.getModel()     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.identity.a r3 = (com.onesignal.user.internal.identity.a) r3     // Catch:{ a -> 0x0034 }
            java.lang.String r3 = r3.getOnesignalId()     // Catch:{ a -> 0x0034 }
            boolean r2 = db.l.a(r2, r3)     // Catch:{ a -> 0x0034 }
            if (r2 != 0) goto L_0x0081
            v7.a r15 = new v7.a     // Catch:{ a -> 0x0034 }
            v7.b r7 = v7.b.SUCCESS     // Catch:{ a -> 0x0034 }
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ a -> 0x0034 }
            return r15
        L_0x0081:
            com.onesignal.user.internal.identity.a r2 = new com.onesignal.user.internal.identity.a     // Catch:{ a -> 0x0034 }
            r2.<init>()     // Catch:{ a -> 0x0034 }
            java.util.Map r3 = r15.getIdentities()     // Catch:{ a -> 0x0034 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ a -> 0x0034 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ a -> 0x0034 }
        L_0x0092:
            boolean r6 = r3.hasNext()     // Catch:{ a -> 0x0034 }
            if (r6 == 0) goto L_0x00aa
            java.lang.Object r6 = r3.next()     // Catch:{ a -> 0x0034 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ a -> 0x0034 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ a -> 0x0034 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ a -> 0x0034 }
            r2.put(r7, r6)     // Catch:{ a -> 0x0034 }
            goto L_0x0092
        L_0x00aa:
            com.onesignal.user.internal.properties.a r3 = new com.onesignal.user.internal.properties.a     // Catch:{ a -> 0x0034 }
            r3.<init>()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r14.getOnesignalId()     // Catch:{ a -> 0x0034 }
            r3.setOnesignalId(r6)     // Catch:{ a -> 0x0034 }
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getCountry()     // Catch:{ a -> 0x0034 }
            if (r6 == 0) goto L_0x00cb
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getCountry()     // Catch:{ a -> 0x0034 }
            r3.setCountry(r6)     // Catch:{ a -> 0x0034 }
        L_0x00cb:
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ a -> 0x0034 }
            if (r6 == 0) goto L_0x00e0
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ a -> 0x0034 }
            r3.setLanguage(r6)     // Catch:{ a -> 0x0034 }
        L_0x00e0:
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.util.Map r6 = r6.getTags()     // Catch:{ a -> 0x0034 }
            if (r6 == 0) goto L_0x011f
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.util.Map r6 = r6.getTags()     // Catch:{ a -> 0x0034 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ a -> 0x0034 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ a -> 0x0034 }
        L_0x00fa:
            boolean r7 = r6.hasNext()     // Catch:{ a -> 0x0034 }
            if (r7 == 0) goto L_0x011f
            java.lang.Object r7 = r6.next()     // Catch:{ a -> 0x0034 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ a -> 0x0034 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ a -> 0x0034 }
            if (r8 == 0) goto L_0x00fa
            com.onesignal.common.modeling.f r8 = r3.getTags()     // Catch:{ a -> 0x0034 }
            java.lang.Object r9 = r7.getKey()     // Catch:{ a -> 0x0034 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ a -> 0x0034 }
            db.l.b(r7)     // Catch:{ a -> 0x0034 }
            r8.put(r9, r7)     // Catch:{ a -> 0x0034 }
            goto L_0x00fa
        L_0x011f:
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getTimezoneId()     // Catch:{ a -> 0x0034 }
            if (r6 == 0) goto L_0x0134
            w9.f r6 = r15.getProperties()     // Catch:{ a -> 0x0034 }
            java.lang.String r6 = r6.getTimezoneId()     // Catch:{ a -> 0x0034 }
            r3.setTimezone(r6)     // Catch:{ a -> 0x0034 }
        L_0x0134:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ a -> 0x0034 }
            r6.<init>()     // Catch:{ a -> 0x0034 }
            java.util.List r15 = r15.getSubscriptions()     // Catch:{ a -> 0x0034 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ a -> 0x0034 }
        L_0x0141:
            boolean r7 = r15.hasNext()     // Catch:{ a -> 0x0034 }
            if (r7 == 0) goto L_0x01fe
            java.lang.Object r7 = r15.next()     // Catch:{ a -> 0x0034 }
            w9.h r7 = (w9.h) r7     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.d r8 = new com.onesignal.user.internal.subscriptions.d     // Catch:{ a -> 0x0034 }
            r8.<init>()     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r7.getId()     // Catch:{ a -> 0x0034 }
            db.l.b(r9)     // Catch:{ a -> 0x0034 }
            r8.setId(r9)     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r7.getToken()     // Catch:{ a -> 0x0034 }
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x0165
            r9 = r10
        L_0x0165:
            r8.setAddress(r9)     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.f$a r9 = com.onesignal.user.internal.subscriptions.f.Companion     // Catch:{ a -> 0x0034 }
            java.lang.Integer r11 = r7.getNotificationTypes()     // Catch:{ a -> 0x0034 }
            if (r11 == 0) goto L_0x0175
            int r11 = r11.intValue()     // Catch:{ a -> 0x0034 }
            goto L_0x017b
        L_0x0175:
            com.onesignal.user.internal.subscriptions.f r11 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED     // Catch:{ a -> 0x0034 }
            int r11 = r11.getValue()     // Catch:{ a -> 0x0034 }
        L_0x017b:
            com.onesignal.user.internal.subscriptions.f r9 = r9.fromInt(r11)     // Catch:{ a -> 0x0034 }
            if (r9 != 0) goto L_0x0183
            com.onesignal.user.internal.subscriptions.f r9 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED     // Catch:{ a -> 0x0034 }
        L_0x0183:
            r8.setStatus(r9)     // Catch:{ a -> 0x0034 }
            w9.i r9 = r7.getType()     // Catch:{ a -> 0x0034 }
            db.l.b(r9)     // Catch:{ a -> 0x0034 }
            int[] r11 = com.onesignal.user.internal.operations.impl.executors.f.b.$EnumSwitchMapping$0     // Catch:{ a -> 0x0034 }
            int r9 = r9.ordinal()     // Catch:{ a -> 0x0034 }
            r9 = r11[r9]     // Catch:{ a -> 0x0034 }
            if (r9 == r5) goto L_0x019f
            if (r9 == r4) goto L_0x019c
            com.onesignal.user.internal.subscriptions.g r9 = com.onesignal.user.internal.subscriptions.g.PUSH     // Catch:{ a -> 0x0034 }
            goto L_0x01a1
        L_0x019c:
            com.onesignal.user.internal.subscriptions.g r9 = com.onesignal.user.internal.subscriptions.g.SMS     // Catch:{ a -> 0x0034 }
            goto L_0x01a1
        L_0x019f:
            com.onesignal.user.internal.subscriptions.g r9 = com.onesignal.user.internal.subscriptions.g.EMAIL     // Catch:{ a -> 0x0034 }
        L_0x01a1:
            r8.setType(r9)     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.f r9 = r8.getStatus()     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.f r11 = com.onesignal.user.internal.subscriptions.f.UNSUBSCRIBE     // Catch:{ a -> 0x0034 }
            if (r9 == r11) goto L_0x01ae
            r9 = 1
            goto L_0x01af
        L_0x01ae:
            r9 = 0
        L_0x01af:
            r8.setOptedIn(r9)     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r7.getSdk()     // Catch:{ a -> 0x0034 }
            if (r9 != 0) goto L_0x01b9
            r9 = r10
        L_0x01b9:
            r8.setSdk(r9)     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r7.getDeviceOS()     // Catch:{ a -> 0x0034 }
            if (r9 != 0) goto L_0x01c3
            r9 = r10
        L_0x01c3:
            r8.setDeviceOS(r9)     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r7.getCarrier()     // Catch:{ a -> 0x0034 }
            if (r9 != 0) goto L_0x01cd
            r9 = r10
        L_0x01cd:
            r8.setCarrier(r9)     // Catch:{ a -> 0x0034 }
            java.lang.String r7 = r7.getAppVersion()     // Catch:{ a -> 0x0034 }
            if (r7 != 0) goto L_0x01d7
            goto L_0x01d8
        L_0x01d7:
            r10 = r7
        L_0x01d8:
            r8.setAppVersion(r10)     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.g r7 = r8.getType()     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.g r9 = com.onesignal.user.internal.subscriptions.g.PUSH     // Catch:{ a -> 0x0034 }
            if (r7 != r9) goto L_0x01f9
            java.lang.String r7 = r8.getId()     // Catch:{ a -> 0x0034 }
            com.onesignal.core.internal.config.b r9 = r1._configModelStore     // Catch:{ a -> 0x0034 }
            com.onesignal.common.modeling.g r9 = r9.getModel()     // Catch:{ a -> 0x0034 }
            com.onesignal.core.internal.config.a r9 = (com.onesignal.core.internal.config.a) r9     // Catch:{ a -> 0x0034 }
            java.lang.String r9 = r9.getPushSubscriptionId()     // Catch:{ a -> 0x0034 }
            boolean r7 = db.l.a(r7, r9)     // Catch:{ a -> 0x0034 }
            if (r7 == 0) goto L_0x0141
        L_0x01f9:
            r6.add(r8)     // Catch:{ a -> 0x0034 }
            goto L_0x0141
        L_0x01fe:
            com.onesignal.user.internal.identity.b r15 = r1._identityModelStore     // Catch:{ a -> 0x0034 }
            r15.replace(r2, r0)     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.properties.b r15 = r1._propertiesModelStore     // Catch:{ a -> 0x0034 }
            r15.replace(r3, r0)     // Catch:{ a -> 0x0034 }
            com.onesignal.user.internal.subscriptions.e r15 = r1._subscriptionsModelStore     // Catch:{ a -> 0x0034 }
            r15.replaceAll(r6, r0)     // Catch:{ a -> 0x0034 }
            v7.a r15 = new v7.a     // Catch:{ a -> 0x0034 }
            v7.b r8 = v7.b.SUCCESS     // Catch:{ a -> 0x0034 }
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ a -> 0x0034 }
            return r15
        L_0x021a:
            r15 = move-exception
            r1 = r13
        L_0x021c:
            com.onesignal.common.k r0 = com.onesignal.common.k.INSTANCE
            int r15 = r15.getStatusCode()
            com.onesignal.common.k$a r15 = r0.getResponseStatusType(r15)
            int[] r0 = com.onesignal.user.internal.operations.impl.executors.f.b.$EnumSwitchMapping$1
            int r15 = r15.ordinal()
            r15 = r0[r15]
            if (r15 == r5) goto L_0x0276
            if (r15 == r4) goto L_0x0269
            r0 = 3
            if (r15 == r0) goto L_0x0242
            v7.a r14 = new v7.a
            v7.b r3 = v7.b.FAIL_NORETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0282
        L_0x0242:
            x9.a r15 = r1._buildUserService
            java.lang.String r0 = r14.getAppId()
            java.lang.String r14 = r14.getOnesignalId()
            java.util.List r4 = r15.getRebuildOperationsIfCurrentUser(r0, r14)
            v7.a r14 = new v7.a
            if (r4 != 0) goto L_0x025f
            v7.b r6 = v7.b.FAIL_NORETRY
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r14
        L_0x025f:
            v7.b r2 = v7.b.FAIL_RETRY
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            return r14
        L_0x0269:
            v7.a r14 = new v7.a
            v7.b r8 = v7.b.FAIL_UNAUTHORIZED
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0282
        L_0x0276:
            v7.a r14 = new v7.a
            v7.b r1 = v7.b.FAIL_RETRY
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0282:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.f.getUser(com.onesignal.user.internal.operations.h, va.d):java.lang.Object");
    }

    public Object execute(List<? extends v7.f> list, va.d dVar) {
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "RefreshUserOperationExecutor(operation: " + list + ')');
        v7.f fVar = (v7.f) w.w(list);
        if (fVar instanceof h) {
            return getUser((h) fVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + fVar);
    }

    public List<String> getOperations() {
        return n.b(REFRESH_USER);
    }
}
