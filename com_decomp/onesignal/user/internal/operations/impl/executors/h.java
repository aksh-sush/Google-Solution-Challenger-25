package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.k;
import db.g;
import db.l;
import java.util.List;
import v7.d;
import v7.f;

public final class h implements d {
    public static final a Companion = new a((g) null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final x9.a _buildUserService;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
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

        static {
            int[] iArr = new int[k.a.values().length];
            iArr[k.a.RETRYABLE.ordinal()] = 1;
            iArr[k.a.UNAUTHORIZED.ordinal()] = 2;
            iArr[k.a.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute((List<? extends f>) null, this);
        }
    }

    public h(w9.d dVar, com.onesignal.user.internal.identity.b bVar, com.onesignal.user.internal.properties.b bVar2, x9.a aVar) {
        l.e(dVar, "_userBackend");
        l.e(bVar, "_identityModelStore");
        l.e(bVar2, "_propertiesModelStore");
        l.e(aVar, "_buildUserService");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._buildUserService = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023f A[Catch:{ a -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute(java.util.List<? extends v7.f> r23, va.d r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            boolean r3 = r2 instanceof com.onesignal.user.internal.operations.impl.executors.h.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.onesignal.user.internal.operations.impl.executors.h$c r3 = (com.onesignal.user.internal.operations.impl.executors.h.c) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.onesignal.user.internal.operations.impl.executors.h$c r3 = new com.onesignal.user.internal.operations.impl.executors.h$c
            r3.<init>(r1, r2)
        L_0x001e:
            r11 = r3
            java.lang.Object r2 = r11.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r11.label
            r12 = 1
            if (r4 == 0) goto L_0x004e
            if (r4 != r12) goto L_0x0046
            java.lang.Object r0 = r11.L$3
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r11.L$2
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r11.L$0
            com.onesignal.user.internal.operations.impl.executors.h r5 = (com.onesignal.user.internal.operations.impl.executors.h) r5
            sa.o.b(r2)     // Catch:{ a -> 0x0043 }
            goto L_0x022d
        L_0x0043:
            r0 = move-exception
            goto L_0x02bc
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            sa.o.b(r2)
            c8.b r2 = c8.b.DEBUG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "UpdateUserOperationExecutor(operation: "
            r4.append(r5)
            r4.append(r0)
            r5 = 41
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.onesignal.debug.internal.logging.a.log(r2, r4)
            w9.f r2 = new w9.f
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 63
            r21 = 0
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            w9.e r13 = new w9.e
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.Iterator r4 = r23.iterator()
            r8 = r2
            r2 = r6
            r10 = r13
            r13 = r2
            r6 = 0
        L_0x0096:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0208
            java.lang.Object r7 = r4.next()
            v7.f r7 = (v7.f) r7
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.k
            if (r9 == 0) goto L_0x00bc
            if (r13 != 0) goto L_0x00b3
            r2 = r7
            com.onesignal.user.internal.operations.k r2 = (com.onesignal.user.internal.operations.k) r2
            java.lang.String r13 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
        L_0x00b3:
            com.onesignal.user.internal.operations.impl.executors.e r9 = com.onesignal.user.internal.operations.impl.executors.e.INSTANCE
            com.onesignal.user.internal.operations.k r7 = (com.onesignal.user.internal.operations.k) r7
            w9.f r8 = r9.createPropertiesFromOperation((com.onesignal.user.internal.operations.k) r7, (w9.f) r8)
            goto L_0x0096
        L_0x00bc:
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.d
            if (r9 == 0) goto L_0x00d6
            if (r13 != 0) goto L_0x00cd
            r2 = r7
            com.onesignal.user.internal.operations.d r2 = (com.onesignal.user.internal.operations.d) r2
            java.lang.String r13 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
        L_0x00cd:
            com.onesignal.user.internal.operations.impl.executors.e r9 = com.onesignal.user.internal.operations.impl.executors.e.INSTANCE
            com.onesignal.user.internal.operations.d r7 = (com.onesignal.user.internal.operations.d) r7
            w9.f r8 = r9.createPropertiesFromOperation((com.onesignal.user.internal.operations.d) r7, (w9.f) r8)
            goto L_0x0096
        L_0x00d6:
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.j
            if (r9 == 0) goto L_0x00f0
            if (r13 != 0) goto L_0x00e7
            r2 = r7
            com.onesignal.user.internal.operations.j r2 = (com.onesignal.user.internal.operations.j) r2
            java.lang.String r13 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
        L_0x00e7:
            com.onesignal.user.internal.operations.impl.executors.e r9 = com.onesignal.user.internal.operations.impl.executors.e.INSTANCE
            com.onesignal.user.internal.operations.j r7 = (com.onesignal.user.internal.operations.j) r7
            w9.f r8 = r9.createPropertiesFromOperation((com.onesignal.user.internal.operations.j) r7, (w9.f) r8)
            goto L_0x0096
        L_0x00f0:
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.n
            if (r9 == 0) goto L_0x012d
            if (r13 != 0) goto L_0x0100
            com.onesignal.user.internal.operations.n r7 = (com.onesignal.user.internal.operations.n) r7
            java.lang.String r13 = r7.getAppId()
            java.lang.String r2 = r7.getOnesignalId()
        L_0x0100:
            java.lang.Integer r6 = r10.getSessionCount()
            if (r6 == 0) goto L_0x0113
            java.lang.Integer r6 = r10.getSessionCount()
            db.l.b(r6)
            int r6 = r6.intValue()
            int r6 = r6 + r12
            goto L_0x0114
        L_0x0113:
            r6 = 1
        L_0x0114:
            w9.e r7 = new w9.e
            java.lang.Long r9 = r10.getSessionTime()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.c(r6)
            java.math.BigDecimal r14 = r10.getAmountSpent()
            java.util.List r10 = r10.getPurchases()
            r7.<init>(r9, r6, r14, r10)
            r10 = r7
            r6 = 1
            goto L_0x0096
        L_0x012d:
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.m
            if (r9 == 0) goto L_0x0176
            if (r13 != 0) goto L_0x013e
            r2 = r7
            com.onesignal.user.internal.operations.m r2 = (com.onesignal.user.internal.operations.m) r2
            java.lang.String r13 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
        L_0x013e:
            java.lang.Long r9 = r10.getSessionTime()
            if (r9 == 0) goto L_0x0158
            java.lang.Long r9 = r10.getSessionTime()
            db.l.b(r9)
            long r14 = r9.longValue()
            com.onesignal.user.internal.operations.m r7 = (com.onesignal.user.internal.operations.m) r7
            long r16 = r7.getSessionTime()
            long r14 = r14 + r16
            goto L_0x015e
        L_0x0158:
            com.onesignal.user.internal.operations.m r7 = (com.onesignal.user.internal.operations.m) r7
            long r14 = r7.getSessionTime()
        L_0x015e:
            w9.e r7 = new w9.e
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.d(r14)
            java.lang.Integer r14 = r10.getSessionCount()
            java.math.BigDecimal r15 = r10.getAmountSpent()
            java.util.List r10 = r10.getPurchases()
            r7.<init>(r9, r14, r15, r10)
            r10 = r7
            goto L_0x0096
        L_0x0176:
            boolean r9 = r7 instanceof com.onesignal.user.internal.operations.l
            if (r9 == 0) goto L_0x0096
            if (r13 != 0) goto L_0x0187
            r2 = r7
            com.onesignal.user.internal.operations.l r2 = (com.onesignal.user.internal.operations.l) r2
            java.lang.String r13 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
        L_0x0187:
            java.math.BigDecimal r9 = r10.getAmountSpent()
            if (r9 == 0) goto L_0x01a5
            java.math.BigDecimal r9 = r10.getAmountSpent()
            db.l.b(r9)
            r14 = r7
            com.onesignal.user.internal.operations.l r14 = (com.onesignal.user.internal.operations.l) r14
            java.math.BigDecimal r14 = r14.getAmountSpent()
            java.math.BigDecimal r9 = r9.add(r14)
            java.lang.String r14 = "this.add(other)"
            db.l.d(r9, r14)
            goto L_0x01ac
        L_0x01a5:
            r9 = r7
            com.onesignal.user.internal.operations.l r9 = (com.onesignal.user.internal.operations.l) r9
            java.math.BigDecimal r9 = r9.getAmountSpent()
        L_0x01ac:
            java.util.List r14 = r10.getPurchases()
            if (r14 == 0) goto L_0x01be
            java.util.List r14 = r10.getPurchases()
            db.l.b(r14)
            java.util.List r14 = ta.w.T(r14)
            goto L_0x01c3
        L_0x01be:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01c3:
            com.onesignal.user.internal.operations.l r7 = (com.onesignal.user.internal.operations.l) r7
            java.util.List r7 = r7.getPurchases()
            java.util.Iterator r7 = r7.iterator()
        L_0x01cd:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x01f3
            java.lang.Object r15 = r7.next()
            com.onesignal.user.internal.operations.g r15 = (com.onesignal.user.internal.operations.g) r15
            w9.g r5 = new w9.g
            java.lang.String r12 = r15.getSku()
            r17 = r2
            java.lang.String r2 = r15.getIso()
            java.math.BigDecimal r15 = r15.getAmount()
            r5.<init>(r12, r2, r15)
            r14.add(r5)
            r2 = r17
            r12 = 1
            goto L_0x01cd
        L_0x01f3:
            r17 = r2
            w9.e r2 = new w9.e
            java.lang.Long r5 = r10.getSessionTime()
            java.lang.Integer r7 = r10.getSessionCount()
            r2.<init>(r5, r7, r9, r14)
            r10 = r2
            r2 = r17
            r12 = 1
            goto L_0x0096
        L_0x0208:
            if (r13 == 0) goto L_0x031e
            if (r2 == 0) goto L_0x031e
            w9.d r4 = r1._userBackend     // Catch:{ a -> 0x02b8 }
            java.lang.String r7 = "onesignal_id"
            if (r6 == 0) goto L_0x0214
            r9 = 1
            goto L_0x0215
        L_0x0214:
            r9 = 0
        L_0x0215:
            r11.L$0 = r1     // Catch:{ a -> 0x02b8 }
            r11.L$1 = r0     // Catch:{ a -> 0x02b8 }
            r11.L$2 = r13     // Catch:{ a -> 0x02b8 }
            r11.L$3 = r2     // Catch:{ a -> 0x02b8 }
            r5 = 1
            r11.label = r5     // Catch:{ a -> 0x02b8 }
            r5 = r13
            r6 = r7
            r7 = r2
            java.lang.Object r4 = r4.updateUser(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ a -> 0x02b8 }
            if (r4 != r3) goto L_0x022a
            return r3
        L_0x022a:
            r5 = r1
            r3 = r2
            r4 = r13
        L_0x022d:
            com.onesignal.user.internal.identity.b r2 = r5._identityModelStore     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.g r2 = r2.getModel()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.identity.a r2 = (com.onesignal.user.internal.identity.a) r2     // Catch:{ a -> 0x0043 }
            java.lang.String r2 = r2.getOnesignalId()     // Catch:{ a -> 0x0043 }
            boolean r2 = db.l.a(r2, r3)     // Catch:{ a -> 0x0043 }
            if (r2 == 0) goto L_0x031e
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0043 }
        L_0x0243:
            boolean r2 = r0.hasNext()     // Catch:{ a -> 0x0043 }
            if (r2 == 0) goto L_0x031e
            java.lang.Object r2 = r0.next()     // Catch:{ a -> 0x0043 }
            v7.f r2 = (v7.f) r2     // Catch:{ a -> 0x0043 }
            boolean r6 = r2 instanceof com.onesignal.user.internal.operations.k     // Catch:{ a -> 0x0043 }
            if (r6 == 0) goto L_0x0276
            com.onesignal.user.internal.properties.b r6 = r5._propertiesModelStore     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.g r6 = r6.getModel()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.properties.a r6 = (com.onesignal.user.internal.properties.a) r6     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.f r7 = r6.getTags()     // Catch:{ a -> 0x0043 }
            r6 = r2
            com.onesignal.user.internal.operations.k r6 = (com.onesignal.user.internal.operations.k) r6     // Catch:{ a -> 0x0043 }
            java.lang.String r8 = r6.getKey()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.operations.k r2 = (com.onesignal.user.internal.operations.k) r2     // Catch:{ a -> 0x0043 }
            java.lang.String r9 = r2.getValue()     // Catch:{ a -> 0x0043 }
            java.lang.String r10 = "HYDRATE"
            r11 = 0
            r12 = 8
            r13 = 0
            com.onesignal.common.modeling.g.setStringProperty$default(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ a -> 0x0043 }
            goto L_0x0243
        L_0x0276:
            boolean r6 = r2 instanceof com.onesignal.user.internal.operations.d     // Catch:{ a -> 0x0043 }
            if (r6 == 0) goto L_0x0297
            com.onesignal.user.internal.properties.b r6 = r5._propertiesModelStore     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.g r6 = r6.getModel()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.properties.a r6 = (com.onesignal.user.internal.properties.a) r6     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.f r7 = r6.getTags()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.operations.d r2 = (com.onesignal.user.internal.operations.d) r2     // Catch:{ a -> 0x0043 }
            java.lang.String r8 = r2.getKey()     // Catch:{ a -> 0x0043 }
            r9 = 0
            java.lang.String r10 = "HYDRATE"
            r11 = 0
            r12 = 8
            r13 = 0
            com.onesignal.common.modeling.g.setOptStringProperty$default(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ a -> 0x0043 }
            goto L_0x0243
        L_0x0297:
            boolean r6 = r2 instanceof com.onesignal.user.internal.operations.j     // Catch:{ a -> 0x0043 }
            if (r6 == 0) goto L_0x0243
            com.onesignal.user.internal.properties.b r6 = r5._propertiesModelStore     // Catch:{ a -> 0x0043 }
            com.onesignal.common.modeling.g r7 = r6.getModel()     // Catch:{ a -> 0x0043 }
            r6 = r2
            com.onesignal.user.internal.operations.j r6 = (com.onesignal.user.internal.operations.j) r6     // Catch:{ a -> 0x0043 }
            java.lang.String r8 = r6.getProperty()     // Catch:{ a -> 0x0043 }
            com.onesignal.user.internal.operations.j r2 = (com.onesignal.user.internal.operations.j) r2     // Catch:{ a -> 0x0043 }
            java.lang.Object r9 = r2.getValue()     // Catch:{ a -> 0x0043 }
            java.lang.String r10 = "HYDRATE"
            r11 = 0
            r12 = 8
            r13 = 0
            com.onesignal.common.modeling.g.setOptAnyProperty$default(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ a -> 0x0043 }
            goto L_0x0243
        L_0x02b8:
            r0 = move-exception
            r5 = r1
            r3 = r2
            r4 = r13
        L_0x02bc:
            com.onesignal.common.k r2 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r2.getResponseStatusType(r0)
            int[] r2 = com.onesignal.user.internal.operations.impl.executors.h.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x0311
            r2 = 2
            if (r0 == r2) goto L_0x0303
            r2 = 3
            if (r0 == r2) goto L_0x02e4
            v7.a r0 = new v7.a
            v7.b r7 = v7.b.FAIL_NORETRY
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x031d
        L_0x02e4:
            x9.a r0 = r5._buildUserService
            java.util.List r8 = r0.getRebuildOperationsIfCurrentUser(r4, r3)
            v7.a r0 = new v7.a
            if (r8 != 0) goto L_0x02f9
            v7.b r3 = v7.b.FAIL_NORETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x02f9:
            v7.b r6 = v7.b.FAIL_RETRY
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x0303:
            v7.a r0 = new v7.a
            v7.b r12 = v7.b.FAIL_UNAUTHORIZED
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x031d
        L_0x0311:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_RETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x031d:
            return r0
        L_0x031e:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.SUCCESS
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.h.execute(java.util.List, va.d):java.lang.Object");
    }

    public List<String> getOperations() {
        return o.g(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
