package com.onesignal.location.internal;

import android.os.Build;
import cb.p;
import com.onesignal.common.AndroidUtils;
import db.r;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.h0;
import sa.o;
import sa.t;

public final class a implements com.onesignal.location.a, z7.b, com.onesignal.location.internal.permissions.a {
    /* access modifiers changed from: private */
    public final f _applicationService;
    /* access modifiers changed from: private */
    public final q8.a _capturer;
    private boolean _isShared;
    private final t8.a _locationController;
    /* access modifiers changed from: private */
    public final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final y7.a _prefs;

    /* renamed from: com.onesignal.location.internal.a$a  reason: collision with other inner class name */
    static final class C0157a extends l implements cb.l {
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0157a(a aVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
        }

        public final va.d create(va.d dVar) {
            return new C0157a(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                a aVar = this.this$0;
                this.label = 1;
                if (aVar.startGetLocation(this) == c10) {
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
            return ((C0157a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.requestPermission(this);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ r $result;
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, r rVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$result = rVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new c(this.this$0, this.$result, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            r rVar;
            r rVar2;
            Object obj3;
            r rVar3;
            boolean z10;
            Object c10 = d.c();
            int i10 = this.label;
            boolean z11 = true;
            if (i10 == 0) {
                o.b(obj);
                String str = null;
                if (!this.this$0.isShared()) {
                    com.onesignal.debug.internal.logging.a.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", (Throwable) null, 2, (Object) null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, this.this$0._applicationService);
                if (!hasPermission) {
                    z10 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, this.this$0._applicationService);
                    this.this$0._capturer.setLocationCoarse(true);
                } else {
                    z10 = false;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean hasPermission2 = i11 >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, this.this$0._applicationService) : false;
                if (i11 < 23) {
                    if (hasPermission || z10) {
                        a aVar = this.this$0;
                        this.label = 1;
                        if (aVar.startGetLocation(this) == c10) {
                            return c10;
                        }
                    } else {
                        com.onesignal.debug.internal.logging.a.error$default("Location permissions not added on AndroidManifest file < M", (Throwable) null, 2, (Object) null);
                        return kotlin.coroutines.jvm.internal.b.a(false);
                    }
                } else if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(o.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), this.this$0._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.a.info$default("Location permissions not added on AndroidManifest file >= M", (Throwable) null, 2, (Object) null);
                    } else if (!z10) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (i11 >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    rVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b access$get_locationPermissionController$p = this.this$0._locationPermissionController;
                        this.L$0 = rVar2;
                        this.label = 2;
                        obj3 = access$get_locationPermissionController$p.prompt(true, str, this);
                        if (obj3 == c10) {
                            return c10;
                        }
                        rVar3 = rVar2;
                        z11 = ((Boolean) obj3).booleanValue();
                        rVar2 = rVar3;
                        rVar2.f9424e = z11;
                        return t.f15300a;
                    }
                    if (!z10) {
                        z11 = false;
                    }
                    rVar2.f9424e = z11;
                    return t.f15300a;
                } else if (i11 < 29 || hasPermission2) {
                    this.$result.f9424e = true;
                    a aVar2 = this.this$0;
                    this.label = 4;
                    if (aVar2.startGetLocation(this) == c10) {
                        return c10;
                    }
                    return t.f15300a;
                } else {
                    r rVar4 = this.$result;
                    a aVar3 = this.this$0;
                    this.L$0 = rVar4;
                    this.label = 3;
                    obj2 = aVar3.backgroundLocationPermissionLogic(true, this);
                    if (obj2 == c10) {
                        return c10;
                    }
                    rVar = rVar4;
                    rVar.f9424e = ((Boolean) obj2).booleanValue();
                    return t.f15300a;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else if (i10 == 2) {
                rVar3 = (r) this.L$0;
                o.b(obj);
                obj3 = obj;
                z11 = ((Boolean) obj3).booleanValue();
                rVar2 = rVar3;
                rVar2.f9424e = z11;
                return t.f15300a;
            } else if (i10 == 3) {
                rVar = (r) this.L$0;
                o.b(obj);
                obj2 = obj;
                rVar.f9424e = ((Boolean) obj2).booleanValue();
                return t.f15300a;
            } else if (i10 == 4) {
                o.b(obj);
                return t.f15300a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$result.f9424e = true;
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class d extends l implements cb.l {
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
        }

        public final va.d create(va.d dVar) {
            return new d(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                a aVar = this.this$0;
                this.label = 1;
                if (aVar.startGetLocation(this) == c10) {
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
            return ((d) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.startGetLocation(this);
        }
    }

    public a(f fVar, q8.a aVar, t8.a aVar2, com.onesignal.location.internal.permissions.b bVar, y7.a aVar3) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_capturer");
        db.l.e(aVar2, "_locationController");
        db.l.e(bVar, "_locationPermissionController");
        db.l.e(aVar3, "_prefs");
        this._applicationService = fVar;
        this._capturer = aVar;
        this._locationController = aVar2;
        this._locationPermissionController = bVar;
        this._prefs = aVar3;
        Boolean bool = aVar3.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        db.l.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z10, va.d dVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z10, "android.permission.ACCESS_BACKGROUND_LOCATION", dVar) : kotlin.coroutines.jvm.internal.b.a(true);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object startGetLocation(va.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onesignal.location.internal.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.location.internal.a$e r0 = (com.onesignal.location.internal.a.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.a$e r0 = new com.onesignal.location.internal.a$e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            sa.o.b(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0051
        L_0x002b:
            r7 = move-exception
            goto L_0x005f
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            sa.o.b(r7)
            boolean r7 = r6.isShared()
            if (r7 != 0) goto L_0x0041
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x0041:
            java.lang.String r7 = "LocationManager.startGetLocation()"
            com.onesignal.debug.internal.logging.a.debug$default(r7, r5, r3, r5)
            t8.a r7 = r6._locationController     // Catch:{ all -> 0x002b }
            r0.label = r4     // Catch:{ all -> 0x002b }
            java.lang.Object r7 = r7.start(r0)     // Catch:{ all -> 0x002b }
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x002b }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x002b }
            if (r7 != 0) goto L_0x0064
            java.lang.String r7 = "LocationManager.startGetLocation: not possible, no location dependency found"
            com.onesignal.debug.internal.logging.a.warn$default(r7, r5, r3, r5)     // Catch:{ all -> 0x002b }
            goto L_0x0064
        L_0x005f:
            java.lang.String r0 = "LocationManager.startGetLocation: Location permission exists but there was an error initializing: "
            com.onesignal.debug.internal.logging.a.warn(r0, r7)
        L_0x0064:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.a.startGetLocation(va.d):java.lang.Object");
    }

    public boolean isShared() {
        return this._isShared;
    }

    public void onLocationPermissionChanged(boolean z10) {
        if (z10) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0157a(this, (va.d) null), 1, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object requestPermission(va.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onesignal.location.internal.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.location.internal.a$b r0 = (com.onesignal.location.internal.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.location.internal.a$b r0 = new com.onesignal.location.internal.a$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            db.r r0 = (db.r) r0
            sa.o.b(r7)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            sa.o.b(r7)
            c8.b r7 = c8.b.DEBUG
            java.lang.String r2 = "LocationManager.requestPermission()"
            com.onesignal.debug.internal.logging.a.log(r7, r2)
            db.r r7 = new db.r
            r7.<init>()
            mb.z1 r2 = mb.w0.c()
            com.onesignal.location.internal.a$c r4 = new com.onesignal.location.internal.a$c
            r5 = 0
            r4.<init>(r6, r7, r5)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = mb.h.g(r2, r4, r0)
            if (r0 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r7
        L_0x005a:
            boolean r7 = r0.f9424e
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.a.requestPermission(va.d):java.lang.Object");
    }

    public void setShared(boolean z10) {
        com.onesignal.debug.internal.logging.a.debug$default("LocationManager.setIsShared(value: " + z10 + ')', (Throwable) null, 2, (Object) null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z10));
        this._isShared = z10;
        onLocationPermissionChanged(z10);
    }

    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (s8.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(this, (va.d) null), 1, (Object) null);
        }
    }
}
