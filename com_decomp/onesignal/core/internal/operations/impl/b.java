package com.onesignal.core.internal.operations.impl;

import cb.p;
import com.onesignal.common.modeling.b;
import db.g;
import db.l;
import db.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mb.h0;
import sa.o;
import sa.t;

public final class b implements v7.e, z7.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final a _operationModelStore;
    private final a8.a _time;
    private final Map<String, v7.d> executorsMap;
    private boolean paused;
    private final List<a> queue = new ArrayList();
    /* access modifiers changed from: private */
    public final com.onesignal.common.threading.c waiter = new com.onesignal.common.threading.c();

    private static final class a {
        private final v7.f operation;
        private final com.onesignal.common.threading.c waiter;

        public a(v7.f fVar, com.onesignal.common.threading.c cVar) {
            l.e(fVar, "operation");
            this.operation = fVar;
            this.waiter = cVar;
        }

        public final v7.f getOperation() {
            return this.operation;
        }

        public final com.onesignal.common.threading.c getWaiter() {
            return this.waiter;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(v7.f fVar, com.onesignal.common.threading.c cVar, int i10, g gVar) {
            this(fVar, (i10 & 2) != 0 ? null : cVar);
        }
    }

    /* renamed from: com.onesignal.core.internal.operations.impl.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C0132b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v7.b.values().length];
            iArr[v7.b.SUCCESS.ordinal()] = 1;
            iArr[v7.b.FAIL_UNAUTHORIZED.ordinal()] = 2;
            iArr[v7.b.FAIL_NORETRY.ordinal()] = 3;
            iArr[v7.b.FAIL_CONFLICT.ordinal()] = 4;
            iArr[v7.b.SUCCESS_STARTING_ONLY.ordinal()] = 5;
            iArr[v7.b.FAIL_RETRY.ordinal()] = 6;
            iArr[v7.b.FAIL_PAUSE_OPREPO.ordinal()] = 7;
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
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.executeOperations((List<a>) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processQueueForever(this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ r $force;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar, b bVar, va.d dVar) {
            super(2, dVar);
            this.$force = rVar;
            this.this$0 = bVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.$force, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                r rVar2 = this.$force;
                com.onesignal.common.threading.c access$getWaiter$p = this.this$0.waiter;
                this.L$0 = rVar2;
                this.label = 1;
                Object waitForWake = access$getWaiter$p.waitForWake(this);
                if (waitForWake == c10) {
                    return c10;
                }
                rVar = rVar2;
                obj = waitForWake;
            } else if (i10 == 1) {
                rVar = (r) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar.f9424e = ((Boolean) obj).booleanValue();
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = bVar;
        }

        public final va.d create(va.d dVar) {
            return new f(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                b bVar = this.this$0;
                this.label = 1;
                if (bVar.processQueueForever(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((f) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public b(List<? extends v7.d> list, a aVar, com.onesignal.core.internal.config.b bVar, a8.a aVar2) {
        l.e(list, "executors");
        l.e(aVar, "_operationModelStore");
        l.e(bVar, "_configModelStore");
        l.e(aVar2, "_time");
        this._operationModelStore = aVar;
        this._configModelStore = bVar;
        this._time = aVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (v7.d dVar : list) {
            for (String put : dVar.getOperations()) {
                linkedHashMap.put(put, dVar);
            }
        }
        this.executorsMap = linkedHashMap;
        Iterator<com.onesignal.common.modeling.g> it = this._operationModelStore.list().iterator();
        while (it.hasNext()) {
            internalEnqueue(new a((v7.f) it.next(), (com.onesignal.common.threading.c) null, 2, (g) null), false, false);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ab, code lost:
        r15 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f0, code lost:
        com.onesignal.common.modeling.b.a.remove$default(r0._operationModelStore, ((com.onesignal.core.internal.operations.impl.b.a) r14.next()).getOperation().getId(), (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030e, code lost:
        r15 = ((com.onesignal.core.internal.operations.impl.b.a) r14.next()).getWaiter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0318, code lost:
        if (r15 != null) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031a, code lost:
        r15.wake(kotlin.coroutines.jvm.internal.b.a(false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ce A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021e A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0260 A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f0 A[LOOP:12: B:145:0x02ea->B:147:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110 A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014b A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016e A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object executeOperations(java.util.List<com.onesignal.core.internal.operations.impl.b.a> r14, va.d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.onesignal.core.internal.operations.impl.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.onesignal.core.internal.operations.impl.b$c r0 = (com.onesignal.core.internal.operations.impl.b.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.core.internal.operations.impl.b$c r0 = new com.onesignal.core.internal.operations.impl.b$c
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 != r4) goto L_0x0041
            java.lang.Object r14 = r0.L$3
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r1 = r0.L$2
            com.onesignal.core.internal.operations.impl.b$a r1 = (com.onesignal.core.internal.operations.impl.b.a) r1
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r0 = (com.onesignal.core.internal.operations.impl.b) r0
            sa.o.b(r15)     // Catch:{ all -> 0x003e }
            r7 = r14
            r14 = r2
            goto L_0x009b
        L_0x003e:
            r14 = move-exception
            goto L_0x02d0
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0049:
            sa.o.b(r15)
            java.lang.Object r15 = ta.w.w(r14)     // Catch:{ all -> 0x02cc }
            com.onesignal.core.internal.operations.impl.b$a r15 = (com.onesignal.core.internal.operations.impl.b.a) r15     // Catch:{ all -> 0x02cc }
            java.util.Map<java.lang.String, v7.d> r2 = r13.executorsMap     // Catch:{ all -> 0x02cc }
            v7.f r7 = r15.getOperation()     // Catch:{ all -> 0x02cc }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x02cc }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x02cc }
            v7.d r2 = (v7.d) r2     // Catch:{ all -> 0x02cc }
            if (r2 == 0) goto L_0x02ad
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02cc }
            r8 = 10
            int r8 = ta.p.l(r14, r8)     // Catch:{ all -> 0x02cc }
            r7.<init>(r8)     // Catch:{ all -> 0x02cc }
            java.util.Iterator r8 = r14.iterator()     // Catch:{ all -> 0x02cc }
        L_0x0073:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x02cc }
            if (r9 == 0) goto L_0x0087
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x02cc }
            com.onesignal.core.internal.operations.impl.b$a r9 = (com.onesignal.core.internal.operations.impl.b.a) r9     // Catch:{ all -> 0x02cc }
            v7.f r9 = r9.getOperation()     // Catch:{ all -> 0x02cc }
            r7.add(r9)     // Catch:{ all -> 0x02cc }
            goto L_0x0073
        L_0x0087:
            r0.L$0 = r13     // Catch:{ all -> 0x02cc }
            r0.L$1 = r14     // Catch:{ all -> 0x02cc }
            r0.L$2 = r15     // Catch:{ all -> 0x02cc }
            r0.L$3 = r7     // Catch:{ all -> 0x02cc }
            r0.label = r4     // Catch:{ all -> 0x02cc }
            java.lang.Object r0 = r2.execute(r7, r0)     // Catch:{ all -> 0x02cc }
            if (r0 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r1 = r15
            r15 = r0
            r0 = r13
        L_0x009b:
            v7.a r15 = (v7.a) r15     // Catch:{ all -> 0x02ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ab }
            r2.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.String r8 = "OperationRepo: execute response = "
            r2.append(r8)     // Catch:{ all -> 0x02ab }
            v7.b r8 = r15.getResult()     // Catch:{ all -> 0x02ab }
            r2.append(r8)     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02ab }
            com.onesignal.debug.internal.logging.a.debug$default(r2, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            java.util.Map r2 = r15.getIdTranslations()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x00ff
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x02ab }
        L_0x00bf:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x02ab }
            if (r8 == 0) goto L_0x00d7
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.b$a r8 = (com.onesignal.core.internal.operations.impl.b.a) r8     // Catch:{ all -> 0x02ab }
            v7.f r8 = r8.getOperation()     // Catch:{ all -> 0x02ab }
            java.util.Map r9 = r15.getIdTranslations()     // Catch:{ all -> 0x02ab }
            r8.translateIds(r9)     // Catch:{ all -> 0x02ab }
            goto L_0x00bf
        L_0x00d7:
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r2 = r0.queue     // Catch:{ all -> 0x02ab }
            monitor-enter(r2)     // Catch:{ all -> 0x02ab }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r8 = r0.queue     // Catch:{ all -> 0x00fc }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00fc }
        L_0x00e0:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00fc }
            if (r9 == 0) goto L_0x00f8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00fc }
            com.onesignal.core.internal.operations.impl.b$a r9 = (com.onesignal.core.internal.operations.impl.b.a) r9     // Catch:{ all -> 0x00fc }
            v7.f r9 = r9.getOperation()     // Catch:{ all -> 0x00fc }
            java.util.Map r10 = r15.getIdTranslations()     // Catch:{ all -> 0x00fc }
            r9.translateIds(r10)     // Catch:{ all -> 0x00fc }
            goto L_0x00e0
        L_0x00f8:
            sa.t r8 = sa.t.f15300a     // Catch:{ all -> 0x00fc }
            monitor-exit(r2)     // Catch:{ all -> 0x02ab }
            goto L_0x00ff
        L_0x00fc:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02ab }
            throw r15     // Catch:{ all -> 0x02ab }
        L_0x00ff:
            v7.b r2 = r15.getResult()     // Catch:{ all -> 0x02ab }
            int[] r8 = com.onesignal.core.internal.operations.impl.b.C0132b.$EnumSwitchMapping$0     // Catch:{ all -> 0x02ab }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x02ab }
            r2 = r8[r2]     // Catch:{ all -> 0x02ab }
            switch(r2) {
                case 1: goto L_0x021e;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01ce;
                case 5: goto L_0x016e;
                case 6: goto L_0x014b;
                case 7: goto L_0x0110;
                default: goto L_0x010e;
            }     // Catch:{ all -> 0x02ab }
        L_0x010e:
            goto L_0x025a
        L_0x0110:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = "Operation execution failed with eventual retry, pausing the operation repo: "
            r1.append(r2)     // Catch:{ all -> 0x02ab }
            r1.append(r7)     // Catch:{ all -> 0x02ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02ab }
            com.onesignal.debug.internal.logging.a.error$default(r1, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            r0.paused = r4     // Catch:{ all -> 0x02ab }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r1 = r0.queue     // Catch:{ all -> 0x02ab }
            monitor-enter(r1)     // Catch:{ all -> 0x02ab }
            java.util.List r2 = ta.w.L(r14)     // Catch:{ all -> 0x0148 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0148 }
        L_0x0131:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0148 }
            if (r4 == 0) goto L_0x0143
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0148 }
            com.onesignal.core.internal.operations.impl.b$a r4 = (com.onesignal.core.internal.operations.impl.b.a) r4     // Catch:{ all -> 0x0148 }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r7 = r0.queue     // Catch:{ all -> 0x0148 }
            r7.add(r3, r4)     // Catch:{ all -> 0x0148 }
            goto L_0x0131
        L_0x0143:
            sa.t r2 = sa.t.f15300a     // Catch:{ all -> 0x0148 }
        L_0x0145:
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            goto L_0x025a
        L_0x0148:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            throw r15     // Catch:{ all -> 0x02ab }
        L_0x014b:
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r1 = r0.queue     // Catch:{ all -> 0x02ab }
            monitor-enter(r1)     // Catch:{ all -> 0x02ab }
            java.util.List r2 = ta.w.L(r14)     // Catch:{ all -> 0x016b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x016b }
        L_0x0156:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x016b }
            if (r4 == 0) goto L_0x0168
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x016b }
            com.onesignal.core.internal.operations.impl.b$a r4 = (com.onesignal.core.internal.operations.impl.b.a) r4     // Catch:{ all -> 0x016b }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r7 = r0.queue     // Catch:{ all -> 0x016b }
            r7.add(r3, r4)     // Catch:{ all -> 0x016b }
            goto L_0x0156
        L_0x0168:
            sa.t r2 = sa.t.f15300a     // Catch:{ all -> 0x016b }
            goto L_0x0145
        L_0x016b:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            throw r15     // Catch:{ all -> 0x02ab }
        L_0x016e:
            com.onesignal.core.internal.operations.impl.a r2 = r0._operationModelStore     // Catch:{ all -> 0x02ab }
            v7.f r7 = r1.getOperation()     // Catch:{ all -> 0x02ab }
            java.lang.String r7 = r7.getId()     // Catch:{ all -> 0x02ab }
            com.onesignal.common.modeling.b.a.remove$default(r2, r7, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            com.onesignal.common.threading.c r2 = r1.getWaiter()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x0188
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ all -> 0x02ab }
            r2.wake(r7)     // Catch:{ all -> 0x02ab }
        L_0x0188:
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r2 = r0.queue     // Catch:{ all -> 0x02ab }
            monitor-enter(r2)     // Catch:{ all -> 0x02ab }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01cb }
            r7.<init>()     // Catch:{ all -> 0x01cb }
            java.util.Iterator r8 = r14.iterator()     // Catch:{ all -> 0x01cb }
        L_0x0194:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x01cb }
            if (r9 == 0) goto L_0x01ac
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x01cb }
            r10 = r9
            com.onesignal.core.internal.operations.impl.b$a r10 = (com.onesignal.core.internal.operations.impl.b.a) r10     // Catch:{ all -> 0x01cb }
            boolean r10 = db.l.a(r10, r1)     // Catch:{ all -> 0x01cb }
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x0194
            r7.add(r9)     // Catch:{ all -> 0x01cb }
            goto L_0x0194
        L_0x01ac:
            java.util.List r1 = ta.w.L(r7)     // Catch:{ all -> 0x01cb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01cb }
        L_0x01b4:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x01c6
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x01cb }
            com.onesignal.core.internal.operations.impl.b$a r4 = (com.onesignal.core.internal.operations.impl.b.a) r4     // Catch:{ all -> 0x01cb }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r7 = r0.queue     // Catch:{ all -> 0x01cb }
            r7.add(r3, r4)     // Catch:{ all -> 0x01cb }
            goto L_0x01b4
        L_0x01c6:
            sa.t r1 = sa.t.f15300a     // Catch:{ all -> 0x01cb }
            monitor-exit(r2)     // Catch:{ all -> 0x02ab }
            goto L_0x025a
        L_0x01cb:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02ab }
            throw r15     // Catch:{ all -> 0x02ab }
        L_0x01ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = "Operation execution failed without retry: "
            r1.append(r2)     // Catch:{ all -> 0x02ab }
            r1.append(r7)     // Catch:{ all -> 0x02ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02ab }
            com.onesignal.debug.internal.logging.a.error$default(r1, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x02ab }
        L_0x01e6:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x0200
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.b$a r2 = (com.onesignal.core.internal.operations.impl.b.a) r2     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.a r4 = r0._operationModelStore     // Catch:{ all -> 0x02ab }
            v7.f r2 = r2.getOperation()     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = r2.getId()     // Catch:{ all -> 0x02ab }
            com.onesignal.common.modeling.b.a.remove$default(r4, r2, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            goto L_0x01e6
        L_0x0200:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x02ab }
        L_0x0204:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x025a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.b$a r2 = (com.onesignal.core.internal.operations.impl.b.a) r2     // Catch:{ all -> 0x02ab }
            com.onesignal.common.threading.c r2 = r2.getWaiter()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x0204
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ all -> 0x02ab }
            r2.wake(r4)     // Catch:{ all -> 0x02ab }
            goto L_0x0204
        L_0x021e:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x02ab }
        L_0x0222:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x023c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.b$a r2 = (com.onesignal.core.internal.operations.impl.b.a) r2     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.a r7 = r0._operationModelStore     // Catch:{ all -> 0x02ab }
            v7.f r2 = r2.getOperation()     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = r2.getId()     // Catch:{ all -> 0x02ab }
            com.onesignal.common.modeling.b.a.remove$default(r7, r2, r6, r5, r6)     // Catch:{ all -> 0x02ab }
            goto L_0x0222
        L_0x023c:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x02ab }
        L_0x0240:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x025a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02ab }
            com.onesignal.core.internal.operations.impl.b$a r2 = (com.onesignal.core.internal.operations.impl.b.a) r2     // Catch:{ all -> 0x02ab }
            com.onesignal.common.threading.c r2 = r2.getWaiter()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x0240
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ all -> 0x02ab }
            r2.wake(r7)     // Catch:{ all -> 0x02ab }
            goto L_0x0240
        L_0x025a:
            java.util.List r1 = r15.getOperations()     // Catch:{ all -> 0x02ab }
            if (r1 == 0) goto L_0x0322
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r1 = r0.queue     // Catch:{ all -> 0x02ab }
            monitor-enter(r1)     // Catch:{ all -> 0x02ab }
            java.util.List r15 = r15.getOperations()     // Catch:{ all -> 0x02a8 }
            java.util.List r15 = ta.w.L(r15)     // Catch:{ all -> 0x02a8 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x02a8 }
        L_0x026f:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x02a8 }
            if (r2 == 0) goto L_0x02a3
            java.lang.Object r2 = r15.next()     // Catch:{ all -> 0x02a8 }
            v7.f r2 = (v7.f) r2     // Catch:{ all -> 0x02a8 }
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x02a8 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02a8 }
            java.lang.String r7 = "randomUUID().toString()"
            db.l.d(r4, r7)     // Catch:{ all -> 0x02a8 }
            r2.setId(r4)     // Catch:{ all -> 0x02a8 }
            com.onesignal.core.internal.operations.impl.b$a r4 = new com.onesignal.core.internal.operations.impl.b$a     // Catch:{ all -> 0x02a8 }
            r4.<init>(r2, r6, r5, r6)     // Catch:{ all -> 0x02a8 }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r2 = r0.queue     // Catch:{ all -> 0x02a8 }
            r2.add(r3, r4)     // Catch:{ all -> 0x02a8 }
            com.onesignal.core.internal.operations.impl.a r7 = r0._operationModelStore     // Catch:{ all -> 0x02a8 }
            r8 = 0
            v7.f r9 = r4.getOperation()     // Catch:{ all -> 0x02a8 }
            r10 = 0
            r11 = 4
            r12 = 0
            com.onesignal.common.modeling.b.a.add$default(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02a8 }
            goto L_0x026f
        L_0x02a3:
            sa.t r15 = sa.t.f15300a     // Catch:{ all -> 0x02a8 }
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            goto L_0x0322
        L_0x02a8:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            throw r15     // Catch:{ all -> 0x02ab }
        L_0x02ab:
            r15 = move-exception
            goto L_0x02ce
        L_0x02ad:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x02cc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cc }
            r1.<init>()     // Catch:{ all -> 0x02cc }
            java.lang.String r2 = "Could not find executor for operation "
            r1.append(r2)     // Catch:{ all -> 0x02cc }
            v7.f r15 = r15.getOperation()     // Catch:{ all -> 0x02cc }
            java.lang.String r15 = r15.getName()     // Catch:{ all -> 0x02cc }
            r1.append(r15)     // Catch:{ all -> 0x02cc }
            java.lang.String r15 = r1.toString()     // Catch:{ all -> 0x02cc }
            r0.<init>(r15)     // Catch:{ all -> 0x02cc }
            throw r0     // Catch:{ all -> 0x02cc }
        L_0x02cc:
            r15 = move-exception
            r0 = r13
        L_0x02ce:
            r2 = r14
            r14 = r15
        L_0x02d0:
            c8.b r15 = c8.b.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Error attempting to execute operation: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.onesignal.debug.internal.logging.a.log(r15, r1, r14)
            java.util.Iterator r14 = r2.iterator()
        L_0x02ea:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0304
            java.lang.Object r15 = r14.next()
            com.onesignal.core.internal.operations.impl.b$a r15 = (com.onesignal.core.internal.operations.impl.b.a) r15
            com.onesignal.core.internal.operations.impl.a r1 = r0._operationModelStore
            v7.f r15 = r15.getOperation()
            java.lang.String r15 = r15.getId()
            com.onesignal.common.modeling.b.a.remove$default(r1, r15, r6, r5, r6)
            goto L_0x02ea
        L_0x0304:
            java.util.Iterator r14 = r2.iterator()
        L_0x0308:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0322
            java.lang.Object r15 = r14.next()
            com.onesignal.core.internal.operations.impl.b$a r15 = (com.onesignal.core.internal.operations.impl.b.a) r15
            com.onesignal.common.threading.c r15 = r15.getWaiter()
            if (r15 == 0) goto L_0x0308
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r3)
            r15.wake(r0)
            goto L_0x0308
        L_0x0322:
            sa.t r14 = sa.t.f15300a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.b.executeOperations(java.util.List, va.d):java.lang.Object");
    }

    private final List<a> getGroupableOperations(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        if (aVar.getOperation().getGroupComparisonType() == v7.c.NONE) {
            return arrayList;
        }
        String createComparisonKey = aVar.getOperation().getGroupComparisonType() == v7.c.CREATE ? aVar.getOperation().getCreateComparisonKey() : aVar.getOperation().getModifyComparisonKey();
        if (!this.queue.isEmpty()) {
            for (a aVar2 : w.R(this.queue)) {
                if (l.a(aVar.getOperation().getGroupComparisonType() == v7.c.CREATE ? aVar2.getOperation().getCreateComparisonKey() : aVar2.getOperation().getModifyComparisonKey(), createComparisonKey)) {
                    this.queue.remove(aVar2);
                    arrayList.add(aVar2);
                }
            }
        }
        return arrayList;
    }

    private final void internalEnqueue(a aVar, boolean z10, boolean z11) {
        synchronized (this.queue) {
            this.queue.add(aVar);
            if (z11) {
                b.a.add$default(this._operationModelStore, aVar.getOperation(), (String) null, 2, (Object) null);
            }
            t tVar = t.f15300a;
        }
        this.waiter.wake(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[SYNTHETIC, Splitter:B:28:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e0 A[Catch:{ all -> 0x0133, all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012a A[Catch:{ all -> 0x0133, all -> 0x0061 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processQueueForever(va.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.onesignal.core.internal.operations.impl.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.onesignal.core.internal.operations.impl.b$d r0 = (com.onesignal.core.internal.operations.impl.b.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.core.internal.operations.impl.b$d r0 = new com.onesignal.core.internal.operations.impl.b$d
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0064
            if (r2 == r4) goto L_0x0052
            if (r2 == r5) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$1
            db.r r2 = (db.r) r2
            java.lang.Object r9 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r9 = (com.onesignal.core.internal.operations.impl.b) r9
            sa.o.b(r15)     // Catch:{ all -> 0x0061 }
            goto L_0x012b
        L_0x003b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0043:
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$1
            db.r r2 = (db.r) r2
            java.lang.Object r9 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r9 = (com.onesignal.core.internal.operations.impl.b) r9
            sa.o.b(r15)     // Catch:{ all -> 0x0061 }
            goto L_0x0110
        L_0x0052:
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$1
            db.r r2 = (db.r) r2
            java.lang.Object r9 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r9 = (com.onesignal.core.internal.operations.impl.b) r9
            sa.o.b(r15)     // Catch:{ all -> 0x0061 }
            goto L_0x00dc
        L_0x0061:
            r15 = move-exception
            goto L_0x013c
        L_0x0064:
            sa.o.b(r15)
            a8.a r15 = r14._time
            long r7 = r15.getCurrentTimeMillis()
            db.r r15 = new db.r
            r15.<init>()
            r9 = r14
            r2 = r15
        L_0x0074:
            boolean r15 = r9.paused
            if (r15 == 0) goto L_0x0080
            java.lang.String r15 = "OperationRepo is paused"
            com.onesignal.debug.internal.logging.a.debug$default(r15, r6, r5, r6)
            sa.t r15 = sa.t.f15300a
            return r15
        L_0x0080:
            db.t r15 = new db.t     // Catch:{ all -> 0x0061 }
            r15.<init>()     // Catch:{ all -> 0x0061 }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r10 = r9.queue     // Catch:{ all -> 0x0061 }
            monitor-enter(r10)     // Catch:{ all -> 0x0061 }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r11 = r9.queue     // Catch:{ all -> 0x0139 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0139 }
        L_0x008e:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0139 }
            if (r12 == 0) goto L_0x00a6
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0139 }
            r13 = r12
            com.onesignal.core.internal.operations.impl.b$a r13 = (com.onesignal.core.internal.operations.impl.b.a) r13     // Catch:{ all -> 0x0139 }
            v7.f r13 = r13.getOperation()     // Catch:{ all -> 0x0139 }
            boolean r13 = r13.getCanStartExecute()     // Catch:{ all -> 0x0139 }
            if (r13 == 0) goto L_0x008e
            goto L_0x00a7
        L_0x00a6:
            r12 = r6
        L_0x00a7:
            com.onesignal.core.internal.operations.impl.b$a r12 = (com.onesignal.core.internal.operations.impl.b.a) r12     // Catch:{ all -> 0x0139 }
            if (r12 == 0) goto L_0x00b6
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r11 = r9.queue     // Catch:{ all -> 0x0139 }
            r11.remove(r12)     // Catch:{ all -> 0x0139 }
            java.util.List r11 = r9.getGroupableOperations(r12)     // Catch:{ all -> 0x0139 }
            r15.f9426e = r11     // Catch:{ all -> 0x0139 }
        L_0x00b6:
            sa.t r11 = sa.t.f15300a     // Catch:{ all -> 0x0139 }
            monitor-exit(r10)     // Catch:{ all -> 0x0061 }
            java.util.List<com.onesignal.core.internal.operations.impl.b$a> r10 = r9.queue     // Catch:{ all -> 0x0061 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 == 0) goto L_0x00c4
            r10 = 0
            r2.f9424e = r10     // Catch:{ all -> 0x0061 }
        L_0x00c4:
            java.lang.Object r15 = r15.f9426e     // Catch:{ all -> 0x0061 }
            if (r15 == 0) goto L_0x00dc
            db.l.b(r15)     // Catch:{ all -> 0x0061 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x0061 }
            r0.L$0 = r9     // Catch:{ all -> 0x0061 }
            r0.L$1 = r2     // Catch:{ all -> 0x0061 }
            r0.J$0 = r7     // Catch:{ all -> 0x0061 }
            r0.label = r4     // Catch:{ all -> 0x0061 }
            java.lang.Object r15 = r9.executeOperations(r15, r0)     // Catch:{ all -> 0x0061 }
            if (r15 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            boolean r15 = r2.f9424e     // Catch:{ all -> 0x0061 }
            if (r15 != 0) goto L_0x0074
            a8.a r15 = r9._time     // Catch:{ all -> 0x0061 }
            long r10 = r15.getCurrentTimeMillis()     // Catch:{ all -> 0x0061 }
            long r12 = r7 - r10
            com.onesignal.core.internal.config.b r15 = r9._configModelStore     // Catch:{ all -> 0x0061 }
            com.onesignal.common.modeling.g r15 = r15.getModel()     // Catch:{ all -> 0x0061 }
            com.onesignal.core.internal.config.a r15 = (com.onesignal.core.internal.config.a) r15     // Catch:{ all -> 0x0061 }
            long r7 = r15.getOpRepoExecutionInterval()     // Catch:{ all -> 0x0061 }
            long r12 = r12 + r7
            r7 = 0
            int r15 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x0136
            com.onesignal.core.internal.operations.impl.b$e r15 = new com.onesignal.core.internal.operations.impl.b$e     // Catch:{ all -> 0x0133 }
            r15.<init>(r2, r9, r6)     // Catch:{ all -> 0x0133 }
            r0.L$0 = r9     // Catch:{ all -> 0x0133 }
            r0.L$1 = r2     // Catch:{ all -> 0x0133 }
            r0.J$0 = r10     // Catch:{ all -> 0x0133 }
            r0.label = r5     // Catch:{ all -> 0x0133 }
            java.lang.Object r15 = mb.l2.d(r12, r15, r0)     // Catch:{ all -> 0x0133 }
            if (r15 != r1) goto L_0x010f
            return r1
        L_0x010f:
            r7 = r10
        L_0x0110:
            com.onesignal.core.internal.config.b r15 = r9._configModelStore     // Catch:{ all -> 0x0061 }
            com.onesignal.common.modeling.g r15 = r15.getModel()     // Catch:{ all -> 0x0061 }
            com.onesignal.core.internal.config.a r15 = (com.onesignal.core.internal.config.a) r15     // Catch:{ all -> 0x0061 }
            long r10 = r15.getOpRepoPostWakeDelay()     // Catch:{ all -> 0x0061 }
            r0.L$0 = r9     // Catch:{ all -> 0x0061 }
            r0.L$1 = r2     // Catch:{ all -> 0x0061 }
            r0.J$0 = r7     // Catch:{ all -> 0x0061 }
            r0.label = r3     // Catch:{ all -> 0x0061 }
            java.lang.Object r15 = mb.r0.a(r10, r0)     // Catch:{ all -> 0x0061 }
            if (r15 != r1) goto L_0x012b
            return r1
        L_0x012b:
            a8.a r15 = r9._time     // Catch:{ all -> 0x0061 }
            long r7 = r15.getCurrentTimeMillis()     // Catch:{ all -> 0x0061 }
            goto L_0x0074
        L_0x0133:
            r15 = move-exception
            r7 = r10
            goto L_0x013c
        L_0x0136:
            r7 = r10
            goto L_0x0074
        L_0x0139:
            r15 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0061 }
            throw r15     // Catch:{ all -> 0x0061 }
        L_0x013c:
            c8.b r10 = c8.b.ERROR
            java.lang.String r11 = "Error occurred with Operation work loop"
            com.onesignal.debug.internal.logging.a.log(r10, r11, r15)
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.b.processQueueForever(va.d):java.lang.Object");
    }

    public void enqueue(v7.f fVar, boolean z10) {
        l.e(fVar, "operation");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "OperationRepo.enqueue(operation: " + fVar + ", flush: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        l.d(uuid, "randomUUID().toString()");
        fVar.setId(uuid);
        internalEnqueue(new a(fVar, (com.onesignal.common.threading.c) null, 2, (g) null), z10, true);
    }

    public Object enqueueAndWait(v7.f fVar, boolean z10, va.d dVar) {
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "OperationRepo.enqueueAndWait(operation: " + fVar + ", force: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        l.d(uuid, "randomUUID().toString()");
        fVar.setId(uuid);
        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
        internalEnqueue(new a(fVar, cVar), z10, true);
        return cVar.waitForWake(dVar);
    }

    public void start() {
        this.paused = false;
        com.onesignal.common.threading.a.suspendifyOnThread$default("OpRepo", 0, new f(this, (va.d) null), 2, (Object) null);
    }
}
