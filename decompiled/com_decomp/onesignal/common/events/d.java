package com.onesignal.common.events;

public interface d {
    boolean getHasSubscribers();

    void subscribe(Object obj);

    void unsubscribe(Object obj);
}
