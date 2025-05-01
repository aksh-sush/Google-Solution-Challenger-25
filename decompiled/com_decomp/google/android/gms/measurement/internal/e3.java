package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import h4.n;
import h4.o;
import h4.p;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class e3 extends h5 {

    /* renamed from: c  reason: collision with root package name */
    protected static final AtomicReference f5938c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    protected static final AtomicReference f5939d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    protected static final AtomicReference f5940e = new AtomicReference();

    e3(n4 n4Var) {
        super(n4Var);
    }

    private static final String u(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        s.k(strArr);
        s.k(strArr2);
        s.k(atomicReference);
        s.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (d9.Z(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String o(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Bundle bundle : objArr) {
            String p10 = bundle instanceof Bundle ? p(bundle) : String.valueOf(bundle);
            if (p10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(p10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!t()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(r(next));
            sb2.append("=");
            Object obj = bundle.get(next);
            sb2.append(obj instanceof Bundle ? o(new Object[]{obj}) : obj instanceof Object[] ? o((Object[]) obj) : obj instanceof ArrayList ? o(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String q(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : u(str, n.f10962c, n.f10960a, f5938c);
    }

    /* access modifiers changed from: protected */
    public final String r(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : u(str, o.f10965b, o.f10964a, f5939d);
    }

    /* access modifiers changed from: protected */
    public final String s(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return u(str, p.f10969b, p.f10968a, f5940e);
        }
        return "experiment_id(" + str + ")";
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        this.f5994a.f();
        return this.f5994a.q() && Log.isLoggable(this.f5994a.d().C(), 3);
    }
}
