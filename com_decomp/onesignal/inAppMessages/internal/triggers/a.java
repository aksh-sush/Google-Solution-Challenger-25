package com.onesignal.inAppMessages.internal.triggers;

import com.onesignal.common.events.d;
import java.util.Collection;

public interface a extends d {
    boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar);

    /* synthetic */ boolean getHasSubscribers();

    boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar);

    /* synthetic */ void subscribe(Object obj);

    /* synthetic */ void unsubscribe(Object obj);
}
