package com.onesignal.internal;

import android.content.Context;
import android.os.Build;
import cb.p;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.i;
import com.onesignal.common.l;
import com.onesignal.common.modeling.b;
import com.onesignal.common.modeling.d;
import com.onesignal.core.CoreModule;
import com.onesignal.notifications.n;
import com.onesignal.session.SessionModule;
import com.onesignal.session.internal.session.c;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.operations.f;
import com.onesignal.user.internal.operations.h;
import com.onesignal.user.internal.subscriptions.g;
import db.m;
import e8.j;
import g7.a;
import j7.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import sa.o;
import sa.t;
import v7.e;
import y7.a;

/* loaded from: classes.dex */
public final class a implements g7.a, j7.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private com.onesignal.location.a _location;
    private n _notifications;
    private s9.a _session;
    private v9.a _user;
    private com.onesignal.core.internal.config.a configModel;
    private j iam;
    private com.onesignal.user.internal.identity.b identityModelStore;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private e operationRepo;
    private y7.a preferencesService;
    private com.onesignal.user.internal.properties.b propertiesModelStore;
    private final d services;
    private c sessionModel;
    private z7.c startupService;
    private com.onesignal.user.internal.subscriptions.e subscriptionModelStore;
    private final String sdkVersion = l.SDK_VERSION;
    private final c8.a debug = new d8.a();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    /* renamed from: com.onesignal.internal.a$a, reason: collision with other inner class name */
    static final class C0156a extends m implements p {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0156a(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // cb.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.onesignal.user.internal.identity.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return t.f15592a;
        }

        public final void invoke(com.onesignal.user.internal.identity.a aVar, com.onesignal.user.internal.properties.a aVar2) {
            db.l.e(aVar, "identityModel");
            db.l.e(aVar2, "<anonymous parameter 1>");
            aVar.setExternalId(this.$externalId);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ db.t $currentIdentityExternalId;
        final /* synthetic */ db.t $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ db.t $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(db.t tVar, String str, db.t tVar2, db.t tVar3, va.d dVar) {
            super(1, dVar);
            this.$newIdentityOneSignalId = tVar;
            this.$externalId = str;
            this.$currentIdentityExternalId = tVar2;
            this.$currentIdentityOneSignalId = tVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final va.d create(va.d dVar) {
            return a.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = wa.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                e eVar = a.this.operationRepo;
                db.l.b(eVar);
                com.onesignal.core.internal.config.a aVar = a.this.configModel;
                db.l.b(aVar);
                f fVar = new f(aVar.getAppId(), (String) this.$newIdentityOneSignalId.f9458e, this.$externalId, this.$currentIdentityExternalId.f9458e == null ? (String) this.$currentIdentityOneSignalId.f9458e : null);
                this.label = 1;
                obj = eVar.enqueueAndWait(fVar, true, this);
                if (obj == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return t.f15592a;
                }
                o.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                e eVar2 = a.this.operationRepo;
                db.l.b(eVar2);
                com.onesignal.core.internal.config.a aVar2 = a.this.configModel;
                db.l.b(aVar2);
                String appId = aVar2.getAppId();
                com.onesignal.user.internal.identity.b bVar = a.this.identityModelStore;
                db.l.b(bVar);
                h hVar = new h(appId, ((com.onesignal.user.internal.identity.a) bVar.getModel()).getOnesignalId());
                this.label = 2;
                if (eVar2.enqueueAndWait(hVar, true, this) == c10) {
                    return c10;
                }
            } else {
                com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Could not login user");
            }
            return t.f15592a;
        }

        @Override // cb.l
        public final Object invoke(va.d dVar) {
            return ((b) create(dVar)).invokeSuspend(t.f15592a);
        }
    }

    public a() {
        List<String> g10;
        g10 = ta.o.g("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = g10;
        j7.c cVar = new j7.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = g10.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                db.l.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((i7.a) newInstance);
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((i7.a) it2.next()).register(cVar);
        }
        this.services = cVar.build();
    }

    private final void createAndSwitchToNewUser(boolean z10, p pVar) {
        Object obj;
        String createLocalId;
        String str;
        com.onesignal.user.internal.subscriptions.f fVar;
        com.onesignal.debug.internal.logging.a.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = com.onesignal.common.h.INSTANCE.createLocalId();
        com.onesignal.user.internal.identity.a aVar = new com.onesignal.user.internal.identity.a();
        aVar.setOnesignalId(createLocalId2);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(createLocalId2);
        if (pVar != null) {
            pVar.invoke(aVar, aVar2);
        }
        ArrayList arrayList = new ArrayList();
        com.onesignal.user.internal.subscriptions.e eVar = this.subscriptionModelStore;
        db.l.b(eVar);
        Iterator<T> it = eVar.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String id = ((com.onesignal.user.internal.subscriptions.d) obj).getId();
            com.onesignal.core.internal.config.a aVar3 = this.configModel;
            db.l.b(aVar3);
            if (db.l.a(id, aVar3.getPushSubscriptionId())) {
                break;
            }
        }
        com.onesignal.user.internal.subscriptions.d dVar = (com.onesignal.user.internal.subscriptions.d) obj;
        com.onesignal.user.internal.subscriptions.d dVar2 = new com.onesignal.user.internal.subscriptions.d();
        if (dVar == null || (createLocalId = dVar.getId()) == null) {
            createLocalId = com.onesignal.common.h.INSTANCE.createLocalId();
        }
        dVar2.setId(createLocalId);
        dVar2.setType(g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str = dVar.getAddress()) == null) {
            str = "";
        }
        dVar2.setAddress(str);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = com.onesignal.user.internal.subscriptions.f.NO_PERMISSION;
        }
        dVar2.setStatus(fVar);
        dVar2.setSdk(l.SDK_VERSION);
        String str2 = Build.VERSION.RELEASE;
        db.l.d(str2, "RELEASE");
        dVar2.setDeviceOS(str2);
        String carrierName = com.onesignal.common.g.INSTANCE.getCarrierName(((l7.f) this.services.getService(l7.f.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        dVar2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((l7.f) this.services.getService(l7.f.class)).getAppContext());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        com.onesignal.core.internal.config.a aVar4 = this.configModel;
        db.l.b(aVar4);
        aVar4.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        com.onesignal.user.internal.subscriptions.e eVar2 = this.subscriptionModelStore;
        db.l.b(eVar2);
        eVar2.clear("NO_PROPOGATE");
        com.onesignal.user.internal.identity.b bVar = this.identityModelStore;
        db.l.b(bVar);
        d.a.replace$default(bVar, aVar, null, 2, null);
        com.onesignal.user.internal.properties.b bVar2 = this.propertiesModelStore;
        db.l.b(bVar2);
        d.a.replace$default(bVar2, aVar2, null, 2, null);
        if (!z10) {
            if (dVar == null) {
                com.onesignal.user.internal.subscriptions.e eVar3 = this.subscriptionModelStore;
                db.l.b(eVar3);
                b.a.replaceAll$default(eVar3, arrayList, null, 2, null);
                return;
            } else {
                e eVar4 = this.operationRepo;
                db.l.b(eVar4);
                com.onesignal.core.internal.config.a aVar5 = this.configModel;
                db.l.b(aVar5);
                e.a.enqueue$default(eVar4, new com.onesignal.user.internal.operations.o(aVar5.getAppId(), dVar.getId(), createLocalId2), false, 2, null);
            }
        }
        com.onesignal.user.internal.subscriptions.e eVar5 = this.subscriptionModelStore;
        db.l.b(eVar5);
        eVar5.replaceAll(arrayList, "NO_PROPOGATE");
    }

    static /* synthetic */ void createAndSwitchToNewUser$default(a aVar, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        aVar.createAndSwitchToNewUser(z10, pVar);
    }

    @Override // j7.b
    public <T> List<T> getAllServices(Class<T> cls) {
        db.l.e(cls, "c");
        return this.services.getAllServices(cls);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentGiven = aVar.getConsentGiven()) == null) ? db.l.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentRequired = aVar.getConsentRequired()) == null) ? db.l.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    @Override // g7.a
    public c8.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return aVar != null ? aVar.getDisableGMSMissingPrompt() : db.l.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public j getInAppMessages() {
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before use");
        }
        j jVar = this.iam;
        db.l.b(jVar);
        return jVar;
    }

    public com.onesignal.location.a getLocation() {
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before use");
        }
        com.onesignal.location.a aVar = this._location;
        db.l.b(aVar);
        return aVar;
    }

    public n getNotifications() {
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before use");
        }
        n nVar = this._notifications;
        db.l.b(nVar);
        return nVar;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // j7.b
    public <T> T getService(Class<T> cls) {
        db.l.e(cls, "c");
        return (T) this.services.getService(cls);
    }

    @Override // j7.b
    public <T> T getServiceOrNull(Class<T> cls) {
        db.l.e(cls, "c");
        return (T) this.services.getServiceOrNull(cls);
    }

    public s9.a getSession() {
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before use");
        }
        s9.a aVar = this._session;
        db.l.b(aVar);
        return aVar;
    }

    @Override // g7.a
    public v9.a getUser() {
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before use");
        }
        v9.a aVar = this._user;
        db.l.b(aVar);
        return aVar;
    }

    @Override // j7.b
    public <T> boolean hasService(Class<T> cls) {
        db.l.e(cls, "c");
        return this.services.hasService(cls);
    }

    @Override // g7.a
    public boolean initWithContext(Context context, String str) {
        boolean z10;
        boolean z11;
        db.l.e(context, "context");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                com.onesignal.debug.internal.logging.a.log(bVar, "initWithContext: SDK already initialized");
                return true;
            }
            com.onesignal.debug.internal.logging.a.log(bVar, "initWithContext: SDK initializing");
            y7.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
            l7.f fVar = (l7.f) this.services.getService(l7.f.class);
            db.l.c(fVar, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.c) fVar).start(context);
            com.onesignal.debug.internal.logging.a.INSTANCE.setApplicationService(fVar);
            this.configModel = (com.onesignal.core.internal.config.a) ((com.onesignal.core.internal.config.b) this.services.getService(com.onesignal.core.internal.config.b.class)).getModel();
            this.sessionModel = (c) ((com.onesignal.session.internal.session.d) this.services.getService(com.onesignal.session.internal.session.d.class)).getModel();
            if (str == null) {
                com.onesignal.core.internal.config.a aVar = this.configModel;
                db.l.b(aVar);
                if (!aVar.hasProperty("appId")) {
                    com.onesignal.debug.internal.logging.a.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                    return false;
                }
            }
            if (str != null) {
                com.onesignal.core.internal.config.a aVar2 = this.configModel;
                db.l.b(aVar2);
                if (aVar2.hasProperty("appId")) {
                    com.onesignal.core.internal.config.a aVar3 = this.configModel;
                    db.l.b(aVar3);
                    if (db.l.a(aVar3.getAppId(), str)) {
                        z10 = false;
                        com.onesignal.core.internal.config.a aVar4 = this.configModel;
                        db.l.b(aVar4);
                        aVar4.setAppId(str);
                    }
                }
                z10 = true;
                com.onesignal.core.internal.config.a aVar42 = this.configModel;
                db.l.b(aVar42);
                aVar42.setAppId(str);
            } else {
                z10 = false;
            }
            if (this._consentRequired != null) {
                com.onesignal.core.internal.config.a aVar5 = this.configModel;
                db.l.b(aVar5);
                Boolean bool = this._consentRequired;
                db.l.b(bool);
                aVar5.setConsentRequired(bool);
            }
            if (this._consentGiven != null) {
                com.onesignal.core.internal.config.a aVar6 = this.configModel;
                db.l.b(aVar6);
                Boolean bool2 = this._consentGiven;
                db.l.b(bool2);
                aVar6.setConsentGiven(bool2);
            }
            if (this._disableGMSMissingPrompt != null) {
                com.onesignal.core.internal.config.a aVar7 = this.configModel;
                db.l.b(aVar7);
                Boolean bool3 = this._disableGMSMissingPrompt;
                db.l.b(bool3);
                aVar7.setDisableGMSMissingPrompt(bool3.booleanValue());
            }
            this._location = (com.onesignal.location.a) this.services.getService(com.onesignal.location.a.class);
            this._user = (v9.a) this.services.getService(v9.a.class);
            this._session = (s9.a) this.services.getService(s9.a.class);
            this.iam = (j) this.services.getService(j.class);
            this._notifications = (n) this.services.getService(n.class);
            this.operationRepo = (e) this.services.getService(e.class);
            this.propertiesModelStore = (com.onesignal.user.internal.properties.b) this.services.getService(com.onesignal.user.internal.properties.b.class);
            this.identityModelStore = (com.onesignal.user.internal.identity.b) this.services.getService(com.onesignal.user.internal.identity.b.class);
            this.subscriptionModelStore = (com.onesignal.user.internal.subscriptions.e) this.services.getService(com.onesignal.user.internal.subscriptions.e.class);
            this.preferencesService = (y7.a) this.services.getService(y7.a.class);
            z7.c cVar = (z7.c) this.services.getService(z7.c.class);
            this.startupService = cVar;
            db.l.b(cVar);
            cVar.bootstrap();
            if (!z10) {
                com.onesignal.user.internal.identity.b bVar2 = this.identityModelStore;
                db.l.b(bVar2);
                if (((com.onesignal.user.internal.identity.a) bVar2.getModel()).hasProperty("onesignal_id")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("initWithContext: using cached user ");
                    com.onesignal.user.internal.identity.b bVar3 = this.identityModelStore;
                    db.l.b(bVar3);
                    sb2.append(((com.onesignal.user.internal.identity.a) bVar3.getModel()).getOnesignalId());
                    com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), null, 2, null);
                    e eVar = this.operationRepo;
                    db.l.b(eVar);
                    com.onesignal.core.internal.config.a aVar8 = this.configModel;
                    db.l.b(aVar8);
                    String appId = aVar8.getAppId();
                    com.onesignal.user.internal.identity.b bVar4 = this.identityModelStore;
                    db.l.b(bVar4);
                    e.a.enqueue$default(eVar, new h(appId, ((com.onesignal.user.internal.identity.a) bVar4.getModel()).getOnesignalId()), false, 2, null);
                    z7.c cVar2 = this.startupService;
                    db.l.b(cVar2);
                    cVar2.start();
                    setInitialized(true);
                    return true;
                }
            }
            y7.a aVar9 = this.preferencesService;
            db.l.b(aVar9);
            String string$default = a.C0324a.getString$default(aVar9, "OneSignal", "GT_PLAYER_ID", null, 4, null);
            if (string$default == null) {
                com.onesignal.debug.internal.logging.a.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                createAndSwitchToNewUser$default(this, false, null, 3, null);
                e eVar2 = this.operationRepo;
                db.l.b(eVar2);
                com.onesignal.core.internal.config.a aVar10 = this.configModel;
                db.l.b(aVar10);
                String appId2 = aVar10.getAppId();
                com.onesignal.user.internal.identity.b bVar5 = this.identityModelStore;
                db.l.b(bVar5);
                String onesignalId = ((com.onesignal.user.internal.identity.a) bVar5.getModel()).getOnesignalId();
                com.onesignal.user.internal.identity.b bVar6 = this.identityModelStore;
                db.l.b(bVar6);
                e.a.enqueue$default(eVar2, new f(appId2, onesignalId, ((com.onesignal.user.internal.identity.a) bVar6.getModel()).getExternalId(), null, 8, null), false, 2, null);
            } else {
                com.onesignal.debug.internal.logging.a.debug$default("initWithContext: creating user linked to subscription " + string$default, null, 2, null);
                y7.a aVar11 = this.preferencesService;
                db.l.b(aVar11);
                String string$default2 = a.C0324a.getString$default(aVar11, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                if (string$default2 != null) {
                    JSONObject jSONObject = new JSONObject(string$default2);
                    int i10 = jSONObject.getInt("notification_types");
                    com.onesignal.user.internal.subscriptions.d dVar = new com.onesignal.user.internal.subscriptions.d();
                    dVar.setId(string$default);
                    dVar.setType(g.PUSH);
                    com.onesignal.user.internal.subscriptions.f fVar2 = com.onesignal.user.internal.subscriptions.f.NO_PERMISSION;
                    dVar.setOptedIn((i10 == fVar2.getValue() || i10 == com.onesignal.user.internal.subscriptions.f.UNSUBSCRIBE.getValue()) ? false : true);
                    String safeString = i.safeString(jSONObject, "identifier");
                    if (safeString == null) {
                        safeString = "";
                    }
                    dVar.setAddress(safeString);
                    com.onesignal.user.internal.subscriptions.f fromInt = com.onesignal.user.internal.subscriptions.f.Companion.fromInt(i10);
                    if (fromInt != null) {
                        fVar2 = fromInt;
                    }
                    dVar.setStatus(fVar2);
                    dVar.setSdk(l.SDK_VERSION);
                    String str2 = Build.VERSION.RELEASE;
                    db.l.d(str2, "RELEASE");
                    dVar.setDeviceOS(str2);
                    String carrierName = com.onesignal.common.g.INSTANCE.getCarrierName(((l7.f) this.services.getService(l7.f.class)).getAppContext());
                    if (carrierName == null) {
                        carrierName = "";
                    }
                    dVar.setCarrier(carrierName);
                    String appVersion = AndroidUtils.INSTANCE.getAppVersion(((l7.f) this.services.getService(l7.f.class)).getAppContext());
                    if (appVersion == null) {
                        appVersion = "";
                    }
                    dVar.setAppVersion(appVersion);
                    com.onesignal.core.internal.config.a aVar12 = this.configModel;
                    db.l.b(aVar12);
                    aVar12.setPushSubscriptionId(string$default);
                    com.onesignal.user.internal.subscriptions.e eVar3 = this.subscriptionModelStore;
                    db.l.b(eVar3);
                    eVar3.add(dVar, "NO_PROPOGATE");
                    z11 = true;
                } else {
                    z11 = false;
                }
                createAndSwitchToNewUser$default(this, z11, null, 2, null);
                e eVar4 = this.operationRepo;
                db.l.b(eVar4);
                com.onesignal.core.internal.config.a aVar13 = this.configModel;
                db.l.b(aVar13);
                String appId3 = aVar13.getAppId();
                com.onesignal.user.internal.identity.b bVar7 = this.identityModelStore;
                db.l.b(bVar7);
                e.a.enqueue$default(eVar4, new com.onesignal.user.internal.operations.e(appId3, ((com.onesignal.user.internal.identity.a) bVar7.getModel()).getOnesignalId(), string$default), false, 2, null);
                y7.a aVar14 = this.preferencesService;
                db.l.b(aVar14);
                aVar14.saveString("OneSignal", "GT_PLAYER_ID", null);
            }
            z7.c cVar22 = this.startupService;
            db.l.b(cVar22);
            cVar22.start();
            setInitialized(true);
            return true;
        }
    }

    @Override // g7.a
    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // g7.a
    public void login(String str) {
        a.C0222a.a(this, str);
    }

    public void logout() {
        com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            com.onesignal.user.internal.identity.b bVar = this.identityModelStore;
            db.l.b(bVar);
            if (((com.onesignal.user.internal.identity.a) bVar.getModel()).getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            e eVar = this.operationRepo;
            db.l.b(eVar);
            com.onesignal.core.internal.config.a aVar = this.configModel;
            db.l.b(aVar);
            String appId = aVar.getAppId();
            com.onesignal.user.internal.identity.b bVar2 = this.identityModelStore;
            db.l.b(bVar2);
            String onesignalId = ((com.onesignal.user.internal.identity.a) bVar2.getModel()).getOnesignalId();
            com.onesignal.user.internal.identity.b bVar3 = this.identityModelStore;
            db.l.b(bVar3);
            e.a.enqueue$default(eVar, new f(appId, onesignalId, ((com.onesignal.user.internal.identity.a) bVar3.getModel()).getExternalId(), null, 8, null), false, 2, null);
            t tVar = t.f15592a;
        }
    }

    public void setConsentGiven(boolean z10) {
        this._consentGiven = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentGiven(Boolean.valueOf(z10));
    }

    public void setConsentRequired(boolean z10) {
        this._consentRequired = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentRequired(Boolean.valueOf(z10));
    }

    public void setDisableGMSMissingPrompt(boolean z10) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setDisableGMSMissingPrompt(z10);
    }

    public void setInitialized(boolean z10) {
        this.isInitialized = z10;
    }

    @Override // g7.a
    public void login(String str, String str2) {
        db.l.e(str, "externalId");
        com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "login(externalId: " + str + ", jwtBearerToken: " + str2 + ')');
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'login'");
        }
        db.t tVar = new db.t();
        db.t tVar2 = new db.t();
        db.t tVar3 = new db.t();
        tVar3.f9458e = "";
        synchronized (this.loginLock) {
            com.onesignal.user.internal.identity.b bVar = this.identityModelStore;
            db.l.b(bVar);
            tVar.f9458e = ((com.onesignal.user.internal.identity.a) bVar.getModel()).getExternalId();
            com.onesignal.user.internal.identity.b bVar2 = this.identityModelStore;
            db.l.b(bVar2);
            tVar2.f9458e = ((com.onesignal.user.internal.identity.a) bVar2.getModel()).getOnesignalId();
            if (!db.l.a(tVar.f9458e, str)) {
                createAndSwitchToNewUser$default(this, false, new C0156a(str), 1, null);
                com.onesignal.user.internal.identity.b bVar3 = this.identityModelStore;
                db.l.b(bVar3);
                tVar3.f9458e = ((com.onesignal.user.internal.identity.a) bVar3.getModel()).getOnesignalId();
                t tVar4 = t.f15592a;
                com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar3, str, tVar, tVar2, null), 1, null);
                return;
            }
            e eVar = this.operationRepo;
            db.l.b(eVar);
            com.onesignal.core.internal.config.a aVar = this.configModel;
            db.l.b(aVar);
            String appId = aVar.getAppId();
            com.onesignal.user.internal.identity.b bVar4 = this.identityModelStore;
            db.l.b(bVar4);
            eVar.enqueue(new h(appId, ((com.onesignal.user.internal.identity.a) bVar4.getModel()).getOnesignalId()), true);
        }
    }
}