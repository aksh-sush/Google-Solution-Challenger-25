package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.Context;
import cb.l;
import cb.p;
import com.onesignal.common.AndroidUtils;
import db.m;
import db.r;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import sa.o;
import sa.t;

public final class a implements k9.c {
    private final a8.a _time;
    private final com.onesignal.common.events.b extOpenedCallback = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.a extRemoteReceivedCallback = new com.onesignal.common.events.a();
    private final com.onesignal.common.events.b extWillShowInForegroundCallback = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.a intLifecycleCallback = new com.onesignal.common.events.a();
    private final com.onesignal.common.events.b intLifecycleHandler = new com.onesignal.common.events.b();
    private final ta.e unprocessedOpenedNotifs = new ta.e();

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a  reason: collision with other inner class name */
    static final class C0173a extends m implements l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0173a(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((com.onesignal.notifications.h) null);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.notifications.h hVar) {
            db.l.e(hVar, "it");
            hVar.a(this.$openedResult);
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
            return this.this$0.canOpenNotification((Activity) null, (JSONObject) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ r $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar, Activity activity, JSONObject jSONObject, va.d dVar) {
            super(2, dVar);
            this.$canOpen = rVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        public final va.d create(Object obj, va.d dVar) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                r rVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = rVar2;
                this.label = 1;
                obj = ((k9.a) this.L$0).canOpenNotification(activity, jSONObject, this);
                if (obj == c10) {
                    return c10;
                }
                rVar = rVar2;
            } else if (i10 == 1) {
                rVar = (r) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar.f9424e = ((Boolean) obj).booleanValue();
            return t.f15300a;
        }

        public final Object invoke(k9.a aVar, va.d dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return this.this$0.canReceiveNotification((JSONObject) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ r $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar, JSONObject jSONObject, va.d dVar) {
            super(2, dVar);
            this.$canReceive = rVar;
            this.$jsonPayload = jSONObject;
        }

        public final va.d create(Object obj, va.d dVar) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                r rVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = rVar2;
                this.label = 1;
                obj = ((k9.a) this.L$0).canReceiveNotification(jSONObject, this);
                if (obj == c10) {
                    return c10;
                }
                rVar = rVar2;
            } else if (i10 == 1) {
                rVar = (r) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar.f9424e = ((Boolean) obj).booleanValue();
            return t.f15300a;
        }

        public final Object invoke(k9.a aVar, va.d dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class f extends m implements l {
        final /* synthetic */ com.onesignal.notifications.m $willDisplayEvent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.onesignal.notifications.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((com.onesignal.notifications.j) null);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.notifications.j jVar) {
            db.l.e(jVar, "it");
            jVar.a(this.$willDisplayEvent);
        }
    }

