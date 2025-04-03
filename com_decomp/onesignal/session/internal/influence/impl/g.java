package com.onesignal.session.internal.influence.impl;

import com.onesignal.common.j;
import com.onesignal.core.internal.config.b;
import db.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l7.f;
import org.json.JSONArray;
import t9.a;
import t9.d;

public final class g implements a, com.onesignal.session.internal.session.a {
    private final f _applicationService;
    private final b _configModelStore;
    private final com.onesignal.session.internal.session.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(com.onesignal.session.internal.session.b bVar, f fVar, b bVar2, y7.a aVar, a8.a aVar2) {
        l.e(bVar, "_sessionService");
        l.e(fVar, "_applicationService");
        l.e(bVar2, "_configModelStore");
        l.e(aVar, "preferences");
        l.e(aVar2, "timeProvider");
        this._sessionService = bVar;
        this._applicationService = fVar;
        this._configModelStore = bVar2;
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar2 = new f(aVar, bVar2);
        this.dataRepository = fVar2;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar2, aVar2));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar2, aVar2));
        bVar.subscribe(this);
        Collection<a> values = concurrentHashMap.values();
        l.d(values, "trackers.values");
        for (a initInfluencedTypeFromCache : values) {
            initInfluencedTypeFromCache.initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(l7.b bVar, String str) {
        boolean z10;
        t9.b bVar2;
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', (Throwable) null, 2, (Object) null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            bVar2 = channelByEntryAction.getCurrentSessionInfluence();
            d dVar = d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z10 = setSessionTracker(channelByEntryAction, dVar, str, (JSONArray) null);
        } else {
            bVar2 = null;
            z10 = false;
        }
        if (z10) {
            com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, (Throwable) null, 2, (Object) null);
            l.b(bVar2);
            arrayList.add(bVar2);
            for (b next : channelsToResetByEntryAction) {
                d influenceType = next.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(next.getCurrentSessionInfluence());
                    next.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", (Throwable) null, 2, (Object) null);
        for (b next2 : channelsToResetByEntryAction) {
            d influenceType2 = next2.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = next2.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    t9.b currentSessionInfluence = next2.getCurrentSessionInfluence();
                    if (setSessionTracker(next2, d.INDIRECT, (String) null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), (Throwable) null, 2, (Object) null);
    }

    static /* synthetic */ void attemptSessionUpgrade$default(g gVar, l7.b bVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(l7.b bVar) {
        if (bVar.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    private final List<b> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final List<b> getChannelsToResetByEntryAction(l7.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.isAppClose()) {
            return arrayList;
        }
        b notificationChannelTracker = bVar.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final b getIAMChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getIAM_TAG());
        l.b(aVar);
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        l.b(aVar);
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(l7.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, (Throwable) null, 2, (Object) null);
        for (b next : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = next.getLastReceivedIds();
            com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, (Throwable) null, 2, (Object) null);
            t9.b currentSessionInfluence = next.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(next, d.INDIRECT, (String) null, lastReceivedIds) : setSessionTracker(next, d.UNATTRIBUTED, (String) null, (JSONArray) null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.a.debug$default(i.e("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), (Throwable) null, 2, (Object) null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb2.append(getChannels());
        com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), (Throwable) null, 2, (Object) null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        d influenceType = bVar.getInfluenceType();
        if ((influenceType != null && influenceType.isDirect()) && bVar.getDirectId() != null && !l.a(bVar.getDirectId(), str)) {
            return true;
        }
        if ((influenceType != null && influenceType.isIndirect()) && bVar.getIndirectIds() != null) {
            JSONArray indirectIds = bVar.getIndirectIds();
            l.b(indirectIds);
            return indirectIds.length() > 0 && !j.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
        }
    }

    public List<t9.b> getInfluences() {
        Collection<a> values = this.trackers.values();
        l.d(values, "trackers.values");
        Iterable<a> iterable = values;
        ArrayList arrayList = new ArrayList(p.l(iterable, 10));
        for (a currentSessionInfluence : iterable) {
            arrayList.add(currentSessionInfluence.getCurrentSessionInfluence());
        }
        return arrayList;
    }

    public void onDirectInfluenceFromIAM(String str) {
        l.e(str, "messageId");
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + str + ')', (Throwable) null, 2, (Object) null);
        setSessionTracker(getIAMChannelTracker(), d.DIRECT, str, (JSONArray) null);
    }

    public void onDirectInfluenceFromNotification(String str) {
        l.e(str, "notificationId");
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + str + ')', (Throwable) null, 2, (Object) null);
        if (!(str.length() == 0)) {
            attemptSessionUpgrade(l7.b.NOTIFICATION_CLICK, str);
        }
    }

    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.onInAppMessageDismissed()", (Throwable) null, 2, (Object) null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    public void onInAppMessageDisplayed(String str) {
        l.e(str, "messageId");
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + str + ')', (Throwable) null, 2, (Object) null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(str);
        iAMChannelTracker.resetAndInitInfluence();
    }

    public void onNotificationReceived(String str) {
        l.e(str, "notificationId");
        com.onesignal.debug.internal.logging.a.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + str + ')', (Throwable) null, 2, (Object) null);
        if (!(str.length() == 0)) {
            getNotificationChannelTracker().saveLastId(str);
        }
    }

    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), (String) null, 2, (Object) null);
    }

    public void onSessionEnded(long j10) {
    }

    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }
}
