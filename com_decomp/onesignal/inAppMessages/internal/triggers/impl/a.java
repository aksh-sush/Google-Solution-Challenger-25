package com.onesignal.inAppMessages.internal.triggers.impl;

import cb.l;
import com.onesignal.inAppMessages.internal.m;
import db.g;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import sa.t;

public final class a implements com.onesignal.common.events.d {
    public static final C0153a Companion = new C0153a((g) null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final com.onesignal.session.internal.session.b _session;
    private final o8.a _state;
    private final a8.a _time;
    private final com.onesignal.common.events.b events = new com.onesignal.common.events.b();
    /* access modifiers changed from: private */
    public final List<String> scheduledMessages = new ArrayList();

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a  reason: collision with other inner class name */
    public static final class C0153a {
        private C0153a() {
        }

        public /* synthetic */ C0153a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[m.a.values().length];
            iArr[m.a.SESSION_TIME.ordinal()] = 1;
            iArr[m.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[m.b.values().length];
            iArr2[m.b.LESS_THAN.ordinal()] = 1;
            iArr2[m.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            iArr2[m.b.GREATER_THAN.ordinal()] = 3;
            iArr2[m.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            iArr2[m.b.EQUAL_TO.ordinal()] = 5;
            iArr2[m.b.NOT_EQUAL_TO.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static final class c extends db.m implements l {
        final /* synthetic */ String $triggerId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$triggerId = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.inAppMessages.internal.triggers.b) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.inAppMessages.internal.triggers.b bVar) {
            db.l.e(bVar, "it");
            bVar.onTriggerCompleted(this.$triggerId);
        }
    }

    public static final class d extends TimerTask {
        final /* synthetic */ String $triggerId;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$d$a  reason: collision with other inner class name */
        static final class C0154a extends db.m implements l {
            public static final C0154a INSTANCE = new C0154a();

            C0154a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.inAppMessages.internal.triggers.b) obj);
                return t.f15300a;
            }

            public final void invoke(com.onesignal.inAppMessages.internal.triggers.b bVar) {
                db.l.e(bVar, "it");
                bVar.onTriggerConditionChanged();
            }
        }

        d(a aVar, String str) {
            this.this$0 = aVar;
            this.$triggerId = str;
        }

        public void run() {
            this.this$0.scheduledMessages.remove(this.$triggerId);
            this.this$0.getEvents().fire(C0154a.INSTANCE);
        }
    }

    public a(o8.a aVar, com.onesignal.session.internal.session.b bVar, a8.a aVar2) {
        db.l.e(aVar, "_state");
        db.l.e(bVar, "_session");
        db.l.e(aVar2, "_time");
        this._state = aVar;
        this._session = bVar;
        this._time = aVar2;
    }

    private final boolean evaluateTimeIntervalWithOperator(double d10, double d11, m.b bVar) {
        switch (b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                if (d11 < d10) {
                    return true;
                }
                break;
            case 2:
                if (d11 <= d10 || roughlyEqual(d10, d11)) {
                    return true;
                }
                break;
            case 3:
                if (d11 >= d10) {
                    return true;
                }
                break;
            case 4:
                if (d11 >= d10 || roughlyEqual(d10, d11)) {
                    return true;
                }
                break;
            case 5:
                return roughlyEqual(d10, d11);
            case 6:
                if (!roughlyEqual(d10, d11)) {
                    return true;
                }
                break;
            default:
                com.onesignal.debug.internal.logging.a.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, (Throwable) null, 2, (Object) null);
                break;
        }
        return false;
    }