    static final class g extends m implements l {
        final /* synthetic */ com.onesignal.notifications.k $notificationReceivedEvent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.onesignal.notifications.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((com.onesignal.notifications.l) null);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.notifications.l lVar) {
            db.l.e(lVar, "it");
            lVar.a(this.$notificationReceivedEvent);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return this.this$0.notificationOpened((Activity) null, (JSONArray) null, (String) null, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ JSONArray $data;
        final /* synthetic */ String $notificationId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Activity activity, JSONArray jSONArray, String str, va.d dVar) {
            super(2, dVar);
            this.$activity = activity;
            this.$data = jSONArray;
            this.$notificationId = str;
        }

        public final va.d create(Object obj, va.d dVar) {
            i iVar = new i(this.$activity, this.$data, this.$notificationId, dVar);
            iVar.L$0 = obj;
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                Activity activity = this.$activity;
                JSONArray jSONArray = this.$data;
                String str = this.$notificationId;
                this.label = 1;
                if (((k9.b) this.L$0).onNotificationOpened(activity, jSONArray, str, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(k9.b bVar, va.d dVar) {
            return ((i) create(bVar, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class j extends m implements l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((com.onesignal.notifications.h) null);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.notifications.h hVar) {
            db.l.e(hVar, "it");
            hVar.a(this.$openResult);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ g9.d $notificationJob;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g9.d dVar, va.d dVar2) {
            super(2, dVar2);
            this.$notificationJob = dVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            k kVar = new k(this.$notificationJob, dVar);
            kVar.L$0 = obj;
            return kVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                g9.d dVar = this.$notificationJob;
                this.label = 1;
                if (((k9.b) this.L$0).onNotificationReceived(dVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(k9.b bVar, va.d dVar) {
            return ((k) create(bVar, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(l7.f fVar, a8.a aVar) {
        db.l.e(fVar, "applicationService");
        db.l.e(aVar, "_time");
        this._time = aVar;
        setupNotificationServiceExtension(fVar.getAppContext());
    }

    public void addExternalClickListener(com.onesignal.notifications.h hVar) {
        db.l.e(hVar, "callback");
        this.extOpenedCallback.subscribe(hVar);
        if (this.extOpenedCallback.getHasSubscribers() && w.p(this.unprocessedOpenedNotifs)) {
            Iterator it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new C0173a(g9.h.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
        }
    }

    public void addExternalForegroundLifecycleListener(com.onesignal.notifications.j jVar) {
        db.l.e(jVar, "listener");
        this.extWillShowInForegroundCallback.subscribe(jVar);
    }

    public void addInternalNotificationLifecycleEventHandler(k9.b bVar) {
        db.l.e(bVar, "handler");
        this.intLifecycleHandler.subscribe(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object canOpenNotification(android.app.Activity r7, org.json.JSONObject r8, va.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.lifecycle.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.lifecycle.impl.a$b r0 = (com.onesignal.notifications.internal.lifecycle.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.lifecycle.impl.a$b r0 = new com.onesignal.notifications.internal.lifecycle.impl.a$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.r r7 = (db.r) r7
            sa.o.b(r9)
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r9)
            db.r r9 = new db.r
            r9.<init>()
            com.onesignal.common.events.b r2 = r6.extOpenedCallback
            boolean r2 = r2.getHasSubscribers()
            r9.f9424e = r2
            com.onesignal.common.events.a r2 = r6.intLifecycleCallback
            com.onesignal.notifications.internal.lifecycle.impl.a$c r4 = new com.onesignal.notifications.internal.lifecycle.impl.a$c
            r5 = 0
            r4.<init>(r9, r7, r8, r5)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r7 = r2.suspendingFire(r4, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r7 = r9
        L_0x0059:
            boolean r7 = r7.f9424e
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.lifecycle.impl.a.canOpenNotification(android.app.Activity, org.json.JSONObject, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object canReceiveNotification(org.json.JSONObject r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.lifecycle.impl.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.lifecycle.impl.a$d r0 = (com.onesignal.notifications.internal.lifecycle.impl.a.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.lifecycle.impl.a$d r0 = new com.onesignal.notifications.internal.lifecycle.impl.a$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            db.r r7 = (db.r) r7
            sa.o.b(r8)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            sa.o.b(r8)
            db.r r8 = new db.r
            r8.<init>()
            r8.f9424e = r3
            com.onesignal.common.events.a r2 = r6.intLifecycleCallback
            com.onesignal.notifications.internal.lifecycle.impl.a$e r4 = new com.onesignal.notifications.internal.lifecycle.impl.a$e
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r2.suspendingFire(r4, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r8
        L_0x0053:
            boolean r7 = r7.f9424e
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.lifecycle.impl.a.canReceiveNotification(org.json.JSONObject, va.d):java.lang.Object");
    }

    public void externalNotificationWillShowInForeground(com.onesignal.notifications.m mVar) {
        db.l.e(mVar, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new f(mVar));
    }

    public void externalRemoteNotificationReceived(com.onesignal.notifications.k kVar) {
        db.l.e(kVar, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new g(kVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object notificationOpened(android.app.Activity r6, org.json.JSONArray r7, java.lang.String r8, va.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.lifecycle.impl.a.h
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.lifecycle.impl.a$h r0 = (com.onesignal.notifications.internal.lifecycle.impl.a.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.lifecycle.impl.a$h r0 = new com.onesignal.notifications.internal.lifecycle.impl.a$h
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            r7 = r6
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            java.lang.Object r6 = r0.L$0
            com.onesignal.notifications.internal.lifecycle.impl.a r6 = (com.onesignal.notifications.internal.lifecycle.impl.a) r6
            sa.o.b(r9)
            goto L_0x0053
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            sa.o.b(r9)
            com.onesignal.common.events.b r9 = r5.intLifecycleHandler
            com.onesignal.notifications.internal.lifecycle.impl.a$i r2 = new com.onesignal.notifications.internal.lifecycle.impl.a$i
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r9.suspendingFire(r2, r0)
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r6 = r5
        L_0x0053:
            com.onesignal.common.events.b r8 = r6.extOpenedCallback
            boolean r8 = r8.getHasSubscribers()
            if (r8 == 0) goto L_0x006e
            g9.h r8 = g9.h.INSTANCE
            a8.a r9 = r6._time
            com.onesignal.notifications.internal.d r7 = r8.generateNotificationOpenedResult$com_onesignal_notifications(r7, r9)
            com.onesignal.common.events.b r6 = r6.extOpenedCallback
            com.onesignal.notifications.internal.lifecycle.impl.a$j r8 = new com.onesignal.notifications.internal.lifecycle.impl.a$j
            r8.<init>(r7)
            r6.fireOnMain(r8)
            goto L_0x0073
        L_0x006e:
            ta.e r6 = r6.unprocessedOpenedNotifs
            r6.add(r7)
        L_0x0073:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.lifecycle.impl.a.notificationOpened(android.app.Activity, org.json.JSONArray, java.lang.String, va.d):java.lang.Object");
    }

    public Object notificationReceived(g9.d dVar, va.d dVar2) {
        Object suspendingFire = this.intLifecycleHandler.suspendingFire(new k(dVar, (va.d) null), dVar2);
        return suspendingFire == d.c() ? suspendingFire : t.f15300a;
    }

    public void removeExternalClickListener(com.onesignal.notifications.h hVar) {
        db.l.e(hVar, "listener");
        this.extOpenedCallback.unsubscribe(hVar);
    }

    public void removeExternalForegroundLifecycleListener(com.onesignal.notifications.j jVar) {
        db.l.e(jVar, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(jVar);
    }

    public void removeInternalNotificationLifecycleEventHandler(k9.b bVar) {
        db.l.e(bVar, "handler");
        this.intLifecycleHandler.unsubscribe(bVar);
    }

    public void setInternalNotificationLifecycleCallback(k9.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        db.l.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.a.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", (Throwable) null, 2, (Object) null);
            return;
        }
        com.onesignal.debug.internal.logging.a.verbose$default("Found class: " + manifestMeta + ", attempting to call constructor", (Throwable) null, 2, (Object) null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            e10.printStackTrace();
        }
    }
}
