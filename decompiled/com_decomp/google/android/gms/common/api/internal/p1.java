package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.q;
import q3.d;

final class p1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f5473a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f5474b;

    /* synthetic */ p1(c cVar, d dVar, o1 o1Var) {
        this.f5473a = cVar;
        this.f5474b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p1)) {
            p1 p1Var = (p1) obj;
            return q.b(this.f5473a, p1Var.f5473a) && q.b(this.f5474b, p1Var.f5474b);
        }
    }

    public final int hashCode() {
        return q.c(this.f5473a, this.f5474b);
    }

    public final String toString() {
        return q.d(this).a("key", this.f5473a).a("feature", this.f5474b).toString();
    }
}
