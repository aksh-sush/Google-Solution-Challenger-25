package com.onesignal.notifications.internal.listeners;

import com.onesignal.common.modeling.e;
import com.onesignal.common.modeling.h;
import com.onesignal.notifications.internal.pushtoken.c;
import com.onesignal.notifications.n;
import com.onesignal.notifications.o;
import com.onesignal.user.internal.subscriptions.f;
import kotlin.coroutines.jvm.internal.l;
import sa.t;
import va.d;

public final class DeviceRegistrationListener implements z7.b, e, o, com.onesignal.user.internal.subscriptions.a {
    private final e9.a _channelManager;
    private final com.onesignal.core.internal.config.b _configModelStore;
    /* access modifiers changed from: private */
    public final n _notificationsManager;
    /* access modifiers changed from: private */
    public final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    /* access modifiers changed from: private */
    public final com.onesignal.user.internal.subscriptions.b _subscriptionManager;

    static final class a extends l implements cb.l {
        int label;
        final /* synthetic */ DeviceRegistrationListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DeviceRegistrationListener deviceRegistrationListener, d dVar) {
            super(1, dVar);
            this.this$0 = deviceRegistrationListener;
        }

        public final d create(d dVar) {
            return new a(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                n access$get_notificationsManager$p = this.this$0._notificationsManager;
                this.label = 1;
                if (access$get_notificationsManager$p.requestPermission(true, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends l implements cb.l {
        int label;
        final /* synthetic */ DeviceRegistrationListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DeviceRegistrationListener deviceRegistrationListener, d dVar) {
            super(1, dVar);
            this.this$0 = deviceRegistrationListener;
        }

        public final d create(d dVar) {
            return new b(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                com.onesignal.notifications.internal.pushtoken.a access$get_pushTokenManager$p = this.this$0._pushTokenManager;
                this.label = 1;
                obj = access$get_pushTokenManager$p.retrievePushToken(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c cVar = (c) obj;
            this.this$0._subscriptionManager.addOrUpdatePushSubscriptionToken(cVar.getToken(), this.this$0._notificationsManager.getPermission() ? cVar.getStatus() : f.NO_PERMISSION);
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public DeviceRegistrationListener(com.onesignal.core.internal.config.b bVar, e9.a aVar, com.onesignal.notifications.internal.pushtoken.a aVar2, n nVar, com.onesignal.user.internal.subscriptions.b bVar2) {
        db.l.e(bVar, "_configModelStore");
        db.l.e(aVar, "_channelManager");
        db.l.e(aVar2, "_pushTokenManager");
        db.l.e(nVar, "_notificationsManager");
        db.l.e(bVar2, "_subscriptionManager");
        this._configModelStore = bVar;
        this._channelManager = aVar;
        this._pushTokenManager = aVar2;
        this._notificationsManager = nVar;
        this._subscriptionManager = bVar2;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        if (this._subscriptionManager.getSubscriptions().getPush().getToken().length() > 0) {
            this._subscriptionManager.addOrUpdatePushSubscriptionToken((String) null, this._notificationsManager.getPermission() ? f.SUBSCRIBED : f.NO_PERMISSION);
            return;
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(this, (d) null), 1, (Object) null);
    }

    public void onModelUpdated(h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
    }

    public void onNotificationPermissionChange(boolean z10) {
        retrievePushTokenAndUpdateSubscription();
    }

    public void onSubscriptionAdded(ba.e eVar) {
        db.l.e(eVar, "subscription");
    }

    public void onSubscriptionChanged(ba.e eVar, h hVar) {
        db.l.e(eVar, "subscription");
        db.l.e(hVar, "args");
        if (db.l.a(hVar.getPath(), "optedIn") && db.l.a(hVar.getNewValue(), Boolean.TRUE) && !this._notificationsManager.getPermission()) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(this, (d) null), 1, (Object) null);
        }
    }

    public void onSubscriptionRemoved(ba.e eVar) {
        db.l.e(eVar, "subscription");
    }

    public void start() {
        this._configModelStore.subscribe((e) this);
        this._notificationsManager.addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        retrievePushTokenAndUpdateSubscription();
    }

    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        db.l.e(aVar, "model");
        db.l.e(str, "tag");
        if (db.l.a(str, "HYDRATE")) {
            this._channelManager.processChannelList(aVar.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
