package com.onesignal.user.internal.subscriptions.impl;

import android.os.Build;
import cb.l;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.b;
import com.onesignal.common.modeling.h;
import com.onesignal.user.internal.subscriptions.g;
import db.m;
import java.util.Iterator;
import java.util.List;
import l7.f;
import sa.t;

public final class a implements com.onesignal.user.internal.subscriptions.b, com.onesignal.common.modeling.c, com.onesignal.session.internal.session.a {
    private final f _applicationService;
    private final com.onesignal.session.internal.session.b _sessionService;
    private final com.onesignal.user.internal.subscriptions.e _subscriptionModelStore;
    private final com.onesignal.common.events.b events = new com.onesignal.common.events.b();
    private com.onesignal.user.internal.subscriptions.c subscriptions = new com.onesignal.user.internal.subscriptions.c(o.e(), new com.onesignal.user.internal.e());

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0198a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.SMS.ordinal()] = 1;
            iArr[g.EMAIL.ordinal()] = 2;
            iArr[g.PUSH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends m implements l {
        final /* synthetic */ ba.e $subscription;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ba.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.subscriptions.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.user.internal.subscriptions.a aVar) {
            db.l.e(aVar, "it");
            aVar.onSubscriptionAdded(this.$subscription);
        }
    }

    static final class c extends m implements l {
        final /* synthetic */ ba.e $subscription;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ba.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((ba.c) null);
            return t.f15300a;
        }

        public final void invoke(ba.c cVar) {
            db.l.e(cVar, "it");
            cVar.a(new ba.f(((com.onesignal.user.internal.b) this.$subscription).getSavedState(), ((com.onesignal.user.internal.b) this.$subscription).refreshState()));
        }
    }

    static final class d extends m implements l {
        final /* synthetic */ h $args;
        final /* synthetic */ ba.e $subscription;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ba.e eVar, h hVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.subscriptions.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.user.internal.subscriptions.a aVar) {
            db.l.e(aVar, "it");
            aVar.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    static final class e extends m implements l {
        final /* synthetic */ ba.e $subscription;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ba.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.subscriptions.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.user.internal.subscriptions.a aVar) {
            db.l.e(aVar, "it");
            aVar.onSubscriptionRemoved(this.$subscription);
        }
    }

    public a(f fVar, com.onesignal.session.internal.session.b bVar, com.onesignal.user.internal.subscriptions.e eVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(bVar, "_sessionService");
        db.l.e(eVar, "_subscriptionModelStore");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._subscriptionModelStore = eVar;
        Iterator<com.onesignal.common.modeling.g> it = eVar.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((com.onesignal.user.internal.subscriptions.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.c) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(g gVar, String str, com.onesignal.user.internal.subscriptions.f fVar) {
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + str + ')');
        com.onesignal.user.internal.subscriptions.d dVar = new com.onesignal.user.internal.subscriptions.d();
        dVar.setId(com.onesignal.common.h.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        b.a.add$default(this._subscriptionModelStore, dVar, (String) null, 2, (Object) null);
    }

    static /* synthetic */ void addSubscriptionToModels$default(a aVar, g gVar, String str, com.onesignal.user.internal.subscriptions.f fVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fVar = null;
        }
        aVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(com.onesignal.user.internal.subscriptions.d dVar) {
        ba.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        List T = w.T(getSubscriptions().getCollection());
        if (dVar.getType() == g.PUSH) {
            ba.b push = getSubscriptions().getPush();
            db.l.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            com.onesignal.user.internal.b bVar = (com.onesignal.user.internal.b) push;
            db.l.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((com.onesignal.user.internal.b) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(bVar.getChangeHandlersNotifier());
            T.remove(bVar);
        }
        T.add(createSubscriptionFromModel);
        setSubscriptions(new com.onesignal.user.internal.subscriptions.c(T, new com.onesignal.user.internal.e()));
        this.events.fire(new b(createSubscriptionFromModel));
    }

    private final ba.e createSubscriptionFromModel(com.onesignal.user.internal.subscriptions.d dVar) {
        int i10 = C0198a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i10 == 1) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i10 == 2) {
            return new com.onesignal.user.internal.a(dVar);
        }
        if (i10 == 3) {
            return new com.onesignal.user.internal.b(dVar);
        }
        throw new sa.l();
    }

    private final void refreshPushSubscriptionState() {
        ba.b push = getSubscriptions().getPush();
        if (!(push instanceof com.onesignal.user.internal.e)) {
            db.l.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            com.onesignal.user.internal.subscriptions.d model = ((com.onesignal.user.internal.d) push).getModel();
            model.setSdk(com.onesignal.common.l.SDK_VERSION);
            String str = Build.VERSION.RELEASE;
            db.l.d(str, "RELEASE");
            model.setDeviceOS(str);
            String carrierName = com.onesignal.common.g.INSTANCE.getCarrierName(this._applicationService.getAppContext());
            if (carrierName != null) {
                model.setCarrier(carrierName);
            }
            String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
            if (appVersion != null) {
                model.setAppVersion(appVersion);
            }
        }
    }

    private final void removeSubscriptionFromModels(ba.e eVar) {
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        b.a.remove$default(this._subscriptionModelStore, eVar.getId(), (String) null, 2, (Object) null);
    }

    private final void removeSubscriptionFromSubscriptionList(ba.e eVar) {
        List T = w.T(getSubscriptions().getCollection());
        T.remove(eVar);
        setSubscriptions(new com.onesignal.user.internal.subscriptions.c(T, new com.onesignal.user.internal.e()));
        this.events.fire(new e(eVar));
    }

    public void addEmailSubscription(String str) {
        db.l.e(str, "email");
        addSubscriptionToModels$default(this, g.EMAIL, str, (com.onesignal.user.internal.subscriptions.f) null, 4, (Object) null);
    }

    public void addOrUpdatePushSubscriptionToken(String str, com.onesignal.user.internal.subscriptions.f fVar) {
        db.l.e(fVar, "pushTokenStatus");
        ba.b push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            g gVar = g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, fVar);
            return;
        }
        db.l.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        com.onesignal.user.internal.subscriptions.d model = ((com.onesignal.user.internal.d) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(fVar);
    }

    public void addSmsSubscription(String str) {
        db.l.e(str, "sms");
        addSubscriptionToModels$default(this, g.SMS, str, (com.onesignal.user.internal.subscriptions.f) null, 4, (Object) null);
    }

    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public com.onesignal.user.internal.subscriptions.d getPushSubscriptionModel() {
        ba.b push = getSubscriptions().getPush();
        db.l.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((com.onesignal.user.internal.b) push).getModel();
    }

    public com.onesignal.user.internal.subscriptions.c getSubscriptions() {
        return this.subscriptions;
    }

    public void onModelUpdated(h hVar, String str) {
        T t10;
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (db.l.a(((ba.e) t10).getId(), hVar.getModel().getId())) {
                break;
            }
        }
        ba.e eVar = (ba.e) t10;
        if (eVar == null) {
            com.onesignal.common.modeling.g model = hVar.getModel();
            db.l.c(model, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((com.onesignal.user.internal.subscriptions.d) model);
            return;
        }
        if (eVar instanceof com.onesignal.user.internal.b) {
            ((com.onesignal.user.internal.b) eVar).getChangeHandlersNotifier().fireOnMain(new c(eVar));
        }
        this.events.fire(new d(eVar, hVar));
    }

    public void onSessionActive() {
    }

    public void onSessionEnded(long j10) {
    }

    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    public void removeEmailSubscription(String str) {
        T t10;
        boolean z10;
        db.l.e(str, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            ba.a aVar = (ba.a) t10;
            if (!(aVar instanceof com.onesignal.user.internal.a) || !db.l.a(aVar.getEmail(), str)) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                break;
            }
        }
        ba.a aVar2 = (ba.a) t10;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    public void removeSmsSubscription(String str) {
        T t10;
        boolean z10;
        db.l.e(str, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            ba.d dVar = (ba.d) t10;
            if (!(dVar instanceof com.onesignal.user.internal.c) || !db.l.a(dVar.getNumber(), str)) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                break;
            }
        }
        ba.d dVar2 = (ba.d) t10;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    public void setSubscriptions(com.onesignal.user.internal.subscriptions.c cVar) {
        db.l.e(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    public void subscribe(com.onesignal.user.internal.subscriptions.a aVar) {
        db.l.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    public void unsubscribe(com.onesignal.user.internal.subscriptions.a aVar) {
        db.l.e(aVar, "handler");
        this.events.unsubscribe(aVar);
    }

    public void onModelAdded(com.onesignal.user.internal.subscriptions.d dVar, String str) {
        db.l.e(dVar, "model");
        db.l.e(str, "tag");
        createSubscriptionAndAddToSubscriptionList(dVar);
    }

    public void onModelRemoved(com.onesignal.user.internal.subscriptions.d dVar, String str) {
        T t10;
        db.l.e(dVar, "model");
        db.l.e(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (db.l.a(((ba.e) t10).getId(), dVar.getId())) {
                break;
            }
        }
        ba.e eVar = (ba.e) t10;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }
}
