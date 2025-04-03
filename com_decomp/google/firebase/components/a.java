package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

abstract class a implements ComponentContainer {
    a() {
    }

    public Object get(Class cls) {
        Provider provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    public Set setOf(Class cls) {
        return (Set) setOfProvider(cls).get();
    }
}
