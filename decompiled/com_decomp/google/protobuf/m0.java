package com.google.protobuf;

import com.google.protobuf.z1;

public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f8690a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8691b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8692c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final z1.b f8693a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f8694b;

        /* renamed from: c  reason: collision with root package name */
        public final z1.b f8695c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f8696d;

        public a(z1.b bVar, Object obj, z1.b bVar2, Object obj2) {
            this.f8693a = bVar;
            this.f8694b = obj;
            this.f8695c = bVar2;
            this.f8696d = obj2;
        }
    }

    private m0(z1.b bVar, Object obj, z1.b bVar2, Object obj2) {
        this.f8690a = new a(bVar, obj, bVar2, obj2);
        this.f8691b = obj;
        this.f8692c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return v.d(aVar.f8693a, 1, obj) + v.d(aVar.f8695c, 2, obj2);
    }

    public static m0 d(z1.b bVar, Object obj, z1.b bVar2, Object obj2) {
        return new m0(bVar, obj, bVar2, obj2);
    }

    static void e(m mVar, a aVar, Object obj, Object obj2) {
        v.x(mVar, aVar.f8693a, 1, obj);
        v.x(mVar, aVar.f8695c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return m.T(i10) + m.A(b(this.f8690a, obj, obj2));
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f8690a;
    }
}