    private final boolean roughlyEqual(double d10, double d11) {
        return Math.abs(d10 - d11) < REQUIRED_ACCURACY;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dynamicTriggerShouldFire(com.onesignal.inAppMessages.internal.m r18) {
        /*
            r17 = this;
            r7 = r17
            java.lang.String r0 = "trigger"
            r1 = r18
            db.l.e(r1, r0)
            java.lang.Object r0 = r18.getValue()
            r8 = 0
            if (r0 != 0) goto L_0x0011
            return r8
        L_0x0011:
            java.util.List<java.lang.String> r9 = r7.scheduledMessages
            monitor-enter(r9)
            java.lang.Object r0 = r18.getValue()     // Catch:{ all -> 0x00ba }
            boolean r0 = r0 instanceof java.lang.Number     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x001e
            monitor-exit(r9)
            return r8
        L_0x001e:
            com.onesignal.inAppMessages.internal.m$a r0 = r18.getKind()     // Catch:{ all -> 0x00ba }
            int[] r2 = com.onesignal.inAppMessages.internal.triggers.impl.a.b.$EnumSwitchMapping$0     // Catch:{ all -> 0x00ba }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00ba }
            r0 = r2[r0]     // Catch:{ all -> 0x00ba }
            r10 = 1
            if (r0 == r10) goto L_0x0054
            r2 = 2
            if (r0 == r2) goto L_0x0033
            r13 = 0
            goto L_0x0062
        L_0x0033:
            o8.a r0 = r7._state     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.getInAppMessageIdShowing()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x003d
            monitor-exit(r9)
            return r8
        L_0x003d:
            o8.a r0 = r7._state     // Catch:{ all -> 0x00ba }
            java.lang.Long r0 = r0.getLastTimeInAppDismissed()     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x0049
            r2 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x0061
        L_0x0049:
            a8.a r2 = r7._time     // Catch:{ all -> 0x00ba }
            long r2 = r2.getCurrentTimeMillis()     // Catch:{ all -> 0x00ba }
            long r4 = r0.longValue()     // Catch:{ all -> 0x00ba }
            goto L_0x0060
        L_0x0054:
            a8.a r0 = r7._time     // Catch:{ all -> 0x00ba }
            long r2 = r0.getCurrentTimeMillis()     // Catch:{ all -> 0x00ba }
            com.onesignal.session.internal.session.b r0 = r7._session     // Catch:{ all -> 0x00ba }
            long r4 = r0.getStartTime()     // Catch:{ all -> 0x00ba }
        L_0x0060:
            long r2 = r2 - r4
        L_0x0061:
            r13 = r2
        L_0x0062:
            java.lang.String r0 = r18.getTriggerId()     // Catch:{ all -> 0x00ba }
            java.lang.Object r2 = r18.getValue()     // Catch:{ all -> 0x00ba }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x00ba }
            db.l.b(r2)     // Catch:{ all -> 0x00ba }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x00ba }
            r4 = 1000(0x3e8, float:1.401E-42)
            double r4 = (double) r4     // Catch:{ all -> 0x00ba }
            double r2 = r2 * r4
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            double r2 = (double) r4     // Catch:{ all -> 0x00ba }
            double r11 = (double) r13     // Catch:{ all -> 0x00ba }
            com.onesignal.inAppMessages.internal.m$b r6 = r18.getOperatorType()     // Catch:{ all -> 0x00ba }
            r1 = r17
            r15 = r4
            r4 = r11
            boolean r1 = r1.evaluateTimeIntervalWithOperator(r2, r4, r6)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0095
            com.onesignal.common.events.b r1 = r7.events     // Catch:{ all -> 0x00ba }
            com.onesignal.inAppMessages.internal.triggers.impl.a$c r2 = new com.onesignal.inAppMessages.internal.triggers.impl.a$c     // Catch:{ all -> 0x00ba }
            r2.<init>(r0)     // Catch:{ all -> 0x00ba }
            r1.fire(r2)     // Catch:{ all -> 0x00ba }
            monitor-exit(r9)
            return r10
        L_0x0095:
            long r4 = r15 - r13
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x009f
            monitor-exit(r9)
            return r8
        L_0x009f:
            java.util.List<java.lang.String> r1 = r7.scheduledMessages     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00a9
            monitor-exit(r9)
            return r8
        L_0x00a9:
            com.onesignal.inAppMessages.internal.triggers.impl.b r1 = com.onesignal.inAppMessages.internal.triggers.impl.b.INSTANCE     // Catch:{ all -> 0x00ba }
            com.onesignal.inAppMessages.internal.triggers.impl.a$d r2 = new com.onesignal.inAppMessages.internal.triggers.impl.a$d     // Catch:{ all -> 0x00ba }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x00ba }
            r1.scheduleTrigger(r2, r0, r4)     // Catch:{ all -> 0x00ba }
            java.util.List<java.lang.String> r1 = r7.scheduledMessages     // Catch:{ all -> 0x00ba }
            r1.add(r0)     // Catch:{ all -> 0x00ba }
            monitor-exit(r9)
            return r8
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.triggers.impl.a.dynamicTriggerShouldFire(com.onesignal.inAppMessages.internal.m):boolean");
    }

    public final com.onesignal.common.events.b getEvents() {
        return this.events;
    }

    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public void subscribe(com.onesignal.inAppMessages.internal.triggers.b bVar) {
        db.l.e(bVar, "handler");
        this.events.subscribe(bVar);
    }

    public void unsubscribe(com.onesignal.inAppMessages.internal.triggers.b bVar) {
        db.l.e(bVar, "handler");
        this.events.unsubscribe(bVar);
    }
}
