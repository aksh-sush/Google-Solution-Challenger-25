package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f5330a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5331b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f5332c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5333d;

    private c(a aVar, a.d dVar, String str) {
        this.f5331b = aVar;
        this.f5332c = dVar;
        this.f5333d = str;
        this.f5330a = q.c(aVar, dVar, str);
    }

    public static c a(a aVar, a.d dVar, String str) {
        return new c(aVar, dVar, str);
    }

    public final String b() {
        return this.f5331b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q.b(this.f5331b, cVar.f5331b) && q.b(this.f5332c, cVar.f5332c) && q.b(this.f5333d, cVar.f5333d);
    }

    public final int hashCode() {
        return this.f5330a;
    }
}
