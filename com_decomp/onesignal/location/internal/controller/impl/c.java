package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import cb.p;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import db.l;
import db.m;
import db.r;
import db.t;
import java.io.Closeable;
import mb.h0;
import sa.o;

public final class c implements t8.a {
    /* access modifiers changed from: private */
    public final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final com.onesignal.common.events.b event = new com.onesignal.common.events.b();
    /* access modifiers changed from: private */
    public FusedLocationProviderClient hmsFusedLocationClient;
    /* access modifiers changed from: private */
    public Location lastLocation;
    /* access modifiers changed from: private */
    public final a locationHandlerThread = new a();
    /* access modifiers changed from: private */
    public b locationUpdateListener;
    /* access modifiers changed from: private */
    public final kotlinx.coroutines.sync.b startStopMutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);

    public static final class a extends HandlerThread {
        private Handler mHandler = new Handler(getLooper());

        public a() {
            super("OSH_LocationHandlerThread");
            start();
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            l.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements l7.e, Closeable {
        private final l7.f _applicationService;
        private final c _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(c cVar, l7.f fVar, FusedLocationProviderClient fusedLocationProviderClient) {
            l.e(cVar, "_parent");
            l.e(fVar, "_applicationService");
            l.e(fusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = cVar;
            this._applicationService = fVar;
            this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates((LocationCallback) this);
            }
            long j10 = this._applicationService.isInForeground() ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (((double) j10) * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.a.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", (Throwable) null, 2, (Object) null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, (LocationCallback) this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates((LocationCallback) this);
            }
        }

        public void onFocus() {
            com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            l.e(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.a.debug$default("HMSLocationController onLocationResult: " + locationResult, (Throwable) null, 2, (Object) null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        public void onUnfocused() {
            com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.c$c  reason: collision with other inner class name */
    static final class C0161c extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ t $retVal;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0161c(FusedLocationProviderClient fusedLocationProviderClient, t tVar, va.d dVar) {
            super(1, dVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = tVar;
        }

        /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        private static final void m7invokeSuspend$lambda0(t tVar, t tVar2, Location location) {
            com.onesignal.debug.internal.logging.a.warn$default("Huawei LocationServices getLastLocation returned location: " + location, (Throwable) null, 2, (Object) null);
            if (location != null) {
                tVar2.f9426e = location;
            }
            ((com.onesignal.common.threading.b) tVar.f9426e).wake();
        }

        /* renamed from: invokeSuspend$lambda-1  reason: not valid java name */
        private static final void m8invokeSuspend$lambda1(t tVar, Exception exc) {
            com.onesignal.debug.internal.logging.a.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.b) tVar.f9426e).wake();
        }

        public final va.d create(va.d dVar) {
            return new C0161c(this.$locationClient, this.$retVal, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                t tVar = new t();
                tVar.f9426e = new com.onesignal.common.threading.b();
                this.$locationClient.getLastLocation().addOnSuccessListener(new d(tVar, this.$retVal)).addOnFailureListener(new e(tVar));
                this.label = 1;
                if (((com.onesignal.common.threading.b) tVar.f9426e).waitForWake(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((C0161c) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.start(this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ t $self;
        final /* synthetic */ r $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ c this$0;

        static final class a extends m implements cb.l {
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.b) obj);
                return sa.t.f15300a;
            }

            public final void invoke(t8.b bVar) {
                l.e(bVar, "it");
                Location access$getLastLocation$p = this.this$0.lastLocation;
                l.b(access$getLastLocation$p);
                bVar.onLocationChanged(access$getLastLocation$p);
            }
        }

        static final class b extends m implements cb.l {
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.b) obj);
                return sa.t.f15300a;
            }

            public final void invoke(t8.b bVar) {
                l.e(bVar, "it");
                Location access$getLastLocation$p = this.this$0.lastLocation;
                l.b(access$getLastLocation$p);
                bVar.onLocationChanged(access$getLastLocation$p);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, r rVar, t tVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$wasSuccessful = rVar;
            this.$self = tVar;
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-0  reason: not valid java name */
        private static final void m9invokeSuspend$lambda2$lambda0(t tVar, c cVar, Location location) {
            com.onesignal.common.threading.c cVar2;
            Boolean bool;
            com.onesignal.debug.internal.logging.a.warn$default("Huawei LocationServices getLastLocation returned location: " + location, (Throwable) null, 2, (Object) null);
            if (location == null) {
                cVar2 = (com.onesignal.common.threading.c) tVar.f9426e;
                bool = Boolean.FALSE;
            } else {
                cVar.lastLocation = location;
                cVar2 = (com.onesignal.common.threading.c) tVar.f9426e;
                bool = Boolean.TRUE;
            }
            cVar2.wake(bool);
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-1  reason: not valid java name */
        private static final void m10invokeSuspend$lambda2$lambda1(t tVar, Exception exc) {
            com.onesignal.debug.internal.logging.a.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.c) tVar.f9426e).wake(Boolean.FALSE);
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, this.$wasSuccessful, this.$self, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ff A[Catch:{ all -> 0x0028 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r10.label
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L_0x0048
                if (r1 == r2) goto L_0x0033
                if (r1 != r3) goto L_0x002b
                java.lang.Object r0 = r10.L$4
                db.r r0 = (db.r) r0
                java.lang.Object r1 = r10.L$3
                db.t r1 = (db.t) r1
                java.lang.Object r2 = r10.L$2
                db.r r2 = (db.r) r2
                java.lang.Object r3 = r10.L$1
                com.onesignal.location.internal.controller.impl.c r3 = (com.onesignal.location.internal.controller.impl.c) r3
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.b) r5
                sa.o.b(r11)     // Catch:{ all -> 0x0028 }
                goto L_0x00f3
            L_0x0028:
                r11 = move-exception
                goto L_0x012f
            L_0x002b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0033:
                java.lang.Object r1 = r10.L$3
                db.t r1 = (db.t) r1
                java.lang.Object r2 = r10.L$2
                db.r r2 = (db.r) r2
                java.lang.Object r5 = r10.L$1
                com.onesignal.location.internal.controller.impl.c r5 = (com.onesignal.location.internal.controller.impl.c) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.b) r6
                sa.o.b(r11)
                r11 = r6
                goto L_0x006b
            L_0x0048:
                sa.o.b(r11)
                com.onesignal.location.internal.controller.impl.c r11 = r10.this$0
                kotlinx.coroutines.sync.b r11 = r11.startStopMutex
                com.onesignal.location.internal.controller.impl.c r1 = r10.this$0
                db.r r5 = r10.$wasSuccessful
                db.t r6 = r10.$self
                r10.L$0 = r11
                r10.L$1 = r1
                r10.L$2 = r5
                r10.L$3 = r6
                r10.label = r2
                java.lang.Object r2 = r11.b(r4, r10)
                if (r2 != r0) goto L_0x0068
                return r0
            L_0x0068:
                r2 = r5
                r5 = r1
                r1 = r6
            L_0x006b:
                com.huawei.hms.location.FusedLocationProviderClient r6 = r5.hmsFusedLocationClient     // Catch:{ all -> 0x012c }
                if (r6 != 0) goto L_0x009b
                l7.f r6 = r5._applicationService     // Catch:{ Exception -> 0x0081 }
                android.content.Context r6 = r6.getAppContext()     // Catch:{ Exception -> 0x0081 }
                com.huawei.hms.location.FusedLocationProviderClient r6 = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(r6)     // Catch:{ Exception -> 0x0081 }
                r5.hmsFusedLocationClient = r6     // Catch:{ Exception -> 0x0081 }
                goto L_0x009b
            L_0x0081:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
                r1.<init>()     // Catch:{ all -> 0x012c }
                java.lang.String r5 = "Huawei LocationServices getFusedLocationProviderClient failed! "
                r1.append(r5)     // Catch:{ all -> 0x012c }
                r1.append(r0)     // Catch:{ all -> 0x012c }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x012c }
                com.onesignal.debug.internal.logging.a.error$default(r0, r4, r3, r4)     // Catch:{ all -> 0x012c }
                r0 = 0
                r2.f9424e = r0     // Catch:{ all -> 0x012c }
                goto L_0x0123
            L_0x009b:
                android.location.Location r6 = r5.lastLocation     // Catch:{ all -> 0x012c }
                if (r6 == 0) goto L_0x00af
                com.onesignal.common.events.b r0 = r5.event     // Catch:{ all -> 0x012c }
                com.onesignal.location.internal.controller.impl.c$e$a r1 = new com.onesignal.location.internal.controller.impl.c$e$a     // Catch:{ all -> 0x012c }
                r1.<init>(r5)     // Catch:{ all -> 0x012c }
                r0.fire(r1)     // Catch:{ all -> 0x012c }
                goto L_0x0123
            L_0x00af:
                db.t r6 = new db.t     // Catch:{ all -> 0x012c }
                r6.<init>()     // Catch:{ all -> 0x012c }
                com.onesignal.common.threading.c r7 = new com.onesignal.common.threading.c     // Catch:{ all -> 0x012c }
                r7.<init>()     // Catch:{ all -> 0x012c }
                r6.f9426e = r7     // Catch:{ all -> 0x012c }
                com.huawei.hms.location.FusedLocationProviderClient r7 = r5.hmsFusedLocationClient     // Catch:{ all -> 0x012c }
                db.l.b(r7)     // Catch:{ all -> 0x012c }
                com.huawei.hmf.tasks.Task r7 = r7.getLastLocation()     // Catch:{ all -> 0x012c }
                com.onesignal.location.internal.controller.impl.f r8 = new com.onesignal.location.internal.controller.impl.f     // Catch:{ all -> 0x012c }
                r8.<init>(r6, r5)     // Catch:{ all -> 0x012c }
                com.huawei.hmf.tasks.Task r7 = r7.addOnSuccessListener(r8)     // Catch:{ all -> 0x012c }
                com.onesignal.location.internal.controller.impl.e r8 = new com.onesignal.location.internal.controller.impl.e     // Catch:{ all -> 0x012c }
                r8.<init>(r6)     // Catch:{ all -> 0x012c }
                r7.addOnFailureListener(r8)     // Catch:{ all -> 0x012c }
                java.lang.Object r6 = r6.f9426e     // Catch:{ all -> 0x012c }
                com.onesignal.common.threading.c r6 = (com.onesignal.common.threading.c) r6     // Catch:{ all -> 0x012c }
                r10.L$0 = r11     // Catch:{ all -> 0x012c }
                r10.L$1 = r5     // Catch:{ all -> 0x012c }
                r10.L$2 = r2     // Catch:{ all -> 0x012c }
                r10.L$3 = r1     // Catch:{ all -> 0x012c }
                r10.L$4 = r2     // Catch:{ all -> 0x012c }
                r10.label = r3     // Catch:{ all -> 0x012c }
                java.lang.Object r3 = r6.waitForWake(r10)     // Catch:{ all -> 0x012c }
                if (r3 != r0) goto L_0x00ee
                return r0
            L_0x00ee:
                r0 = r2
                r9 = r5
                r5 = r11
                r11 = r3
                r3 = r9
            L_0x00f3:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0028 }
                boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0028 }
                r0.f9424e = r11     // Catch:{ all -> 0x0028 }
                boolean r11 = r2.f9424e     // Catch:{ all -> 0x0028 }
                if (r11 == 0) goto L_0x0122
                com.onesignal.common.events.b r11 = r3.event     // Catch:{ all -> 0x0028 }
                com.onesignal.location.internal.controller.impl.c$e$b r0 = new com.onesignal.location.internal.controller.impl.c$e$b     // Catch:{ all -> 0x0028 }
                r0.<init>(r3)     // Catch:{ all -> 0x0028 }
                r11.fire(r0)     // Catch:{ all -> 0x0028 }
                com.onesignal.location.internal.controller.impl.c$b r11 = new com.onesignal.location.internal.controller.impl.c$b     // Catch:{ all -> 0x0028 }
                java.lang.Object r0 = r1.f9426e     // Catch:{ all -> 0x0028 }
                com.onesignal.location.internal.controller.impl.c r0 = (com.onesignal.location.internal.controller.impl.c) r0     // Catch:{ all -> 0x0028 }
                l7.f r1 = r3._applicationService     // Catch:{ all -> 0x0028 }
                com.huawei.hms.location.FusedLocationProviderClient r2 = r3.hmsFusedLocationClient     // Catch:{ all -> 0x0028 }
                db.l.b(r2)     // Catch:{ all -> 0x0028 }
                r11.<init>(r0, r1, r2)     // Catch:{ all -> 0x0028 }
                r3.locationUpdateListener = r11     // Catch:{ all -> 0x0028 }
            L_0x0122:
                r11 = r5
            L_0x0123:
                r5 = r11
                sa.t r11 = sa.t.f15300a     // Catch:{ all -> 0x0028 }
                r5.a(r4)
                sa.t r11 = sa.t.f15300a
                return r11
            L_0x012c:
                r0 = move-exception
                r5 = r11
                r11 = r0
            L_0x012f:
                r5.a(r4)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.stop(this);
        }
    }

    public c(l7.f fVar) {
        l.e(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        t tVar = new t();
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0161c(fusedLocationProviderClient, tVar, (va.d) null), 1, (Object) null);
        return (Location) tVar.f9426e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object start(va.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.onesignal.location.internal.controller.impl.c.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.location.internal.controller.impl.c$d r0 = (com.onesignal.location.internal.controller.impl.c.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.controller.impl.c$d r0 = new com.onesignal.location.internal.controller.impl.c$d
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            db.r r0 = (db.r) r0
            sa.o.b(r8)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            sa.o.b(r8)
            db.t r8 = new db.t
            r8.<init>()
            r8.f9426e = r7
            db.r r2 = new db.r
            r2.<init>()
            mb.d0 r4 = mb.w0.b()
            com.onesignal.location.internal.controller.impl.c$e r5 = new com.onesignal.location.internal.controller.impl.c$e
            r6 = 0
            r5.<init>(r7, r2, r8, r6)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = mb.h.g(r4, r5, r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r2
        L_0x005a:
            boolean r8 = r0.f9424e
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.c.start(va.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[Catch:{ all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stop(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.location.internal.controller.impl.c.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.location.internal.controller.impl.c$f r0 = (com.onesignal.location.internal.controller.impl.c.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.controller.impl.c$f r0 = new com.onesignal.location.internal.controller.impl.c$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
            java.lang.Object r0 = r0.L$0
            com.onesignal.location.internal.controller.impl.c r0 = (com.onesignal.location.internal.controller.impl.c) r0
            sa.o.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            sa.o.b(r6)
            kotlinx.coroutines.sync.b r6 = r5.startStopMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.b(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            com.onesignal.location.internal.controller.impl.c$b r6 = r0.locationUpdateListener     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x005a
            db.l.b(r6)     // Catch:{ all -> 0x006a }
            r6.close()     // Catch:{ all -> 0x006a }
            r0.locationUpdateListener = r4     // Catch:{ all -> 0x006a }
        L_0x005a:
            com.huawei.hms.location.FusedLocationProviderClient r6 = r0.hmsFusedLocationClient     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0060
            r0.hmsFusedLocationClient = r4     // Catch:{ all -> 0x006a }
        L_0x0060:
            r0.lastLocation = r4     // Catch:{ all -> 0x006a }
            sa.t r6 = sa.t.f15300a     // Catch:{ all -> 0x006a }
            r1.a(r4)
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x006a:
            r6 = move-exception
            r1.a(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.c.stop(va.d):java.lang.Object");
    }

    public void subscribe(t8.b bVar) {
        l.e(bVar, "handler");
        this.event.subscribe(bVar);
    }

    public void unsubscribe(t8.b bVar) {
        l.e(bVar, "handler");
        this.event.unsubscribe(bVar);
    }
}
