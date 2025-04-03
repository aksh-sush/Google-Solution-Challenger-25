package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import cb.p;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.analytics.FirebaseAnalytics;
import db.l;
import db.m;
import db.r;
import java.io.Closeable;
import mb.h0;
import mb.j2;
import mb.l2;
import sa.o;
import sa.t;

public final class a implements t8.a {
    /* access modifiers changed from: private */
    public static final int API_FALLBACK_TIME = 30000;
    public static final C0158a Companion = new C0158a((db.g) null);
    /* access modifiers changed from: private */
    public final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final com.onesignal.common.events.b event = new com.onesignal.common.events.b();
    /* access modifiers changed from: private */
    public b googleApiClient;
    /* access modifiers changed from: private */
    public Location lastLocation;
    /* access modifiers changed from: private */
    public final d locationHandlerThread = new d();
    /* access modifiers changed from: private */
    public e locationUpdateListener;
    /* access modifiers changed from: private */
    public final kotlinx.coroutines.sync.b startStopMutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);

    /* renamed from: com.onesignal.location.internal.controller.impl.a$a  reason: collision with other inner class name */
    public static final class C0158a {
        private C0158a() {
        }

        public /* synthetic */ C0158a(db.g gVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return a.API_FALLBACK_TIME;
        }
    }

    public static final class b {
        public static final b INSTANCE = new b();

        private b() {
        }

        public final void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
            l.e(googleApiClient, "googleApiClient");
            l.e(locationListener, "locationListener");
            if (googleApiClient.l()) {
                LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
            } else {
                com.onesignal.debug.internal.logging.a.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", (Throwable) null, 2, (Object) null);
            }
        }

        public final Location getLastLocation(GoogleApiClient googleApiClient) {
            l.e(googleApiClient, "googleApiClient");
            if (googleApiClient.l()) {
                return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
            }
            return null;
        }

        public final void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            l.e(googleApiClient, "googleApiClient");
            l.e(locationRequest, "locationRequest");
            l.e(locationListener, "locationListener");
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                if (googleApiClient.l()) {
                    LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.a.warn("FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    private static final class c implements GoogleApiClient.b, GoogleApiClient.c {
        /* access modifiers changed from: private */
        public final a _parent;

        /* renamed from: com.onesignal.location.internal.controller.impl.a$c$a  reason: collision with other inner class name */
        static final class C0159a extends kotlin.coroutines.jvm.internal.l implements cb.l {
            int label;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0159a(c cVar, va.d dVar) {
                super(1, dVar);
                this.this$0 = cVar;
            }

            public final va.d create(va.d dVar) {
                return new C0159a(this.this$0, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    a access$get_parent$p = this.this$0._parent;
                    this.label = 1;
                    if (access$get_parent$p.stop(this) == c10) {
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
                return ((C0159a) create(dVar)).invokeSuspend(t.f15300a);
            }
        }

        public c(a aVar) {
            l.e(aVar, "_parent");
            this._parent = aVar;
        }

        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController GoogleApiClientListener onConnected", (Throwable) null, 2, (Object) null);
        }

        public void onConnectionFailed(q3.b bVar) {
            l.e(bVar, "connectionResult");
            com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar, (Throwable) null, 2, (Object) null);
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0159a(this, (va.d) null), 1, (Object) null);
        }

        public void onConnectionSuspended(int i10) {
            com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10, (Throwable) null, 2, (Object) null);
        }
    }

    protected static final class d extends HandlerThread {
        private Handler mHandler = new Handler(getLooper());

        public d() {
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

    public static final class e implements LocationListener, l7.e, Closeable {
        private final l7.f _applicationService;
        private final a _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public e(l7.f fVar, a aVar, GoogleApiClient googleApiClient2) {
            l.e(fVar, "_applicationService");
            l.e(aVar, "_parent");
            l.e(googleApiClient2, "googleApiClient");
            this._applicationService = fVar;
            this._parent = aVar;
            this.googleApiClient = googleApiClient2;
            if (googleApiClient2.l()) {
                fVar.addApplicationLifecycleHandler(this);
                refreshRequest();
                return;
            }
            throw new Exception("googleApiClient not connected, cannot listen!");
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.l()) {
                com.onesignal.debug.internal.logging.a.warn$default("Attempt to refresh location request but not currently connected!", (Throwable) null, 2, (Object) null);
                return;
            }
            if (this.hasExistingRequest) {
                b.INSTANCE.cancelLocationUpdates(this.googleApiClient, (LocationListener) this);
            }
            long j10 = this._applicationService.isInForeground() ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (((double) j10) * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", (Throwable) null, 2, (Object) null);
            b bVar = b.INSTANCE;
            GoogleApiClient googleApiClient2 = this.googleApiClient;
            l.d(priority, "locationRequest");
            bVar.requestLocationUpdates(googleApiClient2, priority, (LocationListener) this);
            this.hasExistingRequest = true;
        }

        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                b.INSTANCE.cancelLocationUpdates(this.googleApiClient, (LocationListener) this);
            }
        }

        public void onFocus() {
            com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            l.e(location, FirebaseAnalytics.Param.LOCATION);
            com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController onLocationChanged: " + location, (Throwable) null, 2, (Object) null);
            this._parent.setLocationAndFire(location);
        }

        public void onUnfocused() {
            com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    static final class f extends m implements cb.l {
        final /* synthetic */ Location $location;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Location location) {
            super(1);
            this.$location = location;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t8.b) obj);
            return t.f15300a;
        }

        public final void invoke(t8.b bVar) {
            l.e(bVar, "it");
            bVar.onLocationChanged(this.$location);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.start(this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ db.t $self;
        final /* synthetic */ r $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.location.internal.controller.impl.a$h$a  reason: collision with other inner class name */
        static final class C0160a extends m implements cb.l {
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0160a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.b) obj);
                return t.f15300a;
            }

            public final void invoke(t8.b bVar) {
                l.e(bVar, "it");
                Location access$getLastLocation$p = this.this$0.lastLocation;
                l.b(access$getLastLocation$p);
                bVar.onLocationChanged(access$getLastLocation$p);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p {
            final /* synthetic */ db.t $self;
            final /* synthetic */ r $wasSuccessful;
            int label;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(db.t tVar, a aVar, r rVar, va.d dVar) {
                super(2, dVar);
                this.$self = tVar;
                this.this$0 = aVar;
                this.$wasSuccessful = rVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new b(this.$self, this.this$0, this.$wasSuccessful, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                Object unused = d.c();
                if (this.label == 0) {
                    o.b(obj);
                    c cVar = new c((a) this.$self.f9426e);
                    GoogleApiClient d10 = new GoogleApiClient.a(this.this$0._applicationService.getAppContext()).a(LocationServices.API).b(cVar).c(cVar).e(this.this$0.locationHandlerThread.getMHandler()).d();
                    l.d(d10, "googleApiClient");
                    b bVar = new b(d10);
                    q3.b blockingConnect = bVar.blockingConnect();
                    boolean z10 = false;
                    if (blockingConnect != null && blockingConnect.j0()) {
                        z10 = true;
                    }
                    if (z10) {
                        if (this.this$0.lastLocation == null && (lastLocation = b.INSTANCE.getLastLocation(d10)) != null) {
                            this.this$0.setLocationAndFire(lastLocation);
                        }
                        ((a) this.$self.f9426e).locationUpdateListener = new e(this.this$0._applicationService, (a) this.$self.f9426e, bVar.getRealInstance());
                        ((a) this.$self.f9426e).googleApiClient = bVar;
                        this.$wasSuccessful.f9424e = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GMSLocationController connection to GoogleApiService failed: (");
                        sb2.append(blockingConnect != null ? kotlin.coroutines.jvm.internal.b.c(blockingConnect.U()) : null);
                        sb2.append(") ");
                        sb2.append(blockingConnect != null ? blockingConnect.V() : null);
                        com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), (Throwable) null, 2, (Object) null);
                    }
                    return t.f15300a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, r rVar, db.t tVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$wasSuccessful = rVar;
            this.$self = tVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new h(this.this$0, this.$wasSuccessful, this.$self, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.b bVar;
            kotlinx.coroutines.sync.b bVar2;
            a aVar;
            r rVar;
            db.t tVar;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                bVar2 = this.this$0.startStopMutex;
                aVar = this.this$0;
                rVar = this.$wasSuccessful;
                tVar = this.$self;
                this.L$0 = bVar2;
                this.L$1 = aVar;
                this.L$2 = rVar;
                this.L$3 = tVar;
                this.label = 1;
                if (bVar2.b((Object) null, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                tVar = (db.t) this.L$3;
                rVar = (r) this.L$2;
                aVar = (a) this.L$1;
                o.b(obj);
                bVar2 = (kotlinx.coroutines.sync.b) this.L$0;
            } else if (i10 == 2) {
                bVar = (kotlinx.coroutines.sync.b) this.L$0;
                try {
                    o.b(obj);
                } catch (j2 unused) {
                }
                t tVar2 = t.f15300a;
                bVar.a((Object) null);
                return t.f15300a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                if (aVar.googleApiClient != null) {
                    if (aVar.lastLocation != null) {
                        aVar.event.fire(new C0160a(aVar));
                    } else {
                        Location lastLocation = aVar.getLastLocation();
                        if (lastLocation != null) {
                            aVar.setLocationAndFire(lastLocation);
                        }
                    }
                    rVar.f9424e = true;
                } else {
                    try {
                        long api_fallback_time = (long) a.Companion.getAPI_FALLBACK_TIME();
                        b bVar3 = new b(tVar, aVar, rVar, (va.d) null);
                        this.L$0 = bVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (l2.c(api_fallback_time, bVar3, this) == c10) {
                            return c10;
                        }
                    } catch (j2 unused2) {
                        bVar = bVar2;
                        try {
                            com.onesignal.debug.internal.logging.a.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", (Throwable) null, 2, (Object) null);
                            t tVar22 = t.f15300a;
                            bVar.a((Object) null);
                            return t.f15300a;
                        } catch (Throwable th) {
                            th = th;
                            bVar.a((Object) null);
                            throw th;
                        }
                    }
                }
                bVar = bVar2;
                t tVar222 = t.f15300a;
                bVar.a((Object) null);
                return t.f15300a;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                bVar = bVar2;
                th = th3;
                bVar.a((Object) null);
                throw th;
            }
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((h) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.stop(this);
        }
    }

    public a(l7.f fVar) {
        l.e(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    /* access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.a.debug$default("GMSLocationController lastLocation: " + this.lastLocation, (Throwable) null, 2, (Object) null);
        this.lastLocation = location;
        this.event.fire(new f(location));
    }

    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    public Location getLastLocation() {
        GoogleApiClient realInstance;
        b bVar = this.googleApiClient;
        if (bVar == null || (realInstance = bVar.getRealInstance()) == null) {
            return null;
        }
        return b.INSTANCE.getLastLocation(realInstance);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object start(va.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.onesignal.location.internal.controller.impl.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.location.internal.controller.impl.a$g r0 = (com.onesignal.location.internal.controller.impl.a.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.controller.impl.a$g r0 = new com.onesignal.location.internal.controller.impl.a$g
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
            com.onesignal.location.internal.controller.impl.a$h r5 = new com.onesignal.location.internal.controller.impl.a$h
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
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.a.start(va.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stop(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.location.internal.controller.impl.a.i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.location.internal.controller.impl.a$i r0 = (com.onesignal.location.internal.controller.impl.a.i) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.controller.impl.a$i r0 = new com.onesignal.location.internal.controller.impl.a$i
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
            com.onesignal.location.internal.controller.impl.a r0 = (com.onesignal.location.internal.controller.impl.a) r0
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
            com.onesignal.location.internal.controller.impl.a$e r6 = r0.locationUpdateListener     // Catch:{ all -> 0x0070 }
            if (r6 == 0) goto L_0x005a
            db.l.b(r6)     // Catch:{ all -> 0x0070 }
            r6.close()     // Catch:{ all -> 0x0070 }
            r0.locationUpdateListener = r4     // Catch:{ all -> 0x0070 }
        L_0x005a:
            com.onesignal.location.internal.controller.impl.b r6 = r0.googleApiClient     // Catch:{ all -> 0x0070 }
            if (r6 == 0) goto L_0x0066
            db.l.b(r6)     // Catch:{ all -> 0x0070 }
            r6.disconnect()     // Catch:{ all -> 0x0070 }
            r0.googleApiClient = r4     // Catch:{ all -> 0x0070 }
        L_0x0066:
            r0.lastLocation = r4     // Catch:{ all -> 0x0070 }
            sa.t r6 = sa.t.f15300a     // Catch:{ all -> 0x0070 }
            r1.a(r4)
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0070:
            r6 = move-exception
            r1.a(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.a.stop(va.d):java.lang.Object");
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
