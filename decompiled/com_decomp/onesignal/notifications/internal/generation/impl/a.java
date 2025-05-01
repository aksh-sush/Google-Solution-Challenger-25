package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import cb.p;
import com.onesignal.common.AndroidUtils;
import db.r;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import mb.h1;
import mb.j0;
import mb.o1;
import mb.w0;
import org.json.JSONObject;
import sa.o;
import sa.t;

public final class a implements j9.a {
    private final l7.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final h9.b _dataController;
    /* access modifiers changed from: private */
    public final k9.c _lifecycleService;
    private final i9.b _notificationDisplayer;
    private final r9.a _notificationSummaryManager;
    private final a8.a _time;

    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a  reason: collision with other inner class name */
    static final class C0170a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0170a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.markNotificationAsDismissed((g9.d) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        boolean Z$0;
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
            return this.this$0.postProcessNotification((g9.d) null, false, false, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return this.this$0.processCollapseKey((g9.d) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processHandlerResponse((g9.d) null, false, false, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
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
            return this.this$0.processNotificationData((Context) null, 0, (JSONObject) null, false, 0, this);
        }
    }

    static final class f extends l implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ r $wantsToDisplay;
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a  reason: collision with other inner class name */
        static final class C0171a extends l implements p {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ r $wantsToDisplay;
            int label;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0171a(a aVar, com.onesignal.notifications.internal.f fVar, r rVar, com.onesignal.notifications.internal.c cVar, va.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = rVar;
                this.$notification = cVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new C0171a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.isPreventDefault()) {
                        this.$wantsToDisplay.f9424e = false;
                        com.onesignal.common.threading.b displayWaiter = this.$notification.getDisplayWaiter();
                        this.label = 1;
                        if (displayWaiter.waitForWake(this) == c10) {
                            return c10;
                        }
                    }
                    return t.f15300a;
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$wantsToDisplay.f9424e = true;
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((C0171a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, com.onesignal.notifications.internal.f fVar, r rVar, com.onesignal.notifications.internal.c cVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = rVar;
            this.$notification = cVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new f(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                o1 d10 = j.d(h1.f13395e, w0.b(), (j0) null, new C0171a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, (va.d) null), 2, (Object) null);
                this.label = 1;
                if (d10.V(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((f) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class g extends l implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ r $wantsToDisplay;
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a  reason: collision with other inner class name */
        static final class C0172a extends l implements p {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ r $wantsToDisplay;
            int label;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0172a(a aVar, com.onesignal.notifications.internal.g gVar, r rVar, com.onesignal.notifications.internal.c cVar, va.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = rVar;
                this.$notification = cVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new C0172a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        this.$wantsToDisplay.f9424e = false;
                        com.onesignal.common.threading.b displayWaiter = this.$notification.getDisplayWaiter();
                        this.label = 1;
                        if (displayWaiter.waitForWake(this) == c10) {
                            return c10;
                        }
                    }
                    return t.f15300a;
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$wantsToDisplay.f9424e = true;
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((C0172a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, com.onesignal.notifications.internal.g gVar, r rVar, com.onesignal.notifications.internal.c cVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = rVar;
            this.$notification = cVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new g(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                o1 d10 = j.d(h1.f13395e, w0.b(), (j0) null, new C0172a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, (va.d) null), 2, (Object) null);
                this.label = 1;
                if (d10.V(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.saveNotification((g9.d) null, false, this);
        }
    }

    public a(l7.f fVar, i9.b bVar, com.onesignal.core.internal.config.b bVar2, h9.b bVar3, r9.a aVar, k9.c cVar, a8.a aVar2) {
        db.l.e(fVar, "_applicationService");
        db.l.e(bVar, "_notificationDisplayer");
        db.l.e(bVar2, "_configModelStore");
        db.l.e(bVar3, "_dataController");
        db.l.e(aVar, "_notificationSummaryManager");
        db.l.e(cVar, "_lifecycleService");
        db.l.e(aVar2, "_time");
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._configModelStore = bVar2;
        this._dataController = bVar3;
        this._notificationSummaryManager = aVar;
        this._lifecycleService = cVar;
        this._time = aVar2;
    }

    /* access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, va.d dVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), dVar);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (!((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return true;
        }
        return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object markNotificationAsDismissed(g9.d r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.generation.impl.a.C0170a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.generation.impl.a$a r0 = (com.onesignal.notifications.internal.generation.impl.a.C0170a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.generation.impl.a$a r0 = new com.onesignal.notifications.internal.generation.impl.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r3) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            sa.o.b(r8)
            goto L_0x0090
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.L$1
            g9.d r7 = (g9.d) r7
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.generation.impl.a r2 = (com.onesignal.notifications.internal.generation.impl.a) r2
            sa.o.b(r8)
            goto L_0x0075
        L_0x0041:
            sa.o.b(r8)
            boolean r8 = r7.isNotificationToDisplay()
            if (r8 != 0) goto L_0x004d
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x004d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "Marking restored or disabled notifications as dismissed: "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r8, r5, r4, r5)
            h9.b r8 = r6._dataController
            int r2 = r7.getAndroidId()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.markAsDismissed(r2, r0)
            if (r8 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r2 = r6
        L_0x0075:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0093
            r9.a r8 = r2._notificationSummaryManager
            int r7 = r7.getAndroidId()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r8.updatePossibleDependentSummaryOnDismiss(r7, r0)
            if (r7 != r1) goto L_0x0090
            return r1
        L_0x0090:
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x0093:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.markNotificationAsDismissed(g9.d, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object postProcessNotification(g9.d r7, boolean r8, boolean r9, va.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.onesignal.notifications.internal.generation.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.notifications.internal.generation.impl.a$b r0 = (com.onesignal.notifications.internal.generation.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.generation.impl.a$b r0 = new com.onesignal.notifications.internal.generation.impl.a$b
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sa.o.b(r10)
            goto L_0x007e
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            sa.o.b(r10)
            goto L_0x006c
        L_0x003b:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            g9.d r7 = (g9.d) r7
            java.lang.Object r8 = r0.L$0
            com.onesignal.notifications.internal.generation.impl.a r8 = (com.onesignal.notifications.internal.generation.impl.a) r8
            sa.o.b(r10)
            goto L_0x005c
        L_0x0049:
            sa.o.b(r10)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.Z$0 = r9
            r0.label = r5
            java.lang.Object r8 = r6.saveNotification(r7, r8, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r8 = r6
        L_0x005c:
            r10 = 0
            if (r9 != 0) goto L_0x006f
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r7 = r8.markNotificationAsDismissed(r7, r0)
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x006f:
            k9.c r8 = r8._lifecycleService
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r7 = r8.notificationReceived(r7, r0)
            if (r7 != r1) goto L_0x007e
            return r1
        L_0x007e:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.postProcessNotification(g9.d, boolean, boolean, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processCollapseKey(g9.d r6, va.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.notifications.internal.generation.impl.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.notifications.internal.generation.impl.a$c r0 = (com.onesignal.notifications.internal.generation.impl.a.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.generation.impl.a$c r0 = new com.onesignal.notifications.internal.generation.impl.a$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.L$0
            g9.d r6 = (g9.d) r6
            sa.o.b(r7)
            goto L_0x0078
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            sa.o.b(r7)
            boolean r7 = r6.isRestoring()
            if (r7 == 0) goto L_0x0041
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0041:
            org.json.JSONObject r7 = r6.getJsonPayload()
            java.lang.String r2 = "collapse_key"
            boolean r7 = r7.has(r2)
            if (r7 == 0) goto L_0x008a
            org.json.JSONObject r7 = r6.getJsonPayload()
            java.lang.String r7 = r7.optString(r2)
            java.lang.String r4 = "do_not_collapse"
            boolean r7 = db.l.a(r4, r7)
            if (r7 == 0) goto L_0x005e
            goto L_0x008a
        L_0x005e:
            org.json.JSONObject r7 = r6.getJsonPayload()
            java.lang.String r7 = r7.optString(r2)
            h9.b r2 = r5._dataController
            java.lang.String r4 = "collapseId"
            db.l.d(r7, r4)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.getAndroidIdFromCollapseKey(r7, r0)
            if (r7 != r1) goto L_0x0078
            return r1
        L_0x0078:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0087
            com.onesignal.notifications.internal.c r6 = r6.getNotification()
            int r7 = r7.intValue()
            r6.setAndroidNotificationId(r7)
        L_0x0087:
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x008a:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.processCollapseKey(g9.d, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processHandlerResponse(g9.d r8, boolean r9, boolean r10, va.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.generation.impl.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.notifications.internal.generation.impl.a$d r0 = (com.onesignal.notifications.internal.generation.impl.a.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.generation.impl.a$d r0 = new com.onesignal.notifications.internal.generation.impl.a$d
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r6) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            sa.o.b(r11)
            goto L_0x009c
        L_0x0039:
            java.lang.Object r8 = r0.L$1
            g9.d r8 = (g9.d) r8
            java.lang.Object r9 = r0.L$0
            com.onesignal.notifications.internal.generation.impl.a r9 = (com.onesignal.notifications.internal.generation.impl.a) r9
            sa.o.b(r11)
            goto L_0x0072
        L_0x0045:
            sa.o.b(r11)
            if (r9 == 0) goto L_0x0085
            com.onesignal.common.AndroidUtils r9 = com.onesignal.common.AndroidUtils.INSTANCE
            com.onesignal.notifications.internal.c r11 = r8.getNotification()
            java.lang.String r11 = r11.getBody()
            boolean r9 = r9.isStringNotEmpty(r11)
            com.onesignal.notifications.internal.c r11 = r8.getNotification()
            boolean r11 = r7.isNotificationWithinTTL(r11)
            if (r9 == 0) goto L_0x0085
            if (r11 == 0) goto L_0x0085
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r6
            java.lang.Object r9 = r7.processCollapseKey(r8, r0)
            if (r9 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r9 = r7
        L_0x0072:
            boolean r9 = r9.shouldDisplayNotification(r8)
            if (r9 == 0) goto L_0x0080
            r8.setNotificationToDisplay(r6)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r8
        L_0x0080:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r8
        L_0x0085:
            if (r10 == 0) goto L_0x0090
            r0.label = r4
            java.lang.Object r8 = r7.markNotificationAsDismissed(r8, r0)
            if (r8 != r1) goto L_0x009c
            return r1
        L_0x0090:
            r8.setNotificationToDisplay(r5)
            r0.label = r3
            java.lang.Object r8 = r7.postProcessNotification(r8, r6, r5, r0)
            if (r8 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.processHandlerResponse(g9.d, boolean, boolean, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object saveNotification(g9.d r19, boolean r20, va.d r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            java.lang.String r2 = "collapse_key"
            boolean r3 = r0 instanceof com.onesignal.notifications.internal.generation.impl.a.h
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.onesignal.notifications.internal.generation.impl.a$h r3 = (com.onesignal.notifications.internal.generation.impl.a.h) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.onesignal.notifications.internal.generation.impl.a$h r3 = new com.onesignal.notifications.internal.generation.impl.a$h
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            java.lang.Object r15 = wa.d.c()
            int r4 = r3.label
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            sa.o.b(r0)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x00f9
        L_0x0030:
            r0 = move-exception
            goto L_0x00f6
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003b:
            sa.o.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Saving Notification job: "
            r0.append(r4)
            r4 = r19
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r6 = 2
            r7 = 0
            com.onesignal.debug.internal.logging.a.debug$default(r0, r7, r6, r7)
            org.json.JSONObject r0 = r19.getJsonPayload()
            org.json.JSONObject r6 = r1.getCustomJSONObject(r0)     // Catch:{ JSONException -> 0x0030 }
            boolean r8 = r0.has(r2)     // Catch:{ JSONException -> 0x0030 }
            if (r8 == 0) goto L_0x0075
            java.lang.String r8 = "do_not_collapse"
            java.lang.String r9 = r0.optString(r2)     // Catch:{ JSONException -> 0x0030 }
            boolean r8 = db.l.a(r8, r9)     // Catch:{ JSONException -> 0x0030 }
            if (r8 != 0) goto L_0x0075
            java.lang.String r2 = r0.optString(r2)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0076
        L_0x0075:
            r2 = r7
        L_0x0076:
            java.lang.String r8 = "google.sent_time"
            a8.a r9 = r1._time     // Catch:{ JSONException -> 0x0030 }
            long r9 = r9.getCurrentTimeMillis()     // Catch:{ JSONException -> 0x0030 }
            long r8 = r0.optLong(r8, r9)     // Catch:{ JSONException -> 0x0030 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            java.lang.String r10 = "google.ttl"
            r11 = 259200(0x3f480, float:3.63217E-40)
            int r10 = r0.optInt(r10, r11)     // Catch:{ JSONException -> 0x0030 }
            long r10 = (long) r10     // Catch:{ JSONException -> 0x0030 }
            long r13 = r8 + r10
            h9.b r8 = r1._dataController     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r9 = "i"
            java.lang.String r6 = r6.optString(r9)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r9 = "customJSON.optString(\"i\")"
            db.l.d(r6, r9)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r9 = "grp"
            java.lang.String r9 = com.onesignal.common.i.safeString(r0, r9)     // Catch:{ JSONException -> 0x0030 }
            boolean r10 = r19.isNotificationToDisplay()     // Catch:{ JSONException -> 0x0030 }
            if (r20 == 0) goto L_0x00ac
            r11 = 1
            goto L_0x00ad
        L_0x00ac:
            r11 = 0
        L_0x00ad:
            int r12 = r19.getAndroidId()     // Catch:{ JSONException -> 0x0030 }
            java.lang.CharSequence r16 = r19.getTitle()     // Catch:{ JSONException -> 0x0030 }
            if (r16 == 0) goto L_0x00c0
            java.lang.CharSequence r16 = r19.getTitle()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x00c2
        L_0x00c0:
            r16 = r7
        L_0x00c2:
            java.lang.CharSequence r17 = r19.getBody()     // Catch:{ JSONException -> 0x0030 }
            if (r17 == 0) goto L_0x00d3
            java.lang.CharSequence r4 = r19.getBody()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0030 }
            r17 = r4
            goto L_0x00d5
        L_0x00d3:
            r17 = r7
        L_0x00d5:
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r4 = "jsonPayload.toString()"
            db.l.d(r0, r4)     // Catch:{ JSONException -> 0x0030 }
            r3.label = r5     // Catch:{ JSONException -> 0x0030 }
            r4 = r8
            r5 = r6
            r6 = r9
            r7 = r2
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r16
            r12 = r17
            r2 = r15
            r15 = r0
            r16 = r3
            java.lang.Object r0 = r4.createNotification(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)     // Catch:{ JSONException -> 0x0030 }
            if (r0 != r2) goto L_0x00f9
            return r2
        L_0x00f6:
            r0.printStackTrace()
        L_0x00f9:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.saveNotification(g9.d, boolean, va.d):java.lang.Object");
    }

    private final boolean shouldDisplayNotification(g9.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(g9.d dVar) {
        String str;
        if (!this._applicationService.isInForeground()) {
            str = "App is in background, show notification";
        } else if (!dVar.isRestoring()) {
            return true;
        } else {
            str = "Not firing notificationWillShowInForegroundHandler for restored notifications";
        }
        com.onesignal.debug.internal.logging.a.info$default(str, (Throwable) null, 2, (Object) null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        db.l.e(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(g9.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: db.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: g9.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: com.onesignal.notifications.internal.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.onesignal.notifications.internal.generation.impl.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: db.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: g9.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: com.onesignal.notifications.internal.generation.impl.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ca, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x030a, code lost:
        return sa.t.f15300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0128, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012c, code lost:
        return sa.t.f15300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012d, code lost:
        r2 = new com.onesignal.notifications.internal.c((java.util.List<com.onesignal.notifications.internal.c>) null, r8, r6, r5._time);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0134, code lost:
        if (r0 != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0136, code lost:
        r3.L$0 = r5;
        r3.L$1 = r13;
        r3.L$2 = r8;
        r3.L$3 = r2;
        r3.Z$0 = r0;
        r3.J$0 = r14;
        r3.label = 2;
        r6 = r5.isDuplicateNotification(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0148, code lost:
        if (r6 != r4) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014b, code lost:
        r17 = r5;
        r5 = r2;
        r2 = r6;
        r6 = r17;
        r15 = r13;
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015c, code lost:
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0160, code lost:
        return sa.t.f15300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0161, code lost:
        r2 = r0;
        r17 = r13;
        r13 = r15;
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0168, code lost:
        r6 = r5;
        r5 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016b, code lost:
        r7 = new g9.d(r5, r8);
        r7.setShownTimeStamp(kotlin.coroutines.jvm.internal.b.d(r14));
        r7.setRestoring(r2);
        r8 = new db.r();
        r8.f9424e = true;
        com.onesignal.debug.internal.logging.a.info$default("Fire remoteNotificationReceived", (java.lang.Throwable) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r21 = new com.onesignal.notifications.internal.generation.impl.a.f(r6, new com.onesignal.notifications.internal.f(r13, r5), r8, r5, (va.d) null);
        r3.L$0 = r6;
        r3.L$1 = r5;
        r3.L$2 = r7;
        r3.L$3 = r8;
        r3.Z$0 = r2;
        r3.I$0 = 0;
        r3.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b2, code lost:
        if (mb.l2.c(30000, r21, r3) != r4) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b5, code lost:
        r15 = r5;
        r14 = r7;
        r13 = r8;
        r5 = 0;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bc, code lost:
        r15 = r5;
        r14 = r7;
        r13 = r8;
        r5 = 0;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c5, code lost:
        r15 = r5;
        r14 = r7;
        r13 = r8;
        r5 = 0;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fd, code lost:
        r7 = r13;
        r13 = r6;
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0200, code lost:
        r2 = (java.lang.Boolean) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0202, code lost:
        if (r2 != null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0204, code lost:
        r0 = r2.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0208, code lost:
        if (r0 != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020e, code lost:
        if (r13.shouldFireForegroundHandlers(r14) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0210, code lost:
        com.onesignal.debug.internal.logging.a.info$default("Fire notificationWillShowInForegroundHandler", (java.lang.Throwable) null, 2, (java.lang.Object) null);
        r7.f9424e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r21 = new com.onesignal.notifications.internal.generation.impl.a.g(r13, new com.onesignal.notifications.internal.g(r14.getNotification()), r7, r15, (va.d) null);
        r3.L$0 = r13;
        r3.L$1 = r14;
        r3.L$2 = r7;
        r3.L$3 = null;
        r3.Z$0 = r6;
        r3.I$0 = r5;
        r3.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0247, code lost:
        if (mb.l2.c(30000, r21, r3) == r4) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0249, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x024a, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024d, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0254, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0255, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0256, code lost:
        com.onesignal.debug.internal.logging.a.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + r7.f9424e + '.', r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a1, code lost:
        r2 = r5;
        r5 = r6;
        r6 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processNotificationData(android.content.Context r21, int r22, org.json.JSONObject r23, boolean r24, long r25, va.d r27) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            r2 = r27
            boolean r3 = r2 instanceof com.onesignal.notifications.internal.generation.impl.a.e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.onesignal.notifications.internal.generation.impl.a$e r3 = (com.onesignal.notifications.internal.generation.impl.a.e) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.onesignal.notifications.internal.generation.impl.a$e r3 = new com.onesignal.notifications.internal.generation.impl.a$e
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = wa.d.c()
            int r5 = r3.label
            r9 = 0
            r10 = 2
            r11 = 1
            r12 = 0
            switch(r5) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00df;
                case 2: goto L_0x00c6;
                case 3: goto L_0x009c;
                case 4: goto L_0x007f;
                case 5: goto L_0x0061;
                case 6: goto L_0x0050;
                case 7: goto L_0x0041;
                case 8: goto L_0x003a;
                case 9: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0035:
            sa.o.b(r2)
            goto L_0x0302
        L_0x003a:
            boolean r0 = r3.Z$0
            sa.o.b(r2)
            goto L_0x02eb
        L_0x0041:
            boolean r0 = r3.Z$0
            java.lang.Object r5 = r3.L$1
            g9.d r5 = (g9.d) r5
            java.lang.Object r6 = r3.L$0
            com.onesignal.notifications.internal.generation.impl.a r6 = (com.onesignal.notifications.internal.generation.impl.a) r6
            sa.o.b(r2)
            goto L_0x02be
        L_0x0050:
            int r0 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$1
            g9.d r6 = (g9.d) r6
            java.lang.Object r7 = r3.L$0
            com.onesignal.notifications.internal.generation.impl.a r7 = (com.onesignal.notifications.internal.generation.impl.a) r7
            sa.o.b(r2)
            goto L_0x028e
        L_0x0061:
            int r5 = r3.I$0
            boolean r6 = r3.Z$0
            java.lang.Object r0 = r3.L$2
            r7 = r0
            db.r r7 = (db.r) r7
            java.lang.Object r0 = r3.L$1
            r10 = r0
            g9.d r10 = (g9.d) r10
            java.lang.Object r0 = r3.L$0
            r13 = r0
            com.onesignal.notifications.internal.generation.impl.a r13 = (com.onesignal.notifications.internal.generation.impl.a) r13
            sa.o.b(r2)     // Catch:{ j2 -> 0x007c, all -> 0x0079 }
            goto L_0x0271
        L_0x0079:
            r0 = move-exception
            goto L_0x024e
        L_0x007c:
            r0 = move-exception
            goto L_0x0256
        L_0x007f:
            int r0 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r13 = r3.L$3
            db.r r13 = (db.r) r13
            java.lang.Object r14 = r3.L$2
            g9.d r14 = (g9.d) r14
            java.lang.Object r15 = r3.L$1
            com.onesignal.notifications.internal.c r15 = (com.onesignal.notifications.internal.c) r15
            java.lang.Object r8 = r3.L$0
            com.onesignal.notifications.internal.generation.impl.a r8 = (com.onesignal.notifications.internal.generation.impl.a) r8
            sa.o.b(r2)
            r6 = r5
            r7 = r13
            r5 = r0
            r13 = r8
            goto L_0x0200
        L_0x009c:
            int r5 = r3.I$0
            boolean r8 = r3.Z$0
            java.lang.Object r0 = r3.L$3
            r13 = r0
            db.r r13 = (db.r) r13
            java.lang.Object r0 = r3.L$2
            r14 = r0
            g9.d r14 = (g9.d) r14
            java.lang.Object r0 = r3.L$1
            r15 = r0
            com.onesignal.notifications.internal.c r15 = (com.onesignal.notifications.internal.c) r15
            java.lang.Object r0 = r3.L$0
            r16 = r0
            com.onesignal.notifications.internal.generation.impl.a r16 = (com.onesignal.notifications.internal.generation.impl.a) r16
            sa.o.b(r2)     // Catch:{ j2 -> 0x00c1, all -> 0x00bc }
            r6 = r16
            goto L_0x01e5
        L_0x00bc:
            r0 = move-exception
            r6 = r16
            goto L_0x01c1
        L_0x00c1:
            r0 = move-exception
            r6 = r16
            goto L_0x01ca
        L_0x00c6:
            long r13 = r3.J$0
            boolean r0 = r3.Z$0
            java.lang.Object r5 = r3.L$3
            com.onesignal.notifications.internal.c r5 = (com.onesignal.notifications.internal.c) r5
            java.lang.Object r8 = r3.L$2
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r15 = r3.L$1
            android.content.Context r15 = (android.content.Context) r15
            java.lang.Object r6 = r3.L$0
            com.onesignal.notifications.internal.generation.impl.a r6 = (com.onesignal.notifications.internal.generation.impl.a) r6
            sa.o.b(r2)
            goto L_0x0156
        L_0x00df:
            long r5 = r3.J$0
            boolean r0 = r3.Z$0
            int r7 = r3.I$0
            java.lang.Object r8 = r3.L$2
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r13 = r3.L$1
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r3.L$0
            com.onesignal.notifications.internal.generation.impl.a r14 = (com.onesignal.notifications.internal.generation.impl.a) r14
            sa.o.b(r2)
            r17 = r5
            r6 = r7
            r5 = r14
            r14 = r17
            goto L_0x0122
        L_0x00fb:
            sa.o.b(r2)
            k9.c r2 = r1._lifecycleService
            r3.L$0 = r1
            r5 = r21
            r3.L$1 = r5
            r3.L$2 = r0
            r6 = r22
            r3.I$0 = r6
            r7 = r24
            r3.Z$0 = r7
            r13 = r25
            r3.J$0 = r13
            r3.label = r11
            java.lang.Object r2 = r2.canReceiveNotification(r0, r3)
            if (r2 != r4) goto L_0x011d
            return r4
        L_0x011d:
            r8 = r0
            r0 = r7
            r14 = r13
            r13 = r5
            r5 = r1
        L_0x0122:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x012d
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x012d:
            com.onesignal.notifications.internal.c r2 = new com.onesignal.notifications.internal.c
            a8.a r7 = r5._time
            r2.<init>(r12, r8, r6, r7)
            if (r0 != 0) goto L_0x0168
            r3.L$0 = r5
            r3.L$1 = r13
            r3.L$2 = r8
            r3.L$3 = r2
            r3.Z$0 = r0
            r3.J$0 = r14
            r3.label = r10
            java.lang.Object r6 = r5.isDuplicateNotification(r2, r3)
            if (r6 != r4) goto L_0x014b
            return r4
        L_0x014b:
            r17 = r5
            r5 = r2
            r2 = r6
            r6 = r17
            r18 = r14
            r15 = r13
            r13 = r18
        L_0x0156:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0161
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0161:
            r2 = r0
            r17 = r13
            r13 = r15
            r14 = r17
            goto L_0x016b
        L_0x0168:
            r6 = r5
            r5 = r2
            r2 = r0
        L_0x016b:
            g9.d r7 = new g9.d
            r7.<init>((com.onesignal.notifications.internal.c) r5, (org.json.JSONObject) r8)
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.d(r14)
            r7.setShownTimeStamp(r0)
            r7.setRestoring(r2)
            db.r r8 = new db.r
            r8.<init>()
            r8.f9424e = r11
            java.lang.String r0 = "Fire remoteNotificationReceived"
            com.onesignal.debug.internal.logging.a.info$default(r0, r12, r10, r12)
            com.onesignal.notifications.internal.f r0 = new com.onesignal.notifications.internal.f     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r0.<init>(r13, r5)     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            com.onesignal.notifications.internal.generation.impl.a$f r13 = new com.onesignal.notifications.internal.generation.impl.a$f     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r14 = 0
            r21 = r13
            r22 = r6
            r23 = r0
            r24 = r8
            r25 = r5
            r26 = r14
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.L$0 = r6     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.L$1 = r5     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.L$2 = r7     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.L$3 = r8     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.Z$0 = r2     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r3.I$0 = r9     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r0 = 3
            r3.label = r0     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            r14 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = mb.l2.c(r14, r13, r3)     // Catch:{ j2 -> 0x01c4, all -> 0x01bb }
            if (r0 != r4) goto L_0x01b5
            return r4
        L_0x01b5:
            r15 = r5
            r14 = r7
            r13 = r8
            r5 = 0
            r8 = r2
            goto L_0x01e5
        L_0x01bb:
            r0 = move-exception
            r15 = r5
            r14 = r7
            r13 = r8
            r5 = 0
            r8 = r2
        L_0x01c1:
            java.lang.String r2 = "remoteNotificationReceived threw an exception. Displaying normal OneSignal notification."
            goto L_0x01e2
        L_0x01c4:
            r0 = move-exception
            r15 = r5
            r14 = r7
            r13 = r8
            r5 = 0
            r8 = r2
        L_0x01ca:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "remoteNotificationReceived timed out, continuing with wantsToDisplay="
            r2.append(r7)
            boolean r7 = r13.f9424e
            r2.append(r7)
            r7 = 46
            r2.append(r7)
            java.lang.String r2 = r2.toString()
        L_0x01e2:
            com.onesignal.debug.internal.logging.a.error(r2, r0)
        L_0x01e5:
            boolean r0 = r13.f9424e
            r3.L$0 = r6
            r3.L$1 = r15
            r3.L$2 = r14
            r3.L$3 = r13
            r3.Z$0 = r8
            r3.I$0 = r5
            r2 = 4
            r3.label = r2
            java.lang.Object r2 = r6.processHandlerResponse(r14, r0, r8, r3)
            if (r2 != r4) goto L_0x01fd
            return r4
        L_0x01fd:
            r7 = r13
            r13 = r6
            r6 = r8
        L_0x0200:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0308
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x02ca
            boolean r2 = r13.shouldFireForegroundHandlers(r14)
            if (r2 == 0) goto L_0x02a1
            java.lang.String r0 = "Fire notificationWillShowInForegroundHandler"
            com.onesignal.debug.internal.logging.a.info$default(r0, r12, r10, r12)
            r7.f9424e = r11
            com.onesignal.notifications.internal.g r0 = new com.onesignal.notifications.internal.g     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            com.onesignal.notifications.internal.c r2 = r14.getNotification()     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r0.<init>(r2)     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            com.onesignal.notifications.internal.generation.impl.a$g r2 = new com.onesignal.notifications.internal.generation.impl.a$g     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r8 = 0
            r21 = r2
            r22 = r13
            r23 = r0
            r24 = r7
            r25 = r15
            r26 = r8
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.L$0 = r13     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.L$1 = r14     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.L$2 = r7     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.L$3 = r12     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.Z$0 = r6     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r3.I$0 = r5     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r0 = 5
            r3.label = r0     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            r9 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = mb.l2.c(r9, r2, r3)     // Catch:{ j2 -> 0x0254, all -> 0x024c }
            if (r0 != r4) goto L_0x024a
            return r4
        L_0x024a:
            r10 = r14
            goto L_0x0271
        L_0x024c:
            r0 = move-exception
            r10 = r14
        L_0x024e:
            java.lang.String r2 = "notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification."
            com.onesignal.debug.internal.logging.a.error(r2, r0)
            goto L_0x0271
        L_0x0254:
            r0 = move-exception
            r10 = r14
        L_0x0256:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay="
            r2.append(r9)
            boolean r9 = r7.f9424e
            r2.append(r9)
            r9 = 46
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.onesignal.debug.internal.logging.a.info(r2, r0)
        L_0x0271:
            r0 = r5
            r5 = r6
            r2 = r7
            r6 = r10
            r7 = r13
            boolean r2 = r2.f9424e
            r3.L$0 = r7
            r3.L$1 = r6
            r3.L$2 = r12
            r3.L$3 = r12
            r3.Z$0 = r5
            r3.I$0 = r0
            r9 = 6
            r3.label = r9
            java.lang.Object r2 = r7.processHandlerResponse(r6, r2, r5, r3)
            if (r2 != r4) goto L_0x028e
            return r4
        L_0x028e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x029e
            boolean r2 = r2.booleanValue()
            r14 = r6
            r6 = r7
            r17 = r2
            r2 = r0
            r0 = r17
            goto L_0x02a4
        L_0x029e:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x02a1:
            r2 = r5
            r5 = r6
            r6 = r13
        L_0x02a4:
            if (r0 == 0) goto L_0x02c8
            i9.b r0 = r6._notificationDisplayer
            r3.L$0 = r6
            r3.L$1 = r14
            r3.L$2 = r12
            r3.L$3 = r12
            r3.Z$0 = r5
            r2 = 7
            r3.label = r2
            java.lang.Object r2 = r0.displayNotification(r14, r3)
            if (r2 != r4) goto L_0x02bc
            return r4
        L_0x02bc:
            r0 = r5
            r5 = r14
        L_0x02be:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r14 = r5
        L_0x02c5:
            r13 = r6
            r5 = r2
            goto L_0x02cb
        L_0x02c8:
            r0 = r5
            goto L_0x02c5
        L_0x02ca:
            r0 = r6
        L_0x02cb:
            boolean r2 = r14.isRestoring()
            if (r2 != 0) goto L_0x02eb
            if (r5 == 0) goto L_0x02d4
            goto L_0x02d5
        L_0x02d4:
            r11 = 0
        L_0x02d5:
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.Z$0 = r0
            r2 = 8
            r3.label = r2
            r2 = 0
            java.lang.Object r2 = r13.postProcessNotification(r14, r2, r11, r3)
            if (r2 != r4) goto L_0x02eb
            return r4
        L_0x02eb:
            if (r0 == 0) goto L_0x0305
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r0 = 9
            r3.label = r0
            r5 = 100
            java.lang.Object r0 = mb.r0.a(r5, r3)
            if (r0 != r4) goto L_0x0302
            return r4
        L_0x0302:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0305:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0308:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.processNotificationData(android.content.Context, int, org.json.JSONObject, boolean, long, va.d):java.lang.Object");
    }
}
