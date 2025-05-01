package com.google.android.gms.measurement.internal;

import android.util.Log;

final class g3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5986e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5987f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Object f5988g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Object f5989h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f5990i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ j3 f5991j;

    g3(j3 j3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f5991j = j3Var;
        this.f5986e = i10;
        this.f5987f = str;
        this.f5988g = obj;
        this.f5989h = obj2;
        this.f5990i = obj3;
    }

    public final void run() {
        char c10;
        j3 j3Var;
        w3 F = this.f5991j.f5994a.F();
        if (F.n()) {
            if (this.f5991j.f6094c == 0) {
                if (this.f5991j.f5994a.z().H()) {
                    j3Var = this.f5991j;
                    j3Var.f5994a.f();
                    c10 = 'C';
                } else {
                    j3Var = this.f5991j;
                    j3Var.f5994a.f();
                    c10 = 'c';
                }
                j3Var.f6094c = c10;
            }
            if (this.f5991j.f6095d < 0) {
                j3 j3Var2 = this.f5991j;
                j3Var2.f5994a.z().q();
                j3Var2.f6095d = 42097;
            }
            char charAt = "01VDIWEA?".charAt(this.f5986e);
            char o10 = this.f5991j.f6094c;
            long p10 = this.f5991j.f6095d;
            String A = j3.A(true, this.f5987f, this.f5988g, this.f5989h, this.f5990i);
            StringBuilder sb2 = new StringBuilder(String.valueOf(A).length() + 24);
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(o10);
            sb2.append(p10);
            sb2.append(":");
            sb2.append(A);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = this.f5987f.substring(0, 1024);
            }
            u3 u3Var = F.f6518d;
            if (u3Var != null) {
                u3Var.b(sb3, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f5991j.C(), "Persisted config not initialized. Not logging error/warn");
    }
}
