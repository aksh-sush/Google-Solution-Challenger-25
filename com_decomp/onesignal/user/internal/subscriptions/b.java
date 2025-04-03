package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.events.d;

public interface b extends d {
    void addEmailSubscription(String str);

    void addOrUpdatePushSubscriptionToken(String str, f fVar);

    void addSmsSubscription(String str);

    /* synthetic */ boolean getHasSubscribers();

    d getPushSubscriptionModel();

    c getSubscriptions();

    void removeEmailSubscription(String str);

    void removeSmsSubscription(String str);

    void setSubscriptions(c cVar);

    /* synthetic */ void subscribe(Object obj);

    /* synthetic */ void unsubscribe(Object obj);
}
