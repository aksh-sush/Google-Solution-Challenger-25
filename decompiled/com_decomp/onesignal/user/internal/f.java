package com.onesignal.user.internal;

import aa.c;
import cb.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.h;
import com.onesignal.common.modeling.e;
import com.onesignal.user.internal.identity.b;
import db.m;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import sa.t;

public class f implements v9.a, e {
    private final b _identityModelStore;
    private final t7.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final com.onesignal.user.internal.subscriptions.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier = new com.onesignal.common.events.b();

    static final class a extends m implements l {
        final /* synthetic */ c $newUserState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((aa.a) null);
            return t.f15300a;
        }

        public final void invoke(aa.a aVar) {
            db.l.e(aVar, "it");
            aVar.a(new aa.b(this.$newUserState));
        }
    }

    public f(com.onesignal.user.internal.subscriptions.b bVar, b bVar2, com.onesignal.user.internal.properties.b bVar3, t7.a aVar) {
        db.l.e(bVar, "_subscriptionManager");
        db.l.e(bVar2, "_identityModelStore");
        db.l.e(bVar3, "_propertiesModelStore");
        db.l.e(aVar, "_languageContext");
        this._subscriptionManager = bVar;
        this._identityModelStore = bVar2;
        this._propertiesModelStore = bVar3;
        this._languageContext = aVar;
        bVar2.subscribe((e) this);
    }

    private final com.onesignal.user.internal.identity.a get_identityModel() {
        return (com.onesignal.user.internal.identity.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    public void addAlias(String str, String str2) {
        db.l.e(str, Constants.ScionAnalytics.PARAM_LABEL);
        db.l.e(str2, "id");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "setAlias(label: " + str + ", id: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot add empty alias");
        } else if (db.l.a(str, "onesignal_id")) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put(str, str2);
        }
    }

    public void addAliases(Map<String, String> map) {
        c8.b bVar;
        String str;
        db.l.e(map, "aliases");
        c8.b bVar2 = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar2, "addAliases(aliases: " + map);
        for (Map.Entry next : map.entrySet()) {
            if (((CharSequence) next.getKey()).length() == 0) {
                bVar = c8.b.ERROR;
                str = "Cannot add empty alias";
            } else if (db.l.a(next.getKey(), "onesignal_id")) {
                bVar = c8.b.ERROR;
                str = "Cannot add 'onesignal_id' alias";
            }
            com.onesignal.debug.internal.logging.a.log(bVar, str);
            return;
        }
        for (Map.Entry next2 : map.entrySet()) {
            get_identityModel().put(next2.getKey(), next2.getValue());
        }
    }

    public void addEmail(String str) {
        db.l.e(str, "email");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "addEmail(email: " + str + ')');
        if (!com.onesignal.common.l.INSTANCE.isValidEmail(str)) {
            c8.b bVar2 = c8.b.ERROR;
            com.onesignal.debug.internal.logging.a.log(bVar2, "Cannot add invalid email address as subscription: " + str);
            return;
        }
        this._subscriptionManager.addEmailSubscription(str);
    }

    public void addObserver(aa.a aVar) {
        db.l.e(aVar, "observer");
        this.changeHandlersNotifier.subscribe(aVar);
    }

    public void addSms(String str) {
        db.l.e(str, "sms");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "addSms(sms: " + str + ')');
        if (!com.onesignal.common.l.INSTANCE.isValidPhoneNumber(str)) {
            c8.b bVar2 = c8.b.ERROR;
            com.onesignal.debug.internal.logging.a.log(bVar2, "Cannot add invalid sms number as subscription: " + str);
            return;
        }
        this._subscriptionManager.addSmsSubscription(str);
    }

    public void addTag(String str, String str2) {
        db.l.e(str, "key");
        db.l.e(str2, FirebaseAnalytics.Param.VALUE);
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "setTag(key: " + str + ", value: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put(str, str2);
        }
    }

    public void addTags(Map<String, String> map) {
        boolean z10;
        db.l.e(map, "tags");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "setTags(tags: " + map + ')');
        for (Map.Entry<String, String> key : map.entrySet()) {
            if (((CharSequence) key.getKey()).length() == 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            get_propertiesModel().getTags().put(next.getKey(), next.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        com.onesignal.user.internal.identity.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!db.l.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return f0.l(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    public String getOnesignalId() {
        return h.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    public ba.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final com.onesignal.user.internal.subscriptions.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    public Map<String, String> getTags() {
        return f0.l(get_propertiesModel().getTags());
    }

    public void onModelUpdated(com.onesignal.common.modeling.h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        if (db.l.a(hVar.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new c(String.valueOf(hVar.getNewValue()), getExternalId())));
        }
    }

    public void removeAlias(String str) {
        db.l.e(str, Constants.ScionAnalytics.PARAM_LABEL);
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "removeAlias(label: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot remove empty alias");
        } else if (db.l.a(str, "onesignal_id")) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) str);
        }
    }

    public void removeAliases(Collection<String> collection) {
        c8.b bVar;
        String str;
        db.l.e(collection, "labels");
        c8.b bVar2 = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar2, "removeAliases(labels: " + collection + ')');
        Iterable<String> iterable = collection;
        for (String str2 : iterable) {
            if (str2.length() == 0) {
                bVar = c8.b.ERROR;
                str = "Cannot remove empty alias";
            } else if (db.l.a(str2, "onesignal_id")) {
                bVar = c8.b.ERROR;
                str = "Cannot remove 'onesignal_id' alias";
            }
            com.onesignal.debug.internal.logging.a.log(bVar, str);
            return;
        }
        for (String remove : iterable) {
            get_identityModel().remove((Object) remove);
        }
    }

    public void removeEmail(String str) {
        db.l.e(str, "email");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "removeEmail(email: " + str + ')');
        if (!com.onesignal.common.l.INSTANCE.isValidEmail(str)) {
            c8.b bVar2 = c8.b.ERROR;
            com.onesignal.debug.internal.logging.a.log(bVar2, "Cannot remove invalid email address as subscription: " + str);
            return;
        }
        this._subscriptionManager.removeEmailSubscription(str);
    }

    public void removeObserver(aa.a aVar) {
        db.l.e(aVar, "observer");
        this.changeHandlersNotifier.unsubscribe(aVar);
    }

    public void removeSms(String str) {
        db.l.e(str, "sms");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "removeSms(sms: " + str + ')');
        if (!com.onesignal.common.l.INSTANCE.isValidPhoneNumber(str)) {
            c8.b bVar2 = c8.b.ERROR;
            com.onesignal.debug.internal.logging.a.log(bVar2, "Cannot remove invalid sms number as subscription: " + str);
            return;
        }
        this._subscriptionManager.removeSmsSubscription(str);
    }

    public void removeTag(String str) {
        db.l.e(str, "key");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "removeTag(key: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) str);
        }
    }

    public void removeTags(Collection<String> collection) {
        boolean z10;
        db.l.e(collection, "keys");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "removeTags(keys: " + collection + ')');
        Iterable<String> iterable = collection;
        for (String length : iterable) {
            if (length.length() == 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                com.onesignal.debug.internal.logging.a.log(c8.b.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        for (String remove : iterable) {
            get_propertiesModel().getTags().remove((Object) remove);
        }
    }

    public void setLanguage(String str) {
        db.l.e(str, FirebaseAnalytics.Param.VALUE);
        this._languageContext.setLanguage(str);
    }

    public void onModelReplaced(com.onesignal.user.internal.identity.a aVar, String str) {
        db.l.e(aVar, "model");
        db.l.e(str, "tag");
    }
}
