package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.k;
import db.g;
import db.l;
import java.util.List;
import v7.d;
import v7.f;

public final class a implements d {
    public static final C0193a Companion = new C0193a((g) null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final x9.a _buildUserService;
    private final w9.b _identityBackend;
    private final com.onesignal.user.internal.identity.b _identityModelStore;

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a  reason: collision with other inner class name */
    public static final class C0193a {
        private C0193a() {
        }

        public /* synthetic */ C0193a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.a.values().length];
            iArr[k.a.RETRYABLE.ordinal()] = 1;
            iArr[k.a.INVALID.ordinal()] = 2;
            iArr[k.a.CONFLICT.ordinal()] = 3;
            iArr[k.a.UNAUTHORIZED.ordinal()] = 4;
            iArr[k.a.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute((List<? extends f>) null, this);
        }
    }

    public a(w9.b bVar, com.onesignal.user.internal.identity.b bVar2, x9.a aVar) {
        l.e(bVar, "_identityBackend");
        l.e(bVar2, "_identityModelStore");
        l.e(aVar, "_buildUserService");
        this._identityBackend = bVar;
        this._identityModelStore = bVar2;
        this._buildUserService = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1 A[Catch:{ a -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b9 A[Catch:{ a -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute(java.util.List<? extends v7.f> r22, va.d r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.onesignal.user.internal.operations.impl.executors.a.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.user.internal.operations.impl.executors.a$c r2 = (com.onesignal.user.internal.operations.impl.executors.a.c) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.user.internal.operations.impl.executors.a$c r2 = new com.onesignal.user.internal.operations.impl.executors.a$c
            r2.<init>(r1, r0)
        L_0x001c:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = wa.d.c()
            int r3 = r8.label
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 1
            r13 = 2
            if (r3 == 0) goto L_0x0057
            if (r3 == r12) goto L_0x0048
            if (r3 != r13) goto L_0x0040
            java.lang.Object r2 = r8.L$1
            v7.f r2 = (v7.f) r2
            java.lang.Object r3 = r8.L$0
            com.onesignal.user.internal.operations.impl.executors.a r3 = (com.onesignal.user.internal.operations.impl.executors.a) r3
            sa.o.b(r0)     // Catch:{ a -> 0x003d }
            goto L_0x01a0
        L_0x003d:
            r0 = move-exception
            goto L_0x01d8
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            java.lang.Object r2 = r8.L$1
            v7.f r2 = (v7.f) r2
            java.lang.Object r3 = r8.L$0
            com.onesignal.user.internal.operations.impl.executors.a r3 = (com.onesignal.user.internal.operations.impl.executors.a) r3
            sa.o.b(r0)     // Catch:{ a -> 0x0054 }
            goto L_0x00b8
        L_0x0054:
            r0 = move-exception
            goto L_0x00f5
        L_0x0057:
            sa.o.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "IdentityOperationExecutor(operations: "
            r0.append(r3)
            r3 = r22
            r0.append(r3)
            r4 = 41
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = 0
            com.onesignal.debug.internal.logging.a.debug$default(r0, r4, r13, r4)
            java.lang.Object r0 = ta.w.E(r22)
            r14 = r0
            v7.f r14 = (v7.f) r14
            boolean r0 = r14 instanceof com.onesignal.user.internal.operations.i
            if (r0 == 0) goto L_0x0174
            w9.b r3 = r1._identityBackend     // Catch:{ a -> 0x00f2 }
            r0 = r14
            com.onesignal.user.internal.operations.i r0 = (com.onesignal.user.internal.operations.i) r0     // Catch:{ a -> 0x00f2 }
            java.lang.String r4 = r0.getAppId()     // Catch:{ a -> 0x00f2 }
            java.lang.String r5 = "onesignal_id"
            r0 = r14
            com.onesignal.user.internal.operations.i r0 = (com.onesignal.user.internal.operations.i) r0     // Catch:{ a -> 0x00f2 }
            java.lang.String r6 = r0.getOnesignalId()     // Catch:{ a -> 0x00f2 }
            r0 = r14
            com.onesignal.user.internal.operations.i r0 = (com.onesignal.user.internal.operations.i) r0     // Catch:{ a -> 0x00f2 }
            java.lang.String r0 = r0.getLabel()     // Catch:{ a -> 0x00f2 }
            r7 = r14
            com.onesignal.user.internal.operations.i r7 = (com.onesignal.user.internal.operations.i) r7     // Catch:{ a -> 0x00f2 }
            java.lang.String r7 = r7.getValue()     // Catch:{ a -> 0x00f2 }
            sa.m r0 = sa.q.a(r0, r7)     // Catch:{ a -> 0x00f2 }
            java.util.Map r7 = ta.e0.b(r0)     // Catch:{ a -> 0x00f2 }
            r8.L$0 = r1     // Catch:{ a -> 0x00f2 }
            r8.L$1 = r14     // Catch:{ a -> 0x00f2 }
            r8.label = r12     // Catch:{ a -> 0x00f2 }
            java.lang.Object r0 = r3.setAlias(r4, r5, r6, r7, r8)     // Catch:{ a -> 0x00f2 }
            if (r0 != r2) goto L_0x00b6
            return r2
        L_0x00b6:
            r3 = r1
            r2 = r14
        L_0x00b8:
            com.onesignal.user.internal.identity.b r0 = r3._identityModelStore     // Catch:{ a -> 0x0054 }
            com.onesignal.common.modeling.g r0 = r0.getModel()     // Catch:{ a -> 0x0054 }
            com.onesignal.user.internal.identity.a r0 = (com.onesignal.user.internal.identity.a) r0     // Catch:{ a -> 0x0054 }
            java.lang.String r0 = r0.getOnesignalId()     // Catch:{ a -> 0x0054 }
            r4 = r2
            com.onesignal.user.internal.operations.i r4 = (com.onesignal.user.internal.operations.i) r4     // Catch:{ a -> 0x0054 }
            java.lang.String r4 = r4.getOnesignalId()     // Catch:{ a -> 0x0054 }
            boolean r0 = db.l.a(r0, r4)     // Catch:{ a -> 0x0054 }
            if (r0 == 0) goto L_0x0257
            com.onesignal.user.internal.identity.b r0 = r3._identityModelStore     // Catch:{ a -> 0x0054 }
            com.onesignal.common.modeling.g r14 = r0.getModel()     // Catch:{ a -> 0x0054 }
            r0 = r2
            com.onesignal.user.internal.operations.i r0 = (com.onesignal.user.internal.operations.i) r0     // Catch:{ a -> 0x0054 }
            java.lang.String r15 = r0.getLabel()     // Catch:{ a -> 0x0054 }
            r0 = r2
            com.onesignal.user.internal.operations.i r0 = (com.onesignal.user.internal.operations.i) r0     // Catch:{ a -> 0x0054 }
            java.lang.String r16 = r0.getValue()     // Catch:{ a -> 0x0054 }
            java.lang.String r17 = "HYDRATE"
            r18 = 0
            r19 = 8
            r20 = 0
            com.onesignal.common.modeling.g.setStringProperty$default(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ a -> 0x0054 }
            goto L_0x0257
        L_0x00f2:
            r0 = move-exception
            r3 = r1
            r2 = r14
        L_0x00f5:
            com.onesignal.common.k r4 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r4.getResponseStatusType(r0)
            int[] r4 = com.onesignal.user.internal.operations.impl.executors.a.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r12) goto L_0x0167
            if (r0 == r13) goto L_0x015a
            if (r0 == r11) goto L_0x014d
            if (r0 == r10) goto L_0x0140
            if (r0 != r9) goto L_0x013a
            x9.a r0 = r3._buildUserService
            com.onesignal.user.internal.operations.i r2 = (com.onesignal.user.internal.operations.i) r2
            java.lang.String r3 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
            java.util.List r7 = r0.getRebuildOperationsIfCurrentUser(r3, r2)
            v7.a r0 = new v7.a
            if (r7 != 0) goto L_0x0130
            v7.b r9 = v7.b.FAIL_NORETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            return r0
        L_0x0130:
            v7.b r5 = v7.b.FAIL_RETRY
            r6 = 0
            r8 = 2
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x013a:
            sa.l r0 = new sa.l
            r0.<init>()
            throw r0
        L_0x0140:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_UNAUTHORIZED
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0173
        L_0x014d:
            v7.a r0 = new v7.a
            v7.b r9 = v7.b.FAIL_CONFLICT
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0173
        L_0x015a:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_NORETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0173
        L_0x0167:
            v7.a r0 = new v7.a
            v7.b r9 = v7.b.FAIL_RETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0173:
            return r0
        L_0x0174:
            boolean r0 = r14 instanceof com.onesignal.user.internal.operations.b
            if (r0 == 0) goto L_0x0257
            w9.b r3 = r1._identityBackend     // Catch:{ a -> 0x01d5 }
            r0 = r14
            com.onesignal.user.internal.operations.b r0 = (com.onesignal.user.internal.operations.b) r0     // Catch:{ a -> 0x01d5 }
            java.lang.String r4 = r0.getAppId()     // Catch:{ a -> 0x01d5 }
            java.lang.String r5 = "onesignal_id"
            r0 = r14
            com.onesignal.user.internal.operations.b r0 = (com.onesignal.user.internal.operations.b) r0     // Catch:{ a -> 0x01d5 }
            java.lang.String r6 = r0.getOnesignalId()     // Catch:{ a -> 0x01d5 }
            r0 = r14
            com.onesignal.user.internal.operations.b r0 = (com.onesignal.user.internal.operations.b) r0     // Catch:{ a -> 0x01d5 }
            java.lang.String r7 = r0.getLabel()     // Catch:{ a -> 0x01d5 }
            r8.L$0 = r1     // Catch:{ a -> 0x01d5 }
            r8.L$1 = r14     // Catch:{ a -> 0x01d5 }
            r8.label = r13     // Catch:{ a -> 0x01d5 }
            java.lang.Object r0 = r3.deleteAlias(r4, r5, r6, r7, r8)     // Catch:{ a -> 0x01d5 }
            if (r0 != r2) goto L_0x019e
            return r2
        L_0x019e:
            r3 = r1
            r2 = r14
        L_0x01a0:
            com.onesignal.user.internal.identity.b r0 = r3._identityModelStore     // Catch:{ a -> 0x003d }
            com.onesignal.common.modeling.g r0 = r0.getModel()     // Catch:{ a -> 0x003d }
            com.onesignal.user.internal.identity.a r0 = (com.onesignal.user.internal.identity.a) r0     // Catch:{ a -> 0x003d }
            java.lang.String r0 = r0.getOnesignalId()     // Catch:{ a -> 0x003d }
            r4 = r2
            com.onesignal.user.internal.operations.b r4 = (com.onesignal.user.internal.operations.b) r4     // Catch:{ a -> 0x003d }
            java.lang.String r4 = r4.getOnesignalId()     // Catch:{ a -> 0x003d }
            boolean r0 = db.l.a(r0, r4)     // Catch:{ a -> 0x003d }
            if (r0 == 0) goto L_0x0257
            com.onesignal.user.internal.identity.b r0 = r3._identityModelStore     // Catch:{ a -> 0x003d }
            com.onesignal.common.modeling.g r14 = r0.getModel()     // Catch:{ a -> 0x003d }
            r0 = r2
            com.onesignal.user.internal.operations.b r0 = (com.onesignal.user.internal.operations.b) r0     // Catch:{ a -> 0x003d }
            java.lang.String r15 = r0.getLabel()     // Catch:{ a -> 0x003d }
            r16 = 0
            java.lang.String r17 = "HYDRATE"
            r18 = 0
            r19 = 8
            r20 = 0
            com.onesignal.common.modeling.g.setOptStringProperty$default(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ a -> 0x003d }
            goto L_0x0257
        L_0x01d5:
            r0 = move-exception
            r3 = r1
            r2 = r14
        L_0x01d8:
            com.onesignal.common.k r4 = com.onesignal.common.k.INSTANCE
            int r0 = r0.getStatusCode()
            com.onesignal.common.k$a r0 = r4.getResponseStatusType(r0)
            int[] r4 = com.onesignal.user.internal.operations.impl.executors.a.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r12) goto L_0x024a
            if (r0 == r13) goto L_0x023d
            if (r0 == r11) goto L_0x0230
            if (r0 == r10) goto L_0x0223
            if (r0 != r9) goto L_0x021d
            x9.a r0 = r3._buildUserService
            com.onesignal.user.internal.operations.b r2 = (com.onesignal.user.internal.operations.b) r2
            java.lang.String r3 = r2.getAppId()
            java.lang.String r2 = r2.getOnesignalId()
            java.util.List r7 = r0.getRebuildOperationsIfCurrentUser(r3, r2)
            v7.a r0 = new v7.a
            if (r7 != 0) goto L_0x0213
            v7.b r9 = v7.b.FAIL_NORETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            return r0
        L_0x0213:
            v7.b r5 = v7.b.FAIL_RETRY
            r6 = 0
            r8 = 2
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x021d:
            sa.l r0 = new sa.l
            r0.<init>()
            throw r0
        L_0x0223:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_UNAUTHORIZED
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0256
        L_0x0230:
            v7.a r0 = new v7.a
            v7.b r9 = v7.b.SUCCESS
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0256
        L_0x023d:
            v7.a r0 = new v7.a
            v7.b r3 = v7.b.FAIL_NORETRY
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0256
        L_0x024a:
            v7.a r0 = new v7.a
            v7.b r9 = v7.b.FAIL_RETRY
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0256:
            return r0
        L_0x0257:
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
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.a.execute(java.util.List, va.d):java.lang.Object");
    }

    public List<String> getOperations() {
        return o.g(SET_ALIAS, DELETE_ALIAS);
    }
}
