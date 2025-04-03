package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.k;
import com.onesignal.user.internal.operations.o;
import com.onesignal.user.internal.operations.p;
import db.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w9.i;

public final class g implements v7.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a((db.g) null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final l7.f _applicationService;
    private final x9.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;
    private final w9.c _subscriptionBackend;
    private final com.onesignal.user.internal.subscriptions.e _subscriptionModelStore;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[k.a.values().length];
            iArr[k.a.RETRYABLE.ordinal()] = 1;
            iArr[k.a.CONFLICT.ordinal()] = 2;
            iArr[k.a.INVALID.ordinal()] = 3;
            iArr[k.a.UNAUTHORIZED.ordinal()] = 4;
            iArr[k.a.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.onesignal.user.internal.subscriptions.g.values().length];
            iArr2[com.onesignal.user.internal.subscriptions.g.SMS.ordinal()] = 1;
            iArr2[com.onesignal.user.internal.subscriptions.g.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createSubscription((com.onesignal.user.internal.operations.a) null, (List<? extends v7.f>) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.deleteSubscription((com.onesignal.user.internal.operations.c) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transferSubscription((o) null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateSubscription((p) null, (List<? extends v7.f>) null, this);
        }
    }

    public g(w9.c cVar, q7.a aVar, l7.f fVar, com.onesignal.user.internal.subscriptions.e eVar, com.onesignal.core.internal.config.b bVar, x9.a aVar2) {
        l.e(cVar, "_subscriptionBackend");
        l.e(aVar, "_deviceService");
        l.e(fVar, "_applicationService");
        l.e(eVar, "_subscriptionModelStore");
        l.e(bVar, "_configModelStore");
        l.e(aVar2, "_buildUserService");
        this._subscriptionBackend = cVar;
        this._deviceService = aVar;
        this._applicationService = fVar;
        this._subscriptionModelStore = eVar;
        this._configModelStore = bVar;
        this._buildUserService = aVar2;
    }

    private final i convert(com.onesignal.user.internal.subscriptions.g gVar) {
        int i10 = b.$EnumSwitchMapping$1[gVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? i.Companion.fromDeviceType(this._deviceService.getDeviceType()) : i.EMAIL;
        }
        return i.SMS;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: com.onesignal.user.internal.operations.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.onesignal.user.internal.operations.impl.executors.g} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012f A[Catch:{ a -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013d A[Catch:{ a -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createSubscription(com.onesignal.user.internal.operations.a r25, java.util.List<? extends v7.f> r26, va.d r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r27
            boolean r3 = r2 instanceof com.onesignal.user.internal.operations.impl.executors.g.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.onesignal.user.internal.operations.impl.executors.g$c r3 = (com.onesignal.user.internal.operations.impl.executors.g.c) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.onesignal.user.internal.operations.impl.executors.g$c r3 = new com.onesignal.user.internal.operations.impl.executors.g$c
            r3.<init>(r1, r2)
        L_0x001e:
            r9 = r3
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r9.label
            r10 = 1
            if (r4 == 0) goto L_0x0049
            if (r4 != r10) goto L_0x0041
            java.lang.Object r0 = r9.L$1
            r3 = r0
            com.onesignal.user.internal.operations.a r3 = (com.onesignal.user.internal.operations.a) r3
            java.lang.Object r0 = r9.L$0
            r4 = r0
            com.onesignal.user.internal.operations.impl.executors.g r4 = (com.onesignal.user.internal.operations.impl.executors.g) r4
            sa.o.b(r2)     // Catch:{ a -> 0x003d }
            r0 = r2
            r2 = r3
            goto L_0x012b
        L_0x003d:
            r0 = move-exception
            r2 = r3
            goto L_0x019b
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0049:
            sa.o.b(r2)
            boolean r2 = r0 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L_0x0059
            boolean r2 = r26.isEmpty()
            if (r2 == 0) goto L_0x0059
        L_0x0057:
            r2 = 0
            goto L_0x006e
        L_0x0059:
            java.util.Iterator r2 = r26.iterator()
        L_0x005d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0057
            java.lang.Object r5 = r2.next()
            v7.f r5 = (v7.f) r5
            boolean r5 = r5 instanceof com.onesignal.user.internal.operations.c
            if (r5 == 0) goto L_0x005d
            r2 = 1
        L_0x006e:
            if (r2 == 0) goto L_0x007e
            v7.a r0 = new v7.a
            v7.b r12 = v7.b.SUCCESS
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            return r0
        L_0x007e:
            int r2 = r26.size()
            java.util.ListIterator r0 = r0.listIterator(r2)
        L_0x0086:
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r0.previous()
            r5 = r2
            v7.f r5 = (v7.f) r5
            boolean r5 = r5 instanceof com.onesignal.user.internal.operations.p
            if (r5 == 0) goto L_0x0086
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            com.onesignal.user.internal.operations.p r2 = (com.onesignal.user.internal.operations.p) r2
            if (r2 == 0) goto L_0x00a2
            boolean r0 = r2.getEnabled()
            goto L_0x00a6
        L_0x00a2:
            boolean r0 = r25.getEnabled()
        L_0x00a6:
            if (r2 == 0) goto L_0x00ae
            java.lang.String r5 = r2.getAddress()
            if (r5 != 0) goto L_0x00b2
        L_0x00ae:
            java.lang.String r5 = r25.getAddress()
        L_0x00b2:
            r14 = r5
            if (r2 == 0) goto L_0x00bb
            com.onesignal.user.internal.subscriptions.f r2 = r2.getStatus()
            if (r2 != 0) goto L_0x00bf
        L_0x00bb:
            com.onesignal.user.internal.subscriptions.f r2 = r25.getStatus()
        L_0x00bf:
            w9.h r8 = new w9.h     // Catch:{ a -> 0x0197 }
            r12 = 0
            com.onesignal.user.internal.subscriptions.g r5 = r25.getType()     // Catch:{ a -> 0x0197 }
            w9.i r13 = r1.convert(r5)     // Catch:{ a -> 0x0197 }
            if (r0 == 0) goto L_0x00cd
            r4 = 1
        L_0x00cd:
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ a -> 0x0197 }
            int r0 = r2.getValue()     // Catch:{ a -> 0x0197 }
            java.lang.Integer r16 = kotlin.coroutines.jvm.internal.b.c(r0)     // Catch:{ a -> 0x0197 }
            java.lang.String r17 = "050100"
            java.lang.String r18 = android.os.Build.MODEL     // Catch:{ a -> 0x0197 }
            java.lang.String r19 = android.os.Build.VERSION.RELEASE     // Catch:{ a -> 0x0197 }
            com.onesignal.common.n r0 = com.onesignal.common.n.INSTANCE     // Catch:{ a -> 0x0197 }
            boolean r0 = r0.isRooted()     // Catch:{ a -> 0x0197 }
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.b.a(r0)     // Catch:{ a -> 0x0197 }
            com.onesignal.common.g r0 = com.onesignal.common.g.INSTANCE     // Catch:{ a -> 0x0197 }
            l7.f r2 = r1._applicationService     // Catch:{ a -> 0x0197 }
            android.content.Context r2 = r2.getAppContext()     // Catch:{ a -> 0x0197 }
            java.lang.Integer r21 = r0.getNetType(r2)     // Catch:{ a -> 0x0197 }
            l7.f r2 = r1._applicationService     // Catch:{ a -> 0x0197 }
            android.content.Context r2 = r2.getAppContext()     // Catch:{ a -> 0x0197 }
            java.lang.String r22 = r0.getCarrierName(r2)     // Catch:{ a -> 0x0197 }
            com.onesignal.common.AndroidUtils r0 = com.onesignal.common.AndroidUtils.INSTANCE     // Catch:{ a -> 0x0197 }
            l7.f r2 = r1._applicationService     // Catch:{ a -> 0x0197 }
            android.content.Context r2 = r2.getAppContext()     // Catch:{ a -> 0x0197 }
            java.lang.String r23 = r0.getAppVersion(r2)     // Catch:{ a -> 0x0197 }
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ a -> 0x0197 }
            w9.c r4 = r1._subscriptionBackend     // Catch:{ a -> 0x0197 }
            java.lang.String r5 = r25.getAppId()     // Catch:{ a -> 0x0197 }
            java.lang.String r6 = "onesignal_id"
            java.lang.String r7 = r25.getOnesignalId()     // Catch:{ a -> 0x0197 }
            r9.L$0 = r1     // Catch:{ a -> 0x0197 }
            r2 = r25
            r9.L$1 = r2     // Catch:{ a -> 0x0195 }
            r9.label = r10     // Catch:{ a -> 0x0195 }
            java.lang.Object r0 = r4.createSubscription(r5, r6, r7, r8, r9)     // Catch:{ a -> 0x0195 }
            if (r0 != r3) goto L_0x012a
            return r3
        L_0x012a:
            r4 = r1
        L_0x012b:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ a -> 0x0193 }
            if (r0 != 0) goto L_0x013d
            v7.a r0 = new v7.a     // Catch:{ a -> 0x0193 }
            v7.b r12 = v7.b.SUCCESS     // Catch:{ a -> 0x0193 }
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ a -> 0x0193 }
            return r0
        L_0x013d:
            com.onesignal.user.internal.subscriptions.e r3 = r4._subscriptionModelStore     // Catch:{ a -> 0x0193 }
            java.lang.String r5 = r2.getSubscriptionId()     // Catch:{ a -> 0x0193 }
            com.onesignal.common.modeling.g r3 = r3.get(r5)     // Catch:{ a -> 0x0193 }
            r11 = r3
            com.onesignal.user.internal.subscriptions.d r11 = (com.onesignal.user.internal.subscriptions.d) r11     // Catch:{ a -> 0x0193 }
            if (r11 == 0) goto L_0x0159
            java.lang.String r12 = "id"
            java.lang.String r14 = "HYDRATE"
            r15 = 0
            r16 = 8
            r17 = 0
            r13 = r0
            com.onesignal.common.modeling.g.setStringProperty$default(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ a -> 0x0193 }
        L_0x0159:
            com.onesignal.core.internal.config.b r3 = r4._configModelStore     // Catch:{ a -> 0x0193 }
            com.onesignal.common.modeling.g r3 = r3.getModel()     // Catch:{ a -> 0x0193 }
            com.onesignal.core.internal.config.a r3 = (com.onesignal.core.internal.config.a) r3     // Catch:{ a -> 0x0193 }
            java.lang.String r3 = r3.getPushSubscriptionId()     // Catch:{ a -> 0x0193 }
            java.lang.String r5 = r2.getSubscriptionId()     // Catch:{ a -> 0x0193 }
            boolean r3 = db.l.a(r3, r5)     // Catch:{ a -> 0x0193 }
            if (r3 == 0) goto L_0x017a
            com.onesignal.core.internal.config.b r3 = r4._configModelStore     // Catch:{ a -> 0x0193 }
            com.onesignal.common.modeling.g r3 = r3.getModel()     // Catch:{ a -> 0x0193 }
            com.onesignal.core.internal.config.a r3 = (com.onesignal.core.internal.config.a) r3     // Catch:{ a -> 0x0193 }
            r3.setPushSubscriptionId(r0)     // Catch:{ a -> 0x0193 }
        L_0x017a:
            v7.a r3 = new v7.a     // Catch:{ a -> 0x0193 }
            v7.b r12 = v7.b.SUCCESS     // Catch:{ a -> 0x0193 }
            java.lang.String r5 = r2.getSubscriptionId()     // Catch:{ a -> 0x0193 }
            sa.m r0 = sa.q.a(r5, r0)     // Catch:{ a -> 0x0193 }
            java.util.Map r13 = ta.e0.b(r0)     // Catch:{ a -> 0x0193 }
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ a -> 0x0193 }
            return r3
        L_0x0193:
            r0 = move-exception
            goto L_0x019b
        L_0x0195:
            r0 = move-exception
            goto L_0x019a
        L_0x0197:
            r0 = move-exception
            r2 = r25
        L_0x019a:
            r4 = r1
        L_0x019b:
            com.onesignal.common.k r3 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r3.getResponseStatusType(r0)
            int[] r3 = com.onesignal.user.internal.operations.impl.executors.g.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r10) goto L_0x0202
            r3 = 2
            if (r0 == r3) goto L_0x01f5
            r3 = 3
            if (r0 == r3) goto L_0x01f5
            r3 = 4
            if (r0 == r3) goto L_0x01e8
            r3 = 5
            if (r0 != r3) goto L_0x01e2
            x9.a r0 = r4._buildUserService
            java.lang.String r3 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
            java.util.List r7 = r0.getRebuildOperationsIfCurrentUser(r3, r2)
            v7.a r0 = new v7.a
            if (r7 != 0) goto L_0x01d8
            v7.b r9 = v7.b.FAIL_NORETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            return r0
        L_0x01d8:
            v7.b r5 = v7.b.FAIL_RETRY
            r6 = 0
            r8 = 2
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x01e2:
            sa.l r0 = new sa.l
            r0.<init>()
            throw r0
        L_0x01e8:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_UNAUTHORIZED
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x020e
        L_0x01f5:
            v7.a r0 = new v7.a
            v7.b r9 = v7.b.FAIL_NORETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x020e
        L_0x0202:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_RETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x020e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.g.createSubscription(com.onesignal.user.internal.operations.a, java.util.List, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object deleteSubscription(com.onesignal.user.internal.operations.c r13, va.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.onesignal.user.internal.operations.impl.executors.g.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.user.internal.operations.impl.executors.g$d r0 = (com.onesignal.user.internal.operations.impl.executors.g.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.operations.impl.executors.g$d r0 = new com.onesignal.user.internal.operations.impl.executors.g$d
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r13 = r0.L$1
            com.onesignal.user.internal.operations.c r13 = (com.onesignal.user.internal.operations.c) r13
            java.lang.Object r0 = r0.L$0
            com.onesignal.user.internal.operations.impl.executors.g r0 = (com.onesignal.user.internal.operations.impl.executors.g) r0
            sa.o.b(r14)     // Catch:{ a -> 0x006c }
            goto L_0x0054
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            sa.o.b(r14)
            w9.c r14 = r12._subscriptionBackend     // Catch:{ a -> 0x006c }
            java.lang.String r2 = r13.getAppId()     // Catch:{ a -> 0x006c }
            java.lang.String r4 = r13.getSubscriptionId()     // Catch:{ a -> 0x006c }
            r0.L$0 = r12     // Catch:{ a -> 0x006c }
            r0.L$1 = r13     // Catch:{ a -> 0x006c }
            r0.label = r3     // Catch:{ a -> 0x006c }
            java.lang.Object r14 = r14.deleteSubscription(r2, r4, r0)     // Catch:{ a -> 0x006c }
            if (r14 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r12
        L_0x0054:
            com.onesignal.user.internal.subscriptions.e r14 = r0._subscriptionModelStore     // Catch:{ a -> 0x006c }
            java.lang.String r13 = r13.getSubscriptionId()     // Catch:{ a -> 0x006c }
            java.lang.String r0 = "HYDRATE"
            r14.remove(r13, r0)     // Catch:{ a -> 0x006c }
            v7.a r13 = new v7.a
            v7.b r5 = v7.b.SUCCESS
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return r13
        L_0x006c:
            r13 = move-exception
            com.onesignal.common.k r14 = com.onesignal.common.k.INSTANCE
            int r13 = r13.getStatusCode()
            com.onesignal.common.k$a r13 = r14.getResponseStatusType(r13)
            int[] r14 = com.onesignal.user.internal.operations.impl.executors.g.b.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
            if (r13 == r3) goto L_0x009e
            r14 = 5
            if (r13 == r14) goto L_0x0091
            v7.a r13 = new v7.a
            v7.b r1 = v7.b.FAIL_NORETRY
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00aa
        L_0x0091:
            v7.a r13 = new v7.a
            v7.b r7 = v7.b.SUCCESS
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00aa
        L_0x009e:
            v7.a r13 = new v7.a
            v7.b r1 = v7.b.FAIL_RETRY
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x00aa:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.g.deleteSubscription(com.onesignal.user.internal.operations.c, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object transferSubscription(com.onesignal.user.internal.operations.o r13, va.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.onesignal.user.internal.operations.impl.executors.g.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.user.internal.operations.impl.executors.g$e r0 = (com.onesignal.user.internal.operations.impl.executors.g.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.operations.impl.executors.g$e r0 = new com.onesignal.user.internal.operations.impl.executors.g$e
            r0.<init>(r12, r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r7) goto L_0x002c
            sa.o.b(r14)     // Catch:{ a -> 0x002a }
            goto L_0x0050
        L_0x002a:
            r13 = move-exception
            goto L_0x005d
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0034:
            sa.o.b(r14)
            w9.c r1 = r12._subscriptionBackend     // Catch:{ a -> 0x002a }
            java.lang.String r2 = r13.getAppId()     // Catch:{ a -> 0x002a }
            java.lang.String r3 = r13.getSubscriptionId()     // Catch:{ a -> 0x002a }
            java.lang.String r4 = "onesignal_id"
            java.lang.String r5 = r13.getOnesignalId()     // Catch:{ a -> 0x002a }
            r6.label = r7     // Catch:{ a -> 0x002a }
            java.lang.Object r13 = r1.transferSubscription(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x002a }
            if (r13 != r0) goto L_0x0050
            return r0
        L_0x0050:
            v7.a r13 = new v7.a
            v7.b r2 = v7.b.SUCCESS
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x005d:
            com.onesignal.common.k r14 = com.onesignal.common.k.INSTANCE
            int r13 = r13.getStatusCode()
            com.onesignal.common.k$a r13 = r14.getResponseStatusType(r13)
            int[] r14 = com.onesignal.user.internal.operations.impl.executors.g.b.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
            if (r13 != r7) goto L_0x007e
            v7.a r13 = new v7.a
            v7.b r1 = v7.b.FAIL_RETRY
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x008a
        L_0x007e:
            v7.a r13 = new v7.a
            v7.b r7 = v7.b.FAIL_NORETRY
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x008a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.g.transferSubscription(com.onesignal.user.internal.operations.o, va.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.onesignal.user.internal.operations.p} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSubscription(com.onesignal.user.internal.operations.p r20, java.util.List<? extends v7.f> r21, va.d r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r22
            boolean r2 = r0 instanceof com.onesignal.user.internal.operations.impl.executors.g.f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.user.internal.operations.impl.executors.g$f r2 = (com.onesignal.user.internal.operations.impl.executors.g.f) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.user.internal.operations.impl.executors.g$f r2 = new com.onesignal.user.internal.operations.impl.executors.g$f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            java.lang.Object r2 = r2.L$0
            com.onesignal.user.internal.operations.p r2 = (com.onesignal.user.internal.operations.p) r2
            sa.o.b(r0)     // Catch:{ a -> 0x0032 }
            goto L_0x00bb
        L_0x0032:
            r0 = move-exception
            goto L_0x00ca
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            sa.o.b(r0)
            java.lang.Object r0 = ta.w.E(r21)
            java.lang.String r4 = "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation"
            db.l.c(r0, r4)
            r4 = r0
            com.onesignal.user.internal.operations.p r4 = (com.onesignal.user.internal.operations.p) r4
            w9.h r0 = new w9.h     // Catch:{ a -> 0x00c8 }
            r7 = 0
            com.onesignal.user.internal.subscriptions.g r6 = r4.getType()     // Catch:{ a -> 0x00c8 }
            w9.i r8 = r1.convert(r6)     // Catch:{ a -> 0x00c8 }
            java.lang.String r9 = r4.getAddress()     // Catch:{ a -> 0x00c8 }
            boolean r6 = r4.getEnabled()     // Catch:{ a -> 0x00c8 }
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch:{ a -> 0x00c8 }
            com.onesignal.user.internal.subscriptions.f r6 = r4.getStatus()     // Catch:{ a -> 0x00c8 }
            int r6 = r6.getValue()     // Catch:{ a -> 0x00c8 }
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.c(r6)     // Catch:{ a -> 0x00c8 }
            java.lang.String r12 = "050100"
            java.lang.String r13 = android.os.Build.MODEL     // Catch:{ a -> 0x00c8 }
            java.lang.String r14 = android.os.Build.VERSION.RELEASE     // Catch:{ a -> 0x00c8 }
            com.onesignal.common.n r6 = com.onesignal.common.n.INSTANCE     // Catch:{ a -> 0x00c8 }
            boolean r6 = r6.isRooted()     // Catch:{ a -> 0x00c8 }
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch:{ a -> 0x00c8 }
            com.onesignal.common.g r6 = com.onesignal.common.g.INSTANCE     // Catch:{ a -> 0x00c8 }
            l7.f r5 = r1._applicationService     // Catch:{ a -> 0x00c8 }
            android.content.Context r5 = r5.getAppContext()     // Catch:{ a -> 0x00c8 }
            java.lang.Integer r16 = r6.getNetType(r5)     // Catch:{ a -> 0x00c8 }
            l7.f r5 = r1._applicationService     // Catch:{ a -> 0x00c8 }
            android.content.Context r5 = r5.getAppContext()     // Catch:{ a -> 0x00c8 }
            java.lang.String r17 = r6.getCarrierName(r5)     // Catch:{ a -> 0x00c8 }
            com.onesignal.common.AndroidUtils r5 = com.onesignal.common.AndroidUtils.INSTANCE     // Catch:{ a -> 0x00c8 }
            l7.f r6 = r1._applicationService     // Catch:{ a -> 0x00c8 }
            android.content.Context r6 = r6.getAppContext()     // Catch:{ a -> 0x00c8 }
            java.lang.String r18 = r5.getAppVersion(r6)     // Catch:{ a -> 0x00c8 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ a -> 0x00c8 }
            w9.c r5 = r1._subscriptionBackend     // Catch:{ a -> 0x00c8 }
            java.lang.String r6 = r4.getAppId()     // Catch:{ a -> 0x00c8 }
            java.lang.String r7 = r4.getSubscriptionId()     // Catch:{ a -> 0x00c8 }
            r2.L$0 = r4     // Catch:{ a -> 0x00c8 }
            r8 = 1
            r2.label = r8     // Catch:{ a -> 0x00c8 }
            java.lang.Object r0 = r5.updateSubscription(r6, r7, r0, r2)     // Catch:{ a -> 0x00c8 }
            if (r0 != r3) goto L_0x00bb
            return r3
        L_0x00bb:
            v7.a r0 = new v7.a
            v7.b r5 = v7.b.SUCCESS
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x00c8:
            r0 = move-exception
            r2 = r4
        L_0x00ca:
            com.onesignal.common.k r3 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r3.getResponseStatusType(r0)
            int[] r3 = com.onesignal.user.internal.operations.impl.executors.g.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L_0x0121
            r3 = 5
            if (r0 == r3) goto L_0x00ef
            v7.a r0 = new v7.a
            v7.b r5 = v7.b.FAIL_NORETRY
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x012d
        L_0x00ef:
            v7.a r0 = new v7.a
            v7.b r11 = v7.b.FAIL_NORETRY
            r12 = 0
            com.onesignal.user.internal.operations.a r13 = new com.onesignal.user.internal.operations.a
            java.lang.String r4 = r2.getAppId()
            java.lang.String r5 = r2.getOnesignalId()
            java.lang.String r6 = r2.getSubscriptionId()
            com.onesignal.user.internal.subscriptions.g r7 = r2.getType()
            boolean r8 = r2.getEnabled()
            java.lang.String r9 = r2.getAddress()
            com.onesignal.user.internal.subscriptions.f r10 = r2.getStatus()
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.List r13 = ta.n.b(r13)
            r14 = 2
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x012d
        L_0x0121:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_RETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x012d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.g.updateSubscription(com.onesignal.user.internal.operations.p, java.util.List, va.d):java.lang.Object");
    }

    public Object execute(List<? extends v7.f> list, va.d dVar) {
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "SubscriptionOperationExecutor(operations: " + list + ')');
        v7.f fVar = (v7.f) w.w(list);
        if (fVar instanceof com.onesignal.user.internal.operations.a) {
            return createSubscription((com.onesignal.user.internal.operations.a) fVar, list, dVar);
        }
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((v7.f) it.next()) instanceof com.onesignal.user.internal.operations.c) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z10) {
            for (T next : list) {
                if (((v7.f) next) instanceof com.onesignal.user.internal.operations.c) {
                    l.c(next, "null cannot be cast to non-null type com.onesignal.user.internal.operations.DeleteSubscriptionOperation");
                    return deleteSubscription((com.onesignal.user.internal.operations.c) next, dVar);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else if (fVar instanceof p) {
            return updateSubscription((p) fVar, list, dVar);
        } else {
            if (fVar instanceof o) {
                return transferSubscription((o) fVar, dVar);
            }
            throw new Exception("Unrecognized operation: " + fVar);
        }
    }

    public List<String> getOperations() {
        return o.g(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
