package com.onesignal.inAppMessages.internal.triggers.impl;

import cb.l;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.h;
import com.onesignal.inAppMessages.internal.m;
import com.onesignal.inAppMessages.internal.triggers.d;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sa.t;

public final class c implements com.onesignal.inAppMessages.internal.triggers.a, com.onesignal.common.modeling.c {
    private a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers = new ConcurrentHashMap<>();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.b.values().length];
            iArr[m.b.EQUAL_TO.ordinal()] = 1;
            iArr[m.b.NOT_EQUAL_TO.ordinal()] = 2;
            iArr[m.b.EXISTS.ordinal()] = 3;
            iArr[m.b.CONTAINS.ordinal()] = 4;
            iArr[m.b.NOT_EXISTS.ordinal()] = 5;
            iArr[m.b.LESS_THAN.ordinal()] = 6;
            iArr[m.b.GREATER_THAN.ordinal()] = 7;
            iArr[m.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            iArr[m.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends db.m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.triggers.c $model;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.onesignal.inAppMessages.internal.triggers.c cVar) {
            super(1);
            this.$model = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.inAppMessages.internal.triggers.b) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.inAppMessages.internal.triggers.b bVar) {
            db.l.e(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.c$c  reason: collision with other inner class name */
    static final class C0155c extends db.m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.triggers.c $model;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0155c(com.onesignal.inAppMessages.internal.triggers.c cVar) {
            super(1);
            this.$model = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.inAppMessages.internal.triggers.b) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.inAppMessages.internal.triggers.b bVar) {
            db.l.e(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    public c(d dVar, a aVar) {
        db.l.e(dVar, "triggerModelStore");
        db.l.e(aVar, "_dynamicTriggerController");
        this._dynamicTriggerController = aVar;
        dVar.subscribe((com.onesignal.common.modeling.c) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
            t tVar = t.f15300a;
        }
    }

    private final boolean evaluateAndTriggers(List<m> list) {
        for (m evaluateTrigger : list) {
            if (!evaluateTrigger(evaluateTrigger)) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(m mVar) {
        if (mVar.getKind() == m.a.UNKNOWN) {
            return false;
        }
        if (mVar.getKind() != m.a.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(mVar);
        }
        m.b operatorType = mVar.getOperatorType();
        Object obj = this.triggers.get(mVar.getProperty());
        if (obj == null) {
            return operatorType == m.b.NOT_EXISTS || (operatorType == m.b.NOT_EQUAL_TO && mVar.getValue() != null);
        }
        if (operatorType == m.b.EXISTS) {
            return true;
        }
        if (operatorType == m.b.NOT_EXISTS) {
            return false;
        }
        if (operatorType == m.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(mVar.getValue());
        }
        if ((obj instanceof String) && (mVar.getValue() instanceof String)) {
            String str = (String) mVar.getValue();
            db.l.b(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((mVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) mVar.getValue();
            db.l.b(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(mVar.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, m.b bVar) {
        if (obj == null) {
            return false;
        }
        if (bVar.checksEquality()) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj2 instanceof Number) {
                obj4 = new DecimalFormat("0.#").format(obj2);
                db.l.d(obj4, "format.format(deviceValue)");
            }
            return triggerMatchesStringValue(obj3, obj4, bVar);
        } else if (!(obj2 instanceof String) || !(obj instanceof Number)) {
            return false;
        } else {
            return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, bVar);
        }
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, m.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (a.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                break;
            case 2:
                if (!(doubleValue2 == doubleValue)) {
                    return true;
                }
                break;
            case 3:
            case 4:
            case 5:
                com.onesignal.debug.internal.logging.a.error$default("Attempted to use an invalid operator with a numeric value: " + bVar, (Throwable) null, 2, (Object) null);
                break;
            case 6:
                if (doubleValue2 < doubleValue) {
                    return true;
                }
                break;
            case 7:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                break;
            case 8:
                int i10 = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                if (i10 < 0) {
                    return true;
                }
                if (i10 == 0) {
                    return true;
                }
                break;
            case 9:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                break;
            default:
                throw new sa.l();
        }
        return false;
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, m.b bVar) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, m.b bVar) {
        int i10 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return db.l.a(str, str2);
        }
        if (i10 != 2) {
            com.onesignal.debug.internal.logging.a.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, (Throwable) null, 2, (Object) null);
        } else if (!db.l.a(str, str2)) {
            return true;
        }
        return false;
    }

    public boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        db.l.e(aVar, "message");
        if (aVar.getTriggers().isEmpty()) {
            return true;
        }
        for (List<m> evaluateAndTriggers : aVar.getTriggers()) {
            if (evaluateAndTriggers(evaluateAndTriggers)) {
                return true;
            }
        }
        return false;
    }

    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[LOOP:1: B:7:0x002a->B:21:0x002a, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a r7, java.util.Collection<java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "message"
            db.l.e(r7, r0)
            java.lang.String r0 = "triggersKeys"
            db.l.e(r8, r0)
            java.util.List r0 = r7.getTriggers()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            java.util.Iterator r8 = r8.iterator()
        L_0x0016:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r2 = r7.getTriggers()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0016
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = r3.next()
            com.onesignal.inAppMessages.internal.m r4 = (com.onesignal.inAppMessages.internal.m) r4
            java.lang.String r5 = r4.getProperty()
            boolean r5 = db.l.a(r0, r5)
            if (r5 != 0) goto L_0x005a
            java.lang.String r4 = r4.getTriggerId()
            boolean r4 = db.l.a(r0, r4)
            if (r4 == 0) goto L_0x003a
        L_0x005a:
            r7 = 1
            return r7
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.triggers.impl.c.isTriggerOnMessage(com.onesignal.inAppMessages.internal.a, java.util.Collection):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x001f A[LOOP:0: B:5:0x001f->B:20:0x001f, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "message"
            db.l.e(r6, r0)
            java.util.List r0 = r6.getTriggers()
            r1 = 0
            if (r0 == 0) goto L_0x004e
            java.util.List r0 = r6.getTriggers()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0017
            goto L_0x004e
        L_0x0017:
            java.util.List r6 = r6.getTriggers()
            java.util.Iterator r6 = r6.iterator()
        L_0x001f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r6.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r0.next()
            com.onesignal.inAppMessages.internal.m r2 = (com.onesignal.inAppMessages.internal.m) r2
            com.onesignal.inAppMessages.internal.m$a r3 = r2.getKind()
            com.onesignal.inAppMessages.internal.m$a r4 = com.onesignal.inAppMessages.internal.m.a.CUSTOM
            if (r3 == r4) goto L_0x004b
            com.onesignal.inAppMessages.internal.m$a r2 = r2.getKind()
            com.onesignal.inAppMessages.internal.m$a r3 = com.onesignal.inAppMessages.internal.m.a.UNKNOWN
            if (r2 != r3) goto L_0x002f
        L_0x004b:
            return r1
        L_0x004c:
            r6 = 1
            return r6
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.triggers.impl.c.messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a):boolean");
    }

    public void onModelUpdated(h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        g model = hVar.getModel();
        db.l.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        com.onesignal.inAppMessages.internal.triggers.c cVar = (com.onesignal.inAppMessages.internal.triggers.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new C0155c(cVar));
    }

    public void subscribe(com.onesignal.inAppMessages.internal.triggers.b bVar) {
        db.l.e(bVar, "handler");
        this._dynamicTriggerController.subscribe(bVar);
    }

    public void unsubscribe(com.onesignal.inAppMessages.internal.triggers.b bVar) {
        db.l.e(bVar, "handler");
        this._dynamicTriggerController.unsubscribe(bVar);
    }

    public void onModelAdded(com.onesignal.inAppMessages.internal.triggers.c cVar, String str) {
        db.l.e(cVar, "model");
        db.l.e(str, "tag");
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    public void onModelRemoved(com.onesignal.inAppMessages.internal.triggers.c cVar, String str) {
        db.l.e(cVar, "model");
        db.l.e(str, "tag");
        removeTriggersForKeys(cVar.getKey());
    }
}
