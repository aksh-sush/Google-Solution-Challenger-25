package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.s;
import java.util.concurrent.Executor;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5431a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5432b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f5433c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f5434a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5435b;

        a(Object obj, String str) {
            this.f5434a = obj;
            this.f5435b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5434a == aVar.f5434a && this.f5435b.equals(aVar.f5435b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5434a) * 31) + this.f5435b.hashCode();
        }
    }

    l(Looper looper, Object obj, String str) {
        this.f5431a = new z3.a(looper);
        this.f5432b = s.l(obj, "Listener must not be null");
        this.f5433c = new a(obj, s.g(str));
    }

    public void a() {
        this.f5432b = null;
        this.f5433c = null;
    }
}
