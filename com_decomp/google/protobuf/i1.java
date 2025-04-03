package com.google.protobuf;

final class i1 implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f8596a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8597b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f8598c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8599d;

    i1(t0 t0Var, String str, Object[] objArr) {
        char charAt;
        this.f8596a = t0Var;
        this.f8597b = str;
        this.f8598c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c10 = charAt2 & 8191;
            int i10 = 13;
            int i11 = 1;
            while (true) {
                int i12 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                c10 |= (charAt & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
            charAt2 = c10 | (charAt << i10);
        }
        this.f8599d = charAt2;
    }

    public boolean a() {
        return (this.f8599d & 2) == 2;
    }

    public f1 b() {
        return (this.f8599d & 1) == 1 ? f1.PROTO2 : f1.PROTO3;
    }

    public t0 c() {
        return this.f8596a;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f8598c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f8597b;
    }
}
