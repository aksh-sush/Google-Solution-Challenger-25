package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.k;
import com.onesignal.common.n;
import com.onesignal.user.internal.operations.o;
import com.onesignal.user.internal.operations.p;
import com.onesignal.user.internal.subscriptions.e;
import db.g;
import db.l;
import java.util.List;
import java.util.Map;
import l7.f;
import w9.h;
import w9.i;

public final class d implements v7.d {
    public static final a Companion = new a((g) null);
    public static final String LOGIN_USER = "login-user";
    private final f _application;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final a _identityOperationExecutor;
    private final t7.a _languageContext;
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
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[v7.b.values().length];
            iArr[v7.b.SUCCESS.ordinal()] = 1;
            iArr[v7.b.FAIL_CONFLICT.ordinal()] = 2;
            iArr[v7.b.FAIL_NORETRY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[k.a.values().length];
            iArr2[k.a.RETRYABLE.ordinal()] = 1;
            iArr2[k.a.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.onesignal.user.internal.subscriptions.g.values().length];
            iArr3[com.onesignal.user.internal.subscriptions.g.SMS.ordinal()] = 1;
            iArr3[com.onesignal.user.internal.subscriptions.g.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createUser((com.onesignal.user.internal.operations.f) null, (List<? extends v7.f>) null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.d$d  reason: collision with other inner class name */
    static final class C0195d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0195d(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.loginUser((com.onesignal.user.internal.operations.f) null, (List<? extends v7.f>) null, this);
        }
    }

    public d(a aVar, f fVar, q7.a aVar2, w9.d dVar, com.onesignal.user.internal.identity.b bVar, com.onesignal.user.internal.properties.b bVar2, e eVar, com.onesignal.core.internal.config.b bVar3, t7.a aVar3) {
        l.e(aVar, "_identityOperationExecutor");
        l.e(fVar, "_application");
        l.e(aVar2, "_deviceService");
        l.e(dVar, "_userBackend");
        l.e(bVar, "_identityModelStore");
        l.e(bVar2, "_propertiesModelStore");
        l.e(eVar, "_subscriptionsModelStore");
        l.e(bVar3, "_configModelStore");
        l.e(aVar3, "_languageContext");
        this._identityOperationExecutor = aVar;
        this._application = fVar;
        this._deviceService = aVar2;
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._languageContext = aVar3;
    }

    private final Map<String, h> createSubscriptionsFromOperation(com.onesignal.user.internal.operations.a aVar, Map<String, h> map) {
        Map<String, h> n10 = f0.n(map);
        int i10 = b.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        i fromDeviceType = i10 != 1 ? i10 != 2 ? i.Companion.fromDeviceType(this._deviceService.getDeviceType()) : i.EMAIL : i.SMS;
        String subscriptionId = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean valueOf = Boolean.valueOf(aVar.getEnabled());
        Integer valueOf2 = Integer.valueOf(aVar.getStatus().getValue());
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(n.INSTANCE.isRooted());
        com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
        h hVar = r3;
        h hVar2 = new h((String) null, fromDeviceType, address, valueOf, valueOf2, com.onesignal.common.l.SDK_VERSION, str, str2, valueOf3, gVar.getNetType(this._application.getAppContext()), gVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext()));
        n10.put(subscriptionId, hVar);
        return n10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0142 A[Catch:{ a -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e A[Catch:{ a -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0174 A[Catch:{ a -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f4 A[EDGE_INSN: B:76:0x01f4->B:60:0x01f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createUser(com.onesignal.user.internal.operations.f r21, java.util.List<? extends v7.f> r22, va.d r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.onesignal.user.internal.operations.impl.executors.d.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.user.internal.operations.impl.executors.d$c r2 = (com.onesignal.user.internal.operations.impl.executors.d.c) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.user.internal.operations.impl.executors.d$c r2 = new com.onesignal.user.internal.operations.impl.executors.d$c
            r2.<init>(r1, r0)
        L_0x001c:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = wa.d.c()
            int r3 = r8.label
            r9 = 1
            if (r3 == 0) goto L_0x0046
            if (r3 != r9) goto L_0x003e
            java.lang.Object r2 = r8.L$2
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r8.L$1
            com.onesignal.user.internal.operations.f r3 = (com.onesignal.user.internal.operations.f) r3
            java.lang.Object r4 = r8.L$0
            com.onesignal.user.internal.operations.impl.executors.d r4 = (com.onesignal.user.internal.operations.impl.executors.d) r4
            sa.o.b(r0)     // Catch:{ a -> 0x003b }
            goto L_0x0106
        L_0x003b:
            r0 = move-exception
            goto L_0x0200
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            sa.o.b(r0)
            java.util.Map r0 = ta.f0.d()
            java.util.Map r3 = ta.f0.d()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            com.onesignal.common.q r4 = com.onesignal.common.q.INSTANCE
            java.lang.String r4 = r4.getTimeZoneId()
            db.l.b(r4)
            java.lang.String r5 = "timezone_id"
            r7.put(r5, r4)
            t7.a r4 = r1._languageContext
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r5 = "language"
            r7.put(r5, r4)
            java.lang.String r4 = r21.getExternalId()
            if (r4 == 0) goto L_0x0085
            java.util.Map r0 = ta.f0.n(r0)
            java.lang.String r4 = r21.getExternalId()
            db.l.b(r4)
            java.lang.String r5 = "external_id"
            r0.put(r5, r4)
        L_0x0085:
            r5 = r0
            java.util.Iterator r0 = r22.iterator()
        L_0x008a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c2
            java.lang.Object r4 = r0.next()
            v7.f r4 = (v7.f) r4
            boolean r6 = r4 instanceof com.onesignal.user.internal.operations.a
            if (r6 == 0) goto L_0x00a1
            com.onesignal.user.internal.operations.a r4 = (com.onesignal.user.internal.operations.a) r4
            java.util.Map r3 = r1.createSubscriptionsFromOperation((com.onesignal.user.internal.operations.a) r4, (java.util.Map<java.lang.String, w9.h>) r3)
            goto L_0x008a
        L_0x00a1:
            boolean r6 = r4 instanceof com.onesignal.user.internal.operations.o
            if (r6 == 0) goto L_0x00ac
            com.onesignal.user.internal.operations.o r4 = (com.onesignal.user.internal.operations.o) r4
            java.util.Map r3 = r1.createSubscriptionsFromOperation((com.onesignal.user.internal.operations.o) r4, (java.util.Map<java.lang.String, w9.h>) r3)
            goto L_0x008a
        L_0x00ac:
            boolean r6 = r4 instanceof com.onesignal.user.internal.operations.p
            if (r6 == 0) goto L_0x00b7
            com.onesignal.user.internal.operations.p r4 = (com.onesignal.user.internal.operations.p) r4
            java.util.Map r3 = r1.createSubscriptionsFromOperation((com.onesignal.user.internal.operations.p) r4, (java.util.Map<java.lang.String, w9.h>) r3)
            goto L_0x008a
        L_0x00b7:
            boolean r6 = r4 instanceof com.onesignal.user.internal.operations.c
            if (r6 == 0) goto L_0x008a
            com.onesignal.user.internal.operations.c r4 = (com.onesignal.user.internal.operations.c) r4
            java.util.Map r3 = r1.createSubscriptionsFromOperation((com.onesignal.user.internal.operations.c) r4, (java.util.Map<java.lang.String, w9.h>) r3)
            goto L_0x008a
        L_0x00c2:
            java.util.List r0 = ta.h0.o(r3)     // Catch:{ a -> 0x003b }
            w9.d r3 = r1._userBackend     // Catch:{ a -> 0x003b }
            java.lang.String r4 = r21.getAppId()     // Catch:{ a -> 0x003b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ a -> 0x003b }
            r10 = 10
            int r10 = ta.p.l(r0, r10)     // Catch:{ a -> 0x003b }
            r6.<init>(r10)     // Catch:{ a -> 0x003b }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ a -> 0x003b }
        L_0x00db:
            boolean r11 = r10.hasNext()     // Catch:{ a -> 0x003b }
            if (r11 == 0) goto L_0x00f1
            java.lang.Object r11 = r10.next()     // Catch:{ a -> 0x003b }
            sa.m r11 = (sa.m) r11     // Catch:{ a -> 0x003b }
            java.lang.Object r11 = r11.d()     // Catch:{ a -> 0x003b }
            w9.h r11 = (w9.h) r11     // Catch:{ a -> 0x003b }
            r6.add(r11)     // Catch:{ a -> 0x003b }
            goto L_0x00db
        L_0x00f1:
            r8.L$0 = r1     // Catch:{ a -> 0x003b }
            r10 = r21
            r8.L$1 = r10     // Catch:{ a -> 0x003b }
            r8.L$2 = r0     // Catch:{ a -> 0x003b }
            r8.label = r9     // Catch:{ a -> 0x003b }
            java.lang.Object r3 = r3.createUser(r4, r5, r6, r7, r8)     // Catch:{ a -> 0x003b }
            if (r3 != r2) goto L_0x0102
            return r2
        L_0x0102:
            r2 = r0
            r4 = r1
            r0 = r3
            r3 = r10
        L_0x0106:
            w9.a r0 = (w9.a) r0     // Catch:{ a -> 0x003b }
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap     // Catch:{ a -> 0x003b }
            r12.<init>()     // Catch:{ a -> 0x003b }
            java.util.Map r5 = r0.getIdentities()     // Catch:{ a -> 0x003b }
            java.lang.String r6 = "onesignal_id"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ a -> 0x003b }
            db.l.b(r5)     // Catch:{ a -> 0x003b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ a -> 0x003b }
            java.lang.String r6 = r3.getOnesignalId()     // Catch:{ a -> 0x003b }
            r12.put(r6, r5)     // Catch:{ a -> 0x003b }
            com.onesignal.user.internal.identity.b r6 = r4._identityModelStore     // Catch:{ a -> 0x003b }
            com.onesignal.common.modeling.g r6 = r6.getModel()     // Catch:{ a -> 0x003b }
            r13 = r6
            com.onesignal.user.internal.identity.a r13 = (com.onesignal.user.internal.identity.a) r13     // Catch:{ a -> 0x003b }
            com.onesignal.user.internal.properties.b r6 = r4._propertiesModelStore     // Catch:{ a -> 0x003b }
            com.onesignal.common.modeling.g r6 = r6.getModel()     // Catch:{ a -> 0x003b }
            com.onesignal.user.internal.properties.a r6 = (com.onesignal.user.internal.properties.a) r6     // Catch:{ a -> 0x003b }
            java.lang.String r7 = r13.getOnesignalId()     // Catch:{ a -> 0x003b }
            java.lang.String r8 = r3.getOnesignalId()     // Catch:{ a -> 0x003b }
            boolean r7 = db.l.a(r7, r8)     // Catch:{ a -> 0x003b }
            if (r7 == 0) goto L_0x0150
            java.lang.String r14 = "onesignal_id"
            java.lang.String r16 = "HYDRATE"
            r17 = 0
            r18 = 8
            r19 = 0
            r15 = r5
            com.onesignal.common.modeling.g.setStringProperty$default(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x003b }
        L_0x0150:
            java.lang.String r7 = r6.getOnesignalId()     // Catch:{ a -> 0x003b }
            java.lang.String r3 = r3.getOnesignalId()     // Catch:{ a -> 0x003b }
            boolean r3 = db.l.a(r7, r3)     // Catch:{ a -> 0x003b }
            if (r3 == 0) goto L_0x016d
            java.lang.String r14 = "onesignalId"
            java.lang.String r16 = "HYDRATE"
            r17 = 0
            r18 = 8
            r19 = 0
            r13 = r6
            r15 = r5
            com.onesignal.common.modeling.g.setStringProperty$default(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x003b }
        L_0x016d:
            int r3 = r2.size()     // Catch:{ a -> 0x003b }
            r5 = 0
        L_0x0172:
            if (r5 >= r3) goto L_0x01f4
            java.util.List r6 = r0.getSubscriptions()     // Catch:{ a -> 0x003b }
            int r6 = r6.size()     // Catch:{ a -> 0x003b }
            if (r5 < r6) goto L_0x017f
            goto L_0x01f4
        L_0x017f:
            java.util.List r6 = r0.getSubscriptions()     // Catch:{ a -> 0x003b }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ a -> 0x003b }
            w9.h r6 = (w9.h) r6     // Catch:{ a -> 0x003b }
            java.lang.Object r7 = r2.get(r5)     // Catch:{ a -> 0x003b }
            sa.m r7 = (sa.m) r7     // Catch:{ a -> 0x003b }
            java.lang.Object r7 = r7.c()     // Catch:{ a -> 0x003b }
            java.lang.String r8 = r6.getId()     // Catch:{ a -> 0x003b }
            db.l.b(r8)     // Catch:{ a -> 0x003b }
            r12.put(r7, r8)     // Catch:{ a -> 0x003b }
            com.onesignal.core.internal.config.b r7 = r4._configModelStore     // Catch:{ a -> 0x003b }
            com.onesignal.common.modeling.g r7 = r7.getModel()     // Catch:{ a -> 0x003b }
            com.onesignal.core.internal.config.a r7 = (com.onesignal.core.internal.config.a) r7     // Catch:{ a -> 0x003b }
            java.lang.String r7 = r7.getPushSubscriptionId()     // Catch:{ a -> 0x003b }
            java.lang.Object r8 = r2.get(r5)     // Catch:{ a -> 0x003b }
            sa.m r8 = (sa.m) r8     // Catch:{ a -> 0x003b }
            java.lang.Object r8 = r8.c()     // Catch:{ a -> 0x003b }
            boolean r7 = db.l.a(r7, r8)     // Catch:{ a -> 0x003b }
            if (r7 == 0) goto L_0x01c8
            com.onesignal.core.internal.config.b r7 = r4._configModelStore     // Catch:{ a -> 0x003b }
            com.onesignal.common.modeling.g r7 = r7.getModel()     // Catch:{ a -> 0x003b }
            com.onesignal.core.internal.config.a r7 = (com.onesignal.core.internal.config.a) r7     // Catch:{ a -> 0x003b }
            java.lang.String r8 = r6.getId()     // Catch:{ a -> 0x003b }
            r7.setPushSubscriptionId(r8)     // Catch:{ a -> 0x003b }
        L_0x01c8:
            com.onesignal.user.internal.subscriptions.e r7 = r4._subscriptionsModelStore     // Catch:{ a -> 0x003b }
            java.lang.Object r8 = r2.get(r5)     // Catch:{ a -> 0x003b }
            sa.m r8 = (sa.m) r8     // Catch:{ a -> 0x003b }
            java.lang.Object r8 = r8.c()     // Catch:{ a -> 0x003b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ a -> 0x003b }
            com.onesignal.common.modeling.g r7 = r7.get(r8)     // Catch:{ a -> 0x003b }
            r13 = r7
            com.onesignal.user.internal.subscriptions.d r13 = (com.onesignal.user.internal.subscriptions.d) r13     // Catch:{ a -> 0x003b }
            if (r13 == 0) goto L_0x01f0
            java.lang.String r14 = "id"
            java.lang.String r15 = r6.getId()     // Catch:{ a -> 0x003b }
            java.lang.String r16 = "HYDRATE"
            r17 = 0
            r18 = 8
            r19 = 0
            com.onesignal.common.modeling.g.setStringProperty$default(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x003b }
        L_0x01f0:
            int r5 = r5 + 1
            goto L_0x0172
        L_0x01f4:
            v7.a r0 = new v7.a     // Catch:{ a -> 0x003b }
            v7.b r11 = v7.b.SUCCESS     // Catch:{ a -> 0x003b }
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ a -> 0x003b }
            return r0
        L_0x0200:
            com.onesignal.common.k r2 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r2.getResponseStatusType(r0)
            int[] r2 = com.onesignal.user.internal.operations.impl.executors.d.b.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r9) goto L_0x0231
            r2 = 2
            if (r0 == r2) goto L_0x0224
            v7.a r0 = new v7.a
            v7.b r4 = v7.b.FAIL_PAUSE_OPREPO
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x023d
        L_0x0224:
            v7.a r0 = new v7.a
            v7.b r10 = v7.b.FAIL_UNAUTHORIZED
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x023d
        L_0x0231:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_RETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x023d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.d.createUser(com.onesignal.user.internal.operations.f, java.util.List, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object loginUser(com.onesignal.user.internal.operations.f r21, java.util.List<? extends v7.f> r22, va.d r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof com.onesignal.user.internal.operations.impl.executors.d.C0195d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.onesignal.user.internal.operations.impl.executors.d$d r4 = (com.onesignal.user.internal.operations.impl.executors.d.C0195d) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.onesignal.user.internal.operations.impl.executors.d$d r4 = new com.onesignal.user.internal.operations.impl.executors.d$d
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = wa.d.c()
            int r6 = r4.label
            r7 = 4
            r8 = 3
            r9 = 1
            r10 = 2
            if (r6 == 0) goto L_0x0062
            if (r6 == r9) goto L_0x005d
            if (r6 == r10) goto L_0x0048
            if (r6 == r8) goto L_0x0043
            if (r6 != r7) goto L_0x003b
            sa.o.b(r3)
            goto L_0x00f6
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            sa.o.b(r3)
            goto L_0x0121
        L_0x0048:
            java.lang.Object r1 = r4.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r4.L$1
            com.onesignal.user.internal.operations.f r2 = (com.onesignal.user.internal.operations.f) r2
            java.lang.Object r6 = r4.L$0
            com.onesignal.user.internal.operations.impl.executors.d r6 = (com.onesignal.user.internal.operations.impl.executors.d) r6
            sa.o.b(r3)
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x00a2
        L_0x005d:
            sa.o.b(r3)
            goto L_0x019c
        L_0x0062:
            sa.o.b(r3)
            java.lang.String r3 = r21.getExistingOnesignalId()
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = r21.getExternalId()
            if (r3 != 0) goto L_0x0073
            goto L_0x0193
        L_0x0073:
            com.onesignal.user.internal.operations.impl.executors.a r3 = r0._identityOperationExecutor
            com.onesignal.user.internal.operations.i r6 = new com.onesignal.user.internal.operations.i
            java.lang.String r11 = r21.getAppId()
            java.lang.String r12 = r21.getExistingOnesignalId()
            db.l.b(r12)
            java.lang.String r13 = r21.getExternalId()
            db.l.b(r13)
            java.lang.String r14 = "external_id"
            r6.<init>(r11, r12, r14, r13)
            java.util.List r6 = ta.n.b(r6)
            r4.L$0 = r0
            r4.L$1 = r1
            r4.L$2 = r2
            r4.label = r10
            java.lang.Object r3 = r3.execute(r6, r4)
            if (r3 != r5) goto L_0x00a1
            return r5
        L_0x00a1:
            r6 = r0
        L_0x00a2:
            v7.a r3 = (v7.a) r3
            v7.b r11 = r3.getResult()
            int[] r12 = com.onesignal.user.internal.operations.impl.executors.d.b.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r12[r11]
            if (r11 == r9) goto L_0x0122
            r9 = 34
            r12 = 0
            if (r11 == r10) goto L_0x00f7
            if (r11 == r8) goto L_0x00cc
            v7.a r1 = new v7.a
            v7.b r14 = r3.getResult()
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0192
        L_0x00cc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \""
            r3.append(r8)
            java.lang.String r8 = r1.getExternalId()
            r3.append(r8)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.onesignal.debug.internal.logging.a.error$default(r3, r12, r10, r12)
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.label = r7
            java.lang.Object r3 = r6.createUser(r1, r2, r4)
            if (r3 != r5) goto L_0x00f6
            return r5
        L_0x00f6:
            return r3
        L_0x00f7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \""
            r3.append(r7)
            java.lang.String r7 = r1.getExternalId()
            r3.append(r7)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r3, r12, r10, r12)
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.label = r8
            java.lang.Object r3 = r6.createUser(r1, r2, r4)
            if (r3 != r5) goto L_0x0121
            return r5
        L_0x0121:
            return r3
        L_0x0122:
            java.lang.String r2 = r1.getExistingOnesignalId()
            db.l.b(r2)
            com.onesignal.user.internal.identity.b r3 = r6._identityModelStore
            com.onesignal.common.modeling.g r3 = r3.getModel()
            com.onesignal.user.internal.identity.a r3 = (com.onesignal.user.internal.identity.a) r3
            java.lang.String r3 = r3.getOnesignalId()
            java.lang.String r4 = r1.getOnesignalId()
            boolean r3 = db.l.a(r3, r4)
            if (r3 == 0) goto L_0x0151
            com.onesignal.user.internal.identity.b r3 = r6._identityModelStore
            com.onesignal.common.modeling.g r7 = r3.getModel()
            java.lang.String r8 = "onesignal_id"
            java.lang.String r10 = "HYDRATE"
            r11 = 0
            r12 = 8
            r13 = 0
            r9 = r2
            com.onesignal.common.modeling.g.setStringProperty$default(r7, r8, r9, r10, r11, r12, r13)
        L_0x0151:
            com.onesignal.user.internal.properties.b r3 = r6._propertiesModelStore
            com.onesignal.common.modeling.g r3 = r3.getModel()
            com.onesignal.user.internal.properties.a r3 = (com.onesignal.user.internal.properties.a) r3
            java.lang.String r3 = r3.getOnesignalId()
            java.lang.String r4 = r1.getOnesignalId()
            boolean r3 = db.l.a(r3, r4)
            if (r3 == 0) goto L_0x0179
            com.onesignal.user.internal.properties.b r3 = r6._propertiesModelStore
            com.onesignal.common.modeling.g r4 = r3.getModel()
            java.lang.String r5 = "onesignalId"
            java.lang.String r7 = "HYDRATE"
            r8 = 0
            r9 = 8
            r10 = 0
            r6 = r2
            com.onesignal.common.modeling.g.setStringProperty$default(r4, r5, r6, r7, r8, r9, r10)
        L_0x0179:
            v7.a r3 = new v7.a
            v7.b r12 = v7.b.SUCCESS_STARTING_ONLY
            java.lang.String r1 = r1.getOnesignalId()
            sa.m r1 = sa.q.a(r1, r2)
            java.util.Map r13 = ta.e0.b(r1)
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1 = r3
        L_0x0192:
            return r1
        L_0x0193:
            r4.label = r9
            java.lang.Object r3 = r0.createUser(r1, r2, r4)
            if (r3 != r5) goto L_0x019c
            return r5
        L_0x019c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.d.loginUser(com.onesignal.user.internal.operations.f, java.util.List, va.d):java.lang.Object");
    }

    public Object execute(List<? extends v7.f> list, va.d dVar) {
        com.onesignal.debug.internal.logging.a.debug$default("LoginUserOperationExecutor(operation: " + list + ')', (Throwable) null, 2, (Object) null);
        v7.f fVar = (v7.f) w.w(list);
        if (fVar instanceof com.onesignal.user.internal.operations.f) {
            return loginUser((com.onesignal.user.internal.operations.f) fVar, list, dVar);
        }
        throw new Exception("Unrecognized operation: " + fVar);
    }

    public List<String> getOperations() {
        return n.b(LOGIN_USER);
    }

    private final Map<String, h> createSubscriptionsFromOperation(com.onesignal.user.internal.operations.c cVar, Map<String, h> map) {
        Map<String, h> n10 = f0.n(map);
        n10.remove(cVar.getSubscriptionId());
        return n10;
    }

    private final Map<String, h> createSubscriptionsFromOperation(o oVar, Map<String, h> map) {
        Map<String, h> map2 = map;
        Map<String, h> n10 = f0.n(map);
        if (n10.containsKey(oVar.getSubscriptionId())) {
            String subscriptionId = oVar.getSubscriptionId();
            String subscriptionId2 = oVar.getSubscriptionId();
            h hVar = map2.get(oVar.getSubscriptionId());
            l.b(hVar);
            i type = hVar.getType();
            h hVar2 = map2.get(oVar.getSubscriptionId());
            l.b(hVar2);
            String token = hVar2.getToken();
            h hVar3 = map2.get(oVar.getSubscriptionId());
            l.b(hVar3);
            Boolean enabled = hVar3.getEnabled();
            h hVar4 = map2.get(oVar.getSubscriptionId());
            l.b(hVar4);
            Integer notificationTypes = hVar4.getNotificationTypes();
            h hVar5 = map2.get(oVar.getSubscriptionId());
            l.b(hVar5);
            String sdk = hVar5.getSdk();
            h hVar6 = map2.get(oVar.getSubscriptionId());
            l.b(hVar6);
            String deviceModel = hVar6.getDeviceModel();
            h hVar7 = map2.get(oVar.getSubscriptionId());
            l.b(hVar7);
            String deviceOS = hVar7.getDeviceOS();
            h hVar8 = map2.get(oVar.getSubscriptionId());
            l.b(hVar8);
            Boolean rooted = hVar8.getRooted();
            h hVar9 = map2.get(oVar.getSubscriptionId());
            l.b(hVar9);
            Integer netType = hVar9.getNetType();
            h hVar10 = map2.get(oVar.getSubscriptionId());
            l.b(hVar10);
            String carrier = hVar10.getCarrier();
            h hVar11 = map2.get(oVar.getSubscriptionId());
            l.b(hVar11);
            h hVar12 = r3;
            h hVar13 = new h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion());
            n10.put(subscriptionId, hVar12);
        } else {
            String subscriptionId3 = oVar.getSubscriptionId();
            h hVar14 = r2;
            h hVar15 = new h(oVar.getSubscriptionId(), (i) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, 4094, (g) null);
            n10.put(subscriptionId3, hVar14);
        }
        return n10;
    }

    private final Map<String, h> createSubscriptionsFromOperation(p pVar, Map<String, h> map) {
        Map<String, h> map2 = map;
        Map<String, h> n10 = f0.n(map);
        if (n10.containsKey(pVar.getSubscriptionId())) {
            String subscriptionId = pVar.getSubscriptionId();
            h hVar = map2.get(pVar.getSubscriptionId());
            l.b(hVar);
            String id = hVar.getId();
            h hVar2 = map2.get(pVar.getSubscriptionId());
            l.b(hVar2);
            i type = hVar2.getType();
            String address = pVar.getAddress();
            Boolean valueOf = Boolean.valueOf(pVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(pVar.getStatus().getValue());
            h hVar3 = map2.get(pVar.getSubscriptionId());
            l.b(hVar3);
            String sdk = hVar3.getSdk();
            h hVar4 = map2.get(pVar.getSubscriptionId());
            l.b(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            h hVar5 = map2.get(pVar.getSubscriptionId());
            l.b(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            h hVar6 = map2.get(pVar.getSubscriptionId());
            l.b(hVar6);
            Boolean rooted = hVar6.getRooted();
            h hVar7 = map2.get(pVar.getSubscriptionId());
            l.b(hVar7);
            Integer netType = hVar7.getNetType();
            h hVar8 = map2.get(pVar.getSubscriptionId());
            l.b(hVar8);
            String carrier = hVar8.getCarrier();
            h hVar9 = map2.get(pVar.getSubscriptionId());
            l.b(hVar9);
            h hVar10 = r3;
            h hVar11 = new h(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion());
            n10.put(subscriptionId, hVar10);
        }
        return n10;
    }
}
