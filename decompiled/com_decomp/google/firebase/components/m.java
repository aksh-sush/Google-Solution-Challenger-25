package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f7764e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Event f7765f;

    public /* synthetic */ m(Map.Entry entry, Event event) {
        this.f7764e = entry;
        this.f7765f = event;
    }

    public final void run() {
        ((EventHandler) this.f7764e.getKey()).handle(this.f7765f);
    }
}
