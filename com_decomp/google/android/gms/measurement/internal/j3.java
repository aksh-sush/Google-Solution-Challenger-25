package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;

public final class j3 extends h5 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f6094c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f6095d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f6096e;

    /* renamed from: f  reason: collision with root package name */
    private final h3 f6097f = new h3(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final h3 f6098g = new h3(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final h3 f6099h = new h3(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final h3 f6100i = new h3(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final h3 f6101j = new h3(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final h3 f6102k = new h3(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final h3 f6103l = new h3(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final h3 f6104m = new h3(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final h3 f6105n = new h3(this, 2, false, false);

    j3(n4 n4Var) {
        super(n4Var);
    }

    static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = B(z10, obj);
        String B2 = B(z10, obj2);
        String B3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb2.append(str2);
            sb2.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb2.append(str2);
            sb2.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb2.append(str3);
            sb2.append(B3);
        }
        return sb2.toString();
    }

    static String B(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb2 = new StringBuilder(str.length() + 43 + str.length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String G = G(n4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(G)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb3.toString();
            } else if (obj instanceof i3) {
                return ((i3) obj).f6038a;
            } else {
                return z10 ? "-" : String.valueOf(obj);
            }
        }
    }

    private static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    protected static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new i3(str);
    }

    /* access modifiers changed from: protected */
    public final String C() {
        String str;
        synchronized (this) {
            if (this.f6096e == null) {
                this.f6096e = this.f5994a.Q() != null ? this.f5994a.Q() : this.f5994a.z().w();
            }
            s.k(this.f6096e);
            str = this.f6096e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void F(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(C(), i10)) {
            Log.println(i10, C(), A(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            s.k(str);
            l4 G = this.f5994a.G();
            if (G == null) {
                Log.println(6, C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.n()) {
                Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.z(new g3(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return false;
    }

    public final h3 q() {
        return this.f6104m;
    }

    public final h3 r() {
        return this.f6097f;
    }

    public final h3 s() {
        return this.f6099h;
    }

    public final h3 t() {
        return this.f6098g;
    }

    public final h3 u() {
        return this.f6103l;
    }

    public final h3 v() {
        return this.f6105n;
    }

    public final h3 w() {
        return this.f6100i;
    }

    public final h3 x() {
        return this.f6102k;
    }

    public final h3 y() {
        return this.f6101j;
    }
}
