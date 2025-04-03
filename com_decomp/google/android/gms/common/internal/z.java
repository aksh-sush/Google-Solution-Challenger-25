package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

public class z implements a.d {

    /* renamed from: f  reason: collision with root package name */
    public static final z f5737f = a().a();

    /* renamed from: e  reason: collision with root package name */
    private final String f5738e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f5739a;

        /* synthetic */ a(c0 c0Var) {
        }

        public z a() {
            return new z(this.f5739a, (d0) null);
        }
    }

    /* synthetic */ z(String str, d0 d0Var) {
        this.f5738e = str;
    }

    public static a a() {
        return new a((c0) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f5738e;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        return q.b(this.f5738e, ((z) obj).f5738e);
    }

    public final int hashCode() {
        return q.c(this.f5738e);
    }
}
