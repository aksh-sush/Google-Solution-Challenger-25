package com.onesignal.core.internal.preferences.impl;

import android.content.SharedPreferences;
import cb.p;
import db.g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.h0;
import mb.h1;
import mb.j0;
import mb.o0;
import mb.w0;
import sa.q;
import sa.t;
import va.d;

public final class a implements y7.a, z7.b {
    public static final C0134a Companion = new C0134a((g) null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    /* access modifiers changed from: private */
    public final a8.a _time;
    /* access modifiers changed from: private */
    public final Map<String, Map<String, Object>> prefsToApply = f0.f(q.a("OneSignal", new LinkedHashMap()), q.a("GTPlayerPurchases", new LinkedHashMap()));
    private o0 queueJob;
    /* access modifiers changed from: private */
    public final com.onesignal.common.threading.b waiter = new com.onesignal.common.threading.b();

    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a  reason: collision with other inner class name */
    public static final class C0134a {
        private C0134a() {
        }

        public /* synthetic */ C0134a(g gVar) {
            this();
        }
    }

    static final class b extends l implements p {
        long J$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        public final d create(Object obj, d dVar) {
            return new b(this.this$0, dVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x0116 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[Catch:{ all -> 0x0116 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[Catch:{ all -> 0x0116 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0115 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1 A[EDGE_INSN: B:72:0x00e1->B:54:0x00e1 ?: BREAK  , SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r13.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                long r4 = r13.J$0
                sa.o.b(r14)     // Catch:{ all -> 0x0024 }
                goto L_0x0036
            L_0x0014:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001c:
                long r4 = r13.J$0
                sa.o.b(r14)     // Catch:{ all -> 0x0024 }
                r14 = r13
                goto L_0x0105
            L_0x0024:
                r14 = move-exception
                r1 = r0
                r0 = r13
                goto L_0x011b
            L_0x0029:
                sa.o.b(r14)
                com.onesignal.core.internal.preferences.impl.a r14 = r13.this$0
                a8.a r14 = r14._time
                long r4 = r14.getCurrentTimeMillis()
            L_0x0036:
                r14 = r13
            L_0x0037:
                com.onesignal.core.internal.preferences.impl.a r1 = r14.this$0     // Catch:{ all -> 0x0116 }
                java.util.Map r1 = r1.prefsToApply     // Catch:{ all -> 0x0116 }
                java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0116 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0116 }
            L_0x0045:
                boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0116 }
                if (r6 == 0) goto L_0x00e1
                java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0116 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0116 }
                com.onesignal.core.internal.preferences.impl.a r7 = r14.this$0     // Catch:{ all -> 0x0116 }
                java.util.Map r7 = r7.prefsToApply     // Catch:{ all -> 0x0116 }
                java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0116 }
                db.l.b(r7)     // Catch:{ all -> 0x0116 }
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x0116 }
                com.onesignal.core.internal.preferences.impl.a r8 = r14.this$0     // Catch:{ all -> 0x0116 }
                android.content.SharedPreferences r6 = r8.getSharedPrefsByName(r6)     // Catch:{ all -> 0x0116 }
                if (r6 != 0) goto L_0x0072
                com.onesignal.core.internal.preferences.impl.a r6 = r14.this$0     // Catch:{ all -> 0x0116 }
                com.onesignal.common.threading.b r6 = r6.waiter     // Catch:{ all -> 0x0116 }
                r6.wake()     // Catch:{ all -> 0x0116 }
                goto L_0x0045
            L_0x0072:
                android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0116 }
                monitor-enter(r7)     // Catch:{ all -> 0x0116 }
                java.util.Set r8 = r7.keySet()     // Catch:{ all -> 0x00de }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00de }
            L_0x007f:
                boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00de }
                if (r9 == 0) goto L_0x00d3
                java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00de }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00de }
                java.lang.Object r10 = r7.get(r9)     // Catch:{ all -> 0x00de }
                boolean r11 = r10 instanceof java.lang.String     // Catch:{ all -> 0x00de }
                if (r11 == 0) goto L_0x0099
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00de }
                r6.putString(r9, r10)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x0099:
                boolean r11 = r10 instanceof java.lang.Boolean     // Catch:{ all -> 0x00de }
                if (r11 == 0) goto L_0x00a7
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00de }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00de }
                r6.putBoolean(r9, r10)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x00a7:
                boolean r11 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x00de }
                if (r11 == 0) goto L_0x00b5
                java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x00de }
                int r10 = r10.intValue()     // Catch:{ all -> 0x00de }
                r6.putInt(r9, r10)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x00b5:
                boolean r11 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x00de }
                if (r11 == 0) goto L_0x00c3
                java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x00de }
                long r10 = r10.longValue()     // Catch:{ all -> 0x00de }
                r6.putLong(r9, r10)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x00c3:
                boolean r11 = r10 instanceof java.util.Set     // Catch:{ all -> 0x00de }
                if (r11 == 0) goto L_0x00cd
                java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x00de }
                r6.putStringSet(r9, r10)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x00cd:
                if (r10 != 0) goto L_0x007f
                r6.remove(r9)     // Catch:{ all -> 0x00de }
                goto L_0x007f
            L_0x00d3:
                r7.clear()     // Catch:{ all -> 0x00de }
                sa.t r8 = sa.t.f15300a     // Catch:{ all -> 0x00de }
                monitor-exit(r7)     // Catch:{ all -> 0x0116 }
                r6.apply()     // Catch:{ all -> 0x0116 }
                goto L_0x0045
            L_0x00de:
                r1 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0116 }
                throw r1     // Catch:{ all -> 0x0116 }
            L_0x00e1:
                com.onesignal.core.internal.preferences.impl.a r1 = r14.this$0     // Catch:{ all -> 0x0116 }
                a8.a r1 = r1._time     // Catch:{ all -> 0x0116 }
                long r6 = r1.getCurrentTimeMillis()     // Catch:{ all -> 0x0116 }
                long r4 = r4 - r6
                r1 = 200(0xc8, float:2.8E-43)
                long r8 = (long) r1
                long r4 = r4 + r8
                r8 = 0
                int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r1 <= 0) goto L_0x0104
                r14.J$0 = r6     // Catch:{ all -> 0x0101 }
                r14.label = r3     // Catch:{ all -> 0x0101 }
                java.lang.Object r1 = mb.r0.a(r4, r14)     // Catch:{ all -> 0x0101 }
                if (r1 != r0) goto L_0x0104
                return r0
            L_0x0101:
                r1 = move-exception
                r4 = r6
                goto L_0x0117
            L_0x0104:
                r4 = r6
            L_0x0105:
                com.onesignal.core.internal.preferences.impl.a r1 = r14.this$0     // Catch:{ all -> 0x0116 }
                com.onesignal.common.threading.b r1 = r1.waiter     // Catch:{ all -> 0x0116 }
                r14.J$0 = r4     // Catch:{ all -> 0x0116 }
                r14.label = r2     // Catch:{ all -> 0x0116 }
                java.lang.Object r1 = r1.waitForWake(r14)     // Catch:{ all -> 0x0116 }
                if (r1 != r0) goto L_0x0037
                return r0
            L_0x0116:
                r1 = move-exception
            L_0x0117:
                r12 = r0
                r0 = r14
                r14 = r1
                r1 = r12
            L_0x011b:
                c8.b r6 = c8.b.ERROR
                java.lang.String r7 = "Error with Preference work loop"
                com.onesignal.debug.internal.logging.a.log(r6, r7, r14)
                r14 = r0
                r0 = r1
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.preferences.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(h0 h0Var, d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(f fVar, a8.a aVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_time");
        this._applicationService = fVar;
        this._time = aVar;
    }

    private final o0 doWorkAsync() {
        return j.b(h1.f13395e, w0.b(), (j0) null, new b(this, (d) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r7 = getSharedPrefsByName(r7);
        r0 = 0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r7 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (db.l.a(r9, java.lang.String.class) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (db.l.a(r9, java.lang.Boolean.TYPE) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r4 = (java.lang.Boolean) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r4 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r4 = r4.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (db.l.a(r9, java.lang.Integer.TYPE) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r4 = (java.lang.Integer) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r4 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r4 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (db.l.a(r9, java.lang.Long.TYPE) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r4 = (java.lang.Long) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        if (r4 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r4 = r4.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (db.l.a(r9, java.util.Set.class) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        if (db.l.a(r9, java.lang.String.class) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (db.l.a(r9, java.lang.Boolean.TYPE) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r10 = (java.lang.Boolean) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        if (r10 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r3 = r10.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (db.l.a(r9, java.lang.Integer.TYPE) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        r10 = (java.lang.Integer) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r10 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r3 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        if (db.l.a(r9, java.lang.Long.TYPE) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r10 = (java.lang.Long) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e4, code lost:
        if (r10 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e6, code lost:
        r0 = r10.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if (db.l.a(r9, java.util.Set.class) != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r7.getStringSet(r8, (java.util.Set) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r7.getString(r8, (java.lang.String) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return java.lang.Boolean.valueOf(r7.getBoolean(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return java.lang.Integer.valueOf(r7.getInt(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return java.lang.Long.valueOf(r7.getLong(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return (java.util.Set) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return (java.lang.String) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object get(java.lang.String r7, java.lang.String r8, java.lang.Class<?> r9, java.lang.Object r10) {
        /*
            r6 = this;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.prefsToApply
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0100
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.prefsToApply
            java.lang.Object r0 = r0.get(r7)
            db.l.b(r0)
            java.util.Map r0 = (java.util.Map) r0
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r8)     // Catch:{ all -> 0x00fd }
            if (r1 != 0) goto L_0x00fb
            boolean r2 = r0.containsKey(r8)     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0022
            goto L_0x00fb
        L_0x0022:
            sa.t r1 = sa.t.f15300a     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)
            android.content.SharedPreferences r7 = r6.getSharedPrefsByName(r7)
            r0 = 0
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L_0x00a4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r4 = db.l.a(r9, r4)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x003f
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = r7.getString(r8, r4)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a2
        L_0x003f:
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00a3 }
            boolean r4 = db.l.a(r9, r4)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x005b
            r4 = r10
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            boolean r7 = r7.getBoolean(r8, r4)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a2
        L_0x005b:
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a3 }
            boolean r4 = db.l.a(r9, r4)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x0077
            r4 = r10
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x006d
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            int r7 = r7.getInt(r8, r4)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a2
        L_0x0077:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00a3 }
            boolean r4 = db.l.a(r9, r4)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x0093
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x0089
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x008a
        L_0x0089:
            r4 = r0
        L_0x008a:
            long r7 = r7.getLong(r8, r4)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a2
        L_0x0093:
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            boolean r4 = db.l.a(r9, r4)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x00a2
            r4 = r10
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ Exception -> 0x00a3 }
            java.util.Set r2 = r7.getStringSet(r8, r4)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a2:
            return r2
        L_0x00a3:
        L_0x00a4:
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r7 = db.l.a(r9, r7)
            if (r7 == 0) goto L_0x00b0
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fa
        L_0x00b0:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r7 = db.l.a(r9, r7)
            if (r7 == 0) goto L_0x00c5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x00c0
            boolean r3 = r10.booleanValue()
        L_0x00c0:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            goto L_0x00fa
        L_0x00c5:
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r7 = db.l.a(r9, r7)
            if (r7 == 0) goto L_0x00da
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x00d5
            int r3 = r10.intValue()
        L_0x00d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x00fa
        L_0x00da:
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = db.l.a(r9, r7)
            if (r7 == 0) goto L_0x00ef
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x00ea
            long r0 = r10.longValue()
        L_0x00ea:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x00fa
        L_0x00ef:
            java.lang.Class<java.util.Set> r7 = java.util.Set.class
            boolean r7 = db.l.a(r9, r7)
            if (r7 == 0) goto L_0x00fa
            r2 = r10
            java.util.Set r2 = (java.util.Set) r2
        L_0x00fa:
            return r2
        L_0x00fb:
            monitor-exit(r0)
            return r1
        L_0x00fd:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L_0x0100:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Store not found: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.preferences.impl.a.get(java.lang.String, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) {
        if (this.prefsToApply.containsKey(str)) {
            Map<String, Object> map = this.prefsToApply.get(str);
            db.l.b(map);
            Map map2 = map;
            synchronized (map2) {
                map2.put(str2, obj);
                t tVar = t.f15300a;
            }
            this.waiter.wake();
            return;
        }
        throw new Exception("Store not found: " + str);
    }

    public Boolean getBool(String str, String str2, Boolean bool) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        return (Boolean) get(str, str2, Boolean.TYPE, bool);
    }

    public Integer getInt(String str, String str2, Integer num) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        return (Integer) get(str, str2, Integer.TYPE, num);
    }

    public Long getLong(String str, String str2, Long l10) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        return (Long) get(str, str2, Long.TYPE, l10);
    }

    public String getString(String str, String str2, String str3) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        return (String) get(str, str2, String.class, str3);
    }

    public Set<String> getStringSet(String str, String str2, Set<String> set) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        return (Set) get(str, str2, Set.class, set);
    }

    public void saveBool(String str, String str2, Boolean bool) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        save(str, str2, bool);
    }

    public void saveInt(String str, String str2, Integer num) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        save(str, str2, num);
    }

    public void saveLong(String str, String str2, Long l10) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        save(str, str2, l10);
    }

    public void saveString(String str, String str2, String str3) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        save(str, str2, str3);
    }

    public void saveStringSet(String str, String str2, Set<String> set) {
        db.l.e(str, "store");
        db.l.e(str2, "key");
        save(str, str2, set);
    }

    public void start() {
        this.queueJob = doWorkAsync();
    }
}
