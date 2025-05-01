package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.List;

final class u4 {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final n4 f6442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6443b;

    /* renamed from: c  reason: collision with root package name */
    private String f6444c;

    /* renamed from: d  reason: collision with root package name */
    private String f6445d;

    /* renamed from: e  reason: collision with root package name */
    private String f6446e;

    /* renamed from: f  reason: collision with root package name */
    private String f6447f;

    /* renamed from: g  reason: collision with root package name */
    private long f6448g;

    /* renamed from: h  reason: collision with root package name */
    private long f6449h;

    /* renamed from: i  reason: collision with root package name */
    private long f6450i;

    /* renamed from: j  reason: collision with root package name */
    private String f6451j;

    /* renamed from: k  reason: collision with root package name */
    private long f6452k;

    /* renamed from: l  reason: collision with root package name */
    private String f6453l;

    /* renamed from: m  reason: collision with root package name */
    private long f6454m;

    /* renamed from: n  reason: collision with root package name */
    private long f6455n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6456o;

    /* renamed from: p  reason: collision with root package name */
    private long f6457p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6458q;

    /* renamed from: r  reason: collision with root package name */
    private String f6459r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f6460s;

    /* renamed from: t  reason: collision with root package name */
    private long f6461t;

    /* renamed from: u  reason: collision with root package name */
    private List f6462u;

    /* renamed from: v  reason: collision with root package name */
    private String f6463v;

    /* renamed from: w  reason: collision with root package name */
    private long f6464w;

    /* renamed from: x  reason: collision with root package name */
    private long f6465x;

    /* renamed from: y  reason: collision with root package name */
    private long f6466y;

    /* renamed from: z  reason: collision with root package name */
    private long f6467z;

    u4(n4 n4Var, String str) {
        s.k(n4Var);
        s.g(str);
        this.f6442a = n4Var;
        this.f6443b = str;
        n4Var.b().h();
    }

    public final long A() {
        this.f6442a.b().h();
        return this.f6457p;
    }

