package com.onesignal.session.internal.outcomes.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import sa.t;

public final class h implements u9.b, z7.b, com.onesignal.session.internal.session.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final t9.a _influenceManager;
    private final b _outcomeEventsBackend;
    /* access modifiers changed from: private */
    public final d _outcomeEventsCache;
    private final c _outcomeEventsPreferences;
    private final com.onesignal.session.internal.session.b _session;
    private final com.onesignal.user.internal.subscriptions.b _subscriptionManager;
    private final a8.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[t9.d.values().length];
            iArr[t9.d.DIRECT.ordinal()] = 1;
            iArr[t9.d.INDIRECT.ordinal()] = 2;
            iArr[t9.d.UNATTRIBUTED.ordinal()] = 3;
            iArr[t9.d.DISABLED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[t9.c.values().length];
            iArr2[t9.c.IAM.ordinal()] = 1;
            iArr2[t9.c.NOTIFICATION.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
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
            return this.this$0.getUniqueIds((String) null, (List<t9.b>) null, this);
        }
    }

    static final class c extends l implements cb.l {
        final /* synthetic */ f $eventParams;
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, f fVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
            this.$eventParams = fVar;
        }

        public final va.d create(va.d dVar) {
            return new c(this.this$0, this.$eventParams, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                d access$get_outcomeEventsCache$p = this.this$0._outcomeEventsCache;
                f fVar = this.$eventParams;
                this.label = 1;
                if (access$get_outcomeEventsCache$p.saveUniqueOutcomeEventParams(fVar, this) == c10) {
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
            return ((c) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return this.this$0.sendAndCreateOutcomeEvent((String) null, 0.0f, 0, (List<t9.b>) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendSavedOutcomeEvent((f) null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendSavedOutcomes(this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar, va.d dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendUniqueOutcomeEvent((String) null, (List<t9.b>) null, this);
        }
    }

    /* renamed from: com.onesignal.session.internal.outcomes.impl.h$h  reason: collision with other inner class name */
    static final class C0186h extends l implements cb.l {
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0186h(h hVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
        }

        public final va.d create(va.d dVar) {
            return new C0186h(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                h hVar = this.this$0;
                this.label = 1;
                if (hVar.sendSavedOutcomes(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else if (i10 == 2) {
                o.b(obj);
                return t.f15300a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d access$get_outcomeEventsCache$p = this.this$0._outcomeEventsCache;
            this.label = 2;
            if (access$get_outcomeEventsCache$p.cleanCachedUniqueOutcomeEventNotifications(this) == c10) {
                return c10;
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((C0186h) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0056, code lost:
        r3 = ta.w.U(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(com.onesignal.session.internal.session.b r2, t9.a r3, com.onesignal.session.internal.outcomes.impl.d r4, com.onesignal.session.internal.outcomes.impl.c r5, com.onesignal.session.internal.outcomes.impl.b r6, com.onesignal.core.internal.config.b r7, com.onesignal.user.internal.identity.b r8, com.onesignal.user.internal.subscriptions.b r9, q7.a r10, a8.a r11) {
        /*
            r1 = this;
            java.lang.String r0 = "_session"
            db.l.e(r2, r0)
            java.lang.String r0 = "_influenceManager"
            db.l.e(r3, r0)
            java.lang.String r0 = "_outcomeEventsCache"
            db.l.e(r4, r0)
            java.lang.String r0 = "_outcomeEventsPreferences"
            db.l.e(r5, r0)
            java.lang.String r0 = "_outcomeEventsBackend"
            db.l.e(r6, r0)
            java.lang.String r0 = "_configModelStore"
            db.l.e(r7, r0)
            java.lang.String r0 = "_identityModelStore"
            db.l.e(r8, r0)
            java.lang.String r0 = "_subscriptionManager"
            db.l.e(r9, r0)
            java.lang.String r0 = "_deviceService"
            db.l.e(r10, r0)
            java.lang.String r0 = "_time"
            db.l.e(r11, r0)
            r1.<init>()
            r1._session = r2
            r1._influenceManager = r3
            r1._outcomeEventsCache = r4
            r1._outcomeEventsPreferences = r5
            r1._outcomeEventsBackend = r6
            r1._configModelStore = r7
            r1._identityModelStore = r8
            r1._subscriptionManager = r9
            r1._deviceService = r10
            r1._time = r11
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r1.unattributedUniqueOutcomeEventsSentOnSession = r3
            java.util.Set r3 = r5.getUnattributedUniqueOutcomeEventsSentByChannel()
            if (r3 == 0) goto L_0x005c
            java.util.Set r3 = ta.w.U(r3)
            if (r3 != 0) goto L_0x0061
        L_0x005c:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
        L_0x0061:
            r1.unattributedUniqueOutcomeEventsSentOnSession = r3
            r2.subscribe(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.<init>(com.onesignal.session.internal.session.b, t9.a, com.onesignal.session.internal.outcomes.impl.d, com.onesignal.session.internal.outcomes.impl.c, com.onesignal.session.internal.outcomes.impl.b, com.onesignal.core.internal.config.b, com.onesignal.user.internal.identity.b, com.onesignal.user.internal.subscriptions.b, q7.a, a8.a):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUniqueIds(java.lang.String r5, java.util.List<t9.b> r6, va.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.onesignal.session.internal.outcomes.impl.h.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.session.internal.outcomes.impl.h$b r0 = (com.onesignal.session.internal.outcomes.impl.h.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.h$b r0 = new com.onesignal.session.internal.outcomes.impl.h$b
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r7)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r7)
            com.onesignal.session.internal.outcomes.impl.d r7 = r4._outcomeEventsCache
            r0.label = r3
            java.lang.Object r7 = r7.getNotCachedUniqueInfluencesForOutcome(r5, r6, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.util.List r7 = (java.util.List) r7
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x0048
            r7 = 0
        L_0x0048:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.getUniqueIds(java.lang.String, java.util.List, va.d):java.lang.Object");
    }

    private final List<t9.b> removeDisabledInfluences(List<t9.b> list) {
        List<t9.b> T = w.T(list);
        for (t9.b next : list) {
            if (next.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.a.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + next.getInfluenceChannel(), (Throwable) null, 2, (Object) null);
                T.remove(next);
            }
        }
        return T;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f r10, va.d r11) {
        /*
            r9 = this;
            com.onesignal.core.internal.config.b r0 = r9._configModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.core.internal.config.a r0 = (com.onesignal.core.internal.config.a) r0
            java.lang.String r2 = r0.getAppId()
            com.onesignal.user.internal.subscriptions.b r0 = r9._subscriptionManager
            com.onesignal.user.internal.subscriptions.c r0 = r0.getSubscriptions()
            ba.b r0 = r0.getPush()
            java.lang.String r4 = r0.getId()
            w9.i$a r0 = w9.i.Companion
            q7.a r1 = r9._deviceService
            q7.a$b r1 = r1.getDeviceType()
            w9.i r0 = r0.fromDeviceType(r1)
            java.lang.String r5 = r0.getValue()
            int r0 = r4.length()
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r6 = 2
            r7 = 0
            if (r0 != 0) goto L_0x0084
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0084
            com.onesignal.session.internal.outcomes.impl.e$a r0 = com.onesignal.session.internal.outcomes.impl.e.Companion
            com.onesignal.session.internal.outcomes.impl.e r10 = r0.fromOutcomeEventParamstoOutcomeEvent(r10)
            t9.d r0 = r10.getSession()
            int[] r8 = com.onesignal.session.internal.outcomes.impl.h.a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r8[r0]
            if (r0 == r1) goto L_0x0061
            if (r0 == r6) goto L_0x005c
            r6 = r7
            goto L_0x0066
        L_0x005c:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r3)
            goto L_0x0065
        L_0x0061:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
        L_0x0065:
            r6 = r0
        L_0x0066:
            com.onesignal.session.internal.outcomes.impl.b r1 = r9._outcomeEventsBackend
            com.onesignal.user.internal.identity.b r0 = r9._identityModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.user.internal.identity.a r0 = (com.onesignal.user.internal.identity.a) r0
            java.lang.String r3 = r0.getOnesignalId()
            r7 = r10
            r8 = r11
            java.lang.Object r10 = r1.sendOutcomeEvent(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = wa.d.c()
            if (r10 != r11) goto L_0x0081
            return r10
        L_0x0081:
            sa.t r10 = sa.t.f15300a
            return r10
        L_0x0084:
            h7.a r10 = new h7.a
            r10.<init>(r3, r7, r6, r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f, va.d):java.lang.Object");
    }

    private final void saveAttributedUniqueOutcomeNotifications(f fVar) {
        com.onesignal.common.threading.a.suspendifyOnThread(10, new c(this, fVar, (va.d) null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(f fVar) {
        if (fVar.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(fVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendAndCreateOutcomeEvent(java.lang.String r22, float r23, long r24, java.util.List<t9.b> r26, va.d r27) {
        /*
            r21 = this;
            r1 = r21
            r0 = r27
            boolean r2 = r0 instanceof com.onesignal.session.internal.outcomes.impl.h.d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.session.internal.outcomes.impl.h$d r2 = (com.onesignal.session.internal.outcomes.impl.h.d) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.session.internal.outcomes.impl.h$d r2 = new com.onesignal.session.internal.outcomes.impl.h$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            sa.o.b(r0)
            goto L_0x0157
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            long r4 = r2.J$0
            java.lang.Object r8 = r2.L$2
            com.onesignal.session.internal.outcomes.impl.f r8 = (com.onesignal.session.internal.outcomes.impl.f) r8
            java.lang.Object r9 = r2.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$0
            com.onesignal.session.internal.outcomes.impl.h r10 = (com.onesignal.session.internal.outcomes.impl.h) r10
            sa.o.b(r0)     // Catch:{ a -> 0x004d }
            goto L_0x00fc
        L_0x004d:
            r0 = move-exception
            r18 = r9
            r9 = r0
            r0 = r10
            r10 = r18
            goto L_0x0112
        L_0x0056:
            sa.o.b(r0)
            a8.a r0 = r1._time
            long r8 = r0.getCurrentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r0
            long r8 = r8 / r10
            java.util.Iterator r0 = r26.iterator()
            r4 = 0
            r10 = r7
            r11 = r10
        L_0x006a:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x00c0
            java.lang.Object r12 = r0.next()
            t9.b r12 = (t9.b) r12
            t9.d r13 = r12.getInfluenceType()
            int[] r14 = com.onesignal.session.internal.outcomes.impl.h.a.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
            r14 = 3
            if (r13 == r5) goto L_0x00b4
            if (r13 == r6) goto L_0x00a8
            if (r13 == r14) goto L_0x00a6
            r14 = 4
            if (r13 == r14) goto L_0x008d
            goto L_0x006a
        L_0x008d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: "
            r13.append(r14)
            t9.c r12 = r12.getInfluenceChannel()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.onesignal.debug.internal.logging.a.verbose$default(r12, r7, r6, r7)
            goto L_0x006a
        L_0x00a6:
            r4 = 1
            goto L_0x006a
        L_0x00a8:
            if (r11 != 0) goto L_0x00af
            com.onesignal.session.internal.outcomes.impl.l r11 = new com.onesignal.session.internal.outcomes.impl.l
            r11.<init>(r7, r7, r14, r7)
        L_0x00af:
            com.onesignal.session.internal.outcomes.impl.l r11 = r1.setSourceChannelIds(r12, r11)
            goto L_0x006a
        L_0x00b4:
            if (r10 != 0) goto L_0x00bb
            com.onesignal.session.internal.outcomes.impl.l r10 = new com.onesignal.session.internal.outcomes.impl.l
            r10.<init>(r7, r7, r14, r7)
        L_0x00bb:
            com.onesignal.session.internal.outcomes.impl.l r10 = r1.setSourceChannelIds(r12, r10)
            goto L_0x006a
        L_0x00c0:
            if (r10 != 0) goto L_0x00cc
            if (r11 != 0) goto L_0x00cc
            if (r4 != 0) goto L_0x00cc
            java.lang.String r0 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels"
            com.onesignal.debug.internal.logging.a.verbose$default(r0, r7, r6, r7)
            return r7
        L_0x00cc:
            com.onesignal.session.internal.outcomes.impl.k r12 = new com.onesignal.session.internal.outcomes.impl.k
            r12.<init>(r10, r11)
            com.onesignal.session.internal.outcomes.impl.f r4 = new com.onesignal.session.internal.outcomes.impl.f
            r16 = 0
            r10 = r4
            r11 = r22
            r13 = r23
            r14 = r24
            r10.<init>(r11, r12, r13, r14, r16)
            r2.L$0 = r1     // Catch:{ a -> 0x0108 }
            r10 = r22
            r2.L$1 = r10     // Catch:{ a -> 0x0106 }
            r2.L$2 = r4     // Catch:{ a -> 0x0106 }
            r2.J$0 = r8     // Catch:{ a -> 0x0106 }
            r2.label = r5     // Catch:{ a -> 0x0106 }
            java.lang.Object r0 = r1.requestMeasureOutcomeEvent(r4, r2)     // Catch:{ a -> 0x0106 }
            if (r0 != r3) goto L_0x00f2
            return r3
        L_0x00f2:
            r18 = r10
            r10 = r1
            r19 = r8
            r8 = r4
            r4 = r19
            r9 = r18
        L_0x00fc:
            r10.saveUniqueOutcome(r8)     // Catch:{ a -> 0x004d }
            com.onesignal.session.internal.outcomes.impl.e$a r0 = com.onesignal.session.internal.outcomes.impl.e.Companion     // Catch:{ a -> 0x004d }
            com.onesignal.session.internal.outcomes.impl.e r0 = r0.fromOutcomeEventParamstoOutcomeEvent(r8)     // Catch:{ a -> 0x004d }
            return r0
        L_0x0106:
            r0 = move-exception
            goto L_0x010b
        L_0x0108:
            r0 = move-exception
            r10 = r22
        L_0x010b:
            r18 = r8
            r9 = r0
            r0 = r1
            r8 = r4
            r4 = r18
        L_0x0112:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " failed with status code: "
            r11.append(r10)
            int r10 = r9.getStatusCode()
            r11.append(r10)
            java.lang.String r10 = " and response: "
            r11.append(r10)
            java.lang.String r9 = r9.getResponse()
            r11.append(r9)
            java.lang.String r9 = "\nOutcome event was cached and will be reattempted on app cold start"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.onesignal.debug.internal.logging.a.warn$default(r9, r7, r6, r7)
            r8.setTimestamp(r4)
            com.onesignal.session.internal.outcomes.impl.d r0 = r0._outcomeEventsCache
            r2.L$0 = r7
            r2.L$1 = r7
            r2.L$2 = r7
            r2.label = r6
            java.lang.Object r0 = r0.saveOutcomeEvent(r8, r2)
            if (r0 != r3) goto L_0x0157
            return r3
        L_0x0157:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.sendAndCreateOutcomeEvent(java.lang.String, float, long, java.util.List, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.session.internal.outcomes.impl.h.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.session.internal.outcomes.impl.h$e r0 = (com.onesignal.session.internal.outcomes.impl.h.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.h$e r0 = new com.onesignal.session.internal.outcomes.impl.h$e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L_0x0045
            if (r2 == r3) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            java.lang.Object r7 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.f r7 = (com.onesignal.session.internal.outcomes.impl.f) r7
            sa.o.b(r8)     // Catch:{ a -> 0x0065 }
            goto L_0x009b
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.L$1
            com.onesignal.session.internal.outcomes.impl.f r7 = (com.onesignal.session.internal.outcomes.impl.f) r7
            java.lang.Object r2 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.h r2 = (com.onesignal.session.internal.outcomes.impl.h) r2
            sa.o.b(r8)     // Catch:{ a -> 0x0065 }
            goto L_0x0056
        L_0x0045:
            sa.o.b(r8)
            r0.L$0 = r6     // Catch:{ a -> 0x0065 }
            r0.L$1 = r7     // Catch:{ a -> 0x0065 }
            r0.label = r3     // Catch:{ a -> 0x0065 }
            java.lang.Object r8 = r6.requestMeasureOutcomeEvent(r7, r0)     // Catch:{ a -> 0x0065 }
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            com.onesignal.session.internal.outcomes.impl.d r8 = r2._outcomeEventsCache     // Catch:{ a -> 0x0065 }
            r0.L$0 = r7     // Catch:{ a -> 0x0065 }
            r0.L$1 = r4     // Catch:{ a -> 0x0065 }
            r0.label = r5     // Catch:{ a -> 0x0065 }
            java.lang.Object r7 = r8.deleteOldOutcomeEvent(r7, r0)     // Catch:{ a -> 0x0065 }
            if (r7 != r1) goto L_0x009b
            return r1
        L_0x0065:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: "
            r0.append(r1)
            java.lang.String r7 = r7.getOutcomeId()
            r0.append(r7)
            java.lang.String r7 = " failed with status code: "
            r0.append(r7)
            int r7 = r8.getStatusCode()
            r0.append(r7)
            java.lang.String r7 = " and response: "
            r0.append(r7)
            java.lang.String r7 = r8.getResponse()
            r0.append(r7)
            java.lang.String r7 = "\nOutcome event was cached and will be reattempted on app cold start"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.onesignal.debug.internal.logging.a.warn$default(r7, r4, r5, r4)
        L_0x009b:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendSavedOutcomes(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.session.internal.outcomes.impl.h.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.session.internal.outcomes.impl.h$f r0 = (com.onesignal.session.internal.outcomes.impl.h.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.h$f r0 = new com.onesignal.session.internal.outcomes.impl.h$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.h r4 = (com.onesignal.session.internal.outcomes.impl.h) r4
            sa.o.b(r6)
            goto L_0x005d
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.h r2 = (com.onesignal.session.internal.outcomes.impl.h) r2
            sa.o.b(r6)
            goto L_0x0055
        L_0x0044:
            sa.o.b(r6)
            com.onesignal.session.internal.outcomes.impl.d r6 = r5._outcomeEventsCache
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getAllEventsToSend(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r4 = r2
            r2 = r6
        L_0x005d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0076
            java.lang.Object r6 = r2.next()
            com.onesignal.session.internal.outcomes.impl.f r6 = (com.onesignal.session.internal.outcomes.impl.f) r6
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r4.sendSavedOutcomeEvent(r6, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0076:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.sendSavedOutcomes(va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendUniqueOutcomeEvent(java.lang.String r11, java.util.List<t9.b> r12, va.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.onesignal.session.internal.outcomes.impl.h.g
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.onesignal.session.internal.outcomes.impl.h$g r0 = (com.onesignal.session.internal.outcomes.impl.h.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.h$g r0 = new com.onesignal.session.internal.outcomes.impl.h$g
            r0.<init>(r10, r13)
        L_0x0018:
            r7 = r0
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r7.label
            java.lang.String r2 = "\n                    "
            java.lang.String r3 = "\n                    Outcome name: "
            r4 = 3
            r5 = 1
            r6 = 2
            r8 = 0
            if (r1 == 0) goto L_0x0053
            if (r1 == r5) goto L_0x0043
            if (r1 == r6) goto L_0x003e
            if (r1 != r4) goto L_0x0036
            sa.o.b(r13)
            goto L_0x010a
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003e:
            sa.o.b(r13)
            goto L_0x00cf
        L_0x0043:
            java.lang.Object r11 = r7.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r7.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r7.L$0
            com.onesignal.session.internal.outcomes.impl.h r1 = (com.onesignal.session.internal.outcomes.impl.h) r1
            sa.o.b(r13)
            goto L_0x0098
        L_0x0053:
            sa.o.b(r13)
            java.util.List r12 = r10.removeDisabledInfluences(r12)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x0066
            java.lang.String r11 = "OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session"
        L_0x0062:
            com.onesignal.debug.internal.logging.a.debug$default(r11, r8, r6, r8)
            return r8
        L_0x0066:
            java.util.Iterator r13 = r12.iterator()
        L_0x006a:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r13.next()
            t9.b r1 = (t9.b) r1
            t9.d r1 = r1.getInfluenceType()
            boolean r1 = r1.isAttributed()
            if (r1 == 0) goto L_0x006a
            r13 = 1
            goto L_0x0083
        L_0x0082:
            r13 = 0
        L_0x0083:
            if (r13 == 0) goto L_0x00d0
            r7.L$0 = r10
            r7.L$1 = r11
            r7.L$2 = r12
            r7.label = r5
            java.lang.Object r13 = r10.getUniqueIds(r11, r12, r7)
            if (r13 != r0) goto L_0x0094
            return r0
        L_0x0094:
            r1 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x0098:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x00bb
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "\n                    Measure endpoint will not send because unique outcome already sent for: \n                    SessionInfluences: "
            r13.append(r0)
            r13.append(r11)
            r13.append(r3)
            r13.append(r12)
            r13.append(r2)
            java.lang.String r11 = r13.toString()
        L_0x00b6:
            java.lang.String r11 = lb.i.e(r11)
            goto L_0x0062
        L_0x00bb:
            r3 = 0
            r4 = 0
            r7.L$0 = r8
            r7.L$1 = r8
            r7.L$2 = r8
            r7.label = r6
            r2 = r12
            r6 = r13
            java.lang.Object r13 = r1.sendAndCreateOutcomeEvent(r2, r3, r4, r6, r7)
            if (r13 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            return r13
        L_0x00d0:
            java.util.Set<java.lang.String> r13 = r10.unattributedUniqueOutcomeEventsSentOnSession
            boolean r13 = r13.contains(r11)
            if (r13 == 0) goto L_0x00f5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "\n                    Measure endpoint will not send because unique outcome already sent for: \n                    Session: "
            r12.append(r13)
            t9.d r13 = t9.d.UNATTRIBUTED
            r12.append(r13)
            r12.append(r3)
            r12.append(r11)
            r12.append(r2)
            java.lang.String r11 = r12.toString()
            goto L_0x00b6
        L_0x00f5:
            java.util.Set<java.lang.String> r13 = r10.unattributedUniqueOutcomeEventsSentOnSession
            r13.add(r11)
            r3 = 0
            r5 = 0
            r7.label = r4
            r1 = r10
            r2 = r11
            r4 = r5
            r6 = r12
            java.lang.Object r13 = r1.sendAndCreateOutcomeEvent(r2, r3, r4, r6, r7)
            if (r13 != r0) goto L_0x010a
            return r0
        L_0x010a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.h.sendUniqueOutcomeEvent(java.lang.String, java.util.List, va.d):java.lang.Object");
    }

    private final l setSourceChannelIds(t9.b bVar, l lVar) {
        int i10 = a.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i10 == 1) {
            lVar.setInAppMessagesIds(bVar.getIds());
        } else if (i10 == 2) {
            lVar.setNotificationIds(bVar.getIds());
        }
        return lVar;
    }

    public void onSessionActive() {
    }

    public void onSessionEnded(long j10) {
    }

    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.a.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", (Throwable) null, 2, (Object) null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    public Object sendOutcomeEvent(String str, va.d dVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0, this._influenceManager.getInfluences(), dVar);
    }

    public Object sendOutcomeEventWithValue(String str, float f10, va.d dVar) {
        return sendAndCreateOutcomeEvent(str, f10, 0, this._influenceManager.getInfluences(), dVar);
    }

    public Object sendSessionEndOutcomeEvent(long j10, va.d dVar) {
        List<t9.b> influences = this._influenceManager.getInfluences();
        for (t9.b ids : influences) {
            if (ids.getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j10, influences, dVar);
            }
        }
        return null;
    }

    public void start() {
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0186h(this, (va.d) null), 1, (Object) null);
    }

    public Object sendUniqueOutcomeEvent(String str, va.d dVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), dVar);
    }
}
