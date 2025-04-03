package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class u extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f7777a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f7778b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f7779c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f7780d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f7781e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f7782f;

    /* renamed from: g  reason: collision with root package name */
    private final ComponentContainer f7783g;

    private static class a implements Publisher {

        /* renamed from: a  reason: collision with root package name */
        private final Set f7784a;

        /* renamed from: b  reason: collision with root package name */
        private final Publisher f7785b;

        public a(Set set, Publisher publisher) {
            this.f7784a = set;
            this.f7785b = publisher;
        }

        public void publish(Event event) {
            if (this.f7784a.contains(event.getType())) {
                this.f7785b.publish(event);
            } else {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", new Object[]{event}));
            }
        }
    }

    u(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency next : component.getDependencies()) {
            if (next.isDirectInjection()) {
                boolean isSet = next.isSet();
                Class<?> cls = next.getInterface();
                if (isSet) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (next.isDeferred()) {
                hashSet3.add(next.getInterface());
            } else {
                boolean isSet2 = next.isSet();
                Class<?> cls2 = next.getInterface();
                if (isSet2) {
                    hashSet5.add(cls2);
                } else {
                    hashSet2.add(cls2);
                }
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.f7777a = Collections.unmodifiableSet(hashSet);
        this.f7778b = Collections.unmodifiableSet(hashSet2);
        this.f7779c = Collections.unmodifiableSet(hashSet3);
        this.f7780d = Collections.unmodifiableSet(hashSet4);
        this.f7781e = Collections.unmodifiableSet(hashSet5);
        this.f7782f = component.getPublishedEvents();
        this.f7783g = componentContainer;
    }

    public Object get(Class cls) {
        if (this.f7777a.contains(cls)) {
            Object obj = this.f7783g.get(cls);
            return !cls.equals(Publisher.class) ? obj : new a(this.f7782f, (Publisher) obj);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public Deferred getDeferred(Class cls) {
        if (this.f7779c.contains(cls)) {
            return this.f7783g.getDeferred(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }

    public Provider getProvider(Class cls) {
        if (this.f7778b.contains(cls)) {
            return this.f7783g.getProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public Set setOf(Class cls) {
        if (this.f7780d.contains(cls)) {
            return this.f7783g.setOf(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public Provider setOfProvider(Class cls) {
        if (this.f7781e.contains(cls)) {
            return this.f7783g.setOfProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
