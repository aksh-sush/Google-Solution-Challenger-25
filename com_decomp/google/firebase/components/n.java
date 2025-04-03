package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class n implements Subscriber, Publisher {

    /* renamed from: a  reason: collision with root package name */
    private final Map f7766a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue f7767b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7768c;

    n(Executor executor) {
        this.f7768c = executor;
    }

    private synchronized Set c(Event event) {
        Map map;
        map = (Map) this.f7766a.get(event.getType());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Queue<Event> queue;
        synchronized (this) {
            queue = this.f7767b;
            if (queue != null) {
                this.f7767b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event publish : queue) {
                publish(publish);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.m(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = c(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publish(com.google.firebase.events.Event r5) {
        /*
            r4 = this;
            com.google.firebase.components.Preconditions.checkNotNull(r5)
            monitor-enter(r4)
            java.util.Queue r0 = r4.f7767b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.c(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.m r3 = new com.google.firebase.components.m
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.n.publish(com.google.firebase.events.Event):void");
    }

    public void subscribe(Class cls, EventHandler eventHandler) {
        subscribe(cls, this.f7768c, eventHandler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unsubscribe(java.lang.Class r2, com.google.firebase.events.EventHandler r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.components.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0029 }
            com.google.firebase.components.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map r0 = r1.f7766a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map r0 = r1.f7766a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map r3 = r1.f7766a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.n.unsubscribe(java.lang.Class, com.google.firebase.events.EventHandler):void");
    }

    public synchronized void subscribe(Class cls, Executor executor, EventHandler eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        Preconditions.checkNotNull(executor);
        if (!this.f7766a.containsKey(cls)) {
            this.f7766a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f7766a.get(cls)).put(eventHandler, executor);
    }
}
