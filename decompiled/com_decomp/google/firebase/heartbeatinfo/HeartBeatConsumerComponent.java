package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

public class HeartBeatConsumerComponent {

    class a implements HeartBeatConsumer {
        a() {
        }
    }

    private HeartBeatConsumerComponent() {
    }

    public static Component<?> create() {
        return Component.intoSet(new a(), HeartBeatConsumer.class);
    }
}
