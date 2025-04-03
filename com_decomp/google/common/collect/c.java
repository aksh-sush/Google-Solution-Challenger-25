package com.google.common.collect;

import java.util.Map;
import l5.g;

abstract class c implements Map.Entry {
    c() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return g.a(getKey(), entry.getKey()) && g.a(getValue(), entry.getValue());
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
