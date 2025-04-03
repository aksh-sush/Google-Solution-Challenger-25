package com.google.protobuf;

import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;

public class r {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8733b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile r f8734c;

    /* renamed from: d  reason: collision with root package name */
    static final r f8735d = new r(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f8736a = Collections.emptyMap();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8737a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8738b;

        a(Object obj, int i10) {
            this.f8737a = obj;
            this.f8738b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8737a == aVar.f8737a && this.f8738b == aVar.f8738b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8737a) * 65535) + this.f8738b;
        }
    }

    r(boolean z10) {
    }

    public static r b() {
        r rVar = f8734c;
        if (rVar == null) {
            synchronized (r.class) {
                rVar = f8734c;
                if (rVar == null) {
                    rVar = f8733b ? q.a() : f8735d;
                    f8734c = rVar;
                }
            }
        }
        return rVar;
    }

    public z.d a(t0 t0Var, int i10) {
        return (z.d) this.f8736a.get(new a(t0Var, i10));
    }
}
