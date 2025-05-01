package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public abstract class q {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f5687a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f5688b;

        /* synthetic */ a(Object obj, k1 k1Var) {
            s.k(obj);
            this.f5688b = obj;
        }

        public a a(String str, Object obj) {
            List list = this.f5687a;
            s.k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f5688b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f5687a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f5687a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String next : keySet) {
            if (!b(bundle.get(next), bundle2.get(next))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, (k1) null);
    }
}
