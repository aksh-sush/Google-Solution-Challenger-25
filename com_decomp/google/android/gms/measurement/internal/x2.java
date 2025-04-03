package com.google.android.gms.measurement.internal;

import h4.b;

public final class x2 {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f6588h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f6589a;

    /* renamed from: b  reason: collision with root package name */
    private final v2 f6590b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6591c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6592d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f6593e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f6594f = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile Object f6595g = null;

    /* synthetic */ x2(String str, Object obj, Object obj2, v2 v2Var, b bVar) {
        this.f6589a = str;
        this.f6591c = obj;
        this.f6592d = obj2;
        this.f6590b = v2Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6593e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.b r4 = com.google.android.gms.measurement.internal.w2.f6515a
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = f6588h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.b.a()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r3.f6595g     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x001b
            java.lang.Object r0 = r3.f6591c     // Catch:{ all -> 0x0068 }
            goto L_0x001d
        L_0x001b:
            java.lang.Object r0 = r3.f6595g     // Catch:{ all -> 0x0068 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            java.util.List r4 = com.google.android.gms.measurement.internal.y2.f6612a     // Catch:{ SecurityException -> 0x0055 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0055 }
        L_0x0028:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0055 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0055 }
            com.google.android.gms.measurement.internal.x2 r0 = (com.google.android.gms.measurement.internal.x2) r0     // Catch:{ SecurityException -> 0x0055 }
            boolean r1 = com.google.android.gms.measurement.internal.b.a()     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x004d
            r1 = 0
            com.google.android.gms.measurement.internal.v2 r2 = r0.f6590b     // Catch:{ IllegalStateException -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0043 }
        L_0x0043:
            java.lang.Object r2 = f6588h     // Catch:{ SecurityException -> 0x0055 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0055 }
            r0.f6595g = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0028
        L_0x004a:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x004d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0055 }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x0055:
        L_0x0056:
            com.google.android.gms.measurement.internal.v2 r4 = r3.f6590b
            if (r4 != 0) goto L_0x005d
            java.lang.Object r4 = r3.f6591c
            return r4
        L_0x005d:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0065, IllegalStateException -> 0x0062 }
            return r4
        L_0x0062:
            java.lang.Object r4 = r3.f6591c
            return r4
        L_0x0065:
            java.lang.Object r4 = r3.f6591c
            return r4
        L_0x0068:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            java.lang.Object r4 = r3.f6591c
            return r4
        L_0x006e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x2.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f6589a;
    }
}