    public final void B(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.C, str);
        this.C = str;
    }

    public final void C(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6450i != j10;
        this.f6450i = j10;
    }

    public final void D(long j10) {
        boolean z10 = true;
        s.a(j10 >= 0);
        this.f6442a.b().h();
        boolean z11 = this.D;
        if (this.f6448g == j10) {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f6448g = j10;
    }

    public final void E(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6449h != j10;
        this.f6449h = j10;
    }

    public final void F(boolean z10) {
        this.f6442a.b().h();
        this.D |= this.f6456o != z10;
        this.f6456o = z10;
    }

    public final void G(Boolean bool) {
        this.f6442a.b().h();
        boolean z10 = this.D;
        Boolean bool2 = this.f6460s;
        int i10 = d9.f5929o;
        this.D = z10 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.f6460s = bool;
    }

    public final void H(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.f6446e, str);
        this.f6446e = str;
    }

    public final void I(List list) {
        this.f6442a.b().h();
        List list2 = this.f6462u;
        int i10 = d9.f5929o;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.D = true;
                this.f6462u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    public final boolean J() {
        this.f6442a.b().h();
        return this.f6458q;
    }

    public final boolean K() {
        this.f6442a.b().h();
        return this.f6456o;
    }

    public final boolean L() {
        this.f6442a.b().h();
        return this.D;
    }

    public final long M() {
        this.f6442a.b().h();
        return this.f6452k;
    }

    public final long N() {
        this.f6442a.b().h();
        return this.E;
    }

    public final long O() {
        this.f6442a.b().h();
        return this.f6467z;
    }

    public final long P() {
        this.f6442a.b().h();
        return this.A;
    }

    public final long Q() {
        this.f6442a.b().h();
        return this.f6466y;
    }

    public final long R() {
        this.f6442a.b().h();
        return this.f6465x;
    }

    public final long S() {
        this.f6442a.b().h();
        return this.B;
    }

    public final long T() {
        this.f6442a.b().h();
        return this.f6464w;
    }

    public final long U() {
        this.f6442a.b().h();
        return this.f6455n;
    }

    public final long V() {
        this.f6442a.b().h();
        return this.f6461t;
    }

    public final long W() {
        this.f6442a.b().h();
        return this.F;
    }

    public final long X() {
        this.f6442a.b().h();
        return this.f6454m;
    }

    public final long Y() {
        this.f6442a.b().h();
        return this.f6450i;
    }

    public final long Z() {
        this.f6442a.b().h();
        return this.f6448g;
    }

    public final String a() {
        this.f6442a.b().h();
        return this.C;
    }

    public final long a0() {
        this.f6442a.b().h();
        return this.f6449h;
    }

    public final String b() {
        this.f6442a.b().h();
        return this.f6446e;
    }

    public final Boolean b0() {
        this.f6442a.b().h();
        return this.f6460s;
    }

    public final List c() {
        this.f6442a.b().h();
        return this.f6462u;
    }

    public final String c0() {
        this.f6442a.b().h();
        return this.f6459r;
    }

    public final void d() {
        this.f6442a.b().h();
        this.D = false;
    }

    public final String d0() {
        this.f6442a.b().h();
        String str = this.C;
        B((String) null);
        return str;
    }

    public final void e() {
        this.f6442a.b().h();
        long j10 = this.f6448g + 1;
        if (j10 > 2147483647L) {
            this.f6442a.d().w().b("Bundle index overflow. appId", j3.z(this.f6443b));
            j10 = 0;
        }
        this.D = true;
        this.f6448g = j10;
    }

    public final String e0() {
        this.f6442a.b().h();
        return this.f6443b;
    }

    public final void f(String str) {
        this.f6442a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ d9.Z(this.f6459r, str);
        this.f6459r = str;
    }

    public final String f0() {
        this.f6442a.b().h();
        return this.f6444c;
    }

    public final void g(boolean z10) {
        this.f6442a.b().h();
        this.D |= this.f6458q != z10;
        this.f6458q = z10;
    }

    public final String g0() {
        this.f6442a.b().h();
        return this.f6453l;
    }

    public final void h(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6457p != j10;
        this.f6457p = j10;
    }

    public final String h0() {
        this.f6442a.b().h();
        return this.f6451j;
    }

    public final void i(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.f6444c, str);
        this.f6444c = str;
    }

    public final String i0() {
        this.f6442a.b().h();
        return this.f6447f;
    }

    public final void j(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.f6453l, str);
        this.f6453l = str;
    }

    public final String j0() {
        this.f6442a.b().h();
        return this.f6463v;
    }

    public final void k(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.f6451j, str);
        this.f6451j = str;
    }

    public final String k0() {
        this.f6442a.b().h();
        return this.f6445d;
    }

    public final void l(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6452k != j10;
        this.f6452k = j10;
    }

    public final void m(long j10) {
        this.f6442a.b().h();
        this.D |= this.E != j10;
        this.E = j10;
    }

    public final void n(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6467z != j10;
        this.f6467z = j10;
    }

    public final void o(long j10) {
        this.f6442a.b().h();
        this.D |= this.A != j10;
        this.A = j10;
    }

    public final void p(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6466y != j10;
        this.f6466y = j10;
    }

    public final void q(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6465x != j10;
        this.f6465x = j10;
    }

    public final void r(long j10) {
        this.f6442a.b().h();
        this.D |= this.B != j10;
        this.B = j10;
    }

    public final void s(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6464w != j10;
        this.f6464w = j10;
    }

    public final void t(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6455n != j10;
        this.f6455n = j10;
    }

    public final void u(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6461t != j10;
        this.f6461t = j10;
    }

    public final void v(long j10) {
        this.f6442a.b().h();
        this.D |= this.F != j10;
        this.F = j10;
    }

    public final void w(String str) {
        this.f6442a.b().h();
        this.D |= !d9.Z(this.f6447f, str);
        this.f6447f = str;
    }

    public final void x(String str) {
        this.f6442a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ d9.Z(this.f6463v, str);
        this.f6463v = str;
    }

    public final void y(String str) {
        this.f6442a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ d9.Z(this.f6445d, str);
        this.f6445d = str;
    }

    public final void z(long j10) {
        this.f6442a.b().h();
        this.D |= this.f6454m != j10;
        this.f6454m = j10;
    }
}
