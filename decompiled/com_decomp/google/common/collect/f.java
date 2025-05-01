package com.google.common.collect;

import java.io.Serializable;
import l5.d;
import l5.g;
import l5.j;

final class f extends c0 implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    final d f7554e;

    /* renamed from: f  reason: collision with root package name */
    final c0 f7555f;

    f(d dVar, c0 c0Var) {
        this.f7554e = (d) j.o(dVar);
        this.f7555f = (c0) j.o(c0Var);
    }

    public int compare(Object obj, Object obj2) {
        return this.f7555f.compare(this.f7554e.apply(obj), this.f7554e.apply(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7554e.equals(fVar.f7554e) && this.f7555f.equals(fVar.f7555f);
    }

    public int hashCode() {
        return g.b(this.f7554e, this.f7555f);
    }

    public String toString() {
        return this.f7555f + ".onResultOf(" + this.f7554e + ")";
    }
}
