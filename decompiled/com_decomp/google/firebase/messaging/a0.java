package com.google.firebase.messaging;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.messaging.FirebaseMessaging;

final /* synthetic */ class a0 implements EventHandler {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging.a f8369a;

    a0(FirebaseMessaging.a aVar) {
        this.f8369a = aVar;
    }

    public void handle(Event event) {
        this.f8369a.c(event);
    }
}
