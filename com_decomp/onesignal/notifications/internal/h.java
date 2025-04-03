package com.onesignal.notifications.internal;

import android.app.Activity;
import android.content.Intent;
import cb.p;
import com.onesignal.notifications.j;
import com.onesignal.notifications.n;
import db.m;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import mb.w0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sa.o;
import sa.t;

public final class h implements n, a, n9.a, l7.e {
    private final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final h9.b _notificationDataController;
    private final k9.c _notificationLifecycleService;
    /* access modifiers changed from: private */
    public final n9.b _notificationPermissionController;
    private final q9.b _notificationRestoreWorkManager;
    /* access modifiers changed from: private */
    public final r9.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier = new com.onesignal.common.events.b();

    static final class a extends l implements cb.l {
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
        }

        public final va.d create(va.d dVar) {
            return new a(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                h9.b access$get_notificationDataController$p = this.this$0._notificationDataController;
                this.label = 1;
                if (access$get_notificationDataController$p.deleteExpiredNotifications(this) == c10) {
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
            return ((a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends l implements cb.l {
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
        }

        public final va.d create(va.d dVar) {
            return new b(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                h9.b access$get_notificationDataController$p = this.this$0._notificationDataController;
                this.label = 1;
                if (access$get_notificationDataController$p.markAsDismissedForOutstanding(this) == c10) {
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
            return ((b) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class c extends l implements cb.l {
        final /* synthetic */ String $group;
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, String str, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
            this.$group = str;
        }

        public final va.d create(va.d dVar) {
            return new c(this.this$0, this.$group, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                h9.b access$get_notificationDataController$p = this.this$0._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (access$get_notificationDataController$p.markAsDismissedForGroup(str, this) == c10) {
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

    static final class d extends l implements cb.l {
        final /* synthetic */ int $id;
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, int i10, va.d dVar) {
            super(1, dVar);
            this.this$0 = hVar;
            this.$id = i10;
        }

        public final va.d create(va.d dVar) {
            return new d(this.this$0, this.$id, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                h9.b access$get_notificationDataController$p = this.this$0._notificationDataController;
                int i11 = this.$id;
                this.label = 1;
                obj = access$get_notificationDataController$p.markAsDismissed(i11, this);
                if (obj == c10) {
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
            if (((Boolean) obj).booleanValue()) {
                r9.a access$get_summaryManager$p = this.this$0._summaryManager;
                int i12 = this.$id;
                this.label = 2;
                if (access$get_summaryManager$p.updatePossibleDependentSummaryOnDismiss(i12, this) == c10) {
                    return c10;
                }
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((d) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class e extends l implements p {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, boolean z10, va.d dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$fallbackToSettings = z10;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, this.$fallbackToSettings, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                n9.b access$get_notificationPermissionController$p = this.this$0._notificationPermissionController;
                boolean z10 = this.$fallbackToSettings;
                this.label = 1;
                obj = access$get_notificationPermissionController$p.prompt(z10, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class f extends m implements cb.l {
        final /* synthetic */ boolean $isEnabled;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z10) {
            super(1);
            this.$isEnabled = z10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.notifications.o) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.notifications.o oVar) {
            db.l.e(oVar, "it");
            oVar.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(l7.f fVar, n9.b bVar, q9.b bVar2, k9.c cVar, h9.b bVar3, r9.a aVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(bVar, "_notificationPermissionController");
        db.l.e(bVar2, "_notificationRestoreWorkManager");
        db.l.e(cVar, "_notificationLifecycleService");
        db.l.e(bVar3, "_notificationDataController");
        db.l.e(aVar, "_summaryManager");
        this._applicationService = fVar;
        this._notificationPermissionController = bVar;
        this._notificationRestoreWorkManager = bVar2;
        this._notificationLifecycleService = cVar;
        this._notificationDataController = bVar3;
        this._summaryManager = aVar;
        this.permission = g9.h.areNotificationsEnabled$default(g9.h.INSTANCE, fVar.getAppContext(), (String) null, 2, (Object) null);
        fVar.addApplicationLifecycleHandler(this);
        bVar.subscribe(this);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(this, (va.d) null), 1, (Object) null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(g9.h.areNotificationsEnabled$default(g9.h.INSTANCE, this._applicationService.getAppContext(), (String) null, 2, (Object) null));
    }

    private final void setPermissionStatusAndFire(boolean z10) {
        boolean permission2 = getPermission();
        setPermission(z10);
        if (permission2 != z10) {
            this.permissionChangedNotifier.fireOnMain(new f(z10));
        }
    }

    public void addClickListener(com.onesignal.notifications.h hVar) {
        db.l.e(hVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.addClickListener(handler: " + hVar + ')', (Throwable) null, 2, (Object) null);
        this._notificationLifecycleService.addExternalClickListener(hVar);
    }

    public void addForegroundLifecycleListener(j jVar) {
        db.l.e(jVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + jVar + ')', (Throwable) null, 2, (Object) null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(jVar);
    }

    public void addPermissionObserver(com.onesignal.notifications.o oVar) {
        db.l.e(oVar, "observer");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.addPermissionObserver(observer: " + oVar + ')', (Throwable) null, 2, (Object) null);
        this.permissionChangedNotifier.subscribe(oVar);
    }

    public void clearAllNotifications() {
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.clearAllNotifications()", (Throwable) null, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(this, (va.d) null), 1, (Object) null);
    }

    public boolean getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    public boolean getPermission() {
        return this.permission;
    }

    public void onFocus() {
        refreshNotificationState();
    }

    public void onNotificationPermissionChanged(boolean z10) {
        setPermissionStatusAndFire(z10);
    }

    public void onUnfocused() {
    }

    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, va.d dVar) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            g9.b bVar = g9.b.INSTANCE;
            db.l.d(jSONObject, "firstPayloadItem");
            Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                com.onesignal.debug.internal.logging.a.info$default("SDK running startActivity with Intent: " + intentVisible, (Throwable) null, 2, (Object) null);
                activity.startActivity(intentVisible);
            } else {
                com.onesignal.debug.internal.logging.a.info$default("SDK not showing an Activity automatically due to it's settings.", (Throwable) null, 2, (Object) null);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return t.f15300a;
    }

    public void removeClickListener(com.onesignal.notifications.h hVar) {
        db.l.e(hVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.removeClickListener(listener: " + hVar + ')', (Throwable) null, 2, (Object) null);
        this._notificationLifecycleService.removeExternalClickListener(hVar);
    }

    public void removeForegroundLifecycleListener(j jVar) {
        db.l.e(jVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + jVar + ')', (Throwable) null, 2, (Object) null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(jVar);
    }

    public void removeGroupedNotifications(String str) {
        db.l.e(str, "group");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.removeGroupedNotifications(group: " + str + ')', (Throwable) null, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c(this, str, (va.d) null), 1, (Object) null);
    }

    public void removeNotification(int i10) {
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.removeNotification(id: " + i10 + ')', (Throwable) null, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(this, i10, (va.d) null), 1, (Object) null);
    }

    public void removePermissionObserver(com.onesignal.notifications.o oVar) {
        db.l.e(oVar, "observer");
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.removePermissionObserver(observer: " + oVar + ')', (Throwable) null, 2, (Object) null);
        this.permissionChangedNotifier.unsubscribe(oVar);
    }

    public Object requestPermission(boolean z10, va.d dVar) {
        com.onesignal.debug.internal.logging.a.debug$default("NotificationsManager.requestPermission()", (Throwable) null, 2, (Object) null);
        return mb.h.g(w0.c(), new e(this, z10, (va.d) null), dVar);
    }

    public void setPermission(boolean z10) {
        this.permission = z10;
    }
}
